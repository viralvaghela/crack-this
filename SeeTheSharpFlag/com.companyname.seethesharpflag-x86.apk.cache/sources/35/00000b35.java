package crc643f46942d9dd1fff9;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EntryCellEditText extends EditText implements IGCUserPeer {
    public static final String __md_methods = "n_onKeyPreIme:(ILandroid/view/KeyEvent;)Z:GetOnKeyPreIme_ILandroid_view_KeyEvent_Handler\nn_onFocusChanged:(ZILandroid/graphics/Rect;)V:GetOnFocusChanged_ZILandroid_graphics_Rect_Handler\n";
    private ArrayList refList;

    private native void n_onFocusChanged(boolean z, int i, Rect rect);

    private native boolean n_onKeyPreIme(int i, KeyEvent keyEvent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.EntryCellEditText, Xamarin.Forms.Platform.Android", EntryCellEditText.class, __md_methods);
    }

    public EntryCellEditText(Context context) {
        super(context);
        if (getClass() == EntryCellEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryCellEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public EntryCellEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == EntryCellEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryCellEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public EntryCellEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == EntryCellEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryCellEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return n_onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        n_onFocusChanged(z, i, rect);
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