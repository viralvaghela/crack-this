package com.xamarin.java_interop.internal;

import com.xamarin.java_interop.GCUserPeerable;
import com.xamarin.java_interop.ManagedPeer;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class JavaProxyObject implements GCUserPeerable {
    static final String assemblyQualifiedName = "Java.Interop.JavaProxyObject, Java.Interop";
    ArrayList<Object> managedReferences = new ArrayList<>();

    public native boolean equals(Object obj);

    public native int hashCode();

    public native String toString();

    JavaProxyObject() {
    }

    static {
        ManagedPeer.registerNativeMembers(JavaProxyObject.class, assemblyQualifiedName, "");
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