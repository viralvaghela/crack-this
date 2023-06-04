package crc643f46942d9dd1fff9;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class StructuredItemsViewAdapter_2 extends ItemsViewAdapter_2 implements IGCUserPeer {
    public static final String __md_methods = "n_getItemViewType:(I)I:GetGetItemViewType_IHandler\nn_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\nn_onBindViewHolder:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\n";
    private ArrayList refList;

    private native int n_getItemViewType(int i);

    private native void n_onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    private native RecyclerView.ViewHolder n_onCreateViewHolder(ViewGroup viewGroup, int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.StructuredItemsViewAdapter`2, Xamarin.Forms.Platform.Android", StructuredItemsViewAdapter_2.class, "n_getItemViewType:(I)I:GetGetItemViewType_IHandler\nn_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\nn_onBindViewHolder:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\n");
    }

    public StructuredItemsViewAdapter_2() {
        if (getClass() == StructuredItemsViewAdapter_2.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.StructuredItemsViewAdapter`2, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return n_getItemViewType(i);
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return n_onCreateViewHolder(viewGroup, i);
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        n_onBindViewHolder(viewHolder, i);
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}