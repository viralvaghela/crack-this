package mono.android.widget;

import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ExpandableListView_OnGroupClickListenerImplementor implements IGCUserPeer, ExpandableListView.OnGroupClickListener {
    public static final String __md_methods = "n_onGroupClick:(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z:GetOnGroupClick_Landroid_widget_ExpandableListView_Landroid_view_View_IJHandler:Android.Widget.ExpandableListView/IOnGroupClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onGroupClick(ExpandableListView expandableListView, View view, int i, long j);

    static {
        Runtime.register("Android.Widget.ExpandableListView+IOnGroupClickListenerImplementor, Mono.Android", ExpandableListView_OnGroupClickListenerImplementor.class, __md_methods);
    }

    public ExpandableListView_OnGroupClickListenerImplementor() {
        if (getClass() == ExpandableListView_OnGroupClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ExpandableListView+IOnGroupClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        return n_onGroupClick(expandableListView, view, i, j);
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