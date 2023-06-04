package mono.android.preference;

import android.preference.PreferenceManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PreferenceManager_OnActivityStopListenerImplementor implements IGCUserPeer, PreferenceManager.OnActivityStopListener {
    public static final String __md_methods = "n_onActivityStop:()V:GetOnActivityStopHandler:Android.Preferences.PreferenceManager/IOnActivityStopListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onActivityStop();

    static {
        Runtime.register("Android.Preferences.PreferenceManager+IOnActivityStopListenerImplementor, Mono.Android", PreferenceManager_OnActivityStopListenerImplementor.class, __md_methods);
    }

    public PreferenceManager_OnActivityStopListenerImplementor() {
        if (getClass() == PreferenceManager_OnActivityStopListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.PreferenceManager+IOnActivityStopListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.preference.PreferenceManager.OnActivityStopListener
    public void onActivityStop() {
        n_onActivityStop();
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