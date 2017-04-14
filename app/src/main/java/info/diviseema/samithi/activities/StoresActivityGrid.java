package info.diviseema.samithi.activities;

/**
 * Created by welcome on 1/19/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class StoresActivityGrid extends AppCompatActivity {
    GridView grid;
    ImageView add;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar ab =getSupportActionBar();
        setTitle("Stores and Shops");
        ab.setDisplayShowHomeEnabled(true);
        //add = (ImageView) findViewById(R.id.add);
        //add.setVisibility(View.GONE);
        final String[] services = new String[] { "మెడికల్ షాప్స్ ",

                "మొబైల్ షాప్స్",

                "ఆటోమొబైల్ షాప్స్",

                "బుక్స్ షాప్స్",

                "కిరాణ & జెనరల్ స్టోర్స్",

                "ఆక్వాఫీడ్స్ స్టోర్స్",

                "ఫోటో స్టూడియోస్",

                "పెస్టిసైడ్స్ స్టోర్స్",

                "పతంజలి స్టోర్స్",

                "అగ్రికల్చర్ నీడ్స్ స్టోర్స్",

                "ఫర్నిచర్ షాప్స్",

                "ఫాన్సీ స్టోర్స్",

                "సలూన్ షాప్స్",
        "డ్రెస్ షాప్స్"};
        int [] Images={
                R.drawable.medical, R.drawable.mobile3, R.drawable.automobile, R.drawable.book, R.drawable.generalstores, R.drawable.aquadic,
                R.drawable.potostudio, R.drawable.pestcides, R.drawable.patanjali, R.drawable.agricultures, R.drawable.furniture2, R.drawable.fansy,R.drawable.sellon,R.drawable.dresshops
        };
        if (CheckInternet.checkInternetConenction(context)) {

        ShopesGridview adapter = new ShopesGridview(StoresActivityGrid.this, services, Images);
        grid=(GridView)findViewById(R.id.grid_view_image_text);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                //Toast.makeText(MainActivity.this, "You Clicked at " +array[+ position], Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        String uri = "http://diviseema.info/medical-shops/";
                        Intent intent = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent.putExtra("uri", uri);
                        startActivity(intent);
                        break;
                    case 1:
                        String uri1 = "http://diviseema.info/mobile-shops/";
                        Intent intent1 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent1.putExtra("uri", uri1);
                        startActivity(intent1);
                        break;
                    case 2:
                        String uri2 = "http://diviseema.info/automobile-stores/";
                        Intent intent2 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent2.putExtra("uri", uri2);
                        startActivity(intent2);
                        break;
                    case 3:
                        String uri3 = "http://diviseema.info/books-stores/";
                        Intent intent3 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent3.putExtra("uri", uri3);
                        startActivity(intent3);
                        break;
                    case 4:
                        String uri4 = "http://diviseema.info/general-stores/";
                        Intent intent4 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent4.putExtra("uri", uri4);
                        startActivity(intent4);
                        break;
                    case 5:
                        String uri5 = "http://diviseema.info/aquafeeds-stores/";
                        Intent intent5 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent5.putExtra("uri", uri5);
                        startActivity(intent5);
                        break;
                    case 6:
                        String uri6 = "http://diviseema.info/photo-studios/";
                        Intent intent6 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent6.putExtra("uri", uri6);
                        startActivity(intent6);
                        break;
                    case 7:
                        String uri7 = "http://diviseema.info/pesticides-shops/";
                        Intent intent7 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent7.putExtra("uri", uri7);
                        startActivity(intent7);
                        break;
                    case 8:
                        String uri8 = "http://diviseema.info/patanjali-stores-in-avanigadda/";
                        Intent intent8 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent8.putExtra("uri", uri8);
                        startActivity(intent8);
                        break;
                    case 9:
                        String uri9 = "http://diviseema.info/agriculture-needs-stores/";
                        Intent intent9 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent9.putExtra("uri", uri9);
                        startActivity(intent9);
                        break;
                    case 10:
                        String uri10 = "http://diviseema.info/furniture-shops-in-avanigadda/";
                        Intent intent10 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent10.putExtra("uri", uri10);
                        startActivity(intent10);
                        break;
                    case 11:
                        String uri11 = "http://diviseema.info/fancy-stores-in-avanigadda/";
                        Intent intent11 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent11.putExtra("uri", uri11);
                        startActivity(intent11);
                        break;
                    case  12:
                        String uri12 = "http://diviseema.info/salon-shops-in-avanigadda/";
                        Intent intent12 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent12.putExtra("uri", uri12);
                        startActivity(intent12);

                        break;
                    case  13:
                        String uri13 = "http://diviseema.info/dress-shops-in-avanigadda/";
                        Intent intent13 = new Intent(StoresActivityGrid.this, WebActivity.class);
                        intent13.putExtra("uri", uri13);
                        startActivity(intent13);
                        break;
                    default:
                        break;
                }

            }
        });
    }
    else

    {
        CheckInternet.showAlertDialog(StoresActivityGrid.this, "No Internet Connection",
                "You don't have internet connection.");
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

}
