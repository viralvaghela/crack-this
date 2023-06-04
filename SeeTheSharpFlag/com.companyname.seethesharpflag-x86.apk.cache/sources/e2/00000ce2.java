package mono.android.widget;

import android.view.MenuItem;
import android.widget.Toolbar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Toolbar_OnMenuItemClickListenerImplementor implements IGCUserPeer, Toolbar.OnMenuItemClickListener {
    public static final String __md_methods = "n_onMenuItemClick:(Landroid/view/MenuItem;)Z:GetOnMenuItemClick_Landroid_view_MenuItem_Handler:Android.Widget.Toolbar/IOnMenuItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onMenuItemClick(MenuItem menuItem);

    static {
        Runtime.register("Android.Widget.Toolbar+IOnMenuItemClickListenerImplementor, Mono.Android", Toolbar_OnMenuItemClickListenerImplementor.class, __md_methods);
    }

    public Toolbar_OnMenuItemClickListenerImplementor() {
        if (getClass() == Toolbar_OnMenuItemClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.Toolbar+IOnMenuItemClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return n_onMenuItemClick(menuItem);
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