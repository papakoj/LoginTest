package edu.appdev.android.logintest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jordan on 12/11/2016.
 */

public class LoginInt extends AppCompatActivity {

    EditText msg;
    public static final String EXTRA_NAME = "extra_name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        msg = (EditText) findViewById(R.id.username);
        }

    public void logIn(View v) {
        final Intent intent = new Intent(getApplicationContext(), Talk.class);
        intent.putExtra(Talk.EXTRA_NAME, msg.getText().toString());
        startActivity(intent);
    }
}