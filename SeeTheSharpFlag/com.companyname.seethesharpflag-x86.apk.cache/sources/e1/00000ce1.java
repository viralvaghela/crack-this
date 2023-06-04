package mono.android.widget;

import android.widget.TimePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TimePicker_OnTimeChangedListenerImplementor implements IGCUserPeer, TimePicker.OnTimeChangedListener {
    public static final String __md_methods = "n_onTimeChanged:(Landroid/widget/TimePicker;II)V:GetOnTimeChanged_Landroid_widget_TimePicker_IIHandler:Android.Widget.TimePicker/IOnTimeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTimeChanged(TimePicker timePicker, int i, int i2);

    static {
        Runtime.register("Android.Widget.TimePicker+IOnTimeChangedListenerImplementor, Mono.Android", TimePicker_OnTimeChangedListenerImplementor.class, __md_methods);
    }

    public TimePicker_OnTimeChangedListenerImplementor() {
        if (getClass() == TimePicker_OnTimeChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.TimePicker+IOnTimeChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i, int i2) {
        n_onTimeChanged(timePicker, i, i2);
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