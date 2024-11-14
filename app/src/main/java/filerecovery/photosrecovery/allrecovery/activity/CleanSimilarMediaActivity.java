package filerecovery.photosrecovery.allrecovery.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.l;
import c2.v;
import cj.w;
import com.android.lib.libbase.zjview.CustomRoundImageView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import fg.b;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import filerecovery.photosrecovery.allrecovery.ui.act.JunkCleanFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.dialog.JunkDuplicateCleanProgressDialog;
import filerecovery.photosrecovery.allrecovery.ui.widget.RecyclerViewFastScroller;
import filerecovery.photosrecovery.allrecovery.ui.widget.SmartRecyclerView;
import filerecovery.photosrecovery.allrecovery.view.CustomGridLayoutManager;
import filerecovery.photosrecovery.allrecovery.view.percolator.FilePercolator;
import j.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kf.f;
import kf.g;
import lg.x;
import lh.j;
import lh.n;
import lh.q;
import lh.u;
import mf.c;
import rh.d;
import rh.e;
import tf.a0;
import tf.z;
import u1.a;
import uf.i;
import v9.i0;

/* loaded from: classes2.dex */
public class CleanSimilarMediaActivity extends i implements View.OnClickListener, z, x, d, lg.z, b {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f14128w0 = 0;
    public View C;
    public long D;
    public boolean F;
    public FilePercolator H;
    public TextView I;
    public TextView J;
    public LinearLayout L;
    public LinearLayout M;
    public boolean N;
    public boolean O;
    public RelativeLayout P;
    public e Q;
    public LinearLayout R;
    public LinearLayout S;
    public m T;
    public JunkDuplicateCleanProgressDialog U;
    public CustomRoundImageView V;
    public float X;

    /* renamed from: m, reason: collision with root package name */
    public long f14132m;

    /* renamed from: n, reason: collision with root package name */
    public long f14133n;

    /* renamed from: o, reason: collision with root package name */
    public SmartRecyclerView f14134o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerViewFastScroller f14135p;

    /* renamed from: q, reason: collision with root package name */
    public a0 f14136q;

    /* renamed from: r, reason: collision with root package name */
    public CustomGridLayoutManager f14137r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f14138s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14139t;

    /* renamed from: t0, reason: collision with root package name */
    public int f14140t0;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f14141u;

    /* renamed from: u0, reason: collision with root package name */
    public long f14142u0;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f14143v;

    /* renamed from: v0, reason: collision with root package name */
    public long f14144v0;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f14145w;

    /* renamed from: x, reason: collision with root package name */
    public SwitchCompat f14146x;

    /* renamed from: j, reason: collision with root package name */
    public final String f14129j = w.n("EmwSYSdTGG0rbFJyD2UxaTRBUnQqdiN0eQ==", "zLwu3wCS");

    /* renamed from: k, reason: collision with root package name */
    public int f14130k = TTAdConstant.MATE_VALID;

    /* renamed from: l, reason: collision with root package name */
    public int f14131l = 1;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f14147y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final u f14148z = new u();
    public final u A = new u();
    public final HashMap B = new HashMap();
    public int E = 3;
    public final HashMap G = new HashMap();
    public final a K = new a(this, 5);
    public boolean W = true;
    public final TreeMap Y = new TreeMap(new kf.e(1));
    public boolean Z = false;

    public static void f0(CleanSimilarMediaActivity cleanSimilarMediaActivity) {
        JunkCleanFinishActivity.g0(cleanSimilarMediaActivity, 4, cleanSimilarMediaActivity.f14140t0, cleanSimilarMediaActivity.f14142u0);
        cleanSimilarMediaActivity.f14140t0 = 0;
        cleanSimilarMediaActivity.f14142u0 = 0L;
        cleanSimilarMediaActivity.K.postDelayed(new kf.d(cleanSimilarMediaActivity, 1), 500L);
        if (cleanSimilarMediaActivity.j0()) {
            cleanSimilarMediaActivity.finish();
        }
    }

