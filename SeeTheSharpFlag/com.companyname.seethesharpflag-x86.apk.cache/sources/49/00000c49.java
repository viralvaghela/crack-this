package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnVideoSizeChangedListenerImplementor implements IGCUserPeer, MediaPlayer.OnVideoSizeChangedListener {
    public static final String __md_methods = "n_onVideoSizeChanged:(Landroid/media/MediaPlayer;II)V:GetOnVideoSizeChanged_Landroid_media_MediaPlayer_IIHandler:Android.Media.MediaPlayer/IOnVideoSizeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnVideoSizeChangedListenerImplementor, Mono.Android", MediaPlayer_OnVideoSizeChangedListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnVideoSizeChangedListenerImplementor() {
        if (getClass() == MediaPlayer_OnVideoSizeChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnVideoSizeChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        n_onVideoSizeChanged(mediaPlayer, i, i2);
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