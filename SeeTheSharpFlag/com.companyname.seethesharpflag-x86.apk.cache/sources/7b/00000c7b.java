package mono.android.p005os;

import android.os.RecoverySystem;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.RecoverySystem_ProgressListenerImplementor */
/* loaded from: classes.dex */
public class RecoverySystem_ProgressListenerImplementor implements IGCUserPeer, RecoverySystem.ProgressListener {
    public static final String __md_methods = "n_onProgress:(I)V:GetOnProgress_IHandler:Android.OS.RecoverySystem/IProgressListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onProgress(int i);

    static {
        Runtime.register("Android.OS.RecoverySystem+IProgressListenerImplementor, Mono.Android", RecoverySystem_ProgressListenerImplementor.class, __md_methods);
    }

    public RecoverySystem_ProgressListenerImplementor() {
        if (getClass() == RecoverySystem_ProgressListenerImplementor.class) {
            TypeManager.Activate("Android.OS.RecoverySystem+IProgressListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.RecoverySystem.ProgressListener
    public void onProgress(int i) {
        n_onProgress(i);
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