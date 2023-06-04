package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GridLayoutSpanSizeLookup extends GridLayoutManager.SpanSizeLookup implements IGCUserPeer {
    public static final String __md_methods = "n_getSpanSize:(I)I:GetGetSpanSize_IHandler\n";
    private ArrayList refList;

    private native int n_getSpanSize(int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.GridLayoutSpanSizeLookup, Xamarin.Forms.Platform.Android", GridLayoutSpanSizeLookup.class, __md_methods);
    }

    public GridLayoutSpanSizeLookup() {
        if (getClass() == GridLayoutSpanSizeLookup.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.GridLayoutSpanSizeLookup, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanSize(int i) {
        return n_getSpanSize(i);
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