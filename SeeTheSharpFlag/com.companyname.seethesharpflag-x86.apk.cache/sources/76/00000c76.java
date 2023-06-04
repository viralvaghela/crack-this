package mono.android.p005os;

import android.os.CancellationSignal;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.CancellationSignal_OnCancelListenerImplementor */
/* loaded from: classes.dex */
public class CancellationSignal_OnCancelListenerImplementor implements IGCUserPeer, CancellationSignal.OnCancelListener {
    public static final String __md_methods = "n_onCancel:()V:GetOnCancelHandler:Android.OS.CancellationSignal/IOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCancel();

    static {
        Runtime.register("Android.OS.CancellationSignal+IOnCancelListenerImplementor, Mono.Android", CancellationSignal_OnCancelListenerImplementor.class, __md_methods);
    }

    public CancellationSignal_OnCancelListenerImplementor() {
        if (getClass() == CancellationSignal_OnCancelListenerImplementor.class) {
            TypeManager.Activate("Android.OS.CancellationSignal+IOnCancelListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        n_onCancel();
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