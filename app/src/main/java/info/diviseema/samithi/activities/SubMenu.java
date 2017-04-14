package info.diviseema.samithi.activities;

/**
 * Created by welcome on 1/19/2017.
 */

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



public class SubMenu extends AppCompatActivity {
    GridView grid;
    ImageView add;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar ab =getSupportActionBar();
        setTitle("సమగ్ర సమాచారం");
        ab.setDisplayShowHomeEnabled(true);
        //add = (ImageView) findViewById(R.id.add);
        //add.setVisibility(View.GONE);
        final String[] services = new String[] {  "చరిత్ర", "పట్టణాలు","గ్రామాలు","దేవాలయాలు","స్కూల్స్ ","కాలేజీలు ","హాస్పిటల్స్ ","రెస్టారెంట్లు","బార్స్",
                "ట్రావెల్స్ ","పర్యాటక ప్రాంతాలు","ఎడ్యుకేషనల్ ఇన్స్టిట్యూట్స్","బ్యాంక్స్ ","ఏ.టి.మ్స్",
                "పోస్ట్ ఆఫీసులు ","పోలీస్ స్టేషన్లు","ఫైర్ స్టేషన్లు","ఆయిల్ బంక్స్",
                "జిమ్ సెంటర్స్","బ్యూటీ పార్లర్స్ ","వెహికల్ షోరూమ్స్ ","ఫంక్షన్స్ హాల్స్ ","షాప్స్ & స్టోర్స్ ","ప్రభుత్వ కార్యాలయాలు","మీసేవా సెంటర్స్",
                "సినిమాలు","ఆరోగ్య-సమాచారం ","వ్యవసాయ-సమాచారం","పిల్లలకు - పధకాలు ","మహిళలకు -పధకాలు","స్త్రీల కొరకు స్పెషల్","విలువైన-సమాచారం","కృష్ణా పుష్కర్ ఘాట్స్ ",
                "ఉద్యోగ-సమాచారం","ఫోన్-బుక్","దివిసీమ ఉప్పెన-1977","దివిసీమ వరదల సమాచారం","జరగబోవు కార్యక్రమాలు","రాజకీయ నాయకులు",
                "ప్రసిద్ధి  చెందిన వ్యక్తులు","ఆదర్శ వ్యక్తులు ","స్వాతంత్ర సమరయోధులు","చిత్ర-కళాకారులు","అవనిగడ్డ-ఫోటో గాలరి","కోడూరు-ఫోటో గాలరి",
                "నాగాయలంక-ఫోటో గాలరి","చల్లపల్లి-ఫోటో గాలరి","మోపిదేవి-ఫోటో గాలరి","ఘంటసాల-ఫోటో గాలరి","దివిసీమ ఉప్పెన 1977 ఫోటో గాలరి"};
        int [] Images={
                R.drawable.charithra,
                R.drawable.cities,
                R.drawable.vilages,
                R.drawable.temple,
                R.drawable.school,
                R.drawable.colleges,
                R.drawable.hospital,
                R.drawable.hotel,
                R.drawable.bar,
                R.drawable.travels,
                R.drawable.visiting,
                R.drawable.education1,
                R.drawable.bank,
                R.drawable.atm,
                R.drawable.postooffice,
                R.drawable.police,
                R.drawable.fire,
                R.drawable.petrol,
                R.drawable.gym,
                R.drawable.beaty,
                R.drawable.automobile,
                R.drawable.functionhals,
                R.drawable.stores,
                R.drawable.govtof1,
                R.drawable.meseva,
                R.drawable.film,
                R.drawable.health,
                R.drawable.agric,
                R.drawable.childrens,
                R.drawable.ladies,
                R.drawable.ladiesspecial,
                R.drawable.tips,
                R.drawable.krishnapuksha,
                R.drawable.job,
                R.drawable.phone,
                R.drawable.divisema,
                R.drawable.uppena,
                R.drawable.news,
                R.drawable.politics,
                R.drawable.vivekananda,
                R.drawable.inspiring,
                R.drawable.freedom,
                R.drawable.film,
                R.drawable.diviseema,
                R.drawable.koduru,
                R.drawable.nagaya,
                R.drawable.chalapalli,
                R.drawable.mopidevi,
                R.drawable.gantasala,
                R.drawable.divisema
        };
        if (CheckInternet.checkInternetConenction(context)) {
            ShopesGridview adapter = new ShopesGridview(SubMenu.this, services, Images);
        grid=(GridView)findViewById(R.id.grid_view_image_text);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " +array[+ position], Toast.LENGTH_SHORT).show();
                switch (services[position]) {
                    case "చరిత్ర":
                        String uri = "http://diviseema.info/";
                        Intent intent = new Intent(SubMenu.this,WebActivity.class);
                        intent.putExtra("uri",uri);
                        startActivity(intent);
                        break;
                    case "పట్టణాలు":
                        Intent intent1 = new Intent(SubMenu.this,Cities.class);
                        startActivity(intent1);
                        break;
                    case "గ్రామాలు":
                        Intent intent2 = new Intent(SubMenu.this,Villages.class);
                        startActivity(intent2);
                        break;
                    case "దేవాలయాలు":
                        Intent intent3 = new Intent(SubMenu.this,Temples.class);
                        startActivity(intent3);
                        break;
                    case "స్కూల్స్ ":
                        String uri4 = "http://diviseema.info/schools-in-diviseema/";
                        Intent intent4 = new Intent(SubMenu.this,WebActivity.class);
                        intent4.putExtra("uri",uri4);
                        startActivity(intent4);
                        break;
                    case "కాలేజీలు ":
                        String uri5 = "http://diviseema.info/colleges-in-diviseema/";
                        Intent intent5 = new Intent(SubMenu.this,WebActivity.class);
                        intent5.putExtra("uri",uri5);
                        startActivity(intent5);
                        break;
                    case "హాస్పిటల్స్ ":
                        String uri6 = "http://diviseema.info/hospitals-in-diviseema/";
                        Intent intent6 = new Intent(SubMenu.this,WebActivity.class);
                        intent6.putExtra("uri",uri6);
                        startActivity(intent6);
                        break;
                    case "రెస్టారెంట్లు":
                        String uri7 = "http://diviseema.info/hotels-and-lodges/";
                        Intent intent7 = new Intent(SubMenu.this,WebActivity.class);
                        intent7.putExtra("uri",uri7);
                        startActivity(intent7);
                        break;
                    case "బార్స్":
                        String uri8 ="http://diviseema.info/bars-in-in-avanigadda-constituency/";
                        Intent intent8 = new Intent(SubMenu.this,WebActivity.class);
                        intent8.putExtra("uri",uri8);
                        startActivity(intent8);
                        break;
                    case "ట్రావెల్స్ ":
                        String uri9 = "http://diviseema.info/travels-information/";
                        Intent intent9 = new Intent(SubMenu.this,WebActivity.class);
                        intent9.putExtra("uri",uri9);
                        startActivity(intent9);
                        break;
                    case "పర్యాటక ప్రాంతాలు":
                        String uri11 = "http://diviseema.info/visiting-places-in-diviseema/";
                        Intent intent11 = new Intent(SubMenu.this,WebActivity.class);
                        intent11.putExtra("uri", uri11);
                        startActivity(intent11);
                        break;
                    case "ఎడ్యుకేషనల్ ఇన్స్టిట్యూట్స్":
                        String uri14 ="http://diviseema.info/educational-institutions-in-avanigadda/";
                        Intent intent14 = new Intent(SubMenu.this,WebActivity.class);
                        intent14.putExtra("uri",uri14);
                        startActivity(intent14);
                        break;
                    case "బ్యాంక్స్ ":
                        String uri15 ="http://diviseema.info/banks-in-avanigadda-constituency/";
                        Intent intent15 = new Intent(SubMenu.this,WebActivity.class);
                        intent15.putExtra("uri",uri15);
                        startActivity(intent15);
                        break;
                    case "ఏ.టి.మ్స్":
                        String uri16 ="http://diviseema.info/atm-centers-in-avanigadda-constituency/";
                        Intent intent16 = new Intent(SubMenu.this,WebActivity.class);
                        intent16.putExtra("uri",uri16);
                        startActivity(intent16);
                        break;
                    case "పోస్ట్ ఆఫీసులు ":
                        String uri17 = "http://diviseema.info/post-offices-in-avanigadda-constituency/";
                        Intent intent17 = new Intent(SubMenu.this,WebActivity.class);
                        intent17.putExtra("uri",uri17);
                        startActivity(intent17);
                        break;
                    case "పోలీస్ స్టేషన్లు":
                        String uri18 ="http://diviseema.info/police-stations-in-avanigadda-constituency/";
                        Intent intent18 = new Intent(SubMenu.this,WebActivity.class);
                        intent18.putExtra("uri",uri18);
                        startActivity(intent18);
                        break;
                    case "ఫైర్ స్టేషన్లు":
                        String uri19 = "http://diviseema.info/fire-stations-in-avanigadda-constituency/";
                        Intent intent19 = new Intent(SubMenu.this,WebActivity.class);
                        intent19.putExtra("uri",uri19);
                        startActivity(intent19);
                        break;
                    case "ఆయిల్ బంక్స్":
                        String uri20 = "http://diviseema.info/fuel-stations-in-avanigadda-constituency/";
                        Intent intent20 = new Intent(SubMenu.this,WebActivity.class);
                        intent20.putExtra("uri",uri20);
                        startActivity(intent20);
                        break;
                    case "జిమ్ సెంటర్స్":
                        String uri21 = "http://diviseema.info/gym-centers-in-avanigadda-constituency/";
                        Intent intent21 = new Intent(SubMenu.this,WebActivity.class);
                        intent21.putExtra("uri",uri21);
                        startActivity(intent21);
                        break;
                    case "బ్యూటీ పార్లర్స్ ":
                        String uri22 = "http://diviseema.info/beauty-parlors-in-avanigadda-constituency/";
                        Intent intent22 = new Intent(SubMenu.this,WebActivity.class);
                        intent22.putExtra("uri",uri22);
                        startActivity(intent22);
                        break;
                    case "వెహికల్ షోరూమ్స్ ":
                        String uri23 = "http://diviseema.info/vehicle-showrooms-in-avanigadda-constituency/";
                        Intent intent23 = new Intent(SubMenu.this,WebActivity.class);
                        intent23.putExtra("uri",uri23);
                        startActivity(intent23);
                        break;
                    case "ఫంక్షన్స్ హాల్స్ ":
                        String uri24 = "http://diviseema.info/function-halls-in-avanigadda-constituency/";
                        Intent intent24 = new Intent(SubMenu.this,WebActivity.class);
                        intent24.putExtra("uri",uri24);
                        startActivity(intent24);
                        break;
                    case "షాప్స్ & స్టోర్స్ ":
                        //String uri25 = "http://diviseema.info/stores-in-avanigadda-constituency/";
                        Intent intent25 = new Intent(SubMenu.this,StoresActivityGrid.class);
                        //intent25.putExtra("uri",uri25);
                        startActivity(intent25);
                        break;

                    case "ప్రభుత్వ కార్యాలయాలు":
                        String uri28 = "http://diviseema.info/govt-offices-in-avanigadda-constituency/";
                        Intent intent28 = new Intent(SubMenu.this,WebActivity.class);
                        intent28.putExtra("uri",uri28);
                        startActivity(intent28);
                        break;
                    case "మీసేవా సెంటర్స్":
                        String uri29 = "http://diviseema.info/meeseva-centers-in-avanigadda-constituency/";
                        Intent intent29 = new Intent(SubMenu.this,WebActivity.class);
                        intent29.putExtra("uri",uri29);
                        startActivity(intent29);
                        break;
                    case "సినిమాలు":
                        String uri30 = "http://diviseema.info/movies-in-theaters-in-avanigadda-constituency/";
                        Intent intent30 = new Intent(SubMenu.this,WebActivity.class);
                        intent30.putExtra("uri",uri30);
                        startActivity(intent30);
                        break;
                    case "ఆరోగ్య-సమాచారం ":
                        String uri31 = "http://diviseema.info/health-tips/";
                        Intent intent31 = new Intent(SubMenu.this,WebActivity.class);
                        intent31.putExtra("uri",uri31);
                        startActivity(intent31);
                        break;
                    case "వ్యవసాయ-సమాచారం":
                        String uri32 ="http://diviseema.info/agriculture-awareness/";
                        Intent intent32 = new Intent(SubMenu.this,WebActivity.class);
                        intent32.putExtra("uri",uri32);
                        startActivity(intent32);
                        break;
                    case "పిల్లలకు - పధకాలు ":
                        String uri33 ="http://diviseema.info/schemes-for-childrens/";
                        Intent intent33 = new Intent(SubMenu.this,WebActivity.class);
                        intent33.putExtra("uri",uri33);
                        startActivity(intent33);
                        break;
                    case "మహిళలకు -పధకాలు":
                        String uri34 = "http://diviseema.info/schemes-for-womens/";
                        Intent intent34 = new Intent(SubMenu.this,WebActivity.class);
                        intent34.putExtra("uri",uri34);
                        startActivity(intent34);
                        break;
                    case "స్త్రీల కొరకు స్పెషల్":
                        Intent intent35 = new Intent(SubMenu.this,LadiesSpecial.class);
                        startActivity(intent35);
                        break;
                    case "విలువైన-సమాచారం":
                        String uri36 ="http://diviseema.info/useful-tips-for/";
                        Intent intent36 = new Intent(SubMenu.this,WebActivity.class);
                        intent36.putExtra("uri",uri36);
                        startActivity(intent36);
                        break;
                    case "కృష్ణా పుష్కర్ ఘాట్స్ ":
                        String uri37 = "http://diviseema.info/krishna-pushkar-ghats-in-avanigadda-constituency/";
                        Intent intent37 = new Intent(SubMenu.this,WebActivity.class);
                        intent37.putExtra("uri",uri37);
                        startActivity(intent37);
                        break;
                    case "ఉద్యోగ-సమాచారం":
                        String uri38 = "http://diviseema.info/diviseema-software-jobs-information/";
                        Intent intent38 = new Intent(SubMenu.this,WebActivity.class);
                        intent38.putExtra("uri",uri38);
                        startActivity(intent38);
                        break;
                    case "ఫోన్-బుక్":
                        String uri39 = "http://diviseema.info/diviseema-phonebook/";
                        Intent intent39 = new Intent(SubMenu.this,WebActivity.class);
                        intent39.putExtra("uri",uri39);
                        startActivity(intent39);
                        break;
                    case "దివిసీమ ఉప్పెన-1977":
                        String uri40 = "http://diviseema.info/diviseema-1977/";
                        Intent intent40 = new Intent(SubMenu.this,WebActivity.class);
                        intent40.putExtra("uri",uri40);
                        startActivity(intent40);
                        break;
                    case "దివిసీమ వరదల సమాచారం":
                        String uri41 = "http://diviseema.info/diviseema-floods-photos/";
                        Intent intent41 = new Intent(SubMenu.this,WebActivity.class);
                        intent41.putExtra("uri",uri41);
                        startActivity(intent41);
                        break;
                    case "జరగబోవు కార్యక్రమాలు":
                        String uri42 = "http://diviseema.info/register/";
                        Intent intent42 = new Intent(SubMenu.this,WebActivity.class);
                        intent42.putExtra("uri",uri42);
                        startActivity(intent42);
                        break;
                    case "రాజకీయ నాయకులు":
                        String uri43 = "http://diviseema.info/diviseema-politicians/";
                        Intent intent43 = new Intent(SubMenu.this,WebActivity.class);
                        intent43.putExtra("uri",uri43);
                        startActivity(intent43);
                        break;
                    case "ప్రసిద్ధి  చెందిన వ్యక్తులు":
                        String uri44 = "http://diviseema.info/popular-persons-in-diviseema/";
                        Intent intent44 = new Intent(SubMenu.this,WebActivity.class);
                        intent44.putExtra("uri",uri44);
                        startActivity(intent44);
                        break;
                    case "ఆదర్శ వ్యక్తులు ":
                        String uri45 = "http://diviseema.info/inspiring-persons-from-avanigadda-constituency/";
                        Intent intent45 = new Intent(SubMenu.this,WebActivity.class);
                        intent45.putExtra("uri",uri45);
                        startActivity(intent45);
                        break;
                    case "స్వాతంత్ర సమరయోధులు":
                        String uri46 = "http://diviseema.info/freedom-fighters-from-avanigadda-constituency/";
                        Intent intent46 = new Intent(SubMenu.this,WebActivity.class);
                        intent46.putExtra("uri",uri46);
                        startActivity(intent46);
                        break;
                    case "చిత్ర-కళాకారులు":
                        String uri47 = "http://diviseema.info/persons-from-tollywood-film-industry/";
                        Intent intent47 = new Intent(SubMenu.this,WebActivity.class);
                        intent47.putExtra("uri",uri47);
                        startActivity(intent47);
                        break;
                    case "అవనిగడ్డ-ఫోటో గాలరి":
                        String uri48 = "http://diviseema.info/avanigadda-photos-gallery/";
                        Intent intent48= new Intent(SubMenu.this,WebActivity.class);
                        intent48.putExtra("uri",uri48);
                        startActivity(intent48);
                        break;
                    case "కోడూరు-ఫోటో గాలరి":
                        String uri49 = "http://diviseema.info/koduru-mandal-photos-gallery/";
                        Intent intent49 = new Intent(SubMenu.this,WebActivity.class);
                        intent49.putExtra("uri",uri49);
                        startActivity(intent49);
                        break;
                    case "నాగాయలంక-ఫోటో గాలరి":
                        String uri50 = "http://diviseema.info/nagayalanka-photos-gallery/";
                        Intent intent50 = new Intent(SubMenu.this,WebActivity.class);
                        intent50.putExtra("uri",uri50);
                        startActivity(intent50);
                        break;
                    case "చల్లపల్లి-ఫోటో గాలరి":
                        String uri51 = "http://diviseema.info/challapalli-photos/";
                        Intent intent51 = new Intent(SubMenu.this,WebActivity.class);
                        intent51.putExtra("uri",uri51);
                        startActivity(intent51);
                        break;
                    case "మోపిదేవి-ఫోటో గాలరి":
                        String uri52 = "http://diviseema.info/mopidevi-photos-gallery/";
                        Intent intent52 = new Intent(SubMenu.this,WebActivity.class);
                        intent52.putExtra("uri",uri52);
                        startActivity(intent52);
                        break;
                    case "ఘంటసాల-ఫోటో గాలరి":
                        String uri53="http://diviseema.info/ghantasala-photos/";
                        Intent intent53=new Intent(SubMenu.this,WebActivity.class);
                        intent53.putExtra("uri",uri53);
                        startActivity(intent53);
                        break;
                    case "దివిసీమ ఉప్పెన 1977 ఫోటో గాలరి":
                        String uri54="http://diviseema.info/diviseema-1977-photos/";
                        Intent intent54=new Intent(SubMenu.this,WebActivity.class);
                        intent54.putExtra("uri",uri54);
                        startActivity(intent54);
                        break;
                    default:
                        break;
                }

            }
        });
    }
    else

    {
        CheckInternet.showAlertDialog(SubMenu.this, "No Internet Connection",
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
                startActivity(new Intent(getBaseContext(), Home.class));
                return true;
            case R.id.action_settings:
                startActivity(new Intent(this, Home.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
