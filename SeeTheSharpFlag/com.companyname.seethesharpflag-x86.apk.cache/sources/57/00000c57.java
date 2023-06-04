package mono.android.media.audiofx;

import android.media.audiofx.EnvironmentalReverb;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EnvironmentalReverb_OnParameterChangeListenerImplementor implements IGCUserPeer, EnvironmentalReverb.OnParameterChangeListener {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/EnvironmentalReverb;III)V:GetOnParameterChange_Landroid_media_audiofx_EnvironmentalReverb_IIIHandler:Android.Media.Audiofx.EnvironmentalReverb/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onParameterChange(EnvironmentalReverb environmentalReverb, int i, int i2, int i3);

    static {
        Runtime.register("Android.Media.Audiofx.EnvironmentalReverb+IOnParameterChangeListenerImplementor, Mono.Android", EnvironmentalReverb_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public EnvironmentalReverb_OnParameterChangeListenerImplementor() {
        if (getClass() == EnvironmentalReverb_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.EnvironmentalReverb+IOnParameterChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener
    public void onParameterChange(EnvironmentalReverb environmentalReverb, int i, int i2, int i3) {
        n_onParameterChange(environmentalReverb, i, i2, i3);
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