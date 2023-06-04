package crc643f46942d9dd1fff9;

import android.webkit.ValueCallback;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WebViewRenderer_JavascriptResult implements IGCUserPeer, ValueCallback {
    public static final String __md_methods = "n_onReceiveValue:(Ljava/lang/Object;)V:GetOnReceiveValue_Ljava_lang_Object_Handler:Android.Webkit.IValueCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onReceiveValue(Object obj);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.WebViewRenderer+JavascriptResult, Xamarin.Forms.Platform.Android", WebViewRenderer_JavascriptResult.class, __md_methods);
    }

    public WebViewRenderer_JavascriptResult() {
        if (getClass() == WebViewRenderer_JavascriptResult.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.WebViewRenderer+JavascriptResult, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(Object obj) {
        n_onReceiveValue(obj);
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