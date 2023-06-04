package mono.android.view;

import android.view.MenuItem;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MenuItem_OnActionExpandListenerImplementor implements IGCUserPeer, MenuItem.OnActionExpandListener {
    public static final String __md_methods = "n_onMenuItemActionCollapse:(Landroid/view/MenuItem;)Z:GetOnMenuItemActionCollapse_Landroid_view_MenuItem_Handler:Android.Views.IMenuItemOnActionExpandListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onMenuItemActionExpand:(Landroid/view/MenuItem;)Z:GetOnMenuItemActionExpand_Landroid_view_MenuItem_Handler:Android.Views.IMenuItemOnActionExpandListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onMenuItemActionCollapse(MenuItem menuItem);

    private native boolean n_onMenuItemActionExpand(MenuItem menuItem);

    static {
        Runtime.register("Android.Views.IMenuItemOnActionExpandListenerImplementor, Mono.Android", MenuItem_OnActionExpandListenerImplementor.class, __md_methods);
    }

    public MenuItem_OnActionExpandListenerImplementor() {
        if (getClass() == MenuItem_OnActionExpandListenerImplementor.class) {
            TypeManager.Activate("Android.Views.IMenuItemOnActionExpandListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return n_onMenuItemActionCollapse(menuItem);
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return n_onMenuItemActionExpand(menuItem);
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