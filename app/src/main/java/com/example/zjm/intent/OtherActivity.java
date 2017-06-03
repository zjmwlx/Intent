package com.example.zjm.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        msg = (TextView) findViewById(R.id.msg);

        Intent intent = getIntent();

        int age = intent.getIntExtra("age",0);
        String name = intent.getStringExtra("name");
        String address = intent.getStringExtra("address");

        msg.setText("age:"+age+"\n"+"name:"+name+"\n"+"address:"+address);
    }
}
