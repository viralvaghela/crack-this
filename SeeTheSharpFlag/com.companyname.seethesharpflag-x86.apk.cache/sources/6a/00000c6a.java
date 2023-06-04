package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_DeviceInfoListenerImplementor implements IGCUserPeer, WifiP2pManager.DeviceInfoListener {
    public static final String __md_methods = "n_onDeviceInfoAvailable:(Landroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnDeviceInfoAvailable_Landroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IDeviceInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IDeviceInfoListenerImplementor, Mono.Android", WifiP2pManager_DeviceInfoListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_DeviceInfoListenerImplementor() {
        if (getClass() == WifiP2pManager_DeviceInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IDeviceInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
    public void onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice) {
        n_onDeviceInfoAvailable(wifiP2pDevice);
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