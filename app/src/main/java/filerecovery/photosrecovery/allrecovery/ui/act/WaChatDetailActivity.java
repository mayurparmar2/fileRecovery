package filerecovery.photosrecovery.allrecovery.ui.act;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.w;
import com.gyf.immersionbar.e;
import ed.a;
import ed.c;
import fg.n;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import filerecovery.photosrecovery.allrecovery.ui.widget.CommonWaEmptyView;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k.j;
import l.d;
import lg.q;
import nf.s;
import rf.g;
import uf.i;
import ve.b;
import xf.f;
import yg.h0;
import yg.i0;
import yg.j0;
import yg.y;

/* loaded from: classes2.dex */
public class WaChatDetailActivity extends i implements n {
    public static final String D = w.n("MFgWUgxfDUgIVA==", "WLxVR1UR");
    public boolean A;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f14498k;

    /* renamed from: l, reason: collision with root package name */
    public a f14499l;

    /* renamed from: m, reason: collision with root package name */
    public c f14500m;

    /* renamed from: o, reason: collision with root package name */
    public d f14502o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f14503p;

    /* renamed from: q, reason: collision with root package name */
    public CommonWaEmptyView f14504q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f14505r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f14506s;

    /* renamed from: t, reason: collision with root package name */
    public LinearLayout f14507t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f14508u;

    /* renamed from: v, reason: collision with root package name */
    public PopupWindow f14509v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f14510w;

    /* renamed from: y, reason: collision with root package name */
    public SimpleDateFormat f14512y;

    /* renamed from: j, reason: collision with root package name */
    public final String f14497j = w.n("ImEBaCx0CmU9YQJsM2NAaTNpQnk=", "VAdPmLNK");

    /* renamed from: n, reason: collision with root package name */
    public final ExecutorService f14501n = Executors.newSingleThreadExecutor();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f14511x = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f14513z = false;
    public boolean B = false;
    public final f C = new f(this, 15);

    public static void f0(WaChatDetailActivity waChatDetailActivity, ArrayList arrayList) {
        waChatDetailActivity.getClass();
        waChatDetailActivity.runOnUiThread(new q(waChatDetailActivity, b.E(arrayList, new y(waChatDetailActivity, 1)), 4));
    }

