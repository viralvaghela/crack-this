package crc643f46942d9dd1fff9;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CarouselPageAdapter extends PagerAdapter implements IGCUserPeer, ViewPager.OnPageChangeListener {
    public static final String __md_methods = "n_getCount:()I:GetGetCountHandler\nn_destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\nn_getItemPosition:(Ljava/lang/Object;)I:GetGetItemPosition_Ljava_lang_Object_Handler\nn_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\nn_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\nn_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onPageSelected:(I)V:GetOnPageSelected_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\n";
    private ArrayList refList;

    private native void n_destroyItem(ViewGroup viewGroup, int i, Object obj);

    private native int n_getCount();

    private native int n_getItemPosition(Object obj);

    private native Object n_instantiateItem(ViewGroup viewGroup, int i);

    private native boolean n_isViewFromObject(View view, Object obj);

    private native void n_onPageScrollStateChanged(int i);

    private native void n_onPageScrolled(int i, float f, int i2);

    private native void n_onPageSelected(int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CarouselPageAdapter, Xamarin.Forms.Platform.Android", CarouselPageAdapter.class, __md_methods);
    }

    public CarouselPageAdapter() {
        if (getClass() == CarouselPageAdapter.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CarouselPageAdapter, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return n_getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        n_destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return n_getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return n_instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return n_isViewFromObject(view, obj);
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