package mono.android.widget;

import android.widget.SearchView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SearchView_OnSuggestionListenerImplementor implements IGCUserPeer, SearchView.OnSuggestionListener {
    public static final String __md_methods = "n_onSuggestionClick:(I)Z:GetOnSuggestionClick_IHandler:Android.Widget.SearchView/IOnSuggestionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSuggestionSelect:(I)Z:GetOnSuggestionSelect_IHandler:Android.Widget.SearchView/IOnSuggestionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onSuggestionClick(int i);

    private native boolean n_onSuggestionSelect(int i);

    static {
        Runtime.register("Android.Widget.SearchView+IOnSuggestionListenerImplementor, Mono.Android", SearchView_OnSuggestionListenerImplementor.class, __md_methods);
    }

    public SearchView_OnSuggestionListenerImplementor() {
        if (getClass() == SearchView_OnSuggestionListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SearchView+IOnSuggestionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.SearchView.OnSuggestionListener
    public boolean onSuggestionClick(int i) {
        return n_onSuggestionClick(i);
    }

    @Override // android.widget.SearchView.OnSuggestionListener
    public boolean onSuggestionSelect(int i) {
        return n_onSuggestionSelect(i);
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