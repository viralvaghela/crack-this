package crc6414252951f3f66c67;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RecyclerViewScrollListener_2 extends RecyclerView.OnScrollListener implements IGCUserPeer {
    public static final String __md_methods = "n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n";
    private ArrayList refList;

    private native void n_onScrolled(RecyclerView recyclerView, int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CollectionView.RecyclerViewScrollListener`2, Xamarin.Forms.Platform.Android", RecyclerViewScrollListener_2.class, "n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n");
    }

    public RecyclerViewScrollListener_2() {
        if (getClass() == RecyclerViewScrollListener_2.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CollectionView.RecyclerViewScrollListener`2, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        n_onScrolled(recyclerView, i, i2);
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