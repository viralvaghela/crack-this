package crc643f46942d9dd1fff9;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import android.text.style.ParagraphStyle;
import android.text.style.WrapTogetherSpan;
import android.widget.TextView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FormattedStringExtensions_LineHeightSpan implements IGCUserPeer, LineHeightSpan, ParagraphStyle, WrapTogetherSpan {
    public static final String __md_methods = "n_chooseHeight:(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V:GetChooseHeight_Ljava_lang_CharSequence_IIIILandroid_graphics_Paint_FontMetricsInt_Handler:Android.Text.Style.ILineHeightSpanInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.FormattedStringExtensions+LineHeightSpan, Xamarin.Forms.Platform.Android", FormattedStringExtensions_LineHeightSpan.class, __md_methods);
    }

    public FormattedStringExtensions_LineHeightSpan() {
        if (getClass() == FormattedStringExtensions_LineHeightSpan.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormattedStringExtensions+LineHeightSpan, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    public FormattedStringExtensions_LineHeightSpan(TextView textView, double d) {
        if (getClass() == FormattedStringExtensions_LineHeightSpan.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.FormattedStringExtensions+LineHeightSpan, Xamarin.Forms.Platform.Android", "Android.Widget.TextView, Mono.Android:System.Double, mscorlib", this, new Object[]{textView, Double.valueOf(d)});
        }
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        n_chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt);
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