package mono.androidx.core.widget;

import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NestedScrollView_OnScrollChangeListenerImplementor implements IGCUserPeer, NestedScrollView.OnScrollChangeListener {
    public static final String __md_methods = "n_onScrollChange:(Landroidx/core/widget/NestedScrollView;IIII)V:GetOnScrollChange_Landroidx_core_widget_NestedScrollView_IIIIHandler:AndroidX.Core.Widget.NestedScrollView/IOnScrollChangeListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);

    static {
        Runtime.register("AndroidX.Core.Widget.NestedScrollView+IOnScrollChangeListenerImplementor, Xamarin.AndroidX.Core", NestedScrollView_OnScrollChangeListenerImplementor.class, __md_methods);
    }

    public NestedScrollView_OnScrollChangeListenerImplementor() {
        if (getClass() == NestedScrollView_OnScrollChangeListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.Widget.NestedScrollView+IOnScrollChangeListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        n_onScrollChange(nestedScrollView, i, i2, i3, i4);
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