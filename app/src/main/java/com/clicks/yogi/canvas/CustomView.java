package com.clicks.yogi.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    Paint mp;
    public CustomView(Context context) {
        super(context);
        init();
    }
    public CustomView(Context context,
                      @Nullable AttributeSet attrs){
        super(context, attrs);
        init();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        mp.setColor(Color.RED);
//canvas.drawLine(25,25,50,50,mp);
        canvas.drawLine(0,0,getWidth()/2,getHeight()/2,mp);
        canvas.drawText("Hello Canvas",getHeight()/2,
                getWidth()/2,mp);
        mp.setColor(Color.BLUE);
        canvas.drawRect(100,100,300,300,mp);
        mp.setStyle(Paint.Style.FILL);
        canvas.drawText("Graphics Rotation", 40, 400, mp);
        mp.setColor(Color.GREEN);
        mp.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(550,550,150,mp);
        mp.setColor(Color.CYAN);
        mp.setStyle(Paint.Style.FILL);
        float[] f = {200,200,350,0,350,0,500,200,500,200,200,200};
        canvas.drawLines(f,mp);
        mp.setColor(Color.WHITE);
        canvas.drawArc(200,200,800,800,0,90,true,mp);
    }
    void init(){
        mp = new Paint();
// draw boundary line using STROKE...
        mp.setStyle(Paint.Style.FILL);
        mp.setStrokeWidth(5);
        mp.setColor(Color.BLACK);
    }
}