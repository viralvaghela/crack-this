package mono.android.media;

import android.media.MediaSync;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaSync_OnErrorListenerImplementor implements IGCUserPeer, MediaSync.OnErrorListener {
    public static final String __md_methods = "n_onError:(Landroid/media/MediaSync;II)V:GetOnError_Landroid_media_MediaSync_IIHandler:Android.Media.MediaSync/IOnErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onError(MediaSync mediaSync, int i, int i2);

    static {
        Runtime.register("Android.Media.MediaSync+IOnErrorListenerImplementor, Mono.Android", MediaSync_OnErrorListenerImplementor.class, __md_methods);
    }

    public MediaSync_OnErrorListenerImplementor() {
        if (getClass() == MediaSync_OnErrorListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaSync+IOnErrorListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaSync.OnErrorListener
    public void onError(MediaSync mediaSync, int i, int i2) {
        n_onError(mediaSync, i, i2);
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