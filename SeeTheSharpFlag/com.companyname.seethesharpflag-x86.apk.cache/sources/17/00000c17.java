package mono.android.drm;

import android.drm.DrmInfoEvent;
import android.drm.DrmManagerClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DrmManagerClient_OnInfoListenerImplementor implements IGCUserPeer, DrmManagerClient.OnInfoListener {
    public static final String __md_methods = "n_onInfo:(Landroid/drm/DrmManagerClient;Landroid/drm/DrmInfoEvent;)V:GetOnInfo_Landroid_drm_DrmManagerClient_Landroid_drm_DrmInfoEvent_Handler:Android.Drm.DrmManagerClient/IOnInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onInfo(DrmManagerClient drmManagerClient, DrmInfoEvent drmInfoEvent);

    static {
        Runtime.register("Android.Drm.DrmManagerClient+IOnInfoListenerImplementor, Mono.Android", DrmManagerClient_OnInfoListenerImplementor.class, __md_methods);
    }

    public DrmManagerClient_OnInfoListenerImplementor() {
        if (getClass() == DrmManagerClient_OnInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Drm.DrmManagerClient+IOnInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.drm.DrmManagerClient.OnInfoListener
    public void onInfo(DrmManagerClient drmManagerClient, DrmInfoEvent drmInfoEvent) {
        n_onInfo(drmManagerClient, drmInfoEvent);
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