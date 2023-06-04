package crc643f46942d9dd1fff9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellItemRenderer extends ShellItemRendererBase implements IGCUserPeer, BottomNavigationView.OnNavigationItemSelectedListener {
    public static final String __md_methods = "n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onNavigationItemSelected:(Landroid/view/MenuItem;)Z:GetOnNavigationItemSelected_Landroid_view_MenuItem_Handler:Google.Android.Material.BottomNavigation.BottomNavigationView/IOnNavigationItemSelectedListenerInvoker, Xamarin.Google.Android.Material\n";
    private ArrayList refList;

    private native View n_onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    private native void n_onDestroy();

    private native boolean n_onNavigationItemSelected(MenuItem menuItem);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellItemRenderer, Xamarin.Forms.Platform.Android", ShellItemRenderer.class, __md_methods);
    }

    public ShellItemRenderer() {
        if (getClass() == ShellItemRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellItemRenderer, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public ShellItemRenderer(int i) {
        super(i);
        if (getClass() == ShellItemRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellItemRenderer, Xamarin.Forms.Platform.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return n_onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // crc643f46942d9dd1fff9.ShellItemRendererBase, androidx.fragment.app.Fragment
    public void onDestroy() {
        n_onDestroy();
    }

    @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return n_onNavigationItemSelected(menuItem);
    }

    @Override // crc643f46942d9dd1fff9.ShellItemRendererBase, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.ShellItemRendererBase, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}