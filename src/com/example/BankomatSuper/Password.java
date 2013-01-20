package com.example.BankomatSuper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 18.01.13
 * Time: 9:39
 * To change this template use File | Settings | File Templates.
 */

public class Password extends Activity {

    TextView textViewPassword;
    Button btnPasswordOk;
    Button btnPasswordBack;
    String password;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.password);  // привязка к окну
        textViewPassword = (TextView)findViewById(R.id.textViewPassword);
        btnPasswordOk = (Button)findViewById(R.id.btnPasswordOk);
        btnPasswordBack = (Button)findViewById(R.id.btnPasswordBack);

        btnPasswordBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Password.this.finish();
            }
        });

        btnPasswordOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intentOperations = new Intent();
                intentOperations.setClass(Password.this,Payment.class);
                intentOperations.putExtra("OPERATIONS",password);
                Password.this.startActivity(intentOperations);
            }
        });

    }
}