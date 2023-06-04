package mono.android.widget;

import android.widget.SlidingDrawer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SlidingDrawer_OnDrawerScrollListenerImplementor implements IGCUserPeer, SlidingDrawer.OnDrawerScrollListener {
    public static final String __md_methods = "n_onScrollEnded:()V:GetOnScrollEndedHandler:Android.Widget.SlidingDrawer/IOnDrawerScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onScrollStarted:()V:GetOnScrollStartedHandler:Android.Widget.SlidingDrawer/IOnDrawerScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onScrollEnded();

    private native void n_onScrollStarted();

    static {
        Runtime.register("Android.Widget.SlidingDrawer+IOnDrawerScrollListenerImplementor, Mono.Android", SlidingDrawer_OnDrawerScrollListenerImplementor.class, __md_methods);
    }

    public SlidingDrawer_OnDrawerScrollListenerImplementor() {
        if (getClass() == SlidingDrawer_OnDrawerScrollListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SlidingDrawer+IOnDrawerScrollListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.SlidingDrawer.OnDrawerScrollListener
    public void onScrollEnded() {
        n_onScrollEnded();
    }

    @Override // android.widget.SlidingDrawer.OnDrawerScrollListener
    public void onScrollStarted() {
        n_onScrollStarted();
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