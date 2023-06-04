package crc644cebad5a72cca3b1;

import android.os.Bundle;
import crc643f46942d9dd1fff9.FormsAppCompatActivity;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MainActivity extends FormsAppCompatActivity implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\n";
    private ArrayList refList;

    private native void n_onCreate(Bundle bundle);

    private native void n_onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    static {
        Runtime.register("SeeTheSharpFlag.Droid.MainActivity, SeeTheSharpFlag.Android", MainActivity.class, __md_methods);
    }

    public MainActivity() {
        if (getClass() == MainActivity.class) {
            TypeManager.Activate("SeeTheSharpFlag.Droid.MainActivity, SeeTheSharpFlag.Android", "", this, new Object[0]);
        }
    }

    public MainActivity(int i) {
        super(i);
        if (getClass() == MainActivity.class) {
            TypeManager.Activate("SeeTheSharpFlag.Droid.MainActivity, SeeTheSharpFlag.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // crc643f46942d9dd1fff9.FormsAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        n_onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // crc643f46942d9dd1fff9.FormsAppCompatActivity, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.FormsAppCompatActivity, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}