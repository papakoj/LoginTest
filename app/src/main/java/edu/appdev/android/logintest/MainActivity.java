package edu.appdev.android.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchLogin(View v) {
        final Intent intent = new Intent(getApplicationContext(), LoginInt.class);
        startActivity(intent);
    }
}
