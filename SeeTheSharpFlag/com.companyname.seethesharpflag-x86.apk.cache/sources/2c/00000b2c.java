package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EditorEditText extends FormsEditText implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.EditorEditText, Xamarin.Forms.Platform.Android", EditorEditText.class, "");
    }

    public EditorEditText(Context context) {
        super(context);
        if (getClass() == EditorEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EditorEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public EditorEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == EditorEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EditorEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public EditorEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == EditorEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EditorEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // crc643f46942d9dd1fff9.FormsEditText, crc643f46942d9dd1fff9.FormsEditTextBase, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.FormsEditText, crc643f46942d9dd1fff9.FormsEditTextBase, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}