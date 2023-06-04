package mono.android.widget;

import android.widget.PopupWindow;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PopupWindow_OnDismissListenerImplementor implements IGCUserPeer, PopupWindow.OnDismissListener {
    public static final String __md_methods = "n_onDismiss:()V:GetOnDismissHandler:Android.Widget.PopupWindow/IOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDismiss();

    static {
        Runtime.register("Android.Widget.PopupWindow+IOnDismissListenerImplementor, Mono.Android", PopupWindow_OnDismissListenerImplementor.class, __md_methods);
    }

    public PopupWindow_OnDismissListenerImplementor() {
        if (getClass() == PopupWindow_OnDismissListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.PopupWindow+IOnDismissListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        n_onDismiss();
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