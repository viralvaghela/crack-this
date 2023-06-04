package mono.android.media;

import android.media.RemoteControlClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor implements IGCUserPeer, RemoteControlClient.OnPlaybackPositionUpdateListener {
    public static final String __md_methods = "n_onPlaybackPositionUpdate:(J)V:GetOnPlaybackPositionUpdate_JHandler:Android.Media.RemoteControlClient/IOnPlaybackPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onPlaybackPositionUpdate(long j);

    static {
        Runtime.register("Android.Media.RemoteControlClient+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android", RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor.class, __md_methods);
    }

    public RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor() {
        if (getClass() == RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.RemoteControlClient+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
    public void onPlaybackPositionUpdate(long j) {
        n_onPlaybackPositionUpdate(j);
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