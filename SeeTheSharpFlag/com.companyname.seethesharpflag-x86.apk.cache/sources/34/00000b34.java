package crc643f46942d9dd1fff9;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EntryAccessibilityDelegate extends View.AccessibilityDelegate implements IGCUserPeer {
    public static final String __md_methods = "n_onInitializeAccessibilityNodeInfo:(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_View_Landroid_view_accessibility_AccessibilityNodeInfo_Handler\n";
    private ArrayList refList;

    private native void n_onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.EntryAccessibilityDelegate, Xamarin.Forms.Platform.Android", EntryAccessibilityDelegate.class, __md_methods);
    }

    public EntryAccessibilityDelegate() {
        if (getClass() == EntryAccessibilityDelegate.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryAccessibilityDelegate, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        n_onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
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