package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public abstract class NongreedySnapHelper extends LinearSnapHelper implements IGCUserPeer {
    public static final String __md_methods = "n_attachToRecyclerView:(Landroidx/recyclerview/widget/RecyclerView;)V:GetAttachToRecyclerView_Landroidx_recyclerview_widget_RecyclerView_Handler\n";
    private ArrayList refList;

    private native void n_attachToRecyclerView(RecyclerView recyclerView);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.NongreedySnapHelper, Xamarin.Forms.Platform.Android", NongreedySnapHelper.class, __md_methods);
    }

    public NongreedySnapHelper() {
        if (getClass() == NongreedySnapHelper.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.NongreedySnapHelper, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        n_attachToRecyclerView(recyclerView);
    }

    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}