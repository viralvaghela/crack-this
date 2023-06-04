package mono.android.gesture;

import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GestureOverlayView_OnGesturePerformedListenerImplementor implements IGCUserPeer, GestureOverlayView.OnGesturePerformedListener {
    public static final String __md_methods = "n_onGesturePerformed:(Landroid/gesture/GestureOverlayView;Landroid/gesture/Gesture;)V:GetOnGesturePerformed_Landroid_gesture_GestureOverlayView_Landroid_gesture_Gesture_Handler:Android.Gestures.GestureOverlayView/IOnGesturePerformedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture);

    static {
        Runtime.register("Android.Gestures.GestureOverlayView+IOnGesturePerformedListenerImplementor, Mono.Android", GestureOverlayView_OnGesturePerformedListenerImplementor.class, __md_methods);
    }

    public GestureOverlayView_OnGesturePerformedListenerImplementor() {
        if (getClass() == GestureOverlayView_OnGesturePerformedListenerImplementor.class) {
            TypeManager.Activate("Android.Gestures.GestureOverlayView+IOnGesturePerformedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.gesture.GestureOverlayView.OnGesturePerformedListener
    public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        n_onGesturePerformed(gestureOverlayView, gesture);
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