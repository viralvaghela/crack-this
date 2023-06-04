package mono.android.media;

import android.media.MediaPlayer;
import android.media.SubtitleData;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnSubtitleDataListenerImplementor implements IGCUserPeer, MediaPlayer.OnSubtitleDataListener {
    public static final String __md_methods = "n_onSubtitleData:(Landroid/media/MediaPlayer;Landroid/media/SubtitleData;)V:GetOnSubtitleData_Landroid_media_MediaPlayer_Landroid_media_SubtitleData_Handler:Android.Media.MediaPlayer/IOnSubtitleDataListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSubtitleData(MediaPlayer mediaPlayer, SubtitleData subtitleData);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnSubtitleDataListenerImplementor, Mono.Android", MediaPlayer_OnSubtitleDataListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnSubtitleDataListenerImplementor() {
        if (getClass() == MediaPlayer_OnSubtitleDataListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnSubtitleDataListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnSubtitleDataListener
    public void onSubtitleData(MediaPlayer mediaPlayer, SubtitleData subtitleData) {
        n_onSubtitleData(mediaPlayer, subtitleData);
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