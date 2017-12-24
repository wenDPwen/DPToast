package com.example.dp.dptoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_1 = (Button) findViewById(R.id.bt_1);
        Button bt_2 = (Button) findViewById(R.id.bt_2);
        Button bt_3 = (Button) findViewById(R.id.bt_3);
        Button bt_4 = (Button) findViewById(R.id.bt_4);
        Button bt_5 = (Button) findViewById(R.id.bt_5);
        Button bt_6 = (Button) findViewById(R.id.bt_6);
        Button bt_7 = (Button) findViewById(R.id.bt_7);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_1:
                DPToast.showText(this,"哈哈");
                break;
            case R.id.bt_2:
                DPToast.showText(this,"哈哈",true);
                break;
            case R.id.bt_3:
                DPToast.showText(this,"哈哈",false);
                break;
            case R.id.bt_4:
                DPToast.showText(this,"哈哈", Toast.LENGTH_LONG);
                break;
            case R.id.bt_5:
                DPToast.showText(this,"哈哈", Toast.LENGTH_SHORT);
                break;
            case R.id.bt_6:
                DPToast.showText(this,"哈哈", Toast.LENGTH_LONG,true);
                break;
            case R.id.bt_7:
                DPToast.showText(this,"哈哈", Toast.LENGTH_LONG,false);
                break;
        }
    }
}
