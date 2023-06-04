package mono.android.widget;

import android.widget.CalendarView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CalendarView_OnDateChangeListenerImplementor implements IGCUserPeer, CalendarView.OnDateChangeListener {
    public static final String __md_methods = "n_onSelectedDayChange:(Landroid/widget/CalendarView;III)V:GetOnSelectedDayChange_Landroid_widget_CalendarView_IIIHandler:Android.Widget.CalendarView/IOnDateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3);

    static {
        Runtime.register("Android.Widget.CalendarView+IOnDateChangeListenerImplementor, Mono.Android", CalendarView_OnDateChangeListenerImplementor.class, __md_methods);
    }

    public CalendarView_OnDateChangeListenerImplementor() {
        if (getClass() == CalendarView_OnDateChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.CalendarView+IOnDateChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.CalendarView.OnDateChangeListener
    public void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
        n_onSelectedDayChange(calendarView, i, i2, i3);
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