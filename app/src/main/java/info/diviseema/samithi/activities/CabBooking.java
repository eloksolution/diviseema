    package info.diviseema.samithi.activities;

    import android.app.AlertDialog;
    import android.app.DatePickerDialog;
    import android.content.Context;
    import android.content.DialogInterface;
    import android.content.Intent;
    import android.net.ConnectivityManager;
    import android.net.NetworkInfo;
    import android.os.AsyncTask;
    import android.os.Bundle;
    import android.support.v7.app.ActionBar;
    import android.support.v7.app.AppCompatActivity;
    import android.util.Log;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;
    import android.widget.DatePicker;
    import android.widget.EditText;
    import android.widget.Spinner;
    import android.widget.Toast;

    import org.apache.http.HttpEntity;
    import org.apache.http.HttpResponse;
    import org.apache.http.NameValuePair;
    import org.apache.http.client.HttpClient;
    import org.apache.http.client.entity.UrlEncodedFormEntity;
    import org.apache.http.client.methods.HttpPost;
    import org.apache.http.impl.client.DefaultHttpClient;
    import org.apache.http.message.BasicNameValuePair;
    import org.apache.http.util.EntityUtils;

    import java.util.ArrayList;
    import java.util.Calendar;
    import java.util.List;


    public class CabBooking extends AppCompatActivity implements
            View.OnClickListener {
        private int mYear, mMonth, mDay, mHour, mMinute;
        EditText date,name,mobile,from,to;
        Button cancel;
        Spinner spNoofPer;
        String  Date,Name,Mobile,From,To,Persons;
        boolean check;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cabbook);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            ActionBar ab = getSupportActionBar();
            ab.setDisplayShowHomeEnabled(true);
            ab.setIcon(R.mipmap.ic_logo);
             date = (EditText) findViewById(R.id.Date);
            name=(EditText)findViewById(R.id.name);
            mobile=(EditText)findViewById(R.id.mobile);
            from=(EditText)findViewById(R.id.from);
            to=(EditText)findViewById(R.id.to);
            cancel=(Button)findViewById(R.id.cancel);
            Button sub=(Button)findViewById(R.id.submit);
            date.setOnClickListener(this);
            //time.setOnClickListener(this);
            cancel.setOnClickListener(this);
            sub.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View v)
                {
                    if (checkValidation ()) {
                       if(CheckInternet.checkInternetConenction(CabBooking.this)){
                           new PostDataAsyncTask().execute();
                           startActivity(new Intent(getApplicationContext(), SpecialServices.class));
                        } else {
                            CheckInternet.showAlertDialog(CabBooking.this, "No Internet Connection",
                                    "You don't have internet connection.");
                        }

                    }
                }
            });
        }
        public class PostDataAsyncTask extends AsyncTask<String, String, String> {

            protected void onPreExecute() {
                super.onPreExecute();
                // do stuff before posting data
            }

            @Override
            protected String doInBackground(String... strings) {
                try {

                    Name = name.getText().toString();
                    Mobile   = mobile.getText().toString();
                    From   = from.getText().toString();
                    To   = to.getText().toString();
                    Date= date.getText().toString();
                    String postReceiverUrl = "http://eloksolutions.in/diviseema/cabbooking.php";
                        //Log.v(TAG, "postURL: " + postReceiverUrl);

                        // HttpClient
                        HttpClient httpClient = new DefaultHttpClient();

                        // post header
                        HttpPost httpPost = new HttpPost(postReceiverUrl);

                        // add your data
                        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                        nameValuePairs.add(new BasicNameValuePair("Name", Name));
                        nameValuePairs.add(new BasicNameValuePair("Mobile", Mobile));
                        nameValuePairs.add(new BasicNameValuePair("From", From));
                        nameValuePairs.add(new BasicNameValuePair("To", To));
                        nameValuePairs.add(new BasicNameValuePair("Date", Date));
                        httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    Log.v("Info", "nameValuePairs: " + nameValuePairs);
                        // execute HTTP post request
                        HttpResponse response = httpClient.execute(httpPost);
                        HttpEntity resEntity = response.getEntity();

                        if (resEntity != null) {

                            String responseStr = EntityUtils.toString(resEntity).trim();
                             Log.v("Info", "Response: " + responseStr);

                            // you can add an if statement here and do other actions based on the response
                        }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String result) {
                // do stuff after posting data
                Toast.makeText(CabBooking.this, "send successfully", Toast.LENGTH_LONG).show();
            }
        }

        @Override
            public void onClick(View v) {

                if (v == date) {
                    final Calendar c = Calendar.getInstance();
                    mYear = c.get(Calendar.YEAR);
                    mMonth = c.get(Calendar.MONTH);
                    mDay = c.get(Calendar.DAY_OF_MONTH);
                    DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {

                                    date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                                }
                            }, mYear, mMonth, mDay);
                    datePickerDialog.show();
                }
            if(v == cancel){
                startActivity(new Intent(getApplicationContext(), SpecialServices.class));
                 }
            }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);

            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            switch (item.getItemId()) {
                case android.R.id.home:
                    this.onBackPressed();
                    return true;
                case R.id.action_settings:
                    startActivity(new Intent(this, Home.class));
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
        private boolean checkValidation() {
            boolean ret = true;
            if (!Validation.hasText(date)) ret = false;
            if (!Validation.hasText(to)) ret = false;
            if (!Validation.hasText(from)) ret = false;
            if (!Validation.isPhoneNumber(mobile, true)) ret = false;
            if (!Validation.hasText(name)) ret = false;
            return ret;
        }
    }


