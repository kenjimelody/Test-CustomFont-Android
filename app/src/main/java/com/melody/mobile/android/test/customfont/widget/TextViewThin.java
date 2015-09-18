package com.melody.mobile.android.test.customfont.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
/**
 * Created by Thanisak Piyasaksiri on 9/18/15 AD.
 */
public class TextViewThin extends TextView {

    @SuppressWarnings("static-access")
    public TextViewThin(Context context) {

        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTCom-Md.ttf");
        this.setTypeface(face);
    }

    public TextViewThin(Context context, AttributeSet attrs) {

        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTCom-Md.ttf");
        this.setTypeface(face);
    }

    public TextViewThin(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTCom-Md.ttf");
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {

        super.onDraw(canvas);
    }
}
