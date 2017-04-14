package info.diviseema.samithi.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class SpecialServices extends ActionBarActivity{
    GridView grid;
    ImageView add;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar ab =getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);
        ab.setIcon(R.mipmap.ic_logo);

            // Defined Array values to show in ListView
            final String[] services = new String[] { "ప్రత్యెక వ్యాపార సంస్థలు",
                    "రిపేర్ & సర్వీసెస్",
                    "వాటర్ కాన్ ఆర్డర్ ఇవ్వుటకు",
                    "రైస్ బాగ్  ఆర్డర్ ఇవ్వుటకు",
                    "రియల్ ఎస్టేట్ ",
                    "కాబ్(కారు)  బుకింగ్",
                    "సి ఫుడ్స్ ఆర్డర్ చేయ్యటకు",
                    "ముఖ్యమైన సదుపాయాలు",
                    "హోటల్ రూమ్ బుకింగ్"
                   };
            int [] Images = {

                    R.drawable.bussiness,
                    R.drawable.ic_vehicles,
                    R.drawable.ic_watercan,
                    R.drawable.ic_rice,
                    R.drawable.ic_land,
                    R.drawable.cab2,
                    R.drawable.ic_seefood,
                    R.drawable.ic_call,
                    R.drawable.ic_hotels


            };

        if (CheckInternet.checkInternetConenction(context)) {
        ShopesGridview adapter = new ShopesGridview(SpecialServices.this, services, Images);

        grid=(GridView)findViewById(R.id.grid_view_image_text);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " +array[+ position], Toast.LENGTH_SHORT).show();
                switch (position) {
                        case 0:

                            Intent intent = new Intent(SpecialServices.this,Bussiness.class);

                            startActivity(intent);
                            break;
                       case 1:
                           Intent intent1 = new Intent(SpecialServices.this, Repair.class);
                           startActivity(intent1);
                           break;
                        case 2:
                            startActivity(new Intent(getApplicationContext(), WaterCan.class));
                            break;
                        case 3:
                            startActivity(new Intent(getApplicationContext(), RiceBag.class));
                            break;
                        case 4:
                            String uri4="http://diviseema.info/land-for-sale-in-avanigadda-constituency/";
                            Intent intent4 = new Intent(SpecialServices.this,WebActivity.class);
                            intent4.putExtra("uri",uri4);
                            startActivity(intent4);
                            break;
                        case 5:

                            startActivity(new Intent(getApplicationContext(), CabBooking.class));
                            break;

                        case 6:
                            String uri6="http://diviseema.info/see-food-online-in-avanigadda-constituency/";
                            Intent intent6 = new Intent(SpecialServices.this,WebActivity.class);
                            intent6.putExtra("uri",uri6);
                            startActivity(intent6);
                            break;
                        case 7:
                            String uri7 = "http://diviseema.info/call-for/";
                            Intent intent7 = new Intent(SpecialServices.this,WebActivity.class);
                            intent7.putExtra("uri",uri7);
                            startActivity(intent7);
                            break;
                    case 8:
                        String uri8 = "http://diviseema.info/hotel-booking-in-avanigadda-constituency/";
                        Intent intent8 = new Intent(SpecialServices.this,WebActivity.class);
                        intent8.putExtra("uri",uri8);
                        startActivity(intent8);
                        break;

                        default:
                            break;
                    }


                }

            });
    }
    else

    {
        CheckInternet.showAlertDialog(SpecialServices.this, "No Internet Connection",
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

