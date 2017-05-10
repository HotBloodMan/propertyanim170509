package com.example.a1.propertyanim170509.value;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

/**
 * Created by 1 on 2017/5/10.
 */

public class ValueAnim {

    //设置view的平移
    public static void startValue(final View view, final String orientation, float from, float to){
        ValueAnimator anim = ValueAnimator.ofFloat(from, to);
        anim.setTarget(view);
        anim.setDuration(2000);
        anim.setInterpolator(new AccelerateInterpolator());
        anim.start();
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if(orientation.equals("y")){
                    view.setTranslationY((Float) animation.getAnimatedValue());
                }else{
                    view.setTranslationX((Float) animation.getAnimatedValue());
                }
            }
        });
    }
    //抛物线
    public static void startValue(final View view,final float ratio,float from,float to){
        ValueAnimator anim = ValueAnimator.ofFloat(from, to);
        anim.setTarget(view);
        anim.setDuration(2000);
        anim.setInterpolator(new AccelerateInterpolator());
        anim.start();
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value= (float) animation.getAnimatedValue();
                view.setTranslationX(200*value*3);
                view.setTranslationY(0.5f*200*value*3*value*3);
            }
        });
    }

}
