package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SelectableItemsViewAdapter_2 extends StructuredItemsViewAdapter_2 implements IGCUserPeer {
    public static final String __md_methods = "n_onBindViewHolder:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\nn_onViewRecycled:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V:GetOnViewRecycled_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n";
    private ArrayList refList;

    private native void n_onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    private native void n_onViewRecycled(RecyclerView.ViewHolder viewHolder);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.SelectableItemsViewAdapter`2, Xamarin.Forms.Platform.Android", SelectableItemsViewAdapter_2.class, __md_methods);
    }

    public SelectableItemsViewAdapter_2() {
        if (getClass() == SelectableItemsViewAdapter_2.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SelectableItemsViewAdapter`2, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // crc643f46942d9dd1fff9.StructuredItemsViewAdapter_2, crc643f46942d9dd1fff9.ItemsViewAdapter_2, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        n_onBindViewHolder(viewHolder, i);
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        n_onViewRecycled(viewHolder);
    }

    @Override // crc643f46942d9dd1fff9.StructuredItemsViewAdapter_2, crc643f46942d9dd1fff9.ItemsViewAdapter_2, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.StructuredItemsViewAdapter_2, crc643f46942d9dd1fff9.ItemsViewAdapter_2, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}