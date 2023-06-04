package mono.android.view;

import android.view.ActionProvider;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionProvider_VisibilityListenerImplementor implements IGCUserPeer, ActionProvider.VisibilityListener {
    public static final String __md_methods = "n_onActionProviderVisibilityChanged:(Z)V:GetOnActionProviderVisibilityChanged_ZHandler:Android.Views.ActionProvider/IVisibilityListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onActionProviderVisibilityChanged(boolean z);

    static {
        Runtime.register("Android.Views.ActionProvider+IVisibilityListenerImplementor, Mono.Android", ActionProvider_VisibilityListenerImplementor.class, __md_methods);
    }

    public ActionProvider_VisibilityListenerImplementor() {
        if (getClass() == ActionProvider_VisibilityListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ActionProvider+IVisibilityListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        n_onActionProviderVisibilityChanged(z);
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