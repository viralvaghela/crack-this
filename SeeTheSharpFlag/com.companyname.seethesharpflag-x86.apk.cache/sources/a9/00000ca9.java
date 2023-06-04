package mono.android.view;

import android.view.DragEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnDragListenerImplementor implements IGCUserPeer, View.OnDragListener {
    public static final String __md_methods = "n_onDrag:(Landroid/view/View;Landroid/view/DragEvent;)Z:GetOnDrag_Landroid_view_View_Landroid_view_DragEvent_Handler:Android.Views.View/IOnDragListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onDrag(View view, DragEvent dragEvent);

    static {
        Runtime.register("Android.Views.View+IOnDragListenerImplementor, Mono.Android", View_OnDragListenerImplementor.class, "n_onDrag:(Landroid/view/View;Landroid/view/DragEvent;)Z:GetOnDrag_Landroid_view_View_Landroid_view_DragEvent_Handler:Android.Views.View/IOnDragListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public View_OnDragListenerImplementor() {
        if (getClass() == View_OnDragListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnDragListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        return n_onDrag(view, dragEvent);
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