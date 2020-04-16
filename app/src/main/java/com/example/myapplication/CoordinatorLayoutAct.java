package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class CoordinatorLayoutAct extends AppCompatActivity {
    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context,CoordinatorLayoutAct.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_coordinator_layout);

    }
}
