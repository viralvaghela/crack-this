package mono.android.net.wifi.p2p;

import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_NetworkInfoListenerImplementor implements IGCUserPeer, WifiP2pManager.NetworkInfoListener {
    public static final String __md_methods = "n_onNetworkInfoAvailable:(Landroid/net/NetworkInfo;)V:GetOnNetworkInfoAvailable_Landroid_net_NetworkInfo_Handler:Android.Net.Wifi.P2p.WifiP2pManager/INetworkInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onNetworkInfoAvailable(NetworkInfo networkInfo);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+INetworkInfoListenerImplementor, Mono.Android", WifiP2pManager_NetworkInfoListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_NetworkInfoListenerImplementor() {
        if (getClass() == WifiP2pManager_NetworkInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+INetworkInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.NetworkInfoListener
    public void onNetworkInfoAvailable(NetworkInfo networkInfo) {
        n_onNetworkInfoAvailable(networkInfo);
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