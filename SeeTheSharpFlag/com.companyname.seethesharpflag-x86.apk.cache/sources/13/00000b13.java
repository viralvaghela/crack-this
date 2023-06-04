package crc643f46942d9dd1fff9;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ButtonRenderer_ButtonTouchListener implements IGCUserPeer, View.OnTouchListener {
    public static final String __md_methods = "n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onTouch(View view, MotionEvent motionEvent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ButtonRenderer+ButtonTouchListener, Xamarin.Forms.Platform.Android", ButtonRenderer_ButtonTouchListener.class, "n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public ButtonRenderer_ButtonTouchListener() {
        if (getClass() == ButtonRenderer_ButtonTouchListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ButtonRenderer+ButtonTouchListener, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return n_onTouch(view, motionEvent);
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