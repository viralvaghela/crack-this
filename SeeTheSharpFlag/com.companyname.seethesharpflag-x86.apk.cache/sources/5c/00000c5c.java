package mono.android.media.effect;

import android.media.effect.Effect;
import android.media.effect.EffectUpdateListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EffectUpdateListenerImplementor implements IGCUserPeer, EffectUpdateListener {
    public static final String __md_methods = "n_onEffectUpdated:(Landroid/media/effect/Effect;Ljava/lang/Object;)V:GetOnEffectUpdated_Landroid_media_effect_Effect_Ljava_lang_Object_Handler:Android.Media.Effect.IEffectUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onEffectUpdated(Effect effect, Object obj);

    static {
        Runtime.register("Android.Media.Effect.IEffectUpdateListenerImplementor, Mono.Android", EffectUpdateListenerImplementor.class, __md_methods);
    }

    public EffectUpdateListenerImplementor() {
        if (getClass() == EffectUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Effect.IEffectUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.effect.EffectUpdateListener
    public void onEffectUpdated(Effect effect, Object obj) {
        n_onEffectUpdated(effect, obj);
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