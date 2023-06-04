package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnBufferingUpdateListenerImplementor implements IGCUserPeer, MediaPlayer.OnBufferingUpdateListener {
    public static final String __md_methods = "n_onBufferingUpdate:(Landroid/media/MediaPlayer;I)V:GetOnBufferingUpdate_Landroid_media_MediaPlayer_IHandler:Android.Media.MediaPlayer/IOnBufferingUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onBufferingUpdate(MediaPlayer mediaPlayer, int i);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnBufferingUpdateListenerImplementor, Mono.Android", MediaPlayer_OnBufferingUpdateListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnBufferingUpdateListenerImplementor() {
        if (getClass() == MediaPlayer_OnBufferingUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnBufferingUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        n_onBufferingUpdate(mediaPlayer, i);
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