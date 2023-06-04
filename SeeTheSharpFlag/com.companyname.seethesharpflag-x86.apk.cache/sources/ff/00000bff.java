package mono.android.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class IntentService extends android.app.IntentService {
    ArrayList refList;

    public IntentService() {
        this(null);
    }

    public IntentService(String str) {
        super(str);
    }

    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}