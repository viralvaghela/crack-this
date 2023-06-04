package mono.android.app;

import android.app.SearchManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SearchManager_OnDismissListenerImplementor implements IGCUserPeer, SearchManager.OnDismissListener {
    public static final String __md_methods = "n_onDismiss:()V:GetOnDismissHandler:Android.App.SearchManager/IOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDismiss();

    static {
        Runtime.register("Android.App.SearchManager+IOnDismissListenerImplementor, Mono.Android", SearchManager_OnDismissListenerImplementor.class, __md_methods);
    }

    public SearchManager_OnDismissListenerImplementor() {
        if (getClass() == SearchManager_OnDismissListenerImplementor.class) {
            TypeManager.Activate("Android.App.SearchManager+IOnDismissListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.SearchManager.OnDismissListener
    public void onDismiss() {
        n_onDismiss();
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