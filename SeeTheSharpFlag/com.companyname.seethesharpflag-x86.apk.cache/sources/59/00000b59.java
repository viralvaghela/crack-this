package crc643f46942d9dd1fff9;

import android.util.LruCache;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ImageCache_FormsLruCache extends LruCache implements IGCUserPeer {
    public static final String __md_methods = "n_sizeOf:(Ljava/lang/Object;Ljava/lang/Object;)I:GetSizeOf_Ljava_lang_Object_Ljava_lang_Object_Handler\n";
    private ArrayList refList;

    private native int n_sizeOf(Object obj, Object obj2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ImageCache+FormsLruCache, Xamarin.Forms.Platform.Android", ImageCache_FormsLruCache.class, __md_methods);
    }

    public ImageCache_FormsLruCache(int i) {
        super(i);
        if (getClass() == ImageCache_FormsLruCache.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ImageCache+FormsLruCache, Xamarin.Forms.Platform.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // android.util.LruCache
    public int sizeOf(Object obj, Object obj2) {
        return n_sizeOf(obj, obj2);
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