package mono.android.app;

import android.app.FragmentManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FragmentManager_OnBackStackChangedListenerImplementor implements IGCUserPeer, FragmentManager.OnBackStackChangedListener {
    public static final String __md_methods = "n_onBackStackChanged:()V:GetOnBackStackChangedHandler:Android.App.FragmentManager/IOnBackStackChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onBackStackChanged();

    static {
        Runtime.register("Android.App.FragmentManager+IOnBackStackChangedListenerImplementor, Mono.Android", FragmentManager_OnBackStackChangedListenerImplementor.class, __md_methods);
    }

    public FragmentManager_OnBackStackChangedListenerImplementor() {
        if (getClass() == FragmentManager_OnBackStackChangedListenerImplementor.class) {
            TypeManager.Activate("Android.App.FragmentManager+IOnBackStackChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        n_onBackStackChanged();
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