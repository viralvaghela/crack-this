package mono.android.app.admin;

import android.app.admin.DevicePolicyManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.app.admin.DevicePolicyManager_OnClearApplicationUserDataListenerImplementor */
/* loaded from: classes.dex */
public class C0716x36f092e1 implements IGCUserPeer, DevicePolicyManager.OnClearApplicationUserDataListener {
    public static final String __md_methods = "n_onApplicationUserDataCleared:(Ljava/lang/String;Z)V:GetOnApplicationUserDataCleared_Ljava_lang_String_ZHandler:Android.App.Admin.DevicePolicyManager/IOnClearApplicationUserDataListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onApplicationUserDataCleared(String str, boolean z);

    static {
        Runtime.register("Android.App.Admin.DevicePolicyManager+IOnClearApplicationUserDataListenerImplementor, Mono.Android", C0716x36f092e1.class, __md_methods);
    }

    public C0716x36f092e1() {
        if (getClass() == C0716x36f092e1.class) {
            TypeManager.Activate("Android.App.Admin.DevicePolicyManager+IOnClearApplicationUserDataListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener
    public void onApplicationUserDataCleared(String str, boolean z) {
        n_onApplicationUserDataCleared(str, z);
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