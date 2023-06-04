package crc643f46942d9dd1fff9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TableViewModelRenderer extends CellAdapter implements IGCUserPeer {
    public static final String __md_methods = "n_getCount:()I:GetGetCountHandler\nn_getItem:(I)Ljava/lang/Object;:GetGetItem_IHandler\nn_getViewTypeCount:()I:GetGetViewTypeCountHandler\nn_areAllItemsEnabled:()Z:GetAreAllItemsEnabledHandler\nn_getItemId:(I)J:GetGetItemId_IHandler\nn_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\nn_isEnabled:(I)Z:GetIsEnabled_IHandler\n";
    private ArrayList refList;

    private native boolean n_areAllItemsEnabled();

    private native int n_getCount();

    private native Object n_getItem(int i);

    private native long n_getItemId(int i);

    private native View n_getView(int i, View view, ViewGroup viewGroup);

    private native int n_getViewTypeCount();

    private native boolean n_isEnabled(int i);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.TableViewModelRenderer, Xamarin.Forms.Platform.Android", TableViewModelRenderer.class, __md_methods);
    }

    public TableViewModelRenderer() {
        if (getClass() == TableViewModelRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TableViewModelRenderer, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public TableViewModelRenderer(Context context) {
        if (getClass() == TableViewModelRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TableViewModelRenderer, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return n_getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return n_getItem(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return n_getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return n_areAllItemsEnabled();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return n_getItemId(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return n_getView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return n_isEnabled(i);
    }

    @Override // crc643f46942d9dd1fff9.CellAdapter, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.CellAdapter, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}