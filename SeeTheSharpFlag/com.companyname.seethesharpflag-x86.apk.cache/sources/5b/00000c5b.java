package mono.android.media.audiofx;

import android.media.audiofx.Visualizer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Visualizer_OnDataCaptureListenerImplementor implements IGCUserPeer, Visualizer.OnDataCaptureListener {
    public static final String __md_methods = "n_onFftDataCapture:(Landroid/media/audiofx/Visualizer;[BI)V:GetOnFftDataCapture_Landroid_media_audiofx_Visualizer_arrayBIHandler:Android.Media.Audiofx.Visualizer/IOnDataCaptureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onWaveFormDataCapture:(Landroid/media/audiofx/Visualizer;[BI)V:GetOnWaveFormDataCapture_Landroid_media_audiofx_Visualizer_arrayBIHandler:Android.Media.Audiofx.Visualizer/IOnDataCaptureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onFftDataCapture(Visualizer visualizer, byte[] bArr, int i);

    private native void n_onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i);

    static {
        Runtime.register("Android.Media.Audiofx.Visualizer+IOnDataCaptureListenerImplementor, Mono.Android", Visualizer_OnDataCaptureListenerImplementor.class, __md_methods);
    }

    public Visualizer_OnDataCaptureListenerImplementor() {
        if (getClass() == Visualizer_OnDataCaptureListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.Visualizer+IOnDataCaptureListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        n_onFftDataCapture(visualizer, bArr, i);
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        n_onWaveFormDataCapture(visualizer, bArr, i);
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