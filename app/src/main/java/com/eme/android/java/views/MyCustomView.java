package com.eme.android.java.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.Nullable;

import timber.log.Timber;


@SuppressLint("AppCompatCustomView")
public class MyCustomView extends TextView {

    public MyCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                Timber.d("Action was DOWN");
                return true;
            case (MotionEvent.ACTION_MOVE):
                Timber.d("Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP):
                Timber.d("Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL):
                Timber.d("Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE):
                Timber.d("Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default:
                return super.onTouchEvent(event);
        }
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
