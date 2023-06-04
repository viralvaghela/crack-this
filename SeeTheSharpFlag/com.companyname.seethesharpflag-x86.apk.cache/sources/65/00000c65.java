package mono.android.net.sip;

import android.net.sip.SipRegistrationListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SipRegistrationListenerImplementor implements IGCUserPeer, SipRegistrationListener {
    public static final String __md_methods = "n_onRegistering:(Ljava/lang/String;)V:GetOnRegistering_Ljava_lang_String_Handler:Android.Net.Sip.ISipRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRegistrationDone:(Ljava/lang/String;J)V:GetOnRegistrationDone_Ljava_lang_String_JHandler:Android.Net.Sip.ISipRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRegistrationFailed:(Ljava/lang/String;ILjava/lang/String;)V:GetOnRegistrationFailed_Ljava_lang_String_ILjava_lang_String_Handler:Android.Net.Sip.ISipRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onRegistering(String str);

    private native void n_onRegistrationDone(String str, long j);

    private native void n_onRegistrationFailed(String str, int i, String str2);

    static {
        Runtime.register("Android.Net.Sip.ISipRegistrationListenerImplementor, Mono.Android", SipRegistrationListenerImplementor.class, __md_methods);
    }

    public SipRegistrationListenerImplementor() {
        if (getClass() == SipRegistrationListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Sip.ISipRegistrationListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.sip.SipRegistrationListener
    public void onRegistering(String str) {
        n_onRegistering(str);
    }

    @Override // android.net.sip.SipRegistrationListener
    public void onRegistrationDone(String str, long j) {
        n_onRegistrationDone(str, j);
    }

    @Override // android.net.sip.SipRegistrationListener
    public void onRegistrationFailed(String str, int i, String str2) {
        n_onRegistrationFailed(str, i, str2);
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