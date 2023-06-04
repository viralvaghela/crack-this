package mono.android.content;

import android.content.SharedPreferences;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SharedPreferences_OnSharedPreferenceChangeListenerImplementor implements IGCUserPeer, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final String __md_methods = "n_onSharedPreferenceChanged:(Landroid/content/SharedPreferences;Ljava/lang/String;)V:GetOnSharedPreferenceChanged_Landroid_content_SharedPreferences_Ljava_lang_String_Handler:Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str);

    static {
        Runtime.register("Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerImplementor, Mono.Android", SharedPreferences_OnSharedPreferenceChangeListenerImplementor.class, __md_methods);
    }

    public SharedPreferences_OnSharedPreferenceChangeListenerImplementor() {
        if (getClass() == SharedPreferences_OnSharedPreferenceChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        n_onSharedPreferenceChanged(sharedPreferences, str);
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