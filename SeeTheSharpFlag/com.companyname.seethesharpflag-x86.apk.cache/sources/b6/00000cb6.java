package mono.android.view;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Window_OnFrameMetricsAvailableListenerImplementor implements IGCUserPeer, Window.OnFrameMetricsAvailableListener {
    public static final String __md_methods = "n_onFrameMetricsAvailable:(Landroid/view/Window;Landroid/view/FrameMetrics;I)V:GetOnFrameMetricsAvailable_Landroid_view_Window_Landroid_view_FrameMetrics_IHandler:Android.Views.Window/IOnFrameMetricsAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i);

    static {
        Runtime.register("Android.Views.Window+IOnFrameMetricsAvailableListenerImplementor, Mono.Android", Window_OnFrameMetricsAvailableListenerImplementor.class, __md_methods);
    }

    public Window_OnFrameMetricsAvailableListenerImplementor() {
        if (getClass() == Window_OnFrameMetricsAvailableListenerImplementor.class) {
            TypeManager.Activate("Android.Views.Window+IOnFrameMetricsAvailableListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        n_onFrameMetricsAvailable(window, frameMetrics, i);
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