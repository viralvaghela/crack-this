package crc643f46942d9dd1fff9;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsEditTextBase extends EditText implements IGCUserPeer {
    public static final String __md_methods = "n_requestFocus:(ILandroid/graphics/Rect;)Z:GetRequestFocus_ILandroid_graphics_Rect_Handler\n";
    private ArrayList refList;

    private native boolean n_requestFocus(int i, Rect rect);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsEditTextBase, Xamarin.Forms.Platform.Android", FormsEditTextBase.class, __md_methods);
    }

    public FormsEditTextBase(Context context) {
        super(context);
        if (getClass() == FormsEditTextBase.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsEditTextBase, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public FormsEditTextBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == FormsEditTextBase.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsEditTextBase, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public FormsEditTextBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == FormsEditTextBase.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsEditTextBase, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        return n_requestFocus(i, rect);
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