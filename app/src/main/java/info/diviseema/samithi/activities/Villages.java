package info.diviseema.samithi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by welcome on 2/22/2016.
 */
public class Villages extends ActionBarActivity {
    ListView listView ;
    List<HashMap<String,String>> aList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar ab =getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);
        ab.setIcon(R.mipmap.ic_logo);
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] menus = new String[] { "అవనిగడ్డ మండలములోని గ్రామాలు",
                "కోడూరు  మండలములోని గ్రామాలు",
                "నాగాయలంక మండలములోని గ్రామాలు",
                "మోపిదేవి మండలములోని గ్రామాలు",
                "చల్లపల్లి మండలములోని గ్రామాలు",
                "ఘంటసాల మండలములోని గ్రామాలు"};
        Integer[] images = {
                R.drawable.ic_avani_village,
                R.drawable.ic_koduru_village,
                R.drawable.ic_nagayalanka_village,
                R.drawable.ic_mopidevi_village,
                R.drawable.ic_challapali_village,
                R.drawable.ic_ghantasala_villages

        };

        aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<menus.length;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("img",Integer.toString(images[i]));
            hm.put("menu",menus[i]);
            aList.add(hm);
        }
        String[] from = {"img","menu"};
        int[] to = {R.id.img,R.id.txt};
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview, from, to);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(getBaseContext(), "You Clicked at " + aList.get(+position).get("menu"), Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        String uri = " http://diviseema.info/avanigadda-villages/";
                        Intent intent = new Intent(Villages.this,WebActivity.class);
                        intent.putExtra("uri",uri);
                        startActivity(intent);
                        break;
                    case 1:
                        String uri1 = "http://diviseema.info/koduru-villages/";
                        Intent intent1 = new Intent(Villages.this,WebActivity.class);
                        intent1.putExtra("uri",uri1);
                        startActivity(intent1);
                        break;
                    case 2:
                        String uri2 = "http://diviseema.info/nagayalanka-villages/";
                        Intent intent2 = new Intent(Villages.this,WebActivity.class);
                        intent2.putExtra("uri",uri2);
                        startActivity(intent2);
                        break;
                    case 3:
                        String uri3 ="http://diviseema.info/mopidevi-villages/";
                        Intent intent3 = new Intent(Villages.this,WebActivity.class);
                        intent3.putExtra("uri",uri3);
                        startActivity(intent3);
                        break;
                    case 4:
                        String uri4 ="http://diviseema.info/challapallI-villages/";
                        Intent intent4 = new Intent(Villages.this,WebActivity.class);
                        intent4.putExtra("uri",uri4);
                        startActivity(intent4);
                        break;
                    case 5:
                        String uri5=" http://diviseema.info/ghantasala-villages/";
                        Intent intent5 = new Intent(Villages.this,WebActivity.class);
                        intent5.putExtra("uri",uri5);
                        startActivity(intent5);
                        break;
                    default:
                        break;
                }


            }

        });

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
