package crc643f46942d9dd1fff9;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShellFragmentPagerAdapter extends FragmentPagerAdapter implements IGCUserPeer {
    public static final String __md_methods = "n_getCount:()I:GetGetCountHandler\nn_getItem:(I)Landroidx/fragment/app/Fragment;:GetGetItem_IHandler\nn_getItemId:(I)J:GetGetItemId_IHandler\nn_getItemPosition:(Ljava/lang/Object;)I:GetGetItemPosition_Ljava_lang_Object_Handler\nn_getPageTitle:(I)Ljava/lang/CharSequence;:GetGetPageTitle_IHandler\nn_restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V:GetRestoreState_Landroid_os_Parcelable_Ljava_lang_ClassLoader_Handler\n";
    private ArrayList refList;

    private native int n_getCount();

    private native Fragment n_getItem(int i);

    private native long n_getItemId(int i);

    private native int n_getItemPosition(Object obj);

    private native CharSequence n_getPageTitle(int i);

    private native void n_restoreState(Parcelable parcelable, ClassLoader classLoader);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ShellFragmentPagerAdapter, Xamarin.Forms.Platform.Android", ShellFragmentPagerAdapter.class, "n_getCount:()I:GetGetCountHandler\nn_getItem:(I)Landroidx/fragment/app/Fragment;:GetGetItem_IHandler\nn_getItemId:(I)J:GetGetItemId_IHandler\nn_getItemPosition:(Ljava/lang/Object;)I:GetGetItemPosition_Ljava_lang_Object_Handler\nn_getPageTitle:(I)Ljava/lang/CharSequence;:GetGetPageTitle_IHandler\nn_restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V:GetRestoreState_Landroid_os_Parcelable_Ljava_lang_ClassLoader_Handler\n");
    }

    public ShellFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        if (getClass() == ShellFragmentPagerAdapter.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellFragmentPagerAdapter, Xamarin.Forms.Platform.Android", "AndroidX.Fragment.App.FragmentManager, Xamarin.AndroidX.Fragment", this, new Object[]{fragmentManager});
        }
    }

    public ShellFragmentPagerAdapter(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        if (getClass() == ShellFragmentPagerAdapter.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ShellFragmentPagerAdapter, Xamarin.Forms.Platform.Android", "AndroidX.Fragment.App.FragmentManager, Xamarin.AndroidX.Fragment:System.Int32, mscorlib", this, new Object[]{fragmentManager, Integer.valueOf(i)});
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return n_getCount();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return n_getItem(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public long getItemId(int i) {
        return n_getItemId(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return n_getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return n_getPageTitle(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        n_restoreState(parcelable, classLoader);
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