package crc643f46942d9dd1fff9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionSheetRenderer extends Dialog implements IGCUserPeer, View.OnClickListener {
    public static final String __md_methods = "n_cancel:()V:GetCancelHandler\nn_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\nn_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_cancel();

    private native void n_onAttachedToWindow();

    private native void n_onClick(View view);

    private native void n_onCreate(Bundle bundle);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ActionSheetRenderer, Xamarin.Forms.Platform.Android", ActionSheetRenderer.class, __md_methods);
    }

    public ActionSheetRenderer(Context context) {
        super(context);
        if (getClass() == ActionSheetRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ActionSheetRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        n_cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        n_onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
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