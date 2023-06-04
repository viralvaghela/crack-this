package mono.android.view;

import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnApplyWindowInsetsListenerImplementor implements IGCUserPeer, View.OnApplyWindowInsetsListener {
    public static final String __md_methods = "n_onApplyWindowInsets:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;:GetOnApplyWindowInsets_Landroid_view_View_Landroid_view_WindowInsets_Handler:Android.Views.View/IOnApplyWindowInsetsListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native WindowInsets n_onApplyWindowInsets(View view, WindowInsets windowInsets);

    static {
        Runtime.register("Android.Views.View+IOnApplyWindowInsetsListenerImplementor, Mono.Android", View_OnApplyWindowInsetsListenerImplementor.class, __md_methods);
    }

    public View_OnApplyWindowInsetsListenerImplementor() {
        if (getClass() == View_OnApplyWindowInsetsListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnApplyWindowInsetsListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return n_onApplyWindowInsets(view, windowInsets);
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