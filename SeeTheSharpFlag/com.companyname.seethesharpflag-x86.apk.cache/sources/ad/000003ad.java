package androidx.core.content.p002pm;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: androidx.core.content.pm.PackageInfoCompat */
/* loaded from: classes.dex */
public final class PackageInfoCompat {
    public static long getLongVersionCode(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }

    private PackageInfoCompat() {
    }
}