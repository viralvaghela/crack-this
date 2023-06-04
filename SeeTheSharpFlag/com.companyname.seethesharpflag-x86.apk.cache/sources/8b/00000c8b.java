package mono.android.speech;

import android.os.Bundle;
import android.speech.RecognitionListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RecognitionListenerImplementor implements IGCUserPeer, RecognitionListener {
    public static final String __md_methods = "n_onBeginningOfSpeech:()V:GetOnBeginningOfSpeechHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onBufferReceived:([B)V:GetOnBufferReceived_arrayBHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onEndOfSpeech:()V:GetOnEndOfSpeechHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onError:(I)V:GetOnError_IHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onEvent:(ILandroid/os/Bundle;)V:GetOnEvent_ILandroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPartialResults:(Landroid/os/Bundle;)V:GetOnPartialResults_Landroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onReadyForSpeech:(Landroid/os/Bundle;)V:GetOnReadyForSpeech_Landroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onResults:(Landroid/os/Bundle;)V:GetOnResults_Landroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRmsChanged:(F)V:GetOnRmsChanged_FHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onBeginningOfSpeech();

    private native void n_onBufferReceived(byte[] bArr);

    private native void n_onEndOfSpeech();

    private native void n_onError(int i);

    private native void n_onEvent(int i, Bundle bundle);

    private native void n_onPartialResults(Bundle bundle);

    private native void n_onReadyForSpeech(Bundle bundle);

    private native void n_onResults(Bundle bundle);

    private native void n_onRmsChanged(float f);

    static {
        Runtime.register("Android.Speech.IRecognitionListenerImplementor, Mono.Android", RecognitionListenerImplementor.class, __md_methods);
    }

    public RecognitionListenerImplementor() {
        if (getClass() == RecognitionListenerImplementor.class) {
            TypeManager.Activate("Android.Speech.IRecognitionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
        n_onBeginningOfSpeech();
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] bArr) {
        n_onBufferReceived(bArr);
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
        n_onEndOfSpeech();
    }

    @Override // android.speech.RecognitionListener
    public void onError(int i) {
        n_onError(i);
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int i, Bundle bundle) {
        n_onEvent(i, bundle);
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle bundle) {
        n_onPartialResults(bundle);
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle bundle) {
        n_onReadyForSpeech(bundle);
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle bundle) {
        n_onResults(bundle);
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float f) {
        n_onRmsChanged(f);
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