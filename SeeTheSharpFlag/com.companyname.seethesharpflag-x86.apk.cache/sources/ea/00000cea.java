package mono.androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FragmentManager_OnBackStackChangedListenerImplementor implements IGCUserPeer, FragmentManager.OnBackStackChangedListener {
    public static final String __md_methods = "n_onBackStackChanged:()V:GetOnBackStackChangedHandler:AndroidX.Fragment.App.FragmentManager/IOnBackStackChangedListenerInvoker, Xamarin.AndroidX.Fragment\n";
    private ArrayList refList;

    private native void n_onBackStackChanged();

    static {
        Runtime.register("AndroidX.Fragment.App.FragmentManager+IOnBackStackChangedListenerImplementor, Xamarin.AndroidX.Fragment", FragmentManager_OnBackStackChangedListenerImplementor.class, __md_methods);
    }

    public FragmentManager_OnBackStackChangedListenerImplementor() {
        if (getClass() == FragmentManager_OnBackStackChangedListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Fragment.App.FragmentManager+IOnBackStackChangedListenerImplementor, Xamarin.AndroidX.Fragment", "", this, new Object[0]);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
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