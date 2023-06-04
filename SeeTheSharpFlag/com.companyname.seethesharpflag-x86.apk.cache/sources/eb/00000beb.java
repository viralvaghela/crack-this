package mono.android.accessibilityservice;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Region;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* renamed from: mono.android.accessibilityservice.AccessibilityService_MagnificationController_OnMagnificationChangedListenerImplementor */
/* loaded from: classes.dex */
public class C0714xb19d768a implements IGCUserPeer, AccessibilityService.MagnificationController.OnMagnificationChangedListener {
    public static final String __md_methods = "n_onMagnificationChanged:(Landroid/accessibilityservice/AccessibilityService$MagnificationController;Landroid/graphics/Region;FFF)V:GetOnMagnificationChanged_Landroid_accessibilityservice_AccessibilityService_MagnificationController_Landroid_graphics_Region_FFFHandler:Android.AccessibilityServices.AccessibilityService/MagnificationController/IOnMagnificationChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onMagnificationChanged(AccessibilityService.MagnificationController magnificationController, Region region, float f, float f2, float f3);

    static {
        Runtime.register("Android.AccessibilityServices.AccessibilityService+MagnificationController+IOnMagnificationChangedListenerImplementor, Mono.Android", C0714xb19d768a.class, __md_methods);
    }

    public C0714xb19d768a() {
        if (getClass() == C0714xb19d768a.class) {
            TypeManager.Activate("Android.AccessibilityServices.AccessibilityService+MagnificationController+IOnMagnificationChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener
    public void onMagnificationChanged(AccessibilityService.MagnificationController magnificationController, Region region, float f, float f2, float f3) {
        n_onMagnificationChanged(magnificationController, region, f, f2, f3);
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