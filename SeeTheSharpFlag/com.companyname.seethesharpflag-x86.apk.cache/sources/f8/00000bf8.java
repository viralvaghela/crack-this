package mono.android.app;

import android.app.AppOpsManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AppOpsManager_OnOpActiveChangedListenerImplementor implements IGCUserPeer, AppOpsManager.OnOpActiveChangedListener {
    public static final String __md_methods = "n_onOpActiveChanged:(Ljava/lang/String;ILjava/lang/String;Z)V:GetOnOpActiveChanged_Ljava_lang_String_ILjava_lang_String_ZHandler:Android.App.AppOpsManager/IOnOpActiveChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onOpActiveChanged(String str, int i, String str2, boolean z);

    static {
        Runtime.register("Android.App.AppOpsManager+IOnOpActiveChangedListenerImplementor, Mono.Android", AppOpsManager_OnOpActiveChangedListenerImplementor.class, __md_methods);
    }

    public AppOpsManager_OnOpActiveChangedListenerImplementor() {
        if (getClass() == AppOpsManager_OnOpActiveChangedListenerImplementor.class) {
            TypeManager.Activate("Android.App.AppOpsManager+IOnOpActiveChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public void onOpActiveChanged(String str, int i, String str2, boolean z) {
        n_onOpActiveChanged(str, i, str2, z);
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