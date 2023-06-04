package mono.android.widget;

import android.widget.PopupMenu;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PopupMenu_OnDismissListenerImplementor implements IGCUserPeer, PopupMenu.OnDismissListener {
    public static final String __md_methods = "n_onDismiss:(Landroid/widget/PopupMenu;)V:GetOnDismiss_Landroid_widget_PopupMenu_Handler:Android.Widget.PopupMenu/IOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDismiss(PopupMenu popupMenu);

    static {
        Runtime.register("Android.Widget.PopupMenu+IOnDismissListenerImplementor, Mono.Android", PopupMenu_OnDismissListenerImplementor.class, __md_methods);
    }

    public PopupMenu_OnDismissListenerImplementor() {
        if (getClass() == PopupMenu_OnDismissListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.PopupMenu+IOnDismissListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.PopupMenu.OnDismissListener
    public void onDismiss(PopupMenu popupMenu) {
        n_onDismiss(popupMenu);
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