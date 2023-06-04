package mono.android.media;

import android.media.MediaDrm;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaDrm_OnEventListenerImplementor implements IGCUserPeer, MediaDrm.OnEventListener {
    public static final String __md_methods = "n_onEvent:(Landroid/media/MediaDrm;[BII[B)V:GetOnEvent_Landroid_media_MediaDrm_arrayBIIarrayBHandler:Android.Media.MediaDrm/IOnEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2);

    static {
        Runtime.register("Android.Media.MediaDrm+IOnEventListenerImplementor, Mono.Android", MediaDrm_OnEventListenerImplementor.class, __md_methods);
    }

    public MediaDrm_OnEventListenerImplementor() {
        if (getClass() == MediaDrm_OnEventListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaDrm+IOnEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaDrm.OnEventListener
    public void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        n_onEvent(mediaDrm, bArr, i, i2, bArr2);
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