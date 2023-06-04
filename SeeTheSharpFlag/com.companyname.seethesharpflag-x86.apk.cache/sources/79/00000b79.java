package crc643f46942d9dd1fff9;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PickerEditText extends FormsEditTextBase implements IGCUserPeer {
    public static final String __md_methods = "n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\nn_onFocusChanged:(ZILandroid/graphics/Rect;)V:GetOnFocusChanged_ZILandroid_graphics_Rect_Handler\n";
    private ArrayList refList;

    private native void n_onFocusChanged(boolean z, int i, Rect rect);

    private native boolean n_onTouchEvent(MotionEvent motionEvent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.PickerEditText, Xamarin.Forms.Platform.Android", PickerEditText.class, __md_methods);
    }

    public PickerEditText(Context context) {
        super(context);
        if (getClass() == PickerEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PickerEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public PickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == PickerEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PickerEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public PickerEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == PickerEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PickerEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return n_onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        n_onFocusChanged(z, i, rect);
    }

    @Override // crc643f46942d9dd1fff9.FormsEditTextBase, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.FormsEditTextBase, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}