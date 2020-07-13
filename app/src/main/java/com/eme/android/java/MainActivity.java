package com.eme.android.java;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private static final String TAG = "MainActivity";
    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLog();

        mDetector = new GestureDetectorCompat(this, this);
        mDetector.setOnDoubleTapListener(this);
    }

    private void initLog() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Timber.d("onDown() called with: e = [" + e + "]");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Timber.d("onShowPress() called with: e = [" + e + "]");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Timber.d("onSingleTapUp() called with: e = [" + e + "]");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Timber.d("onScroll() called with: e1 = [" + e1 + "], e2 = [" + e2 + "], distanceX = [" + distanceX + "], distanceY = [" + distanceY + "]");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Timber.d("onLongPress() called with: e = [" + e + "]");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Timber.d("onFling() called with: e1 = [" + e1 + "], e2 = [" + e2 + "], velocityX = [" + velocityX + "], velocityY = [" + velocityY + "]");
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Timber.d("onSingleTapConfirmed() called with: e = [" + e + "]");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Timber.d("onDoubleTap() called with: e = [" + e + "]");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Timber.d("onDoubleTapEvent() called with: e = [" + e + "]");
        return false;
    }
}