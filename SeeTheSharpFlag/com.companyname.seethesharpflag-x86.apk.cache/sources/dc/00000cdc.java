package mono.android.widget;

import android.widget.SlidingDrawer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SlidingDrawer_OnDrawerCloseListenerImplementor implements IGCUserPeer, SlidingDrawer.OnDrawerCloseListener {
    public static final String __md_methods = "n_onDrawerClosed:()V:GetOnDrawerClosedHandler:Android.Widget.SlidingDrawer/IOnDrawerCloseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrawerClosed();

    static {
        Runtime.register("Android.Widget.SlidingDrawer+IOnDrawerCloseListenerImplementor, Mono.Android", SlidingDrawer_OnDrawerCloseListenerImplementor.class, __md_methods);
    }

    public SlidingDrawer_OnDrawerCloseListenerImplementor() {
        if (getClass() == SlidingDrawer_OnDrawerCloseListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SlidingDrawer+IOnDrawerCloseListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.SlidingDrawer.OnDrawerCloseListener
    public void onDrawerClosed() {
        n_onDrawerClosed();
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