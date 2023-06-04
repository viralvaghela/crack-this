package mono.android.widget;

import android.widget.SlidingDrawer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SlidingDrawer_OnDrawerOpenListenerImplementor implements IGCUserPeer, SlidingDrawer.OnDrawerOpenListener {
    public static final String __md_methods = "n_onDrawerOpened:()V:GetOnDrawerOpenedHandler:Android.Widget.SlidingDrawer/IOnDrawerOpenListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrawerOpened();

    static {
        Runtime.register("Android.Widget.SlidingDrawer+IOnDrawerOpenListenerImplementor, Mono.Android", SlidingDrawer_OnDrawerOpenListenerImplementor.class, __md_methods);
    }

    public SlidingDrawer_OnDrawerOpenListenerImplementor() {
        if (getClass() == SlidingDrawer_OnDrawerOpenListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SlidingDrawer+IOnDrawerOpenListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.SlidingDrawer.OnDrawerOpenListener
    public void onDrawerOpened() {
        n_onDrawerOpened();
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