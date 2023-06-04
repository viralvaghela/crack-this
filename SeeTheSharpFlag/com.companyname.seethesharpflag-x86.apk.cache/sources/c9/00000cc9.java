package mono.android.widget;

import android.widget.CompoundButton;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CompoundButton_OnCheckedChangeListenerImplementor implements IGCUserPeer, CompoundButton.OnCheckedChangeListener {
    public static final String __md_methods = "n_onCheckedChanged:(Landroid/widget/CompoundButton;Z)V:GetOnCheckedChanged_Landroid_widget_CompoundButton_ZHandler:Android.Widget.CompoundButton/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCheckedChanged(CompoundButton compoundButton, boolean z);

    static {
        Runtime.register("Android.Widget.CompoundButton+IOnCheckedChangeListenerImplementor, Mono.Android", CompoundButton_OnCheckedChangeListenerImplementor.class, "n_onCheckedChanged:(Landroid/widget/CompoundButton;Z)V:GetOnCheckedChanged_Landroid_widget_CompoundButton_ZHandler:Android.Widget.CompoundButton/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public CompoundButton_OnCheckedChangeListenerImplementor() {
        if (getClass() == CompoundButton_OnCheckedChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.CompoundButton+IOnCheckedChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        n_onCheckedChanged(compoundButton, z);
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