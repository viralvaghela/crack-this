package mono.android.media.audiofx;

import android.media.audiofx.AudioEffect;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AudioEffect_OnControlStatusChangeListenerImplementor implements IGCUserPeer, AudioEffect.OnControlStatusChangeListener {
    public static final String __md_methods = "n_onControlStatusChange:(Landroid/media/audiofx/AudioEffect;Z)V:GetOnControlStatusChange_Landroid_media_audiofx_AudioEffect_ZHandler:Android.Media.Audiofx.AudioEffect/IOnControlStatusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onControlStatusChange(AudioEffect audioEffect, boolean z);

    static {
        Runtime.register("Android.Media.Audiofx.AudioEffect+IOnControlStatusChangeListenerImplementor, Mono.Android", AudioEffect_OnControlStatusChangeListenerImplementor.class, __md_methods);
    }

    public AudioEffect_OnControlStatusChangeListenerImplementor() {
        if (getClass() == AudioEffect_OnControlStatusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.AudioEffect+IOnControlStatusChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
    public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
        n_onControlStatusChange(audioEffect, z);
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