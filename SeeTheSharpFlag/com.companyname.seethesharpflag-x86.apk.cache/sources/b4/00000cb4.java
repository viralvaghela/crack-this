package mono.android.view;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WindowInsetsAnimationControlListenerImplementor implements IGCUserPeer, WindowInsetsAnimationControlListener {
    public static final String __md_methods = "n_onCancelled:(Landroid/view/WindowInsetsAnimationController;)V:GetOnCancelled_Landroid_view_WindowInsetsAnimationController_Handler:Android.Views.IWindowInsetsAnimationControlListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onFinished:(Landroid/view/WindowInsetsAnimationController;)V:GetOnFinished_Landroid_view_WindowInsetsAnimationController_Handler:Android.Views.IWindowInsetsAnimationControlListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onReady:(Landroid/view/WindowInsetsAnimationController;I)V:GetOnReady_Landroid_view_WindowInsetsAnimationController_IHandler:Android.Views.IWindowInsetsAnimationControlListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCancelled(WindowInsetsAnimationController windowInsetsAnimationController);

    private native void n_onFinished(WindowInsetsAnimationController windowInsetsAnimationController);

    private native void n_onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i);

    static {
        Runtime.register("Android.Views.IWindowInsetsAnimationControlListenerImplementor, Mono.Android", WindowInsetsAnimationControlListenerImplementor.class, __md_methods);
    }

    public WindowInsetsAnimationControlListenerImplementor() {
        if (getClass() == WindowInsetsAnimationControlListenerImplementor.class) {
            TypeManager.Activate("Android.Views.IWindowInsetsAnimationControlListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        n_onCancelled(windowInsetsAnimationController);
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        n_onFinished(windowInsetsAnimationController);
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        n_onReady(windowInsetsAnimationController, i);
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