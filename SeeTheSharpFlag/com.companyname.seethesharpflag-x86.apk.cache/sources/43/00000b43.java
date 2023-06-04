package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsEditText extends FormsEditTextBase implements IGCUserPeer {
    public static final String __md_methods = "n_onKeyPreIme:(ILandroid/view/KeyEvent;)Z:GetOnKeyPreIme_ILandroid_view_KeyEvent_Handler\nn_onSelectionChanged:(II)V:GetOnSelectionChanged_IIHandler\n";
    private ArrayList refList;

    private native boolean n_onKeyPreIme(int i, KeyEvent keyEvent);

    private native void n_onSelectionChanged(int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsEditText, Xamarin.Forms.Platform.Android", FormsEditText.class, __md_methods);
    }

    public FormsEditText(Context context) {
        super(context);
        if (getClass() == FormsEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public FormsEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == FormsEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public FormsEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == FormsEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return n_onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        n_onSelectionChanged(i, i2);
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