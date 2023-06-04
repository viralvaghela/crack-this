package crc64720bb2db43a66fe9;

import android.content.Context;
import android.util.AttributeSet;
import crc643f46942d9dd1fff9.FlyoutPageRenderer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MasterDetailPageRenderer extends FlyoutPageRenderer implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android", MasterDetailPageRenderer.class, "");
    }

    public MasterDetailPageRenderer(Context context) {
        super(context);
        if (getClass() == MasterDetailPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public MasterDetailPageRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == MasterDetailPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public MasterDetailPageRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == MasterDetailPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // crc643f46942d9dd1fff9.FlyoutPageRenderer, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.FlyoutPageRenderer, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}