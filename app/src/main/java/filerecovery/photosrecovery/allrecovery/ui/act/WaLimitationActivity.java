package filerecovery.photosrecovery.allrecovery.ui.act;

import android.widget.TextView;
import cj.w;
import com.gyf.immersionbar.e;
import dg.d;
import dg.j;
import com.demo.example.R;
import og.a;
import uf.i;
import yg.m0;

/* loaded from: classes2.dex */
public class WaLimitationActivity extends i {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f14519j = 0;

    @Override // uf.i
    public final void V() {
        ((TextView) findViewById(R.id.wa_limitation_tv_limits2)).setText(getString(R.string.arg, getString(R.string.arg)));
        findViewById(R.id.wa_limitation_tv_next).setOnClickListener(new m0(this, 0));
        findViewById(R.id.wa_limitation_iv_close).setOnClickListener(new m0(this, 1));
    }

    @Override // uf.i
    public final int W() {
        return a.Z(this) ? R.layout.activity_wa_limitation_long : R.layout.activity_wa_limitation;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.color_100_FBFAF8_black);
        eVar.l(R.color.color_100_FBFAF8_black);
        eVar.c();
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
    }

    @Override // uf.i
    public final void d0() {
        int i10 = j.f12745j;
        String n10 = w.n("AWVEcwVnNV8UaQtpIWFHaV1uGXMFb3c=", "ceL7dPur");
        d.A(this, n10, n10);
    }
}
