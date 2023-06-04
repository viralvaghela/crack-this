package androidx.media;

import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final String TAG = "AudioManCompat";

    public static int requestAudioFocus(AudioManager audioManager, AudioFocusRequestCompat audioFocusRequestCompat) {
        if (audioManager != null) {
            if (audioFocusRequestCompat == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                return audioManager.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest());
            }
            return audioManager.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributesCompat().getLegacyStreamType(), audioFocusRequestCompat.getFocusGain());
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager, AudioFocusRequestCompat audioFocusRequestCompat) {
        if (audioManager != null) {
            if (audioFocusRequestCompat == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                return audioManager.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest());
            }
            return audioManager.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    public static int getStreamMaxVolume(AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    public static int getStreamMinVolume(AudioManager audioManager, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }

    private AudioManagerCompat() {
    }
}