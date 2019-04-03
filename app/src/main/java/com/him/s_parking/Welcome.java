package com.him.s_parking;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    private static int TIME_OUT = 4000; //Time to launch the another activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Welcome.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

    }
}
