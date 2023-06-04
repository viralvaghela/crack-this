package mono.android.nfc;

import android.nfc.NfcAdapter;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NfcAdapter_OnTagRemovedListenerImplementor implements IGCUserPeer, NfcAdapter.OnTagRemovedListener {
    public static final String __md_methods = "n_onTagRemoved:()V:GetOnTagRemovedHandler:Android.Nfc.NfcAdapter/IOnTagRemovedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTagRemoved();

    static {
        Runtime.register("Android.Nfc.NfcAdapter+IOnTagRemovedListenerImplementor, Mono.Android", NfcAdapter_OnTagRemovedListenerImplementor.class, __md_methods);
    }

    public NfcAdapter_OnTagRemovedListenerImplementor() {
        if (getClass() == NfcAdapter_OnTagRemovedListenerImplementor.class) {
            TypeManager.Activate("Android.Nfc.NfcAdapter+IOnTagRemovedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.nfc.NfcAdapter.OnTagRemovedListener
    public void onTagRemoved() {
        n_onTagRemoved();
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