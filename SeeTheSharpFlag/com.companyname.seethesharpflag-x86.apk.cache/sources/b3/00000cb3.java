package mono.android.view;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnUnhandledKeyEventListenerImplementor implements IGCUserPeer, View.OnUnhandledKeyEventListener {
    public static final String __md_methods = "n_onUnhandledKeyEvent:(Landroid/view/View;Landroid/view/KeyEvent;)Z:GetOnUnhandledKeyEvent_Landroid_view_View_Landroid_view_KeyEvent_Handler:Android.Views.View/IOnUnhandledKeyEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onUnhandledKeyEvent(View view, KeyEvent keyEvent);

    static {
        Runtime.register("Android.Views.View+IOnUnhandledKeyEventListenerImplementor, Mono.Android", View_OnUnhandledKeyEventListenerImplementor.class, __md_methods);
    }

    public View_OnUnhandledKeyEventListenerImplementor() {
        if (getClass() == View_OnUnhandledKeyEventListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnUnhandledKeyEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnUnhandledKeyEventListener
    public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return n_onUnhandledKeyEvent(view, keyEvent);
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