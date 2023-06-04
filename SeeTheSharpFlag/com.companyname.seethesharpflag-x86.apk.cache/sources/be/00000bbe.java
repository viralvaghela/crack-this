package crc643f46942d9dd1fff9;

import android.app.TimePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TimePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public abstract class TimePickerRendererBase_1 extends ViewRenderer_2 implements IGCUserPeer, TimePickerDialog.OnTimeSetListener {
    public static final String __md_methods = "n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:Android.App.TimePickerDialog/IOnTimeSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTimeSet(TimePicker timePicker, int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.TimePickerRendererBase`1, Xamarin.Forms.Platform.Android", TimePickerRendererBase_1.class, "n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:Android.App.TimePickerDialog/IOnTimeSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public TimePickerRendererBase_1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == TimePickerRendererBase_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TimePickerRendererBase`1, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public TimePickerRendererBase_1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == TimePickerRendererBase_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TimePickerRendererBase`1, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public TimePickerRendererBase_1(Context context) {
        super(context);
        if (getClass() == TimePickerRendererBase_1.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.TimePickerRendererBase`1, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        n_onTimeSet(timePicker, i, i2);
    }

    @Override // crc643f46942d9dd1fff9.ViewRenderer_2, crc643f46942d9dd1fff9.VisualElementRenderer_1, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.ViewRenderer_2, crc643f46942d9dd1fff9.VisualElementRenderer_1, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}