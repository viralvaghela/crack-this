package mono.android.view;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewTreeObserver_OnWindowFocusChangeListenerImplementor implements IGCUserPeer, ViewTreeObserver.OnWindowFocusChangeListener {
    public static final String __md_methods = "n_onWindowFocusChanged:(Z)V:GetOnWindowFocusChanged_ZHandler:Android.Views.ViewTreeObserver/IOnWindowFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onWindowFocusChanged(boolean z);

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnWindowFocusChangeListenerImplementor, Mono.Android", ViewTreeObserver_OnWindowFocusChangeListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnWindowFocusChangeListenerImplementor() {
        if (getClass() == ViewTreeObserver_OnWindowFocusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnWindowFocusChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z) {
        n_onWindowFocusChanged(z);
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