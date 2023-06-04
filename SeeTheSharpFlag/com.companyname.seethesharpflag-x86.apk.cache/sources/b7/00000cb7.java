package mono.android.view;

import android.graphics.Rect;
import android.view.Window;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Window_OnRestrictedCaptionAreaChangedListenerImplementor implements IGCUserPeer, Window.OnRestrictedCaptionAreaChangedListener {
    public static final String __md_methods = "n_onRestrictedCaptionAreaChanged:(Landroid/graphics/Rect;)V:GetOnRestrictedCaptionAreaChanged_Landroid_graphics_Rect_Handler:Android.Views.Window/IOnRestrictedCaptionAreaChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onRestrictedCaptionAreaChanged(Rect rect);

    static {
        Runtime.register("Android.Views.Window+IOnRestrictedCaptionAreaChangedListenerImplementor, Mono.Android", Window_OnRestrictedCaptionAreaChangedListenerImplementor.class, __md_methods);
    }

    public Window_OnRestrictedCaptionAreaChangedListenerImplementor() {
        if (getClass() == Window_OnRestrictedCaptionAreaChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Views.Window+IOnRestrictedCaptionAreaChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.Window.OnRestrictedCaptionAreaChangedListener
    public void onRestrictedCaptionAreaChanged(Rect rect) {
        n_onRestrictedCaptionAreaChanged(rect);
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