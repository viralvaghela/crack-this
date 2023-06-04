package mono.android.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TextView_OnEditorActionListenerImplementor implements IGCUserPeer, TextView.OnEditorActionListener {
    public static final String __md_methods = "n_onEditorAction:(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z:GetOnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_Handler:Android.Widget.TextView/IOnEditorActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onEditorAction(TextView textView, int i, KeyEvent keyEvent);

    static {
        Runtime.register("Android.Widget.TextView+IOnEditorActionListenerImplementor, Mono.Android", TextView_OnEditorActionListenerImplementor.class, __md_methods);
    }

    public TextView_OnEditorActionListenerImplementor() {
        if (getClass() == TextView_OnEditorActionListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.TextView+IOnEditorActionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return n_onEditorAction(textView, i, keyEvent);
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