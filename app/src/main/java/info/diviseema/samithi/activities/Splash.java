package info.diviseema.samithi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ctx=this;
        new Handler().postDelayed(new Runnable() {
            @SuppressLint("JavascriptInterface")
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this,Home.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, 3000);
    }
}
