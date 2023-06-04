package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnDrmPreparedListenerImplementor implements IGCUserPeer, MediaPlayer.OnDrmPreparedListener {
    public static final String __md_methods = "n_onDrmPrepared:(Landroid/media/MediaPlayer;I)V:GetOnDrmPrepared_Landroid_media_MediaPlayer_IHandler:Android.Media.MediaPlayer/IOnDrmPreparedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrmPrepared(MediaPlayer mediaPlayer, int i);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnDrmPreparedListenerImplementor, Mono.Android", MediaPlayer_OnDrmPreparedListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnDrmPreparedListenerImplementor() {
        if (getClass() == MediaPlayer_OnDrmPreparedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnDrmPreparedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnDrmPreparedListener
    public void onDrmPrepared(MediaPlayer mediaPlayer, int i) {
        n_onDrmPrepared(mediaPlayer, i);
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