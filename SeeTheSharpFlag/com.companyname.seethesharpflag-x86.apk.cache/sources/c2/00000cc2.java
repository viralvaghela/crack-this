package mono.android.widget;

import android.view.MenuItem;
import android.widget.ActionMenuView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionMenuView_OnMenuItemClickListenerImplementor implements IGCUserPeer, ActionMenuView.OnMenuItemClickListener {
    public static final String __md_methods = "n_onMenuItemClick:(Landroid/view/MenuItem;)Z:GetOnMenuItemClick_Landroid_view_MenuItem_Handler:Android.Widget.ActionMenuView/IOnMenuItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onMenuItemClick(MenuItem menuItem);

    static {
        Runtime.register("Android.Widget.ActionMenuView+IOnMenuItemClickListenerImplementor, Mono.Android", ActionMenuView_OnMenuItemClickListenerImplementor.class, __md_methods);
    }

    public ActionMenuView_OnMenuItemClickListenerImplementor() {
        if (getClass() == ActionMenuView_OnMenuItemClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ActionMenuView+IOnMenuItemClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.ActionMenuView.OnMenuItemClickListener
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