package mono.androidx.core.view;

import androidx.core.view.ActionProvider;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionProvider_SubUiVisibilityListenerImplementor implements IGCUserPeer, ActionProvider.SubUiVisibilityListener {
    public static final String __md_methods = "n_onSubUiVisibilityChanged:(Z)V:GetOnSubUiVisibilityChanged_ZHandler:AndroidX.Core.View.ActionProvider/ISubUiVisibilityListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onSubUiVisibilityChanged(boolean z);

    static {
        Runtime.register("AndroidX.Core.View.ActionProvider+ISubUiVisibilityListenerImplementor, Xamarin.AndroidX.Core", ActionProvider_SubUiVisibilityListenerImplementor.class, __md_methods);
    }

    public ActionProvider_SubUiVisibilityListenerImplementor() {
        if (getClass() == ActionProvider_SubUiVisibilityListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.ActionProvider+ISubUiVisibilityListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
        n_onSubUiVisibilityChanged(z);
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