package mono.android.view;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewTreeObserver_OnPreDrawListenerImplementor implements IGCUserPeer, ViewTreeObserver.OnPreDrawListener {
    public static final String __md_methods = "n_onPreDraw:()Z:GetOnPreDrawHandler:Android.Views.ViewTreeObserver/IOnPreDrawListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onPreDraw();

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnPreDrawListenerImplementor, Mono.Android", ViewTreeObserver_OnPreDrawListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnPreDrawListenerImplementor() {
        if (getClass() == ViewTreeObserver_OnPreDrawListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnPreDrawListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return n_onPreDraw();
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