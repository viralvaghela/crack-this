package mono.android.runtime;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class JavaObject implements IGCUserPeer {
    public static final String __md_methods = "n_equals:(Ljava/lang/Object;)Z:GetEquals_Ljava_lang_Object_Handler\nn_hashCode:()I:GetGetHashCodeHandler\nn_toString:()Ljava/lang/String;:GetToStringHandler\n";
    private ArrayList refList;

    private native boolean n_equals(Object obj);

    private native int n_hashCode();

    private native String n_toString();

    static {
        Runtime.register("Android.Runtime.JavaObject, Mono.Android", JavaObject.class, __md_methods);
    }

    public JavaObject() {
        if (getClass() == JavaObject.class) {
            TypeManager.Activate("Android.Runtime.JavaObject, Mono.Android", "", this, new Object[0]);
        }
    }

    public boolean equals(Object obj) {
        return n_equals(obj);
    }

    public int hashCode() {
        return n_hashCode();
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