package mono.android.view;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GestureDetector_OnDoubleTapListenerImplementor implements IGCUserPeer, GestureDetector.OnDoubleTapListener {
    public static final String __md_methods = "n_onDoubleTap:(Landroid/view/MotionEvent;)Z:GetOnDoubleTap_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDoubleTapEvent:(Landroid/view/MotionEvent;)Z:GetOnDoubleTapEvent_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z:GetOnSingleTapConfirmed_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onDoubleTap(MotionEvent motionEvent);

    private native boolean n_onDoubleTapEvent(MotionEvent motionEvent);

    private native boolean n_onSingleTapConfirmed(MotionEvent motionEvent);

    static {
        Runtime.register("Android.Views.GestureDetector+IOnDoubleTapListenerImplementor, Mono.Android", GestureDetector_OnDoubleTapListenerImplementor.class, __md_methods);
    }

    public GestureDetector_OnDoubleTapListenerImplementor() {
        if (getClass() == GestureDetector_OnDoubleTapListenerImplementor.class) {
            TypeManager.Activate("Android.Views.GestureDetector+IOnDoubleTapListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return n_onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return n_onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return n_onSingleTapConfirmed(motionEvent);
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