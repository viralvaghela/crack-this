package mono.android.transition;

import android.transition.Transition;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Transition_TransitionListenerImplementor implements IGCUserPeer, Transition.TransitionListener {
    public static final String __md_methods = "n_onTransitionCancel:(Landroid/transition/Transition;)V:GetOnTransitionCancel_Landroid_transition_Transition_Handler:Android.Transitions.Transition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTransitionEnd:(Landroid/transition/Transition;)V:GetOnTransitionEnd_Landroid_transition_Transition_Handler:Android.Transitions.Transition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTransitionPause:(Landroid/transition/Transition;)V:GetOnTransitionPause_Landroid_transition_Transition_Handler:Android.Transitions.Transition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTransitionResume:(Landroid/transition/Transition;)V:GetOnTransitionResume_Landroid_transition_Transition_Handler:Android.Transitions.Transition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTransitionStart:(Landroid/transition/Transition;)V:GetOnTransitionStart_Landroid_transition_Transition_Handler:Android.Transitions.Transition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTransitionCancel(Transition transition);

    private native void n_onTransitionEnd(Transition transition);

    private native void n_onTransitionPause(Transition transition);

    private native void n_onTransitionResume(Transition transition);

    private native void n_onTransitionStart(Transition transition);

    static {
        Runtime.register("Android.Transitions.Transition+ITransitionListenerImplementor, Mono.Android", Transition_TransitionListenerImplementor.class, __md_methods);
    }

    public Transition_TransitionListenerImplementor() {
        if (getClass() == Transition_TransitionListenerImplementor.class) {
            TypeManager.Activate("Android.Transitions.Transition+ITransitionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        n_onTransitionCancel(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        n_onTransitionEnd(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        n_onTransitionPause(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        n_onTransitionResume(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        n_onTransitionStart(transition);
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