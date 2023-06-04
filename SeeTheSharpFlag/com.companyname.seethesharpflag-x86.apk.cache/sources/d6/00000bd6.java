package crc64720bb2db43a66fe9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Platform_ModalContainer extends ViewGroup implements IGCUserPeer {
    public static final String __md_methods = "n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n";
    private ArrayList refList;

    private native void n_onLayout(boolean z, int i, int i2, int i3, int i4);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.AppCompat.Platform+ModalContainer, Xamarin.Forms.Platform.Android", Platform_ModalContainer.class, "n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n");
    }

    public Platform_ModalContainer(Context context) {
        super(context);
        if (getClass() == Platform_ModalContainer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.Platform+ModalContainer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public Platform_ModalContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == Platform_ModalContainer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.Platform+ModalContainer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public Platform_ModalContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == Platform_ModalContainer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.Platform+ModalContainer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n_onLayout(z, i, i2, i3, i4);
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