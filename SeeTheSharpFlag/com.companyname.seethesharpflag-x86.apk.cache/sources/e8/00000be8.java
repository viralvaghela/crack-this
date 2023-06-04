package mono.android;

import java.util.TimeZone;

/* loaded from: classes.dex */
public class Runtime {
    static Class java_lang_Class = Class.class;
    static Class java_lang_System = System.class;
    static Class java_util_TimeZone = TimeZone.class;
    static Class mono_android_IGCUserPeer = IGCUserPeer.class;
    static Class mono_android_GCUserPeer = GCUserPeer.class;

    public static native int createNewContext(String[] strArr, String[] strArr2, ClassLoader classLoader);

    public static native int createNewContextWithData(String[] strArr, String[] strArr2, byte[][] bArr, String[] strArr3, ClassLoader classLoader, boolean z);

    public static native void destroyContexts(int[] iArr);

    public static native void init(String str, String[] strArr, String str2, String[] strArr2, ClassLoader classLoader, String[] strArr3, String[] strArr4, String str3, int i, String[] strArr5);

    public static native void initInternal(String str, String[] strArr, String str2, String[] strArr2, ClassLoader classLoader, String[] strArr3, int i, boolean z);

    public static native void notifyTimeZoneChanged();

    public static native void propagateUncaughtException(Thread thread, Throwable th);

    public static native void register(String str, Class cls, String str2);

    public static native void switchToContext(int i);

    static {
        Thread.setDefaultUncaughtExceptionHandler(new XamarinUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()));
    }
}