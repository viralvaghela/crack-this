package mono.android.widget;

import android.widget.TabHost;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TabHost_OnTabChangeListenerImplementor implements IGCUserPeer, TabHost.OnTabChangeListener {
    public static final String __md_methods = "n_onTabChanged:(Ljava/lang/String;)V:GetOnTabChanged_Ljava_lang_String_Handler:Android.Widget.TabHost/IOnTabChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTabChanged(String str);

    static {
        Runtime.register("Android.Widget.TabHost+IOnTabChangeListenerImplementor, Mono.Android", TabHost_OnTabChangeListenerImplementor.class, __md_methods);
    }

    public TabHost_OnTabChangeListenerImplementor() {
        if (getClass() == TabHost_OnTabChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.TabHost+IOnTabChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        n_onTabChanged(str);
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