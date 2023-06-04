package mono.android.p005os;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.ParcelFileDescriptor_OnCloseListenerImplementor */
/* loaded from: classes.dex */
public class ParcelFileDescriptor_OnCloseListenerImplementor implements IGCUserPeer, ParcelFileDescriptor.OnCloseListener {
    public static final String __md_methods = "n_onClose:(Ljava/io/IOException;)V:GetOnClose_Ljava_io_IOException_Handler:Android.OS.ParcelFileDescriptor/IOnCloseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClose(IOException iOException);

    static {
        Runtime.register("Android.OS.ParcelFileDescriptor+IOnCloseListenerImplementor, Mono.Android", ParcelFileDescriptor_OnCloseListenerImplementor.class, __md_methods);
    }

    public ParcelFileDescriptor_OnCloseListenerImplementor() {
        if (getClass() == ParcelFileDescriptor_OnCloseListenerImplementor.class) {
            TypeManager.Activate("Android.OS.ParcelFileDescriptor+IOnCloseListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.ParcelFileDescriptor.OnCloseListener
    public void onClose(IOException iOException) {
        n_onClose(iOException);
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