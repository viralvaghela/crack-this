package mono.android.location;

import android.location.GnssAntennaInfo;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GnssAntennaInfo_ListenerImplementor implements IGCUserPeer, GnssAntennaInfo.Listener {
    public static final String __md_methods = "n_onGnssAntennaInfoReceived:(Ljava/util/List;)V:GetOnGnssAntennaInfoReceived_Ljava_util_List_Handler:Android.Locations.GnssAntennaInfo/IListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onGnssAntennaInfoReceived(List list);

    static {
        Runtime.register("Android.Locations.GnssAntennaInfo+IListenerImplementor, Mono.Android", GnssAntennaInfo_ListenerImplementor.class, __md_methods);
    }

    public GnssAntennaInfo_ListenerImplementor() {
        if (getClass() == GnssAntennaInfo_ListenerImplementor.class) {
            TypeManager.Activate("Android.Locations.GnssAntennaInfo+IListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.location.GnssAntennaInfo.Listener
    public void onGnssAntennaInfoReceived(List list) {
        n_onGnssAntennaInfoReceived(list);
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