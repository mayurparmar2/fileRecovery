package filerecovery.photosrecovery.allrecovery;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import cj.w;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a extends uf.i {

    /* renamed from: k, reason: collision with root package name */
    public boolean f14118k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f14119l;

    /* renamed from: m, reason: collision with root package name */
    public LottieAnimationView f14120m;

    /* renamed from: o, reason: collision with root package name */
    public ProgressBar f14122o;

    /* renamed from: q, reason: collision with root package name */
    public long f14124q;

    /* renamed from: r, reason: collision with root package name */
    public long f14125r;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14117j = false;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f14121n = new Handler();

    /* renamed from: p, reason: collision with root package name */
    public int f14123p = 0;

    /* renamed from: s, reason: collision with root package name */
    public final y9.m f14126s = new y9.m(this, 5);

    /* renamed from: t, reason: collision with root package name */
    public final List f14127t = Arrays.asList(x5.b.a().getResources().getStringArray(R.array.arg));

    static {
        w.n("EGIEUzlsEHMqTFxhJmk7ZxRjRWk1aT55", "anrqwSfP");
    }

    @Override // uf.i
    public void V() {
        this.f14119l = (LinearLayout) findViewById(R.id.layout_splash_bottom);
        this.f14120m = (LottieAnimationView) findViewById(R.id.splash_lottie_loading);
        this.f14122o = (ProgressBar) findViewById(R.id.layout_splash_progress);
    }

    @Override // uf.i
    public final int W() {
        lh.q.b(w.n("CE1U", "mh0uTPwA"), w.n("NHAuYTVoBz5mPlhnMHR_YUtvM3QkZB0p", "BZGBF9hT"));
        return R.layout.activity_splash;
    }

    @Override // uf.i
    public void Z() {
        f0();
        this.f14124q = System.currentTimeMillis();
    }

    @Override // uf.i
    public void c0(com.gyf.immersionbar.e eVar) {
    }

    public void f0() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y9.m mVar = this.f14126s;
        if (mVar != null) {
            this.f14121n.removeCallbacks(mVar);
        }
        ((sf.d) sf.e.r().f21162c).f21156g = null;
    }

    public abstract void g0();

    public abstract long h0();

    public abstract boolean i0();

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                getWindow().setAttributes(attributes);
            } else {
                getWindow().addFlags(67109888);
            }
            getWindow().getDecorView().setSystemUiVisibility(4102);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (i0()) {
            this.f14118k = true;
        }
        super.onCreate(bundle);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f14117j = true;
        if (i0()) {
            this.f14118k = true;
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f14117j = false;
    }

    @Override // uf.i, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        if (!i0()) {
            super.onWindowFocusChanged(z6);
            return;
        }
        super.onWindowFocusChanged(z6);
        Handler handler = this.f14121n;
        y9.m mVar = this.f14126s;
        if (!z6) {
            handler.removeCallbacks(mVar);
        } else {
            handler.removeCallbacks(mVar);
            handler.postDelayed(mVar, h0());
        }
    }
}
