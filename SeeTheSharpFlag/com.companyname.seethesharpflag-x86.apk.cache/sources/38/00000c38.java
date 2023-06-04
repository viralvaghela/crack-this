package mono.android.media;

import android.media.MediaCodec;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaCodec_OnFrameRenderedListenerImplementor implements IGCUserPeer, MediaCodec.OnFrameRenderedListener {
    public static final String __md_methods = "n_onFrameRendered:(Landroid/media/MediaCodec;JJ)V:GetOnFrameRendered_Landroid_media_MediaCodec_JJHandler:Android.Media.MediaCodec/IOnFrameRenderedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onFrameRendered(MediaCodec mediaCodec, long j, long j2);

    static {
        Runtime.register("Android.Media.MediaCodec+IOnFrameRenderedListenerImplementor, Mono.Android", MediaCodec_OnFrameRenderedListenerImplementor.class, __md_methods);
    }

    public MediaCodec_OnFrameRenderedListenerImplementor() {
        if (getClass() == MediaCodec_OnFrameRenderedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaCodec+IOnFrameRenderedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        n_onFrameRendered(mediaCodec, j, j2);
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