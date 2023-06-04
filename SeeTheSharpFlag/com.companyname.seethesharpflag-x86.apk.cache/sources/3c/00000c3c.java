package mono.android.media;

import android.media.MediaDrm;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaDrm_OnSessionLostStateListenerImplementor implements IGCUserPeer, MediaDrm.OnSessionLostStateListener {
    public static final String __md_methods = "n_onSessionLostState:(Landroid/media/MediaDrm;[B)V:GetOnSessionLostState_Landroid_media_MediaDrm_arrayBHandler:Android.Media.MediaDrm/IOnSessionLostStateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSessionLostState(MediaDrm mediaDrm, byte[] bArr);

    static {
        Runtime.register("Android.Media.MediaDrm+IOnSessionLostStateListenerImplementor, Mono.Android", MediaDrm_OnSessionLostStateListenerImplementor.class, __md_methods);
    }

    public MediaDrm_OnSessionLostStateListenerImplementor() {
        if (getClass() == MediaDrm_OnSessionLostStateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaDrm+IOnSessionLostStateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaDrm.OnSessionLostStateListener
    public void onSessionLostState(MediaDrm mediaDrm, byte[] bArr) {
        n_onSessionLostState(mediaDrm, bArr);
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