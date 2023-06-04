package crc643f46942d9dd1fff9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PowerSaveModeBroadcastReceiver extends BroadcastReceiver implements IGCUserPeer {
    public static final String __md_methods = "n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n";
    private ArrayList refList;

    private native void n_onReceive(Context context, Intent intent);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.PowerSaveModeBroadcastReceiver, Xamarin.Forms.Platform.Android", PowerSaveModeBroadcastReceiver.class, __md_methods);
    }

    public PowerSaveModeBroadcastReceiver() {
        if (getClass() == PowerSaveModeBroadcastReceiver.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PowerSaveModeBroadcastReceiver, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n_onReceive(context, intent);
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