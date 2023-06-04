package crc643f46942d9dd1fff9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellSectionRenderer extends Fragment implements IGCUserPeer, ViewPager.OnPageChangeListener, View.OnClickListener {
    public static final String __md_methods = "n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onPageSelected:(I)V:GetOnPageSelected_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClick(View view);

    private native View n_onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    private native void n_onDestroy();

    private native void n_onPageScrollStateChanged(int i);

    private native void n_onPageScrolled(int i, float f, int i2);

    private native void n_onPageSelected(int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellSectionRenderer, Xamarin.Forms.Platform.Android", ShellSectionRenderer.class, __md_methods);
    }

    public ShellSectionRenderer() {
        if (getClass() == ShellSectionRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellSectionRenderer, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public ShellSectionRenderer(int i) {
        super(i);
        if (getClass() == ShellSectionRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellSectionRenderer, Xamarin.Forms.Platform.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return n_onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        n_onDestroy();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        n_onPageScrollStateChanged(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        n_onPageScrolled(i, f, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        n_onPageSelected(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n_onClick(view);
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