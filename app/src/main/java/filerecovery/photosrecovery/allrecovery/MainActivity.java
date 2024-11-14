package filerecovery.photosrecovery.allrecovery;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cj.w;
import com.airbnb.lottie.LottieAnimationView;
import com.atlaszz.core.service.DownloadService;
import filerecovery.photosrecovery.allrecovery.activity.CommonPreScanActivity;
import filerecovery.photosrecovery.allrecovery.activity.RecoveryHistoryActivity;
import filerecovery.photosrecovery.allrecovery.activity.SettingActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.BillingPageActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ContactRecoverMainActivity;
import filerecovery.photosrecovery.allrecovery.view.CleanerItemView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kf.u;
import l0.y;
import lg.a0;
import lg.h0;
import lg.i0;
import lg.j0;
import lg.k0;
import lg.s;
import xf.v;
import yf.r;

/* loaded from: classes2.dex */
public class MainActivity extends uf.d implements View.OnClickListener, pg.b, fg.f, pg.d, a0, gd.a, p000if.a {
    public static boolean S;
    public eh.m B;
    public TextView C;
    public TextView D;
    public TextView E;
    public CleanerItemView F;
    public r G;
    public TextView H;
    public g7.d I;
    public View J;
    public View K;
    public ImageView L;
    public View M;
    public boolean O;
    public long Q;

    /* renamed from: r, reason: collision with root package name */
    public int f14088r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f14089s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14090t;

    /* renamed from: u, reason: collision with root package name */
    public eh.o f14091u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14092v;

    /* renamed from: w, reason: collision with root package name */
    public LottieAnimationView f14093w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f14094x;

    /* renamed from: y, reason: collision with root package name */
    public LottieAnimationView f14095y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14096z;
    public final u1.a A = new u1.a(this, 3);
    public final u N = new u(this, 2);
    public int P = 0;
    public boolean R = true;

    static {
        w.n("G2ELbjZjBWkuaRJ5", "MQVbwqDA");
        S = false;
    }

    @Override // pg.b
    public final void A(long j4) {
        runOnUiThread(new c(this, j4, 1));
    }

    @Override // pg.d
    public final void B(long j4, int i10, boolean z6) {
        if (i10 == 7) {
            runOnUiThread(new c(this, j4, 0));
        }
    }

