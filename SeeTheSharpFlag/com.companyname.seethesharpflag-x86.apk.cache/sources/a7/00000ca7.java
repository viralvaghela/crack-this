package mono.android.view;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnContextClickListenerImplementor implements IGCUserPeer, View.OnContextClickListener {
    public static final String __md_methods = "n_onContextClick:(Landroid/view/View;)Z:GetOnContextClick_Landroid_view_View_Handler:Android.Views.View/IOnContextClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onContextClick(View view);

    static {
        Runtime.register("Android.Views.View+IOnContextClickListenerImplementor, Mono.Android", View_OnContextClickListenerImplementor.class, __md_methods);
    }

    public View_OnContextClickListenerImplementor() {
        if (getClass() == View_OnContextClickListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnContextClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnContextClickListener
    public boolean onContextClick(View view) {
        return n_onContextClick(view);
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