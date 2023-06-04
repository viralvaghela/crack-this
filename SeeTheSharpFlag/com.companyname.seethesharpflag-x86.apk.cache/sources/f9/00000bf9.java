package mono.android.app;

import android.app.AppOpsManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AppOpsManager_OnOpChangedListenerImplementor implements IGCUserPeer, AppOpsManager.OnOpChangedListener {
    public static final String __md_methods = "n_onOpChanged:(Ljava/lang/String;Ljava/lang/String;)V:GetOnOpChanged_Ljava_lang_String_Ljava_lang_String_Handler:Android.App.AppOpsManager/IOnOpChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onOpChanged(String str, String str2);

    static {
        Runtime.register("Android.App.AppOpsManager+IOnOpChangedListenerImplementor, Mono.Android", AppOpsManager_OnOpChangedListenerImplementor.class, __md_methods);
    }

    public AppOpsManager_OnOpChangedListenerImplementor() {
        if (getClass() == AppOpsManager_OnOpChangedListenerImplementor.class) {
            TypeManager.Activate("Android.App.AppOpsManager+IOnOpChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.AppOpsManager.OnOpChangedListener
    public void onOpChanged(String str, String str2) {
        n_onOpChanged(str, str2);
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