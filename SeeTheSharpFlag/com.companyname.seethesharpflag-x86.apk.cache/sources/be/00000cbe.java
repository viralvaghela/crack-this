package mono.android.webkit;

import android.webkit.WebView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WebView_FindListenerImplementor implements IGCUserPeer, WebView.FindListener {
    public static final String __md_methods = "n_onFindResultReceived:(IIZ)V:GetOnFindResultReceived_IIZHandler:Android.Webkit.WebView/IFindListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onFindResultReceived(int i, int i2, boolean z);

    static {
        Runtime.register("Android.Webkit.WebView+IFindListenerImplementor, Mono.Android", WebView_FindListenerImplementor.class, __md_methods);
    }

    public WebView_FindListenerImplementor() {
        if (getClass() == WebView_FindListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.WebView+IFindListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.webkit.WebView.FindListener
    public void onFindResultReceived(int i, int i2, boolean z) {
        n_onFindResultReceived(i, i2, z);
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