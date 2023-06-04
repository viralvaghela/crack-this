package mono.android.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewGroup_OnHierarchyChangeListenerImplementor implements IGCUserPeer, ViewGroup.OnHierarchyChangeListener {
    public static final String __md_methods = "n_onChildViewAdded:(Landroid/view/View;Landroid/view/View;)V:GetOnChildViewAdded_Landroid_view_View_Landroid_view_View_Handler:Android.Views.ViewGroup/IOnHierarchyChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onChildViewRemoved:(Landroid/view/View;Landroid/view/View;)V:GetOnChildViewRemoved_Landroid_view_View_Landroid_view_View_Handler:Android.Views.ViewGroup/IOnHierarchyChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onChildViewAdded(View view, View view2);

    private native void n_onChildViewRemoved(View view, View view2);

    static {
        Runtime.register("Android.Views.ViewGroup+IOnHierarchyChangeListenerImplementor, Mono.Android", ViewGroup_OnHierarchyChangeListenerImplementor.class, __md_methods);
    }

    public ViewGroup_OnHierarchyChangeListenerImplementor() {
        if (getClass() == ViewGroup_OnHierarchyChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewGroup+IOnHierarchyChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        n_onChildViewAdded(view, view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        n_onChildViewRemoved(view, view2);
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