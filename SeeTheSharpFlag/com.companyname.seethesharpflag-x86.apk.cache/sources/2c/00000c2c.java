package mono.android.location;

import android.location.GpsStatus;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GpsStatus_NmeaListenerImplementor implements IGCUserPeer, GpsStatus.NmeaListener {
    public static final String __md_methods = "n_onNmeaReceived:(JLjava/lang/String;)V:GetOnNmeaReceived_JLjava_lang_String_Handler:Android.Locations.GpsStatus/INmeaListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onNmeaReceived(long j, String str);

    static {
        Runtime.register("Android.Locations.GpsStatus+INmeaListenerImplementor, Mono.Android", GpsStatus_NmeaListenerImplementor.class, __md_methods);
    }

    public GpsStatus_NmeaListenerImplementor() {
        if (getClass() == GpsStatus_NmeaListenerImplementor.class) {
            TypeManager.Activate("Android.Locations.GpsStatus+INmeaListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.location.GpsStatus.NmeaListener
    public void onNmeaReceived(long j, String str) {
        n_onNmeaReceived(j, str);
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