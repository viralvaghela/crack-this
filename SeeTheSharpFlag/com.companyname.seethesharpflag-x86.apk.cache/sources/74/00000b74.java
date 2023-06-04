package crc643f46942d9dd1fff9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class PageExtensions_EmbeddedFragment extends Fragment implements IGCUserPeer {
    public static final String __md_methods = "n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    private native View n_onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", PageExtensions_EmbeddedFragment.class, "n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n");
    }

    public PageExtensions_EmbeddedFragment() {
        if (getClass() == PageExtensions_EmbeddedFragment.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public PageExtensions_EmbeddedFragment(int i) {
        super(i);
        if (getClass() == PageExtensions_EmbeddedFragment.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return n_onCreateView(layoutInflater, viewGroup, bundle);
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