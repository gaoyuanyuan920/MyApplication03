package com.example.lenovo.myapplication03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1);
        Button button = (Button) findViewById(R.id.work1);
        //Button button1 = (Button) findViewById(R.id.work2);
        class myclass implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                //界面跳转
                Intent intent =new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);

            }
        }


    }

}
