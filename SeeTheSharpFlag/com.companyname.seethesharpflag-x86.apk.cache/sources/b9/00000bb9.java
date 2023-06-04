package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TableViewRenderer extends ViewRenderer_2 implements IGCUserPeer {
    public static final String __md_methods = "n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n";
    private ArrayList refList;

    private native void n_onAttachedToWindow();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.TableViewRenderer, Xamarin.Forms.Platform.Android", TableViewRenderer.class, "n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n");
    }

    public TableViewRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == TableViewRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TableViewRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public TableViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == TableViewRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TableViewRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public TableViewRenderer(Context context) {
        super(context);
        if (getClass() == TableViewRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TableViewRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        n_onAttachedToWindow();
    }

    @Override // crc643f46942d9dd1fff9.ViewRenderer_2, crc643f46942d9dd1fff9.VisualElementRenderer_1, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.ViewRenderer_2, crc643f46942d9dd1fff9.VisualElementRenderer_1, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}