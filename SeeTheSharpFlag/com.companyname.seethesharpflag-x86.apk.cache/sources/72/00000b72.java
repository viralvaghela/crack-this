package crc643f46942d9dd1fff9;

import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OpenGLViewRenderer_Renderer implements IGCUserPeer, GLSurfaceView.Renderer {
    public static final String __md_methods = "n_onDrawFrame:(Ljavax/microedition/khronos/opengles/GL10;)V:GetOnDrawFrame_Ljavax_microedition_khronos_opengles_GL10_Handler:Android.Opengl.GLSurfaceView/IRendererInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceChanged:(Ljavax/microedition/khronos/opengles/GL10;II)V:GetOnSurfaceChanged_Ljavax_microedition_khronos_opengles_GL10_IIHandler:Android.Opengl.GLSurfaceView/IRendererInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceCreated:(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V:GetOnSurfaceCreated_Ljavax_microedition_khronos_opengles_GL10_Ljavax_microedition_khronos_egl_EGLConfig_Handler:Android.Opengl.GLSurfaceView/IRendererInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrawFrame(GL10 gl10);

    private native void n_onSurfaceChanged(GL10 gl10, int i, int i2);

    private native void n_onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.OpenGLViewRenderer+Renderer, Xamarin.Forms.Platform.Android", OpenGLViewRenderer_Renderer.class, __md_methods);
    }

    public OpenGLViewRenderer_Renderer() {
        if (getClass() == OpenGLViewRenderer_Renderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.OpenGLViewRenderer+Renderer, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        n_onDrawFrame(gl10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        n_onSurfaceChanged(gl10, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        n_onSurfaceCreated(gl10, eGLConfig);
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