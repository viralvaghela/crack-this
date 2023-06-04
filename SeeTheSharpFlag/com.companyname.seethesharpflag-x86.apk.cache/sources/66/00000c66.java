package mono.android.net.wifi;

import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSuggestion;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiManager_SuggestionConnectionStatusListenerImplementor implements IGCUserPeer, WifiManager.SuggestionConnectionStatusListener {
    public static final String __md_methods = "n_onConnectionStatus:(Landroid/net/wifi/WifiNetworkSuggestion;I)V:GetOnConnectionStatus_Landroid_net_wifi_WifiNetworkSuggestion_IHandler:Android.Net.Wifi.WifiManager/ISuggestionConnectionStatusListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onConnectionStatus(WifiNetworkSuggestion wifiNetworkSuggestion, int i);

    static {
        Runtime.register("Android.Net.Wifi.WifiManager+ISuggestionConnectionStatusListenerImplementor, Mono.Android", WifiManager_SuggestionConnectionStatusListenerImplementor.class, __md_methods);
    }

    public WifiManager_SuggestionConnectionStatusListenerImplementor() {
        if (getClass() == WifiManager_SuggestionConnectionStatusListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.WifiManager+ISuggestionConnectionStatusListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.WifiManager.SuggestionConnectionStatusListener
    public void onConnectionStatus(WifiNetworkSuggestion wifiNetworkSuggestion, int i) {
        n_onConnectionStatus(wifiNetworkSuggestion, i);
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