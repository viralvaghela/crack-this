package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsImageView extends ImageView implements IGCUserPeer {
    public static final String __md_methods = "n_invalidate:()V:GetInvalidateHandler\n";
    private ArrayList refList;

    private native void n_invalidate();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsImageView, Xamarin.Forms.Platform.Android", FormsImageView.class, __md_methods);
    }

    public FormsImageView(Context context) {
        super(context);
        if (getClass() == FormsImageView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsImageView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public FormsImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == FormsImageView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsImageView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public FormsImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == FormsImageView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsImageView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.view.View
    public void invalidate() {
        n_invalidate();
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