package mono.android.media;

import android.media.MediaCas;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaCas_EventListenerImplementor implements IGCUserPeer, MediaCas.EventListener {
    public static final String __md_methods = "n_onEvent:(Landroid/media/MediaCas;II[B)V:GetOnEvent_Landroid_media_MediaCas_IIarrayBHandler:Android.Media.MediaCas/IEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPluginStatusUpdate:(Landroid/media/MediaCas;II)V:GetOnPluginStatusUpdate_Landroid_media_MediaCas_IIHandler:Android.Media.MediaCas/IEventListener, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onResourceLost:(Landroid/media/MediaCas;)V:GetOnResourceLost_Landroid_media_MediaCas_Handler:Android.Media.MediaCas/IEventListener, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSessionEvent:(Landroid/media/MediaCas;Landroid/media/MediaCas$Session;II[B)V:GetOnSessionEvent_Landroid_media_MediaCas_Landroid_media_MediaCas_Session_IIarrayBHandler:Android.Media.MediaCas/IEventListener, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onEvent(MediaCas mediaCas, int i, int i2, byte[] bArr);

    private native void n_onPluginStatusUpdate(MediaCas mediaCas, int i, int i2);

    private native void n_onResourceLost(MediaCas mediaCas);

    private native void n_onSessionEvent(MediaCas mediaCas, MediaCas.Session session, int i, int i2, byte[] bArr);

    static {
        Runtime.register("Android.Media.MediaCas+IEventListenerImplementor, Mono.Android", MediaCas_EventListenerImplementor.class, __md_methods);
    }

    public MediaCas_EventListenerImplementor() {
        if (getClass() == MediaCas_EventListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaCas+IEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.MediaCas.EventListener
    public void onEvent(MediaCas mediaCas, int i, int i2, byte[] bArr) {
        n_onEvent(mediaCas, i, i2, bArr);
    }

    @Override // android.media.MediaCas.EventListener
    public void onPluginStatusUpdate(MediaCas mediaCas, int i, int i2) {
        n_onPluginStatusUpdate(mediaCas, i, i2);
    }

    @Override // android.media.MediaCas.EventListener
    public void onResourceLost(MediaCas mediaCas) {
        n_onResourceLost(mediaCas);
    }

    @Override // android.media.MediaCas.EventListener
    public void onSessionEvent(MediaCas mediaCas, MediaCas.Session session, int i, int i2, byte[] bArr) {
        n_onSessionEvent(mediaCas, session, i, i2, bArr);
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