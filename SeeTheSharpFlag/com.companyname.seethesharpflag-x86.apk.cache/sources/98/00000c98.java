package mono.android.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TextureView_SurfaceTextureListenerImplementor implements IGCUserPeer, TextureView.SurfaceTextureListener {
    public static final String __md_methods = "n_onSurfaceTextureAvailable:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureAvailable_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceTextureDestroyed:(Landroid/graphics/SurfaceTexture;)Z:GetOnSurfaceTextureDestroyed_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceTextureSizeChanged:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureSizeChanged_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceTextureUpdated:(Landroid/graphics/SurfaceTexture;)V:GetOnSurfaceTextureUpdated_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2);

    private native boolean n_onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture);

    private native void n_onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2);

    private native void n_onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    static {
        Runtime.register("Android.Views.TextureView+ISurfaceTextureListenerImplementor, Mono.Android", TextureView_SurfaceTextureListenerImplementor.class, __md_methods);
    }

    public TextureView_SurfaceTextureListenerImplementor() {
        if (getClass() == TextureView_SurfaceTextureListenerImplementor.class) {
            TypeManager.Activate("Android.Views.TextureView+ISurfaceTextureListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        n_onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return n_onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        n_onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        n_onSurfaceTextureUpdated(surfaceTexture);
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