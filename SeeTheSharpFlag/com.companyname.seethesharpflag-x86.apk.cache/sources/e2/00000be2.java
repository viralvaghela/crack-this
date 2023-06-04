package mono;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public class MonoRuntimeProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        String[] strArr;
        String[] strArr2;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr2 = applicationInfo.splitPublicSourceDirs) == null || strArr2.length <= 0) {
            strArr = null;
        } else {
            strArr = new String[strArr2.length + 1];
            strArr[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr2, 0, strArr, 1, strArr2.length);
        }
        if (strArr == null) {
            strArr = new String[]{applicationInfo.sourceDir};
        }
        MonoPackageManager.LoadApplication(context, applicationInfo, strArr);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new RuntimeException("This operation is not supported.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new RuntimeException("This operation is not supported.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new RuntimeException("This operation is not supported.");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new RuntimeException("This operation is not supported.");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new RuntimeException("This operation is not supported.");
    }
}