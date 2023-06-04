package mono.android.app;

import android.app.ActionBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionBar_OnNavigationListenerImplementor implements IGCUserPeer, ActionBar.OnNavigationListener {
    public static final String __md_methods = "n_onNavigationItemSelected:(IJ)Z:GetOnNavigationItemSelected_IJHandler:Android.App.ActionBar/IOnNavigationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onNavigationItemSelected(int i, long j);

    static {
        Runtime.register("Android.App.ActionBar+IOnNavigationListenerImplementor, Mono.Android", ActionBar_OnNavigationListenerImplementor.class, __md_methods);
    }

    public ActionBar_OnNavigationListenerImplementor() {
        if (getClass() == ActionBar_OnNavigationListenerImplementor.class) {
            TypeManager.Activate("Android.App.ActionBar+IOnNavigationListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.ActionBar.OnNavigationListener
    public boolean onNavigationItemSelected(int i, long j) {
        return n_onNavigationItemSelected(i, j);
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