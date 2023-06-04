package crc643f46942d9dd1fff9;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormsApplicationActivity extends Activity implements IGCUserPeer {
    public static final String __md_methods = "n_onBackPressed:()V:GetOnBackPressedHandler\nn_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\nn_onPrepareOptionsMenu:(Landroid/view/Menu;)Z:GetOnPrepareOptionsMenu_Landroid_view_Menu_Handler\nn_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\nn_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onPause:()V:GetOnPauseHandler\nn_onRestart:()V:GetOnRestartHandler\nn_onResume:()V:GetOnResumeHandler\nn_onStart:()V:GetOnStartHandler\nn_onStop:()V:GetOnStopHandler\n";
    private ArrayList refList;

    private native void n_onActivityResult(int i, int i2, Intent intent);

    private native void n_onBackPressed();

    private native void n_onConfigurationChanged(Configuration configuration);

    private native void n_onCreate(Bundle bundle);

    private native void n_onDestroy();

    private native boolean n_onOptionsItemSelected(MenuItem menuItem);

    private native void n_onPause();

    private native boolean n_onPrepareOptionsMenu(Menu menu);

    private native void n_onRestart();

    private native void n_onResume();

    private native void n_onStart();

    private native void n_onStop();

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormsApplicationActivity, Xamarin.Forms.Platform.Android", FormsApplicationActivity.class, __md_methods);
    }

    public FormsApplicationActivity() {
        if (getClass() == FormsApplicationActivity.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormsApplicationActivity, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        n_onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        n_onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return n_onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return n_onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        n_onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        n_onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        n_onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        n_onRestart();
    }

    @Override // android.app.Activity
    public void onResume() {
        n_onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        n_onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        n_onStop();
    }

    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}