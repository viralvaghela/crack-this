package mono.android.app;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionBar_TabListenerImplementor implements IGCUserPeer, ActionBar.TabListener {
    public static final String __md_methods = "n_onTabReselected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabReselected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTabSelected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabSelected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTabUnselected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabUnselected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction);

    private native void n_onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction);

    private native void n_onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction);

    static {
        Runtime.register("Android.App.ActionBar+ITabListenerImplementor, Mono.Android", ActionBar_TabListenerImplementor.class, "n_onTabReselected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabReselected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTabSelected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabSelected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTabUnselected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabUnselected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public ActionBar_TabListenerImplementor() {
        if (getClass() == ActionBar_TabListenerImplementor.class) {
            TypeManager.Activate("Android.App.ActionBar+ITabListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.ActionBar.TabListener
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        n_onTabReselected(tab, fragmentTransaction);
    }

    @Override // android.app.ActionBar.TabListener
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        n_onTabSelected(tab, fragmentTransaction);
    }

    @Override // android.app.ActionBar.TabListener
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        n_onTabUnselected(tab, fragmentTransaction);
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