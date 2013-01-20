package com.example.BankomatSuper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 17.01.13
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */

public class NumberPhone extends Activity{
    EditText editPhone;
    Button btnPhoneOk;
    Button btnPhoneBack;
    String phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();                                // метод для получения текущего intent, что бы перейти на другой экран
        String language = intent.getExtras().getString("LANG");

        setContentView(R.layout.phone);  // привязка к окну

        editPhone = (EditText) findViewById(R.id.editPhone);
        btnPhoneOk = (Button) findViewById(R.id.btnPhoneOk);
        btnPhoneBack = (Button) findViewById(R.id.btnPhoneBack);

        btnPhoneBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            NumberPhone.this.finish();      // метод который вернет нас на предыдущий экран
            }
        });

        btnPhoneOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            phone = editPhone.getText().toString(); //получили тот текст уоторый ввел человек
            Intent intentRun = new Intent();
                intentRun.setClass(NumberPhone.this,Password.class);
                intentRun.putExtra("USER_PHONE",phone);
                NumberPhone.this.startActivity(intentRun);



            }
        });






    }
}
