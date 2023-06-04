package mono.android.widget;

import android.widget.SeekBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SeekBar_OnSeekBarChangeListenerImplementor implements IGCUserPeer, SeekBar.OnSeekBarChangeListener {
    public static final String __md_methods = "n_onProgressChanged:(Landroid/widget/SeekBar;IZ)V:GetOnProgressChanged_Landroid_widget_SeekBar_IZHandler:Android.Widget.SeekBar/IOnSeekBarChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onStartTrackingTouch:(Landroid/widget/SeekBar;)V:GetOnStartTrackingTouch_Landroid_widget_SeekBar_Handler:Android.Widget.SeekBar/IOnSeekBarChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onStopTrackingTouch:(Landroid/widget/SeekBar;)V:GetOnStopTrackingTouch_Landroid_widget_SeekBar_Handler:Android.Widget.SeekBar/IOnSeekBarChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onProgressChanged(SeekBar seekBar, int i, boolean z);

    private native void n_onStartTrackingTouch(SeekBar seekBar);

    private native void n_onStopTrackingTouch(SeekBar seekBar);

    static {
        Runtime.register("Android.Widget.SeekBar+IOnSeekBarChangeListenerImplementor, Mono.Android", SeekBar_OnSeekBarChangeListenerImplementor.class, __md_methods);
    }

    public SeekBar_OnSeekBarChangeListenerImplementor() {
        if (getClass() == SeekBar_OnSeekBarChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SeekBar+IOnSeekBarChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        n_onProgressChanged(seekBar, i, z);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        n_onStartTrackingTouch(seekBar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        n_onStopTrackingTouch(seekBar);
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