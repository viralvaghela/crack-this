package mono.android.widget;

import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ExpandableListView_OnChildClickListenerImplementor implements IGCUserPeer, ExpandableListView.OnChildClickListener {
    public static final String __md_methods = "n_onChildClick:(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z:GetOnChildClick_Landroid_widget_ExpandableListView_Landroid_view_View_IIJHandler:Android.Widget.ExpandableListView/IOnChildClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j);

    static {
        Runtime.register("Android.Widget.ExpandableListView+IOnChildClickListenerImplementor, Mono.Android", ExpandableListView_OnChildClickListenerImplementor.class, __md_methods);
    }

    public ExpandableListView_OnChildClickListenerImplementor() {
        if (getClass() == ExpandableListView_OnChildClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ExpandableListView+IOnChildClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return n_onChildClick(expandableListView, view, i, i2, j);
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