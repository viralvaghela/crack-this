package mono.android.sax;

import android.sax.EndElementListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EndElementListenerImplementor implements IGCUserPeer, EndElementListener {
    public static final String __md_methods = "n_end:()V:GetEndHandler:Android.Sax.IEndElementListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_end();

    static {
        Runtime.register("Android.Sax.IEndElementListenerImplementor, Mono.Android", EndElementListenerImplementor.class, __md_methods);
    }

    public EndElementListenerImplementor() {
        if (getClass() == EndElementListenerImplementor.class) {
            TypeManager.Activate("Android.Sax.IEndElementListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.sax.EndElementListener
    public void end() {
        n_end();
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