package com.eme.android.java.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;

import timber.log.Timber;

public class MyCustomView extends androidx.appcompat.widget.AppCompatTextView {

    public MyCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Timber.d("onTouchEvent " + event.toString());
        decorateText();
        return super.onTouchEvent(event);
    }

    private void decorateText() {
        // when we set setColor attribute to true in the XML layout
        if (!getText().toString().isEmpty()) {
            // set the characteristics and the color of the shadow
            setShadowLayer(6, 4, 4, Color.rgb(250, 00, 250));
            setBackgroundColor(Color.CYAN);
        } else {
            setBackgroundColor(Color.RED);
        }
    }
}
