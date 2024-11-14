package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import c2.v;
import ch.k;
import cj.w;
import ed.g;
import eh.e;
import fg.c;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import filerecovery.photosrecovery.allrecovery.ui.dialog.JunkDeepCleanProgressDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import lg.u;
import lg.z;
import lh.q;
import og.a;
import uf.i;
import vj.d;
import wj.b;
import wj.f;
import xf.l;
import yg.a0;
import yg.b0;
import yg.c0;

/* loaded from: classes2.dex */
public class DeepCleanResultActivity extends i implements z, c {
    public static final String F = w.n("FWUScApsFGEsUlZzN2whQTZ0WHYqdHk=", "0bvwRmev");
    public static List G = new ArrayList();
    public static HashSet H = new HashSet();
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f14420j;

    /* renamed from: l, reason: collision with root package name */
    public TextView f14422l;

    /* renamed from: m, reason: collision with root package name */
    public long f14423m;

    /* renamed from: n, reason: collision with root package name */
    public k f14424n;

    /* renamed from: o, reason: collision with root package name */
    public long f14425o;

    /* renamed from: p, reason: collision with root package name */
    public d f14426p;

    /* renamed from: q, reason: collision with root package name */
    public JunkDeepCleanProgressDialog f14427q;

    /* renamed from: r, reason: collision with root package name */
    public int f14428r;

    /* renamed from: s, reason: collision with root package name */
    public long f14429s;

    /* renamed from: u, reason: collision with root package name */
    public long f14431u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14433w;

    /* renamed from: x, reason: collision with root package name */
    public LinearLayout f14434x;

    /* renamed from: y, reason: collision with root package name */
    public l f14435y;

    /* renamed from: z, reason: collision with root package name */
    public e f14436z;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f14421k = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final Handler f14430t = new Handler();

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f14432v = new HashSet();
    public boolean B = false;

