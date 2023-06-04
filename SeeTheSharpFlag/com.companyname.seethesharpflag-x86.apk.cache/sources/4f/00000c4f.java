package mono.android.media;

import android.media.RemoteControlClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RemoteControlClient_OnGetPlaybackPositionListenerImplementor implements IGCUserPeer, RemoteControlClient.OnGetPlaybackPositionListener {
    public static final String __md_methods = "n_onGetPlaybackPosition:()J:GetOnGetPlaybackPositionHandler:Android.Media.RemoteControlClient/IOnGetPlaybackPositionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native long n_onGetPlaybackPosition();

    static {
        Runtime.register("Android.Media.RemoteControlClient+IOnGetPlaybackPositionListenerImplementor, Mono.Android", RemoteControlClient_OnGetPlaybackPositionListenerImplementor.class, __md_methods);
    }

    public RemoteControlClient_OnGetPlaybackPositionListenerImplementor() {
        if (getClass() == RemoteControlClient_OnGetPlaybackPositionListenerImplementor.class) {
            TypeManager.Activate("Android.Media.RemoteControlClient+IOnGetPlaybackPositionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.RemoteControlClient.OnGetPlaybackPositionListener
    public long onGetPlaybackPosition() {
        return n_onGetPlaybackPosition();
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