package mono.android.preference;

import android.preference.Preference;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Preference_OnPreferenceClickListenerImplementor implements IGCUserPeer, Preference.OnPreferenceClickListener {
    public static final String __md_methods = "n_onPreferenceClick:(Landroid/preference/Preference;)Z:GetOnPreferenceClick_Landroid_preference_Preference_Handler:Android.Preferences.Preference/IOnPreferenceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onPreferenceClick(Preference preference);

    static {
        Runtime.register("Android.Preferences.Preference+IOnPreferenceClickListenerImplementor, Mono.Android", Preference_OnPreferenceClickListenerImplementor.class, __md_methods);
    }

    public Preference_OnPreferenceClickListenerImplementor() {
        if (getClass() == Preference_OnPreferenceClickListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.Preference+IOnPreferenceClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        return n_onPreferenceClick(preference);
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