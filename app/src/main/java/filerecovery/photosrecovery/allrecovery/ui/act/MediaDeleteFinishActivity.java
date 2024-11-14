package filerecovery.photosrecovery.allrecovery.ui.act;

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
import dg.f;
import fg.e;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.b;
import j3.j;
import java.nio.charset.Charset;
import java.util.Arrays;
import k.h;
import lg.k0;
import n2.d0;
import og.a;
import rf.g;
import uf.i;
import yg.u;

/* loaded from: classes2.dex */
public class MediaDeleteFinishActivity extends i implements View.OnClickListener, e {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f14454s = 0;

    /* renamed from: j, reason: collision with root package name */
    public TextView f14455j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f14456k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f14457l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14458m;

    /* renamed from: n, reason: collision with root package name */
    public int f14459n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14460o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f14461p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f14462q;

    /* renamed from: r, reason: collision with root package name */
    public RelativeLayout f14463r;

    @Override // uf.i
    public final void V() {
        this.f14460o = (LinearLayout) findViewById(R.id.layout_media_delete_native_ad_container);
        this.f14461p = (LinearLayout) findViewById(R.id.layout_media_delete_adaptive_ad_container);
        this.f14463r = (RelativeLayout) findViewById(R.id.rl_delete_evaluation_container);
        this.f14462q = (TextView) findViewById(R.id.tv_delete_feedback);
        String string = getResources().getString(R.string.arg);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new UnderlineSpan(), 0, string.length(), 33);
        this.f14462q.setText(spannableStringBuilder);
        this.f14462q.setOnClickListener(this);
        findViewById(R.id.layout_media_delete_iv_back).setOnClickListener(this);
        findViewById(R.id.layout_media_delete_tv_restore).setOnClickListener(this);
        findViewById(R.id.layout_media_delete_iv_home).setOnClickListener(this);
        this.f14455j = (TextView) findViewById(R.id.layout_media_delete_tv_total);
        this.f14456k = (TextView) findViewById(R.id.layout_media_delete_tv_media_type);
        ((TextView) findViewById(R.id.layout_media_delete_finish_feedback_title)).setText(getString(R.string.arg, getString(R.string.arg)));
        this.f14458m = (LinearLayout) findViewById(R.id.layout_media_delete_finish_feedback_no);
        this.f14457l = (LinearLayout) findViewById(R.id.layout_media_delete_finish_feedback_ok);
        this.f14458m.setOnClickListener(this);
        this.f14457l.setOnClickListener(this);
    }

    @Override // uf.i
    public final int W() {
        return a.W() ? R.layout.activity_delete_finish_update : R.layout.activity_delete_finish;
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.c();
        eVar.l(R.color.color_100_FC7826);
        eVar.m(false);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(w.n("E2kuZRJuO20=", "PMcBeWgT"), 0);
            int intExtra2 = intent.getIntExtra(w.n("N2kbZRZ0CHBl", "0lCjdFp4"), 2);
            this.f14459n = intExtra2;
            int H = a.H(intExtra, intExtra2);
            this.f14455j.setText(intExtra + "");
            this.f14456k.setText(H);
        }
    }

    @Override // fg.e
    public final void c() {
        mf.a.f18523a.a0(this, this.f14460o, this.f14461p, R.color.color_100_f65b1a);
    }

    @Override // uf.i
    public final void d0() {
        int i10 = this.f14459n;
        String str = d.f12731a;
        String k10 = d.k(i10, w.n("DkQSbCx0FFM3Y1BlMXMKcz1vdw==", "ajTz5Dgl"));
        if (TextUtils.isEmpty(k10)) {
            return;
        }
        j.G(this, d.i(i10), k10, k10);
    }

    public final void f0() {
        if (m7.a.e(this).d()) {
            if (this.f14462q.getVisibility() == 8) {
                this.f14462q.setVisibility(View.VISIBLE);
                this.f14463r.setVisibility(View.GONE);
                return;
            }
            return;
        }
        if (this.f14462q.getVisibility() == 0) {
            this.f14462q.setVisibility(View.GONE);
            this.f14463r.setVisibility(View.VISIBLE);
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        setResult(503);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.layout_media_delete_iv_back) {
            onBackPressed();
            return;
        }
        if (id2 == R.id.layout_media_delete_iv_home) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            if (a.d0(this) || !f.r(this)) {
                return;
            }
            gg.a.f15028c.getClass();
            Activity a10 = b.a();
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
        if (id2 == R.id.layout_media_delete_tv_restore) {
            int i10 = this.f14459n;
            String str = d.f12731a;
            String h10 = d.h(i10, w.n("DkQSbCx0FEMtbkdpLHUwXzZsWGNr", "3SfrR69V"));
            if (!TextUtils.isEmpty(h10)) {
                j.G(this, d.i(i10), h10, h10);
            }
            setResult(503);
            finish();
            return;
        }
        if (id2 == R.id.layout_media_delete_finish_feedback_ok) {
            if (a.b0(this, f.l(this))) {
                int i11 = n.e.f18592r;
                new n.e(this, new h(this, 2)).show();
                return;
            }
            m7.a e10 = m7.a.e(this);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > e10.f()) {
                u uVar = (u) e10.f18383e;
                String str2 = (String) e10.f18380b;
                uVar.getClass();
                k0.f18124a.execute(new d0(uVar, str2, currentTimeMillis, 1));
            }
            a.f19314b = 2;
            a.r0(this, null);
            return;
        }
        if (id2 == R.id.tv_delete_feedback) {
            lh.i.a(this, 13);
            return;
        }
        if (id2 == R.id.layout_media_delete_finish_feedback_no) {
            m7.a e11 = m7.a.e(this);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 > e11.f()) {
                u uVar2 = (u) e11.f18383e;
                String str3 = (String) e11.f18380b;
                uVar2.getClass();
                k0.f18124a.execute(new d0(uVar2, str3, currentTimeMillis2, 1));
            }
            lh.i.a(this, 7);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        super.onCreate(bundle);
        try {
            String substring = de.a.b(this).substring(185, 216);
            a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "3550407130d4d6f756e7461696e2056".getBytes(charset);
            a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            if (System.currentTimeMillis() % 2 == 0) {
                int c11 = de.a.f12681a.c(bytes.length / 2);
                int i10 = 0;
                while (true) {
                    if (i10 > c11) {
                        c10 = 0;
                        break;
                    } else {
                        if (bytes[i10] != bytes2[i10]) {
                            c10 = 16;
                            break;
                        }
                        i10++;
                    }
                }
                if ((c10 ^ 0) != 0) {
                    de.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                de.a.a();
                throw null;
            }
            kd.a.c(this);
            gg.b.f15029c.f(this);
            if (f.r(this)) {
                te.a.C(6L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            de.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        mf.a.f18523a.q(this);
        super.onDestroy();
        gg.b.f15029c.n(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        f0();
        a.j(this, null);
        String str = f.f12740a;
        if (f.b(this, w.n("W2kJIDZhIGQHZANsMHRWIFRpKGkeaBVkCXdu", "MW9nURZh"), w.n("WXAQbm1ONl88ZQplIWVsZltuL3MFX1FvEW4=", "xq6u2u9P"), yh.b.b().f25857w)) {
            w.n("GmEZbAdhUms=", "HLyue1PC");
            gg.b.f15029c.z();
        }
    }

    @Override // fg.e
    public final void z() {
        mf.b bVar = mf.a.f18523a;
        bVar.W(new filerecovery.photosrecovery.allrecovery.h(this, 21));
        bVar.E(this, this.f14460o, this.f14461p, R.color.color_100_f65b1a);
    }
}
