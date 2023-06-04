package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_DiscoveryStateListenerImplementor implements IGCUserPeer, WifiP2pManager.DiscoveryStateListener {
    public static final String __md_methods = "n_onDiscoveryStateAvailable:(I)V:GetOnDiscoveryStateAvailable_IHandler:Android.Net.Wifi.P2p.WifiP2pManager/IDiscoveryStateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDiscoveryStateAvailable(int i);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IDiscoveryStateListenerImplementor, Mono.Android", WifiP2pManager_DiscoveryStateListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_DiscoveryStateListenerImplementor() {
        if (getClass() == WifiP2pManager_DiscoveryStateListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IDiscoveryStateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.DiscoveryStateListener
    public void onDiscoveryStateAvailable(int i) {
        n_onDiscoveryStateAvailable(i);
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