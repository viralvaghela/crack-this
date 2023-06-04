package crc643f46942d9dd1fff9;

import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class GradientStrokeDrawable_GradientShaderFactory extends ShapeDrawable.ShaderFactory implements IGCUserPeer {
    public static final String __md_methods = "n_resize:(II)Landroid/graphics/Shader;:GetResize_IIHandler\n";
    private ArrayList refList;

    private native Shader n_resize(int i, int i2);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.GradientStrokeDrawable+GradientShaderFactory, Xamarin.Forms.Platform.Android", GradientStrokeDrawable_GradientShaderFactory.class, __md_methods);
    }

    public GradientStrokeDrawable_GradientShaderFactory() {
        if (getClass() == GradientStrokeDrawable_GradientShaderFactory.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.GradientStrokeDrawable+GradientShaderFactory, Xamarin.Forms.Platform.Android", "", this, new Object[0]);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public Shader resize(int i, int i2) {
        return n_resize(i, i2);
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