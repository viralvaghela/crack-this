package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnInfoListenerImplementor implements IGCUserPeer, MediaPlayer.OnInfoListener {
    public static final String __md_methods = "n_onInfo:(Landroid/media/MediaPlayer;II)Z:GetOnInfo_Landroid_media_MediaPlayer_IIHandler:Android.Media.MediaPlayer/IOnInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onInfo(MediaPlayer mediaPlayer, int i, int i2);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnInfoListenerImplementor, Mono.Android", MediaPlayer_OnInfoListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnInfoListenerImplementor() {
        if (getClass() == MediaPlayer_OnInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnInfoListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return n_onInfo(mediaPlayer, i, i2);
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