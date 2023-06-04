package mono.android.view;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewTreeObserver_OnScrollChangedListenerImplementor implements IGCUserPeer, ViewTreeObserver.OnScrollChangedListener {
    public static final String __md_methods = "n_onScrollChanged:()V:GetOnScrollChangedHandler:Android.Views.ViewTreeObserver/IOnScrollChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onScrollChanged();

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnScrollChangedListenerImplementor, Mono.Android", ViewTreeObserver_OnScrollChangedListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnScrollChangedListenerImplementor() {
        if (getClass() == ViewTreeObserver_OnScrollChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnScrollChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        n_onScrollChanged();
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