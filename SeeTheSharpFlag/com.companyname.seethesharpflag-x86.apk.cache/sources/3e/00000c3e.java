package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnCompletionListenerImplementor implements IGCUserPeer, MediaPlayer.OnCompletionListener {
    public static final String __md_methods = "n_onCompletion:(Landroid/media/MediaPlayer;)V:GetOnCompletion_Landroid_media_MediaPlayer_Handler:Android.Media.MediaPlayer/IOnCompletionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCompletion(MediaPlayer mediaPlayer);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnCompletionListenerImplementor, Mono.Android", MediaPlayer_OnCompletionListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnCompletionListenerImplementor() {
        if (getClass() == MediaPlayer_OnCompletionListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnCompletionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        n_onCompletion(mediaPlayer);
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