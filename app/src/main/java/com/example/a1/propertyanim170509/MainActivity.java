package com.example.a1.propertyanim170509;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a1.propertyanim170509.evalutor.EvelutorActivity;
import com.example.a1.propertyanim170509.object.ObjectAnimActivity;
import com.example.a1.propertyanim170509.set.SetAnimActivity;
import com.example.a1.propertyanim170509.value.ValueAnimActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnObj;
    private Button btnValue;
    private Button btnEva;
    private Button btnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setOnClick();
    }

    private void setOnClick() {
        btnObj.setOnClickListener(this);
        btnValue.setOnClickListener(this);
        btnEva.setOnClickListener(this);
        btnSet.setOnClickListener(this);
    }

    private void initWidget() {
        btnObj = (Button) findViewById(R.id.btn_obj);
        btnValue = (Button) findViewById(R.id.btn_value);
        btnEva = (Button) findViewById(R.id.btn_evelu);
        btnSet = (Button) findViewById(R.id.btn_set);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_obj:
                Intent intent1 = new Intent(MainActivity.this, ObjectAnimActivity.class);
                this.startActivity(intent1);
                break;

            case R.id.btn_value:
                Intent intent2 = new Intent(MainActivity.this, ValueAnimActivity.class);
                this.startActivity(intent2);
                break;
            case R.id.btn_evelu:
                Intent intent3 = new Intent(MainActivity.this, EvelutorActivity.class);
                this.startActivity(intent3);
                break;
            case R.id.btn_set:
                Intent intent4 = new Intent(MainActivity.this, SetAnimActivity .class);
                this.startActivity(intent4);
                break;
        }
    }
}
