package mono.androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RecyclerView_RecyclerListenerImplementor implements IGCUserPeer, RecyclerView.RecyclerListener {
    public static final String __md_methods = "n_onViewRecycled:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V:GetOnViewRecycled_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler:AndroidX.RecyclerView.Widget.RecyclerView/IRecyclerListenerInvoker, Xamarin.AndroidX.RecyclerView\n";
    private ArrayList refList;

    private native void n_onViewRecycled(RecyclerView.ViewHolder viewHolder);

    static {
        Runtime.register("AndroidX.RecyclerView.Widget.RecyclerView+IRecyclerListenerImplementor, Xamarin.AndroidX.RecyclerView", RecyclerView_RecyclerListenerImplementor.class, __md_methods);
    }

    public RecyclerView_RecyclerListenerImplementor() {
        if (getClass() == RecyclerView_RecyclerListenerImplementor.class) {
            TypeManager.Activate("AndroidX.RecyclerView.Widget.RecyclerView+IRecyclerListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        n_onViewRecycled(viewHolder);
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