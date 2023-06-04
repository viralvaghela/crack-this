package mono.android.webkit;

import android.webkit.DownloadListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DownloadListenerImplementor implements IGCUserPeer, DownloadListener {
    public static final String __md_methods = "n_onDownloadStart:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V:GetOnDownloadStart_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_JHandler:Android.Webkit.IDownloadListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDownloadStart(String str, String str2, String str3, String str4, long j);

    static {
        Runtime.register("Android.Webkit.IDownloadListenerImplementor, Mono.Android", DownloadListenerImplementor.class, __md_methods);
    }

    public DownloadListenerImplementor() {
        if (getClass() == DownloadListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.IDownloadListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        n_onDownloadStart(str, str2, str3, str4, j);
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