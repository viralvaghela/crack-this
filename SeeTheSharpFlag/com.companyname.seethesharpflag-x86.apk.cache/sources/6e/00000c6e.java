package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_GroupInfoListenerImplementor implements IGCUserPeer, WifiP2pManager.GroupInfoListener {
    public static final String __md_methods = "n_onGroupInfoAvailable:(Landroid/net/wifi/p2p/WifiP2pGroup;)V:GetOnGroupInfoAvailable_Landroid_net_wifi_p2p_WifiP2pGroup_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IGroupInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IGroupInfoListenerImplementor, Mono.Android", WifiP2pManager_GroupInfoListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_GroupInfoListenerImplementor() {
        if (getClass() == WifiP2pManager_GroupInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IGroupInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
    public void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        n_onGroupInfoAvailable(wifiP2pGroup);
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