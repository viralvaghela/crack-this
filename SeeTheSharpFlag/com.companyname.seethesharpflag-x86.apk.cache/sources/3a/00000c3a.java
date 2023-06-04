package mono.android.media;

import android.media.MediaDrm;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaDrm_OnExpirationUpdateListenerImplementor implements IGCUserPeer, MediaDrm.OnExpirationUpdateListener {
    public static final String __md_methods = "n_onExpirationUpdate:(Landroid/media/MediaDrm;[BJ)V:GetOnExpirationUpdate_Landroid_media_MediaDrm_arrayBJHandler:Android.Media.MediaDrm/IOnExpirationUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j);

    static {
        Runtime.register("Android.Media.MediaDrm+IOnExpirationUpdateListenerImplementor, Mono.Android", MediaDrm_OnExpirationUpdateListenerImplementor.class, __md_methods);
    }

    public MediaDrm_OnExpirationUpdateListenerImplementor() {
        if (getClass() == MediaDrm_OnExpirationUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaDrm+IOnExpirationUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaDrm.OnExpirationUpdateListener
    public void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
        n_onExpirationUpdate(mediaDrm, bArr, j);
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