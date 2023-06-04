package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SizedItemContentView extends ItemContentView implements IGCUserPeer {
    public static final String __md_methods = "n_onMeasure:(II)V:GetOnMeasure_IIHandler\n";
    private ArrayList refList;

    private native void n_onMeasure(int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.SizedItemContentView, Xamarin.Forms.Platform.Android", SizedItemContentView.class, __md_methods);
    }

    public SizedItemContentView(Context context) {
        super(context);
        if (getClass() == SizedItemContentView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SizedItemContentView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public SizedItemContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == SizedItemContentView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SizedItemContentView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public SizedItemContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == SizedItemContentView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SizedItemContentView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // crc643f46942d9dd1fff9.ItemContentView, android.view.View
    public void onMeasure(int i, int i2) {
        n_onMeasure(i, i2);
    }

    @Override // crc643f46942d9dd1fff9.ItemContentView, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.ItemContentView, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}