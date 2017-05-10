package com.example.a1.propertyanim170509.object;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a1.propertyanim170509.R;
import com.example.a1.propertyanim170509.object.ObjectAnim;

public class ObjectAnimActivity extends Activity implements OnClickListener{
	
	private ImageView iv_obj;
	private TextView tv_rotate;
	private TextView tv_multi;
	private TextView tv_property;
	private boolean isShow = true;
	private int flag = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_object);
		findView();
		setOnClick();
	}

	private void setOnClick() {
		tv_rotate.setOnClickListener(this);
		tv_multi.setOnClickListener(this);
		tv_property.setOnClickListener(this);
	}

	private void findView() {
		iv_obj = (ImageView) findViewById(R.id.iv_obj);
		tv_rotate = (TextView) findViewById(R.id.tv_rotate);
		tv_multi = (TextView) findViewById(R.id.tv_multi);
		tv_property = (TextView) findViewById(R.id.tv_property);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_rotate:
			if (isShow) {
				if (flag%2 == 0) {
					ObjectAnim.startObj(iv_obj,"rotationY", 0.0F, 360.0f);
				}else{
					ObjectAnim.startObj(iv_obj,"rotationX", 0.0F, 360.0f);
				}
				flag += 1;
			}
			break;
		case R.id.tv_multi:
			if (isShow) {
				ObjectAnim.startObj(iv_obj, 1.0f, 0.0f);
				isShow = false;
			}else{
				ObjectAnim.startObj(iv_obj, 0.0f, 1.0f);
				isShow = true;
			}
			break;
		case R.id.tv_property:
			ObjectAnim.startObj(iv_obj);
			break;
		default:
			break;
		}
	}
	
}
