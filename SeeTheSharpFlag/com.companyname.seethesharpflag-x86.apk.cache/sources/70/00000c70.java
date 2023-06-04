package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_P2pStateListenerImplementor implements IGCUserPeer, WifiP2pManager.P2pStateListener {
    public static final String __md_methods = "n_onP2pStateAvailable:(I)V:GetOnP2pStateAvailable_IHandler:Android.Net.Wifi.P2p.WifiP2pManager/IP2pStateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onP2pStateAvailable(int i);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IP2pStateListenerImplementor, Mono.Android", WifiP2pManager_P2pStateListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_P2pStateListenerImplementor() {
        if (getClass() == WifiP2pManager_P2pStateListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IP2pStateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.P2pStateListener
    public void onP2pStateAvailable(int i) {
        n_onP2pStateAvailable(i);
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