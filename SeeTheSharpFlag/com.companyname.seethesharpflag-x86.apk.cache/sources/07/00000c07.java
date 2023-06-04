package mono.android.app;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WallpaperManager_OnColorsChangedListenerImplementor implements IGCUserPeer, WallpaperManager.OnColorsChangedListener {
    public static final String __md_methods = "n_onColorsChanged:(Landroid/app/WallpaperColors;I)V:GetOnColorsChanged_Landroid_app_WallpaperColors_IHandler:Android.App.WallpaperManager/IOnColorsChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onColorsChanged(WallpaperColors wallpaperColors, int i);

    static {
        Runtime.register("Android.App.WallpaperManager+IOnColorsChangedListenerImplementor, Mono.Android", WallpaperManager_OnColorsChangedListenerImplementor.class, __md_methods);
    }

    public WallpaperManager_OnColorsChangedListenerImplementor() {
        if (getClass() == WallpaperManager_OnColorsChangedListenerImplementor.class) {
            TypeManager.Activate("Android.App.WallpaperManager+IOnColorsChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.WallpaperManager.OnColorsChangedListener
    public void onColorsChanged(WallpaperColors wallpaperColors, int i) {
        n_onColorsChanged(wallpaperColors, i);
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