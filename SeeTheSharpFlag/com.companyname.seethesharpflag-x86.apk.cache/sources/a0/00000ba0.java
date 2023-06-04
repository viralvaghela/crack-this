package crc643f46942d9dd1fff9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellRenderer_SplitDrawable extends Drawable implements IGCUserPeer {
    public static final String __md_methods = "n_getOpacity:()I:GetGetOpacityHandler\nn_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\nn_setAlpha:(I)V:GetSetAlpha_IHandler\nn_setColorFilter:(Landroid/graphics/ColorFilter;)V:GetSetColorFilter_Landroid_graphics_ColorFilter_Handler\n";
    private ArrayList refList;

    private native void n_draw(Canvas canvas);

    private native int n_getOpacity();

    private native void n_setAlpha(int i);

    private native void n_setColorFilter(ColorFilter colorFilter);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellRenderer+SplitDrawable, Xamarin.Forms.Platform.Android", ShellRenderer_SplitDrawable.class, __md_methods);
    }

    public ShellRenderer_SplitDrawable() {
        if (getClass() == ShellRenderer_SplitDrawable.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellRenderer+SplitDrawable, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return n_getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        n_draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        n_setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        n_setColorFilter(colorFilter);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}