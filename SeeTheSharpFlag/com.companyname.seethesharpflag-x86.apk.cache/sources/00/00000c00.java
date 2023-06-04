package mono.android.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mono.android.Runtime;

/* loaded from: classes.dex */
public class NotifyTimeZoneChanges extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Runtime.notifyTimeZoneChanged();
    }
}