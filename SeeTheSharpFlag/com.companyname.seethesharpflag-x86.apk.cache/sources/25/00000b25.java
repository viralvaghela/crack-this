package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CustomFrameLayout extends FrameLayout implements IGCUserPeer {
    public static final String __md_methods = "n_onApplyWindowInsets:(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;:GetOnApplyWindowInsets_Landroid_view_WindowInsets_Handler\n";
    private ArrayList refList;

    private native WindowInsets n_onApplyWindowInsets(WindowInsets windowInsets);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CustomFrameLayout, Xamarin.Forms.Platform.Android", CustomFrameLayout.class, __md_methods);
    }

    public CustomFrameLayout(Context context) {
        super(context);
        if (getClass() == CustomFrameLayout.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CustomFrameLayout, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public CustomFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == CustomFrameLayout.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CustomFrameLayout, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public CustomFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == CustomFrameLayout.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CustomFrameLayout, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public CustomFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (getClass() == CustomFrameLayout.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CustomFrameLayout, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return n_onApplyWindowInsets(windowInsets);
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