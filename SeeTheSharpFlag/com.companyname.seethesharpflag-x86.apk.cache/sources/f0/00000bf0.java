package mono.android.animation;

import android.animation.Animator;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Animator_AnimatorPauseListenerImplementor implements IGCUserPeer, Animator.AnimatorPauseListener {
    public static final String __md_methods = "n_onAnimationPause:(Landroid/animation/Animator;)V:GetOnAnimationPause_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorPauseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationResume:(Landroid/animation/Animator;)V:GetOnAnimationResume_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorPauseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAnimationPause(Animator animator);

    private native void n_onAnimationResume(Animator animator);

    static {
        Runtime.register("Android.Animation.Animator+IAnimatorPauseListenerImplementor, Mono.Android", Animator_AnimatorPauseListenerImplementor.class, __md_methods);
    }

    public Animator_AnimatorPauseListenerImplementor() {
        if (getClass() == Animator_AnimatorPauseListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.Animator+IAnimatorPauseListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        n_onAnimationPause(animator);
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        n_onAnimationResume(animator);
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