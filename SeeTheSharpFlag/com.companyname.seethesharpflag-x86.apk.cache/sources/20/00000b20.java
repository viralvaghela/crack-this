package crc643f46942d9dd1fff9;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CircularProgress extends ProgressBar implements IGCUserPeer {
    public static final String __md_methods = "n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\nn_layout:(IIII)V:GetLayout_IIIIHandler\n";
    private ArrayList refList;

    private native void n_draw(Canvas canvas);

    private native void n_layout(int i, int i2, int i3, int i4);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CircularProgress, Xamarin.Forms.Platform.Android", CircularProgress.class, __md_methods);
    }

    public CircularProgress(Context context) {
        super(context);
        if (getClass() == CircularProgress.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CircularProgress, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public CircularProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == CircularProgress.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CircularProgress, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public CircularProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == CircularProgress.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CircularProgress, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        n_draw(canvas);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        n_layout(i, i2, i3, i4);
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