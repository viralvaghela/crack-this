package mono.android.net;

import android.net.ConnectivityManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ConnectivityManager_OnNetworkActiveListenerImplementor implements IGCUserPeer, ConnectivityManager.OnNetworkActiveListener {
    public static final String __md_methods = "n_onNetworkActive:()V:GetOnNetworkActiveHandler:Android.Net.ConnectivityManager/IOnNetworkActiveListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onNetworkActive();

    static {
        Runtime.register("Android.Net.ConnectivityManager+IOnNetworkActiveListenerImplementor, Mono.Android", ConnectivityManager_OnNetworkActiveListenerImplementor.class, __md_methods);
    }

    public ConnectivityManager_OnNetworkActiveListenerImplementor() {
        if (getClass() == ConnectivityManager_OnNetworkActiveListenerImplementor.class) {
            TypeManager.Activate("Android.Net.ConnectivityManager+IOnNetworkActiveListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        n_onNetworkActive();
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