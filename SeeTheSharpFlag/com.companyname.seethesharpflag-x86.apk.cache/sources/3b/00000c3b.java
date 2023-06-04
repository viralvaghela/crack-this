package mono.android.media;

import android.media.MediaDrm;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaDrm_OnKeyStatusChangeListenerImplementor implements IGCUserPeer, MediaDrm.OnKeyStatusChangeListener {
    public static final String __md_methods = "n_onKeyStatusChange:(Landroid/media/MediaDrm;[BLjava/util/List;Z)V:GetOnKeyStatusChange_Landroid_media_MediaDrm_arrayBLjava_util_List_ZHandler:Android.Media.MediaDrm/IOnKeyStatusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z);

    static {
        Runtime.register("Android.Media.MediaDrm+IOnKeyStatusChangeListenerImplementor, Mono.Android", MediaDrm_OnKeyStatusChangeListenerImplementor.class, __md_methods);
    }

    public MediaDrm_OnKeyStatusChangeListenerImplementor() {
        if (getClass() == MediaDrm_OnKeyStatusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaDrm+IOnKeyStatusChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaDrm.OnKeyStatusChangeListener
    public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        n_onKeyStatusChange(mediaDrm, bArr, list, z);
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