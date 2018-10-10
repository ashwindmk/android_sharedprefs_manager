package com.ashwin.examples.sharedprefsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPrefsManager prefs = SharedPrefsManager.get(this);
        Log.d("debug-log", "name: " + prefs.getString("name", "default"));

        prefs.put("name", "ashwin");
    }
}
