package mono.android.graphics;

import android.graphics.ImageDecoder;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ImageDecoder_OnPartialImageListenerImplementor implements IGCUserPeer, ImageDecoder.OnPartialImageListener {
    public static final String __md_methods = "n_onPartialImage:(Landroid/graphics/ImageDecoder$DecodeException;)Z:GetOnPartialImage_Landroid_graphics_ImageDecoder_DecodeException_Handler:Android.Graphics.ImageDecoder/IOnPartialImageListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onPartialImage(ImageDecoder.DecodeException decodeException);

    static {
        Runtime.register("Android.Graphics.ImageDecoder+IOnPartialImageListenerImplementor, Mono.Android", ImageDecoder_OnPartialImageListenerImplementor.class, __md_methods);
    }

    public ImageDecoder_OnPartialImageListenerImplementor() {
        if (getClass() == ImageDecoder_OnPartialImageListenerImplementor.class) {
            TypeManager.Activate("Android.Graphics.ImageDecoder+IOnPartialImageListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.graphics.ImageDecoder.OnPartialImageListener
    public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
        return n_onPartialImage(decodeException);
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