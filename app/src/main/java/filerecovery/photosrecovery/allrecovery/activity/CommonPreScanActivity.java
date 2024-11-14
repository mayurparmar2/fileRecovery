package filerecovery.photosrecovery.allrecovery.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cj.w;
import com.airbnb.lottie.LottieAnimationView;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import dg.d;
import dg.f;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.b;
import filerecovery.photosrecovery.allrecovery.h;
import j3.j;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.f0;
import lg.u;
import lh.n;
import nf.p;
import rf.g;
import uf.i;
import y9.m;
import zg.c;

/* loaded from: classes2.dex */
public class CommonPreScanActivity extends i implements View.OnClickListener, f0 {

    /* renamed from: j, reason: collision with root package name */
    public TextView f14149j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f14150k;

    /* renamed from: l, reason: collision with root package name */
    public LottieAnimationView f14151l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f14152m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f14153n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14154o;

    /* renamed from: p, reason: collision with root package name */
    public int f14155p = 2;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f14156q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    public final Handler f14157r = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public TextView f14158s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14159t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14160u;

    public static void g0(Activity activity, int i10, boolean z6) {
        try {
            Intent intent = new Intent(activity, (Class<?>) CommonPreScanActivity.class);
            if (i10 == 1) {
                intent.putExtra(w.n("OG4DZSd0LmsneWxzJ2wwYyFfRXkzZQ==", "xS64Kiyb"), 1);
            } else if (i10 == 2) {
                intent.putExtra(w.n("OG4DZSd0LmsneWxzJ2wwYyFfRXkzZQ==", "US5XqHYE"), 2);
            } else if (i10 == 3) {
                intent.putExtra(w.n("OG4DZSd0LmsneWxzJ2wwYyFfRXkzZQ==", "a5Hu6W75"), 3);
            } else if (i10 != 8) {
                return;
            } else {
                intent.putExtra(w.n("OG4DZSd0LmsneWxzJ2wwYyFfRXkzZQ==", "u0YPieV8"), 8);
            }
            intent.putExtra(w.n("OG4DZSd0LmsneWxpMV8zcjptbnImYyV2AXIyZA==", "dWV3XbSg"), z6);
            activity.startActivityForResult(intent, 9010);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // uf.i
    public final void V() {
        try {
            this.f14155p = getIntent().getIntExtra(w.n("HG42ZSN0EWsseTRzF2xRYzFfQnkZZQ==", "R622XODz"), 2);
            this.f14159t = getIntent().getBooleanExtra(w.n("OG4DZSd0LmsneWxpMV8zcjptbnImYyV2CHI1ZA==", "mP0Yox9j"), false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        View findViewById = findViewById(R.id.title_bar_iv_back);
        this.f14158s = (TextView) findViewById(R.id.title_bar_tv_title);
        this.f14149j = (TextView) findViewById(R.id.pre_scan_tv_all_files);
        this.f14150k = (TextView) findViewById(R.id.pre_scan_tv_deleted_files);
        this.f14151l = (LottieAnimationView) findViewById(R.id.pre_scan_lottie_anim_loading);
        this.f14152m = (TextView) findViewById(R.id.pre_scan_tv_preparing);
        this.f14153n = (LinearLayout) findViewById(R.id.pre_scan_ll_ad_layout);
        this.f14149j.setOnClickListener(this);
        this.f14150k.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        TextView textView = this.f14158s;
        int i10 = this.f14155p;
        textView.setText(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 8 ? getString(R.string.arg) : getString(R.string.arg) : getString(R.string.arg) : getString(R.string.arg) : getString(R.string.arg));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_common_pre_scan;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
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
        u.f18144a.f18149e.add(this);
    }

    @Override // uf.i
    public final void d0() {
        int i10 = this.f14155p;
        String str = d.f12731a;
        String k10 = d.k(i10, w.n("DlAFZRpjEG4saV1nHXM9b3c=", "jtnzC5h7"));
        if (TextUtils.isEmpty(k10)) {
            return;
        }
        j.G(this, d.i(i10), k10, k10);
    }

    public final void f0() {
        int i10 = this.f14155p;
        String str = d.f12731a;
        String k10 = d.k(i10, w.n("CVBFZRBjL242aQhnClNHYUB0GWMBaVZr", "NkV7CNPM"));
        if (!TextUtils.isEmpty(k10)) {
            j.G(this, d.i(i10), k10, k10);
        }
        d.e(this, k10, i10);
        dg.a.f0(this, w.n("JXInUy5hIG4gbgxfIXRVcjFfVWwAY2s=", "ZF2WEeQN"));
        this.f14149j.setVisibility(View.GONE);
        this.f14150k.setVisibility(View.GONE);
        this.f14151l.setVisibility(View.VISIBLE);
        this.f14151l.g();
        this.f14152m.setVisibility(View.VISIBLE);
        Handler handler = this.f14157r;
        m mVar = new m(this, 7);
        String str2 = f.f12740a;
        int n10 = j.n(this, null, w.n("IXISXzpjEG4dbFxhJmk7Zwp0WG1l", "6WRSXH6g"), 2);
        nh.a.i(w.n("SmM0bj9pWmcZYxJpI2lHeR4gZnIIbFBhFWVYPgg-dCBJcjBfImNVbgdsCWExaV1nbXQvbQggDyA=", "pD9UQ4NA") + n10 + w.n("Uw==", "exW6nkEJ"));
        handler.postDelayed(mVar, ((long) n10) * 1000);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        if (f.x(this)) {
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
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (n.a(view.getId())) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.pre_scan_tv_all_files) {
            int i10 = vg.f.f24200o;
            vg.e.f24199a.f24209i = false;
            f0();
        } else if (id2 == R.id.pre_scan_tv_deleted_files) {
            int i11 = vg.f.f24200o;
            vg.e.f24199a.f24209i = true;
            f0();
        } else if (id2 == R.id.title_bar_iv_back) {
            onBackPressed();
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f.x(this)) {
            te.a.C(3L);
        }
        og.a.r(this);
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        this.f14151l.c();
        super.onDestroy();
        u.f18144a.f18149e.remove(this);
        p.D().r(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f14160u = true;
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f14160u = false;
        if (this.f14154o) {
            this.f14154o = false;
            if (this.f14156q.compareAndSet(false, true)) {
                c.u0(this, this.f14155p, this.f14159t, false);
            }
            if (this.f14159t) {
                finish();
            }
        }
        if (f.A(this)) {
            p.D().h(new h(this, 4));
            p.D().x(this, this.f14153n, R.color.color_100_white_262626, R.color.color_100_white_262626);
        }
    }

    @Override // j.p, androidx.fragment.app.w, android.app.Activity
    public final void onStop() {
        super.onStop();
        AtomicBoolean atomicBoolean = this.f14156q;
        if (atomicBoolean.get()) {
            this.f14149j.setVisibility(View.VISIBLE);
            this.f14150k.setVisibility(View.VISIBLE);
            this.f14151l.f();
            this.f14151l.setVisibility(View.GONE);
            this.f14152m.setVisibility(View.GONE);
            atomicBoolean.set(false);
        }
    }
}
