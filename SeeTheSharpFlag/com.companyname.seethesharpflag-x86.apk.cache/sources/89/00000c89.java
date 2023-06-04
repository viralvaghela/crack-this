package mono.android.sax;

import android.sax.StartElementListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class StartElementListenerImplementor implements IGCUserPeer, StartElementListener {
    public static final String __md_methods = "n_start:(Lorg/xml/sax/Attributes;)V:GetStart_Lorg_xml_sax_Attributes_Handler:Android.Sax.IStartElementListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_start(Attributes attributes);

    static {
        Runtime.register("Android.Sax.IStartElementListenerImplementor, Mono.Android", StartElementListenerImplementor.class, __md_methods);
    }

    public StartElementListenerImplementor() {
        if (getClass() == StartElementListenerImplementor.class) {
            TypeManager.Activate("Android.Sax.IStartElementListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.sax.StartElementListener
    public void start(Attributes attributes) {
        n_start(attributes);
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