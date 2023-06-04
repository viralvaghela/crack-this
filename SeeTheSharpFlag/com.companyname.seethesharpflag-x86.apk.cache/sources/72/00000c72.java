package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_ServiceResponseListenerImplementor implements IGCUserPeer, WifiP2pManager.ServiceResponseListener {
    public static final String __md_methods = "n_onServiceAvailable:(I[BLandroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnServiceAvailable_IarrayBLandroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IServiceResponseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onServiceAvailable(int i, byte[] bArr, WifiP2pDevice wifiP2pDevice);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IServiceResponseListenerImplementor, Mono.Android", WifiP2pManager_ServiceResponseListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_ServiceResponseListenerImplementor() {
        if (getClass() == WifiP2pManager_ServiceResponseListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IServiceResponseListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ServiceResponseListener
    public void onServiceAvailable(int i, byte[] bArr, WifiP2pDevice wifiP2pDevice) {
        n_onServiceAvailable(i, bArr, wifiP2pDevice);
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