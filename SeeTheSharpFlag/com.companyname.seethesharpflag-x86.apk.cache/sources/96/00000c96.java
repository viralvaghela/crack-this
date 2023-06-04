package mono.android.view;

import android.view.PixelCopy;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PixelCopy_OnPixelCopyFinishedListenerImplementor implements IGCUserPeer, PixelCopy.OnPixelCopyFinishedListener {
    public static final String __md_methods = "n_onPixelCopyFinished:(I)V:GetOnPixelCopyFinished_IHandler:Android.Views.PixelCopy/IOnPixelCopyFinishedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onPixelCopyFinished(int i);

    static {
        Runtime.register("Android.Views.PixelCopy+IOnPixelCopyFinishedListenerImplementor, Mono.Android", PixelCopy_OnPixelCopyFinishedListenerImplementor.class, __md_methods);
    }

    public PixelCopy_OnPixelCopyFinishedListenerImplementor() {
        if (getClass() == PixelCopy_OnPixelCopyFinishedListenerImplementor.class) {
            TypeManager.Activate("Android.Views.PixelCopy+IOnPixelCopyFinishedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public void onPixelCopyFinished(int i) {
        n_onPixelCopyFinished(i);
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