package mono.android.content;

import android.content.Loader;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Loader_OnLoadCanceledListenerImplementor implements IGCUserPeer, Loader.OnLoadCanceledListener {
    public static final String __md_methods = "n_onLoadCanceled:(Landroid/content/Loader;)V:GetOnLoadCanceled_Landroid_content_Loader_Handler:Android.Content.Loader/IOnLoadCanceledListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onLoadCanceled(Loader loader);

    static {
        Runtime.register("Android.Content.Loader+IOnLoadCanceledListenerImplementor, Mono.Android", Loader_OnLoadCanceledListenerImplementor.class, __md_methods);
    }

    public Loader_OnLoadCanceledListenerImplementor() {
        if (getClass() == Loader_OnLoadCanceledListenerImplementor.class) {
            TypeManager.Activate("Android.Content.Loader+IOnLoadCanceledListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.Loader.OnLoadCanceledListener
    public void onLoadCanceled(Loader loader) {
        n_onLoadCanceled(loader);
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