package com.cxmscb.cxm.processproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.startService(new Intent(this,FirstService.class));
        this.startService(new Intent(this,SecondService.class));
        this.startService(new Intent(this,MyJobDaemonService.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
