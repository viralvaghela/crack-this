package mono.android.view;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ScaleGestureDetector_OnScaleGestureListenerImplementor implements IGCUserPeer, ScaleGestureDetector.OnScaleGestureListener {
    public static final String __md_methods = "n_onScale:(Landroid/view/ScaleGestureDetector;)Z:GetOnScale_Landroid_view_ScaleGestureDetector_Handler:Android.Views.ScaleGestureDetector/IOnScaleGestureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onScaleBegin:(Landroid/view/ScaleGestureDetector;)Z:GetOnScaleBegin_Landroid_view_ScaleGestureDetector_Handler:Android.Views.ScaleGestureDetector/IOnScaleGestureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onScaleEnd:(Landroid/view/ScaleGestureDetector;)V:GetOnScaleEnd_Landroid_view_ScaleGestureDetector_Handler:Android.Views.ScaleGestureDetector/IOnScaleGestureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onScale(ScaleGestureDetector scaleGestureDetector);

    private native boolean n_onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    private native void n_onScaleEnd(ScaleGestureDetector scaleGestureDetector);

    static {
        Runtime.register("Android.Views.ScaleGestureDetector+IOnScaleGestureListenerImplementor, Mono.Android", ScaleGestureDetector_OnScaleGestureListenerImplementor.class, __md_methods);
    }

    public ScaleGestureDetector_OnScaleGestureListenerImplementor() {
        if (getClass() == ScaleGestureDetector_OnScaleGestureListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ScaleGestureDetector+IOnScaleGestureListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return n_onScale(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return n_onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n_onScaleEnd(scaleGestureDetector);
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