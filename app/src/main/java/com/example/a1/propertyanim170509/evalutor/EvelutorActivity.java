package com.example.a1.propertyanim170509.evalutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a1.propertyanim170509.R;

public class EvelutorActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_evaluator;
    private ImageView iv_global;
    private TextView btn_one;
    private TextView btn_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evelutor);
        findView();
        setOnClick();
    }
    private void findView() {
        iv_evaluator = (ImageView) findViewById(R.id.iv_evaluator);
        iv_global = (ImageView) findViewById(R.id.iv_global);
        btn_one = (TextView) findViewById(R.id.btn_one);
        btn_two = (TextView) findViewById(R.id.btn_two);
    }

    private void setOnClick() {
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                EvelutorAnim.startValue2(iv_evaluator);
                break;
            case R.id.btn_two:
                EvelutorAnim.startValue(iv_global);
                break;
            default:
                break;
        }
    }
}
