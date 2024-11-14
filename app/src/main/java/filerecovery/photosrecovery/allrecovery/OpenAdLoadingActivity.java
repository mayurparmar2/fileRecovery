package filerecovery.photosrecovery.allrecovery;

import android.content.Context;
import android.os.Build;
import android.widget.LinearLayout;
import cj.w;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import xf.v;

/* loaded from: classes2.dex */
public class OpenAdLoadingActivity extends a implements fg.j {
    public boolean B;

    /* renamed from: u, reason: collision with root package name */
    public Random f14097u;

    /* renamed from: w, reason: collision with root package name */
    public long f14099w;

    /* renamed from: x, reason: collision with root package name */
    public int f14100x;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f14098v = new AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public boolean f14101y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14102z = false;
    public final u1.a A = new u1.a(this, 4);

    public static void j0(OpenAdLoadingActivity openAdLoadingActivity) {
        if (openAdLoadingActivity.f14098v.compareAndSet(false, true)) {
            openAdLoadingActivity.f14122o.setProgress(1000);
            u1.a aVar = openAdLoadingActivity.A;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            if (openAdLoadingActivity.f14118k) {
                return;
            }
            if (openAdLoadingActivity.f14117j) {
                openAdLoadingActivity.f14101y = true;
            } else {
                openAdLoadingActivity.finish();
            }
        }
    }

    @Override // fg.j
    public final void L() {
        long j4;
        boolean z6 = true;
        ((sf.d) sf.e.r().f21162c).f21156g = new h(this, 1);
        if (this.B) {
            this.f14122o.setVisibility(View.GONE);
            this.f14120m.setVisibility(View.VISIBLE);
            if (og.a.c0(this)) {
                this.f14120m.setRotation(-180.0f);
            }
            this.f14120m.g();
        } else {
            String str = dg.f.f12740a;
            boolean z10 = yh.b.b().f25816b;
            String str2 = dg.f.f12740a;
            if (z10) {
                j4 = v.a().f25199d;
                lh.q.b(str2, w.n("EmQfYhlndz5mPlg-ayBccFduGWEJX1lvB2QRblFfJ2FKXw5pAWV3Og==", "Bk2zlWHx") + j4);
            } else {
                int n10 = j3.j.n(this, null, w.n("PnASbhZhFV8ub1JkK24yXzhhSV83aSdl", "CHStcXN7"), 7);
                lh.q.b(str2, w.n("cXISbCxhAmViPg0-fCA6cDBubmEnXyZvMmQbbh5fAmEpXwNpJGVROiA=", "Sryotg0C") + n10 + w.n("Uw==", "tVd7QWHy"));
                j4 = ((long) n10) * 1000;
            }
            this.f14099w = j4;
            long max = Math.max(j4, 1000L);
            this.f14099w = max;
            this.f14100x = (int) (max / 100);
            this.A.sendEmptyMessage(1010);
            this.f14122o.setVisibility(View.VISIBLE);
            this.f14120m.setVisibility(View.GONE);
        }
        if (sf.e.r().s()) {
            if (this.f14118k) {
                return;
            }
            k0();
            return;
        }
        if (ff.a.f14050a.j()) {
            sf.e.r().o(this);
            finish();
            return;
        }
        sf.e r10 = sf.e.r();
        r10.getClass();
        nh.a.h(sf.b.m().e());
        nh.a.b(sf.b.m().e(), sf.b.m().d(this));
        Iterator it = ((ArrayList) r10.f21161b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            sf.a aVar = (sf.a) it.next();
            if (aVar != null && aVar.f15974b) {
                nh.a.d(aVar.e());
                break;
            }
        }
        if (z6 || r10.s()) {
            return;
        }
        ((sf.d) r10.f21162c).f21157h = sf.b.m().e();
        sf.b.m().f15973a = (sf.d) r10.f21162c;
        sf.b m10 = sf.b.m();
        m10.getClass();
        Context applicationContext = getApplicationContext();
        og.a.o(applicationContext, "activity.applicationContext");
        m10.k(applicationContext);
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i
    public final void V() {
        String str = dg.f.f12740a;
        this.B = dg.f.b(this, w.n("HHMdZiJyLWUWbxtlHF9VZA==", "Jf2zw1CI"), w.n("OHMoZiZyEmUdb0NlLF80ZA==", "oBbDk5Rw"), v.a().O);
        gg.e.f15032c.f(this);
        ((LinearLayout) findViewById(R.id.lly_center_logo)).setVisibility(View.VISIBLE);
        super.V();
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i
    public final void Z() {
        super.Z();
        gg.e.f15032c.L();
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, android.app.Activity
    public final void finish() {
        super.finish();
        AppOpenManager.f14241f = false;
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final void g0() {
        if (sf.e.r().s()) {
            u1.a aVar = this.A;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            k0();
            return;
        }
        if (!this.f14098v.get() || this.f14118k) {
            return;
        }
        if (this.f14117j) {
            this.f14101y = true;
        } else {
            finish();
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final long h0() {
        return 1500L;
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final boolean i0() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 <= 32 && w.n("B206M341Nw==", "ULRlttoV").equalsIgnoreCase(Build.MODEL) && !lh.c.a().f18163f;
    }

    public final void k0() {
        if (ff.a.f14050a.j()) {
            sf.e.r().o(this);
            finish();
            return;
        }
        u1.a aVar = this.A;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        sf.e r10 = sf.e.r();
        Iterator it = ((ArrayList) r10.f21161b).iterator();
        while (it.hasNext()) {
            sf.a aVar2 = (sf.a) it.next();
            if (aVar2 != null && aVar2.j()) {
                ((sf.d) r10.f21162c).f21157h = aVar2.e();
                aVar2.h((sf.d) r10.f21162c);
                aVar2.l(this);
                return;
            }
        }
    }

    @Override // fg.j
    public final void onAdClose() {
        this.A.postDelayed(new androidx.activity.b(this, 24), 500L);
    }

    @Override // fg.j
    public final void onAdShow() {
        LinearLayout linearLayout = this.f14119l;
        if (linearLayout != null) {
            linearLayout.setVisibility(View.GONE);
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        if (this.B) {
            return;
        }
        super.onBackPressed();
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((sf.d) sf.e.r().f21162c).f21156g = null;
        gg.e.f15032c.n(this);
        AppOpenManager.f14241f = false;
        u1.a aVar = this.A;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f14102z) {
            k0();
            this.f14102z = false;
        } else if (this.f14101y) {
            finish();
            this.f14101y = false;
        }
    }

    @Override // fg.j
    public final void p() {
        u1.a aVar;
        if (this.f14118k && (aVar = this.A) != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        if (this.f14117j) {
            this.f14102z = true;
        } else {
            k0();
        }
    }
}
