package mono.android.widget;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AdapterView_OnItemClickListenerImplementor implements IGCUserPeer, AdapterView.OnItemClickListener {
    public static final String __md_methods = "n_onItemClick:(Landroid/widget/AdapterView;Landroid/view/View;IJ)V:GetOnItemClick_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onItemClick(AdapterView adapterView, View view, int i, long j);

    static {
        Runtime.register("Android.Widget.AdapterView+IOnItemClickListenerImplementor, Mono.Android", AdapterView_OnItemClickListenerImplementor.class, __md_methods);
    }

    public AdapterView_OnItemClickListenerImplementor() {
        if (getClass() == AdapterView_OnItemClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AdapterView+IOnItemClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        n_onItemClick(adapterView, view, i, j);
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