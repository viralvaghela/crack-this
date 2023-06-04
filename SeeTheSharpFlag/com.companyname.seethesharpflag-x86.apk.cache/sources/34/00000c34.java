package mono.android.media;

import android.media.ImageReader;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ImageReader_OnImageAvailableListenerImplementor implements IGCUserPeer, ImageReader.OnImageAvailableListener {
    public static final String __md_methods = "n_onImageAvailable:(Landroid/media/ImageReader;)V:GetOnImageAvailable_Landroid_media_ImageReader_Handler:Android.Media.ImageReader/IOnImageAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onImageAvailable(ImageReader imageReader);

    static {
        Runtime.register("Android.Media.ImageReader+IOnImageAvailableListenerImplementor, Mono.Android", ImageReader_OnImageAvailableListenerImplementor.class, __md_methods);
    }

    public ImageReader_OnImageAvailableListenerImplementor() {
        if (getClass() == ImageReader_OnImageAvailableListenerImplementor.class) {
            TypeManager.Activate("Android.Media.ImageReader+IOnImageAvailableListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        n_onImageAvailable(imageReader);
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