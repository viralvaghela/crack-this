package mono.android.animation;

import android.animation.Animator;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Animator_AnimatorListenerImplementor implements IGCUserPeer, Animator.AnimatorListener {
    public static final String __md_methods = "n_onAnimationCancel:(Landroid/animation/Animator;)V:GetOnAnimationCancel_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationEnd:(Landroid/animation/Animator;)V:GetOnAnimationEnd_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationRepeat:(Landroid/animation/Animator;)V:GetOnAnimationRepeat_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationStart:(Landroid/animation/Animator;)V:GetOnAnimationStart_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAnimationCancel(Animator animator);

    private native void n_onAnimationEnd(Animator animator);

    private native void n_onAnimationRepeat(Animator animator);

    private native void n_onAnimationStart(Animator animator);

    static {
        Runtime.register("Android.Animation.Animator+IAnimatorListenerImplementor, Mono.Android", Animator_AnimatorListenerImplementor.class, "n_onAnimationCancel:(Landroid/animation/Animator;)V:GetOnAnimationCancel_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationEnd:(Landroid/animation/Animator;)V:GetOnAnimationEnd_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationRepeat:(Landroid/animation/Animator;)V:GetOnAnimationRepeat_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationStart:(Landroid/animation/Animator;)V:GetOnAnimationStart_Landroid_animation_Animator_Handler:Android.Animation.Animator/IAnimatorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public Animator_AnimatorListenerImplementor() {
        if (getClass() == Animator_AnimatorListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.Animator+IAnimatorListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        n_onAnimationCancel(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        n_onAnimationEnd(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        n_onAnimationRepeat(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        n_onAnimationStart(animator);
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