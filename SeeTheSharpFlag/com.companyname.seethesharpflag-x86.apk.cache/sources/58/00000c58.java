package mono.android.media.audiofx;

import android.media.audiofx.Equalizer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Equalizer_OnParameterChangeListenerImplementor implements IGCUserPeer, Equalizer.OnParameterChangeListener {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/Equalizer;IIII)V:GetOnParameterChange_Landroid_media_audiofx_Equalizer_IIIIHandler:Android.Media.Audiofx.Equalizer/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onParameterChange(Equalizer equalizer, int i, int i2, int i3, int i4);

    static {
        Runtime.register("Android.Media.Audiofx.Equalizer+IOnParameterChangeListenerImplementor, Mono.Android", Equalizer_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public Equalizer_OnParameterChangeListenerImplementor() {
        if (getClass() == Equalizer_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.Equalizer+IOnParameterChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.audiofx.Equalizer.OnParameterChangeListener
    public void onParameterChange(Equalizer equalizer, int i, int i2, int i3, int i4) {
        n_onParameterChange(equalizer, i, i2, i3, i4);
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