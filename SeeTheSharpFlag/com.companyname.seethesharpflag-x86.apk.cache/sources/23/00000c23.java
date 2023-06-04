package mono.android.hardware.display;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DisplayManager_DisplayListenerImplementor implements IGCUserPeer, DisplayManager.DisplayListener {
    public static final String __md_methods = "n_onDisplayAdded:(I)V:GetOnDisplayAdded_IHandler:Android.Hardware.Display.DisplayManager/IDisplayListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDisplayChanged:(I)V:GetOnDisplayChanged_IHandler:Android.Hardware.Display.DisplayManager/IDisplayListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDisplayRemoved:(I)V:GetOnDisplayRemoved_IHandler:Android.Hardware.Display.DisplayManager/IDisplayListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDisplayAdded(int i);

    private native void n_onDisplayChanged(int i);

    private native void n_onDisplayRemoved(int i);

    static {
        Runtime.register("Android.Hardware.Display.DisplayManager+IDisplayListenerImplementor, Mono.Android", DisplayManager_DisplayListenerImplementor.class, __md_methods);
    }

    public DisplayManager_DisplayListenerImplementor() {
        if (getClass() == DisplayManager_DisplayListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Display.DisplayManager+IDisplayListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
        n_onDisplayAdded(i);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        n_onDisplayChanged(i);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
        n_onDisplayRemoved(i);
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