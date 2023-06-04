package mono.android.animation;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ValueAnimator_AnimatorUpdateListenerImplementor implements IGCUserPeer, ValueAnimator.AnimatorUpdateListener {
    public static final String __md_methods = "n_onAnimationUpdate:(Landroid/animation/ValueAnimator;)V:GetOnAnimationUpdate_Landroid_animation_ValueAnimator_Handler:Android.Animation.ValueAnimator/IAnimatorUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAnimationUpdate(ValueAnimator valueAnimator);

    static {
        Runtime.register("Android.Animation.ValueAnimator+IAnimatorUpdateListenerImplementor, Mono.Android", ValueAnimator_AnimatorUpdateListenerImplementor.class, __md_methods);
    }

    public ValueAnimator_AnimatorUpdateListenerImplementor() {
        if (getClass() == ValueAnimator_AnimatorUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.ValueAnimator+IAnimatorUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        n_onAnimationUpdate(valueAnimator);
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