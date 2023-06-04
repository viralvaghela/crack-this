package mono.android.widget;

import android.widget.ExpandableListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ExpandableListView_OnGroupExpandListenerImplementor implements IGCUserPeer, ExpandableListView.OnGroupExpandListener {
    public static final String __md_methods = "n_onGroupExpand:(I)V:GetOnGroupExpand_IHandler:Android.Widget.ExpandableListView/IOnGroupExpandListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGroupExpand(int i);

    static {
        Runtime.register("Android.Widget.ExpandableListView+IOnGroupExpandListenerImplementor, Mono.Android", ExpandableListView_OnGroupExpandListenerImplementor.class, __md_methods);
    }

    public ExpandableListView_OnGroupExpandListenerImplementor() {
        if (getClass() == ExpandableListView_OnGroupExpandListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ExpandableListView+IOnGroupExpandListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public void onGroupExpand(int i) {
        n_onGroupExpand(i);
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