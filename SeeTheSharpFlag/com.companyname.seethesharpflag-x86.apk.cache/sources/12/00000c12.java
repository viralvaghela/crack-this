package mono.android.content;

import android.content.Loader;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Loader_OnLoadCompleteListenerImplementor implements IGCUserPeer, Loader.OnLoadCompleteListener {
    public static final String __md_methods = "n_onLoadComplete:(Landroid/content/Loader;Ljava/lang/Object;)V:GetOnLoadComplete_Landroid_content_Loader_Ljava_lang_Object_Handler:Android.Content.Loader/IOnLoadCompleteListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onLoadComplete(Loader loader, Object obj);

    static {
        Runtime.register("Android.Content.Loader+IOnLoadCompleteListenerImplementor, Mono.Android", Loader_OnLoadCompleteListenerImplementor.class, __md_methods);
    }

    public Loader_OnLoadCompleteListenerImplementor() {
        if (getClass() == Loader_OnLoadCompleteListenerImplementor.class) {
            TypeManager.Activate("Android.Content.Loader+IOnLoadCompleteListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.Loader.OnLoadCompleteListener
    public void onLoadComplete(Loader loader, Object obj) {
        n_onLoadComplete(loader, obj);
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