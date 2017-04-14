package info.diviseema.samithi.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

;


public class Bussiness extends AppCompatActivity {
    GridView grid;
    ImageView add;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar ab =getSupportActionBar();
       // setTitle("సమగ్ర సమాచారం");
        ab.setDisplayShowHomeEnabled(true);
        //add = (ImageView) findViewById(R.id.add);
        //add.setVisibility(View.GONE);
        final String[] services = new String[] { "పెయింటింగ్ వర్క్స్",
                "వెహికల్ వాటర్  సర్విసింగ్",
                "క్యాటరర్స్",
                "కొరియర్ సర్వీసెస్",
                "పెళ్లి పనులకు",
                "ఈవెంట్ ఆర్గనైజేర్స్",
                "సెక్యూరిటీ సర్వీసెస్",
                "కార్(కాబ్) డ్రైవింగ్ స్కూల్స్",
                "కేబుల్ ఆపరేటర్స్",
                "పురోహితులు & పండితులు",
                "పత్రికా విలేఖరులు",
                "వాస్తు సిద్ధాంతులు  & జోతిశ్కులు",
                "కూరగాయల పాట కారులు",
                "తాపీ మేస్త్రీలు",
                "లారి సప్లయర్స్",
                "పాకర్స్ అండ్ మూవర్స్",
                "ఎలక్ట్రికల్ వర్క్స్(కరెంట్ వర్క్స్) ",
                "పర్నిచర్ వర్క్స్",
                "ఫ్లెక్స్ ప్రింటర్స్",
                "ఆన్లైన్ సర్వీసెస్ ",
                "ఇంటర్నెట్ సెంటర్స్",
                "షామియాన సప్లయర్స్",
                "పూల వ్యాపారులు",
                "సేప్టిక్ ట్యాంక్స్",
                "వాటర్ ట్యాంక్ ఆర్డర్ చెయ్యటకు",
                "బోరులు, పంపులు వెయ్యువారు",
                "చెదలు నివారణ చేయువారు",
                "సిమెంట్ డిజైన్ వర్క్స్",
                "వెల్డింగ్ వర్క్స్",
                "డిష్ టీవీ నెట్వర్క్స్ సెటప్ చేయువారు",
                "డాన్స్ మరియు మ్యూజిక్ నేర్పువారు",
                "బ్లడ్ బ్యాంకులు",
                "స్వచ్చంద సేవ సంస్థలు",
                "అక్వలాబ్స్",
                "ధాన్యం కొనుగోలుదారులు"

        };
        int [] Images={
                R.drawable.paintingworks,
                R.drawable.waterservice,
                R.drawable.caters,
                R.drawable.courire,
                R.drawable.marriage,
                R.drawable.eventt,
                R.drawable.security,
                R.drawable.cardriving,
                R.drawable.cableoperator,
                R.drawable.purohithulu,
                R.drawable.newsreporters,
                R.drawable.vastu,
                R.drawable.veg,
                R.drawable.thapi,
                R.drawable.loory,
                R.drawable.movers,
                R.drawable.electrical,
                R.drawable.furniture,
                R.drawable.flex,
                R.drawable.online,
                R.drawable.internet,
                R.drawable.shamiyana,
                R.drawable.flowerssupplies,
                R.drawable.septic,
                R.drawable.watertank,
                R.drawable.borewells,
                R.drawable.chedalu,
                R.drawable.cement,
                R.drawable.welding,
                R.drawable.dishnetwork,
                R.drawable.dancemusic,
                R.drawable.bloodbank,
                R.drawable.social,
                R.drawable.akwalabs,
                R.drawable.danyam


        };
        if (CheckInternet.checkInternetConenction(context)) {
        ShopesGridview adapter = new ShopesGridview(Bussiness.this, services, Images);
        grid=(GridView)findViewById(R.id.grid_view_image_text);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " +array[+ position], Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        String uri = "http://diviseema.info/painting-works-in-avanigadda/";
                        Intent intent = new Intent(Bussiness.this, WebActivity.class);
                        intent.putExtra("uri", uri);
                        startActivity(intent);
                        break;

                    case 1:
                        String uri4 = "http://diviseema.info/vehicle-washing-services-in-avanigadda/";
                        Intent intent4 = new Intent(Bussiness.this, WebActivity.class);
                        intent4.putExtra("uri", uri4);
                        startActivity(intent4);
                        break;
                    case 2:
                        String uri5 = "http://diviseema.info/caterers-in-avanigadda/";
                        Intent intent5 = new Intent(Bussiness.this, WebActivity.class);
                        intent5.putExtra("uri", uri5);
                        startActivity(intent5);
                        break;
                    case 3:
                        String uri6 = "http://diviseema.info/courier-services-in-avanigadda/";
                        Intent intent6 = new Intent(Bussiness.this, WebActivity.class);
                        intent6.putExtra("uri", uri6);
                        startActivity(intent6);
                        break;
                    case 4:
                        String uri7 = "http://diviseema.info/wedding-works-in-avanigadda/";
                        Intent intent7 = new Intent(Bussiness.this, WebActivity.class);
                        intent7.putExtra("uri", uri7);
                        startActivity(intent7);
                        break;
                    case 5:
                        String uri8 = "http://diviseema.info/event-organizers-in-avanigadda/";
                        Intent intent8 = new Intent(Bussiness.this, WebActivity.class);
                        intent8.putExtra("uri", uri8);
                        startActivity(intent8);
                        break;
                    case 6:
                        String uri9 = "http://diviseema.info/security-services-in-avanigadda/";
                        Intent intent9 = new Intent(Bussiness.this, WebActivity.class);
                        intent9.putExtra("uri", uri9);
                        startActivity(intent9);
                        break;
                    case 7:
                        String uri11 = "http://diviseema.info/cab-driving-schools-in-avanigadda/";
                        Intent intent11 = new Intent(Bussiness.this, WebActivity.class);
                        intent11.putExtra("uri", uri11);
                        startActivity(intent11);
                        break;
                    case 8:
                        String uri14 = "http://diviseema.info/cable-operators-in-avanigadda/";
                        Intent intent14 = new Intent(Bussiness.this, WebActivity.class);
                        intent14.putExtra("uri", uri14);
                        startActivity(intent14);
                        break;
                    case 9:
                        String uri15 = "http://diviseema.info/purohithulu-in-avanigadda/";
                        Intent intent15 = new Intent(Bussiness.this, WebActivity.class);
                        intent15.putExtra("uri", uri15);
                        startActivity(intent15);
                        break;
                    case 10:
                        String uri16 = "http://diviseema.info/news-reporters-in-avanigadda/";
                        Intent intent16 = new Intent(Bussiness.this, WebActivity.class);
                        intent16.putExtra("uri", uri16);
                        startActivity(intent16);
                        break;
                    case 11:
                        String uri17 = "http://diviseema.info/jyothishyam-vastu-in-avanigadda/";
                        Intent intent17 = new Intent(Bussiness.this, WebActivity.class);
                        intent17.putExtra("uri", uri17);
                        startActivity(intent17);
                        break;
                    case 12:
                        String uri18 = "http://diviseema.info/vegetables-buyers-in-avanigadda/";
                        Intent intent18 = new Intent(Bussiness.this, WebActivity.class);
                        intent18.putExtra("uri", uri18);
                        startActivity(intent18);
                        break;
                    case 13:
                        String uri19 = "http://diviseema.info/civil-contractors-in-avanigadda/";
                        Intent intent19 = new Intent(Bussiness.this, WebActivity.class);
                        intent19.putExtra("uri", uri19);
                        startActivity(intent19);
                        break;
                    case 14:
                        String uri20 = "http://diviseema.info/lorry-suppliers-in-avanigadda/";
                        Intent intent20 = new Intent(Bussiness.this, WebActivity.class);
                        intent20.putExtra("uri", uri20);
                        startActivity(intent20);
                        break;
                    case 15:
                        String uri21 = "http://diviseema.info/packers-and-movers-in-avanigadda/";
                        Intent intent21 = new Intent(Bussiness.this, WebActivity.class);
                        intent21.putExtra("uri", uri21);
                        startActivity(intent21);
                        break;
                    case 16:
                        String uri22 = "http://diviseema.info/electrical-works-in-avanigadda/";
                        Intent intent22 = new Intent(Bussiness.this, WebActivity.class);
                        intent22.putExtra("uri", uri22);
                        startActivity(intent22);
                        break;
                    case 17:
                        String uri23 = "http://diviseema.info/furniture-works-in-avanigadda/";
                        Intent intent23 = new Intent(Bussiness.this, WebActivity.class);
                        intent23.putExtra("uri", uri23);
                        startActivity(intent23);
                        break;
                    case 18:
                        String uri24 = "http://diviseema.info/flex-printers-in-avanigadda/";
                        Intent intent24 = new Intent(Bussiness.this, WebActivity.class);
                        intent24.putExtra("uri", uri24);
                        startActivity(intent24);
                        break;

                    case 19:
                        String uri25 = "http://diviseema.info/online-services-in-avanigadda/";
                        Intent intent25 = new Intent(Bussiness.this, WebActivity.class);
                        intent25.putExtra("uri", uri25);
                        startActivity(intent25);
                        break;
                    case 20:
                        String uri112 = "http://diviseema.info/internet-centers-in-avanigadda/";
                        Intent intent112 = new Intent(Bussiness.this, WebActivity.class);
                        intent112.putExtra("uri", uri112);
                        startActivity(intent112);
                        break;
                    case 21:
                        String uri26 = "http://diviseema.info/shamiyana-suppliers-in-avanigadda/";
                        Intent intent26 = new Intent(Bussiness.this, WebActivity.class);
                        intent26.putExtra("uri", uri26);
                        startActivity(intent26);
                        break;
                    case 22:
                        String uri27 = "http://diviseema.info/flower-sellers-in-avanigadda/";
                        Intent intent27 = new Intent(Bussiness.this, WebActivity.class);
                        intent27.putExtra("uri", uri27);
                        startActivity(intent27);
                        break;
                    case 23:
                        String uri28 = "http://diviseema.info/septic-tanks-in-avanigadda/";
                        Intent intent28 = new Intent(Bussiness.this, WebActivity.class);
                        intent28.putExtra("uri", uri28);
                        startActivity(intent28);
                        break;
                    case 24:
                        String uri29 = "http://diviseema.info/water-tanks-in-avanigadda/";
                        Intent intent29 = new Intent(Bussiness.this, WebActivity.class);
                        intent29.putExtra("uri", uri29);
                        startActivity(intent29);
                        break;
                    case 25:
                        String uri211 = "http://diviseema.info/borewell-workers-in-avanigadda/";
                        Intent intent211 = new Intent(Bussiness.this, WebActivity.class);
                        intent211.putExtra("uri", uri211);
                        startActivity(intent211);
                        break;
                    case 26:
                        String uri214 = "http://diviseema.info/pest-control-in-avanigadda/";
                        Intent intent214 = new Intent(Bussiness.this, WebActivity.class);
                        intent214.putExtra("uri", uri214);
                        startActivity(intent214);
                        break;
                    case 27:
                        String uri215 = "http://diviseema.info/cement-design-works-in-avanigadda/";
                        Intent intent215 = new Intent(Bussiness.this, WebActivity.class);
                        intent215.putExtra("uri", uri215);
                        startActivity(intent215);
                        break;
                    case 28:
                        String uri216 = "http://diviseema.info/welding-works-in-avanigadda/";
                        Intent intent216 = new Intent(Bussiness.this, WebActivity.class);
                        intent216.putExtra("uri", uri216);
                        startActivity(intent216);
                        break;
                    case 29:
                        String uri217 = "http://diviseema.info/dish-tv-setup-in-avanigadda/";
                        Intent intent217 = new Intent(Bussiness.this, WebActivity.class);
                        intent217.putExtra("uri", uri217);
                        startActivity(intent217);
                        break;
                    case 30:
                        String uri218 = "http://diviseema.info/dance-and-music-teaching-in-avanigadda/";
                        Intent intent218 = new Intent(Bussiness.this, WebActivity.class);
                        intent218.putExtra("uri", uri218);
                        startActivity(intent218);
                        break;
                    case 31:
                        String uri228 = "http://diviseema.info/blood-banks-in-avanigadda/";
                        Intent intent228 = new Intent(Bussiness.this, WebActivity.class);
                        intent228.putExtra("uri", uri228);
                        startActivity(intent228);
                        break;
                    case 32:

                        String uri32 = "http://diviseema.info/social-welfare-organizations-in-avg/";
                        Intent intent32 = new Intent(Bussiness.this, WebActivity.class);
                        intent32.putExtra("uri", uri32);
                        startActivity(intent32);
                        break;
                    case 33:
                        String uri119 = "http://diviseema.info/aqua-laboratories-in-avanigadda/";
                        Intent intent119 = new Intent(Bussiness.this, WebActivity.class);
                        intent119.putExtra("uri", uri119);
                        startActivity(intent119);
                        break;
                    case 34:
                        String uri191 = "http://diviseema.info/paddy-byers-in-avanigadda/";
                        Intent intent191 = new Intent(Bussiness.this, WebActivity.class);
                        intent191.putExtra("uri", uri191);
                        startActivity(intent191);
                        break;
                    default:
                        break;
                }

            }
        });
        }
        else

        {
            CheckInternet.showAlertDialog(Bussiness.this, "No Internet Connection",
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
