package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class SnackBarAct extends AppCompatActivity {
    private CoordinatorLayout snackBar_main;
    private TextInputLayout textInputLayout;
    private CustomView custom;

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SnackBarAct.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        snackBar_main = (CoordinatorLayout) findViewById(R.id.snackBar_main);
        textInputLayout = (TextInputLayout) findViewById(R.id.tel);
        custom = (CustomView) findViewById(R.id.custom);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ObjectAnimator.ofFloat(custom, "translationX", 0, 300).setDuration(1000).start();
                custom.setAnimation(AnimationUtils.loadAnimation(SnackBarAct.this,R.anim.translate));
            }
        });
        textInputLayout.setError("nihao");
    }

    public void onClick(View view) {
        Snackbar.make(snackBar_main, "你真的室牛博啊", Snackbar.LENGTH_SHORT).setAction("点击时间", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SnackBarAct.this, "你傻呀", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
}
