package filerecovery.photosrecovery.allrecovery.ui.act.scanning.deepclean;

import ah.a;
import android.content.Intent;
import android.text.SpannableString;
import cj.w;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.activity.CleanSimilarMediaActivity;
import java.util.concurrent.ConcurrentHashMap;
import lg.g;
import lg.h;

/* loaded from: classes2.dex */
public class DuplicateScanningActivity extends a implements pg.a {
    public static final /* synthetic */ int T = 0;
    public int P;
    public final u1.a Q = new u1.a(this, 17);
    public int R;
    public long S;

    @Override // ah.a
    public final boolean A0() {
        return false;
    }

    @Override // ah.a, zg.c, uf.i
    public final void Z() {
        super.Z();
        ConcurrentHashMap concurrentHashMap = h.f18107j;
        g.f18106a.f18112g.add(this);
    }

    @Override // zg.c
    public final int f0() {
        return 4;
    }

    @Override // zg.c
    public final SpannableString g0() {
        return l0(R.mipmap.ic_ad_happyface, getString(R.string.arg));
    }

    @Override // zg.c
    public final int k0() {
        return R.drawable.ic_scanning_duplicate;
    }

    @Override // zg.c
    public final String m0() {
        return getString(R.string.arg);
    }

    @Override // zg.c
    public final void n0() {
        try {
            Intent intent = new Intent(this, (Class<?>) CleanSimilarMediaActivity.class);
            intent.putExtra(w.n("E2kuZRJ0N3Bl", "1rBmiJ6b"), this.f26140p);
            startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        finish();
    }

    @Override // ah.a, zg.c
    public final void q0(boolean z6) {
        super.q0(z6);
        u1.a aVar = this.Q;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        ConcurrentHashMap concurrentHashMap = h.f18107j;
        g.f18106a.f18112g.remove(this);
    }

    @Override // zg.c
    public final void t0() {
        ConcurrentHashMap concurrentHashMap = h.f18107j;
        g.f18106a.g(true);
        this.Q.sendEmptyMessage(4);
    }

    @Override // ah.a
    public final boolean v0() {
        return false;
    }

    @Override // ah.a
    public final boolean w0() {
        return false;
    }
}
