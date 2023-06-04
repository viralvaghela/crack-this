package mono.android.p006se.omapi;

import android.se.omapi.SEService;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.se.omapi.SEService_OnConnectedListenerImplementor */
/* loaded from: classes.dex */
public class SEService_OnConnectedListenerImplementor implements IGCUserPeer, SEService.OnConnectedListener {
    public static final String __md_methods = "n_onConnected:()V:GetOnConnectedHandler:Android.SE.Omapi.SEService/IOnConnectedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onConnected();

    static {
        Runtime.register("Android.SE.Omapi.SEService+IOnConnectedListenerImplementor, Mono.Android", SEService_OnConnectedListenerImplementor.class, __md_methods);
    }

    public SEService_OnConnectedListenerImplementor() {
        if (getClass() == SEService_OnConnectedListenerImplementor.class) {
            TypeManager.Activate("Android.SE.Omapi.SEService+IOnConnectedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.se.omapi.SEService.OnConnectedListener
    public void onConnected() {
        n_onConnected();
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