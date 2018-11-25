package com.example.sys.signup;

import android.content.Context;
import android.graphics.Typeface;

import android.util.AttributeSet;
import android.widget.TextView;


public class MyText extends android.support.v7.widget.AppCompatTextView {
    public MyText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyText(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public MyText(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"Montserrat-Regular.ttf");
        setTypeface(tf);
    }


}
