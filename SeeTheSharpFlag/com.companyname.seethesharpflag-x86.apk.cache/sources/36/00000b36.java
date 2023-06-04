package crc643f46942d9dd1fff9;

import android.content.Context;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EntryCellView extends LinearLayout implements IGCUserPeer, TextWatcher, NoCopySpan, View.OnFocusChangeListener, TextView.OnEditorActionListener {
    public static final String __md_methods = "n_afterTextChanged:(Landroid/text/Editable;)V:GetAfterTextChanged_Landroid_text_Editable_Handler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_beforeTextChanged:(Ljava/lang/CharSequence;III)V:GetBeforeTextChanged_Ljava_lang_CharSequence_IIIHandler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTextChanged:(Ljava/lang/CharSequence;III)V:GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onFocusChange:(Landroid/view/View;Z)V:GetOnFocusChange_Landroid_view_View_ZHandler:Android.Views.View/IOnFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onEditorAction:(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z:GetOnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_Handler:Android.Widget.TextView/IOnEditorActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_afterTextChanged(Editable editable);

    private native void n_beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    private native boolean n_onEditorAction(TextView textView, int i, KeyEvent keyEvent);

    private native void n_onFocusChange(View view, boolean z);

    private native void n_onTextChanged(CharSequence charSequence, int i, int i2, int i3);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.EntryCellView, Xamarin.Forms.Platform.Android", EntryCellView.class, __md_methods);
    }

    public EntryCellView(Context context) {
        super(context);
        if (getClass() == EntryCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public EntryCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == EntryCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public EntryCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == EntryCellView.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryCellView, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        n_afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        n_beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        n_onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        n_onFocusChange(view, z);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return n_onEditorAction(textView, i, keyEvent);
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