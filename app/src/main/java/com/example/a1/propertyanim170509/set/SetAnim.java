package com.example.a1.propertyanim170509.set;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/**
 * Created by 1 on 2017/5/10.
 */

public class SetAnim {

    //利用AnimatorSet同时执行动画
    public static void  startAnim(View view){
        ObjectAnimator obj1=ObjectAnimator.ofFloat(view,"scaleX",1.0f,0.5f,1.0f);
        ObjectAnimator obj2=ObjectAnimator.ofFloat(view,"scaleY",1.0f,0.5f,1.0f);
        ObjectAnimator obj3=ObjectAnimator.ofFloat(view,"rotationX",0.0f,180.0f,1.0f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(2000);
        set.setInterpolator(new LinearInterpolator());
        set.playTogether(obj1,obj2,obj3);
        set.start();
    }

    //利用AnimatorSet分布骤执行动画
    public static void startAnimSync(View view){
        ObjectAnimator obj1 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f, 1.0f);
        ObjectAnimator obj2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.5f, 1.0f);
        ObjectAnimator obj3 = ObjectAnimator.ofFloat(view, "rotationX", 0.0f, 180.0f, 0.0f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(2000);
        set.setInterpolator(new LinearInterpolator());
        set.play(obj1).after(obj2);
        set.play(obj2).after(obj3);
        set.start();
    }
}
