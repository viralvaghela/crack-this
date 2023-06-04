package crc643f46942d9dd1fff9;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public abstract class ShellItemRendererBase extends Fragment implements IGCUserPeer {
    public static final String __md_methods = "n_onDestroy:()V:GetOnDestroyHandler\n";
    private ArrayList refList;

    private native void n_onDestroy();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellItemRendererBase, Xamarin.Forms.Platform.Android", ShellItemRendererBase.class, __md_methods);
    }

    public ShellItemRendererBase() {
        if (getClass() == ShellItemRendererBase.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellItemRendererBase, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public ShellItemRendererBase(int i) {
        super(i);
        if (getClass() == ShellItemRendererBase.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellItemRendererBase, Xamarin.Forms.Platform.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        n_onDestroy();
    }

    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}