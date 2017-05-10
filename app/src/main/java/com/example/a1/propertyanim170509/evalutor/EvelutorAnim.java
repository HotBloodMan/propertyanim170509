package com.example.a1.propertyanim170509.evalutor;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;

/**
 * Created by 1 on 2017/5/10.
 */

public class EvelutorAnim {
    //抛物线
    public static void startValue(final View view)
    {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(2000);
        valueAnimator.setObjectValues(new PointF(0,0));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setEvaluator(new TypeEvaluator() {
            @Override
            public Object evaluate(float fraction, Object startValue, Object endValue) {
                PointF point = new PointF();
                point.x=200*fraction*3;
                point.y=0.5f*200*(fraction*3)*(fraction*3);
                return point;
            }
        });
        valueAnimator.start();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                PointF point= (PointF) animation.getAnimatedValue();
                view.setX(point.x);
                view.setY(point.y);
            }
        });
    }
    //使用evalutor来进行变换 注意这种方法只适合ValueAnimator 因为动画执行不涉及Getter和Setter方法
    public static void startValue2(final View view){
        ValueAnimator anim = new ValueAnimator();
        anim.setDuration(1000);
        anim.setObjectValues(0.0f,360.0f);
        anim.setEvaluator(new FloatEvaluator());
        anim.start();
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                view.setRotationX((Float) animation.getAnimatedValue());
            }
        });
    }
}
