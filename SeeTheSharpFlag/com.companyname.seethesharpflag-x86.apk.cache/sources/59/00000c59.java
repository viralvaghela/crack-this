package mono.android.media.audiofx;

import android.media.audiofx.PresetReverb;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PresetReverb_OnParameterChangeListenerImplementor implements IGCUserPeer, PresetReverb.OnParameterChangeListener {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/PresetReverb;IIS)V:GetOnParameterChange_Landroid_media_audiofx_PresetReverb_IISHandler:Android.Media.Audiofx.PresetReverb/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onParameterChange(PresetReverb presetReverb, int i, int i2, short s);

    static {
        Runtime.register("Android.Media.Audiofx.PresetReverb+IOnParameterChangeListenerImplementor, Mono.Android", PresetReverb_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public PresetReverb_OnParameterChangeListenerImplementor() {
        if (getClass() == PresetReverb_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.PresetReverb+IOnParameterChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.audiofx.PresetReverb.OnParameterChangeListener
    public void onParameterChange(PresetReverb presetReverb, int i, int i2, short s) {
        n_onParameterChange(presetReverb, i, i2, s);
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