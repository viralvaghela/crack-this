package crc643f46942d9dd1fff9;

import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SingleSnapHelper extends PagerSnapHelper implements IGCUserPeer {
    public static final String __md_methods = "n_findSnapView:(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroid/view/View;:GetFindSnapView_Landroidx_recyclerview_widget_RecyclerView_LayoutManager_Handler\nn_findTargetSnapPosition:(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;II)I:GetFindTargetSnapPosition_Landroidx_recyclerview_widget_RecyclerView_LayoutManager_IIHandler\n";
    private ArrayList refList;

    private native View n_findSnapView(RecyclerView.LayoutManager layoutManager);

    private native int n_findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.SingleSnapHelper, Xamarin.Forms.Platform.Android", SingleSnapHelper.class, __md_methods);
    }

    public SingleSnapHelper() {
        if (getClass() == SingleSnapHelper.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SingleSnapHelper, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return n_findSnapView(layoutManager);
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return n_findTargetSnapPosition(layoutManager, i, i2);
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