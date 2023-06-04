package crc643f46942d9dd1fff9;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellFlyoutRecyclerAdapter_ElementViewHolder extends RecyclerView.ViewHolder implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellFlyoutRecyclerAdapter+ElementViewHolder, Xamarin.Forms.Platform.Android", ShellFlyoutRecyclerAdapter_ElementViewHolder.class, "");
    }

    public ShellFlyoutRecyclerAdapter_ElementViewHolder(View view) {
        super(view);
        if (getClass() == ShellFlyoutRecyclerAdapter_ElementViewHolder.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellFlyoutRecyclerAdapter+ElementViewHolder, Xamarin.Forms.Platform.Android", "Android.Views.View, Mono.Android", this, new Object[]{view});
        }
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