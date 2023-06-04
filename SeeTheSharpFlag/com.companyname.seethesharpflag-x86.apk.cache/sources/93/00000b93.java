package crc643f46942d9dd1fff9;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShapeView extends View implements IGCUserPeer {
    public static final String __md_methods = "n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n";
    private ArrayList refList;

    private native void n_onDraw(Canvas canvas);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShapeView, Xamarin.Forms.Platform.Android", ShapeView.class, __md_methods);
    }

    public ShapeView(Context context) {
        super(context);
        if (getClass() == ShapeView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShapeView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public ShapeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == ShapeView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShapeView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public ShapeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == ShapeView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShapeView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        n_onDraw(canvas);
    }

    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}