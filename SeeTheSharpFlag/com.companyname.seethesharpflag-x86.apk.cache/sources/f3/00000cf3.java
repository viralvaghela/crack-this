package mono.com.google.android.material.bottomnavigation;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class BottomNavigationView_OnNavigationItemSelectedListenerImplementor implements IGCUserPeer, BottomNavigationView.OnNavigationItemSelectedListener {
    public static final String __md_methods = "n_onNavigationItemSelected:(Landroid/view/MenuItem;)Z:GetOnNavigationItemSelected_Landroid_view_MenuItem_Handler:Google.Android.Material.BottomNavigation.BottomNavigationView/IOnNavigationItemSelectedListenerInvoker, Xamarin.Google.Android.Material\n";
    private ArrayList refList;

    private native boolean n_onNavigationItemSelected(MenuItem menuItem);

    static {
        Runtime.register("Google.Android.Material.BottomNavigation.BottomNavigationView+IOnNavigationItemSelectedListenerImplementor, Xamarin.Google.Android.Material", BottomNavigationView_OnNavigationItemSelectedListenerImplementor.class, __md_methods);
    }

    public BottomNavigationView_OnNavigationItemSelectedListenerImplementor() {
        if (getClass() == BottomNavigationView_OnNavigationItemSelectedListenerImplementor.class) {
            TypeManager.Activate("Google.Android.Material.BottomNavigation.BottomNavigationView+IOnNavigationItemSelectedListenerImplementor, Xamarin.Google.Android.Material", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return n_onNavigationItemSelected(menuItem);
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