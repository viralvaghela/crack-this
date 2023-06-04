package crc643f46942d9dd1fff9;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsWebChromeClient extends WebChromeClient implements IGCUserPeer {
    public static final String __md_methods = "n_onShowFileChooser:(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z:GetOnShowFileChooser_Landroid_webkit_WebView_Landroid_webkit_ValueCallback_Landroid_webkit_WebChromeClient_FileChooserParams_Handler\n";
    private ArrayList refList;

    private native boolean n_onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsWebChromeClient, Xamarin.Forms.Platform.Android", FormsWebChromeClient.class, __md_methods);
    }

    public FormsWebChromeClient() {
        if (getClass() == FormsWebChromeClient.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsWebChromeClient, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return n_onShowFileChooser(webView, valueCallback, fileChooserParams);
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