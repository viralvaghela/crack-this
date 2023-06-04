package crc64ee486da937c010f4;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FrameRenderer extends CardView implements IGCUserPeer {
    public static final String __md_methods = "n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\nn_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\nn_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\nn_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n";
    private ArrayList refList;

    private native void n_draw(Canvas canvas);

    private native void n_onLayout(boolean z, int i, int i2, int i3, int i4);

    private native void n_onSizeChanged(int i, int i2, int i3, int i4);

    private native boolean n_onTouchEvent(MotionEvent motionEvent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FastRenderers.FrameRenderer, Xamarin.Forms.Platform.Android", FrameRenderer.class, __md_methods);
    }

    public FrameRenderer(Context context) {
        super(context);
        if (getClass() == FrameRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FastRenderers.FrameRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public FrameRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == FrameRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FastRenderers.FrameRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public FrameRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == FrameRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FastRenderers.FrameRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n_onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        n_draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return n_onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        n_onSizeChanged(i, i2, i3, i4);
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