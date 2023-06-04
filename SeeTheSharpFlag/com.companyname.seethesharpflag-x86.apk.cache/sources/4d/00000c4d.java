package mono.android.media;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaScannerConnection_OnScanCompletedListenerImplementor implements IGCUserPeer, MediaScannerConnection.OnScanCompletedListener {
    public static final String __md_methods = "n_onScanCompleted:(Ljava/lang/String;Landroid/net/Uri;)V:GetOnScanCompleted_Ljava_lang_String_Landroid_net_Uri_Handler:Android.Media.MediaScannerConnection/IOnScanCompletedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onScanCompleted(String str, Uri uri);

    static {
        Runtime.register("Android.Media.MediaScannerConnection+IOnScanCompletedListenerImplementor, Mono.Android", MediaScannerConnection_OnScanCompletedListenerImplementor.class, __md_methods);
    }

    public MediaScannerConnection_OnScanCompletedListenerImplementor() {
        if (getClass() == MediaScannerConnection_OnScanCompletedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaScannerConnection+IOnScanCompletedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        n_onScanCompleted(str, uri);
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