package mono.android.view;

import android.view.WindowInsetsController;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.view.WindowInsetsController_OnControllableInsetsChangedListenerImplementor */
/* loaded from: classes.dex */
public class WindowInsetsController$OnControllableInsetsChangedListenerC0718x83305ff9 implements IGCUserPeer, WindowInsetsController.OnControllableInsetsChangedListener {
    public static final String __md_methods = "n_onControllableInsetsChanged:(Landroid/view/WindowInsetsController;I)V:GetOnControllableInsetsChanged_Landroid_view_WindowInsetsController_IHandler:Android.Views.IWindowInsetsController/IOnControllableInsetsChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i);

    static {
        Runtime.register("Android.Views.IWindowInsetsController+IOnControllableInsetsChangedListenerImplementor, Mono.Android", WindowInsetsController$OnControllableInsetsChangedListenerC0718x83305ff9.class, __md_methods);
    }

    public WindowInsetsController$OnControllableInsetsChangedListenerC0718x83305ff9() {
        if (getClass() == WindowInsetsController$OnControllableInsetsChangedListenerC0718x83305ff9.class) {
            TypeManager.Activate("Android.Views.IWindowInsetsController+IOnControllableInsetsChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        n_onControllableInsetsChanged(windowInsetsController, i);
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