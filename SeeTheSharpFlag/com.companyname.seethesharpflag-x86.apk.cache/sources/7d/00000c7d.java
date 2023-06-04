package mono.android.p005os;

import android.os.StrictMode;
import android.os.strictmode.Violation;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.StrictMode_OnVmViolationListenerImplementor */
/* loaded from: classes.dex */
public class StrictMode_OnVmViolationListenerImplementor implements IGCUserPeer, StrictMode.OnVmViolationListener {
    public static final String __md_methods = "n_onVmViolation:(Landroid/os/strictmode/Violation;)V:GetOnVmViolation_Landroid_os_strictmode_Violation_Handler:Android.OS.StrictMode/IOnVmViolationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onVmViolation(Violation violation);

    static {
        Runtime.register("Android.OS.StrictMode+IOnVmViolationListenerImplementor, Mono.Android", StrictMode_OnVmViolationListenerImplementor.class, __md_methods);
    }

    public StrictMode_OnVmViolationListenerImplementor() {
        if (getClass() == StrictMode_OnVmViolationListenerImplementor.class) {
            TypeManager.Activate("Android.OS.StrictMode+IOnVmViolationListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.StrictMode.OnVmViolationListener
    public void onVmViolation(Violation violation) {
        n_onVmViolation(violation);
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