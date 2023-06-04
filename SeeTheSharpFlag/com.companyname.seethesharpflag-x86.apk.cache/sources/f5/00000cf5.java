package mono.java.lang;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Runnable implements IGCUserPeer, java.lang.Runnable {
    public static final String __md_methods = "n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_run();

    static {
        Runtime.register("Java.Lang.Runnable, Mono.Android", Runnable.class, "n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public Runnable() {
        if (getClass() == Runnable.class) {
            TypeManager.Activate("Java.Lang.Runnable, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        n_run();
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