package filerecovery.photosrecovery.allrecovery.ui.act.scanning;

import android.content.Intent;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import cj.w;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.ui.act.ResultForAudioDirActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ResultForDirActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ResultForDocumentDirActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.f0;
import lg.u;
import lh.q;
import v9.z4;
import vg.d;
import vg.e;
import vg.f;
import wg.b;
import xg.a;
import zg.c;

/* loaded from: classes2.dex */
public class CommonFileScanningActivity extends c implements a {
    public boolean K;
    public boolean O;
    public int R;
    public boolean T;
    public int J = 0;
    public boolean L = false;
    public int M = 0;
    public int N = 10;
    public final AtomicBoolean P = new AtomicBoolean(false);
    public final CopyOnWriteArrayList Q = new CopyOnWriteArrayList();
    public final u1.a S = new u1.a(this, 15);
    public int U = 0;

    public static void w0(CommonFileScanningActivity commonFileScanningActivity) {
        CopyOnWriteArrayList copyOnWriteArrayList = commonFileScanningActivity.Q;
        if (copyOnWriteArrayList.size() <= 2 || commonFileScanningActivity.P.get()) {
            return;
        }
        String str = (String) copyOnWriteArrayList.get(commonFileScanningActivity.R % copyOnWriteArrayList.size());
        q.b(w.n("E2kuZRJzLWEnXx9hZw==", "AoLB8zFB"), w.n("Vj5EPgg-fyAraAl3dWZSa1cgNmEZaBkgFmEMaBY9IA==", "lHvz6Aoc") + str);
        commonFileScanningActivity.f26138n.setText(str);
        commonFileScanningActivity.R = commonFileScanningActivity.R + 1;
    }

    @Override // zg.c, uf.i
    public final void V() {
        this.T = getIntent().getBooleanExtra(w.n("OG4DZSd0LmsneWxpMV8zcjptbnImYyV2JHIrZA==", "ANZPQ2Ba"), false);
        super.V();
    }

