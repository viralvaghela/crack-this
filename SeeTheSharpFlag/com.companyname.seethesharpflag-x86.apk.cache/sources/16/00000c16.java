package mono.android.drm;

import android.drm.DrmEvent;
import android.drm.DrmManagerClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DrmManagerClient_OnEventListenerImplementor implements IGCUserPeer, DrmManagerClient.OnEventListener {
    public static final String __md_methods = "n_onEvent:(Landroid/drm/DrmManagerClient;Landroid/drm/DrmEvent;)V:GetOnEvent_Landroid_drm_DrmManagerClient_Landroid_drm_DrmEvent_Handler:Android.Drm.DrmManagerClient/IOnEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onEvent(DrmManagerClient drmManagerClient, DrmEvent drmEvent);

    static {
        Runtime.register("Android.Drm.DrmManagerClient+IOnEventListenerImplementor, Mono.Android", DrmManagerClient_OnEventListenerImplementor.class, __md_methods);
    }

    public DrmManagerClient_OnEventListenerImplementor() {
        if (getClass() == DrmManagerClient_OnEventListenerImplementor.class) {
            TypeManager.Activate("Android.Drm.DrmManagerClient+IOnEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.drm.DrmManagerClient.OnEventListener
    public void onEvent(DrmManagerClient drmManagerClient, DrmEvent drmEvent) {
        n_onEvent(drmManagerClient, drmEvent);
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