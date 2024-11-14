package filerecovery.photosrecovery.allrecovery.activity;

import a5.g;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import cj.w;
import com.android.lib.libbase.zjview.CustomRoundImageView;
import com.bytedance.sdk.openadsdk.TTAdConstant;

import eh.o;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.activity.MediaListViewActivity;
import filerecovery.photosrecovery.allrecovery.dialog.DirMediaRecoveryProgressDialog;
import filerecovery.photosrecovery.allrecovery.ui.act.MediaDeleteFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.widget.RecyclerViewFastScroller;
import filerecovery.photosrecovery.allrecovery.ui.widget.SmartRecyclerView;
import filerecovery.photosrecovery.allrecovery.view.percolator.FilePercolator;
import hh.c;
import j.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kf.f;
import kf.l;
import kf.p;
import kf.q;
import kf.r;
import lg.f0;
import lg.u;
import lg.v;
import lg.x;
import rh.d;
import tf.n;
import uf.i;
import v9.i0;
import yf.a;
import yf.j;
import yh.b;
import zf.e;

/* loaded from: classes2.dex */
public class MediaListViewActivity extends i implements View.OnClickListener, d, zf.d, e, x, f0, fg.i {
    public static final /* synthetic */ int Q0 = 0;
    public long A;
    public boolean A0;
    public float B0;
    public boolean E0;
    public int F;
    public j G;
    public boolean G0;
    public DirMediaRecoveryProgressDialog H;
    public long H0;
    public RelativeLayout I;
    public int I0;
    public SwitchCompat J;
    public boolean J0;
    public View K;
    public TextView L;
    public boolean L0;
    public int M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public boolean O0;
    public a R;
    public TextView S;
    public boolean T;
    public boolean U;
    public boolean V;
    public LinearLayout W;
    public LinearLayout X;
    public LinearLayout Y;
    public m Z;

    /* renamed from: k, reason: collision with root package name */
    public SmartRecyclerView f14171k;

    /* renamed from: l, reason: collision with root package name */
    public n f14172l;

    /* renamed from: m, reason: collision with root package name */
    public r f14173m;

    /* renamed from: n, reason: collision with root package name */
    public CustomRoundImageView f14174n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f14175o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f14176p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f14177q;

    /* renamed from: r, reason: collision with root package name */
    public rh.e f14178r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14179s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14180t;

    /* renamed from: t0, reason: collision with root package name */
    public RecyclerViewFastScroller f14181t0;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f14182u;

    /* renamed from: u0, reason: collision with root package name */
    public TextView f14183u0;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f14184v;

    /* renamed from: v0, reason: collision with root package name */
    public ImageView f14185v0;

    /* renamed from: w, reason: collision with root package name */
    public int f14186w;

    /* renamed from: w0, reason: collision with root package name */
    public FilePercolator f14187w0;

    /* renamed from: x0, reason: collision with root package name */
    public TextView f14189x0;

    /* renamed from: y0, reason: collision with root package name */
    public o f14191y0;

    /* renamed from: z, reason: collision with root package name */
    public long f14192z;

    /* renamed from: z0, reason: collision with root package name */
    public ImageView f14193z0;

    /* renamed from: j, reason: collision with root package name */
    public final String f14170j = w.n("HGUTaShMGHM2VlplNUE2dDx2WHR5", "VzSorYqN");

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f14188x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f14190y = new ArrayList();
    public int B = 1;
    public int C = 100;
    public int D = TTAdConstant.MATE_VALID;
    public int E = 40;
    public final ExecutorService P = Executors.newSingleThreadExecutor();
    public final u1.a Q = new u1.a(this, 6);
    public final boolean C0 = true;
    public boolean D0 = true;
    public boolean F0 = false;
    public final int K0 = w.n("OG4DZSd0JW8GZV9lNmUTaTtpQmgmZAtjNmkRaTF5", "BgE2Idy5").hashCode();
    public final int P0 = w.n("Am48ZS90bG8KZQVvI2VBeXRpKGkeaFBkJ2MMaUBpPnk=", "o1kHA8Xw").hashCode();

