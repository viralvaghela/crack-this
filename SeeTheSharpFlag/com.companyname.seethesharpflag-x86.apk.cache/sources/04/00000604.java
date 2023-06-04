package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.util.ObjectsCompat;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioFocusRequestCompat {
    static final AudioAttributesCompat FOCUS_DEFAULT_ATTR = new AudioAttributesCompat.Builder().setUsage(1).build();
    private final AudioAttributesCompat mAudioAttributesCompat;
    private final Handler mFocusChangeHandler;
    private final int mFocusGain;
    private final Object mFrameworkAudioFocusRequest;
    private final AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private final boolean mPauseOnDuck;

    AudioFocusRequestCompat(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.mFocusGain = i;
        this.mFocusChangeHandler = handler;
        this.mAudioAttributesCompat = audioAttributesCompat;
        this.mPauseOnDuck = z;
        if (Build.VERSION.SDK_INT < 26 && handler.getLooper() != Looper.getMainLooper()) {
            this.mOnAudioFocusChangeListener = new OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.mFrameworkAudioFocusRequest = new AudioFocusRequest.Builder(i).setAudioAttributes(getAudioAttributes()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(this.mOnAudioFocusChangeListener, handler).build();
        } else {
            this.mFrameworkAudioFocusRequest = null;
        }
    }

    public int getFocusGain() {
        return this.mFocusGain;
    }

    public AudioAttributesCompat getAudioAttributesCompat() {
        return this.mAudioAttributesCompat;
    }

    public boolean willPauseWhenDucked() {
        return this.mPauseOnDuck;
    }

    public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.mOnAudioFocusChangeListener;
    }

    public Handler getFocusChangeHandler() {
        return this.mFocusChangeHandler;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioFocusRequestCompat) {
            AudioFocusRequestCompat audioFocusRequestCompat = (AudioFocusRequestCompat) obj;
            return this.mFocusGain == audioFocusRequestCompat.mFocusGain && this.mPauseOnDuck == audioFocusRequestCompat.mPauseOnDuck && ObjectsCompat.equals(this.mOnAudioFocusChangeListener, audioFocusRequestCompat.mOnAudioFocusChangeListener) && ObjectsCompat.equals(this.mFocusChangeHandler, audioFocusRequestCompat.mFocusChangeHandler) && ObjectsCompat.equals(this.mAudioAttributesCompat, audioFocusRequestCompat.mAudioAttributesCompat);
        }
        return false;
    }

    public int hashCode() {
        return ObjectsCompat.hash(Integer.valueOf(this.mFocusGain), this.mOnAudioFocusChangeListener, this.mFocusChangeHandler, this.mAudioAttributesCompat, Boolean.valueOf(this.mPauseOnDuck));
    }

    AudioAttributes getAudioAttributes() {
        AudioAttributesCompat audioAttributesCompat = this.mAudioAttributesCompat;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.unwrap();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioFocusRequest getAudioFocusRequest() {
        return (AudioFocusRequest) this.mFrameworkAudioFocusRequest;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private AudioAttributesCompat mAudioAttributesCompat;
        private Handler mFocusChangeHandler;
        private int mFocusGain;
        private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
        private boolean mPauseOnDuck;

        private static boolean isValidFocusGain(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public Builder(int i) {
            this.mAudioAttributesCompat = AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
            setFocusGain(i);
        }

        public Builder(AudioFocusRequestCompat audioFocusRequestCompat) {
            this.mAudioAttributesCompat = AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
            if (audioFocusRequestCompat == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.mFocusGain = audioFocusRequestCompat.getFocusGain();
            this.mOnAudioFocusChangeListener = audioFocusRequestCompat.getOnAudioFocusChangeListener();
            this.mFocusChangeHandler = audioFocusRequestCompat.getFocusChangeHandler();
            this.mAudioAttributesCompat = audioFocusRequestCompat.getAudioAttributesCompat();
            this.mPauseOnDuck = audioFocusRequestCompat.willPauseWhenDucked();
        }

        public Builder setFocusGain(int i) {
            if (!isValidFocusGain(i)) {
                throw new IllegalArgumentException("Illegal audio focus gain type " + i);
            }
            if (Build.VERSION.SDK_INT < 19 && i == 4) {
                i = 2;
            }
            this.mFocusGain = i;
            return this;
        }

        public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener != null) {
                if (handler == null) {
                    throw new IllegalArgumentException("Handler must not be null");
                }
                this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
                this.mFocusChangeHandler = handler;
                return this;
            }
            throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
        }

        public Builder setAudioAttributes(AudioAttributesCompat audioAttributesCompat) {
            Objects.requireNonNull(audioAttributesCompat, "Illegal null AudioAttributes");
            this.mAudioAttributesCompat = audioAttributesCompat;
            return this;
        }

        public Builder setWillPauseWhenDucked(boolean z) {
            this.mPauseOnDuck = z;
            return this;
        }

        public AudioFocusRequestCompat build() {
            if (this.mOnAudioFocusChangeListener == null) {
                throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
            }
            return new AudioFocusRequestCompat(this.mFocusGain, this.mOnAudioFocusChangeListener, this.mFocusChangeHandler, this.mAudioAttributesCompat, this.mPauseOnDuck);
        }
    }

    /* loaded from: classes.dex */
    private static class OnAudioFocusChangeListenerHandlerCompat implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        private static final int FOCUS_CHANGE = 2782386;
        private final Handler mHandler;
        private final AudioManager.OnAudioFocusChangeListener mListener;

        OnAudioFocusChangeListenerHandlerCompat(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.mListener = onAudioFocusChangeListener;
            this.mHandler = new Handler(handler.getLooper(), this);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            Handler handler = this.mHandler;
            handler.sendMessage(Message.obtain(handler, FOCUS_CHANGE, i, 0));
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == FOCUS_CHANGE) {
                this.mListener.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }
    }
}