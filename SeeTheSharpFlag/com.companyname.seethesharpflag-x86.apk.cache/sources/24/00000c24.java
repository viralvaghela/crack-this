package mono.android.hardware.input;

import android.hardware.input.InputManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class InputManager_InputDeviceListenerImplementor implements IGCUserPeer, InputManager.InputDeviceListener {
    public static final String __md_methods = "n_onInputDeviceAdded:(I)V:GetOnInputDeviceAdded_IHandler:Android.Hardware.Input.InputManager/IInputDeviceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onInputDeviceChanged:(I)V:GetOnInputDeviceChanged_IHandler:Android.Hardware.Input.InputManager/IInputDeviceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onInputDeviceRemoved:(I)V:GetOnInputDeviceRemoved_IHandler:Android.Hardware.Input.InputManager/IInputDeviceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onInputDeviceAdded(int i);

    private native void n_onInputDeviceChanged(int i);

    private native void n_onInputDeviceRemoved(int i);

    static {
        Runtime.register("Android.Hardware.Input.InputManager+IInputDeviceListenerImplementor, Mono.Android", InputManager_InputDeviceListenerImplementor.class, __md_methods);
    }

    public InputManager_InputDeviceListenerImplementor() {
        if (getClass() == InputManager_InputDeviceListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Input.InputManager+IInputDeviceListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceAdded(int i) {
        n_onInputDeviceAdded(i);
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceChanged(int i) {
        n_onInputDeviceChanged(i);
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceRemoved(int i) {
        n_onInputDeviceRemoved(i);
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