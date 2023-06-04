package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TextCellRenderer_TextCellView extends BaseCellView implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.TextCellRenderer+TextCellView, Xamarin.Forms.Platform.Android", TextCellRenderer_TextCellView.class, "");
    }

    public TextCellRenderer_TextCellView(Context context) {
        super(context);
        if (getClass() == TextCellRenderer_TextCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TextCellRenderer+TextCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public TextCellRenderer_TextCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == TextCellRenderer_TextCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TextCellRenderer+TextCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public TextCellRenderer_TextCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == TextCellRenderer_TextCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TextCellRenderer+TextCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // crc643f46942d9dd1fff9.BaseCellView, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.BaseCellView, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}