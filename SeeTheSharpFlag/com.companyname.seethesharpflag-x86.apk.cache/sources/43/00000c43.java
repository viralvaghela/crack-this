package mono.android.media;

import android.media.MediaPlayer;
import android.media.MediaTimestamp;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor implements IGCUserPeer, MediaPlayer.OnMediaTimeDiscontinuityListener {
    public static final String __md_methods = "n_onMediaTimeDiscontinuity:(Landroid/media/MediaPlayer;Landroid/media/MediaTimestamp;)V:GetOnMediaTimeDiscontinuity_Landroid_media_MediaPlayer_Landroid_media_MediaTimestamp_Handler:Android.Media.MediaPlayer/IOnMediaTimeDiscontinuityListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onMediaTimeDiscontinuity(MediaPlayer mediaPlayer, MediaTimestamp mediaTimestamp);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnMediaTimeDiscontinuityListenerImplementor, Mono.Android", MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor() {
        if (getClass() == MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnMediaTimeDiscontinuityListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnMediaTimeDiscontinuityListener
    public void onMediaTimeDiscontinuity(MediaPlayer mediaPlayer, MediaTimestamp mediaTimestamp) {
        n_onMediaTimeDiscontinuity(mediaPlayer, mediaTimestamp);
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