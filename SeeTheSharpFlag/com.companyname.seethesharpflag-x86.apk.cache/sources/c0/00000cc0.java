package mono.android.widget;

import android.widget.AbsListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AbsListView_OnScrollListenerImplementor implements IGCUserPeer, AbsListView.OnScrollListener {
    public static final String __md_methods = "n_onScroll:(Landroid/widget/AbsListView;III)V:GetOnScroll_Landroid_widget_AbsListView_IIIHandler:Android.Widget.AbsListView/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onScrollStateChanged:(Landroid/widget/AbsListView;I)V:GetOnScrollStateChanged_Landroid_widget_AbsListView_IHandler:Android.Widget.AbsListView/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onScroll(AbsListView absListView, int i, int i2, int i3);

    private native void n_onScrollStateChanged(AbsListView absListView, int i);

    static {
        Runtime.register("Android.Widget.AbsListView+IOnScrollListenerImplementor, Mono.Android", AbsListView_OnScrollListenerImplementor.class, "n_onScroll:(Landroid/widget/AbsListView;III)V:GetOnScroll_Landroid_widget_AbsListView_IIIHandler:Android.Widget.AbsListView/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onScrollStateChanged:(Landroid/widget/AbsListView;I)V:GetOnScrollStateChanged_Landroid_widget_AbsListView_IHandler:Android.Widget.AbsListView/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public AbsListView_OnScrollListenerImplementor() {
        if (getClass() == AbsListView_OnScrollListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AbsListView+IOnScrollListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        n_onScroll(absListView, i, i2, i3);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        n_onScrollStateChanged(absListView, i);
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