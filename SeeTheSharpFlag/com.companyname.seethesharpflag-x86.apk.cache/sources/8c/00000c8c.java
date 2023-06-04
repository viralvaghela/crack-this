package mono.android.speech.tts;

import android.speech.tts.TextToSpeech;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TextToSpeech_OnInitListenerImplementor implements IGCUserPeer, TextToSpeech.OnInitListener {
    public static final String __md_methods = "n_onInit:(I)V:GetOnInit_IHandler:Android.Speech.Tts.TextToSpeech/IOnInitListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onInit(int i);

    static {
        Runtime.register("Android.Speech.Tts.TextToSpeech+IOnInitListenerImplementor, Mono.Android", TextToSpeech_OnInitListenerImplementor.class, __md_methods);
    }

    public TextToSpeech_OnInitListenerImplementor() {
        if (getClass() == TextToSpeech_OnInitListenerImplementor.class) {
            TypeManager.Activate("Android.Speech.Tts.TextToSpeech+IOnInitListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        n_onInit(i);
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