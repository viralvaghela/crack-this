package mono.android.widget;

import android.widget.ExpandableListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ExpandableListView_OnGroupCollapseListenerImplementor implements IGCUserPeer, ExpandableListView.OnGroupCollapseListener {
    public static final String __md_methods = "n_onGroupCollapse:(I)V:GetOnGroupCollapse_IHandler:Android.Widget.ExpandableListView/IOnGroupCollapseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGroupCollapse(int i);

    static {
        Runtime.register("Android.Widget.ExpandableListView+IOnGroupCollapseListenerImplementor, Mono.Android", ExpandableListView_OnGroupCollapseListenerImplementor.class, __md_methods);
    }

    public ExpandableListView_OnGroupCollapseListenerImplementor() {
        if (getClass() == ExpandableListView_OnGroupCollapseListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ExpandableListView+IOnGroupCollapseListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public void onGroupCollapse(int i) {
        n_onGroupCollapse(i);
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