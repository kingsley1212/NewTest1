package com.example.myapplication;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class AnimotionAct extends AppCompatActivity {
private TextView animotion_tv;
    int changX = 100;
    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AnimotionAct.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_animotion);
        animotion_tv = (TextView) findViewById(R.id.animotion_tv);

        animotion_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(animotion_tv,"translationX",changX,changX+20);
                objectAnimator.setDuration(2000);
                objectAnimator.start();
                objectAnimator.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Toast.makeText(AnimotionAct.this, "111", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Toast.makeText(AnimotionAct.this, "saf", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
                changX+=10;

            }
        });

    }

}
