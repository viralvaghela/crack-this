package mono.android.view;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnScrollChangeListenerImplementor implements IGCUserPeer, View.OnScrollChangeListener {
    public static final String __md_methods = "n_onScrollChange:(Landroid/view/View;IIII)V:GetOnScrollChange_Landroid_view_View_IIIIHandler:Android.Views.View/IOnScrollChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onScrollChange(View view, int i, int i2, int i3, int i4);

    static {
        Runtime.register("Android.Views.View+IOnScrollChangeListenerImplementor, Mono.Android", View_OnScrollChangeListenerImplementor.class, __md_methods);
    }

    public View_OnScrollChangeListenerImplementor() {
        if (getClass() == View_OnScrollChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnScrollChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        n_onScrollChange(view, i, i2, i3, i4);
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