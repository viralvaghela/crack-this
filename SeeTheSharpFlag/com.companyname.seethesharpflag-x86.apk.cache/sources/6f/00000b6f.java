package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NongreedySnapHelper_InitialScrollListener extends RecyclerView.OnScrollListener implements IGCUserPeer {
    public static final String __md_methods = "n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n";
    private ArrayList refList;

    private native void n_onScrolled(RecyclerView recyclerView, int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.NongreedySnapHelper+InitialScrollListener, Xamarin.Forms.Platform.Android", NongreedySnapHelper_InitialScrollListener.class, "n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n");
    }

    public NongreedySnapHelper_InitialScrollListener() {
        if (getClass() == NongreedySnapHelper_InitialScrollListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.NongreedySnapHelper+InitialScrollListener, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public NongreedySnapHelper_InitialScrollListener(NongreedySnapHelper nongreedySnapHelper) {
        if (getClass() == NongreedySnapHelper_InitialScrollListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.NongreedySnapHelper+InitialScrollListener, Xamarin.Forms.Platform.Android", "Xamarin.Forms.Platform.Android.NongreedySnapHelper, Xamarin.Forms.Platform.Android", this, new Object[]{nongreedySnapHelper});
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