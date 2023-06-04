package com.xamarin.java_interop.internal;

import com.xamarin.java_interop.GCUserPeerable;
import com.xamarin.java_interop.ManagedPeer;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class JavaProxyThrowable extends Error implements GCUserPeerable {
    static final String assemblyQualifiedName = "Java.Interop.JavaProxyThrowable, Java.Interop";
    ArrayList<Object> managedReferences;

    static {
        ManagedPeer.registerNativeMembers(JavaProxyThrowable.class, assemblyQualifiedName, "");
    }

    public JavaProxyThrowable() {
        this.managedReferences = new ArrayList<>();
    }

    public JavaProxyThrowable(String str) {
        super(str);
        this.managedReferences = new ArrayList<>();
    }

    @Override // com.xamarin.java_interop.GCUserPeerable
    public void jiAddManagedReference(Object obj) {
        this.managedReferences.add(obj);
    }

    @Override // com.xamarin.java_interop.GCUserPeerable
    public void jiClearManagedReferences() {
        this.managedReferences.clear();
    }
}