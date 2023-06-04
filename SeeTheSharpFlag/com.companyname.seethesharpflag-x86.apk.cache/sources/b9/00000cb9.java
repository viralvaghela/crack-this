package mono.android.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.view.accessibility.AccessibilityManager_TouchExplorationStateChangeListenerImplementor  reason: invalid class name */
/* loaded from: classes.dex */
public class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0719x9343dfd5 implements IGCUserPeer, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final String __md_methods = "n_onTouchExplorationStateChanged:(Z)V:GetOnTouchExplorationStateChanged_ZHandler:Android.Views.Accessibility.AccessibilityManager/ITouchExplorationStateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTouchExplorationStateChanged(boolean z);

    static {
        Runtime.register("Android.Views.Accessibility.AccessibilityManager+ITouchExplorationStateChangeListenerImplementor, Mono.Android", accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0719x9343dfd5.class, __md_methods);
    }

    public accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0719x9343dfd5() {
        if (getClass() == accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0719x9343dfd5.class) {
            TypeManager.Activate("Android.Views.Accessibility.AccessibilityManager+ITouchExplorationStateChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        n_onTouchExplorationStateChanged(z);
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