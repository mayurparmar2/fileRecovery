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
import com.gyf.immersionbar.e;
import dg.f;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import gh.o;
import j.d;
import java.util.ArrayList;
import java.util.List;
import kf.k;
import kf.t;
import og.a;
import uf.i;
import yg.e0;

/* loaded from: classes2.dex */
public class NewPersonActivity extends i {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f14464u = 0;

    /* renamed from: j, reason: collision with root package name */
    public TextView f14465j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f14466k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14467l;

    /* renamed from: m, reason: collision with root package name */
    public ViewPager2 f14468m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14469n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14470o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f14471p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f14472q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f14473r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f14474s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14475t;

    @Override // uf.i
    public final void V() {
        this.f14470o = (LinearLayout) findViewById(R.id.guideText);
        this.f14475t = (TextView) findViewById(R.id.tv_skip);
        this.f14468m = (ViewPager2) findViewById(R.id.new_person_vp2);
        this.f14472q = (ImageView) findViewById(R.id.new_person_iv_01);
        this.f14473r = (ImageView) findViewById(R.id.new_person_iv_02);
        this.f14474s = (ImageView) findViewById(R.id.new_person_iv_03);
        this.f14465j = (TextView) findViewById(R.id.new_person_tv_start);
        this.f14466k = (LinearLayout) findViewById(R.id.new_person_ll_ad_container);
        this.f14465j.setOnClickListener(new e0(this, 0));
        this.f14475t.setOnClickListener(new d(this, 18));
        ViewPager2 viewPager2 = this.f14468m;
        ((List) viewPager2.f2201c.f2183b).add(new b(this, 2));
    }

    @Override // uf.i
    public final int W() {
        return a.Z(this) ? R.layout.activity_new_person_long : R.layout.activity_new_person;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
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
        ArrayList arrayList = this.f14469n;
        arrayList.add((o) a.A(supportFragmentManager, o.j0(0), 0));
        arrayList.add((o) a.A(supportFragmentManager, o.j0(1), 1));
        arrayList.add((o) a.A(supportFragmentManager, o.j0(2), 2));
        this.f14468m.setOffscreenPageLimit(arrayList.size());
        this.f14468m.setAdapter(new t(this, this, 1));
        this.f14468m.b(yh.b.b().f25848r0, false);
        g0(this.f14468m.getCurrentItem());
    }

    @Override // uf.i
    public final void d0() {
        dg.d.E(this, 1);
    }

    public final void f0() {
        if (a.W() || !yh.b.b().f25850s0) {
            this.f14465j.setVisibility(View.VISIBLE);
            this.f14475t.setVisibility(View.GONE);
        } else {
            this.f14475t.setVisibility(View.VISIBLE);
            this.f14465j.setVisibility(View.INVISIBLE);
        }
    }

    public final void g0(int i10) {
        if (i10 == 0) {
            f0();
            h0(this.f14472q, true);
            h0(this.f14473r, false);
            h0(this.f14474s, false);
            if (a.W() || !yh.b.b().f25850s0) {
                return;
            }
            this.f14475t.setVisibility(View.VISIBLE);
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f14465j.setVisibility(View.VISIBLE);
            h0(this.f14472q, false);
            h0(this.f14473r, false);
            h0(this.f14474s, true);
            this.f14475t.setVisibility(View.GONE);
            return;
        }
        f0();
        h0(this.f14472q, false);
        h0(this.f14473r, true);
        h0(this.f14474s, false);
        if (a.W() || !yh.b.b().f25850s0) {
            return;
        }
        this.f14475t.setVisibility(View.VISIBLE);
    }

    public final void h0(ImageView imageView, boolean z6) {
        imageView.setSelected(z6);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (z6) {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.dp_15);
        } else {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.dp_7);
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        LinearLayout linearLayout = this.f14470o;
        if (linearLayout == null || linearLayout.getVisibility() != View.VISIBLE) {
            super.onBackPressed();
            return;
        }
        LinearLayout linearLayout2 = this.f14470o;
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
        ValueAnimator valueAnimator = this.f14471p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14471p.removeAllUpdateListeners();
        }
        mf.e.f18528a.q(this);
        super.onDestroy();
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i10 = 1;
        if (this.f14467l) {
            this.f14470o.setVisibility(View.VISIBLE);
            this.f14470o.setOnClickListener(new e0(this, i10));
            this.f14470o.setTranslationY(0.0f);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_5);
            if (this.f14471p == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
                this.f14471p = ofFloat;
                ofFloat.addUpdateListener(new k(this, dimensionPixelSize, 2));
                this.f14471p.setDuration(1500L);
                this.f14471p.setRepeatCount(-1);
                this.f14471p.setRepeatMode(2);
            }
            this.f14471p.start();
            this.f14467l = false;
        }
        if (this.f14468m.getCurrentItem() == 0 || this.f14468m.getCurrentItem() == 1) {
            f0();
        }
        if (f.z(this)) {
            mf.b bVar = mf.e.f18528a;
            bVar.W(new h(this, 22));
            bVar.D(this, this.f14466k);
        }
    }
}
