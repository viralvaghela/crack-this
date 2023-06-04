package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsSeekBar extends SeekBar implements IGCUserPeer {
    public static final String __md_methods = "n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\nn_isPressed:()Z:GetIsPressedHandler\nn_setPressed:(Z)V:GetSetPressed_ZHandler\n";
    private ArrayList refList;

    private native boolean n_isPressed();

    private native boolean n_onTouchEvent(MotionEvent motionEvent);

    private native void n_setPressed(boolean z);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsSeekBar, Xamarin.Forms.Platform.Android", FormsSeekBar.class, __md_methods);
    }

    public FormsSeekBar(Context context) {
        super(context);
        if (getClass() == FormsSeekBar.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsSeekBar, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public FormsSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == FormsSeekBar.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsSeekBar, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public FormsSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == FormsSeekBar.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsSeekBar, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return n_onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean isPressed() {
        return n_isPressed();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        n_setPressed(z);
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