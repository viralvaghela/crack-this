package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C0492R;

/* loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0492R.styleable.TabItem);
        this.text = obtainStyledAttributes.getText(C0492R.styleable.TabItem_android_text);
        this.icon = obtainStyledAttributes.getDrawable(C0492R.styleable.TabItem_android_icon);
        this.customLayout = obtainStyledAttributes.getResourceId(C0492R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}