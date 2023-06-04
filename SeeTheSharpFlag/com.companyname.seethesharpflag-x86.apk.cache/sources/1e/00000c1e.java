package mono.android.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Icon_OnDrawableLoadedListenerImplementor implements IGCUserPeer, Icon.OnDrawableLoadedListener {
    public static final String __md_methods = "n_onDrawableLoaded:(Landroid/graphics/drawable/Drawable;)V:GetOnDrawableLoaded_Landroid_graphics_drawable_Drawable_Handler:Android.Graphics.Drawables.Icon/IOnDrawableLoadedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrawableLoaded(Drawable drawable);

    static {
        Runtime.register("Android.Graphics.Drawables.Icon+IOnDrawableLoadedListenerImplementor, Mono.Android", Icon_OnDrawableLoadedListenerImplementor.class, __md_methods);
    }

    public Icon_OnDrawableLoadedListenerImplementor() {
        if (getClass() == Icon_OnDrawableLoadedListenerImplementor.class) {
            TypeManager.Activate("Android.Graphics.Drawables.Icon+IOnDrawableLoadedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public void onDrawableLoaded(Drawable drawable) {
        n_onDrawableLoaded(drawable);
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