    @Override // uf.i
    public final void V() {
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        a aVar = (a) intent.getSerializableExtra(D);
        this.f14499l = aVar;
        if (aVar != null) {
            this.f14500m = aVar.f13306a;
        }
        c cVar = this.f14500m;
        if (cVar != null) {
            this.A = cVar.f13318f;
        }
        this.f14506s = (LinearLayout) findViewById(R.id.chat_detail_ll_ad_container);
        this.f14507t = (LinearLayout) findViewById(R.id.chat_detail_ll_banner_ad_container);
        CommonWaEmptyView commonWaEmptyView = (CommonWaEmptyView) findViewById(R.id.common_empty);
        this.f14504q = commonWaEmptyView;
        commonWaEmptyView.x(R.drawable.ic_chat_detail_empty, getString(R.string.arg));
        findViewById(R.id.wa_chat_detail_iv_back).setOnClickListener(new j(this, 12));
        this.f14503p = (ImageView) findViewById(R.id.chat_detail_iv_filter_delete);
        this.f14508u = (TextView) findViewById(R.id.chat_detail_tv_filter_delete_cancel);
        g0();
        this.f14509v = new PopupWindow(this);
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_only_delete_select, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.chat_pop_tv_only_delete_select);
        if (og.a.c0(this)) {
            textView.setBackgroundResource(R.drawable.bg_chat_detail_only_delete_dialog_rtl);
        } else {
            textView.setBackgroundResource(R.drawable.bg_chat_detail_only_delete_dialog);
        }
        textView.setOnClickListener(new j0(this, 2));
        this.f14509v.setContentView(inflate);
        this.f14509v.setBackgroundDrawable(new ColorDrawable(0));
        this.f14509v.setWidth(-2);
        this.f14509v.setHeight(-2);
        this.f14509v.setOutsideTouchable(true);
        this.f14509v.setFocusable(true);
        this.f14505r = (TextView) findViewById(R.id.chat_detail_tv_title);
        this.f14498k = (RecyclerView) findViewById(R.id.message_detail_rv);
        this.f14510w = (TextView) findViewById(R.id.chat_detail_faker_header_tv_date);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.f14498k.setLayoutManager(linearLayoutManager);
        this.f14498k.h(new i0(this, linearLayoutManager));
        d dVar = new d(this, this.A);
        this.f14502o = dVar;
        this.f14498k.setAdapter(dVar);
        this.f14503p.setOnClickListener(new j0(this, 0));
        this.f14508u.setOnClickListener(new j0(this, 1));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_whats_app_chat_message_detail;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.color_100_008069_1F2C34);
        eVar.l(R.color.color_100_008069_1F2C34);
        eVar.c();
        eVar.m(false);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        if (this.f14500m != null) {
            Executors.newSingleThreadExecutor().execute(new h0(this, 1));
        }
        this.f14505r.setText(this.f14499l.f13307b);
        this.f14501n.execute(new h0(this, 2));
    }

    @Override // fg.n
    public final void a() {
        s.D(this.f14497j).C(this, this.f14507t, this.f14506s, R.color.color_100_EBF5F5_1F2C34, R.color.color_100_E0ECEC_2A3C47);
    }

    @Override // fg.n
    public final void b() {
        String str = this.f14497j;
        s.D(str).h(new h(this, 25));
        s D2 = s.D(str);
        LinearLayout linearLayout = this.f14507t;
        LinearLayout linearLayout2 = this.f14506s;
        if (ff.a.f14050a.j()) {
            D2.r(this);
            linearLayout.setVisibility(View.GONE);
            linearLayout2.setVisibility(View.GONE);
            return;
        }
        nh.a.h(D2.e());
        if (D2.n()) {
            D2.C(this, linearLayout, linearLayout2, R.color.color_100_EBF5F5_1F2C34, R.color.color_100_E0ECEC_2A3C47);
            return;
        }
        if (og.a.W()) {
            linearLayout.setVisibility(View.VISIBLE);
            linearLayout2.setVisibility(View.GONE);
        } else {
            linearLayout.setVisibility(View.GONE);
            linearLayout2.setVisibility(View.VISIBLE);
            linearLayout = linearLayout2;
        }
        sh.b s5 = D2.s(this);
        D2.f18892i = s5;
        og.a.L0(this, s5, linearLayout);
        D2.v(this);
    }

    @Override // uf.i
    public final void d0() {
        int i10 = dg.j.f12745j;
        String n10 = w.n("dWUic1NnIl8baAd0EWVHYVtsNV8eaFp3", "1h8Q2Gw7");
        dg.d.A(this, n10, n10);
    }

    public final void g0() {
        if (this.f14513z) {
            this.f14503p.setVisibility(View.GONE);
            this.f14508u.setVisibility(View.VISIBLE);
        } else {
            this.f14503p.setVisibility(View.VISIBLE);
            this.f14508u.setVisibility(View.GONE);
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        if (dg.f.y(this)) {
            gg.a.f15028c.getClass();
            Activity a10 = filerecovery.photosrecovery.allrecovery.b.a();
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

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        if (bundle != null) {
            this.f14513z = bundle.getBoolean(w.n("MmgWdBZkFHQjaV9fK3MKZjxsRWUxXy5lHGUWZWQ=", "pb169avW"));
        }
        super.onCreate(bundle);
        try {
            String substring = qd.a.b(this).substring(2500, 2531);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "344528e3b3897f8bcfa7d581e87dae5".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            long j4 = 2;
            if (System.currentTimeMillis() % j4 == 0) {
                int c12 = qd.a.f20220a.c(bytes.length / 2);
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
                    qd.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                qd.a.a();
                throw null;
            }
            try {
                String substring2 = od.a.b(this).substring(2320, 2351);
                og.a.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = bj.a.f2786a;
                byte[] bytes3 = substring2.getBytes(charset2);
                og.a.o(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "19c7db3babace1a115ce3fcc43027b6".getBytes(charset2);
                og.a.o(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j4 == 0) {
                    int c13 = od.a.f19290a.c(bytes3.length / 2);
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
                        od.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    od.a.a();
                    throw null;
                }
                ig.a.f15992c.f(this);
                if (dg.f.y(this)) {
                    te.a.C(3L);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                od.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            qd.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        s.D(this.f14497j).r(this);
        super.onDestroy();
        ig.a.f15992c.n(this);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (dg.f.B(this)) {
            zj.d.f26173c.y(3);
        } else {
            this.f14507t.setVisibility(View.GONE);
            this.f14506s.setVisibility(View.GONE);
        }
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(w.n("FmgjdBJkK3QoaQdfG3NrZixsQmUbXx1lBGUSZWQ=", "jUP4hfyA"), this.f14513z);
    }
}
