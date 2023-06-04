package mono.android.media;

import android.media.MediaRecorder;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaRecorder_OnInfoListenerImplementor implements IGCUserPeer, MediaRecorder.OnInfoListener {
    public static final String __md_methods = "n_onInfo:(Landroid/media/MediaRecorder;II)V:GetOnInfo_Landroid_media_MediaRecorder_IIHandler:Android.Media.MediaRecorder/IOnInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onInfo(MediaRecorder mediaRecorder, int i, int i2);

    static {
        Runtime.register("Android.Media.MediaRecorder+IOnInfoListenerImplementor, Mono.Android", MediaRecorder_OnInfoListenerImplementor.class, __md_methods);
    }

    public MediaRecorder_OnInfoListenerImplementor() {
        if (getClass() == MediaRecorder_OnInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaRecorder+IOnInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        n_onInfo(mediaRecorder, i, i2);
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