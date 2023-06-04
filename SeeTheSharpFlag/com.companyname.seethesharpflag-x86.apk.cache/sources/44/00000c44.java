package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnPreparedListenerImplementor implements IGCUserPeer, MediaPlayer.OnPreparedListener {
    public static final String __md_methods = "n_onPrepared:(Landroid/media/MediaPlayer;)V:GetOnPrepared_Landroid_media_MediaPlayer_Handler:Android.Media.MediaPlayer/IOnPreparedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onPrepared(MediaPlayer mediaPlayer);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnPreparedListenerImplementor, Mono.Android", MediaPlayer_OnPreparedListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnPreparedListenerImplementor() {
        if (getClass() == MediaPlayer_OnPreparedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnPreparedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        n_onPrepared(mediaPlayer);
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