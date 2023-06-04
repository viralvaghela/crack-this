package mono.com.google.android.material.tabs;

import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TabLayout_BaseOnTabSelectedListenerImplementor implements IGCUserPeer, TabLayout.BaseOnTabSelectedListener {
    public static final String __md_methods = "n_onTabReselected:(Lcom/google/android/material/tabs/TabLayout$Tab;)V:GetOnTabReselected_Lcom_google_android_material_tabs_TabLayout_Tab_Handler:Google.Android.Material.Tabs.TabLayout/IOnTabSelectedListenerInvoker, Xamarin.Google.Android.Material\nn_onTabSelected:(Lcom/google/android/material/tabs/TabLayout$Tab;)V:GetOnTabSelected_Lcom_google_android_material_tabs_TabLayout_Tab_Handler:Google.Android.Material.Tabs.TabLayout/IOnTabSelectedListenerInvoker, Xamarin.Google.Android.Material\nn_onTabUnselected:(Lcom/google/android/material/tabs/TabLayout$Tab;)V:GetOnTabUnselected_Lcom_google_android_material_tabs_TabLayout_Tab_Handler:Google.Android.Material.Tabs.TabLayout/IOnTabSelectedListenerInvoker, Xamarin.Google.Android.Material\n";
    private ArrayList refList;

    private native void n_onTabReselected(TabLayout.Tab tab);

    private native void n_onTabSelected(TabLayout.Tab tab);

    private native void n_onTabUnselected(TabLayout.Tab tab);

    static {
        Runtime.register("Google.Android.Material.Tabs.TabLayout+IOnTabSelectedListenerImplementor, Xamarin.Google.Android.Material", TabLayout_BaseOnTabSelectedListenerImplementor.class, __md_methods);
    }

    public TabLayout_BaseOnTabSelectedListenerImplementor() {
        if (getClass() == TabLayout_BaseOnTabSelectedListenerImplementor.class) {
            TypeManager.Activate("Google.Android.Material.Tabs.TabLayout+IOnTabSelectedListenerImplementor, Xamarin.Google.Android.Material", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
        n_onTabReselected(tab);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        n_onTabSelected(tab);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        n_onTabUnselected(tab);
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