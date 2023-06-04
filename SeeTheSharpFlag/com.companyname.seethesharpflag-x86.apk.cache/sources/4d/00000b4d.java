package crc643f46942d9dd1fff9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GenericAnimatorListener extends AnimatorListenerAdapter implements IGCUserPeer {
    public static final String __md_methods = "n_onAnimationCancel:(Landroid/animation/Animator;)V:GetOnAnimationCancel_Landroid_animation_Animator_Handler\nn_onAnimationEnd:(Landroid/animation/Animator;)V:GetOnAnimationEnd_Landroid_animation_Animator_Handler\nn_onAnimationRepeat:(Landroid/animation/Animator;)V:GetOnAnimationRepeat_Landroid_animation_Animator_Handler\nn_finalize:()V:GetJavaFinalizeHandler\n";
    private ArrayList refList;

    private native void n_finalize();

    private native void n_onAnimationCancel(Animator animator);

    private native void n_onAnimationEnd(Animator animator);

    private native void n_onAnimationRepeat(Animator animator);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.GenericAnimatorListener, Xamarin.Forms.Platform.Android", GenericAnimatorListener.class, __md_methods);
    }

    public GenericAnimatorListener() {
        if (getClass() == GenericAnimatorListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.GenericAnimatorListener, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        n_onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        n_onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        n_onAnimationRepeat(animator);
    }

    public void finalize() {
        n_finalize();
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