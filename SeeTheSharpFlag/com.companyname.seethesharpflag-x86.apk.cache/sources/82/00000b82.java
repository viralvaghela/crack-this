package crc643f46942d9dd1fff9;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PositionalSmoothScroller extends LinearSmoothScroller implements IGCUserPeer {
    public static final String __md_methods = "n_getVerticalSnapPreference:()I:GetGetVerticalSnapPreferenceHandler\nn_getHorizontalSnapPreference:()I:GetGetHorizontalSnapPreferenceHandler\nn_calculateDtToFit:(IIIII)I:GetCalculateDtToFit_IIIIIHandler\n";
    private ArrayList refList;

    private native int n_calculateDtToFit(int i, int i2, int i3, int i4, int i5);

    private native int n_getHorizontalSnapPreference();

    private native int n_getVerticalSnapPreference();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.PositionalSmoothScroller, Xamarin.Forms.Platform.Android", PositionalSmoothScroller.class, __md_methods);
    }

    public PositionalSmoothScroller(Context context) {
        super(context);
        if (getClass() == PositionalSmoothScroller.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PositionalSmoothScroller, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        return n_getVerticalSnapPreference();
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getHorizontalSnapPreference() {
        return n_getHorizontalSnapPreference();
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        return n_calculateDtToFit(i, i2, i3, i4, i5);
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