    @Override // zg.c
    public final int f0() {
        try {
            return getIntent().getIntExtra(w.n("OG4DZSd0LmsneWxzJ2wwYyFfRXkzZQ==", "quPAZSmQ"), 2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 2;
        }
    }

    @Override // zg.c
    public final SpannableString g0() {
        int i10 = f.f24200o;
        boolean z6 = e.f24199a.f24209i;
        int i11 = this.f26140p;
        return i11 != 1 ? i11 != 3 ? i11 != 8 ? z6 ? l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : z6 ? l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : z6 ? l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : z6 ? l0(R.mipmap.ic_scanning_sad, getString(R.string.arg)) : l0(R.mipmap.ic_scanning_sad, getString(R.string.arg));
    }

    @Override // zg.c
    public final SpannableString h0() {
        int i10 = f.f24200o;
        boolean z6 = e.f24199a.f24209i;
        int i11 = this.f26140p;
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 8 ? z6 ? c.i0(getString(R.string.arg, w.n("MA==", "9DJmaMDi"))) : c.i0(String.format(getString(R.string.arg), w.n("MA==", "v3So7NpR"))) : z6 ? c.i0(getString(R.string.arg, w.n("MA==", "GDt3Wdpj"))) : c.i0(String.format(getString(R.string.arg), w.n("MA==", "qKTa3RVH"))) : z6 ? c.i0(getString(R.string.arg, w.n("MA==", "ZgquTX7S"))) : c.i0(String.format(getString(R.string.arg), w.n("MA==", "9lsYO8tm"))) : z6 ? c.i0(getString(R.string.arg, w.n("MA==", "L3TXde1L"))) : c.i0(String.format(getString(R.string.arg), w.n("MA==", "wO1dYTW9"))) : z6 ? c.i0(getString(R.string.arg, w.n("MA==", "MZiUk3Rs"))) : c.i0(String.format(getString(R.string.arg), w.n("MA==", "m9dNGYbf")));
    }

    @Override // zg.c
    public final String j0() {
        try {
            return og.a.i(this, 0, this.f26140p);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // zg.c
    public final int k0() {
        int i10 = this.f26140p;
        return i10 != 1 ? i10 != 3 ? i10 != 8 ? R.drawable.ic_scanning_photo : R.drawable.ic_scanning_document : R.drawable.ic_scanning_audio : R.drawable.ic_scanning_video;
    }

    @Override // zg.c
    public final String m0() {
        int i10 = this.f26140p;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 8 ? getString(R.string.arg) : getString(R.string.arg) : getString(R.string.arg) : getString(R.string.arg) : getString(R.string.arg);
    }

    @Override // zg.c
    public final void n0() {
        try {
            int i10 = this.f26140p;
            Intent intent = i10 == 3 ? new Intent(this, (Class<?>) ResultForAudioDirActivity.class) : i10 == 8 ? new Intent(this, (Class<?>) ResultForDocumentDirActivity.class) : new Intent(this, (Class<?>) ResultForDirActivity.class);
            intent.putExtra(w.n("E2kuZRJ0N3Bl", "VnhpfEZf"), this.f26140p);
            startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.T) {
            Iterator it = u.f18144a.f18149e.iterator();
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                if (f0Var != null) {
                    f0Var.e();
                }
            }
        }
        finish();
    }

    @Override // zg.c
    public final boolean p0() {
        return true;
    }

    @Override // zg.c
    public final void q0(boolean z6) {
        this.L = true;
        u1.a aVar = this.S;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        int i10 = f.f24200o;
        f fVar = e.f24199a;
        fVar.f24207g = null;
        q.b(w.n("N2kbZRZzEmEsX0dhZw==", "G5z3Jwms"), w.n("Lmk6aUpoTnM7YQhuPG5UPgw-eD5TPgs-WD5GPggwejB4MDA=", "1QHT9nHH"));
        fVar.f24201a = false;
        fVar.f24202b = true;
        fVar.f24212l.set(true);
        fVar.f24208h = 0;
        fVar.f24214n = 0;
        if (b.f24749n != null) {
            tg.b.j().P(new e8.a(6));
        }
        d dVar = vg.c.f24190a;
        synchronized (dVar) {
            dVar.f24195e = null;
            dVar.f24194d.set(true);
            dVar.f24198h.clear();
            ExecutorService executorService = dVar.f24191a;
            if (executorService != null) {
                try {
                    executorService.shutdownNow();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        if (z6) {
            hh.c.f15628a.clear();
            hh.c.f15629b.clear();
            hh.c.f15630c.clear();
            hh.c.f15631d.clear();
        }
    }

    @Override // zg.c
    public final void t0() {
        int i10 = f.f24200o;
        f fVar = e.f24199a;
        fVar.f24207g = this;
        fVar.f24206f = this.f26140p;
        fVar.f24203c = null;
        hh.c.f15628a.clear();
        hh.c.f15629b.clear();
        hh.c.f15630c.clear();
        hh.c.f15631d.clear();
        a aVar = fVar.f24207g;
        if (aVar != null) {
            ((CommonFileScanningActivity) aVar).S.sendEmptyMessage(4);
        }
        fVar.f24202b = false;
        fVar.f24201a = true;
        hh.b.f15625e.clear();
        hh.b.f15624d.clear();
        hh.b.f15626f.clear();
        hh.b.f15627g.clear();
        new Thread(new z4(fVar, this, 21)).start();
    }

    public final void v0(int i10, String str, boolean z6) {
        u1.a aVar = this.S;
        if (i10 > 0 && this.U != i10 && !o0()) {
            aVar.removeMessages(1);
            Message obtain = Message.obtain();
            obtain.arg1 = i10;
            obtain.what = 1;
            aVar.sendMessage(obtain);
            this.U = i10;
            q.b(w.n("N2kbZRZzEmEsX0dhZw==", "Ca1LWgLS"), w.n("I2UWbGlwA28lclZzMSAmdDRyRSxjICl1AnIEbiZSMmE9UAVvLnIUczEgOg==", "paRW0Vnn") + i10 + w.n("VWM3cj9lIHQZcgRnAGVHczo=", "GtFBALQh") + this.M);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.Q;
        if (copyOnWriteArrayList.size() < 200) {
            copyOnWriteArrayList.add(str);
        }
        if (z6) {
            aVar.removeMessages(5);
            Message obtain2 = Message.obtain();
            obtain2.obj = str;
            obtain2.what = 5;
            aVar.sendMessage(obtain2);
        }
    }
}
