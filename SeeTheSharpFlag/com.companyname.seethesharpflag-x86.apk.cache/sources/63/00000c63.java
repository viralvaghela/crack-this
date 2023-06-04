package mono.android.net.nsd;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NsdManager_RegistrationListenerImplementor implements IGCUserPeer, NsdManager.RegistrationListener {
    public static final String __md_methods = "n_onRegistrationFailed:(Landroid/net/nsd/NsdServiceInfo;I)V:GetOnRegistrationFailed_Landroid_net_nsd_NsdServiceInfo_IHandler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceRegistered:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceRegistered_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceUnregistered:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceUnregistered_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onUnregistrationFailed:(Landroid/net/nsd/NsdServiceInfo;I)V:GetOnUnregistrationFailed_Landroid_net_nsd_NsdServiceInfo_IHandler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i);

    private native void n_onServiceRegistered(NsdServiceInfo nsdServiceInfo);

    private native void n_onServiceUnregistered(NsdServiceInfo nsdServiceInfo);

    private native void n_onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i);

    static {
        Runtime.register("Android.Net.Nsd.NsdManager+IRegistrationListenerImplementor, Mono.Android", NsdManager_RegistrationListenerImplementor.class, __md_methods);
    }

    public NsdManager_RegistrationListenerImplementor() {
        if (getClass() == NsdManager_RegistrationListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Nsd.NsdManager+IRegistrationListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        n_onRegistrationFailed(nsdServiceInfo, i);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        n_onServiceRegistered(nsdServiceInfo);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        n_onServiceUnregistered(nsdServiceInfo);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        n_onUnregistrationFailed(nsdServiceInfo, i);
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