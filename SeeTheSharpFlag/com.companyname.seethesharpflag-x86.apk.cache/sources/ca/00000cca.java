package mono.android.widget;

import android.widget.DatePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DatePicker_OnDateChangedListenerImplementor implements IGCUserPeer, DatePicker.OnDateChangedListener {
    public static final String __md_methods = "n_onDateChanged:(Landroid/widget/DatePicker;III)V:GetOnDateChanged_Landroid_widget_DatePicker_IIIHandler:Android.Widget.DatePicker/IOnDateChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDateChanged(DatePicker datePicker, int i, int i2, int i3);

    static {
        Runtime.register("Android.Widget.DatePicker+IOnDateChangedListenerImplementor, Mono.Android", DatePicker_OnDateChangedListenerImplementor.class, __md_methods);
    }

    public DatePicker_OnDateChangedListenerImplementor() {
        if (getClass() == DatePicker_OnDateChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.DatePicker+IOnDateChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        n_onDateChanged(datePicker, i, i2, i3);
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