package crc643f46942d9dd1fff9;

import android.content.Context;
import android.graphics.Canvas;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellToolbarTracker_FlyoutIconDrawerDrawable extends DrawerArrowDrawable implements IGCUserPeer {
    public static final String __md_methods = "n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n";
    private ArrayList refList;

    private native void n_draw(Canvas canvas);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellToolbarTracker+FlyoutIconDrawerDrawable, Xamarin.Forms.Platform.Android", ShellToolbarTracker_FlyoutIconDrawerDrawable.class, "n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n");
    }

    public ShellToolbarTracker_FlyoutIconDrawerDrawable(Context context) {
        super(context);
        if (getClass() == ShellToolbarTracker_FlyoutIconDrawerDrawable.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellToolbarTracker+FlyoutIconDrawerDrawable, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawerArrowDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        n_draw(canvas);
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