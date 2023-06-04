package mono.android.content;

import android.content.DialogInterface;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DialogInterface_OnMultiChoiceClickListenerImplementor implements IGCUserPeer, DialogInterface.OnMultiChoiceClickListener {
    public static final String __md_methods = "n_onClick:(Landroid/content/DialogInterface;IZ)V:GetOnClick_Landroid_content_DialogInterface_IZHandler:Android.Content.IDialogInterfaceOnMultiChoiceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClick(DialogInterface dialogInterface, int i, boolean z);

    static {
        Runtime.register("Android.Content.IDialogInterfaceOnMultiChoiceClickListenerImplementor, Mono.Android", DialogInterface_OnMultiChoiceClickListenerImplementor.class, "n_onClick:(Landroid/content/DialogInterface;IZ)V:GetOnClick_Landroid_content_DialogInterface_IZHandler:Android.Content.IDialogInterfaceOnMultiChoiceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public DialogInterface_OnMultiChoiceClickListenerImplementor() {
        if (getClass() == DialogInterface_OnMultiChoiceClickListenerImplementor.class) {
            TypeManager.Activate("Android.Content.IDialogInterfaceOnMultiChoiceClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        n_onClick(dialogInterface, i, z);
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