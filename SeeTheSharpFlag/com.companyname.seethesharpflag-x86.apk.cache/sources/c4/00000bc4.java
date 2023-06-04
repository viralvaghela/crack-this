package crc643f46942d9dd1fff9;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xamarin.forms.platform.android.FormsViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public abstract class VisualElementRenderer_1 extends FormsViewGroup implements IGCUserPeer {
    public static final String __md_methods = "n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\nn_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\nn_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\nn_focusSearch:(Landroid/view/View;I)Landroid/view/View;:GetFocusSearch_Landroid_view_View_IHandler\nn_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\nn_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\nn_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\nn_onMeasure:(II)V:GetOnMeasure_IIHandler\n";
    private ArrayList refList;

    private native boolean n_dispatchTouchEvent(MotionEvent motionEvent);

    private native void n_draw(Canvas canvas);

    private native View n_focusSearch(View view, int i);

    private native void n_onConfigurationChanged(Configuration configuration);

    private native boolean n_onInterceptTouchEvent(MotionEvent motionEvent);

    private native void n_onLayout(boolean z, int i, int i2, int i3, int i4);

    private native void n_onMeasure(int i, int i2);

    private native boolean n_onTouchEvent(MotionEvent motionEvent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.VisualElementRenderer`1, Xamarin.Forms.Platform.Android", VisualElementRenderer_1.class, __md_methods);
    }

    public VisualElementRenderer_1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == VisualElementRenderer_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.VisualElementRenderer`1, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public VisualElementRenderer_1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == VisualElementRenderer_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.VisualElementRenderer`1, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public VisualElementRenderer_1(Context context) {
        super(context);
        if (getClass() == VisualElementRenderer_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.VisualElementRenderer`1, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // com.xamarin.forms.platform.android.FormsViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return n_onTouchEvent(motionEvent);
    }

    @Override // com.xamarin.forms.platform.android.FormsViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return n_onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return n_dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        return n_focusSearch(view, i);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        n_onConfigurationChanged(configuration);
    }

    @Override // com.xamarin.forms.platform.android.FormsViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n_onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        n_draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        n_onMeasure(i, i2);
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