package crc64720bb2db43a66fe9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import crc643f46942d9dd1fff9.VisualElementRenderer_1;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TabbedPageRenderer extends VisualElementRenderer_1 implements IGCUserPeer, TabLayout.BaseOnTabSelectedListener, ViewPager.OnPageChangeListener, BottomNavigationView.OnNavigationItemSelectedListener {
    public static final String __md_methods = "n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\nn_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\nn_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\nn_onTabReselected:(Lcom/google/android/material/tabs/TabLayout$Tab;)V:GetOnTabReselected_Lcom_google_android_material_tabs_TabLayout_Tab_Handler:Google.Android.Material.Tabs.TabLayout/IOnTabSelectedListenerInvoker, Xamarin.Google.Android.Material\nn_onTabSelected:(Lcom/google/android/material/tabs/TabLayout$Tab;)V:GetOnTabSelected_Lcom_google_android_material_tabs_TabLayout_Tab_Handler:Google.Android.Material.Tabs.TabLayout/IOnTabSelectedListenerInvoker, Xamarin.Google.Android.Material\nn_onTabUnselected:(Lcom/google/android/material/tabs/TabLayout$Tab;)V:GetOnTabUnselected_Lcom_google_android_material_tabs_TabLayout_Tab_Handler:Google.Android.Material.Tabs.TabLayout/IOnTabSelectedListenerInvoker, Xamarin.Google.Android.Material\nn_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onPageSelected:(I)V:GetOnPageSelected_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\nn_onNavigationItemSelected:(Landroid/view/MenuItem;)Z:GetOnNavigationItemSelected_Landroid_view_MenuItem_Handler:Google.Android.Material.BottomNavigation.BottomNavigationView/IOnNavigationItemSelectedListenerInvoker, Xamarin.Google.Android.Material\n";
    private ArrayList refList;

    private native void n_onAttachedToWindow();

    private native void n_onDetachedFromWindow();

    private native void n_onLayout(boolean z, int i, int i2, int i3, int i4);

    private native boolean n_onNavigationItemSelected(MenuItem menuItem);

    private native void n_onPageScrollStateChanged(int i);

    private native void n_onPageScrolled(int i, float f, int i2);

    private native void n_onPageSelected(int i);

    private native void n_onTabReselected(TabLayout.Tab tab);

    private native void n_onTabSelected(TabLayout.Tab tab);

    private native void n_onTabUnselected(TabLayout.Tab tab);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.AppCompat.TabbedPageRenderer, Xamarin.Forms.Platform.Android", TabbedPageRenderer.class, __md_methods);
    }

    public TabbedPageRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == TabbedPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.TabbedPageRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public TabbedPageRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == TabbedPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.TabbedPageRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public TabbedPageRenderer(Context context) {
        super(context);
        if (getClass() == TabbedPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.TabbedPageRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        n_onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        n_onDetachedFromWindow();
    }

    @Override // crc643f46942d9dd1fff9.VisualElementRenderer_1, com.xamarin.forms.platform.android.FormsViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n_onLayout(z, i, i2, i3, i4);
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

    @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return n_onNavigationItemSelected(menuItem);
    }

    @Override // crc643f46942d9dd1fff9.VisualElementRenderer_1, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.VisualElementRenderer_1, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}