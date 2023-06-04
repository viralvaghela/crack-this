package mono.android.drm;

import android.drm.DrmErrorEvent;
import android.drm.DrmManagerClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DrmManagerClient_OnErrorListenerImplementor implements IGCUserPeer, DrmManagerClient.OnErrorListener {
    public static final String __md_methods = "n_onError:(Landroid/drm/DrmManagerClient;Landroid/drm/DrmErrorEvent;)V:GetOnError_Landroid_drm_DrmManagerClient_Landroid_drm_DrmErrorEvent_Handler:Android.Drm.DrmManagerClient/IOnErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onError(DrmManagerClient drmManagerClient, DrmErrorEvent drmErrorEvent);

    static {
        Runtime.register("Android.Drm.DrmManagerClient+IOnErrorListenerImplementor, Mono.Android", DrmManagerClient_OnErrorListenerImplementor.class, __md_methods);
    }

    public DrmManagerClient_OnErrorListenerImplementor() {
        if (getClass() == DrmManagerClient_OnErrorListenerImplementor.class) {
            TypeManager.Activate("Android.Drm.DrmManagerClient+IOnErrorListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.drm.DrmManagerClient.OnErrorListener
    public void onError(DrmManagerClient drmManagerClient, DrmErrorEvent drmErrorEvent) {
        n_onError(drmManagerClient, drmErrorEvent);
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