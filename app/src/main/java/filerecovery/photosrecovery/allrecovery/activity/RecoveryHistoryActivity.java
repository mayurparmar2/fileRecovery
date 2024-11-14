package filerecovery.photosrecovery.allrecovery.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import c2.v;
import cj.w;
import com.google.android.material.tabs.TabLayout;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import e2.s;
import fg.l;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import filerecovery.photosrecovery.allrecovery.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jg.c;
import jg.d;
import jg.f;
import kf.t;
import lg.d0;
import lg.e0;
import lg.f0;
import lg.u;
import lh.p;
import ra.g;
import ra.j;
import ra.k;
import ra.m;
import ra.n;
import uf.i;
import yh.b;

/* loaded from: classes2.dex */
public class RecoveryHistoryActivity extends i implements View.OnClickListener, f0, d0, e0, l {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f14208w = 0;

    /* renamed from: k, reason: collision with root package name */
    public ViewPager2 f14210k;

    /* renamed from: l, reason: collision with root package name */
    public TabLayout f14211l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f14212m;

    /* renamed from: p, reason: collision with root package name */
    public int f14215p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f14216q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14217r;

    /* renamed from: s, reason: collision with root package name */
    public n f14218s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f14219t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f14220u;

    /* renamed from: j, reason: collision with root package name */
    public final String f14209j = w.n("amUrbyNlGHkQaRV0OnJKQVF0L3YEdHk=", "2N8HUj1t");

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14213n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f14214o = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public int f14221v = -1;

    @Override // uf.i
    public final void V() {
        this.f14212m = (ImageView) findViewById(R.id.layout_history_iv_back);
        this.f14210k = (ViewPager2) findViewById(R.id.layout_history_viewpager);
        this.f14211l = (TabLayout) findViewById(R.id.layout_history_tab_layout);
        this.f14216q = (LinearLayout) findViewById(R.id.layout_global_banner_ad);
        this.f14219t = (ImageView) findViewById(R.id.iv_media_delete);
        this.f14220u = (ImageView) findViewById(R.id.iv_media_share);
        this.f14219t.setEnabled(false);
        this.f14220u.setEnabled(false);
        this.f14219t.setOnClickListener(this);
        this.f14220u.setOnClickListener(this);
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_recovery_history;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
            eVar.e();
        }
        eVar.n(R.id.top_view);
        eVar.h(R.color.colorPrimaryDark);
        eVar.f12030k.f11991f = true;
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        this.f14213n.addAll(Arrays.asList(getResources().getStringArray(R.array.arg)));
        int i10 = 0;
        int intExtra = getIntent().getIntExtra(w.n("E2kuZRJ0N3Bl", "NAb2sPjP"), 0);
        this.f14215p = intExtra;
        if (intExtra == 0) {
            this.f14215p = b.b().U;
        }
        this.f14212m.setOnClickListener(this);
        ArrayList arrayList = this.f14214o;
        arrayList.add(f0(new jg.e(), 0));
        int i11 = 1;
        arrayList.add(f0(new f(), 1));
        int i12 = 2;
        arrayList.add(f0(new c(), 2));
        arrayList.add(f0(new d(), 3));
        this.f14210k.setOffscreenPageLimit(arrayList.size());
        this.f14210k.setAdapter(new t(this, this, i10));
        TabLayout tabLayout = this.f14211l;
        ViewPager2 viewPager2 = this.f14210k;
        n nVar = new n(tabLayout, viewPager2, new w5.a(this, 25));
        this.f14218s = nVar;
        if (nVar.f20619e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        androidx.recyclerview.widget.e0 adapter = viewPager2.getAdapter();
        nVar.f20618d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        nVar.f20619e = true;
        ra.l lVar = new ra.l(tabLayout);
        nVar.f20620f = lVar;
        ((List) viewPager2.f2201c.f2183b).add(lVar);
        m mVar = new m(viewPager2, true);
        nVar.f20621g = mVar;
        tabLayout.a(mVar);
        x0 x0Var = new x0(nVar, i12);
        nVar.f20622h = x0Var;
        nVar.f20618d.v(x0Var);
        nVar.a();
        tabLayout.m(viewPager2.getCurrentItem(), 0.0f, true, true);
        this.f14211l.setSelectedTabIndicatorGravity(0);
        this.f14211l.a(new k(this, i11));
        g g10 = this.f14211l.g(0);
        g g11 = this.f14211l.g(1);
        g g12 = this.f14211l.g(2);
        g g13 = this.f14211l.g(3);
        h0(g10, true);
        h0(g11, false);
        h0(g12, false);
        h0(g13, false);
        int i13 = this.f14221v;
        if (i13 >= 0) {
            this.f14210k.b(i13, false);
        } else if (this.f22857a) {
            this.f14210k.post(new androidx.activity.b(this, 26));
        } else {
            g0();
        }
    }

