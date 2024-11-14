package filerecovery.photosrecovery.allrecovery.activity;

import android.content.Intent;
import android.os.Build;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cj.w;
import com.gyf.immersionbar.OSUtils;
import com.gyf.immersionbar.b;
import com.gyf.immersionbar.e;
import dg.f;
import fg.h;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import kf.a;
import of.d;
import tf.i;

/* loaded from: classes2.dex */
public class LanguageSettingActivity extends a implements h {

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14168m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f14169n;

    @Override // kf.a, uf.i
    public final void V() {
        super.V();
        d.b().f19310g = true;
        this.f14168m = (LinearLayout) findViewById(R.id.layout_language_ad_container);
        this.f14169n = (LinearLayout) findViewById(R.id.layout_language_banner_ad);
        gg.d.f15031c.f(this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_back);
        imageView.setVisibility(View.VISIBLE);
        imageView.setOnClickListener(new j.d(this, 9));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_language;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        setTheme(R.style.AppTheme);
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.mainColorPrimary);
        eVar.l(R.color.mainColorPrimary);
        eVar.c();
        boolean z6 = true;
        eVar.m(!this.f22860d);
        eVar.f12030k.f11994i = true;
        if (!OSUtils.isMIUI6Later() && Build.VERSION.SDK_INT < 26) {
            z6 = false;
        }
        if (z6) {
            b bVar = eVar.f12030k;
            bVar.getClass();
            bVar.f11990e = 0.0f;
        } else {
            eVar.f12030k.f11990e = 0.2f;
        }
        eVar.f();
    }

    @Override // fg.h
    public final void c() {
        d.b().f(this, this.f14168m, this.f14169n, R.color.color_100_white_181818, R.color.color_100_D6E1F6_373737);
    }

    @Override // kf.a
    public final i g0() {
        return new i(this, 1);
    }

    @Override // kf.a
    public final void h0() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra(w.n("JHATYT1lLmwjblR1I2dl", "KxiwuXC0"), true);
        startActivity(intent);
        finish();
    }

    @Override // fg.h
    public final void l() {
        d.b().f19306c = new filerecovery.photosrecovery.allrecovery.h(this, 6);
        d b10 = d.b();
        LinearLayout linearLayout = this.f14168m;
        LinearLayout linearLayout2 = this.f14169n;
        b10.getClass();
        if (ff.a.f14050a.j()) {
            b10.a(this);
            return;
        }
        b10.f19312i = this;
        b10.g(this, linearLayout, linearLayout2);
        if (b10.f19305b) {
            return;
        }
        if (b10.f(this, linearLayout, linearLayout2, R.color.color_100_white_181818, R.color.color_100_D6E1F6_373737)) {
            b10.h();
        } else {
            b10.d(this);
            b10.e(this);
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        gg.d.f15031c.n(this);
        d.b().a(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (com.bumptech.glide.d.q(this)) {
            this.f14168m.setVisibility(View.GONE);
            return;
        }
        String str = f.f12740a;
        if (!f.b(this, w.n("F2klIC5hPGQWbApuFXVVZyAgUm8ebg==", "QF2sX4tc"), w.n("PnASbhZOMl8uYV1nN2EyZQpkXndu", "BsF6T0wF"), yh.b.b().f25860z)) {
            this.f14168m.setVisibility(View.GONE);
        } else if (ff.a.f14050a.j()) {
            this.f14168m.setVisibility(View.GONE);
            d.b().a(this);
        } else {
            this.f14168m.setVisibility(View.VISIBLE);
            gg.d.f15031c.l();
        }
    }
}
