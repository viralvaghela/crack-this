package mono.android.app;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TimePickerDialog_OnTimeSetListenerImplementor implements IGCUserPeer, TimePickerDialog.OnTimeSetListener {
    public static final String __md_methods = "n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:Android.App.TimePickerDialog/IOnTimeSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTimeSet(TimePicker timePicker, int i, int i2);

    static {
        Runtime.register("Android.App.TimePickerDialog+IOnTimeSetListenerImplementor, Mono.Android", TimePickerDialog_OnTimeSetListenerImplementor.class, "n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:Android.App.TimePickerDialog/IOnTimeSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public TimePickerDialog_OnTimeSetListenerImplementor() {
        if (getClass() == TimePickerDialog_OnTimeSetListenerImplementor.class) {
            TypeManager.Activate("Android.App.TimePickerDialog+IOnTimeSetListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        n_onTimeSet(timePicker, i, i2);
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