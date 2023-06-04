package mono.android.app;

import android.app.SharedElementCallback;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SharedElementCallback_OnSharedElementsReadyListenerImplementor implements IGCUserPeer, SharedElementCallback.OnSharedElementsReadyListener {
    public static final String __md_methods = "n_onSharedElementsReady:()V:GetOnSharedElementsReadyHandler:Android.App.SharedElementCallback/IOnSharedElementsReadyListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSharedElementsReady();

    static {
        Runtime.register("Android.App.SharedElementCallback+IOnSharedElementsReadyListenerImplementor, Mono.Android", SharedElementCallback_OnSharedElementsReadyListenerImplementor.class, __md_methods);
    }

    public SharedElementCallback_OnSharedElementsReadyListenerImplementor() {
        if (getClass() == SharedElementCallback_OnSharedElementsReadyListenerImplementor.class) {
            TypeManager.Activate("Android.App.SharedElementCallback+IOnSharedElementsReadyListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.SharedElementCallback.OnSharedElementsReadyListener
    public void onSharedElementsReady() {
        n_onSharedElementsReady();
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