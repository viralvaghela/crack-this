package mono.android.graphics;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SurfaceTexture_OnFrameAvailableListenerImplementor implements IGCUserPeer, SurfaceTexture.OnFrameAvailableListener {
    public static final String __md_methods = "n_onFrameAvailable:(Landroid/graphics/SurfaceTexture;)V:GetOnFrameAvailable_Landroid_graphics_SurfaceTexture_Handler:Android.Graphics.SurfaceTexture/IOnFrameAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onFrameAvailable(SurfaceTexture surfaceTexture);

    static {
        Runtime.register("Android.Graphics.SurfaceTexture+IOnFrameAvailableListenerImplementor, Mono.Android", SurfaceTexture_OnFrameAvailableListenerImplementor.class, __md_methods);
    }

    public SurfaceTexture_OnFrameAvailableListenerImplementor() {
        if (getClass() == SurfaceTexture_OnFrameAvailableListenerImplementor.class) {
            TypeManager.Activate("Android.Graphics.SurfaceTexture+IOnFrameAvailableListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        n_onFrameAvailable(surfaceTexture);
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