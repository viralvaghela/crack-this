package mono.android.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewTreeObserver_OnGlobalFocusChangeListenerImplementor implements IGCUserPeer, ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final String __md_methods = "n_onGlobalFocusChanged:(Landroid/view/View;Landroid/view/View;)V:GetOnGlobalFocusChanged_Landroid_view_View_Landroid_view_View_Handler:Android.Views.ViewTreeObserver/IOnGlobalFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGlobalFocusChanged(View view, View view2);

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnGlobalFocusChangeListenerImplementor, Mono.Android", ViewTreeObserver_OnGlobalFocusChangeListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnGlobalFocusChangeListenerImplementor() {
        if (getClass() == ViewTreeObserver_OnGlobalFocusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnGlobalFocusChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        n_onGlobalFocusChanged(view, view2);
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