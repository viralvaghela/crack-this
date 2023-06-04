package crc643f46942d9dd1fff9;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.view.ActionMode;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public abstract class CellAdapter extends BaseAdapter implements IGCUserPeer, AdapterView.OnItemLongClickListener, ActionMode.Callback, AdapterView.OnItemClickListener, ActionMode.Callback {
    public static final String __md_methods = "n_onItemLongClick:(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z:GetOnItemLongClick_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemLongClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActionItemClicked:(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z:GetOnActionItemClicked_Landroid_view_ActionMode_Landroid_view_MenuItem_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onCreateActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z:GetOnCreateActionMode_Landroid_view_ActionMode_Landroid_view_Menu_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDestroyActionMode:(Landroid/view/ActionMode;)V:GetOnDestroyActionMode_Landroid_view_ActionMode_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPrepareActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z:GetOnPrepareActionMode_Landroid_view_ActionMode_Landroid_view_Menu_Handler:Android.Views.ActionMode/ICallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onItemClick:(Landroid/widget/AdapterView;Landroid/view/View;IJ)V:GetOnItemClick_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActionItemClicked:(Landroidx/appcompat/view/ActionMode;Landroid/view/MenuItem;)Z:GetOnActionItemClicked_Landroidx_appcompat_view_ActionMode_Landroid_view_MenuItem_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\nn_onCreateActionMode:(Landroidx/appcompat/view/ActionMode;Landroid/view/Menu;)Z:GetOnCreateActionMode_Landroidx_appcompat_view_ActionMode_Landroid_view_Menu_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\nn_onDestroyActionMode:(Landroidx/appcompat/view/ActionMode;)V:GetOnDestroyActionMode_Landroidx_appcompat_view_ActionMode_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\nn_onPrepareActionMode:(Landroidx/appcompat/view/ActionMode;Landroid/view/Menu;)Z:GetOnPrepareActionMode_Landroidx_appcompat_view_ActionMode_Landroid_view_Menu_Handler:AndroidX.AppCompat.View.ActionMode/ICallbackInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native boolean n_onActionItemClicked(android.view.ActionMode actionMode, MenuItem menuItem);

    private native boolean n_onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, MenuItem menuItem);

    private native boolean n_onCreateActionMode(android.view.ActionMode actionMode, Menu menu);

    private native boolean n_onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, Menu menu);

    private native void n_onDestroyActionMode(android.view.ActionMode actionMode);

    private native void n_onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode);

    private native void n_onItemClick(AdapterView adapterView, View view, int i, long j);

    private native boolean n_onItemLongClick(AdapterView adapterView, View view, int i, long j);

    private native boolean n_onPrepareActionMode(android.view.ActionMode actionMode, Menu menu);

    private native boolean n_onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, Menu menu);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CellAdapter, Xamarin.Forms.Platform.Android", CellAdapter.class, __md_methods);
    }

    public CellAdapter() {
        if (getClass() == CellAdapter.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CellAdapter, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public CellAdapter(Context context) {
        if (getClass() == CellAdapter.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CellAdapter, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        return n_onItemLongClick(adapterView, view, i, j);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, MenuItem menuItem) {
        return n_onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, Menu menu) {
        return n_onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        n_onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode actionMode, Menu menu) {
        return n_onPrepareActionMode(actionMode, menu);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        n_onItemClick(adapterView, view, i, j);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, MenuItem menuItem) {
        return n_onActionItemClicked(actionMode, menuItem);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, Menu menu) {
        return n_onCreateActionMode(actionMode, menu);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode) {
        n_onDestroyActionMode(actionMode);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, Menu menu) {
        return n_onPrepareActionMode(actionMode, menu);
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