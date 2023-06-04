package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus extends LinearLayout implements IGCUserPeer {
    public static final String __md_methods = "n_focusSearch:(I)Landroid/view/View;:GetFocusSearch_IHandler\n";
    private ArrayList refList;

    private native View n_focusSearch(int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellFlyoutRecyclerAdapter+LinearLayoutWithFocus, Xamarin.Forms.Platform.Android", ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus.class, __md_methods);
    }

    public ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus(Context context) {
        super(context);
        if (getClass() == ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellFlyoutRecyclerAdapter+LinearLayoutWithFocus, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellFlyoutRecyclerAdapter+LinearLayoutWithFocus, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == ShellFlyoutRecyclerAdapter_LinearLayoutWithFocus.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellFlyoutRecyclerAdapter+LinearLayoutWithFocus, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.view.View
    public View focusSearch(int i) {
        return n_focusSearch(i);
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