package com.melody.mobile.android.test.customfont.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
/**
 * Created by Thanisak Piyasaksiri on 9/18/15 AD.
 */
public class TextViewItalicBold extends TextView {

    @SuppressWarnings("static-access")
    public TextViewItalicBold(Context context) {

        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTCom-BdIt.ttf");
        this.setTypeface(face);
    }

    public TextViewItalicBold(Context context, AttributeSet attrs) {

        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTCom-BdIt.ttf");
        this.setTypeface(face);
    }

    public TextViewItalicBold(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTCom-BdIt.ttf");
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {

        super.onDraw(canvas);
    }
}
