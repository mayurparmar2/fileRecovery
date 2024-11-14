package filerecovery.photosrecovery.allrecovery.ui.act.scanning.deepclean;

import ah.a;
import ah.b;
import android.text.SpannableString;
import com.demo.example.R;
import java.util.concurrent.CopyOnWriteArraySet;
import lg.f;
import lg.h0;
import pg.c;
import yg.j;

/* loaded from: classes2.dex */
public class ScreenshotScanningActivity extends a implements c {
    public long P;
    public boolean Q;

    @Override // ah.a
    public final boolean A0() {
        return true;
    }

    @Override // ah.a, zg.c, uf.i
    public final void Z() {
        super.Z();
        f fVar = h0.f18115a;
        CopyOnWriteArraySet copyOnWriteArraySet = fVar.f18104f;
        switch (fVar.f18101c) {
            case 0:
                copyOnWriteArraySet.add(this);
                break;
            default:
                copyOnWriteArraySet.add(this);
                break;
        }
    }

    @Override // zg.c
    public final int f0() {
        return 7;
    }

    @Override // zg.c
    public final SpannableString g0() {
        return l0(R.mipmap.ic_ad_happyface, getString(R.string.arg));
    }

    @Override // zg.c
    public final int k0() {
        return R.drawable.ic_scanning_screenshots;
    }

    @Override // zg.c
    public final String m0() {
        return getString(R.string.arg);
    }

    @Override // zg.c
    public final void n0() {
        j.n0(this, 7);
        finish();
    }

    @Override // ah.a, zg.c
    public final void q0(boolean z6) {
        super.q0(z6);
        h0.f18115a.h(this);
    }

    @Override // zg.c
    public final void t0() {
        h0.f18115a.f();
    }

    @Override // pg.c
    public final void u(long j4) {
        this.P = j4;
        this.Q = true;
        h0.f18115a.h(this);
        if (o0()) {
            this.M.sendEmptyMessage(1020);
        } else {
            runOnUiThread(new b(this, 1));
        }
    }

    @Override // pg.c
    public final void v(long j4, String str) {
        x0(j4);
        y0(str);
    }

    @Override // ah.a
    public final boolean v0() {
        return this.Q;
    }

    @Override // ah.a
    public final boolean w0() {
        return this.P == 0;
    }
}