    @Override // fg.l
    public final void a() {
        mf.c.c0(this.f14209j).Y(this, this.f14216q);
    }

    @Override // fg.l
    public final void b() {
        String str = this.f14209j;
        mf.c.c0(str).W(new h(this, 8));
        mf.c.c0(str).D(this, this.f14216q);
    }

    public final jg.b f0(jg.b bVar, int i10) {
        jg.b bVar2 = (jg.b) getSupportFragmentManager().D(s.k("Zg==", "3VA8ksyG", new StringBuilder(), i10));
        return bVar2 == null ? bVar : bVar2;
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f14215p != 0) {
            setResult(502);
        }
        super.finish();
        mf.c.c0(this.f14209j).q(this);
    }

    public final void g0() {
        int i10 = this.f14215p;
        if (i10 == 1) {
            this.f14217r = true;
            this.f14210k.b(1, false);
        } else if (i10 == 3) {
            this.f14217r = true;
            this.f14210k.b(2, false);
        } else if (i10 == 8) {
            this.f14217r = true;
            this.f14210k.b(3, false);
        }
    }

    public final void h0(g gVar, boolean z6) {
        if (gVar == null) {
            return;
        }
        if (gVar.f20587e == null) {
            View inflate = View.inflate(this, R.layout.layout_recovered_files_tab, null);
            ((TextView) inflate.findViewById(R.id.tab_tv_title)).setText(gVar.f20584b);
            gVar.f20587e = inflate;
            j jVar = gVar.f20589g;
            if (jVar != null) {
                jVar.e();
            }
        }
        View view = gVar.f20587e;
        TextView textView = (TextView) view.findViewById(R.id.tab_tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.tab_tv_count);
        textView.setSelected(z6);
        textView2.setSelected(z6);
        og.a.A0(textView, z6);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        sj.f.m();
        if (og.a.d0(this)) {
            return;
        }
        if (dg.f.b(this, w.n("E3UpbBZSVGM3dgNyMGQTRltsI3M=", "LiuEI1H3"), w.n("GnAnbhJmO2wlXxllEW9CZTdlUl8PaRVlcw==", "MYBJpvlx"), b.b().J)) {
            gg.a.f15028c.getClass();
            Activity a10 = filerecovery.photosrecovery.allrecovery.b.a();
            if (a10 != null) {
                rf.g c10 = rf.g.c();
                c10.f20639c.f20633h = true;
                if (c10.a()) {
                    c10.g(a10);
                }
            }
            rf.g.c().f20639c.f20632g = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (lh.n.a(view.getId())) {
            return;
        }
        if (view.getId() == R.id.layout_history_iv_back) {
            onBackPressed();
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f14214o;
        if (id2 == R.id.iv_media_delete) {
            jg.b bVar = (jg.b) arrayList.get(this.f14210k.getCurrentItem());
            bVar.u0();
            dg.d.u(bVar.r());
            bVar.B0 = tg.b.v(bVar.c(), bVar.r0(), bVar);
            return;
        }
        if (view.getId() == R.id.iv_media_share) {
            jg.b bVar2 = (jg.b) arrayList.get(this.f14210k.getCurrentItem());
            if (bVar2.f16855v0 == null) {
                return;
            }
            Context r10 = bVar2.r();
            String str = dg.d.f12731a;
            String n10 = w.n("A2UUbz9lA2UmX2BoI3IwXzZsWGNr", "EMl2sWZS");
            if (!TextUtils.isEmpty(n10)) {
                j3.j.G(r10, dg.d.f12733c, n10, n10);
            }
            ArrayList arrayList2 = bVar2.f16855v0.f21976g;
            androidx.fragment.app.w c10 = bVar2.c();
            int r02 = bVar2.r0();
            if (arrayList2 != null && arrayList2.size() > 0) {
                if (arrayList2.size() == 1) {
                    og.a.B0(c10, r02, (wf.i) arrayList2.get(0));
                } else {
                    new p(c10, new v(c10, r02)).execute(arrayList2);
                }
            }
            m7.a.e(bVar2.c()).g();
            AppOpenManager.f14239d = false;
            sj.f.P();
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        if (bundle != null) {
            this.f14221v = bundle.getInt(w.n("GWExdBJzK2wsYx9fG25QZXg=", "epGVplyc"), -1);
        }
        super.onCreate(bundle);
        try {
            String substring = ld.a.b(this).substring(923, 954);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "afd2a094ea0d0e11ecb7093c71eb7c8".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            if (System.currentTimeMillis() % 2 == 0) {
                int c11 = ld.a.f18061a.c(bytes.length / 2);
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
                    ld.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                ld.a.a();
                throw null;
            }
            wd.a.c(this);
            if (!og.a.T(this)) {
                try {
                    startActivity(new Intent(this, (Class<?>) MainActivity.class));
                } catch (Exception unused) {
                }
                finish();
                return;
            }
            hg.h.f15619c.f(this);
            String str = dg.f.f12740a;
            if (dg.f.b(this, w.n("E3UpbBZSVGM3dgNyMGQTRltsI3M=", "LiuEI1H3"), w.n("GnAnbhJmO2wlXxllEW9CZTdlUl8PaRVlcw==", "MYBJpvlx"), b.b().J)) {
                te.a.C(3L);
            }
            lg.v vVar = u.f18144a;
            vVar.f18146b.add(this);
            vVar.f18147c.add(this);
            vVar.f18149e.add(this);
        } catch (Exception e10) {
            e10.printStackTrace();
            ld.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        n nVar = this.f14218s;
        if (nVar != null) {
            androidx.recyclerview.widget.e0 e0Var = nVar.f20618d;
            if (e0Var != null) {
                e0Var.w(nVar.f20622h);
                nVar.f20622h = null;
            }
            nVar.f20615a.H.remove(nVar.f20621g);
            ((List) nVar.f20616b.f2201c.f2183b).remove(nVar.f20620f);
            nVar.f20621g = null;
            nVar.f20620f = null;
            nVar.f20618d = null;
            nVar.f20619e = false;
        }
        mf.c.c0(this.f14209j).q(this);
        super.onDestroy();
        hg.h.f15619c.n(this);
        lg.v vVar = u.f18144a;
        vVar.f18146b.remove(this);
        vVar.f18149e.remove(this);
        vVar.f18147c.remove(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("KmEmbhByNnI9Ywl2MHJKIEFhMGVNZFp3CCALd190KWg=", "hVHHuiib"), w.n("PnASbhZiEG4sZUFfMGU2byNlQ3kccyt2Vl8Obydu", "3jPHHv30"), b.b().f25851t)) {
            zj.d.f26172b.y(2);
        }
        if (dg.f.t(this)) {
            te.a.C(5L);
        }
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(w.n("GWExdBJzK2wsYx9fG25QZXg=", "IfpuIIGh"), this.f14210k.getCurrentItem());
    }
}
