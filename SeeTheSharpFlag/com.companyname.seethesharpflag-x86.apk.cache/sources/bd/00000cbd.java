package mono.android.webkit;

import android.graphics.Bitmap;
import android.webkit.WebIconDatabase;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WebIconDatabase_IconListenerImplementor implements IGCUserPeer, WebIconDatabase.IconListener {
    public static final String __md_methods = "n_onReceivedIcon:(Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnReceivedIcon_Ljava_lang_String_Landroid_graphics_Bitmap_Handler:Android.Webkit.WebIconDatabase/IIconListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onReceivedIcon(String str, Bitmap bitmap);

    static {
        Runtime.register("Android.Webkit.WebIconDatabase+IIconListenerImplementor, Mono.Android", WebIconDatabase_IconListenerImplementor.class, __md_methods);
    }

    public WebIconDatabase_IconListenerImplementor() {
        if (getClass() == WebIconDatabase_IconListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.WebIconDatabase+IIconListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.webkit.WebIconDatabase.IconListener
    public void onReceivedIcon(String str, Bitmap bitmap) {
        n_onReceivedIcon(str, bitmap);
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