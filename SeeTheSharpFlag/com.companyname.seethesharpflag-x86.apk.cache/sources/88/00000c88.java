package mono.android.sax;

import android.sax.EndTextElementListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EndTextElementListenerImplementor implements IGCUserPeer, EndTextElementListener {
    public static final String __md_methods = "n_end:(Ljava/lang/String;)V:GetEnd_Ljava_lang_String_Handler:Android.Sax.IEndTextElementListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_end(String str);

    static {
        Runtime.register("Android.Sax.IEndTextElementListenerImplementor, Mono.Android", EndTextElementListenerImplementor.class, __md_methods);
    }

    public EndTextElementListenerImplementor() {
        if (getClass() == EndTextElementListenerImplementor.class) {
            TypeManager.Activate("Android.Sax.IEndTextElementListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.sax.EndTextElementListener
    public void end(String str) {
        n_end(str);
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