    public static void k0() {
        for (wj.d dVar : G) {
            ArrayList arrayList = dVar.f24781a;
            a.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<phone.cleaner.cache.junk.clean.uibean.SizeSelector>");
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && H.size() != 0) {
                    f fVar = (f) it.next();
                    if (!fVar.a()) {
                        Iterator it2 = H.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).equals(fVar.c())) {
                                it2.remove();
                                it.remove();
                                dVar.f24789i = 0L;
                            }
                        }
                    } else if (fVar.a() && (fVar instanceof b)) {
                        b bVar = (b) fVar;
                        ArrayList arrayList2 = bVar.f24774d;
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            wj.c cVar = (wj.c) it3.next();
                            Iterator it4 = H.iterator();
                            if (H.size() == 0) {
                                break;
                            }
                            while (it4.hasNext()) {
                                if (((String) it4.next()).equals(cVar.f24778a.f22867b)) {
                                    it4.remove();
                                    it3.remove();
                                    dVar.f24789i = 0L;
                                    if (arrayList2.size() == 0) {
                                        it.remove();
                                    }
                                    Iterator it5 = arrayList2.iterator();
                                    long j4 = 0;
                                    while (it5.hasNext()) {
                                        j4 += ((wj.c) it5.next()).f24778a.f22868c;
                                    }
                                    bVar.f24772b = 0;
                                    bVar.f24776f = j4;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // uf.i
    public final void V() {
        this.f14420j = (RecyclerView) findViewById(R.id.rv_content);
        ((TextView) findViewById(R.id.tv_title)).setText(dg.a.q0(getString(R.string.arg)));
        this.f14422l = (TextView) findViewById(R.id.tv_media_delete_count);
        this.f14434x = (LinearLayout) findViewById(R.id.ll_clean_ad_container);
        this.f14425o = mj.i.j();
        findViewById(R.id.iv_back).setOnClickListener(new b0(this, 0));
        this.f14422l.setOnClickListener(new b0(this, 1));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_deep_clean_result;
    }

    @Override // uf.i
    public final void X() {
        super.X();
        h0();
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
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
        this.f14420j.setLayoutManager(new LinearLayoutManager(1));
        if (this.f22857a) {
            return;
        }
        i0(true);
    }

    @Override // fg.c
    public final void a() {
        mf.c.c0(F).Y(this, this.f14434x);
    }

    @Override // fg.c
    public final void b() {
        String str = F;
        mf.c.c0(str).W(new h(this, 19));
        mf.c.c0(str).D(this, this.f14434x);
    }

    @Override // uf.i
    public final void d0() {
        dg.c.I(this, 5);
    }

    public final void f0() {
        if (this.f14432v.size() > 0) {
            int i10 = dg.c.f12730j;
            dg.d.x(this, w.n("MWUncBJBKmQeaAJ0F2xdczFfVWwAY2s=", "dp24FvET"), 5);
        }
        if (!this.f14433w) {
            int i11 = dg.c.f12730j;
            dg.d.x(this, w.n("FWUScBZEFGYjdV90BmU5ZSFlbnM2YyllNnM=", "EbuSRp0J"), 5);
        }
        LinkedHashSet<String> linkedHashSet = vj.a.f24217c;
        if (linkedHashSet.size() > 0) {
            for (String str : linkedHashSet) {
                int i12 = dg.c.f12730j;
                dg.d.y(this, dg.d.i(5), w.n("FWUScBZGGGwnVEpwJ18xZTllRWU=", "HFzraUha"), str);
            }
        }
        int i13 = dg.c.f12730j;
        tg.b.j().P(new e8.a(4));
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        mf.c.c0(F).q(this);
    }

    public final void g0(long j4) {
        this.E = true;
        this.A = true;
        this.f14431u = j4;
        if (this.f14426p == null) {
            this.f14426p = (d) new g((x0) this).o(d.class);
        }
        if (ua.b.c(this.f14427q)) {
            return;
        }
        JunkDeepCleanProgressDialog junkDeepCleanProgressDialog = new JunkDeepCleanProgressDialog(this, this.f14426p, this.f14423m, new v(this, 12));
        this.f14427q = junkDeepCleanProgressDialog;
        ua.b.n(this, junkDeepCleanProgressDialog);
    }

    public final void h0() {
        if (!j0()) {
            g0(0L);
            return;
        }
        Intent intent = new Intent();
        intent.setAction(w.n("FG4ycitpEy43c0hzIW9BYVVlaGEOdFxvCC47THNBGF80UAZfB0E0SEU=", "AHuVDw3M"));
        intent.addCategory(w.n("OW5ccippFC4xbhJlO3QdY1N0I2cCckwuIkU-QWNMVA==", "I7X8Ep47"));
        startActivityForResult(intent, 3710);
    }

    public final void i0(boolean z6) {
        ArrayList arrayList = this.f14421k;
        arrayList.addAll(G);
        k kVar = new k(arrayList, new h.a(this, 28), new c0(this), new b8.c(this));
        this.f14424n = kVar;
        af.c cVar = kVar.f19368c;
        Iterator it = cVar.f329a.iterator();
        while (it.hasNext()) {
            ((wj.d) it.next()).f24783c = true;
        }
        Iterator it2 = cVar.f329a.iterator();
        while (it2.hasNext()) {
            wj.d dVar = (wj.d) it2.next();
            if (!dVar.f24787g) {
                dVar.d();
            } else if (z6) {
                dVar.f24788h = 1;
            } else {
                dVar.f24788h = 0;
            }
        }
        this.f14420j.setAdapter(this.f14424n);
        k kVar2 = this.f14424n;
        af.c cVar2 = kVar2.f19368c;
        ArrayList arrayList2 = cVar2.f329a;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (!((wj.d) arrayList2.get(i10)).h() && ((wj.d) arrayList2.get(i10)).e() > 0) {
                wj.d x10 = kVar2.x(i10);
                boolean h10 = x10.h();
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    qj.a aVar = (qj.a) cVar2.f329a.get(i12);
                    i11 += aVar.h() ? aVar.e() + 1 : 1;
                }
                f0 f0Var = kVar2.f1916a;
                if (h10) {
                    x10.f24782b &= -2;
                    int i13 = i11 + 1;
                    int e10 = x10.e();
                    kVar2.k(i13 - 1);
                    if (e10 > 0) {
                        f0Var.e(i13, e10);
                    }
                } else {
                    x10.f24782b |= 1;
                    int i14 = i11 + 1;
                    int e11 = x10.e();
                    kVar2.k(i14 - 1);
                    if (e11 > 0) {
                        f0Var.d(i14, e11);
                    }
                }
            }
        }
        l0();
    }

    public final boolean j0() {
        wj.d dVar;
        try {
            dVar = (wj.d) this.f14424n.f19368c.f329a.get(1);
        } catch (Exception e10) {
            e10.printStackTrace();
            dVar = null;
        }
        if (dVar != null && dVar.f24787g) {
            if (dVar.f24788h != 0) {
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        Iterator it = this.f14424n.f19368c.f329a.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((wj.d) it.next()).f24789i;
        }
        this.f14423m = j4;
        q.b(w.n("G3UZax9pFHcPb1dlLk00bjRnVHI=", "q07T3Yqx"), w.n("VWQnZT0gLWwsYQUgAGVHdSl0GiAKbBxhPyASbxZhClMceicg", "ov3rQFbf") + this.f14423m);
        m0();
    }

    public final void m0() {
        if (!j0()) {
            this.f14422l.setEnabled(this.f14423m > 0);
            this.f14422l.setText(String.format(getString(R.string.arg), a.G(this.f14423m)));
            return;
        }
        this.f14422l.setEnabled(true);
        String G2 = a.G(this.f14423m);
        this.f14422l.setText(String.format(getString(R.string.arg), w.n("Pg==", "V2AzpiUi") + G2));
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        boolean z6;
        long j4;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 3710) {
            if (i11 == -1) {
                j4 = Math.max(mj.i.j() - this.f14425o, 0L);
                z6 = true;
            } else {
                z6 = false;
                j4 = 0;
            }
            vj.a.f24215a.b(this.f14424n.f19368c.f329a);
            if (z6) {
                this.E = true;
                vj.a.f24217c.add(w.n("BWUacCZyEHJ5", "SijAcpqU"));
                if (vj.a.a() > 0) {
                    g0(j4);
                    return;
                }
                m7.a.e(this).g();
                JunkCleanFinishActivity.h0(this, 5, 1, 0L, j4);
                finish();
                f0();
                this.A = true;
            }
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        e eVar = new e(this, 5, new d6.b(this, 29));
        this.f14436z = eVar;
        ua.b.n(this, eVar);
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        me.a.c(this);
        wd.a.c(this);
        if (hh.c.a(this, 5)) {
            return;
        }
        hg.c.f15614c.f(this);
        if (dg.f.v(this)) {
            te.a.C(3L);
        }
        lg.v vVar = u.f18144a;
        vVar.c();
        vVar.f18150f.add(this);
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        mf.c.c0(F).q(this);
        ua.b.m(this.f14427q);
        ua.b.m(this.f14435y);
        ua.b.m(this.f14436z);
        super.onDestroy();
        hg.c.f15614c.n(this);
        u.f18144a.f18150f.remove(this);
        Handler handler = this.f14430t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.C = true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (G.size() == 0) {
            return;
        }
        this.A = bundle.getBoolean(w.n("OHM0bCxhbg==", "HXSkH6g9"), this.A);
        boolean z6 = bundle.getBoolean(w.n("OHMjZSRwHnIjckpDKmU2azBk", "0UZlGHom"), false);
        if (!this.A) {
            i0(z6);
            return;
        }
        if (H.size() > 0) {
            tg.b.j().P(new xf.f(this, 13));
        }
        this.A = false;
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i10 = 0;
        this.C = false;
        if (this.D) {
            this.f14430t.postDelayed(new a0(this, i10), 500L);
            this.D = false;
        }
        if (dg.f.o(this)) {
            zj.d.f26172b.y(6);
        }
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        d dVar;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(w.n("OHM0bCxhbg==", "HYkR9qlS"), this.A);
        bundle.putBoolean(w.n("HHMWZSBwIXIochJDGmVXayBk", "4eT6yQwz"), j0());
        if (!this.A || (dVar = this.f14426p) == null) {
            return;
        }
        H = dVar.f24232d;
    }
}
