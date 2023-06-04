package crc643f46942d9dd1fff9;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ObjectJavaBox_1 implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ObjectJavaBox`1, Xamarin.Forms.Platform.Android", ObjectJavaBox_1.class, "");
    }

    public ObjectJavaBox_1() {
        if (getClass() == ObjectJavaBox_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ObjectJavaBox`1, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
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