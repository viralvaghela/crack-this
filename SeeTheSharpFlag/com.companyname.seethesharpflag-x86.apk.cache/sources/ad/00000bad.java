package crc643f46942d9dd1fff9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SpacingItemDecoration extends RecyclerView.ItemDecoration implements IGCUserPeer {
    public static final String __md_methods = "n_getItemOffsets:(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V:GetGetItemOffsets_Landroid_graphics_Rect_Landroid_view_View_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n";
    private ArrayList refList;

    private native void n_getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.SpacingItemDecoration, Xamarin.Forms.Platform.Android", SpacingItemDecoration.class, "n_getItemOffsets:(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V:GetGetItemOffsets_Landroid_graphics_Rect_Landroid_view_View_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n");
    }

    public SpacingItemDecoration() {
        if (getClass() == SpacingItemDecoration.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SpacingItemDecoration, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        n_getItemOffsets(rect, view, recyclerView, state);
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