package mono.android.widget;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AdapterView_OnItemLongClickListenerImplementor implements IGCUserPeer, AdapterView.OnItemLongClickListener {
    public static final String __md_methods = "n_onItemLongClick:(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z:GetOnItemLongClick_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemLongClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onItemLongClick(AdapterView adapterView, View view, int i, long j);

    static {
        Runtime.register("Android.Widget.AdapterView+IOnItemLongClickListenerImplementor, Mono.Android", AdapterView_OnItemLongClickListenerImplementor.class, __md_methods);
    }

    public AdapterView_OnItemLongClickListenerImplementor() {
        if (getClass() == AdapterView_OnItemLongClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AdapterView+IOnItemLongClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        return n_onItemLongClick(adapterView, view, i, j);
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