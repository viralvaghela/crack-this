package mono.android.preference;

import android.preference.Preference;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Preference_OnPreferenceChangeListenerImplementor implements IGCUserPeer, Preference.OnPreferenceChangeListener {
    public static final String __md_methods = "n_onPreferenceChange:(Landroid/preference/Preference;Ljava/lang/Object;)Z:GetOnPreferenceChange_Landroid_preference_Preference_Ljava_lang_Object_Handler:Android.Preferences.Preference/IOnPreferenceChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onPreferenceChange(Preference preference, Object obj);

    static {
        Runtime.register("Android.Preferences.Preference+IOnPreferenceChangeListenerImplementor, Mono.Android", Preference_OnPreferenceChangeListenerImplementor.class, __md_methods);
    }

    public Preference_OnPreferenceChangeListenerImplementor() {
        if (getClass() == Preference_OnPreferenceChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.Preference+IOnPreferenceChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public boolean onPreferenceChange(Preference preference, Object obj) {
        return n_onPreferenceChange(preference, obj);
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