package mono.android.media.midi;

import android.media.midi.MidiDevice;
import android.media.midi.MidiManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MidiManager_OnDeviceOpenedListenerImplementor implements IGCUserPeer, MidiManager.OnDeviceOpenedListener {
    public static final String __md_methods = "n_onDeviceOpened:(Landroid/media/midi/MidiDevice;)V:GetOnDeviceOpened_Landroid_media_midi_MidiDevice_Handler:Android.Media.Midi.MidiManager/IOnDeviceOpenedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDeviceOpened(MidiDevice midiDevice);

    static {
        Runtime.register("Android.Media.Midi.MidiManager+IOnDeviceOpenedListenerImplementor, Mono.Android", MidiManager_OnDeviceOpenedListenerImplementor.class, __md_methods);
    }

    public MidiManager_OnDeviceOpenedListenerImplementor() {
        if (getClass() == MidiManager_OnDeviceOpenedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Midi.MidiManager+IOnDeviceOpenedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.midi.MidiManager.OnDeviceOpenedListener
    public void onDeviceOpened(MidiDevice midiDevice) {
        n_onDeviceOpened(midiDevice);
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