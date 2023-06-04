package mono.android.net.nsd;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NsdManager_ResolveListenerImplementor implements IGCUserPeer, NsdManager.ResolveListener {
    public static final String __md_methods = "n_onResolveFailed:(Landroid/net/nsd/NsdServiceInfo;I)V:GetOnResolveFailed_Landroid_net_nsd_NsdServiceInfo_IHandler:Android.Net.Nsd.NsdManager/IResolveListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceResolved:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceResolved_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IResolveListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onResolveFailed(NsdServiceInfo nsdServiceInfo, int i);

    private native void n_onServiceResolved(NsdServiceInfo nsdServiceInfo);

    static {
        Runtime.register("Android.Net.Nsd.NsdManager+IResolveListenerImplementor, Mono.Android", NsdManager_ResolveListenerImplementor.class, __md_methods);
    }

    public NsdManager_ResolveListenerImplementor() {
        if (getClass() == NsdManager_ResolveListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Nsd.NsdManager+IResolveListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        n_onResolveFailed(nsdServiceInfo, i);
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        n_onServiceResolved(nsdServiceInfo);
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