    public static void g0(CleanSimilarMediaActivity cleanSimilarMediaActivity, int i10) {
        cleanSimilarMediaActivity.E = i10;
        dg.d.f(cleanSimilarMediaActivity, 4, i10);
        cleanSimilarMediaActivity.f14137r.s1(i10);
        a0 a0Var = cleanSimilarMediaActivity.f14136q;
        a0Var.f21968k = i10;
        a0Var.f1916a.c(0, cleanSimilarMediaActivity.f14147y.size(), null);
        yh.b.b().Y = i10;
        yh.b.b().d();
    }

    public static void h0(CleanSimilarMediaActivity cleanSimilarMediaActivity, RelativeLayout relativeLayout) {
        cleanSimilarMediaActivity.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, -relativeLayout.getHeight(), 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
    }

    @Override // rh.d
    public final void J(int i10, long j4) {
        if (i10 == 1) {
            this.f14144v0 = j4;
            e eVar = this.Q;
            long j10 = this.f14133n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            eVar.k(2, j10, this.f14144v0);
            return;
        }
        if (this.f14130k != 204 || this.f14132m != this.f14144v0 || this.f14133n != j4) {
            k0();
        }
        long j11 = this.f14144v0;
        if (j11 != 0) {
            this.f14132m = j11;
        }
        this.f14133n = j4;
        dg.d.m(this, 4, 5);
        this.I.setText(R.string.arg);
        q.b(w.n("FnUxdCJtJ3pl", "NuYvMnwk"), w.n("fC1aLWQtXC18IFB1MXQ6bTx6VFM3YTh0P2kGZTo=", "kku0svEc") + rh.a.e(this.f14132m) + w.n("e2MQcxtvFWkiZSNuMVRabVc6", "jqWeoxxs") + rh.a.e(this.f14133n));
        if (this.f14130k != 204) {
            k0();
            this.f14130k = 204;
        }
        r0(true);
        n0(500L, false);
    }

    @Override // rh.d
    public final void M(int i10) {
        if (i10 == 2) {
            this.f14144v0 = 0L;
        }
    }

