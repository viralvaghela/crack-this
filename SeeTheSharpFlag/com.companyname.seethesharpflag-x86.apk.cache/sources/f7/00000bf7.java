package mono.android.app;

import android.app.AlarmManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AlarmManager_OnAlarmListenerImplementor implements IGCUserPeer, AlarmManager.OnAlarmListener {
    public static final String __md_methods = "n_onAlarm:()V:GetOnAlarmHandler:Android.App.AlarmManager/IOnAlarmListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAlarm();

    static {
        Runtime.register("Android.App.AlarmManager+IOnAlarmListenerImplementor, Mono.Android", AlarmManager_OnAlarmListenerImplementor.class, __md_methods);
    }

    public AlarmManager_OnAlarmListenerImplementor() {
        if (getClass() == AlarmManager_OnAlarmListenerImplementor.class) {
            TypeManager.Activate("Android.App.AlarmManager+IOnAlarmListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.AlarmManager.OnAlarmListener
    public void onAlarm() {
        n_onAlarm();
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