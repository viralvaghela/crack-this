package mono.android.widget;

import android.widget.RatingBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RatingBar_OnRatingBarChangeListenerImplementor implements IGCUserPeer, RatingBar.OnRatingBarChangeListener {
    public static final String __md_methods = "n_onRatingChanged:(Landroid/widget/RatingBar;FZ)V:GetOnRatingChanged_Landroid_widget_RatingBar_FZHandler:Android.Widget.RatingBar/IOnRatingBarChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onRatingChanged(RatingBar ratingBar, float f, boolean z);

    static {
        Runtime.register("Android.Widget.RatingBar+IOnRatingBarChangeListenerImplementor, Mono.Android", RatingBar_OnRatingBarChangeListenerImplementor.class, __md_methods);
    }

    public RatingBar_OnRatingBarChangeListenerImplementor() {
        if (getClass() == RatingBar_OnRatingBarChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.RatingBar+IOnRatingBarChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        n_onRatingChanged(ratingBar, f, z);
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