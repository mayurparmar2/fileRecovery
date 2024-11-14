package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cj.w;
import com.airbnb.lottie.LottieAnimationView;
import dg.a;
import fg.k;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.activity.CleanSimilarMediaActivity;
import filerecovery.photosrecovery.allrecovery.view.CleanerItemView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import lg.a0;
import lg.e;
import lg.g;
import lg.h;
import lg.h0;
import lg.n;
import lg.o;
import lg.s;
import lg.u;
import lh.q;
import mf.c;
import pc.b;
import pg.d;
import uf.i;
import xf.f;
import xf.v;
import yg.j;

/* loaded from: classes2.dex */
public class PhoneCleanerActivity extends i implements View.OnClickListener, d, a0, k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f14488r = 0;

    /* renamed from: j, reason: collision with root package name */
    public final String f14489j = w.n("AWgYbixDHWUjblZyA2MhaSNpRXk=", "enC5RDyf");

    /* renamed from: k, reason: collision with root package name */
    public CleanerItemView f14490k;

    /* renamed from: l, reason: collision with root package name */
    public CleanerItemView f14491l;

    /* renamed from: m, reason: collision with root package name */
    public CleanerItemView f14492m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f14493n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f14494o;

    /* renamed from: p, reason: collision with root package name */
    public LottieAnimationView f14495p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f14496q;

    @Override // pg.d
    public final void B(long j4, int i10, boolean z6) {
        runOnUiThread(new b(this, i10, 1, j4));
    }

    @Override // uf.i
    public final void V() {
        this.f14496q = (LinearLayout) findViewById(R.id.ll_clean_ad_container);
        ((TextView) findViewById(R.id.phone_cleaner_tv_title)).setText(a.q0(getString(R.string.arg)));
        ((TextView) findViewById(R.id.tv_remove_junk)).setText(a.q0(getString(R.string.arg)));
        this.f14490k = (CleanerItemView) findViewById(R.id.cleaner_duplicate);
        this.f14491l = (CleanerItemView) findViewById(R.id.cleaner_big_videos);
        this.f14492m = (CleanerItemView) findViewById(R.id.cleaner_screenshots);
        this.f14493n = (LinearLayout) findViewById(R.id.ll_deep_clean_container);
        this.f14494o = (TextView) findViewById(R.id.tv_clean_size);
        this.f14495p = (LottieAnimationView) findViewById(R.id.progress_clean_loading);
        this.f14490k.setOnClickListener(this);
        this.f14491l.setOnClickListener(this);
        this.f14492m.setOnClickListener(this);
        this.f14493n.setOnClickListener(this);
        findViewById(R.id.iv_back).setOnClickListener(new j.d(this, 19));
        ConcurrentHashMap concurrentHashMap = h.f18107j;
        g.f18106a.a(this);
        e.f18100a.a(this);
        h0.f18115a.a(this);
        s.f18136a.a(this);
        yj.a aVar = yj.a.f25869d;
        long g10 = aVar.g();
        long h10 = aVar.h();
        long f10 = aVar.f();
        long i10 = aVar.i();
        this.f14491l.setShowProgress(f10 == -1);
        this.f14492m.setShowProgress(i10 == -1);
        this.f14490k.setShowProgress(h10 == -1);
        if (f10 > -1) {
            this.f14491l.setSizeStr(og.a.G(f10));
        }
        if (h10 > -1) {
            this.f14490k.setSizeStr(og.a.G(h10));
        }
        if (i10 > -1) {
            this.f14492m.setSizeStr(og.a.G(i10));
        }
        if (g10 == -1) {
            this.f14495p.setVisibility(View.VISIBLE);
            this.f14494o.setVisibility(View.GONE);
        } else {
            this.f14495p.setVisibility(View.GONE);
            this.f14494o.setVisibility(View.VISIBLE);
            String G = og.a.G(g10);
            this.f14494o.setText(og.a.C(G, getString(R.string.arg, G)));
        }
        n.f18127a.getClass();
        o.c();
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_phone_cleaner;
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.color_100_white_262626);
        eVar.l(R.color.color_100_white_262626);
        eVar.c();
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
    }

    @Override // fg.k
    public final void a() {
        c.c0(this.f14489j).Z(this, this.f14496q, R.color.color_100_white_262626, R.color.color_100_D6E1F6_373737);
    }

    @Override // fg.k
    public final void b() {
        String str = this.f14489j;
        c.c0(str).W(new filerecovery.photosrecovery.allrecovery.h(this, 24));
        c.c0(str).F(this, this.f14496q);
    }

    @Override // uf.i
    public final void d0() {
        int i10 = dg.c.f12730j;
        String n10 = w.n("GW8aZRZTAWwjc1tfFmklcw==", "vOGBlx5G");
        String n11 = w.n("emwqYVZPIHQxbwhzCnNbb3c=", "FQ9O8PfN");
        dg.d.y(this, n10, n11, n11);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        c.c0(this.f14489j).q(this);
    }

    @Override // lg.a0
    public final void n(boolean z6) {
        if (z6) {
            ConcurrentHashMap concurrentHashMap = h.f18107j;
            g.f18106a.e();
        }
        runOnUiThread(new f(this, 14));
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        n.f18127a.f(5);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (lh.n.a(view.getId())) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.cleaner_duplicate) {
            lh.c.a().getClass();
            if (yj.a.f25869d.h() <= 0) {
                ah.a.z0(this, 4, false);
            } else {
                Intent intent = new Intent(this, (Class<?>) CleanSimilarMediaActivity.class);
                intent.putExtra(w.n("N2kbZRZ0CHBl", "eFXS4IfD"), 4);
                startActivityForResult(intent, 9010);
            }
            dg.c.F(this, 4);
            return;
        }
        if (id2 == R.id.cleaner_big_videos) {
            boolean z6 = this.f14491l.f14627a;
            long f10 = yj.a.f25869d.f();
            if (z6 || f10 == 0) {
                ah.a.z0(this, 6, false);
            } else {
                j.n0(this, 6);
            }
            dg.c.F(this, 6);
            return;
        }
        if (id2 != R.id.cleaner_screenshots) {
            if (id2 == R.id.ll_deep_clean_container) {
                ah.a.z0(this, 5, false);
                dg.c.F(this, 5);
                return;
            }
            return;
        }
        long i10 = yj.a.f25869d.i();
        if (this.f14492m.f14627a || i10 == 0) {
            ah.a.z0(this, 7, false);
        } else {
            j.n0(this, 7);
        }
        dg.c.F(this, 7);
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        super.onCreate(bundle);
        hg.g.f15618c.f(this);
        try {
            String substring = pe.a.b(this).substring(63, 94);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "6997fcbe5300d06092a864886f70d01".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            long j4 = 2;
            if (System.currentTimeMillis() % j4 == 0) {
                int c12 = pe.a.f19957a.c(bytes.length / 2);
                int i10 = 0;
                while (true) {
                    if (i10 > c12) {
                        c11 = 0;
                        break;
                    } else {
                        if (bytes[i10] != bytes2[i10]) {
                            c11 = 16;
                            break;
                        }
                        i10++;
                    }
                }
                if ((c11 ^ 0) != 0) {
                    pe.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                pe.a.a();
                throw null;
            }
            try {
                String substring2 = vd.a.b(this).substring(1020, 1051);
                og.a.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = bj.a.f2786a;
                byte[] bytes3 = substring2.getBytes(charset2);
                og.a.o(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "4ffc717fc96831ffc23dbb51ab9b38f".getBytes(charset2);
                og.a.o(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j4 == 0) {
                    int c13 = vd.a.f24140a.c(bytes3.length / 2);
                    int i11 = 0;
                    while (true) {
                        if (i11 > c13) {
                            c10 = 0;
                            break;
                        } else {
                            if (bytes3[i11] != bytes4[i11]) {
                                c10 = 16;
                                break;
                            }
                            i11++;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        vd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    vd.a.a();
                    throw null;
                }
                og.a.r(this);
                lh.j.f18194a.f19561a = true;
            } catch (Exception e10) {
                e10.printStackTrace();
                vd.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            pe.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        c.c0(this.f14489j).q(this);
        super.onDestroy();
        hg.g.f15618c.n(this);
        s.f18136a.b(this);
        h0.f18115a.b(this);
        e.f18100a.b(this);
        ConcurrentHashMap concurrentHashMap = h.f18107j;
        g.f18106a.b(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        u.f18144a.f18152h.remove(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        u.f18144a.f18152h.add(this);
        q.b(w.n("fXUvaxF1LW8UbwdkPG5UTVNuJ2cIcg==", "Jn7APYsV"), w.n("JWgtbihDImUobg5yM2NAaTNpQnkGbitlHXU_ZXYgTj5LPnw-cz5uYTx0BFMRYVpuLG5RMVgxSDog", "FOchnRVp"));
        n.f18127a.a();
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("PnASbhZiEG4sZUFfMmg6bjBfUmwmYSRlJ19dbw1u", "U9zmYK0y"), w.n("PnASbhZiEG4sZUFfMmg6bjBfUmwmYSRlIl8FbxBu", "PagJUstA"), v.a().f25216u)) {
            zj.d.f26172b.y(7);
        }
        g.f18106a.h();
    }
}
