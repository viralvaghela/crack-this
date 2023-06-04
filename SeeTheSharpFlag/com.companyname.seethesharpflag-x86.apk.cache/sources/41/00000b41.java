package crc643f46942d9dd1fff9;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsAppCompatActivity extends AppCompatActivity implements IGCUserPeer {
    public static final String __md_methods = "n_onBackPressed:()V:GetOnBackPressedHandler\nn_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\nn_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\nn_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onNewIntent:(Landroid/content/Intent;)V:GetOnNewIntent_Landroid_content_Intent_Handler\nn_onPause:()V:GetOnPauseHandler\nn_onRestart:()V:GetOnRestartHandler\nn_onResume:()V:GetOnResumeHandler\nn_onStart:()V:GetOnStartHandler\nn_onStop:()V:GetOnStopHandler\n";
    private ArrayList refList;

    private native void n_onActivityResult(int i, int i2, Intent intent);

    private native void n_onBackPressed();

    private native void n_onConfigurationChanged(Configuration configuration);

    private native void n_onCreate(Bundle bundle);

    private native void n_onDestroy();

    private native void n_onNewIntent(Intent intent);

    private native boolean n_onOptionsItemSelected(MenuItem menuItem);

    private native void n_onPause();

    private native void n_onRestart();

    private native void n_onResume();

    private native void n_onStart();

    private native void n_onStop();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsAppCompatActivity, Xamarin.Forms.Platform.Android", FormsAppCompatActivity.class, __md_methods);
    }

    public FormsAppCompatActivity() {
        if (getClass() == FormsAppCompatActivity.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsAppCompatActivity, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public FormsAppCompatActivity(int i) {
        super(i);
        if (getClass() == FormsAppCompatActivity.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsAppCompatActivity, Xamarin.Forms.Platform.Android", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        n_onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        n_onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return n_onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        n_onActivityResult(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        n_onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        n_onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        n_onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        n_onRestart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        n_onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        n_onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        n_onStop();
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