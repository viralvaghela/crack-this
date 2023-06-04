package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DataChangeObserver extends RecyclerView.AdapterDataObserver implements IGCUserPeer {
    public static final String __md_methods = "n_onChanged:()V:GetOnChangedHandler\nn_onItemRangeInserted:(II)V:GetOnItemRangeInserted_IIHandler\nn_onItemRangeChanged:(II)V:GetOnItemRangeChanged_IIHandler\nn_onItemRangeChanged:(IILjava/lang/Object;)V:GetOnItemRangeChanged_IILjava_lang_Object_Handler\nn_onItemRangeRemoved:(II)V:GetOnItemRangeRemoved_IIHandler\nn_onItemRangeMoved:(III)V:GetOnItemRangeMoved_IIIHandler\n";
    private ArrayList refList;

    private native void n_onChanged();

    private native void n_onItemRangeChanged(int i, int i2);

    private native void n_onItemRangeChanged(int i, int i2, Object obj);

    private native void n_onItemRangeInserted(int i, int i2);

    private native void n_onItemRangeMoved(int i, int i2, int i3);

    private native void n_onItemRangeRemoved(int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.DataChangeObserver, Xamarin.Forms.Platform.Android", DataChangeObserver.class, __md_methods);
    }

    public DataChangeObserver() {
        if (getClass() == DataChangeObserver.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.DataChangeObserver, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        n_onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        n_onItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        n_onItemRangeChanged(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        n_onItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        n_onItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        n_onItemRangeMoved(i, i2, i3);
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