package mono.android.app;

import android.app.SearchManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SearchManager_OnCancelListenerImplementor implements IGCUserPeer, SearchManager.OnCancelListener {
    public static final String __md_methods = "n_onCancel:()V:GetOnCancelHandler:Android.App.SearchManager/IOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCancel();

    static {
        Runtime.register("Android.App.SearchManager+IOnCancelListenerImplementor, Mono.Android", SearchManager_OnCancelListenerImplementor.class, __md_methods);
    }

    public SearchManager_OnCancelListenerImplementor() {
        if (getClass() == SearchManager_OnCancelListenerImplementor.class) {
            TypeManager.Activate("Android.App.SearchManager+IOnCancelListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.SearchManager.OnCancelListener
    public void onCancel() {
        n_onCancel();
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