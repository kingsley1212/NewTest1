package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {
    private int lastY;
    private int lastX;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX =x;
                lastY=y;
                break;
            case MotionEvent.ACTION_MOVE:
                int offsetY = y-lastY;
                int offsetX = x-lastX;
                layout(getLeft()+offsetX,getTop()+offsetY,getRight()+offsetX,getBottom()+offsetY);
                break;
        }
        return true;
    }
}
