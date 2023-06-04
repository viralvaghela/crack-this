package crc643f46942d9dd1fff9;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TextViewHolder extends SelectableViewHolder implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.TextViewHolder, Xamarin.Forms.Platform.Android", TextViewHolder.class, "");
    }

    public TextViewHolder(View view) {
        super(view);
        if (getClass() == TextViewHolder.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TextViewHolder, Xamarin.Forms.Platform.Android", "Android.Views.View, Mono.Android", this, new Object[]{view});
        }
    }

    @Override // crc643f46942d9dd1fff9.SelectableViewHolder, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.SelectableViewHolder, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}