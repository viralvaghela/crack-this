package mono.android.p005os;

import android.os.StrictMode;
import android.os.strictmode.Violation;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.StrictMode_OnThreadViolationListenerImplementor */
/* loaded from: classes.dex */
public class StrictMode_OnThreadViolationListenerImplementor implements IGCUserPeer, StrictMode.OnThreadViolationListener {
    public static final String __md_methods = "n_onThreadViolation:(Landroid/os/strictmode/Violation;)V:GetOnThreadViolation_Landroid_os_strictmode_Violation_Handler:Android.OS.StrictMode/IOnThreadViolationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onThreadViolation(Violation violation);

    static {
        Runtime.register("Android.OS.StrictMode+IOnThreadViolationListenerImplementor, Mono.Android", StrictMode_OnThreadViolationListenerImplementor.class, __md_methods);
    }

    public StrictMode_OnThreadViolationListenerImplementor() {
        if (getClass() == StrictMode_OnThreadViolationListenerImplementor.class) {
            TypeManager.Activate("Android.OS.StrictMode+IOnThreadViolationListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.StrictMode.OnThreadViolationListener
    public void onThreadViolation(Violation violation) {
        n_onThreadViolation(violation);
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