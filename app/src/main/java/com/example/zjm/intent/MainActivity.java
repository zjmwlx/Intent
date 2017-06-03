package com.example.zjm.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //声明意图
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                //在意图中添加要传递的数据
                intent.putExtra("name","张三");
                intent.putExtra("age","23");
                intent.putExtra("address","北京");
                //启动意图
                startActivity(intent);

            }
        });
    }
}
