package mono.com.google.android.material.bottomnavigation;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.com.google.android.material.bottomnavigation.BottomNavigationView_OnNavigationItemReselectedListenerImplementor */
/* loaded from: classes.dex */
public class C0720xe7b28bc3 implements IGCUserPeer, BottomNavigationView.OnNavigationItemReselectedListener {
    public static final String __md_methods = "n_onNavigationItemReselected:(Landroid/view/MenuItem;)V:GetOnNavigationItemReselected_Landroid_view_MenuItem_Handler:Google.Android.Material.BottomNavigation.BottomNavigationView/IOnNavigationItemReselectedListenerInvoker, Xamarin.Google.Android.Material\n";
    private ArrayList refList;

    private native void n_onNavigationItemReselected(MenuItem menuItem);

    static {
        Runtime.register("Google.Android.Material.BottomNavigation.BottomNavigationView+IOnNavigationItemReselectedListenerImplementor, Xamarin.Google.Android.Material", C0720xe7b28bc3.class, __md_methods);
    }

    public C0720xe7b28bc3() {
        if (getClass() == C0720xe7b28bc3.class) {
            TypeManager.Activate("Google.Android.Material.BottomNavigation.BottomNavigationView+IOnNavigationItemReselectedListenerImplementor, Xamarin.Google.Android.Material", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener
    public void onNavigationItemReselected(MenuItem menuItem) {
        n_onNavigationItemReselected(menuItem);
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