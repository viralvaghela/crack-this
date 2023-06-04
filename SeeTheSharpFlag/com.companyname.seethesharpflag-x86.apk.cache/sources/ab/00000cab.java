package mono.android.view;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnGenericMotionListenerImplementor implements IGCUserPeer, View.OnGenericMotionListener {
    public static final String __md_methods = "n_onGenericMotion:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnGenericMotion_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnGenericMotionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onGenericMotion(View view, MotionEvent motionEvent);

    static {
        Runtime.register("Android.Views.View+IOnGenericMotionListenerImplementor, Mono.Android", View_OnGenericMotionListenerImplementor.class, __md_methods);
    }

    public View_OnGenericMotionListenerImplementor() {
        if (getClass() == View_OnGenericMotionListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnGenericMotionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        return n_onGenericMotion(view, motionEvent);
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