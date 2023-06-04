package mono.android.app;

import android.app.ActionBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionBar_OnMenuVisibilityListenerImplementor implements IGCUserPeer, ActionBar.OnMenuVisibilityListener {
    public static final String __md_methods = "n_onMenuVisibilityChanged:(Z)V:GetOnMenuVisibilityChanged_ZHandler:Android.App.ActionBar/IOnMenuVisibilityListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onMenuVisibilityChanged(boolean z);

    static {
        Runtime.register("Android.App.ActionBar+IOnMenuVisibilityListenerImplementor, Mono.Android", ActionBar_OnMenuVisibilityListenerImplementor.class, __md_methods);
    }

    public ActionBar_OnMenuVisibilityListenerImplementor() {
        if (getClass() == ActionBar_OnMenuVisibilityListenerImplementor.class) {
            TypeManager.Activate("Android.App.ActionBar+IOnMenuVisibilityListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.ActionBar.OnMenuVisibilityListener
    public void onMenuVisibilityChanged(boolean z) {
        n_onMenuVisibilityChanged(z);
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