package mono.android.accounts;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnAccountsUpdateListenerImplementor implements IGCUserPeer, OnAccountsUpdateListener {
    public static final String __md_methods = "n_onAccountsUpdated:([Landroid/accounts/Account;)V:GetOnAccountsUpdated_arrayLandroid_accounts_Account_Handler:Android.Accounts.IOnAccountsUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAccountsUpdated(Account[] accountArr);

    static {
        Runtime.register("Android.Accounts.IOnAccountsUpdateListenerImplementor, Mono.Android", OnAccountsUpdateListenerImplementor.class, __md_methods);
    }

    public OnAccountsUpdateListenerImplementor() {
        if (getClass() == OnAccountsUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Accounts.IOnAccountsUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public void onAccountsUpdated(Account[] accountArr) {
        n_onAccountsUpdated(accountArr);
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