    @Override // uf.i
    public final void V() {
        this.V = (CustomRoundImageView) findViewById(R.id.iv_title_bar_flg);
        this.I = (TextView) findViewById(R.id.tv_filter_date);
        this.J = (TextView) findViewById(R.id.tv_filter_size);
        this.H = (FilePercolator) findViewById(R.id.file_percolator);
        this.L = (LinearLayout) findViewById(R.id.lly_loading);
        this.f14134o = (SmartRecyclerView) findViewById(R.id.layout_similar_media_recyclerview);
        this.f14135p = (RecyclerViewFastScroller) findViewById(R.id.layout_fast_scroller);
        this.P = (RelativeLayout) findViewById(R.id.layout_media_list_rv_tips);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_similar_media_select_date);
        this.R = linearLayout;
        linearLayout.setOnClickListener(this);
        findViewById(R.id.layout_similar_media_iv_back).setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_similar_media_select_size);
        this.S = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.layout_media_select_layout);
        this.f14138s = linearLayout3;
        linearLayout3.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tv_media_delete_count);
        this.f14139t = textView;
        textView.setOnClickListener(this);
        this.f14139t.setText(getString(R.string.arg, og.a.G(0L)));
        this.f14139t.setEnabled(false);
        this.f14141u = (ImageView) findViewById(R.id.layout_similar_media_iv_date);
        this.f14143v = (ImageView) findViewById(R.id.layout_similar_media_iv_size);
        this.f14145w = (ImageView) findViewById(R.id.layout_media_iv_layout);
        this.f14146x = (SwitchCompat) findViewById(R.id.layout_similar_media_switch_smart_choice);
        this.M = (LinearLayout) findViewById(R.id.layout_media_list_ad);
        this.f14146x.setOnClickListener(this);
        this.f14146x.setOnCheckedChangeListener(null);
        this.f14146x.setChecked(true);
        this.f14146x.setOnCheckedChangeListener(new kf.b(this, 0));
        this.C = findViewById(R.id.layout_empty);
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_similar_media_list_view;
    }

    @Override // uf.i
    public final void X() {
        super.X();
        tg.b.v(this, 4, new com.facebook.ads.a(this));
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
        int i10 = yh.b.b().Y;
        this.E = i10;
        dg.d.f(this, 4, i10);
        CustomGridLayoutManager customGridLayoutManager = new CustomGridLayoutManager(this.E);
        this.f14137r = customGridLayoutManager;
        customGridLayoutManager.L = new f(this, 0);
        this.f14134o.setLayoutManager(this.f14137r);
        a0 a0Var = new a0(this, this.f14137r, this);
        this.f14136q = a0Var;
        a0Var.f21962e = this.f14148z;
        a0Var.j();
        a0 a0Var2 = this.f14136q;
        a0Var2.f21965h = this.B;
        this.f14134o.setAdapter(a0Var2);
        this.f14134o.setItemAnimator(new kh.b());
        this.f14134o.setupZoomListener(new d6.b(this, 22));
        this.f14135p.setHandleStateListener(new g(this));
        this.f14134o.h(new l(this, 1));
        e eVar = new e(this, this, rh.a.g(w.n("RDlyMGAwfy15MQ==", "d6xEimdy")), System.currentTimeMillis());
        this.Q = eVar;
        eVar.h();
        this.Q.g();
        this.Q.i();
        this.Q.getClass();
        if (this.f22857a) {
            return;
        }
        r0(true);
        n0(0L, true);
    }

    @Override // fg.b
    public final void a() {
        c.c0(this.f14129j).Y(this, this.M);
    }

    @Override // fg.b
    public final void b() {
        String str = this.f14129j;
        c.c0(str).W(new h(this, 3));
        c.c0(str).D(this, this.M);
    }

    @Override // uf.i
    public final void d0() {
        dg.d.v(this, 4);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        c.c0(this.f14129j).q(this);
    }

    public final void i0() {
        this.P.setVisibility(this.f14147y.size() > 0 ? 0 : 8);
        this.D = 0L;
        u uVar = this.f14148z;
        Iterator<E> it = uVar.iterator();
        while (it.hasNext()) {
            wf.i iVar = (wf.i) it.next();
            if (!iVar.f24714i) {
                this.D += iVar.f24709d;
            }
        }
        this.f14139t.setEnabled(!uVar.isEmpty());
        if (uVar.isEmpty()) {
            this.f14139t.setText(String.format(getString(R.string.arg), og.a.G(0L)));
        } else {
            this.f14139t.setText(String.format(getString(R.string.arg), og.a.G(this.D)));
        }
    }

    @Override // lg.x
    public final void j(int i10, int i11) {
        if (i11 != 4 || i10 == 10) {
            return;
        }
        if (j0()) {
            finish();
        } else {
            runOnUiThread(new kf.d(this, 0));
        }
    }

    public final boolean j0() {
        ArrayList arrayList;
        HashMap hashMap = this.G;
        if (hashMap.isEmpty()) {
            return true;
        }
        for (String str : hashMap.keySet()) {
            if (!TextUtils.isEmpty(str) && (arrayList = (ArrayList) hashMap.get(str)) != null && arrayList.size() > 1) {
                return false;
            }
        }
        return true;
    }

    @Override // lg.x
    public final void k(wf.i iVar, int i10, int i11) {
        if (iVar == null || i11 != 4 || i10 == 10) {
            return;
        }
        l0(iVar);
        m0();
    }

    public final void k0() {
        this.f14146x.setOnCheckedChangeListener(null);
        this.f14146x.setChecked(false);
        this.f14146x.setOnCheckedChangeListener(new ha.e(this, 1));
    }

    public final void l0(wf.i iVar) {
        if (iVar == null) {
            return;
        }
        this.f14148z.remove(iVar);
        Iterator it = this.B.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
            if (arrayList != null) {
                arrayList.remove(iVar);
            }
        }
        ArrayList arrayList2 = (ArrayList) this.G.get(iVar.f24716k);
        if (arrayList2 != null) {
            arrayList2.remove(iVar);
        }
    }

    public final void m0() {
        ArrayList arrayList = this.f14147y;
        arrayList.clear();
        HashMap hashMap = this.B;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new kf.e(0));
        Iterator it = arrayList2.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            wf.i iVar = (wf.i) it.next();
            ArrayList arrayList3 = (ArrayList) hashMap.get(iVar);
            if (arrayList3 == null || arrayList3.isEmpty()) {
                hashMap.remove(iVar);
            } else if (arrayList3.size() < 2) {
                hashMap.remove(iVar);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    this.f14148z.remove((wf.i) it2.next());
                }
            } else {
                long j4 = ((wf.i) arrayList3.get(0)).f24710e;
                int i11 = i10 + 1;
                iVar.f24715j = i10;
                iVar.A = j4;
                iVar.f24710e = j4;
                arrayList.add(iVar);
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    ((wf.i) arrayList3.get(i12)).f24724s = i12 == 0;
                    ((wf.i) arrayList3.get(i12)).f24715j = i11;
                    ((wf.i) arrayList3.get(i12)).A = j4;
                    i12++;
                }
                arrayList.addAll(arrayList3);
                i10 = i11;
            }
        }
        this.f14136q.f21965h = hashMap;
    }

    public final void n0(long j4, boolean z6) {
        tg.b.j().P(new kf.h(j4, this, z6));
    }

    public final void o0(wf.i iVar, boolean z6) {
        u uVar = this.f14148z;
        if (!z6) {
            uVar.remove(iVar);
        } else {
            if (!this.A.contains(iVar) || uVar.contains(iVar)) {
                return;
            }
            uVar.add(iVar);
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        JunkDuplicateCleanProgressDialog junkDuplicateCleanProgressDialog = this.U;
        if (junkDuplicateCleanProgressDialog != null && junkDuplicateCleanProgressDialog.isShowing()) {
            return;
        }
        if (!j0()) {
            this.T = nh.b.p(this, 11, new w5.a(this, 24));
            return;
        }
        if (j.f18194a.a(this) && dg.f.p(this)) {
            gg.a.f15028c.getClass();
            Activity a10 = filerecovery.photosrecovery.allrecovery.b.a();
            if (a10 != null) {
                rf.g c10 = rf.g.c();
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
        boolean z6;
        int id2 = view.getId();
        if (id2 == R.id.layout_similar_media_iv_back) {
            onBackPressed();
            return;
        }
        int i10 = 0;
        int i11 = 2;
        if (id2 != R.id.tv_media_delete_count) {
            if (id2 == R.id.layout_similar_media_select_date) {
                this.H.o(10, this.f14130k, new kf.i(this, i10), false);
                return;
            }
            if (id2 == R.id.layout_media_select_layout) {
                FilePercolator filePercolator = this.H;
                int i12 = this.E;
                filePercolator.o(12, i12 != 2 ? i12 != 4 ? 302 : 303 : 301, new c.a(this, 25), false);
                return;
            } else {
                if (id2 == R.id.layout_similar_media_select_size) {
                    this.H.o(11, this.f14131l, new h.a(this, 21), false);
                    return;
                }
                return;
            }
        }
        if (!n.a(id2) && (!this.Z && !this.F)) {
            this.Z = true;
            ArrayList arrayList = this.f14147y;
            int size = arrayList.size();
            HashMap hashMap = this.B;
            u uVar = this.f14148z;
            if (!(size > 0 && arrayList.size() - hashMap.size() == uVar.size())) {
                if (!uVar.isEmpty()) {
                    Iterator it = hashMap.values().iterator();
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (it.hasNext()) {
                            ArrayList arrayList3 = (ArrayList) it.next();
                            if (arrayList3 != null && !arrayList3.isEmpty() && uVar.contains(arrayList3.get(0))) {
                                break;
                            } else if (arrayList3 != null && arrayList3.size() > 1) {
                                arrayList2.addAll(arrayList3.subList(1, arrayList3.size()));
                            }
                        } else if (arrayList2.size() == uVar.size()) {
                            z6 = true;
                        }
                    }
                }
                z6 = false;
                if (!z6) {
                    dg.d.n(this, 4);
                    ArrayList arrayList4 = new ArrayList(uVar);
                    new oh.c(this, arrayList4.size(), new v(this, 6), i11).execute(arrayList4);
                }
            }
            String str = dg.d.f12731a;
            String n10 = w.n("EnU5bD9fAGw0RANsMHRWX1FsL2Nr", "PqVIVAoV");
            if (!TextUtils.isEmpty(n10)) {
                j3.j.G(this, dg.d.i(4), n10, n10);
            }
            ArrayList arrayList42 = new ArrayList(uVar);
            new oh.c(this, arrayList42.size(), new v(this, 6), i11).execute(arrayList42);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        super.onCreate(bundle);
        hg.b.f15613c.f(this);
        try {
            String substring = xd.a.b(this).substring(2280, 2311);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "816ccceedbef2773ab45f84b8d2c639".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            long j4 = 2;
            if (System.currentTimeMillis() % j4 == 0) {
                int c12 = xd.a.f25135a.c(bytes.length / 2);
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
                    xd.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                xd.a.a();
                throw null;
            }
            try {
                String substring2 = oe.a.b(this).substring(983, 1014);
                og.a.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = bj.a.f2786a;
                byte[] bytes3 = substring2.getBytes(charset2);
                og.a.o(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "c9194cfc9830940b60257ddb4394ce8".getBytes(charset2);
                og.a.o(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j4 == 0) {
                    int c13 = oe.a.f19291a.c(bytes3.length / 2);
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
                        oe.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    oe.a.a();
                    throw null;
                }
                lg.v vVar = lg.u.f18144a;
                vVar.e(this);
                if (dg.f.p(this)) {
                    te.a.C(3L);
                }
                dg.d.m(this, 4, 1);
                dg.d.p(this, 4, 1);
                vVar.c();
                vVar.f18150f.add(this);
            } catch (Exception e10) {
                e10.printStackTrace();
                oe.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            xd.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        c.c0(this.f14129j).q(this);
        e eVar = this.Q;
        if (eVar != null) {
            ua.b.m(eVar.f20659g);
            eVar.f20659g = null;
        }
        ua.b.m(this.U);
        ua.b.m(this.T);
        super.onDestroy();
        hg.b.f15613c.n(this);
        lg.v vVar = lg.u.f18144a;
        vVar.f18150f.remove(this);
        a aVar = this.K;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        vVar.f(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.N = true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        u uVar = uf.h.f22854i;
        u uVar2 = this.f14148z;
        uVar2.addAll(uVar);
        uVar.clear();
        this.f14131l = bundle.getInt(w.n("PWkZaQhhAF81ZQJpNF9faUF0GXYEZUJfEnkIZWlzI3pl", "HNNtdrqj"), this.f14131l);
        this.f14130k = bundle.getInt(w.n("BmkvaSFhPF8kZQ9pE19YaTZ0aXYAZQ5fM3lDZSh0EW1l", "WMLPG3wx"), this.f14130k);
        this.f14132m = bundle.getLong(w.n("BmkvaSFhPF8kZQ9pE19YaTZ0aXYAZQ5fG2kfZWdjLXMBby9fPnQvcnQ=", "riDIor8X"), this.f14132m);
        this.f14133n = bundle.getLong(w.n("ImkaaSVhA18vZVdpI185aSZ0bnYqZT1fF2kLZRdjI3MlbxpfLG5k", "cfHVf40p"), this.f14133n);
        int i10 = this.f14131l;
        if (i10 == 2) {
            this.J.setText(w.n("RSBvIHwgTQ==", "IMNhBrTR"));
        } else if (i10 == 3) {
            this.J.setText(w.n("YCBaIHwgTQ==", "XwC5bnNw"));
        } else if (i10 != 4) {
            this.J.setText(R.string.arg);
        } else {
            this.J.setText(w.n("fSB9IE0=", "WACH8M8l"));
        }
        switch (this.f14130k) {
            case 201:
                this.I.setText(getString(R.string.arg, w.n("MQ==", "k3qpTGap")));
                break;
            case 202:
                this.I.setText(getString(R.string.arg, w.n("Ng==", "Q4AguL2d")));
                break;
            case 203:
                this.I.setText(getString(R.string.arg, w.n("YzQ=", "o5yAjHOe")));
                break;
            case 204:
                this.I.setText(R.string.arg);
                break;
            default:
                this.I.setText(R.string.arg);
                break;
        }
        p0();
        a0 a0Var = this.f14136q;
        a0Var.f21962e = uVar2;
        a0Var.j();
        r0(true);
        n0(0L, false);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.N = false;
        if (this.O) {
            this.K.postDelayed(new i0(this, System.currentTimeMillis(), 2), 500L);
            this.O = false;
        }
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("F2EsbihyEWMlZQpuLXNdbSxsV3JJZBZ3DSBAdwd0Umg=", "pbvWc3n1"), w.n("V3BTbhZiUm42ZRRfNmxWYVxfNWkAaVlhFF8cb0Fu", "9h86I3XJ"), yh.b.b().f25853u)) {
            zj.d.f26172b.y(1);
        }
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.F) {
            uf.h.f22854i.clear();
        } else {
            u uVar = uf.h.f22854i;
            uVar.clear();
            u uVar2 = this.f14148z;
            if (uVar2 != null && uVar2.size() > 0) {
                uVar.addAll(uVar2);
            }
        }
        bundle.putInt(w.n("ImkaaSVhA18vZVdpI185aSZ0bnYqZT1fE3k7ZTRzPHpl", "gKkUaEq2"), this.f14131l);
        bundle.putInt(w.n("OGkuaVVhAl81ZQJpNF9faUF0GXYEZUJfEnkIZWl0I21l", "AqKC9pAj"), this.f14130k);
        bundle.putLong(w.n("ImkaaSVhA18vZVdpI185aSZ0bnYqZT1fFWlZZSljAXMlbxpfOnQQcnQ=", "a4vtOUck"), this.f14132m);
        bundle.putLong(w.n("ImkaaSVhA18vZVdpI185aSZ0bnYqZT1fFWkfZWljJ3MlbxpfLG5k", "ar6RFS0X"), this.f14133n);
    }

    public final void p0() {
        this.f14141u.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14143v.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14145w.setImageResource(R.drawable.ic_arrow_down_12);
        this.V.c(nh.b.q(this, 20.0f), nh.b.q(this, 20.0f));
    }

    public final void q0() {
        boolean isChecked = this.f14146x.isChecked();
        ArrayList arrayList = this.f14147y;
        u uVar = this.f14148z;
        uVar.b(arrayList);
        u uVar2 = this.A;
        uVar2.b(arrayList);
        if (isChecked) {
            for (ArrayList arrayList2 : this.B.values()) {
                if (arrayList2.size() > 1) {
                    uVar.addAll(arrayList2.subList(1, arrayList2.size()));
                    uVar2.addAll(arrayList2.subList(1, arrayList2.size()));
                }
            }
        }
        this.f14136q.j();
        i0();
    }

    public final void r0(boolean z6) {
        boolean z10 = !z6;
        this.R.setEnabled(z10);
        this.S.setEnabled(z10);
        this.f14138s.setEnabled(z10);
        if (z6) {
            this.f14139t.setEnabled(false);
            this.f14134o.setVisibility(View.GONE);
            this.L.setVisibility(View.VISIBLE);
            this.C.setVisibility(View.INVISIBLE);
            this.P.setVisibility(View.GONE);
            return;
        }
        this.L.setVisibility(View.GONE);
        this.f14139t.setEnabled(!this.f14148z.isEmpty());
        if (!this.f14147y.isEmpty()) {
            this.f14134o.setVisibility(View.VISIBLE);
        } else {
            this.f14134o.setVisibility(View.GONE);
            this.C.setVisibility(View.VISIBLE);
        }
    }
}
