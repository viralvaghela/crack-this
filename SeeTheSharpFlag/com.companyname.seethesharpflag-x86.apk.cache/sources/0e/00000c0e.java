package mono.android.content;

import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DialogInterface_OnKeyListenerImplementor implements IGCUserPeer, DialogInterface.OnKeyListener {
    public static final String __md_methods = "n_onKey:(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z:GetOnKey_Landroid_content_DialogInterface_ILandroid_view_KeyEvent_Handler:Android.Content.IDialogInterfaceOnKeyListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent);

    static {
        Runtime.register("Android.Content.IDialogInterfaceOnKeyListenerImplementor, Mono.Android", DialogInterface_OnKeyListenerImplementor.class, __md_methods);
    }

    public DialogInterface_OnKeyListenerImplementor() {
        if (getClass() == DialogInterface_OnKeyListenerImplementor.class) {
            TypeManager.Activate("Android.Content.IDialogInterfaceOnKeyListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return n_onKey(dialogInterface, i, keyEvent);
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