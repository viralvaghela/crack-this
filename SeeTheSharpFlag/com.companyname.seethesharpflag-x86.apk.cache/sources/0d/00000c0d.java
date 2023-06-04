package mono.android.content;

import android.content.DialogInterface;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DialogInterface_OnDismissListenerImplementor implements IGCUserPeer, DialogInterface.OnDismissListener {
    public static final String __md_methods = "n_onDismiss:(Landroid/content/DialogInterface;)V:GetOnDismiss_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDismiss(DialogInterface dialogInterface);

    static {
        Runtime.register("Android.Content.IDialogInterfaceOnDismissListenerImplementor, Mono.Android", DialogInterface_OnDismissListenerImplementor.class, __md_methods);
    }

    public DialogInterface_OnDismissListenerImplementor() {
        if (getClass() == DialogInterface_OnDismissListenerImplementor.class) {
            TypeManager.Activate("Android.Content.IDialogInterfaceOnDismissListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        n_onDismiss(dialogInterface);
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