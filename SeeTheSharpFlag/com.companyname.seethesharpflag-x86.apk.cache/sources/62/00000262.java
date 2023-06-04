package androidx.appcompat.widget;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Toolbar_NavigationOnClickEventDispatcher implements IGCUserPeer, View.OnClickListener {
    public static final String __md_methods = "n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClick(View view);

    static {
        Runtime.register("AndroidX.AppCompat.Widget.Toolbar+NavigationOnClickEventDispatcher, Xamarin.AndroidX.AppCompat", Toolbar_NavigationOnClickEventDispatcher.class, "n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public Toolbar_NavigationOnClickEventDispatcher() {
        if (getClass() == Toolbar_NavigationOnClickEventDispatcher.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.Toolbar+NavigationOnClickEventDispatcher, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    public Toolbar_NavigationOnClickEventDispatcher(Toolbar toolbar) {
        if (getClass() == Toolbar_NavigationOnClickEventDispatcher.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.Toolbar+NavigationOnClickEventDispatcher, Xamarin.AndroidX.AppCompat", "AndroidX.AppCompat.Widget.Toolbar, Xamarin.AndroidX.AppCompat", this, new Object[]{toolbar});
        }
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