package mono.java.util;

import java.util.ArrayList;
import java.util.EventListener;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EventListenerImplementor implements IGCUserPeer, EventListener {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Java.Util.IEventListenerImplementor, Mono.Android", EventListenerImplementor.class, "");
    }

    public EventListenerImplementor() {
        if (getClass() == EventListenerImplementor.class) {
            TypeManager.Activate("Java.Util.IEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
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