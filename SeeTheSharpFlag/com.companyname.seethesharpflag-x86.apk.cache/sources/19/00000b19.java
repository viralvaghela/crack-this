package crc643f46942d9dd1fff9;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CarouselViewRenderer_CarouselViewwOnGlobalLayoutListener implements IGCUserPeer, ViewTreeObserver.OnGlobalLayoutListener {
    public static final String __md_methods = "n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGlobalLayout();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CarouselViewRenderer+CarouselViewwOnGlobalLayoutListener, Xamarin.Forms.Platform.Android", CarouselViewRenderer_CarouselViewwOnGlobalLayoutListener.class, "n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public CarouselViewRenderer_CarouselViewwOnGlobalLayoutListener() {
        if (getClass() == CarouselViewRenderer_CarouselViewwOnGlobalLayoutListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CarouselViewRenderer+CarouselViewwOnGlobalLayoutListener, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        n_onGlobalLayout();
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