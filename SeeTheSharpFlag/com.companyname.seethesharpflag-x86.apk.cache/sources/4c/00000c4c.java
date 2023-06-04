package mono.android.media;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaRouter2_OnGetControllerHintsListenerImplementor implements IGCUserPeer, MediaRouter2.OnGetControllerHintsListener {
    public static final String __md_methods = "n_onGetControllerHints:(Landroid/media/MediaRoute2Info;)Landroid/os/Bundle;:GetOnGetControllerHints_Landroid_media_MediaRoute2Info_Handler:Android.Media.MediaRouter2/IOnGetControllerHintsListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native Bundle n_onGetControllerHints(MediaRoute2Info mediaRoute2Info);

    static {
        Runtime.register("Android.Media.MediaRouter2+IOnGetControllerHintsListenerImplementor, Mono.Android", MediaRouter2_OnGetControllerHintsListenerImplementor.class, __md_methods);
    }

    public MediaRouter2_OnGetControllerHintsListenerImplementor() {
        if (getClass() == MediaRouter2_OnGetControllerHintsListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaRouter2+IOnGetControllerHintsListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaRouter2.OnGetControllerHintsListener
    public Bundle onGetControllerHints(MediaRoute2Info mediaRoute2Info) {
        return n_onGetControllerHints(mediaRoute2Info);
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