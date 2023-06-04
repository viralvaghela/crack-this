package crc64720bb2db43a66fe9;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NavigationPageRenderer_DrawerMultiplexedListener implements IGCUserPeer, DrawerLayout.DrawerListener {
    public static final String __md_methods = "n_onDrawerClosed:(Landroid/view/View;)V:GetOnDrawerClosed_Landroid_view_View_Handler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\nn_onDrawerOpened:(Landroid/view/View;)V:GetOnDrawerOpened_Landroid_view_View_Handler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\nn_onDrawerSlide:(Landroid/view/View;F)V:GetOnDrawerSlide_Landroid_view_View_FHandler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\nn_onDrawerStateChanged:(I)V:GetOnDrawerStateChanged_IHandler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\n";
    private ArrayList refList;

    private native void n_onDrawerClosed(View view);

    private native void n_onDrawerOpened(View view);

    private native void n_onDrawerSlide(View view, float f);

    private native void n_onDrawerStateChanged(int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.AppCompat.NavigationPageRenderer+DrawerMultiplexedListener, Xamarin.Forms.Platform.Android", NavigationPageRenderer_DrawerMultiplexedListener.class, "n_onDrawerClosed:(Landroid/view/View;)V:GetOnDrawerClosed_Landroid_view_View_Handler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\nn_onDrawerOpened:(Landroid/view/View;)V:GetOnDrawerOpened_Landroid_view_View_Handler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\nn_onDrawerSlide:(Landroid/view/View;F)V:GetOnDrawerSlide_Landroid_view_View_FHandler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\nn_onDrawerStateChanged:(I)V:GetOnDrawerStateChanged_IHandler:AndroidX.DrawerLayout.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.AndroidX.DrawerLayout\n");
    }

    public NavigationPageRenderer_DrawerMultiplexedListener() {
        if (getClass() == NavigationPageRenderer_DrawerMultiplexedListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.NavigationPageRenderer+DrawerMultiplexedListener, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        n_onDrawerClosed(view);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        n_onDrawerOpened(view);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        n_onDrawerSlide(view, f);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
        n_onDrawerStateChanged(i);
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