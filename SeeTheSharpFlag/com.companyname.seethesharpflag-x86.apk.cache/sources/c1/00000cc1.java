package mono.android.widget;

import android.view.View;
import android.widget.AbsListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AbsListView_RecyclerListenerImplementor implements IGCUserPeer, AbsListView.RecyclerListener {
    public static final String __md_methods = "n_onMovedToScrapHeap:(Landroid/view/View;)V:GetOnMovedToScrapHeap_Landroid_view_View_Handler:Android.Widget.AbsListView/IRecyclerListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onMovedToScrapHeap(View view);

    static {
        Runtime.register("Android.Widget.AbsListView+IRecyclerListenerImplementor, Mono.Android", AbsListView_RecyclerListenerImplementor.class, __md_methods);
    }

    public AbsListView_RecyclerListenerImplementor() {
        if (getClass() == AbsListView_RecyclerListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AbsListView+IRecyclerListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public void onMovedToScrapHeap(View view) {
        n_onMovedToScrapHeap(view);
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