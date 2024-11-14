package filerecovery.photosrecovery.allrecovery.ui.act;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.s;
import androidx.viewpager.widget.ViewPager;
import bh.a0;
import cj.w;
import com.bumptech.glide.d;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.tabs.TabLayout;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.SplashActivity;
import filerecovery.photosrecovery.allrecovery.b;
import gh.r;
import gh.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k.j;
import rf.g;
import sj.f;
import uf.h;
import uf.i;
import yg.n0;
import yg.u;
import z5.c;

/* loaded from: classes2.dex */
public class WhatsAppRecoveryActivity extends i implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f14523q = 0;

    /* renamed from: j, reason: collision with root package name */
    public TabLayout f14524j;

    /* renamed from: k, reason: collision with root package name */
    public ViewPager f14525k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f14526l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public String[] f14527m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14528n;

    /* renamed from: o, reason: collision with root package name */
    public int f14529o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14530p;

    @Override // uf.i
    public final void V() {
        d.F(this);
        this.f14524j = (TabLayout) findViewById(R.id.wa_main_tab_title);
        this.f14525k = (ViewPager) findViewById(R.id.wa_main_vp);
        findViewById(R.id.wa_main_iv_feedback).setOnClickListener(this);
        findViewById(R.id.wa_main_iv_back).setOnClickListener(new j(this, 13));
        this.f14527m = new String[]{getString(R.string.arg), getString(R.string.arg)};
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_whats_app_recovery;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.color_100_008069_1F2C34);
        eVar.l(R.color.color_100_008069_1F2C34);
        eVar.c();
        eVar.m(false);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        this.f14529o = getIntent().getIntExtra(w.n("InQWcj1fF3IjZ15lLHQ=", "vuadXyiw"), 0);
        this.f14528n = getIntent().getBooleanExtra(w.n("OHMoYihjGl8vYVpuHWE2dDx2WHR5", "RaB7fkSE"), false);
        g0();
        if (this.f14528n) {
            if (!MainActivity.S) {
                d.y(this);
            }
            sf.e r10 = sf.e.r();
            Iterator it = ((ArrayList) r10.f21161b).iterator();
            while (it.hasNext()) {
                sf.a aVar = (sf.a) it.next();
                if (aVar != null && ((sf.d) r10.f21162c).f21158i) {
                    aVar.i(this);
                }
            }
        }
        this.f14524j.setupWithViewPager(this.f14525k);
        ArrayList arrayList = this.f14526l;
        arrayList.add(og.a.A(getSupportFragmentManager(), new r(), 0));
        arrayList.add(og.a.A(getSupportFragmentManager(), new y(), 1));
        this.f14525k.setOffscreenPageLimit(arrayList.size());
        this.f14525k.setAdapter(new n0(this, getSupportFragmentManager()));
        this.f14524j.setSelectedTabIndicatorGravity(0);
        this.f14525k.b(new yg.w(this, 1));
        ViewPager viewPager = this.f14525k;
        int i10 = this.f14529o;
        viewPager.f2169v = false;
        viewPager.v(i10, 0, false, false);
    }

    @Override // uf.i
    public final void d0() {
        ViewPager viewPager = this.f14525k;
        if (viewPager != null) {
            if (viewPager.getCurrentItem() == 0) {
                int i10 = dg.j.f12745j;
                String n10 = w.n("HGUEcyhnFF8BaFJ0HXM9b3c=", "OP996a2f");
                dg.d.A(this, n10, n10);
            } else {
                int i11 = dg.j.f12745j;
                String n11 = w.n("HGUEcyhnFF8PZVdpI18maDp3", "Yj4FSVqW");
                dg.d.A(this, n11, n11);
            }
        }
    }

    public final void f0() {
        m7.a e10 = m7.a.e(this);
        u uVar = (u) e10.f18383e;
        String str = (String) e10.f18382d;
        SharedPreferences sharedPreferences = (SharedPreferences) uVar.f25797a;
        if ((sharedPreferences != null ? sharedPreferences.getBoolean(str, false) : false) || !f.C(this)) {
            return;
        }
        m7.a.e(this).g();
    }

    public final void g0() {
        if (this.f14528n) {
            if (this.f14529o == 0) {
                int i10 = dg.j.f12745j;
                String n10 = w.n("OGUxcyxnK18Hbx9pFGlXYTFpWW42ZBxsXXQLZDpjHmkWaw==", "8sng8ner");
                dg.d.A(this, n10, n10);
            } else {
                int i11 = dg.j.f12745j;
                String n11 = w.n("I2UVcxdnDF8WbxJpM2lQYUZpKW4yTVBkD2EqZVVvPGUcZQJfFWwAY2s=", "qznfvieg");
                dg.d.A(this, n11, n11);
            }
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        f0();
        f.n();
        if (this.f14528n) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.putExtra(w.n("HHMdbihlKl8qaA5jGWVGXzBwUmEdZQ==", "xZfvBKgj"), true);
            startActivity(intent);
        }
        if (!og.a.d0(this) && dg.f.y(this)) {
            gg.a.f15028c.getClass();
            Activity a10 = b.a();
            if (a10 != null) {
                g c10 = g.c();
                c10.f20639c.f20633h = true;
                if (c10.a()) {
                    c10.g(a10);
                }
            }
        }
        int i10 = dg.j.f12745j;
        String n10 = w.n("OGUxcyxnK18rYQhrLWNYaSZr", "CvjLQwkN");
        dg.d.A(this, n10, n10);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.wa_main_iv_feedback) {
            startActivity(new Intent(this, (Class<?>) WaLimitationActivity.class));
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z6;
        char c10;
        char c11;
        super.onCreate(bundle);
        try {
            String substring = be.a.b(this).substring(2752, 2783);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "a5fd82d331ba5edefb6862373a493ff".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            long j4 = 2;
            if (System.currentTimeMillis() % j4 == 0) {
                int c12 = be.a.f2652a.c(bytes.length / 2);
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
                    be.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                be.a.a();
                throw null;
            }
            try {
                String substring2 = le.a.b(this).substring(1870, 1901);
                og.a.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = bj.a.f2786a;
                byte[] bytes3 = substring2.getBytes(charset2);
                og.a.o(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "f329dd6a59fa1bfa192b2fd1af321ac".getBytes(charset2);
                og.a.o(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j4 == 0) {
                    int c13 = le.a.f18062a.c(bytes3.length / 2);
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
                        le.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    le.a.a();
                    throw null;
                }
                if (this.f22857a) {
                    String d10 = c.d(this);
                    if (w.n("NWURYTxsdA==", "Bu5KMyNk").equals(d10)) {
                        c.c.a().g(this, d10, true);
                    }
                }
                if (dg.f.y(this)) {
                    te.a.C(3L);
                }
                f0();
                f.X(this, 0);
                if (og.a.T(this)) {
                    z6 = false;
                } else {
                    startActivityForResult(new Intent(this, (Class<?>) WaGuideActivity.class), 9010);
                    z6 = true;
                }
                this.f14530p = z6;
                Iterator it = lg.u.f18144a.f18155k.iterator();
                while (it.hasNext()) {
                    lg.y yVar = (lg.y) it.next();
                    if (yVar != null) {
                        ((SplashActivity) yVar).finish();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                le.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            be.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f.n();
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        boolean z6 = false;
        this.f14529o = getIntent().getIntExtra(w.n("JnRWcgFfM3I5ZwtlO3Q=", "hLU7uUog"), 0);
        this.f14528n = getIntent().getBooleanExtra(w.n("OHMoYihjGl8vYVpuHWE2dDx2WHR5", "MdBHRUz5"), false);
        ViewPager viewPager = this.f14525k;
        if (viewPager != null) {
            if (viewPager.getCurrentItem() != this.f14529o) {
                int size = this.f14526l.size();
                int i10 = this.f14529o;
                if (size > i10) {
                    s sVar = (s) this.f14526l.get(i10);
                    if (sVar instanceof r) {
                        r rVar = (r) sVar;
                        rVar.H0 = TTAdConstant.MATE_VALID;
                        rVar.I0 = 0L;
                        rVar.J0 = 0L;
                        TextView textView = rVar.f15085w0;
                        if (textView != null) {
                            textView.setText(x5.b.a().getString(R.string.arg));
                        }
                        a0 a0Var = rVar.f15083u0;
                        if (a0Var != null) {
                            a0Var.G();
                        }
                    } else if (sVar instanceof y) {
                        y yVar = (y) sVar;
                        yVar.f15112z0 = TTAdConstant.MATE_VALID;
                        yVar.A0 = -1;
                        TextView textView2 = yVar.O0;
                        if (textView2 != null) {
                            textView2.setText(x5.b.a().getString(R.string.arg));
                        }
                        TextView textView3 = yVar.P0;
                        if (textView3 != null) {
                            textView3.setText(x5.b.a().getString(R.string.arg));
                        }
                        yVar.B0 = 0L;
                        yVar.C0 = 0L;
                        try {
                            h.f22846a.clear();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (yVar.U) {
                            yVar.l0();
                        }
                    }
                }
            }
            ViewPager viewPager2 = this.f14525k;
            int i11 = this.f14529o;
            viewPager2.f2169v = false;
            viewPager2.v(i11, 0, false, false);
        }
        g0();
        f0();
        if (!og.a.T(this)) {
            startActivityForResult(new Intent(this, (Class<?>) WaGuideActivity.class), 9010);
            z6 = true;
        }
        this.f14530p = z6;
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f14530p && (!d.A(this) || !d.B(this))) {
            startActivityForResult(new Intent(this, (Class<?>) WaGuideActivity.class), 9010);
        }
        this.f14530p = false;
    }
}
