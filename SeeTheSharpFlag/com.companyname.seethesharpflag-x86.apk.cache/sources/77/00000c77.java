package mono.android.p005os;

import android.os.FileUtils;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.FileUtils_ProgressListenerImplementor */
/* loaded from: classes.dex */
public class FileUtils_ProgressListenerImplementor implements IGCUserPeer, FileUtils.ProgressListener {
    public static final String __md_methods = "n_onProgress:(J)V:GetOnProgress_JHandler:Android.OS.FileUtils/IProgressListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onProgress(long j);

    static {
        Runtime.register("Android.OS.FileUtils+IProgressListenerImplementor, Mono.Android", FileUtils_ProgressListenerImplementor.class, __md_methods);
    }

    public FileUtils_ProgressListenerImplementor() {
        if (getClass() == FileUtils_ProgressListenerImplementor.class) {
            TypeManager.Activate("Android.OS.FileUtils+IProgressListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.FileUtils.ProgressListener
    public void onProgress(long j) {
        n_onProgress(j);
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