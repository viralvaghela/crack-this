package crc643f46942d9dd1fff9;

import androidx.recyclerview.widget.RecyclerView;
import crc6414252951f3f66c67.RecyclerViewScrollListener_2;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CarouselViewRenderer_CarouselViewOnScrollListener extends RecyclerViewScrollListener_2 implements IGCUserPeer {
    public static final String __md_methods = "n_onScrollStateChanged:(Landroidx/recyclerview/widget/RecyclerView;I)V:GetOnScrollStateChanged_Landroidx_recyclerview_widget_RecyclerView_IHandler\nn_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n";
    private ArrayList refList;

    private native void n_onScrollStateChanged(RecyclerView recyclerView, int i);

    private native void n_onScrolled(RecyclerView recyclerView, int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.CarouselViewRenderer+CarouselViewOnScrollListener, Xamarin.Forms.Platform.Android", CarouselViewRenderer_CarouselViewOnScrollListener.class, __md_methods);
    }

    public CarouselViewRenderer_CarouselViewOnScrollListener() {
        if (getClass() == CarouselViewRenderer_CarouselViewOnScrollListener.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.CarouselViewRenderer+CarouselViewOnScrollListener, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        n_onScrollStateChanged(recyclerView, i);
    }

    @Override // crc6414252951f3f66c67.RecyclerViewScrollListener_2, androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        n_onScrolled(recyclerView, i, i2);
    }

    @Override // crc6414252951f3f66c67.RecyclerViewScrollListener_2, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc6414252951f3f66c67.RecyclerViewScrollListener_2, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}