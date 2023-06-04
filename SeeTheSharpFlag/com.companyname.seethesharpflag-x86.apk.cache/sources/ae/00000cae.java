package mono.android.view;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnLayoutChangeListenerImplementor implements IGCUserPeer, View.OnLayoutChangeListener {
    public static final String __md_methods = "n_onLayoutChange:(Landroid/view/View;IIIIIIII)V:GetOnLayoutChange_Landroid_view_View_IIIIIIIIHandler:Android.Views.View/IOnLayoutChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    static {
        Runtime.register("Android.Views.View+IOnLayoutChangeListenerImplementor, Mono.Android", View_OnLayoutChangeListenerImplementor.class, __md_methods);
    }

    public View_OnLayoutChangeListenerImplementor() {
        if (getClass() == View_OnLayoutChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnLayoutChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        n_onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
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