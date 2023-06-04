package mono.android.widget;

import android.widget.Chronometer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Chronometer_OnChronometerTickListenerImplementor implements IGCUserPeer, Chronometer.OnChronometerTickListener {
    public static final String __md_methods = "n_onChronometerTick:(Landroid/widget/Chronometer;)V:GetOnChronometerTick_Landroid_widget_Chronometer_Handler:Android.Widget.Chronometer/IOnChronometerTickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onChronometerTick(Chronometer chronometer);

    static {
        Runtime.register("Android.Widget.Chronometer+IOnChronometerTickListenerImplementor, Mono.Android", Chronometer_OnChronometerTickListenerImplementor.class, __md_methods);
    }

    public Chronometer_OnChronometerTickListenerImplementor() {
        if (getClass() == Chronometer_OnChronometerTickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.Chronometer+IOnChronometerTickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.Chronometer.OnChronometerTickListener
    public void onChronometerTick(Chronometer chronometer) {
        n_onChronometerTick(chronometer);
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