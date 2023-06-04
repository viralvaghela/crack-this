package mono.android.hardware;

import android.hardware.Camera;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Camera_FaceDetectionListenerImplementor implements IGCUserPeer, Camera.FaceDetectionListener {
    public static final String __md_methods = "n_onFaceDetection:([Landroid/hardware/Camera$Face;Landroid/hardware/Camera;)V:GetOnFaceDetection_arrayLandroid_hardware_Camera_Face_Landroid_hardware_Camera_Handler:Android.Hardware.Camera/IFaceDetectionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onFaceDetection(Camera.Face[] faceArr, Camera camera);

    static {
        Runtime.register("Android.Hardware.Camera+IFaceDetectionListenerImplementor, Mono.Android", Camera_FaceDetectionListenerImplementor.class, __md_methods);
    }

    public Camera_FaceDetectionListenerImplementor() {
        if (getClass() == Camera_FaceDetectionListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Camera+IFaceDetectionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        n_onFaceDetection(faceArr, camera);
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