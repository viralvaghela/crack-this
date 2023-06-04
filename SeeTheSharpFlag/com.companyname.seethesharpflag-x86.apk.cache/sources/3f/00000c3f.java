package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnDrmInfoListenerImplementor implements IGCUserPeer, MediaPlayer.OnDrmInfoListener {
    public static final String __md_methods = "n_onDrmInfo:(Landroid/media/MediaPlayer;Landroid/media/MediaPlayer$DrmInfo;)V:GetOnDrmInfo_Landroid_media_MediaPlayer_Landroid_media_MediaPlayer_DrmInfo_Handler:Android.Media.MediaPlayer/IOnDrmInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrmInfo(MediaPlayer mediaPlayer, MediaPlayer.DrmInfo drmInfo);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnDrmInfoListenerImplementor, Mono.Android", MediaPlayer_OnDrmInfoListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnDrmInfoListenerImplementor() {
        if (getClass() == MediaPlayer_OnDrmInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnDrmInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnDrmInfoListener
    public void onDrmInfo(MediaPlayer mediaPlayer, MediaPlayer.DrmInfo drmInfo) {
        n_onDrmInfo(mediaPlayer, drmInfo);
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