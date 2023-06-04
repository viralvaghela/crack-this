package mono.android.view;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewTreeObserver_OnDrawListenerImplementor implements IGCUserPeer, ViewTreeObserver.OnDrawListener {
    public static final String __md_methods = "n_onDraw:()V:GetOnDrawHandler:Android.Views.ViewTreeObserver/IOnDrawListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDraw();

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnDrawListenerImplementor, Mono.Android", ViewTreeObserver_OnDrawListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnDrawListenerImplementor() {
        if (getClass() == ViewTreeObserver_OnDrawListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnDrawListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        n_onDraw();
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