package mono.android.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Application_OnProvideAssistDataListenerImplementor implements IGCUserPeer, Application.OnProvideAssistDataListener {
    public static final String __md_methods = "n_onProvideAssistData:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnProvideAssistData_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IOnProvideAssistDataListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onProvideAssistData(Activity activity, Bundle bundle);

    static {
        Runtime.register("Android.App.Application+IOnProvideAssistDataListenerImplementor, Mono.Android", Application_OnProvideAssistDataListenerImplementor.class, __md_methods);
    }

    public Application_OnProvideAssistDataListenerImplementor() {
        if (getClass() == Application_OnProvideAssistDataListenerImplementor.class) {
            TypeManager.Activate("Android.App.Application+IOnProvideAssistDataListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.Application.OnProvideAssistDataListener
    public void onProvideAssistData(Activity activity, Bundle bundle) {
        n_onProvideAssistData(activity, bundle);
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