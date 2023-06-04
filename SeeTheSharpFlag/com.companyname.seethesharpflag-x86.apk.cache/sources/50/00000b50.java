package crc643f46942d9dd1fff9;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GestureManager_TapAndPanGestureDetector extends GestureDetector implements IGCUserPeer {
    public static final String __md_methods = "n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n";
    private ArrayList refList;

    private native boolean n_onTouchEvent(MotionEvent motionEvent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.GestureManager+TapAndPanGestureDetector, Xamarin.Forms.Platform.Android", GestureManager_TapAndPanGestureDetector.class, "n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n");
    }

    public GestureManager_TapAndPanGestureDetector(Context context, GestureDetector.OnGestureListener onGestureListener) {
        super(context, onGestureListener);
        if (getClass() == GestureManager_TapAndPanGestureDetector.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.GestureManager+TapAndPanGestureDetector, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Views.GestureDetector+IOnGestureListener, Mono.Android", this, new Object[]{context, onGestureListener});
        }
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return n_onTouchEvent(motionEvent);
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