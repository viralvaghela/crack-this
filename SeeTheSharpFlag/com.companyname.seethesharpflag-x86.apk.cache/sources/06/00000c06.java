package mono.android.app;

import android.app.UiAutomation;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class UiAutomation_OnAccessibilityEventListenerImplementor implements IGCUserPeer, UiAutomation.OnAccessibilityEventListener {
    public static final String __md_methods = "n_onAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V:GetOnAccessibilityEvent_Landroid_view_accessibility_AccessibilityEvent_Handler:Android.App.UiAutomation/IOnAccessibilityEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAccessibilityEvent(AccessibilityEvent accessibilityEvent);

    static {
        Runtime.register("Android.App.UiAutomation+IOnAccessibilityEventListenerImplementor, Mono.Android", UiAutomation_OnAccessibilityEventListenerImplementor.class, __md_methods);
    }

    public UiAutomation_OnAccessibilityEventListenerImplementor() {
        if (getClass() == UiAutomation_OnAccessibilityEventListenerImplementor.class) {
            TypeManager.Activate("Android.App.UiAutomation+IOnAccessibilityEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.UiAutomation.OnAccessibilityEventListener
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        n_onAccessibilityEvent(accessibilityEvent);
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