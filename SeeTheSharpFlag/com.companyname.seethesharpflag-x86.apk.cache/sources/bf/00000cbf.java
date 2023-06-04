package mono.android.webkit;

import android.graphics.Picture;
import android.webkit.WebView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WebView_PictureListenerImplementor implements IGCUserPeer, WebView.PictureListener {
    public static final String __md_methods = "n_onNewPicture:(Landroid/webkit/WebView;Landroid/graphics/Picture;)V:GetOnNewPicture_Landroid_webkit_WebView_Landroid_graphics_Picture_Handler:Android.Webkit.WebView/IPictureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onNewPicture(WebView webView, Picture picture);

    static {
        Runtime.register("Android.Webkit.WebView+IPictureListenerImplementor, Mono.Android", WebView_PictureListenerImplementor.class, __md_methods);
    }

    public WebView_PictureListenerImplementor() {
        if (getClass() == WebView_PictureListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.WebView+IPictureListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.webkit.WebView.PictureListener
    public void onNewPicture(WebView webView, Picture picture) {
        n_onNewPicture(webView, picture);
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