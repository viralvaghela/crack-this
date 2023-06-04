package mono.android.gesture;

import android.gesture.GestureOverlayView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GestureOverlayView_OnGesturingListenerImplementor implements IGCUserPeer, GestureOverlayView.OnGesturingListener {
    public static final String __md_methods = "n_onGesturingEnded:(Landroid/gesture/GestureOverlayView;)V:GetOnGesturingEnded_Landroid_gesture_GestureOverlayView_Handler:Android.Gestures.GestureOverlayView/IOnGesturingListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onGesturingStarted:(Landroid/gesture/GestureOverlayView;)V:GetOnGesturingStarted_Landroid_gesture_GestureOverlayView_Handler:Android.Gestures.GestureOverlayView/IOnGesturingListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGesturingEnded(GestureOverlayView gestureOverlayView);

    private native void n_onGesturingStarted(GestureOverlayView gestureOverlayView);

    static {
        Runtime.register("Android.Gestures.GestureOverlayView+IOnGesturingListenerImplementor, Mono.Android", GestureOverlayView_OnGesturingListenerImplementor.class, __md_methods);
    }

    public GestureOverlayView_OnGesturingListenerImplementor() {
        if (getClass() == GestureOverlayView_OnGesturingListenerImplementor.class) {
            TypeManager.Activate("Android.Gestures.GestureOverlayView+IOnGesturingListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.gesture.GestureOverlayView.OnGesturingListener
    public void onGesturingEnded(GestureOverlayView gestureOverlayView) {
        n_onGesturingEnded(gestureOverlayView);
    }

    @Override // android.gesture.GestureOverlayView.OnGesturingListener
    public void onGesturingStarted(GestureOverlayView gestureOverlayView) {
        n_onGesturingStarted(gestureOverlayView);
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