package crc643f46942d9dd1fff9;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EndSingleSnapHelper extends SingleSnapHelper implements IGCUserPeer {
    public static final String __md_methods = "n_calculateDistanceToFinalSnap:(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)[I:GetCalculateDistanceToFinalSnap_Landroidx_recyclerview_widget_RecyclerView_LayoutManager_Landroid_view_View_Handler\n";
    private ArrayList refList;

    private native int[] n_calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.EndSingleSnapHelper, Xamarin.Forms.Platform.Android", EndSingleSnapHelper.class, "n_calculateDistanceToFinalSnap:(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)[I:GetCalculateDistanceToFinalSnap_Landroidx_recyclerview_widget_RecyclerView_LayoutManager_Landroid_view_View_Handler\n");
    }

    public EndSingleSnapHelper() {
        if (getClass() == EndSingleSnapHelper.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EndSingleSnapHelper, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        return n_calculateDistanceToFinalSnap(layoutManager, view);
    }

    @Override // crc643f46942d9dd1fff9.SingleSnapHelper, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.SingleSnapHelper, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}