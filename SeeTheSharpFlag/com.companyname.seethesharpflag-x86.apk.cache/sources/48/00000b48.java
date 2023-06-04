package crc643f46942d9dd1fff9;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Map;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsVideoView extends VideoView implements IGCUserPeer {
    public static final String __md_methods = "n_setVideoPath:(Ljava/lang/String;)V:GetSetVideoPath_Ljava_lang_String_Handler\nn_setVideoURI:(Landroid/net/Uri;Ljava/util/Map;)V:GetSetVideoURI_Landroid_net_Uri_Ljava_util_Map_Handler\nn_setVideoURI:(Landroid/net/Uri;)V:GetSetVideoURI_Landroid_net_Uri_Handler\n";
    private ArrayList refList;

    private native void n_setVideoPath(String str);

    private native void n_setVideoURI(Uri uri);

    private native void n_setVideoURI(Uri uri, Map map);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsVideoView, Xamarin.Forms.Platform.Android", FormsVideoView.class, __md_methods);
    }

    public FormsVideoView(Context context) {
        super(context);
        if (getClass() == FormsVideoView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsVideoView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public FormsVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == FormsVideoView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsVideoView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public FormsVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == FormsVideoView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsVideoView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.widget.VideoView
    public void setVideoPath(String str) {
        n_setVideoPath(str);
    }

    @Override // android.widget.VideoView
    public void setVideoURI(Uri uri, Map map) {
        n_setVideoURI(uri, map);
    }

    @Override // android.widget.VideoView
    public void setVideoURI(Uri uri) {
        n_setVideoURI(uri);
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