    public static void f0(MediaListViewActivity mediaListViewActivity, int i10) {
        mediaListViewActivity.F = i10;
        dg.d.f(mediaListViewActivity, mediaListViewActivity.f14186w, i10);
        mediaListViewActivity.f14173m.s1(i10);
        n nVar = mediaListViewActivity.f14172l;
        nVar.f22014o = i10;
        nVar.f1916a.c(0, nVar.f25007c.size(), Boolean.TRUE);
        b.b().Y = i10;
        b.b().d();
    }

    public static void g0(MediaListViewActivity mediaListViewActivity, RelativeLayout relativeLayout, boolean z6) {
        mediaListViewActivity.getClass();
        if (z6) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, -relativeLayout.getHeight(), 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
    }

    public static void h0(MediaListViewActivity mediaListViewActivity) {
        if (lh.n.b(mediaListViewActivity.P0, 1000L)) {
            return;
        }
        Intent intent = new Intent(mediaListViewActivity, (Class<?>) RecoveryFinishActivity.class);
        intent.putExtra(w.n("N2kbZRZuBG0=", "5HUpsh6W"), mediaListViewActivity.M0);
        intent.putExtra(w.n("BWkdZWZlPnIHbhNt", "URcq9L6P"), mediaListViewActivity.N0);
        intent.putExtra(w.n("E2kuZRJ0N3Bl", "ceXyQ2KV"), mediaListViewActivity.f14186w);
        mediaListViewActivity.startActivityForResult(intent, 9010);
        mediaListViewActivity.Q.postDelayed(new q(mediaListViewActivity, 3), 500L);
    }

    @Override // zf.e
    public final void C() {
    }

    @Override // rh.d
    public final void J(int i10, long j4) {
        if (i10 == 1) {
            this.H0 = j4;
            rh.e eVar = this.f14178r;
            long j10 = this.A;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            eVar.k(2, j10, this.H0);
            return;
        }
        long j11 = this.H0;
        if (j11 != 0) {
            this.f14192z = j11;
        }
        this.A = j4;
        dg.d.m(this, this.f14186w, 5);
        this.f14180t.setText(R.string.arg);
        lh.q.b(w.n("CXUidBhtDHpl", "xbjQwet7"), w.n("dS1OLWAtaS1mIAV1JnRcbVt6I1MZYUd0MmkVZTo=", "BbXcMD9A") + rh.a.e(this.f14192z) + w.n("fWMCcz1vHGk4ZXZuJlQ8bTA6", "91LU06H0") + rh.a.e(this.A));
        this.D = 204;
        j0();
    }

    @Override // rh.d
    public final void M(int i10) {
        if (i10 == 2) {
            this.H0 = 0L;
        }
    }

