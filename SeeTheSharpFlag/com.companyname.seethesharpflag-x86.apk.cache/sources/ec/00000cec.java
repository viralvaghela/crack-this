package mono.androidx.recyclerview.widget;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RecyclerView_OnItemTouchListenerImplementor implements IGCUserPeer, RecyclerView.OnItemTouchListener {
    public static final String __md_methods = "n_onInterceptTouchEvent:(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroidx_recyclerview_widget_RecyclerView_Landroid_view_MotionEvent_Handler:AndroidX.RecyclerView.Widget.RecyclerView/IOnItemTouchListenerInvoker, Xamarin.AndroidX.RecyclerView\nn_onRequestDisallowInterceptTouchEvent:(Z)V:GetOnRequestDisallowInterceptTouchEvent_ZHandler:AndroidX.RecyclerView.Widget.RecyclerView/IOnItemTouchListenerInvoker, Xamarin.AndroidX.RecyclerView\nn_onTouchEvent:(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V:GetOnTouchEvent_Landroidx_recyclerview_widget_RecyclerView_Landroid_view_MotionEvent_Handler:AndroidX.RecyclerView.Widget.RecyclerView/IOnItemTouchListenerInvoker, Xamarin.AndroidX.RecyclerView\n";
    private ArrayList refList;

    private native boolean n_onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

    private native void n_onRequestDisallowInterceptTouchEvent(boolean z);

    private native void n_onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

    static {
        Runtime.register("AndroidX.RecyclerView.Widget.RecyclerView+IOnItemTouchListenerImplementor, Xamarin.AndroidX.RecyclerView", RecyclerView_OnItemTouchListenerImplementor.class, __md_methods);
    }

    public RecyclerView_OnItemTouchListenerImplementor() {
        if (getClass() == RecyclerView_OnItemTouchListenerImplementor.class) {
            TypeManager.Activate("AndroidX.RecyclerView.Widget.RecyclerView+IOnItemTouchListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return n_onInterceptTouchEvent(recyclerView, motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        n_onRequestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        n_onTouchEvent(recyclerView, motionEvent);
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