package mono.android.view;

import android.view.View;
import android.view.ViewStub;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewStub_OnInflateListenerImplementor implements IGCUserPeer, ViewStub.OnInflateListener {
    public static final String __md_methods = "n_onInflate:(Landroid/view/ViewStub;Landroid/view/View;)V:GetOnInflate_Landroid_view_ViewStub_Landroid_view_View_Handler:Android.Views.ViewStub/IOnInflateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onInflate(ViewStub viewStub, View view);

    static {
        Runtime.register("Android.Views.ViewStub+IOnInflateListenerImplementor, Mono.Android", ViewStub_OnInflateListenerImplementor.class, __md_methods);
    }

    public ViewStub_OnInflateListenerImplementor() {
        if (getClass() == ViewStub_OnInflateListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewStub+IOnInflateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewStub.OnInflateListener
    public void onInflate(ViewStub viewStub, View view) {
        n_onInflate(viewStub, view);
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