package mono.android.view;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnKeyListenerImplementor implements IGCUserPeer, View.OnKeyListener {
    public static final String __md_methods = "n_onKey:(Landroid/view/View;ILandroid/view/KeyEvent;)Z:GetOnKey_Landroid_view_View_ILandroid_view_KeyEvent_Handler:Android.Views.View/IOnKeyListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onKey(View view, int i, KeyEvent keyEvent);

    static {
        Runtime.register("Android.Views.View+IOnKeyListenerImplementor, Mono.Android", View_OnKeyListenerImplementor.class, __md_methods);
    }

    public View_OnKeyListenerImplementor() {
        if (getClass() == View_OnKeyListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnKeyListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return n_onKey(view, i, keyEvent);
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