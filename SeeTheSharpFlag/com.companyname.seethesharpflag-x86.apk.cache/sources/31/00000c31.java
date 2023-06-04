package mono.android.media;

import android.media.AudioRouting;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AudioRouting_OnRoutingChangedListenerImplementor implements IGCUserPeer, AudioRouting.OnRoutingChangedListener {
    public static final String __md_methods = "n_onRoutingChanged:(Landroid/media/AudioRouting;)V:GetOnRoutingChanged_Landroid_media_AudioRouting_Handler:Android.Media.IAudioRoutingOnRoutingChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onRoutingChanged(AudioRouting audioRouting);

    static {
        Runtime.register("Android.Media.IAudioRoutingOnRoutingChangedListenerImplementor, Mono.Android", AudioRouting_OnRoutingChangedListenerImplementor.class, __md_methods);
    }

    public AudioRouting_OnRoutingChangedListenerImplementor() {
        if (getClass() == AudioRouting_OnRoutingChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.IAudioRoutingOnRoutingChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.AudioRouting.OnRoutingChangedListener
    public void onRoutingChanged(AudioRouting audioRouting) {
        n_onRoutingChanged(audioRouting);
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