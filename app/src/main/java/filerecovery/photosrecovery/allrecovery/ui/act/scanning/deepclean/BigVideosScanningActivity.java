package filerecovery.photosrecovery.allrecovery.ui.act.scanning.deepclean;

import ah.a;
import android.text.SpannableString;
import com.demo.example.R;
import java.util.concurrent.CopyOnWriteArraySet;
import lg.e;
import lg.f;
import pg.c;
import v9.i0;
import yg.j;

/* loaded from: classes2.dex */
public class BigVideosScanningActivity extends a implements c {
    public static final /* synthetic */ int R = 0;
    public boolean P;
    public long Q;

    @Override // ah.a
    public final boolean A0() {
        return true;
    }

    @Override // ah.a, zg.c, uf.i
    public final void Z() {
        super.Z();
        f fVar = e.f18100a;
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
        return 6;
    }

    @Override // zg.c
    public final SpannableString g0() {
        return l0(R.mipmap.ic_ad_happyface, getString(R.string.arg));
    }

    @Override // zg.c
    public final int k0() {
        return R.drawable.ic_scanning_video;
    }

    @Override // zg.c
    public final String m0() {
        return getString(R.string.arg);
    }

    @Override // zg.c
    public final void n0() {
        j.n0(this, 6);
        finish();
    }

    @Override // ah.a, zg.c
    public final void q0(boolean z6) {
        super.q0(z6);
        e.f18100a.h(this);
    }

    @Override // zg.c
    public final void t0() {
        e.f18100a.f();
    }

    @Override // pg.c
    public final void u(long j4) {
        this.Q = j4;
        this.P = true;
        e.f18100a.h(this);
        if (o0()) {
            this.M.sendEmptyMessage(1020);
        } else {
            runOnUiThread(new i0(this, j4, 5));
        }
    }

    @Override // pg.c
    public final void v(long j4, String str) {
        x0(j4);
        y0(str);
    }

    @Override // ah.a
    public final boolean v0() {
        return this.P;
    }

    @Override // ah.a
    public final boolean w0() {
        return this.Q == 0;
    }
}
