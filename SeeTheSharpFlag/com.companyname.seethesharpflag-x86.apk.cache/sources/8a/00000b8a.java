package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ScrollHelper extends RecyclerView.OnScrollListener implements IGCUserPeer {
    public static final String __md_methods = "n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n";
    private ArrayList refList;

    private native void n_onScrolled(RecyclerView recyclerView, int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ScrollHelper, Xamarin.Forms.Platform.Android", ScrollHelper.class, "n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n");
    }

    public ScrollHelper() {
        if (getClass() == ScrollHelper.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ScrollHelper, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public ScrollHelper(RecyclerView recyclerView) {
        if (getClass() == ScrollHelper.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ScrollHelper, Xamarin.Forms.Platform.Android", "AndroidX.RecyclerView.Widget.RecyclerView, Xamarin.AndroidX.RecyclerView", this, new Object[]{recyclerView});
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