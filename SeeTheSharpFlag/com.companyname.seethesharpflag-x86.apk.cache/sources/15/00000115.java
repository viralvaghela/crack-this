package androidx.appcompat.app;

import android.content.DialogInterface;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: androidx.appcompat.app.AlertDialog_IDialogInterfaceOnMultiChoiceClickListenerImplementor */
/* loaded from: classes.dex */
public class DialogInterface$OnMultiChoiceClickListenerC0049xaeec6982 implements IGCUserPeer, DialogInterface.OnMultiChoiceClickListener {
    public static final String __md_methods = "n_onClick:(Landroid/content/DialogInterface;IZ)V:GetOnClick_Landroid_content_DialogInterface_IZHandler:Android.Content.IDialogInterfaceOnMultiChoiceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClick(DialogInterface dialogInterface, int i, boolean z);

    static {
        Runtime.register("AndroidX.AppCompat.App.AlertDialog+IDialogInterfaceOnMultiChoiceClickListenerImplementor, Xamarin.AndroidX.AppCompat", DialogInterface$OnMultiChoiceClickListenerC0049xaeec6982.class, "n_onClick:(Landroid/content/DialogInterface;IZ)V:GetOnClick_Landroid_content_DialogInterface_IZHandler:Android.Content.IDialogInterfaceOnMultiChoiceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public DialogInterface$OnMultiChoiceClickListenerC0049xaeec6982() {
        if (getClass() == DialogInterface$OnMultiChoiceClickListenerC0049xaeec6982.class) {
            TypeManager.Activate("AndroidX.AppCompat.App.AlertDialog+IDialogInterfaceOnMultiChoiceClickListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
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