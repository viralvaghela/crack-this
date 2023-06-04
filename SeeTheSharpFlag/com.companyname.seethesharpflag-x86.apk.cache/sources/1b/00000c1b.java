package mono.android.graphics;

import android.graphics.ImageDecoder;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ImageDecoder_OnHeaderDecodedListenerImplementor implements IGCUserPeer, ImageDecoder.OnHeaderDecodedListener {
    public static final String __md_methods = "n_onHeaderDecoded:(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V:GetOnHeaderDecoded_Landroid_graphics_ImageDecoder_Landroid_graphics_ImageDecoder_ImageInfo_Landroid_graphics_ImageDecoder_Source_Handler:Android.Graphics.ImageDecoder/IOnHeaderDecodedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source);

    static {
        Runtime.register("Android.Graphics.ImageDecoder+IOnHeaderDecodedListenerImplementor, Mono.Android", ImageDecoder_OnHeaderDecodedListenerImplementor.class, __md_methods);
    }

    public ImageDecoder_OnHeaderDecodedListenerImplementor() {
        if (getClass() == ImageDecoder_OnHeaderDecodedListenerImplementor.class) {
            TypeManager.Activate("Android.Graphics.ImageDecoder+IOnHeaderDecodedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        n_onHeaderDecoded(imageDecoder, imageInfo, source);
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