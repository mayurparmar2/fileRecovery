package filerecovery.photosrecovery.allrecovery.ui.act.scanning.deepclean;

import ah.a;
import android.content.Intent;
import android.os.Build;
import android.text.SpannableString;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.ui.act.DeepCleanResultActivity;
import lg.s;
import pg.b;
import y9.m;

/* loaded from: classes2.dex */
public class DeepCleanScanningActivity extends a implements b {
    public static final /* synthetic */ int R = 0;
    public boolean P;
    public long Q;

    @Override // pg.b
    public final void A(long j4) {
        this.Q = j4;
        this.P = true;
        if (o0()) {
            this.M.sendEmptyMessage(1020);
        } else {
            runOnUiThread(new m(this, 29));
        }
    }

    @Override // ah.a
    public final boolean A0() {
        return true;
    }

    @Override // ah.a, zg.c, uf.i
    public final void Z() {
        super.Z();
        s.f18136a.f18143i.add(this);
    }

    @Override // zg.c
    public final int f0() {
        return 5;
    }

    @Override // zg.c
    public final SpannableString g0() {
        return l0(R.mipmap.ic_ad_happyface, getString(R.string.arg));
    }

    @Override // zg.c
    public final int k0() {
        return R.drawable.ic_scanning_deepclean;
    }

    @Override // zg.c
    public final String m0() {
        return dg.a.q0(getString(R.string.arg));
    }

    @Override // zg.c
    public final void n0() {
        try {
            startActivity(new Intent(this, (Class<?>) DeepCleanResultActivity.class));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        finish();
    }

    @Override // ah.a, zg.c
    public final void q0(boolean z6) {
        super.q0(z6);
        if (yj.a.f25869d.g() > -1) {
            s.f18136a.c();
        }
        s.f18136a.f18143i.remove(this);
    }

    @Override // zg.c
    public final void t0() {
        s.f18136a.d();
    }

    @Override // ah.a
    public final boolean v0() {
        return this.P;
    }

    @Override // ah.a
    public final boolean w0() {
        return Build.VERSION.SDK_INT < 30 && this.Q == 0;
    }
}
