package mono.android.preference;

import android.preference.PreferenceManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PreferenceManager_OnActivityDestroyListenerImplementor implements IGCUserPeer, PreferenceManager.OnActivityDestroyListener {
    public static final String __md_methods = "n_onActivityDestroy:()V:GetOnActivityDestroyHandler:Android.Preferences.PreferenceManager/IOnActivityDestroyListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onActivityDestroy();

    static {
        Runtime.register("Android.Preferences.PreferenceManager+IOnActivityDestroyListenerImplementor, Mono.Android", PreferenceManager_OnActivityDestroyListenerImplementor.class, __md_methods);
    }

    public PreferenceManager_OnActivityDestroyListenerImplementor() {
        if (getClass() == PreferenceManager_OnActivityDestroyListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.PreferenceManager+IOnActivityDestroyListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.preference.PreferenceManager.OnActivityDestroyListener
    public void onActivityDestroy() {
        n_onActivityDestroy();
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