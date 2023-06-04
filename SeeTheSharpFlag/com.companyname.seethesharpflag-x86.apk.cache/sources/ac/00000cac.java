package mono.android.view;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnHoverListenerImplementor implements IGCUserPeer, View.OnHoverListener {
    public static final String __md_methods = "n_onHover:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnHover_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnHoverListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onHover(View view, MotionEvent motionEvent);

    static {
        Runtime.register("Android.Views.View+IOnHoverListenerImplementor, Mono.Android", View_OnHoverListenerImplementor.class, __md_methods);
    }

    public View_OnHoverListenerImplementor() {
        if (getClass() == View_OnHoverListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnHoverListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        return n_onHover(view, motionEvent);
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