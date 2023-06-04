package mono.android.p005os;

import android.os.PowerManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.PowerManager_OnThermalStatusChangedListenerImplementor */
/* loaded from: classes.dex */
public class PowerManager_OnThermalStatusChangedListenerImplementor implements IGCUserPeer, PowerManager.OnThermalStatusChangedListener {
    public static final String __md_methods = "n_onThermalStatusChanged:(I)V:GetOnThermalStatusChanged_IHandler:Android.OS.PowerManager/IOnThermalStatusChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onThermalStatusChanged(int i);

    static {
        Runtime.register("Android.OS.PowerManager+IOnThermalStatusChangedListenerImplementor, Mono.Android", PowerManager_OnThermalStatusChangedListenerImplementor.class, __md_methods);
    }

    public PowerManager_OnThermalStatusChangedListenerImplementor() {
        if (getClass() == PowerManager_OnThermalStatusChangedListenerImplementor.class) {
            TypeManager.Activate("Android.OS.PowerManager+IOnThermalStatusChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public void onThermalStatusChanged(int i) {
        n_onThermalStatusChanged(i);
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