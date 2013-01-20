package com.example.BankomatSuper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 18.01.13
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
public class Operations extends Activity {
    Button btnChangePassword;
    Button btnRemovalMoney;
    Button btnReviewBalance;
    Button btnTopPhone;
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operations);
        btnRemovalMoney = (Button)findViewById(R.layout.operations);
        btnReviewBalance = (Button)findViewById(R.layout.operations);
        btnTopPhone = (Button)findViewById(R.layout.operations);
        btnChangePassword = (Button)findViewById(R.layout.operations);

    }
}