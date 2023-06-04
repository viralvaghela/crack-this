package mono.android.media;

import android.media.MediaPlayer;
import android.media.TimedMetaData;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaPlayer_OnTimedMetaDataAvailableListenerImplementor implements IGCUserPeer, MediaPlayer.OnTimedMetaDataAvailableListener {
    public static final String __md_methods = "n_onTimedMetaDataAvailable:(Landroid/media/MediaPlayer;Landroid/media/TimedMetaData;)V:GetOnTimedMetaDataAvailable_Landroid_media_MediaPlayer_Landroid_media_TimedMetaData_Handler:Android.Media.MediaPlayer/IOnTimedMetaDataAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTimedMetaDataAvailable(MediaPlayer mediaPlayer, TimedMetaData timedMetaData);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnTimedMetaDataAvailableListenerImplementor, Mono.Android", MediaPlayer_OnTimedMetaDataAvailableListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnTimedMetaDataAvailableListenerImplementor() {
        if (getClass() == MediaPlayer_OnTimedMetaDataAvailableListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnTimedMetaDataAvailableListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaPlayer.OnTimedMetaDataAvailableListener
    public void onTimedMetaDataAvailable(MediaPlayer mediaPlayer, TimedMetaData timedMetaData) {
        n_onTimedMetaDataAvailable(mediaPlayer, timedMetaData);
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