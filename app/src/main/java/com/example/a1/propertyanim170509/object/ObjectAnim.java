package com.example.a1.propertyanim170509.object;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/**
 * Created by 1 on 2017/5/9.
 */

public class ObjectAnim {

    //g根据属性值设置不同的属性动画
    public static void startObj(View view, String property, float from, float to){
        ObjectAnimator.ofFloat(view,property,from,to)
                .setDuration(500)
                .start();

    }
    //通过ObjectAnimation实现多动画同时操作
    public static void startObj(final View view,float from,float to){
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, "ocean", from, to);
        anim.setDuration(2000);
        anim.start();
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float x= (float) animation.getAnimatedValue();
                view.setAlpha(x);
                view.setScaleX(x);
                view.setScaleY(x);
            }
        });
    }
    //使用propertyVauesHolder来实现ObjectAnimator的多属性动画

    public static void startObj(View view){
        ObjectAnimator animator=ObjectAnimator.ofPropertyValuesHolder(view,
                PropertyValuesHolder.ofFloat("scaleX",1.0f,0.0f,1.0f),
                PropertyValuesHolder.ofFloat("scaleY",1.0f,0.0f,1.0f),
                PropertyValuesHolder.ofFloat("alpha",1.0f,0.0f,1.0f)
        ).setDuration(2000);
        animator.setInterpolator(new LinearInterpolator());
    }

}
