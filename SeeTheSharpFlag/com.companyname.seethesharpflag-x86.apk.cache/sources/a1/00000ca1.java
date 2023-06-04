package mono.android.view;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewTreeObserver_OnWindowAttachListenerImplementor implements IGCUserPeer, ViewTreeObserver.OnWindowAttachListener {
    public static final String __md_methods = "n_onWindowAttached:()V:GetOnWindowAttachedHandler:Android.Views.ViewTreeObserver/IOnWindowAttachListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onWindowDetached:()V:GetOnWindowDetachedHandler:Android.Views.ViewTreeObserver/IOnWindowAttachListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onWindowAttached();

    private native void n_onWindowDetached();

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnWindowAttachListenerImplementor, Mono.Android", ViewTreeObserver_OnWindowAttachListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnWindowAttachListenerImplementor() {
        if (getClass() == ViewTreeObserver_OnWindowAttachListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnWindowAttachListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public void onWindowAttached() {
        n_onWindowAttached();
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public void onWindowDetached() {
        n_onWindowDetached();
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