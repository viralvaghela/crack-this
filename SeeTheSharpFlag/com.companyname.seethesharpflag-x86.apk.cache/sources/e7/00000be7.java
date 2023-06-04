package mono.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mono.android.incrementaldeployment.IncrementalClassLoader;

/* loaded from: classes.dex */
public class MultiDexLoader extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        File cacheDir = context.getCacheDir();
        String str = context.getApplicationInfo().nativeLibraryDir;
        String str2 = context.getApplicationInfo().dataDir;
        String packageName = context.getPackageName();
        List<String> dexList = getDexList(packageName);
        if (dexList != null && dexList.size() > 0) {
            IncrementalClassLoader.inject(MultiDexLoader.class.getClassLoader(), packageName, cacheDir, str, dexList);
        }
        super.attachInfo(context, providerInfo);
    }

    private List<String> getDexList(String str) {
        return new ArrayList();
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