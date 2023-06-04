package mono.android.incrementaldeployment;

import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
public class IncrementalClassLoader extends ClassLoader {
    private final DelegateClassLoader delegateClassLoader;

    public IncrementalClassLoader(ClassLoader classLoader, String str, File file, String str2, List<String> list) {
        super(classLoader.getParent());
        this.delegateClassLoader = createDelegateClassLoader(file, str2, list, classLoader);
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        return this.delegateClassLoader.findClass(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class DelegateClassLoader extends BaseDexClassLoader {
        private DelegateClassLoader(String str, File file, String str2, ClassLoader classLoader) {
            super(str, file, str2, classLoader);
        }

        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public Class<?> findClass(String str) throws ClassNotFoundException {
            return super.findClass(str);
        }
    }

    private static DelegateClassLoader createDelegateClassLoader(File file, String str, List<String> list, ClassLoader classLoader) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                sb.append(File.pathSeparator);
            }
            sb.append(str2);
        }
        Log.v("IncrementalClassLoader", "Incremental dex path is " + ((Object) sb));
        Log.v("IncrementalClassLoader", "Native lib dir is " + str);
        return new DelegateClassLoader(sb.toString(), file, str, classLoader);
    }

    private static void setParent(ClassLoader classLoader, ClassLoader classLoader2) {
        try {
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            declaredField.setAccessible(true);
            declaredField.set(classLoader, classLoader2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void inject(ClassLoader classLoader, String str, File file, String str2, List<String> list) {
        setParent(classLoader, new IncrementalClassLoader(classLoader, str, file, str2, list));
    }
}