    @Override // uf.i
    public final void V() {
        this.K = findViewById(R.id.layout_main_iv_billing);
        this.M = findViewById(R.id.home_pro);
        this.f14089s = (LinearLayout) findViewById(R.id.layout_global_banner_ad);
        this.J = findViewById(R.id.main_v_update_warn);
        findViewById(R.id.layout_main_photo_recovery).setOnClickListener(this);
        findViewById(R.id.layout_main_wa_recovery).setOnClickListener(this);
        findViewById(R.id.layout_main_cleaner).setOnClickListener(this);
        findViewById(R.id.tv_video_recovery).setOnClickListener(this);
        findViewById(R.id.tv_audio_recovery).setOnClickListener(this);
        findViewById(R.id.tv_document_recovery).setOnClickListener(this);
        findViewById(R.id.layout_main_result).setOnClickListener(this);
        findViewById(R.id.layout_main_title_setting).setOnClickListener(this);
        findViewById(R.id.rly_main_feedback).setOnClickListener(this);
        findViewById(R.id.tv_contact_recovery).setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.H = (TextView) findViewById(R.id.tv_contact_upgrade_dot);
        CleanerItemView cleanerItemView = (CleanerItemView) findViewById(R.id.cleaner_screenshots);
        this.F = cleanerItemView;
        cleanerItemView.setRightViewVisible(8);
        this.F.setOnClickListener(this);
        this.C = (TextView) findViewById(R.id.tv_document_upgrade_dot);
        this.D = (TextView) findViewById(R.id.main_tv_wa_upgrade_dot);
        this.E = (TextView) findViewById(R.id.main_tv_wa_un_read_count);
        int i10 = 0;
        this.C.setVisibility(yh.b.b().f25838m0 ? 0 : 8);
        if (lh.c.a().f18159b && yh.b.b().f25816b) {
            findViewById(R.id.layout_main_wa_recovery).setOnLongClickListener(new k(this));
        }
        int x10 = sj.f.x(this);
        if (x10 > 0) {
            runOnUiThread(new o0.m(x10, 2, this));
        } else {
            this.E.setVisibility(View.GONE);
            this.D.setVisibility(yh.b.b().f25840n0 ? 0 : 8);
        }
        this.H.setVisibility(yh.b.b().f25842o0 ? 0 : 8);
        this.f14090t = (TextView) findViewById(R.id.main_tv_cleaner);
        this.f14095y = (LottieAnimationView) findViewById(R.id.layout_main_clean_complete_lottie_anim);
        this.f14093w = (LottieAnimationView) findViewById(R.id.progress_cleaner_loading);
        this.f14094x = (TextView) findViewById(R.id.tv_cleaner_found_size);
        this.f14090t.setText(dg.a.q0(getString(R.string.arg)));
        TextView textView = (TextView) findViewById(R.id.tv_feedback);
        String string = getResources().getString(R.string.arg);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new UnderlineSpan(), 0, string.length(), 33);
        textView.setText(spannableStringBuilder);
        ImageView imageView = (ImageView) findViewById(R.id.layout_main_iv_self_ad);
        this.L = imageView;
        imageView.setOnClickListener(new d(this, i10));
        String str = j0.f18120a;
        i0.f18118a.getClass();
        if (j0.b(this)) {
            if (og.a.c0(this)) {
                this.L.setImageResource(R.mipmap.ic_home_gallery2_rtl);
            } else {
                this.L.setImageResource(R.mipmap.ic_home_gallery2);
            }
            this.L.setVisibility(View.VISIBLE);
        } else {
            this.L.setVisibility(View.GONE);
        }
        if (ff.a.f14050a.j()) {
            this.K.setVisibility(View.GONE);
            this.M.setVisibility(View.VISIBLE);
        } else {
            this.M.setVisibility(View.GONE);
            this.K.setVisibility(View.VISIBLE);
        }
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_main;
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.mainColorPrimary);
        eVar.o(R.id.layout_view);
        eVar.f12030k.f11991f = true;
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
    }

    @Override // fg.f
    public final void c() {
        mf.d.f18527a.Z(this, this.f14089s, R.color.color_100_white_262626, R.color.color_100_D6E1F6_373737);
    }

    @Override // uf.i
    public final void d0() {
        if (this.R) {
            dg.d.l(this, 0);
        } else {
            this.R = true;
        }
    }

    @Override // uf.d
    public final void f0() {
        ff.a.f14050a.e();
    }

    @Override // uf.d
    public final void i0() {
        if (lh.n.a(hashCode())) {
            return;
        }
        startActivityForResult(new Intent(this, (Class<?>) ContactRecoverMainActivity.class), 9010);
    }

    @Override // uf.d
    public final int j0() {
        return this.f14088r;
    }

    @Override // uf.d
    public final Intent k0() {
        return new Intent(this, (Class<?>) MainActivity.class);
    }

    @Override // uf.d
    public final boolean l0() {
        return this.f14088r != 0;
    }

    @Override // uf.d
    public final void m0() {
        if (Math.abs(System.currentTimeMillis() - this.Q) < 1000) {
            return;
        }
        int i10 = this.f14088r;
        if (i10 == 101) {
            s.f18136a.c();
            startActivityForResult(new Intent(this, (Class<?>) RecoveryHistoryActivity.class), 9010);
        } else if (i10 == 100) {
            tg.b.j().P(new j(this, 2));
        } else if (i10 == 7) {
            long i11 = yj.a.f25869d.i();
            if (this.F.f14627a || i11 == 0) {
                ah.a.z0(this, 7, false);
            } else {
                yg.j.n0(this, 7);
            }
            dg.c.F(this, 7);
        } else {
            CommonPreScanActivity.g0(this, i10, false);
        }
        this.Q = System.currentTimeMillis();
    }

    @Override // lg.a0
    public final void n(boolean z6) {
        h0.f18115a.g();
    }

    public final void n0() {
        ua.a aVar;
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("KXAUbjNoDG09XxNwMWFHZQ==", "xoFqlcFn"), w.n("PnASbhZoHm0nX0ZwJmEhZQ==", "uF25BqFU"), v.a().K) && (aVar = g7.i.f15004e) != null) {
            og.b bVar = r9.f.f20569f;
            bVar.f19337a = new j.d(this, 7);
            if (aVar.f22466b == 2 && (aVar.a(1) || aVar.a(0))) {
                if (yh.a.a().f25809b >= 2) {
                    return;
                }
                c2.b.g().b(bVar);
                return;
            }
            if (!(aVar.f22467c == 11) || yh.a.a().f25810c >= 3) {
                return;
            }
            if (!new y(this).a()) {
                c2.b.g().b(bVar);
                return;
            }
            og.a.y0(this);
            yh.a.a().f25810c++;
            yh.a.a().b();
        }
    }

    public final void o0() {
        String str = dg.f.f12740a;
        if (!dg.f.b(this, w.n("P3AObjpzJ3QsaQhnCnVDZFN0ZQ==", "NbPkeBlH"), w.n("KHAwbipzCHQsaQhnCnVDZFN0ZQ==", "hPGUumCq"), v.a().L) || yh.a.a().f25808a == j3.j.v(this)) {
            return;
        }
        this.J.setVisibility(View.VISIBLE);
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        g7.d dVar = this.I;
        if (dVar != null && dVar.f14994b) {
            this.R = false;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        try {
            if (!yh.b.b().f25828h0) {
                eh.o oVar = new eh.o(this);
                this.f14091u = oVar;
                oVar.f13425r = new com.android.libsimilar.liveeventbus.b(this, 23);
                ua.b.n(this, oVar);
                String str = dg.d.f12731a;
                String n10 = w.n("FHgedApvH2Yrcl4xHXM9b3c=", "7aVhbt8x");
                dg.d.y(this, dg.d.f12732b, n10, n10);
                return;
            }
            int i10 = 1;
            if (!ua.b.c(this.B)) {
                String str2 = j0.f18120a;
                i0.f18118a.getClass();
                eh.m a10 = j0.a(this);
                this.B = a10;
                if (a10 != null) {
                    a10.A = new d(this, i10);
                }
            }
            if (this.B == null) {
                p0();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (lh.n.a(id2)) {
            return;
        }
        if (id2 == R.id.layout_main_photo_recovery) {
            dg.d.l(this, 1);
            this.f14088r = 2;
            h0();
            return;
        }
        if (id2 == R.id.layout_main_wa_recovery) {
            int i10 = dg.j.f12745j;
            String n10 = w.n("HGUEcyhnFF8hbFpjaw==", "rL97M00o");
            dg.d.y(this, dg.d.f12732b, n10, n10);
            this.f14088r = 9;
            p9.a.q(this, true);
            this.D.setVisibility(View.GONE);
            yh.b.b().f25840n0 = false;
            yh.b.b().d();
            return;
        }
        if (id2 == R.id.layout_main_cleaner) {
            int i11 = dg.c.f12730j;
            String n11 = w.n("f28iZQdTOGw5cw5fAWlDcw==", "x37OXHiV");
            String n12 = w.n("EmwSYSdlA18hbFpjaw==", "xGdW59T4");
            dg.d.y(this, n11, n12, n12);
            this.f14088r = 100;
            h0();
            return;
        }
        if (id2 == R.id.tv_video_recovery) {
            dg.d.l(this, 2);
            this.f14088r = 1;
            h0();
            return;
        }
        if (id2 == R.id.tv_audio_recovery) {
            dg.d.l(this, 3);
            this.f14088r = 3;
            h0();
            return;
        }
        if (id2 == R.id.tv_document_recovery) {
            dg.d.l(this, 8);
            this.f14088r = 8;
            h0();
            this.C.setVisibility(View.GONE);
            yh.b.b().f25838m0 = false;
            yh.b.b().d();
            return;
        }
        if (id2 == R.id.layout_main_title_setting) {
            if (this.J.getVisibility() == 0) {
                this.J.setVisibility(View.GONE);
                yh.a.a().f25808a = j3.j.v(this);
                yh.a.a().b();
            }
            lg.c.f18097a.t(this.N);
            dg.d.l(this, 7);
            startActivityForResult(new Intent(this, (Class<?>) SettingActivity.class), 9010);
            return;
        }
        if (id2 == R.id.layout_main_result) {
            dg.d.l(this, 5);
            this.f14088r = 101;
            h0();
            return;
        }
        if (id2 == R.id.rly_main_feedback) {
            dg.d.l(this, 6);
            lh.i.a(this, 4);
            return;
        }
        if (id2 == R.id.cleaner_screenshots) {
            dg.d.l(this, 9);
            this.f14088r = 7;
            h0();
        } else {
            if (id2 != R.id.tv_contact_recovery) {
                if (id2 == R.id.layout_main_iv_billing) {
                    dg.d.l(this, 12);
                    BillingPageActivity.E0(this, true);
                    return;
                }
                return;
            }
            dg.d.l(this, 11);
            this.f14088r = 10;
            g0();
            yh.b.b().f25842o0 = false;
            yh.b.b().d();
            this.H.setVisibility(View.GONE);
        }
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        if (bundle != null) {
            this.f14088r = bundle.getInt(w.n("ImMWbhZ0CHBl", "XSX0kusV"));
        }
        super.onCreate(bundle);
        ff.a.f14050a.f14055e.add(this);
        com.bumptech.glide.e.f4545b.f3892b = this;
        S = true;
        nd.a.c(this);
        try {
            String substring = qe.a.b(this).substring(1745, 1776);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "0300e300c0603551d13040530030101".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            int i10 = 2;
            if (System.currentTimeMillis() % 2 == 0) {
                int c11 = qe.a.f20221a.c(bytes.length / 2);
                int i11 = 0;
                while (true) {
                    if (i11 > c11) {
                        c10 = 0;
                        break;
                    } else {
                        if (bytes[i11] != bytes2[i11]) {
                            c10 = 16;
                            break;
                        }
                        i11++;
                    }
                }
                if ((c10 ^ 0) != 0) {
                    qe.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                qe.a.a();
                throw null;
            }
            gg.c.f15030c.f(this);
            ((Set) lg.c.f18097a.f13227d).add(this.N);
            if (lh.c.a().f18162e) {
                try {
                    startService(new Intent(this, (Class<?>) DownloadService.class));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                c.c.a().g(this, z5.c.d(this), true);
                lh.c.a().f18162e = false;
                if (yh.b.b().W) {
                    c2.b.g().f2903b = false;
                    q0();
                }
            } else if (this.f22857a) {
                String d10 = z5.c.d(this);
                if (w.n("IGU3YTJsdA==", "APDQGHHN").equals(d10)) {
                    c.c.a().g(this, d10, true);
                }
            } else {
                c2.b.g().f2903b = false;
                q0();
            }
            String str = rg.c.f20647b;
            rg.b.f20646a.e();
            String str2 = dg.f.f12740a;
            lh.c.a().f18160c = dg.f.b(this, w.n("OHMocyFvBl8sYUdpNGUKYjRuX2UxX3sxNQ==", "qPZ5FRRa"), w.n("HHMdcyVvOV8nYR9pBGVrYiRuWGUbX0gxNQ==", "Tim6ex3m"), yh.b.b().d0);
            if (yh.b.b().W || yh.b.b().f25819c0 || yh.b.b().f25854u0) {
                yh.b.b().W = false;
                yh.b.b().f25819c0 = false;
                yh.b.b().f25854u0 = false;
                yh.b.b().d();
            }
            s.f18136a.f18143i.add(this);
            h0.f18115a.a(this);
            int i12 = Build.VERSION.SDK_INT;
            if ((i12 >= 30 ? com.bumptech.glide.d.i(this) : ve.a.f(this)) && com.bumptech.glide.d.A(this)) {
                com.bumptech.glide.d.F(this);
            }
            c2.b.g().f2905d = null;
            if (this.f22857a) {
                c2.b.g().f2903b = true;
                return;
            }
            k0.f18124a.execute(new e8.a(r11));
            if (((i12 <= 32 || l0.g.a(this, "android.permission.POST_NOTIFICATIONS") != -1) ? 0 : 1) != 0) {
                c2.b.g().b(new og.j(i10));
            }
            c2.b.g().b(sb.g.f21018m);
        } catch (Exception e11) {
            e11.printStackTrace();
            qe.a.a();
            throw null;
        }
    }

    @Override // uf.d, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        if (this.f14092v) {
            this.f14092v = false;
        } else {
            mf.d.f18527a.q(this);
        }
        ua.b.m(this.f14091u);
        ua.b.m(this.B);
        eh.o oVar = this.f14091u;
        if (oVar != null) {
            ua.b.m((yf.g) oVar.f13427t);
        }
        super.onDestroy();
        gg.c.f15030c.n(this);
        if (this.f22857a && uf.h.f22846a.size() > 0) {
            try {
                uf.h.f22846a.clear();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        u1.a aVar = this.A;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        h0.f18115a.b(this);
        s.f18136a.f18143i.remove(this);
        com.bumptech.glide.e.f4545b.f3892b = null;
        lg.c.f18097a.t(this.N);
        ff.a.f14050a.f14055e.remove(this);
    }

    @Override // uf.d, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean booleanExtra = intent.getBooleanExtra(w.n("JHATYT1lLmwjblR1I2dl", "lhJafmYS"), false);
        this.f14092v = booleanExtra;
        if (booleanExtra) {
            finish();
            mf.d.f18527a.q(this);
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            try {
                if (Build.VERSION.SDK_INT < 24) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (intent.getBooleanExtra(w.n("OHMobixlFV8haFZjKWUnXyBwVWE3ZQ==", "RP02th6e"), false)) {
            c2.b.g().f2903b = false;
            ((Set) lg.c.f18097a.f13227d).add(this.N);
            g7.i.b();
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        lg.u.f18144a.f18152h.remove(this);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
        if (bundle != null) {
            this.f14088r = bundle.getInt(w.n("GmNTbjZ0K3Bl", "9vi2iRtu"));
        }
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i10 = 0;
        lh.j.f18194a.f19561a = false;
        lg.u.f18144a.f18152h.add(this);
        try {
            uf.h.a();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        rf.g.c().f20639c.f20632g = null;
        gg.c.f15030c.t();
        k0.f18124a.execute(new j(this, i10));
        ff.a.f14050a.e();
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putInt(w.n("BmMjbhJ0N3Bl", "nevYAgPN"), this.f14088r);
        }
    }

    public final void p0() {
        PhotoApplication.f14105g = true;
        S = false;
        rf.g.c().f20638b = 0L;
        nh.a.i(w.n("M3UubAxkbiA7ZRhlBkxVczFTXm8eVBBtIyBnPWww", "4bi3FZL6"));
        c2.b bVar = mj.i.f18582i;
        PhotoApplication photoApplication = x5.b.f24990b;
        try {
            if (((ng.b) bVar.f2904c) != null) {
                photoApplication.getContentResolver().unregisterContentObserver((ng.b) bVar.f2904c);
                ng.b bVar2 = (ng.b) bVar.f2904c;
                bVar2.getClass();
                try {
                    if (bVar2.f18917a != null && !bVar2.f18917a.isShutdown()) {
                        bVar2.f18917a.shutdownNow();
                    }
                } catch (Exception unused) {
                }
                bVar.f2904c = null;
            }
            if (((ng.b) bVar.f2905d) != null) {
                photoApplication.getContentResolver().unregisterContentObserver((ng.b) bVar.f2905d);
                ng.b bVar3 = (ng.b) bVar.f2905d;
                bVar3.getClass();
                try {
                    if (bVar3.f18917a != null && !bVar3.f18917a.isShutdown()) {
                        bVar3.f18917a.shutdownNow();
                    }
                } catch (Exception unused2) {
                }
                bVar.f2905d = null;
            }
        } catch (Exception unused3) {
        }
        finish();
        ((Set) lg.c.f18097a.f13227d).clear();
        Iterator it = lg.u.f18144a.f18155k.iterator();
        while (it.hasNext()) {
            lg.y yVar = (lg.y) it.next();
            if (yVar != null) {
                ((SplashActivity) yVar).finish();
            }
        }
    }

    @Override // p000if.a
    public final void q(boolean z6) {
        if (j3.j.A(this)) {
            return;
        }
        runOnUiThread(new t8.f(3, this, z6));
    }

    public final void q0() {
        PhotoApplication.c();
        g7.d dVar = new g7.d();
        this.I = dVar;
        int i10 = 21;
        dVar.f14993a = registerForActivityResult(new h.e(), new l0.f(dVar, i10));
        g7.d dVar2 = this.I;
        d6.b bVar = new d6.b(this, i10);
        dVar2.getClass();
        dVar2.f14996d = bVar;
        ((Set) lg.c.f18097a.f13227d).add(this.N);
        g7.i.b();
    }

    @Override // pg.b
    public final void r(String str) {
    }

    @Override // fg.f
    public final void t() {
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("OW8aZWlkHncsIFFhLG4wcnVzRmk3Y2g=", "GXJzA51A"), w.n("HXBXbg9iIm42ZRRfPW9eZW1kKXdu", "drr2PC7V"), yh.b.b().f25841o)) {
            mf.b bVar = mf.d.f18527a;
            bVar.W(new h(this, 0));
            bVar.F(this, this.f14089s);
        }
        if (dg.f.A(this)) {
            nf.p.D().v(this);
        }
    }

    @Override // pg.b
    public final void y(long j4) {
    }
}
