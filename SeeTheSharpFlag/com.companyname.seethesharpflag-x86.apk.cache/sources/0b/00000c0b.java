package mono.android.content;

import android.content.DialogInterface;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DialogInterface_OnCancelListenerImplementor implements IGCUserPeer, DialogInterface.OnCancelListener {
    public static final String __md_methods = "n_onCancel:(Landroid/content/DialogInterface;)V:GetOnCancel_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCancel(DialogInterface dialogInterface);

    static {
        Runtime.register("Android.Content.IDialogInterfaceOnCancelListenerImplementor, Mono.Android", DialogInterface_OnCancelListenerImplementor.class, "n_onCancel:(Landroid/content/DialogInterface;)V:GetOnCancel_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public DialogInterface_OnCancelListenerImplementor() {
        if (getClass() == DialogInterface_OnCancelListenerImplementor.class) {
            TypeManager.Activate("Android.Content.IDialogInterfaceOnCancelListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        n_onCancel(dialogInterface);
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