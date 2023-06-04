package mono.android.media.session;

import android.media.session.MediaSessionManager;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaSessionManager_OnActiveSessionsChangedListenerImplementor implements IGCUserPeer, MediaSessionManager.OnActiveSessionsChangedListener {
    public static final String __md_methods = "n_onActiveSessionsChanged:(Ljava/util/List;)V:GetOnActiveSessionsChanged_Ljava_util_List_Handler:Android.Media.Session.MediaSessionManager/IOnActiveSessionsChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onActiveSessionsChanged(List list);

    static {
        Runtime.register("Android.Media.Session.MediaSessionManager+IOnActiveSessionsChangedListenerImplementor, Mono.Android", MediaSessionManager_OnActiveSessionsChangedListenerImplementor.class, __md_methods);
    }

    public MediaSessionManager_OnActiveSessionsChangedListenerImplementor() {
        if (getClass() == MediaSessionManager_OnActiveSessionsChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Session.MediaSessionManager+IOnActiveSessionsChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
    public void onActiveSessionsChanged(List list) {
        n_onActiveSessionsChanged(list);
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