package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MycustomView extends View {
    private Paint paint;

    public MycustomView(Context context) {
        super(context);
    }

    public MycustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MycustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        实例化画笔对象
        paint = new Paint();
//        给画笔设置颜色
        paint.setColor(Color.RED);
//        设置画笔属性
//        paint.setStyle(Paint.Style.FILL);//画笔属性是实心圆
        paint.setStyle(Paint.Style.STROKE);//画笔属性是空心圆
        paint.setStrokeWidth(8);//设置画笔粗细
        paint.setAntiAlias(true);

        canvas.drawColor(Color.BLACK);
        /*四个参数：
                参数一：圆心的x坐标
                参数二：圆心的y坐标
                参数三：圆的半径
                参数四：定义好的画笔
                */
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 200, paint);
        canvas.drawCircle(300, 300, 200, paint);
    }
}
