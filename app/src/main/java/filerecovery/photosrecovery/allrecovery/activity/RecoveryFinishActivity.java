package filerecovery.photosrecovery.allrecovery.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cj.w;
import dg.d;
import fg.e;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import j3.j;
import java.nio.charset.Charset;
import java.util.Arrays;
import k.h;
import lg.k0;
import mf.f;
import n2.d0;
import og.a;
import rf.g;
import uf.i;
import yg.u;
import yh.b;

/* loaded from: classes2.dex */
public class RecoveryFinishActivity extends i implements View.OnClickListener, e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f14197t = 0;

    /* renamed from: j, reason: collision with root package name */
    public TextView f14198j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f14199k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f14200l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14201m;

    /* renamed from: n, reason: collision with root package name */
    public int f14202n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14203o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f14204p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f14205q;

    /* renamed from: r, reason: collision with root package name */
    public RelativeLayout f14206r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14207s;

    @Override // uf.i
    public final void V() {
        this.f14203o = (LinearLayout) findViewById(R.id.layout_recovery_native_ad_container);
        this.f14204p = (LinearLayout) findViewById(R.id.layout_recovery_banner_ad_container);
        this.f14206r = (RelativeLayout) findViewById(R.id.rl_recovery_evaluation_container);
        this.f14205q = (TextView) findViewById(R.id.tv_recovery_feedback);
        this.f14207s = (TextView) findViewById(R.id.tv_recovery_err_count);
        String string = getResources().getString(R.string.arg);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new UnderlineSpan(), 0, string.length(), 33);
        this.f14205q.setText(spannableStringBuilder);
        this.f14205q.setOnClickListener(this);
        findViewById(R.id.layout_recovery_iv_back).setOnClickListener(this);
        findViewById(R.id.layout_recovery_tv_restore).setOnClickListener(this);
        ((TextView) findViewById(R.id.layout_recovery_tv_view)).setOnClickListener(this);
        findViewById(R.id.layout_recovery_iv_home).setOnClickListener(this);
        this.f14198j = (TextView) findViewById(R.id.layout_recovery_tv_total);
        this.f14199k = (TextView) findViewById(R.id.layout_recovery_tv_media_type);
        ((TextView) findViewById(R.id.layout_recovery_finish_feedback_title)).setText(getString(R.string.arg, getString(R.string.arg)));
        this.f14201m = (LinearLayout) findViewById(R.id.layout_recovery_finish_feedback_no);
        this.f14200l = (LinearLayout) findViewById(R.id.layout_recovery_finish_feedback_ok);
        this.f14201m.setOnClickListener(this);
        this.f14200l.setOnClickListener(this);
    }

    @Override // uf.i
    public final int W() {
        return a.W() ? R.layout.activity_recovery_finish_update : R.layout.activity_recovery_finish;
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.c();
        eVar.l(R.color.color_100_3B4DFF);
        eVar.m(false);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(w.n("E2kuZRJuO20=", "rdnlXKuP"), 0);
            int intExtra2 = intent.getIntExtra(w.n("N2kbZRZlA3IdbkZt", "0mzknkmJ"), 0);
            int intExtra3 = intent.getIntExtra(w.n("N2kbZRZ0CHBl", "Fb9wweSD"), 2);
            this.f14202n = intExtra3;
            int H = a.H(intExtra, intExtra3);
            this.f14198j.setText((intExtra - intExtra2) + "");
            if (intExtra2 > 0) {
                this.f14207s.setVisibility(View.VISIBLE);
                this.f14207s.setText(intExtra2 == 1 ? getString(R.string.arg, String.valueOf(intExtra2)) : getString(R.string.arg, String.valueOf(intExtra2)));
            } else {
                this.f14207s.setVisibility(View.GONE);
            }
            this.f14199k.setText(H);
        }
    }

    @Override // fg.e
    public final void c() {
        f.f18529a.a0(this, this.f14203o, this.f14204p, R.color.color_100_1e32f6);
    }

    @Override // uf.i
    public final void d0() {
        int i10 = this.f14202n;
        String str = d.f12731a;
        String h10 = d.h(i10, w.n("KlInYyJ2K3IwUx5jEWVHcxpzXm93", "hFxJCCJx"));
        if (!TextUtils.isEmpty(h10)) {
            j.G(this, d.i(i10), h10, h10);
        }
        d.e(this, h10, i10);
    }

    public final void f0() {
        if (m7.a.e(this).d()) {
            if (this.f14205q.getVisibility() == 8) {
                this.f14205q.setVisibility(View.VISIBLE);
                this.f14206r.setVisibility(View.GONE);
                return;
            }
            return;
        }
        if (this.f14205q.getVisibility() == 0) {
            this.f14205q.setVisibility(View.GONE);
            this.f14206r.setVisibility(View.VISIBLE);
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.layout_recovery_iv_back) {
            onBackPressed();
            return;
        }
        if (id2 == R.id.layout_recovery_iv_home) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            if (a.d0(this)) {
                return;
            }
            if (dg.f.b(this, w.n("E3UubBJyK2Mmdg5yCyBSaStpRWg=", "DLw8UGKF"), w.n("PnASbhZmBGwuX0FlIW8jZSd5bmYqbiNzaA==", "GSJCK3LF"), b.b().H)) {
                gg.a.f15028c.getClass();
                Activity a10 = filerecovery.photosrecovery.allrecovery.b.a();
                if (a10 != null) {
                    g c10 = g.c();
                    c10.f20639c.f20633h = true;
                    if (c10.a()) {
                        c10.g(a10);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == R.id.layout_recovery_tv_restore) {
            int i10 = this.f14202n;
            String str = d.f12731a;
            String h10 = d.h(i10, w.n("KlInYyJ2K3IwQwRuBmladSBfVWwAY2s=", "ceKvyWQB"));
            if (!TextUtils.isEmpty(h10)) {
                j.G(this, d.i(i10), h10, h10);
            }
            onBackPressed();
            return;
        }
        if (id2 == R.id.layout_recovery_tv_view) {
            int i11 = this.f14202n;
            String str2 = d.f12731a;
            String h11 = d.h(i11, w.n("JlIXY1Z2FHIhVg9lIl9QbFtjaw==", "7gyr9qn7"));
            if (!TextUtils.isEmpty(h11)) {
                j.G(this, d.i(i11), h11, h11);
            }
            Intent intent = new Intent(this, (Class<?>) RecoveryHistoryActivity.class);
            intent.putExtra(w.n("E2kuZRJ0N3Bl", "iN8KPYsD"), this.f14202n);
            startActivityForResult(intent, 9010);
            finish();
            return;
        }
        if (id2 == R.id.layout_recovery_finish_feedback_ok) {
            if (a.b0(this, dg.f.l(this))) {
                int i12 = n.e.f18592r;
                new n.e(this, new h(this, 1)).show();
                return;
            }
            m7.a e10 = m7.a.e(this);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > e10.f()) {
                u uVar = (u) e10.f18383e;
                String str3 = (String) e10.f18380b;
                uVar.getClass();
                k0.f18124a.execute(new d0(uVar, str3, currentTimeMillis, 1));
            }
            a.f19314b = 1;
            a.r0(this, null);
            return;
        }
        if (id2 != R.id.layout_recovery_finish_feedback_no) {
            if (id2 == R.id.tv_recovery_feedback) {
                lh.i.a(this, 12);
                return;
            }
            return;
        }
        m7.a e11 = m7.a.e(this);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis2 > e11.f()) {
            u uVar2 = (u) e11.f18383e;
            String str4 = (String) e11.f18380b;
            uVar2.getClass();
            k0.f18124a.execute(new d0(uVar2, str4, currentTimeMillis2, 1));
        }
        lh.i.a(this, 6);
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        super.onCreate(bundle);
        try {
            String substring = ne.a.b(this).substring(2241, 2272);
            a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "cec9f79fd33b42dacba92cba60f172e".getBytes(charset);
            a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            long j4 = 2;
            if (System.currentTimeMillis() % j4 == 0) {
                int c12 = ne.a.f18888a.c(bytes.length / 2);
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
                    ne.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                ne.a.a();
                throw null;
            }
            try {
                String substring2 = rd.a.b(this).substring(1324, 1355);
                a.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = bj.a.f2786a;
                byte[] bytes3 = substring2.getBytes(charset2);
                a.o(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "4f49e62b73597c67dc712da68c55676".getBytes(charset2);
                a.o(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j4 == 0) {
                    int c13 = rd.a.f20626a.c(bytes3.length / 2);
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
                        rd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    rd.a.a();
                    throw null;
                }
                gg.b.f15029c.f(this);
                String str = dg.f.f12740a;
                if (dg.f.b(this, w.n("E3UubBJyK2Mmdg5yCyBSaStpRWg=", "DLw8UGKF"), w.n("PnASbhZmBGwuX0FlIW8jZSd5bmYqbiNzaA==", "GSJCK3LF"), b.b().H)) {
                    te.a.C(6L);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                rd.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ne.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        f.f18529a.q(this);
        super.onDestroy();
        gg.b.f15029c.n(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        f0();
        a.j(this, null);
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("F2klIC5hPGQWcg5jHXZRcjwgUGkHaQpoE2Qcd24=", "RtCc3soV"), w.n("PnASbhZOMl8wZVBvNGUneQpmWG4qcyJfUG9Dbg==", "44dTpRSs"), b.b().f25858x)) {
            w.n("GmEZbAdhUms=", "HLyue1PC");
            gg.b.f15029c.z();
        }
    }

    @Override // fg.e
    public final void z() {
        mf.b bVar = f.f18529a;
        bVar.W(new filerecovery.photosrecovery.allrecovery.h(this, 7));
        bVar.E(this, this.f14203o, this.f14204p, R.color.color_100_1e32f6);
    }
}