    @Override // uf.i
    public final void V() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f14186w = intent.getIntExtra(w.n("E2kuZRJ0N3Bl", "Jrm11LuD"), 2);
            intent.getStringExtra(w.n("EmkRThhtZQ==", "vvvcyEEH"));
        }
        boolean b10 = c.b(this.f14186w);
        this.N = b10;
        if (b10) {
            return;
        }
        this.J = (SwitchCompat) findViewById(R.id.layout_media_list_tips_switch);
        this.f14189x0 = (TextView) findViewById(R.id.media_list_tv_select_all);
        this.S = (TextView) findViewById(R.id.tv_media_list_hide_thumbnail_count);
        this.J.setOnClickListener(this);
        this.f14189x0.setOnClickListener(this);
        this.J.setChecked(b.b().T);
        this.J.setOnCheckedChangeListener(new kf.b(this, 1));
        this.I = (RelativeLayout) findViewById(R.id.layout_media_list_rv_tips);
        this.f14184v = (LinearLayout) findViewById(R.id.layout_media_list_ad);
        findViewById(R.id.layout_media_iv_back).setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_media_select_time);
        this.W = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_media_select_size);
        this.X = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.layout_media_select_layout);
        this.Y = linearLayout3;
        linearLayout3.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tv_media_recovery_count);
        this.f14183u0 = textView;
        textView.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.iv_media_delete);
        this.f14185v0 = imageView;
        imageView.setOnClickListener(this);
        this.f14183u0.setText(getString(R.string.arg, w.n("MA==", "ECAHsWGu")));
        this.f14183u0.setEnabled(false);
        this.f14185v0.setEnabled(false);
        this.f14175o = (ImageView) findViewById(R.id.layout_media_iv_time);
        this.f14176p = (ImageView) findViewById(R.id.layout_media_iv_size);
        this.f14177q = (ImageView) findViewById(R.id.layout_media_iv_layout);
        this.f14174n = (CustomRoundImageView) findViewById(R.id.iv_title_bar_flg);
        this.f14171k = (SmartRecyclerView) findViewById(R.id.layout_media_recyclerview);
        this.f14181t0 = (RecyclerViewFastScroller) findViewById(R.id.layout_fast_scroller);
        this.f14180t = (TextView) findViewById(R.id.tv_filter_date);
        this.f14179s = (TextView) findViewById(R.id.tv_filter_size_duration);
        this.f14182u = (LinearLayout) findViewById(R.id.lly_loading);
        this.K = findViewById(R.id.layout_empty);
        this.L = (TextView) findViewById(R.id.tv_empty_des);
        this.f14187w0 = (FilePercolator) findViewById(R.id.file_percolator);
        this.f14193z0 = (ImageView) findViewById(R.id.media_list_iv_sort);
        this.f14191y0 = new o(this, new c.a(this, 26));
        this.f14193z0.setOnClickListener(new j.d(this, 10));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_media_list_view;
    }

    @Override // uf.i
    public final void X() {
        super.X();
        this.Z = tg.b.v(this, this.f14186w, new l(this));
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
        if (this.N) {
            return;
        }
        this.f14179s.setText(R.string.arg);
        int i10 = 2;
        int i11 = 1;
        if (this.f14186w == 2) {
            this.L.setText(R.string.arg);
            this.f14179s.setText(R.string.arg);
            this.A0 = true;
        } else {
            this.L.setText(R.string.arg);
        }
        int i12 = b.b().Y;
        this.F = i12;
        dg.d.f(this, this.f14186w, i12);
        r rVar = new r(this, this.F);
        this.f14173m = rVar;
        rVar.L = new f(this, i11);
        this.f14171k.setLayoutManager(this.f14173m);
        n nVar = new n(this, this.f14173m, this.f14186w, new l(this));
        this.f14172l = nVar;
        nVar.f25009e = new h.a(this, 22);
        this.f14171k.setAdapter(nVar);
        this.f14171k.setItemAnimator(new kh.b());
        this.f14171k.setupZoomListener(new g(this, 24));
        this.f14181t0.setHandleStateListener(new kf.o(this));
        this.f14171k.h(new androidx.recyclerview.widget.l(this, i10));
        rh.e eVar = new rh.e(this, this, rh.a.g(w.n("QzlcMBwwQS1oMQ==", "tzrl1p7T")), System.currentTimeMillis());
        this.f14178r = eVar;
        eVar.h();
        this.f14178r.g();
        this.f14178r.i();
        this.f14178r.getClass();
        if (this.T) {
            return;
        }
        j0();
    }

    @Override // fg.i
    public final void a() {
        mf.c.c0(this.f14170j).Y(this, this.f14184v);
    }

    @Override // fg.i
    public final void b() {
        String str = this.f14170j;
        mf.c.c0(str).W(new p(this, 1));
        mf.c.c0(str).D(this, this.f14184v);
    }

    @Override // zf.d
    public final void d(wf.i iVar) {
        this.f14188x.remove(iVar);
        if (this.f14186w == 2 && og.a.e0(iVar)) {
            this.M--;
        }
    }

    @Override // uf.i
    public final void d0() {
        dg.d.v(this, this.f14186w);
    }

    @Override // zf.d
    public final void f() {
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        mf.c.c0(this.f14170j).q(this);
    }

    @Override // zf.d
    public final void g() {
        this.E0 = false;
        if (j3.j.A(this)) {
            return;
        }
        runOnUiThread(new q(this, 1));
    }

    @Override // zf.e
    public final void h(int i10, int i11) {
        if (j3.j.A(this)) {
            return;
        }
        if (i10 == i11) {
            runOnUiThread(new kf.m(this, 3));
            return;
        }
        dg.d.d(this, this.f14186w);
        if (this.G0) {
            int i12 = this.f14186w;
            String i13 = dg.d.i(i12);
            String h10 = dg.d.h(i12, w.n("DlISYyZ2FHIDbF9fMXU2YzBzcw==", "N1afYa1B"));
            dg.d.y(this, i13, h10, h10);
        }
        this.M0 = i10;
        this.N0 = i11;
        m7.a.e(this).g();
        runOnUiThread(new q(this, 2));
    }

    public final void i0() {
        this.U = false;
        if (j3.j.A(this) || this.E0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f14172l.F();
        if (arrayList.size() > 0) {
            j jVar = new j(this, arrayList, this, this.f14186w);
            this.G = jVar;
            this.E0 = true;
            this.D0 = true;
            ua.b.n(this, jVar);
        }
    }

    @Override // lg.x
    public final void j(int i10, int i11) {
        if (i11 != this.f14186w || i10 == 10 || j3.j.A(this)) {
            return;
        }
        runOnUiThread(new q(this, 5));
    }

    public final synchronized void j0() {
        k0();
    }

    @Override // lg.x
    public final void k(wf.i iVar, int i10, int i11) {
        String str;
        String str2;
        int i12 = this.f14186w;
        if (i11 != i12 || i10 == 10) {
            return;
        }
        if (i12 == 2) {
            str = "BWgtdG8=";
            str2 = "LcAvotWT";
        } else {
            str = "AmlWZW8=";
            str2 = "dVt2YsMH";
        }
        String n10 = w.n(str, str2);
        nh.b.n(w.n("CGUGZUNlPGYxbANfIWFn", "CXlj7c2J"), w.n("PGUTaSggHWkxdBM-fD5rPiA=", "XXfk6Swy") + n10 + w.n("VWQnbCh0KyA6dApyBiA=", "1bhQuj3e") + iVar.f24707b);
        this.f14188x.remove(iVar);
        if (this.f14172l.P(iVar, this.E)) {
            if (this.f14186w == 2 && og.a.e0(iVar)) {
                this.M--;
            }
        }
        nh.b.n(w.n("EWUuZTllEWYgbA5fBmFn", "UnR1kXbQ"), w.n("PGUTaSggHWkxdBM-fD5rPiA=", "Z7dbHSO9") + n10 + w.n("cWQSbCx0FCAnbmQ=", "3SD59ByR"));
    }

    public final synchronized void k0() {
        p0(true);
        this.f14189x0.setVisibility(View.GONE);
        this.f14193z0.setVisibility(View.GONE);
        this.P.execute(new kf.m(this, 2));
    }

    public final void l0() {
        this.f14175o.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14176p.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14177q.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14174n.c(nh.b.q(this, 20.0f), nh.b.q(this, 20.0f));
    }

    public final void m0() {
        if (lh.n.b(this.K0, 1000L)) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) MediaDeleteFinishActivity.class);
        intent.putExtra(w.n("N2kbZRZuBG0=", "ii9pw5Mv"), this.I0);
        intent.putExtra(w.n("E2kuZRJ0N3Bl", "88nPAZLe"), this.f14186w);
        startActivityForResult(intent, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
        this.Q.postDelayed(new q(this, 0), 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0() {
        dh.b bVar;
        if (this.f14186w != 2) {
            return;
        }
        ArrayList arrayList = this.f14190y;
        final int i10 = 0;
        if (arrayList.size() > 0) {
            com.android.lib.libbase.zjuibase.a aVar = (com.android.lib.libbase.zjuibase.a) arrayList.get(0);
            if (aVar instanceof dh.b) {
                bVar = (dh.b) aVar;
                if (this.M > 0) {
                    if (bVar != null && bVar.f12752a == com.android.lib.libbase.zjuibase.a.TYPE_TOP_HOLDER) {
                        arrayList.remove(0);
                    }
                    this.I.setVisibility(View.INVISIBLE);
                    n nVar = this.f14172l;
                    if (nVar != null) {
                        nVar.f22013n = 0;
                        nVar.k(0);
                        return;
                    }
                    return;
                }
                final int i11 = 1;
                if (bVar == null || bVar.f12752a != com.android.lib.libbase.zjuibase.a.TYPE_TOP_HOLDER) {
                    dh.b bVar2 = new dh.b();
                    if (arrayList.size() > 1) {
                        com.android.lib.libbase.zjuibase.a aVar2 = (com.android.lib.libbase.zjuibase.a) arrayList.get(1);
                        if (aVar2 instanceof dh.b) {
                            bVar2.f12756e = ((dh.b) aVar2).f12756e;
                        } else if (aVar2 instanceof wf.i) {
                            bVar2.f12756e = ((wf.i) aVar2).f24710e;
                        }
                    }
                    bVar2.f12752a = com.android.lib.libbase.zjuibase.a.TYPE_TOP_HOLDER;
                    arrayList.add(0, bVar2);
                }
                this.I.post(new kf.m(this, i11));
                this.S.setText(String.format(getString(R.string.arg), "" + this.M));
                if (b.b().X) {
                    this.R = new a(this, new View.OnClickListener(this) { // from class: kf.n

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ MediaListViewActivity f17459b;

                        {
                            this.f17459b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i12 = i10;
                            MediaListViewActivity mediaListViewActivity = this.f17459b;
                            switch (i12) {
                                case 0:
                                    ua.b.m(mediaListViewActivity.R);
                                    if (mediaListViewActivity.J.isChecked()) {
                                        mediaListViewActivity.J.setChecked(false);
                                    }
                                    dg.d.D(mediaListViewActivity, 1);
                                    break;
                                default:
                                    ua.b.m(mediaListViewActivity.R);
                                    if (!mediaListViewActivity.J.isChecked()) {
                                        mediaListViewActivity.J.setChecked(true);
                                    }
                                    dg.d.D(mediaListViewActivity, 2);
                                    break;
                            }
                        }
                    }, new View.OnClickListener(this) { // from class: kf.n

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ MediaListViewActivity f17459b;

                        {
                            this.f17459b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i12 = i11;
                            MediaListViewActivity mediaListViewActivity = this.f17459b;
                            switch (i12) {
                                case 0:
                                    ua.b.m(mediaListViewActivity.R);
                                    if (mediaListViewActivity.J.isChecked()) {
                                        mediaListViewActivity.J.setChecked(false);
                                    }
                                    dg.d.D(mediaListViewActivity, 1);
                                    break;
                                default:
                                    ua.b.m(mediaListViewActivity.R);
                                    if (!mediaListViewActivity.J.isChecked()) {
                                        mediaListViewActivity.J.setChecked(true);
                                    }
                                    dg.d.D(mediaListViewActivity, 2);
                                    break;
                            }
                        }
                    }, i11);
                    dg.d.D(this, 0);
                    ua.b.n(this, this.R);
                    b.b().X = false;
                    b.b().d();
                    return;
                }
                return;
            }
        }
        bVar = null;
        if (this.M > 0) {
        }
    }

    public final void o0(ImageView imageView) {
        this.f14175o.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14176p.setImageResource(R.drawable.ic_arrow_down_12);
        this.f14177q.setImageResource(R.drawable.ic_arrow_down_12);
        imageView.setImageResource(R.drawable.ic_arrow_up_12);
        this.f14174n.c(0.0f, 0.0f);
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        ArrayList arrayList = this.f14188x;
        if (i10 == 104) {
            if (i11 == 503 && !this.T && arrayList.isEmpty()) {
                setResult(503);
                finish();
                return;
            }
            return;
        }
        if (i10 == 105 && i11 == 504 && !this.T && arrayList.isEmpty()) {
            setResult(503);
            finish();
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        if (ua.b.c(this.H)) {
            return;
        }
        super.onBackPressed();
        if (dg.f.w(this)) {
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
        int id2 = view.getId();
        int i10 = 1;
        if (id2 == R.id.media_list_tv_select_all) {
            boolean z6 = !this.G0;
            this.G0 = z6;
            this.f14172l.G(z6);
            return;
        }
        if (id2 == R.id.layout_media_iv_back) {
            onBackPressed();
            return;
        }
        if (id2 == R.id.iv_media_delete) {
            if (lh.n.a(view.getId()) || this.F0 || this.E0) {
                return;
            }
            this.F0 = true;
            dg.d.n(this, this.f14186w);
            if (this.G0) {
                int i11 = this.f14186w;
                String i12 = dg.d.i(i11);
                String k10 = dg.d.k(i11, w.n("DkQSbCx0FEEubGxjLmk2aw==", "7HX4XSkp"));
                dg.d.y(this, i12, k10, k10);
            }
            ArrayList arrayList = new ArrayList(this.f14172l.F());
            new oh.c(this, arrayList.size(), new l(this), i10).execute(arrayList);
            return;
        }
        if (id2 != R.id.tv_media_recovery_count) {
            if (id2 == R.id.layout_media_select_time) {
                this.f14187w0.o(10, this.D, new kf.i(this, i10), false);
                return;
            }
            if (id2 == R.id.layout_media_select_size) {
                int i13 = 24;
                if (this.f14186w == 2) {
                    this.f14187w0.o(11, this.B, new com.android.libsimilar.liveeventbus.b(this, 24), false);
                    return;
                } else {
                    this.f14187w0.o(13, this.C, new nc.c(this, i13), false);
                    return;
                }
            }
            if (id2 == R.id.layout_media_select_layout) {
                FilePercolator filePercolator = this.f14187w0;
                int i14 = this.F;
                filePercolator.o(12, i14 != 2 ? i14 != 4 ? 302 : 303 : 301, new wf.b(this, 22), false);
                return;
            }
            return;
        }
        if (lh.n.a(view.getId())) {
            return;
        }
        dg.d.c(this, this.f14186w);
        int i15 = this.f14186w;
        String h10 = dg.d.h(i15, w.n("DlISYyZ2FHI7X1BsK2Nr", "fI0tkbsO"));
        if (!TextUtils.isEmpty(h10)) {
            j3.j.G(this, dg.d.i(i15), h10, h10);
        }
        if (this.G0) {
            int i16 = this.f14186w;
            String i17 = dg.d.i(i16);
            String h11 = dg.d.h(i16, w.n("DlISYyZ2FHIDbF9fIWw8Y2s=", "iamp6Sta"));
            dg.d.y(this, i17, h11, h11);
        }
        DirMediaRecoveryProgressDialog dirMediaRecoveryProgressDialog = new DirMediaRecoveryProgressDialog(this, (ArrayList) this.f14172l.F(), this, this.f14186w);
        this.H = dirMediaRecoveryProgressDialog;
        ua.b.n(this, dirMediaRecoveryProgressDialog);
        this.D0 = true;
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        int i10 = 0;
        this.T = bundle != null;
        if (bundle != null) {
            this.f14186w = bundle.getInt(w.n("PGUTaShfHWkxdGx2K2UiXzNpXWUcdDNwZQ==", "0iSTkh36"), this.f14186w);
        }
        super.onCreate(bundle);
        try {
            String substring = he.a.b(this).substring(2040, 2071);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "fa8dff04a362be45853424e457f1f4c".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            if (System.currentTimeMillis() % 2 == 0) {
                int c11 = he.a.f15610a.c(bytes.length / 2);
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
                    he.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                he.a.a();
                throw null;
            }
            yd.a.c(this);
            if (c.a(this, this.f14186w)) {
                return;
            }
            hg.f.f15617c.f(this);
            v vVar = u.f18144a;
            vVar.e(this);
            vVar.f18149e.add(this);
            if (dg.f.w(this)) {
                te.a.C(3L);
            }
            dg.d.m(this, this.f14186w, 1);
            int i11 = this.f14186w;
            if (i11 == 2) {
                dg.d.p(this, 2, 1);
            } else {
                dg.d.o(this, i11, 1);
            }
            dg.d.C(this, this.f14186w, this.E);
        } catch (Exception e10) {
            e10.printStackTrace();
            he.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        mf.c.c0(this.f14170j).q(this);
        rh.e eVar = this.f14178r;
        if (eVar != null) {
            ua.b.m(eVar.f20659g);
            eVar.f20659g = null;
        }
        n nVar = this.f14172l;
        if (nVar != null) {
            nVar.R();
        }
        ua.b.l(this, this.R);
        ua.b.l(this, null);
        ua.b.l(this, this.Z);
        ua.b.l(this, this.G);
        ua.b.l(this, this.H);
        ua.b.l(this, this.f14191y0);
        super.onDestroy();
        hg.f.f15617c.n(this);
        u1.a aVar = this.Q;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        v vVar = u.f18144a;
        vVar.f(this);
        vVar.f18149e.remove(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.O0 = true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.N) {
            return;
        }
        this.D0 = bundle.getBoolean(w.n("GGUmaSxfImk6dDR2G2VDXyxzaXIMcxx0GnMSbDRjJm9y", "2gCGEwQR"), this.D0);
        this.f14186w = bundle.getInt(w.n("LGUpaQlfI2krdDl2PGVEX1RpKmUydExwZQ==", "6gAMhOf9"), this.f14186w);
        this.B = bundle.getInt(w.n("PGUTaShfHWkxdGx2K2UiXyF5QWUccyN6ZQ==", "0ECroE29"), this.B);
        this.C = bundle.getInt(w.n("HGULaRlfGGkrdDl2PGVEX0Z5NmUyZEBy", "ERqoxtvy"), this.C);
        this.D = bundle.getInt(w.n("PGUTaShfHWkxdGx2K2UiXyF5QWUcdCNtZQ==", "uyft0SDn"), this.D);
        this.E = bundle.getInt(w.n("GGUmaSxfImk6dDR2G2VDXzF5RmU2cxZydA==", "LCyfG61y"), this.E);
        this.f14192z = bundle.getLong(w.n("GGUmaSxfImk6dDR2G2VDXyZ1RXQGbSZzEWEcdBF0EW1l", "MeN3enNx"), this.f14192z);
        long j4 = bundle.getLong(w.n("PGUTaShfHWkxdGx2K2UiXzZ1QnQsbRVlBWQsdAhtZQ==", "ksaMaafp"), this.A);
        this.A = j4;
        FilePercolator filePercolator = this.f14187w0;
        filePercolator.f14669w = this.f14192z;
        filePercolator.f14670x = j4;
        this.V = bundle.getBoolean(w.n("PGUTaShfHWkxdGx2K2UiXzxzbnMrbz1fM2UHbwJlAGU1XxNpKGweZw==", "AdtrMaKm"), this.V);
        this.U = bundle.getBoolean(w.n("DmUgaQ9fWmkrdDl2PGVEX1tzGXMFb0JfAmUUZUJlFWQKYShvZw==", "rgcDn6qp"), this.U);
        if (this.f14186w != 2) {
            switch (this.C) {
                case 101:
                    this.f14179s.setText(getString(R.string.arg, w.n("RSBvIDU=", "8cs8QgjC")));
                    break;
                case 102:
                    this.f14179s.setText(getString(R.string.arg, w.n("bSAaIEQw", "bxX7v4qH")));
                    break;
                case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                    this.f14179s.setText(getString(R.string.arg, w.n("YzBXLWk2MA==", "ceaIDBUu")));
                    break;
                case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                    this.f14179s.setText(getString(R.string.arg, w.n("RiBBMA==", "z1xw7jWY")));
                    break;
                default:
                    this.f14179s.setText(R.string.arg);
                    break;
            }
        } else {
            int i10 = this.B;
            if (i10 == 2) {
                this.f14179s.setText(w.n("RSBvIHwgTQ==", "plZC3KQR"));
            } else if (i10 == 3) {
                this.f14179s.setText(w.n("YCBaIHwgTQ==", "e51DhDXZ"));
            } else if (i10 != 4) {
                this.f14179s.setText(R.string.arg);
            } else {
                this.f14179s.setText(w.n("SyB3IE0=", "x8hWbjkO"));
            }
        }
        switch (this.D) {
            case 201:
                this.f14180t.setText(getString(R.string.arg, w.n("MQ==", "eyAISJSQ")));
                break;
            case 202:
                this.f14180t.setText(getString(R.string.arg, w.n("Ng==", "X26HX9yh")));
                break;
            case 203:
                this.f14180t.setText(getString(R.string.arg, w.n("CjQ=", "9z8y1AfH")));
                break;
            case 204:
                this.f14180t.setText(R.string.arg);
                break;
            default:
                this.f14180t.setText(R.string.arg);
                break;
        }
        this.f14191y0.r(this.E);
        l0();
        k0();
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.O0 = false;
        if (this.O) {
            this.O = false;
            i0();
        }
        boolean z6 = this.L0;
        u1.a aVar = this.Q;
        if (z6) {
            aVar.postDelayed(new i0(this, System.currentTimeMillis(), 3), 500L);
            this.L0 = false;
        }
        if (this.J0) {
            aVar.postDelayed(new q(this, 6), 500L);
            this.J0 = false;
        }
        if (dg.f.o(this)) {
            zj.d.f26172b.y(0);
        }
        if (dg.f.t(this)) {
            te.a.C(5L);
        }
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(w.n("GGUmaSxfImk6dDR2G2VDXyNpWmU2dABwZQ==", "hvxLKs8N"), this.f14186w);
        bundle.putInt(w.n("GGUmaSxfImk6dDR2G2VDXzF5RmU2cxB6ZQ==", "1FAMXcrN"), this.B);
        bundle.putInt(w.n("GGUmaSxfImk6dDR2G2VDXzF5RmU2ZAxy", "ooLUcI4n"), this.C);
        bundle.putInt(w.n("GGUmaSxfImk6dDR2G2VDXzF5RmU2dBBtZQ==", "b8kQ2v4F"), this.D);
        bundle.putInt(w.n("GGUmaSxfImk6dDR2G2VDXzF5RmU2cxZydA==", "oP6Dd1nW"), this.E);
        bundle.putLong(w.n("PGUTaShfHWkxdGx2K2UiXzZ1QnQsbRVzJmE2dGx0WW1l", "RD30zd4l"), this.f14192z);
        bundle.putLong(w.n("PGUTaShfHWkxdGx2K2UiXzZ1QnQsbRVlLWQZdDFtZQ==", "CFX5Ryjj"), this.A);
        bundle.putBoolean(w.n("C2UVaRhfOWkrdDl2PGVEX1tzGXMFb0JfFGUbb0BlOGUCXxVpGGw6Zw==", "ClfqyUt1"), this.V);
        bundle.putBoolean(w.n("GGUmaSxfImk6dDR2G2VDXyxzaXMBbw5fNmUeZQdlKWQcYS5vZw==", "BOGkRrsv"), this.U);
        bundle.putBoolean(w.n("PGUTaShfHWkxdGx2K2UiXzxzbnImcy90DHMubAZjAW9y", "SKcuLdS4"), this.D0);
    }

    public final void p0(boolean z6) {
        this.W.setEnabled(!z6);
        this.X.setEnabled(!z6);
        this.Y.setEnabled(!z6);
        this.f14189x0.setEnabled(!z6);
        this.f14193z0.setEnabled(!z6);
        this.K.setVisibility(View.INVISIBLE);
        if (z6) {
            this.f14181t0.e();
            this.f14171k.setVisibility(View.GONE);
            this.f14182u.setVisibility(View.VISIBLE);
            this.I.setVisibility(View.INVISIBLE);
            return;
        }
        this.f14181t0.k();
        ArrayList arrayList = this.f14190y;
        if (dg.a.V(arrayList) && ((com.android.lib.libbase.zjuibase.a) arrayList.get(0)).getSelectItemType() == com.android.lib.libbase.zjuibase.a.TYPE_TOP_HOLDER) {
            this.I.setVisibility(View.VISIBLE);
        } else {
            this.I.setVisibility(View.INVISIBLE);
        }
        this.f14182u.setVisibility(View.GONE);
    }

    @Override // zf.e
    public final void s() {
        if (j3.j.A(this)) {
            return;
        }
        runOnUiThread(new q(this, 4));
    }

    @Override // zf.d
    public final void w(int i10) {
        if (j3.j.A(this)) {
            return;
        }
        int i11 = 0;
        this.E0 = false;
        m7.a.e(this).g();
        this.I0 = i10;
        if (this.G0) {
            int i12 = this.f14186w;
            String i13 = dg.d.i(i12);
            String k10 = dg.d.k(i12, w.n("DkQSbCx0FEEubGxzN2M2ZSZz", "wHXD0j7w"));
            dg.d.y(this, i13, k10, k10);
        }
        n nVar = this.f14172l;
        int i14 = this.E;
        nVar.getClass();
        nVar.N(i14 == 30 || i14 == 40);
        runOnUiThread(new kf.m(this, i11));
    }
}
