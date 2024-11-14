package filerecovery.photosrecovery.allrecovery.display.audio;

import ag.a;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.lifecycle.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import tg.b;
import xf.f;
import y9.m;

/* loaded from: classes2.dex */
public class VoicePlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, u, MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f14304a;

    /* renamed from: d, reason: collision with root package name */
    public String f14307d;

    /* renamed from: g, reason: collision with root package name */
    public a f14310g;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14305b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14306c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f14308e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f14309f = new CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public final Handler f14311h = new Handler();

    /* renamed from: i, reason: collision with root package name */
    public int f14312i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public final m f14313j = new m(this, 18);

    public final int h() {
        int currentPosition;
        if (this.f14305b) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.f14304a;
        if (mediaPlayer != null) {
            try {
                currentPosition = mediaPlayer.getCurrentPosition();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return Math.max(0, currentPosition);
        }
        currentPosition = 0;
        return Math.max(0, currentPosition);
    }

    public final boolean i() {
        MediaPlayer mediaPlayer = this.f14304a;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.isPlaying();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public final void j() {
        this.f14311h.removeCallbacks(this.f14313j);
        MediaPlayer mediaPlayer = this.f14304a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
        a aVar = this.f14310g;
        if (aVar != null) {
            aVar.P();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f14309f;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != null) {
                aVar2.P();
            }
        }
    }

    public final void k() {
        this.f14305b = false;
        if (this.f14304a == null) {
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f14304a = mediaPlayer;
                mediaPlayer.setAudioStreamType(3);
                this.f14304a.setOnCompletionListener(this);
                this.f14306c = false;
                this.f14305b = false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (this.f14306c) {
            l();
            return;
        }
        try {
            this.f14304a.reset();
            this.f14304a.setDataSource(this.f14307d);
            this.f14304a.prepareAsync();
            this.f14304a.setOnPreparedListener(this);
            this.f14304a.setOnErrorListener(this);
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException e11) {
            e11.printStackTrace();
            onError(this.f14304a, 1, 0);
        }
    }

    public final void l() {
        a aVar = this.f14310g;
        if (aVar != null) {
            aVar.O();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f14309f;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != null) {
                    aVar2.O();
                }
            }
        }
        try {
            MediaPlayer mediaPlayer = this.f14304a;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            this.f14311h.post(this.f14313j);
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
        }
        int i10 = this.f14308e;
        if (i10 > 0) {
            n(i10);
            this.f14308e = 0;
        }
    }

    public final void m() {
        m mVar;
        Handler handler = this.f14311h;
        if (handler != null && (mVar = this.f14313j) != null) {
            handler.removeCallbacks(mVar);
        }
        this.f14307d = "";
        a aVar = this.f14310g;
        if (aVar != null) {
            aVar.F();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f14309f;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != null) {
                    aVar2.F();
                }
            }
        }
        MediaPlayer mediaPlayer = this.f14304a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
            b.j().P(new f(this, 7));
        }
    }

    public final void n(int i10) {
        this.f14305b = false;
        MediaPlayer mediaPlayer = this.f14304a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i10);
                this.f14311h.post(this.f14313j);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f14305b = true;
        if (this.f14304a != null) {
            if (i()) {
                j();
            }
            try {
                this.f14304a.seekTo(0);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
        }
        this.f14311h.removeCallbacks(this.f14313j);
        a aVar = this.f14310g;
        if (aVar != null) {
            aVar.D();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f14309f;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != null) {
                aVar2.D();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar = this.f14310g;
        if (aVar != null) {
            aVar.I();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f14309f;
        if (copyOnWriteArraySet.isEmpty()) {
            return true;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != null) {
                aVar2.I();
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f14306c = true;
        this.f14305b = false;
        if (mediaPlayer.getDuration() <= 5000) {
            this.f14312i = 300;
        } else {
            this.f14312i = 1000;
        }
        l();
        a aVar = this.f14310g;
        if (aVar != null) {
            aVar.x(mediaPlayer.getDuration());
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f14309f;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != null) {
                aVar2.x(mediaPlayer.getDuration());
            }
        }
    }
}
