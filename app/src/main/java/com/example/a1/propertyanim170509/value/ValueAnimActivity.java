package com.example.a1.propertyanim170509.value;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.a1.propertyanim170509.R;
import com.example.a1.propertyanim170509.value.ValueAnim;

public class ValueAnimActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_global;
    private Button btn_one;
    private Button btn_two;
    private int height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_anim);
        findView();
        getWindowData();
        setOnClick();
    }

    private void findView() {
        iv_global = (ImageView) findViewById(R.id.iv_global);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
    }

    private void getWindowData() {
        WindowManager manager = getWindowManager();
        height=manager.getDefaultDisplay().getHeight();
    }

    private void setOnClick() {
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                ValueAnim.startValue(iv_global,"y",0,height-iv_global.getHeight()-btn_one.getHeight()-
                iv_global.getMeasuredHeight()-btn_one.getMeasuredHeight());
                break;
            case R.id.btn_two:
                ValueAnim.startValue(iv_global,0,0,1);
                break;
        }
    }
}
