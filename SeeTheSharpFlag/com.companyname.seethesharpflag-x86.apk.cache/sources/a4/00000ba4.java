package crc643f46942d9dd1fff9;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellSearchViewAdapter_ObjectWrapper implements IGCUserPeer {
    public static final String __md_methods = "n_toString:()Ljava/lang/String;:GetToStringHandler\n";
    private ArrayList refList;

    private native String n_toString();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellSearchViewAdapter+ObjectWrapper, Xamarin.Forms.Platform.Android", ShellSearchViewAdapter_ObjectWrapper.class, __md_methods);
    }

    public ShellSearchViewAdapter_ObjectWrapper() {
        if (getClass() == ShellSearchViewAdapter_ObjectWrapper.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellSearchViewAdapter+ObjectWrapper, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public String toString() {
        return n_toString();
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