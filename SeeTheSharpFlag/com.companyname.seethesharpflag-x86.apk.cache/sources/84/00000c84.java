package mono.android.runtime;

import java.io.InputStream;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class InputStreamAdapter extends InputStream implements IGCUserPeer {
    public static final String __md_methods = "n_close:()V:GetCloseHandler\nn_read:()I:GetReadHandler\nn_read:([B)I:GetRead_arrayBHandler\nn_read:([BII)I:GetRead_arrayBIIHandler\n";
    private ArrayList refList;

    private native void n_close();

    private native int n_read();

    private native int n_read(byte[] bArr);

    private native int n_read(byte[] bArr, int i, int i2);

    static {
        Runtime.register("Android.Runtime.InputStreamAdapter, Mono.Android", InputStreamAdapter.class, __md_methods);
    }

    public InputStreamAdapter() {
        if (getClass() == InputStreamAdapter.class) {
            TypeManager.Activate("Android.Runtime.InputStreamAdapter, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n_close();
    }

    @Override // java.io.InputStream
    public int read() {
        return n_read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return n_read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return n_read(bArr, i, i2);
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