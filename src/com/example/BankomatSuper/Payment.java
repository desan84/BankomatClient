package com.example.BankomatSuper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 18.01.13
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */




public class Payment extends Activity {
    EditText editPaymentMoney;
    EditText editPaymentPhone;
    Button   btnOkPayment;
    Button btnPaymentBack;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.

        setContentView(R.layout.payment);  // привязка к окну
        editPaymentMoney = (EditText) findViewById(R.id.editPaymentMoney);
        btnOkPayment = (Button)findViewById(R.id.btnOkPayment);
        editPaymentPhone = (EditText) findViewById(R.id.editPaymentPhone);
        btnPaymentBack = (Button) findViewById(R.id.btnPaymentBack);


    }

}
