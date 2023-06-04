package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling extends SwipeRefreshLayout implements IGCUserPeer {
    public static final String __md_methods = "n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\nn_onNestedScrollAccepted:(Landroid/view/View;Landroid/view/View;I)V:GetOnNestedScrollAccepted_Landroid_view_View_Landroid_view_View_IHandler\nn_onStopNestedScroll:(Landroid/view/View;)V:GetOnStopNestedScroll_Landroid_view_View_Handler\nn_onNestedScroll:(Landroid/view/View;IIII)V:GetOnNestedScroll_Landroid_view_View_IIIIHandler\n";
    private ArrayList refList;

    private native boolean n_onInterceptTouchEvent(MotionEvent motionEvent);

    private native void n_onNestedScroll(View view, int i, int i2, int i3, int i4);

    private native void n_onNestedScrollAccepted(View view, View view2, int i);

    private native void n_onStopNestedScroll(View view);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ListViewRenderer+SwipeRefreshLayoutWithFixedNestedScrolling, Xamarin.Forms.Platform.Android", ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling.class, __md_methods);
    }

    public ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling(Context context) {
        super(context);
        if (getClass() == ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ListViewRenderer+SwipeRefreshLayoutWithFixedNestedScrolling, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == ListViewRenderer_SwipeRefreshLayoutWithFixedNestedScrolling.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ListViewRenderer+SwipeRefreshLayoutWithFixedNestedScrolling, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return n_onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        n_onNestedScrollAccepted(view, view2, i);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        n_onStopNestedScroll(view);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n_onNestedScroll(view, i, i2, i3, i4);
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