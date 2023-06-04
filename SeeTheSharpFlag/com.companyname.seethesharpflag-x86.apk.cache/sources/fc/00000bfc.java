package mono.android.app;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DatePickerDialog_OnDateSetListenerImplementor implements IGCUserPeer, DatePickerDialog.OnDateSetListener {
    public static final String __md_methods = "n_onDateSet:(Landroid/widget/DatePicker;III)V:GetOnDateSet_Landroid_widget_DatePicker_IIIHandler:Android.App.DatePickerDialog/IOnDateSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDateSet(DatePicker datePicker, int i, int i2, int i3);

    static {
        Runtime.register("Android.App.DatePickerDialog+IOnDateSetListenerImplementor, Mono.Android", DatePickerDialog_OnDateSetListenerImplementor.class, __md_methods);
    }

    public DatePickerDialog_OnDateSetListenerImplementor() {
        if (getClass() == DatePickerDialog_OnDateSetListenerImplementor.class) {
            TypeManager.Activate("Android.App.DatePickerDialog+IOnDateSetListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        n_onDateSet(datePicker, i, i2, i3);
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