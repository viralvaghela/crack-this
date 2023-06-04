package crc643f46942d9dd1fff9;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsWebViewClient extends WebViewClient implements IGCUserPeer {
    public static final String __md_methods = "n_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Ljava/lang/String;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Handler\nn_onPageStarted:(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnPageStarted_Landroid_webkit_WebView_Ljava_lang_String_Landroid_graphics_Bitmap_Handler\nn_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_onReceivedError:(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V:GetOnReceivedError_Landroid_webkit_WebView_ILjava_lang_String_Ljava_lang_String_Handler\nn_onReceivedError:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V:GetOnReceivedError_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Landroid_webkit_WebResourceError_Handler\n";
    private ArrayList refList;

    private native void n_onPageFinished(WebView webView, String str);

    private native void n_onPageStarted(WebView webView, String str, Bitmap bitmap);

    private native void n_onReceivedError(WebView webView, int i, String str, String str2);

    private native void n_onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    private native boolean n_shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest);

    private native boolean n_shouldOverrideUrlLoading(WebView webView, String str);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsWebViewClient, Xamarin.Forms.Platform.Android", FormsWebViewClient.class, __md_methods);
    }

    public FormsWebViewClient() {
        if (getClass() == FormsWebViewClient.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsWebViewClient, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public FormsWebViewClient(WebViewRenderer webViewRenderer) {
        if (getClass() == FormsWebViewClient.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsWebViewClient, Xamarin.Forms.Platform.Android", "Xamarin.Forms.Platform.Android.WebViewRenderer, Xamarin.Forms.Platform.Android", this, new Object[]{webViewRenderer});
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return n_shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return n_shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        n_onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        n_onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        n_onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        n_onReceivedError(webView, webResourceRequest, webResourceError);
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