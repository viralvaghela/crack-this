package mono.android.media;

import android.media.ImageWriter;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ImageWriter_OnImageReleasedListenerImplementor implements IGCUserPeer, ImageWriter.OnImageReleasedListener {
    public static final String __md_methods = "n_onImageReleased:(Landroid/media/ImageWriter;)V:GetOnImageReleased_Landroid_media_ImageWriter_Handler:Android.Media.ImageWriter/IOnImageReleasedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onImageReleased(ImageWriter imageWriter);

    static {
        Runtime.register("Android.Media.ImageWriter+IOnImageReleasedListenerImplementor, Mono.Android", ImageWriter_OnImageReleasedListenerImplementor.class, __md_methods);
    }

    public ImageWriter_OnImageReleasedListenerImplementor() {
        if (getClass() == ImageWriter_OnImageReleasedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.ImageWriter+IOnImageReleasedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public void onImageReleased(ImageWriter imageWriter) {
        n_onImageReleased(imageWriter);
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