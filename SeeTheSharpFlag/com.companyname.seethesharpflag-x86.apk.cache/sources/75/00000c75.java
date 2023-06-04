package mono.android.p005os;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.os.ActionHandlerCallback */
/* loaded from: classes.dex */
public class ActionHandlerCallback implements IGCUserPeer, Handler.Callback {
    public static final String __md_methods = "n_handleMessage:(Landroid/os/Message;)Z:GetHandleMessage_Landroid_os_Message_Handler:Android.OS.Handler/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_handleMessage(Message message);

    static {
        Runtime.register("Android.OS.ActionHandlerCallback, Mono.Android", ActionHandlerCallback.class, __md_methods);
    }

    public ActionHandlerCallback() {
        if (getClass() == ActionHandlerCallback.class) {
            TypeManager.Activate("Android.OS.ActionHandlerCallback, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return n_handleMessage(message);
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