package mono.androidx.appcompat.app;

import androidx.appcompat.app.ActionBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionBar_OnMenuVisibilityListenerImplementor implements IGCUserPeer, ActionBar.OnMenuVisibilityListener {
    public static final String __md_methods = "n_onMenuVisibilityChanged:(Z)V:GetOnMenuVisibilityChanged_ZHandler:AndroidX.AppCompat.App.ActionBar/IOnMenuVisibilityListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native void n_onMenuVisibilityChanged(boolean z);

    static {
        Runtime.register("AndroidX.AppCompat.App.ActionBar+IOnMenuVisibilityListenerImplementor, Xamarin.AndroidX.AppCompat", ActionBar_OnMenuVisibilityListenerImplementor.class, __md_methods);
    }

    public ActionBar_OnMenuVisibilityListenerImplementor() {
        if (getClass() == ActionBar_OnMenuVisibilityListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.App.ActionBar+IOnMenuVisibilityListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.app.ActionBar.OnMenuVisibilityListener
    public void onMenuVisibilityChanged(boolean z) {
        n_onMenuVisibilityChanged(z);
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