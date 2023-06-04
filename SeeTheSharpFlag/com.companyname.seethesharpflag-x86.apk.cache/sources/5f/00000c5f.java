package mono.android.media.session;

import android.media.session.MediaSessionManager;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaSessionManager_OnSession2TokensChangedListenerImplementor implements IGCUserPeer, MediaSessionManager.OnSession2TokensChangedListener {
    public static final String __md_methods = "n_onSession2TokensChanged:(Ljava/util/List;)V:GetOnSession2TokensChanged_Ljava_util_List_Handler:Android.Media.Session.MediaSessionManager/IOnSession2TokensChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSession2TokensChanged(List list);

    static {
        Runtime.register("Android.Media.Session.MediaSessionManager+IOnSession2TokensChangedListenerImplementor, Mono.Android", MediaSessionManager_OnSession2TokensChangedListenerImplementor.class, __md_methods);
    }

    public MediaSessionManager_OnSession2TokensChangedListenerImplementor() {
        if (getClass() == MediaSessionManager_OnSession2TokensChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Session.MediaSessionManager+IOnSession2TokensChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.session.MediaSessionManager.OnSession2TokensChangedListener
    public void onSession2TokensChanged(List list) {
        n_onSession2TokensChanged(list);
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