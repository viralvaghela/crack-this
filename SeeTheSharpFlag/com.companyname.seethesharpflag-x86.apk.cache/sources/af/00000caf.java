package mono.android.view;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnLongClickListenerImplementor implements IGCUserPeer, View.OnLongClickListener {
    public static final String __md_methods = "n_onLongClick:(Landroid/view/View;)Z:GetOnLongClick_Landroid_view_View_Handler:Android.Views.View/IOnLongClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onLongClick(View view);

    static {
        Runtime.register("Android.Views.View+IOnLongClickListenerImplementor, Mono.Android", View_OnLongClickListenerImplementor.class, __md_methods);
    }

    public View_OnLongClickListenerImplementor() {
        if (getClass() == View_OnLongClickListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnLongClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return n_onLongClick(view);
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