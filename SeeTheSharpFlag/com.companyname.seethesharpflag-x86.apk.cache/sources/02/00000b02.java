package com.xamarin.forms.platform.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class FormsViewGroup extends ViewGroup {
    boolean inputTransparent;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public FormsViewGroup(Context context) {
        super(context);
    }

    public FormsViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FormsViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void measureAndLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        measure(i, i2);
        layout(i3, i4, i5, i6);
    }

    protected void setInputTransparent(boolean z) {
        this.inputTransparent = z;
    }

    protected boolean getInputTransparent() {
        return this.inputTransparent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.inputTransparent) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.inputTransparent) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void sendBatchUpdate(float f, float f2, int i, boolean z, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        setPivotX(f);
        setPivotY(f2);
        if (getVisibility() != i) {
            setVisibility(i);
        }
        if (isEnabled() != z) {
            setEnabled(z);
        }
        setAlpha(f3);
        setRotation(f4);
        setRotationX(f5);
        setRotationY(f6);
        setScaleX(f7);
        setScaleY(f8);
        setTranslationX(f9);
        setTranslationY(f10);
    }

    public static void sendViewBatchUpdate(View view, float f, float f2, int i, boolean z, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        view.setPivotX(f);
        view.setPivotY(f2);
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
        if (view.isEnabled() != z) {
            view.setEnabled(z);
        }
        view.setAlpha(f3);
        view.setRotation(f4);
        view.setRotationX(f5);
        view.setRotationY(f6);
        view.setScaleX(f7);
        view.setScaleY(f8);
        view.setTranslationX(f9);
        view.setTranslationY(f10);
    }
}