package mono.android.database.sqlite;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SQLiteTransactionListenerImplementor implements IGCUserPeer, SQLiteTransactionListener {
    public static final String __md_methods = "n_onBegin:()V:GetOnBeginHandler:Android.Database.Sqlite.ISQLiteTransactionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onCommit:()V:GetOnCommitHandler:Android.Database.Sqlite.ISQLiteTransactionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRollback:()V:GetOnRollbackHandler:Android.Database.Sqlite.ISQLiteTransactionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onBegin();

    private native void n_onCommit();

    private native void n_onRollback();

    static {
        Runtime.register("Android.Database.Sqlite.ISQLiteTransactionListenerImplementor, Mono.Android", SQLiteTransactionListenerImplementor.class, __md_methods);
    }

    public SQLiteTransactionListenerImplementor() {
        if (getClass() == SQLiteTransactionListenerImplementor.class) {
            TypeManager.Activate("Android.Database.Sqlite.ISQLiteTransactionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onBegin() {
        n_onBegin();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onCommit() {
        n_onCommit();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public void onRollback() {
        n_onRollback();
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