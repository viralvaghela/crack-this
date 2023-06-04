package crc6414252951f3f66c67;

import androidx.recyclerview.widget.RecyclerView;
import crc643f46942d9dd1fff9.ItemsViewAdapter_2;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CarouselViewAdapter_2 extends ItemsViewAdapter_2 implements IGCUserPeer {
    public static final String __md_methods = "n_getItemCount:()I:GetGetItemCountHandler\nn_onBindViewHolder:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\n";
    private ArrayList refList;

    private native int n_getItemCount();

    private native void n_onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CollectionView.CarouselViewAdapter`2, Xamarin.Forms.Platform.Android", CarouselViewAdapter_2.class, __md_methods);
    }

    public CarouselViewAdapter_2() {
        if (getClass() == CarouselViewAdapter_2.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CollectionView.CarouselViewAdapter`2, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // crc643f46942d9dd1fff9.ItemsViewAdapter_2, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return n_getItemCount();
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