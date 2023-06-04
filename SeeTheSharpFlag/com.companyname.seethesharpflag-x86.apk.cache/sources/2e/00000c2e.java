package mono.android.location;

import android.location.OnNmeaMessageListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnNmeaMessageListenerImplementor implements IGCUserPeer, OnNmeaMessageListener {
    public static final String __md_methods = "n_onNmeaMessage:(Ljava/lang/String;J)V:GetOnNmeaMessage_Ljava_lang_String_JHandler:Android.Locations.IOnNmeaMessageListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onNmeaMessage(String str, long j);

    static {
        Runtime.register("Android.Locations.IOnNmeaMessageListenerImplementor, Mono.Android", OnNmeaMessageListenerImplementor.class, __md_methods);
    }

    public OnNmeaMessageListenerImplementor() {
        if (getClass() == OnNmeaMessageListenerImplementor.class) {
            TypeManager.Activate("Android.Locations.IOnNmeaMessageListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.location.OnNmeaMessageListener
    public void onNmeaMessage(String str, long j) {
        n_onNmeaMessage(str, j);
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