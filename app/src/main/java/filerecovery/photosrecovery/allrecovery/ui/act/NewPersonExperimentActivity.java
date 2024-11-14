package filerecovery.photosrecovery.allrecovery.ui.act;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.viewpager2.adapter.b;
import androidx.viewpager2.widget.ViewPager2;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import dg.d;
import dg.f;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import gh.o;
import java.util.ArrayList;
import java.util.List;
import kf.k;
import kf.t;
import uf.i;
import xf.v;
import yg.g0;

/* loaded from: classes2.dex */
public class NewPersonExperimentActivity extends i {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f14476u = 0;

    /* renamed from: j, reason: collision with root package name */
    public TextView f14477j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f14478k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14479l;

    /* renamed from: m, reason: collision with root package name */
    public ViewPager2 f14480m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14481n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14482o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f14483p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f14484q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f14485r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f14486s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14487t;

    @Override // uf.i
    public final void V() {
        this.f14482o = (LinearLayout) findViewById(R.id.guideText);
        this.f14487t = (TextView) findViewById(R.id.tv_guide_content);
        this.f14480m = (ViewPager2) findViewById(R.id.new_person_vp2);
        this.f14484q = (ImageView) findViewById(R.id.new_person_iv_01);
        this.f14485r = (ImageView) findViewById(R.id.new_person_iv_02);
        this.f14486s = (ImageView) findViewById(R.id.new_person_iv_03);
        this.f14477j = (TextView) findViewById(R.id.new_person_tv_start);
        this.f14478k = (LinearLayout) findViewById(R.id.new_person_ll_ad_container);
        this.f14477j.setOnClickListener(new g0(this, 1));
        ViewPager2 viewPager2 = this.f14480m;
        ((List) viewPager2.f2201c.f2183b).add(new b(this, 3));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_new_person_experiment;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.colorPrimaryDark);
        eVar.l(R.color.colorPrimaryDark);
        eVar.c();
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        p0 supportFragmentManager = getSupportFragmentManager();
        ArrayList arrayList = this.f14481n;
        arrayList.add((o) og.a.A(supportFragmentManager, o.j0(0), 0));
        arrayList.add((o) og.a.A(supportFragmentManager, o.j0(1), 1));
        arrayList.add((o) og.a.A(supportFragmentManager, o.j0(2), 2));
        this.f14480m.setOffscreenPageLimit(arrayList.size());
        this.f14480m.setAdapter(new t(this, this, 2));
        this.f14480m.b(yh.b.b().f25848r0, false);
        f0(this.f14480m.getCurrentItem());
    }

    @Override // uf.i
    public final void d0() {
        d.E(this, 1);
    }

    public final void f0(int i10) {
        if (i10 == 0) {
            this.f14477j.setText(getString(R.string.arg));
            g0(this.f14484q, true);
            g0(this.f14485r, false);
            g0(this.f14486s, false);
            this.f14478k.setVisibility(View.VISIBLE);
            return;
        }
        if (i10 == 1) {
            this.f14477j.setText(getString(R.string.arg));
            g0(this.f14484q, false);
            g0(this.f14485r, true);
            g0(this.f14486s, false);
            this.f14478k.setVisibility(View.GONE);
            return;
        }
        if (i10 != 2) {
            return;
        }
        this.f14477j.setText(getString(R.string.arg));
        g0(this.f14484q, false);
        g0(this.f14485r, false);
        g0(this.f14486s, true);
        this.f14478k.setVisibility(View.VISIBLE);
    }

    public final void g0(ImageView imageView, boolean z6) {
        imageView.setSelected(z6);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (z6) {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.dp_15);
        } else {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.dp_7);
        }
        imageView.setLayoutParams(layoutParams);
    }

    public final void h0() {
        if (this.f14480m.getCurrentItem() == 0) {
            this.f14487t.setText(getString(R.string.arg));
        } else if (this.f14480m.getCurrentItem() != 2) {
            return;
        } else {
            this.f14487t.setText(getString(R.string.arg));
        }
        this.f14482o.setVisibility(View.VISIBLE);
        this.f14482o.setOnClickListener(new g0(this, 0));
        this.f14482o.setTranslationY(0.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_5);
        if (this.f14483p == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
            this.f14483p = ofFloat;
            ofFloat.addUpdateListener(new k(this, dimensionPixelSize, 3));
            this.f14483p.setDuration(1500L);
            this.f14483p.setRepeatCount(-1);
            this.f14483p.setRepeatMode(2);
        }
        this.f14483p.start();
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        LinearLayout linearLayout = this.f14482o;
        if (linearLayout == null || linearLayout.getVisibility() != View.VISIBLE) {
            super.onBackPressed();
            return;
        }
        LinearLayout linearLayout2 = this.f14482o;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(View.GONE);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (yh.b.b().f25819c0) {
            yh.b.b().f25819c0 = false;
            yh.b.b().d();
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.f14483p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14483p.removeAllUpdateListeners();
        }
        nf.o.D().i(this);
        super.onDestroy();
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (v.a().M) {
            h0();
        }
        if (this.f14479l) {
            h0();
            this.f14479l = false;
        }
        if (f.z(this)) {
            nf.o.D().h(new h(this, 23));
            nf.o D = nf.o.D();
            LinearLayout linearLayout = this.f14478k;
            D.getClass();
            D.w(this, linearLayout, og.a.D());
            if (this.f14480m.getCurrentItem() == 1) {
                this.f14478k.setVisibility(View.GONE);
            }
        }
    }
}
