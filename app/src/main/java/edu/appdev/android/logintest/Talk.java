package edu.appdev.android.logintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jordan on 12/11/2016.
 */

public class Talk extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talk);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        TextView txt = (TextView) findViewById(R.id.text);
        txt.setText("Hi " + name);
    }
}