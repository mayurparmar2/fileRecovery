package filerecovery.photosrecovery.allrecovery;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import cj.w;
import com.atlaszz.decode.Decoder;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzl;
import filerecovery.photosrecovery.allrecovery.activity.LanguageEntranceActivity;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import java.util.List;
import java.util.Set;
import lg.u;
import lg.y;
import lh.r;

/* loaded from: classes2.dex */
public class SplashActivity extends a implements sc.l, y {
    public static boolean C;
    public boolean A;
    public boolean B;

    /* renamed from: y, reason: collision with root package name */
    public AnimatorSet f14115y;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14111u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14112v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14113w = false;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f14114x = new Handler();

    /* renamed from: z, reason: collision with root package name */
    public final h f14116z = new h(this, 2);

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i
    public final void V() {
        super.V();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lly_center_logo);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.SCALE_X, 0.79f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.SCALE_Y, 0.79f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14115y = animatorSet;
        animatorSet.addListener(new k4.n(this, linearLayout, 2));
        this.f14115y.play(ofFloat).with(ofFloat2).with(ofFloat3);
        this.f14115y.setDuration(1000L);
        this.f14115y.start();
        if (og.a.c0(this)) {
            this.f14120m.setRotation(-180.0f);
        }
        this.f14120m.g();
        of.b a10 = of.b.a();
        h hVar = this.f14116z;
        a10.f19296c = hVar;
        sf.f.m().h(hVar);
    }

    @Override // uf.i
    public final boolean a0() {
        return false;
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i
    public final void c0(com.gyf.immersionbar.e eVar) {
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final void f0() {
        boolean z6;
        if (this.f22859c || !Decoder.f4496a) {
            return;
        }
        try {
            System.loadLibrary("flutter");
            z6 = true;
        } catch (UnsatisfiedLinkError unused) {
            z6 = false;
        }
        if (z6) {
            com.bumptech.glide.d.y(this);
            nh.a.i(w.n("ceP3kChkUWksaUcgIW84cDllRWUn48qR", "wWMpZ5Yf"));
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final void g0() {
        if (this.A) {
            j0();
        } else if (this.B) {
            k0();
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final long h0() {
        return Build.MANUFACTURER.equalsIgnoreCase(w.n("A2k0bw==", "KGcDpksw")) ? 2500L : 1000L;
    }

    @Override // filerecovery.photosrecovery.allrecovery.a
    public final boolean i0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 <= 32) {
            if (this.f14127t.contains(Build.MANUFACTURER.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.f14117j) {
            this.f14112v = true;
            return;
        }
        if (this.f14113w) {
            return;
        }
        this.f14113w = true;
        if (yh.b.b().f25819c0) {
            r.a(this);
            startActivity(new Intent(this, (Class<?>) LanguageEntranceActivity.class));
            finish();
        } else if (!og.a.h(this)) {
            og.a.l(this);
        } else {
            og.a.V(this);
            finish();
        }
    }

    public final void k0() {
        if (this.f14118k) {
            return;
        }
        if (this.f14117j) {
            this.f14111u = true;
            return;
        }
        if (ff.a.f14050a.j()) {
            this.A = true;
            j0();
            of.b.a().getClass();
            rf.h l10 = rf.h.l();
            nh.a.f(l10.e());
            l10.i();
            sf.c m10 = sf.c.m();
            nh.a.f(m10.e());
            m10.i(this);
            sf.f m11 = sf.f.m();
            nh.a.f(m11.e());
            m11.i(this);
            return;
        }
        of.b.a().getClass();
        if (!of.b.b()) {
            if (sf.f.m().j()) {
                sf.f.m().l(this);
                this.f14112v = true;
                return;
            } else {
                this.A = true;
                j0();
                return;
            }
        }
        of.b a10 = of.b.a();
        a10.getClass();
        if (rf.h.l().f20627d != null) {
            a10.f19301h = true;
            rf.h.l().k(this);
        } else if (sf.c.m().j()) {
            a10.f19301h = false;
            sf.c.m().l(this);
        }
        this.f14112v = true;
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z6;
        za.a aVar;
        c.d dVar;
        lh.c a10 = lh.c.a();
        boolean z10 = yh.b.b().f25824f0;
        if (a10.f18159b) {
            lh.q.b(w.n("EHAHQyZuF2klX0dhZw==", "aSuxrzFq"), w.n("AmUETjV3PHM9clwg", "TUqpPi6N") + z10);
        }
        a10.f18158a = z10;
        super.onCreate(bundle);
        if (!this.f22859c && Decoder.f4496a) {
            try {
                System.loadLibrary("flutter");
                z6 = true;
            } catch (UnsatisfiedLinkError unused) {
                z6 = false;
            }
            if (z6) {
                u.f18144a.f18155k.add(this);
                PhotoApplication.c();
                ((Set) lg.c.f18097a.f13227d).clear();
                if (C) {
                    g7.i.d();
                    com.whatsapp.libmessagerecovery.j.f12371a.a();
                    C = false;
                } else {
                    g7.i.b();
                }
                if (!x5.b.f24991c) {
                    try {
                        sc.b bVar = sc.b.f21114a;
                        PhotoApplication photoApplication = x5.b.f24990b;
                        qf.a.f20222a.getClass();
                        List list = qf.a.f20223b;
                        te.a aVar2 = qf.a.f20224c;
                        bVar.getClass();
                        sc.b.b(photoApplication, list, aVar2);
                        sc.e eVar = sc.b.f21115b;
                        if (eVar != null) {
                            eVar.a(w.n("AnAbYTpoMGM2aUVpNnk=", "U09HoV8D"), this.f22857a, new p(0));
                        }
                        x5.b.f24991c = true;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        p9.a.G(this);
                        return;
                    }
                }
                sc.l.f21143s0.getClass();
                w.n("KXA4ThB3", "HsHQuQ9x");
                sc.k.f21142c = this;
                PhotoApplication.f14105g = false;
                if (lh.c.a().f18159b) {
                    s7.a aVar3 = new s7.a(this);
                    aVar3.f20830c = 1;
                    ((List) aVar3.f20831d).add(w.n("VDEMQw80ATgbMyU2YEYHRAExAjQoRQ02VDVNOHMyDjQ=", "WNcJI9XY"));
                    ((List) aVar3.f20831d).add(w.n("TEV1OAxBeEFwN1o0RjRwQnBGBUVdMkA3eEJwOVxCcjk=", "fr8dADo1"));
                    aVar = aVar3.a();
                } else {
                    aVar = null;
                }
                e8.c m10 = e8.c.m();
                ve.b bVar2 = sb.g.f21017l;
                m10.getClass();
                Context applicationContext = getApplicationContext();
                m10.f13227d = bVar2;
                try {
                    nc.c.D().N("ConsentManager init...");
                    c2.b bVar3 = new c2.b(5, (Object) null);
                    bVar3.f2903b = false;
                    if (aVar != null) {
                        bVar3.f2905d = aVar;
                    }
                    zzl zzb = zzc.zza(applicationContext).zzb();
                    m10.f13225b = zzb;
                    zzb.requestConsentInfoUpdate(this, new za.g(bVar3), new se.a(m10, applicationContext, bVar2), new se.a(m10, applicationContext, bVar2));
                } catch (Throwable th2) {
                    nc.c.D().O(th2);
                    th2.getMessage();
                    ve.b.F();
                }
                String str = dg.f.f12740a;
                boolean b10 = dg.f.b(this, w.n("HHMdcyVvOV8nYR9pBGVrYSFfVGc=", "MwNIFxeB"), w.n("HHMdcyVvOV8nYR9pBGVrYSFfVGc=", "XQXA2OLm"), yh.b.b().f25822e0);
                try {
                    int i10 = yh.b.b().f25814a;
                    if (i10 != -1) {
                        int i11 = yh.b.b().f25814a;
                        if (i11 < 29) {
                            yh.b.b().f25838m0 = true;
                        }
                        if (i11 < 33) {
                            yh.b.b().f25840n0 = true;
                        }
                        if (i11 < 37) {
                            yh.b.b().f25842o0 = true;
                        }
                        if (i10 <= 30 && !yh.b.b().f25819c0) {
                            yh.b.b().W = false;
                        }
                        if (i10 <= 51 && !yh.b.b().V) {
                            yh.b.b().f25854u0 = false;
                        }
                    }
                    int v10 = j3.j.v(this);
                    if (v10 != yh.b.b().f25814a) {
                        yh.b.b().f25814a = v10;
                        String str2 = yh.a.a().f25811d;
                        if (!TextUtils.isEmpty(str2)) {
                            dg.i.F(this, str2);
                            yh.a.a().f25811d = "";
                        }
                        yh.a.a().f25809b = 0;
                        yh.a.a().f25810c = 0;
                        yh.a.a().b();
                    }
                    yh.b.b().f25822e0 = b10;
                    yh.b.b().f25824f0 = false;
                    yh.b.b().d();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                c.c a11 = c.c.a();
                String n10 = w.n("MHA=", "Tmcd3H0a");
                a11.getClass();
                synchronized (c.d.class) {
                    if (c.d.f2826b == null) {
                        c.d.f2826b = new c.d();
                    }
                    dVar = c.d.f2826b;
                }
                dVar.f2828a = null;
                a11.f2818f = n10;
                c.c.a().f2825m = true;
                c.c a12 = c.c.a();
                String d10 = z5.c.d(this);
                a12.getClass();
                c.a q10 = c.a.q();
                q10.getClass();
                String str3 = "";
                try {
                    str3 = q10.v(this).getString("LangOs", "");
                } catch (Exception unused2) {
                }
                String c10 = c.c.c();
                boolean equals = true ^ TextUtils.equals(str3, c10);
                if (equals) {
                    c.a q11 = c.a.q();
                    q11.getClass();
                    try {
                        SharedPreferences.Editor edit = q11.v(this).edit();
                        if (c10 == null) {
                            c10 = "";
                        }
                        edit.putString("LangOs", c10);
                        edit.commit();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                a12.i("initPermission, isLongOsChanged:" + equals);
                a12.g(this, d10, equals);
                tg.b.j().P(new e8.a(2));
                AppOpenManager.f14240e = 0L;
                ff.a.f14050a.e();
                return;
            }
        }
        ve.a.r(this, w.n("Jm8GZHd6AmV4ZRRyOnI=", "NYJgWmG9"), getPackageName());
        p9.a.G(this);
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        sc.l.f21143s0.getClass();
        sc.k.f21142c = null;
        AnimatorSet animatorSet = this.f14115y;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f14115y.cancel();
        }
        super.onDestroy();
        of.b.a().f19296c = null;
        sf.f.m().h(null);
        this.f14114x.removeCallbacksAndMessages(null);
        u.f18144a.f18155k.remove(this);
    }

    @Override // filerecovery.photosrecovery.allrecovery.a, uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f14113w) {
            return;
        }
        boolean z6 = this.f14111u;
        Handler handler = this.f14114x;
        final int i10 = 0;
        if (z6) {
            this.f14111u = false;
            handler.postDelayed(new Runnable(this) { // from class: filerecovery.photosrecovery.allrecovery.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SplashActivity f14353b;

                {
                    this.f14353b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    SplashActivity splashActivity = this.f14353b;
                    switch (i11) {
                        case 0:
                            boolean z10 = SplashActivity.C;
                            splashActivity.k0();
                            break;
                        default:
                            splashActivity.A = true;
                            splashActivity.j0();
                            break;
                    }
                }
            }, 500L);
            return;
        }
        if (this.f14112v) {
            this.f14112v = false;
            final int i11 = 1;
            handler.postDelayed(new Runnable(this) { // from class: filerecovery.photosrecovery.allrecovery.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SplashActivity f14353b;

                {
                    this.f14353b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    SplashActivity splashActivity = this.f14353b;
                    switch (i112) {
                        case 0:
                            boolean z10 = SplashActivity.C;
                            splashActivity.k0();
                            break;
                        default:
                            splashActivity.A = true;
                            splashActivity.j0();
                            break;
                    }
                }
            }, 300L);
        } else if (og.a.a0()) {
            String str = dg.d.f12731a;
            String n10 = w.n("G3AAYQZoKnMwb3c=", "gGHluueP");
            if (TextUtils.isEmpty(n10)) {
                return;
            }
            j3.j.G(this, dg.d.f12732b, n10, n10);
        }
    }
}
