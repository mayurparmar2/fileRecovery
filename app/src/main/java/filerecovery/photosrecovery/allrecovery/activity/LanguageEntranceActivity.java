package filerecovery.photosrecovery.allrecovery.activity;

import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cj.w;
import com.gyf.immersionbar.OSUtils;
import com.gyf.immersionbar.e;
import dg.f;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.activity.LanguageEntranceActivity;
import filerecovery.photosrecovery.allrecovery.h;
import kf.a;
import kf.k;
import lh.c;
import nf.n;
import of.d;
import sc.i;
import sc.j;
import xf.v;
import yh.b;

/* loaded from: classes2.dex */
public class LanguageEntranceActivity extends a implements j {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f14161s = 0;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14162m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f14163n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14164o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f14165p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f14166q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f14167r;

    @Override // kf.a, uf.i
    public final void V() {
        super.V();
        d.b().f19310g = false;
        j.f21139r0.getClass();
        w.n("MHAeTix3", "YDCKav7F");
        i.f21138c = this;
        this.f14166q = (LinearLayout) findViewById(R.id.layout_language_native_ad);
        this.f14167r = (LinearLayout) findViewById(R.id.layout_language_banner_ad);
        this.f14162m = (LinearLayout) findViewById(R.id.llGuideContainer);
        this.f14163n = (ImageView) findViewById(R.id.guideButton);
        this.f14164o = (LinearLayout) findViewById(R.id.guideText);
        if (b.b().f25816b) {
            try {
                boolean booleanExtra = getIntent().getBooleanExtra(w.n("HHMEciJtCmUrdWc=", "D8YARTzA"), false);
                getIntent().getIntExtra(w.n("E3ItbQllLHUuXxhoHXdrdDxwZQ==", "LTToWGTn"), -1);
                if (booleanExtra) {
                    i0();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        d.b().f19306c = new h(this, 5);
        d.b().g(this, this.f14166q, this.f14167r);
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_entrance_language;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        String str = f.f12740a;
        if (f.b(this, w.n("HHMdaCRkK18nZRxfHmFaZzBhUWU2bhh2K2codAFvBV8XYXI=", "lgxCBIhk"), w.n("OHMoaCBkFF8sZURfLmE7ZyBhVmUcbit2HWcwdA9vDF8zYXI=", "tQfbZ5P4"), v.a().I) && new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.n(R.id.v_status_flg);
        eVar.h(R.color.color_100_EBEFF5);
        eVar.l(R.color.color_100_EBEFF5);
        boolean z6 = true;
        eVar.m(true);
        eVar.c();
        eVar.f12030k.f11994i = true;
        if (!OSUtils.isMIUI6Later() && Build.VERSION.SDK_INT < 26) {
            z6 = false;
        }
        if (z6) {
            com.gyf.immersionbar.b bVar = eVar.f12030k;
            bVar.getClass();
            bVar.f11990e = 0.0f;
        } else {
            eVar.f12030k.f11990e = 0.2f;
        }
        eVar.f();
    }

    @Override // uf.i
    public final void c0(e eVar) {
    }

    @Override // uf.i
    public final void d0() {
        String str = dg.d.f12731a;
        String n10 = w.n("O2U1TCxuKXUoZw5fAWhbdw==", "gBJQDdFI");
        if (TextUtils.isEmpty(n10)) {
            return;
        }
        j3.j.G(this, dg.d.f12731a, n10, n10);
    }

    @Override // kf.a
    public final tf.i g0() {
        return new tf.i(this, 0);
    }

    @Override // kf.a
    public final void h0() {
        String str = dg.d.f12731a;
        String n10 = w.n("O2U1TCxuKXUoZw5fEWxdY2s=", "ZsQCXNEt");
        if (!TextUtils.isEmpty(n10)) {
            j3.j.G(this, dg.d.f12731a, n10, n10);
        }
        if (!og.a.h(this)) {
            og.a.l(this);
        } else {
            og.a.V(this);
            finish();
        }
    }

    public final void i0() {
        final int i10 = 0;
        this.f14162m.setVisibility(View.VISIBLE);
        this.f17432k.setVisibility(View.INVISIBLE);
        this.f14162m.setOnClickListener(new View.OnClickListener(this) { // from class: kf.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LanguageEntranceActivity f17451b;

            {
                this.f17451b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                LanguageEntranceActivity languageEntranceActivity = this.f17451b;
                switch (i11) {
                    case 0:
                        int i12 = LanguageEntranceActivity.f14161s;
                        LinearLayout linearLayout = languageEntranceActivity.f14162m;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(View.GONE);
                        }
                        ImageView imageView = languageEntranceActivity.f17432k;
                        if (imageView != null) {
                            imageView.setVisibility(View.VISIBLE);
                            break;
                        }
                        break;
                    default:
                        int i13 = LanguageEntranceActivity.f14161s;
                        languageEntranceActivity.f0();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f14163n.setOnClickListener(new View.OnClickListener(this) { // from class: kf.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LanguageEntranceActivity f17451b;

            {
                this.f17451b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                LanguageEntranceActivity languageEntranceActivity = this.f17451b;
                switch (i112) {
                    case 0:
                        int i12 = LanguageEntranceActivity.f14161s;
                        LinearLayout linearLayout = languageEntranceActivity.f14162m;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(View.GONE);
                        }
                        ImageView imageView = languageEntranceActivity.f17432k;
                        if (imageView != null) {
                            imageView.setVisibility(View.VISIBLE);
                            break;
                        }
                        break;
                    default:
                        int i13 = LanguageEntranceActivity.f14161s;
                        languageEntranceActivity.f0();
                        break;
                }
            }
        });
        this.f14164o.setTranslationY(0.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_5);
        if (this.f14165p == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
            this.f14165p = ofFloat;
            ofFloat.addUpdateListener(new k(this, dimensionPixelSize, 0));
            this.f14165p.setDuration(1500L);
            this.f14165p.setRepeatCount(-1);
            this.f14165p.setRepeatMode(2);
        }
        this.f14165p.start();
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        if (this.f14162m.getVisibility() != View.VISIBLE) {
            super.onBackPressed();
            return;
        }
        LinearLayout linearLayout = this.f14162m;
        if (linearLayout != null) {
            linearLayout.setVisibility(View.GONE);
        }
        ImageView imageView = this.f17432k;
        if (imageView != null) {
            imageView.setVisibility(View.VISIBLE);
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.f14165p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14165p.removeAllUpdateListeners();
        }
        j.f21139r0.getClass();
        i.f21138c = null;
        d.b().a(this);
        super.onDestroy();
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (c.a().f18164g) {
            i0();
            c.a().f18164g = false;
        }
        if (og.a.h(this) && f.z(this)) {
            if (og.a.W()) {
                synchronized (n.class) {
                }
                j3.j.f16671j.l(this, null);
                return;
            }
            mf.b bVar = mf.e.f18528a;
            if (ff.a.f14050a.j()) {
                bVar.q(this);
            } else {
                if (bVar.A()) {
                    bVar.w().v(this);
                    return;
                }
                nf.d r10 = bVar.r();
                r10.getClass();
                r10.l(this, null);
            }
        }
    }
}
