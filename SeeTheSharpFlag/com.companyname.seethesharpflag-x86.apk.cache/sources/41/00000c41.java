package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnErrorListenerImplementor implements IGCUserPeer, MediaPlayer.OnErrorListener {
    public static final String __md_methods = "n_onError:(Landroid/media/MediaPlayer;II)Z:GetOnError_Landroid_media_MediaPlayer_IIHandler:Android.Media.MediaPlayer/IOnErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onError(MediaPlayer mediaPlayer, int i, int i2);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnErrorListenerImplementor, Mono.Android", MediaPlayer_OnErrorListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnErrorListenerImplementor() {
        if (getClass() == MediaPlayer_OnErrorListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnErrorListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return n_onError(mediaPlayer, i, i2);
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