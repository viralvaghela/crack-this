package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SwitchCellView extends BaseCellView implements IGCUserPeer, CompoundButton.OnCheckedChangeListener {
    public static final String __md_methods = "n_onCheckedChanged:(Landroid/widget/CompoundButton;Z)V:GetOnCheckedChanged_Landroid_widget_CompoundButton_ZHandler:Android.Widget.CompoundButton/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCheckedChanged(CompoundButton compoundButton, boolean z);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.SwitchCellView, Xamarin.Forms.Platform.Android", SwitchCellView.class, "n_onCheckedChanged:(Landroid/widget/CompoundButton;Z)V:GetOnCheckedChanged_Landroid_widget_CompoundButton_ZHandler:Android.Widget.CompoundButton/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public SwitchCellView(Context context) {
        super(context);
        if (getClass() == SwitchCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SwitchCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public SwitchCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == SwitchCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SwitchCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public SwitchCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == SwitchCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.SwitchCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        n_onCheckedChanged(compoundButton, z);
    }

    @Override // crc643f46942d9dd1fff9.BaseCellView, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.BaseCellView, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}