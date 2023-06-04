package mono.android.renderscript;

import android.renderscript.Allocation;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Allocation_OnBufferAvailableListenerImplementor implements IGCUserPeer, Allocation.OnBufferAvailableListener {
    public static final String __md_methods = "n_onBufferAvailable:(Landroid/renderscript/Allocation;)V:GetOnBufferAvailable_Landroid_renderscript_Allocation_Handler:Android.Renderscripts.Allocation/IOnBufferAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onBufferAvailable(Allocation allocation);

    static {
        Runtime.register("Android.Renderscripts.Allocation+IOnBufferAvailableListenerImplementor, Mono.Android", Allocation_OnBufferAvailableListenerImplementor.class, __md_methods);
    }

    public Allocation_OnBufferAvailableListenerImplementor() {
        if (getClass() == Allocation_OnBufferAvailableListenerImplementor.class) {
            TypeManager.Activate("Android.Renderscripts.Allocation+IOnBufferAvailableListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.renderscript.Allocation.OnBufferAvailableListener
    public void onBufferAvailable(Allocation allocation) {
        n_onBufferAvailable(allocation);
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