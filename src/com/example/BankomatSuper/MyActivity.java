package com.example.BankomatSuper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
      Button btnRusLan;
      Button btnUkrLan;
      String language;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnRusLan = (Button) findViewById(R.id.btnRusLan);
        btnUkrLan = (Button) findViewById(R.id.btnUkrLan);


        btnRusLan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                language = "RU";
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,NumberPhone.class);
                intent.putExtra("LANG",language);
                MyActivity.this.startActivity(intent);
            }
        });
        btnUkrLan.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View view){
                language = "UA";
                Intent intent = new Intent();
                intent.setClass(MyActivity.this,NumberPhone.class);
                intent.putExtra("LANG",language);
                MyActivity.this.startActivity(intent);
            }
        });
    }
}
