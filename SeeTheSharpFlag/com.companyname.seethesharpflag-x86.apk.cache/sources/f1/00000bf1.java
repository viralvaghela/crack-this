package mono.android.animation;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class LayoutTransition_TransitionListenerImplementor implements IGCUserPeer, LayoutTransition.TransitionListener {
    public static final String __md_methods = "n_endTransition:(Landroid/animation/LayoutTransition;Landroid/view/ViewGroup;Landroid/view/View;I)V:GetEndTransition_Landroid_animation_LayoutTransition_Landroid_view_ViewGroup_Landroid_view_View_IHandler:Android.Animation.LayoutTransition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_startTransition:(Landroid/animation/LayoutTransition;Landroid/view/ViewGroup;Landroid/view/View;I)V:GetStartTransition_Landroid_animation_LayoutTransition_Landroid_view_ViewGroup_Landroid_view_View_IHandler:Android.Animation.LayoutTransition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i);

    private native void n_startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i);

    static {
        Runtime.register("Android.Animation.LayoutTransition+ITransitionListenerImplementor, Mono.Android", LayoutTransition_TransitionListenerImplementor.class, __md_methods);
    }

    public LayoutTransition_TransitionListenerImplementor() {
        if (getClass() == LayoutTransition_TransitionListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.LayoutTransition+ITransitionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        n_endTransition(layoutTransition, viewGroup, view, i);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        n_startTransition(layoutTransition, viewGroup, view, i);
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