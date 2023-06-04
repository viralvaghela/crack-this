package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ScrollLayoutManager extends LinearLayoutManager implements IGCUserPeer {
    public static final String __md_methods = "n_canScrollVertically:()Z:GetCanScrollVerticallyHandler\n";
    private ArrayList refList;

    private native boolean n_canScrollVertically();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ScrollLayoutManager, Xamarin.Forms.Platform.Android", ScrollLayoutManager.class, __md_methods);
    }

    public ScrollLayoutManager(Context context) {
        super(context);
        if (getClass() == ScrollLayoutManager.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ScrollLayoutManager, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public ScrollLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (getClass() == ScrollLayoutManager.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ScrollLayoutManager, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    public ScrollLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        if (getClass() == ScrollLayoutManager.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ScrollLayoutManager, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:System.Boolean, mscorlib", this, new Object[]{context, Integer.valueOf(i), Boolean.valueOf(z)});
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return n_canScrollVertically();
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