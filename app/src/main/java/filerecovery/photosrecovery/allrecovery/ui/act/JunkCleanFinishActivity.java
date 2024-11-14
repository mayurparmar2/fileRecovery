package filerecovery.photosrecovery.allrecovery.ui.act;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bh.g;
import cj.w;
import fg.e;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import lg.a0;
import lg.h;
import lg.h0;
import lg.n;
import lg.o;
import lg.s;
import lg.z;
import og.a;
import pg.d;
import uf.i;
import yg.d0;
import yg.u;
import z5.c;
import z5.f;

/* loaded from: classes2.dex */
public class JunkCleanFinishActivity extends i implements View.OnClickListener, d, z, a0, e {

    /* renamed from: w, reason: collision with root package name */
    public static final String f14437w = w.n("BE4MRT9UMkQdTCNUEF91SX5FGU44TWpLI1k=", "7sMXqm1v");

    /* renamed from: x, reason: collision with root package name */
    public static final String f14438x = w.n("D05lRQNUF1QBUCNfHkVZ", "nnF1MHXL");

    /* renamed from: y, reason: collision with root package name */
    public static final String f14439y = w.n("cE4GRQdUZkQdTCNUEF91SX5FGVMkWnBfLUVZ", "Zx9RI9lC");

    /* renamed from: z, reason: collision with root package name */
    public static final String f14440z = w.n("fk5jRQJUOlQdTTZPB0FhWW1DCkUsTnBEOVMxWnNfAUVZ", "8y77Lek3");

    /* renamed from: j, reason: collision with root package name */
    public TextView f14441j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f14442k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f14443l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14444m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f14445n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14446o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f14447p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f14448q;

    /* renamed from: r, reason: collision with root package name */
    public int f14449r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f14450s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14451t;

    /* renamed from: u, reason: collision with root package name */
    public g f14452u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f14453v;

    public static void g0(Activity activity, int i10, int i11, long j4) {
        h0(activity, i10, i11, j4, 0L);
    }

    public static void h0(Activity activity, int i10, int i11, long j4, long j10) {
        Intent intent = new Intent(activity, (Class<?>) JunkCleanFinishActivity.class);
        intent.putExtra(f14438x, i10);
        intent.putExtra(f14437w, i11);
        intent.putExtra(f14439y, j4);
        intent.putExtra(f14440z, j10);
        try {
            activity.startActivityForResult(intent, 9010);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // pg.d
    public final void B(long j4, int i10, boolean z6) {
        runOnUiThread(new d0(this, 0));
    }

    @Override // uf.i
    public final void V() {
        this.f14453v = (TextView) findViewById(R.id.layout_delete_tv_total);
        this.f14442k = (TextView) findViewById(R.id.layout_delete_tv_file_num);
        this.f14441j = (TextView) findViewById(R.id.layout_delete_tv_file_size);
        this.f14443l = (TextView) findViewById(R.id.layout_delete_tv_file_size_unit);
        this.f14446o = (LinearLayout) findViewById(R.id.layout_delete_similar_num_wrapper);
        this.f14447p = (LinearLayout) findViewById(R.id.layout_delete_similar_size_wrapper);
        this.f14448q = (TextView) findViewById(R.id.layout_delete_tv_empty);
        this.f14451t = (TextView) findViewById(R.id.clean_finish_tv_files_unit);
        this.f14444m = (LinearLayout) findViewById(R.id.layout_delete_native_ad_container);
        this.f14445n = (LinearLayout) findViewById(R.id.layout_delete_adaptive_ad_container);
        this.f14450s = (RecyclerView) findViewById(R.id.junk_clean_finish_rv);
        TextView textView = (TextView) findViewById(R.id.tv_removed);
        try {
            textView.setText(textView.getText().toString().toLowerCase(c.f(this, c.d(this))));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        findViewById(R.id.layout_delete_iv_back).setOnClickListener(this);
        findViewById(R.id.layout_delete_iv_home).setOnClickListener(this);
    }

    @Override // uf.i
    public final int W() {
        return a.W() ? R.layout.activity_junk_clean_finish_update : R.layout.activity_junk_clean_finish;
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.c();
        eVar.l(R.color.color_100_FC7826);
        eVar.m(false);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        int i10;
        long j4;
        long j10;
        Intent intent = getIntent();
        if (intent != null) {
            this.f14449r = intent.getIntExtra(f14438x, 0);
            i10 = intent.getIntExtra(f14437w, 0);
            j4 = intent.getLongExtra(f14439y, 0L);
            j10 = intent.getLongExtra(f14440z, 0L);
        } else {
            i10 = 0;
            j4 = 0;
            j10 = 0;
        }
        int i11 = this.f14449r;
        if (i11 == 4) {
            this.f14451t.setText(R.string.arg);
        } else if (i11 != 5) {
            if (i11 == 6) {
                this.f14451t.setText(getString(R.string.arg));
            } else if (i11 == 7) {
                this.f14451t.setText(getString(R.string.arg));
            }
        } else if (i10 != 1 || j10 > 0) {
            this.f14451t.setText(getString(R.string.arg));
        } else {
            this.f14451t.setText(getString(R.string.arg));
        }
        n.f18127a.getClass();
        o.c();
        lg.g.f18106a.a(this);
        lg.e.f18100a.a(this);
        h0.f18115a.a(this);
        s.f18136a.a(this);
        this.f14450s.setLayoutManager(new LinearLayoutManager(1));
        g gVar = new g(this, f0(true));
        this.f14452u = gVar;
        gVar.f2696f = new u(this);
        this.f14450s.setAdapter(gVar);
        if (this.f14449r != 5) {
            this.f14442k.setText(i10 + "");
            String[] d10 = f.d(j4);
            this.f14441j.setText(d10[0]);
            this.f14443l.setText(d10[1]);
            return;
        }
        if (j10 > 0) {
            this.f14442k.setText(w.n("Pg==", "3ySk3Lrg") + i10);
            String[] d11 = f.d(j4 + j10);
            this.f14441j.setText(d11[0]);
            this.f14443l.setText(d11[1]);
            return;
        }
        if (j4 <= 0) {
            this.f14453v.setText(getString(R.string.arg));
            this.f14448q.setVisibility(View.VISIBLE);
            this.f14446o.setVisibility(View.GONE);
            this.f14447p.setVisibility(View.GONE);
            return;
        }
        this.f14442k.setText(i10 + "");
        String[] d12 = f.d(j4);
        this.f14441j.setText(d12[0]);
        this.f14443l.setText(d12[1]);
    }

    @Override // fg.e
    public final void c() {
        mf.a.f18523a.a0(this, this.f14444m, this.f14445n, R.color.color_100_f65b1a);
    }

    @Override // uf.i
    public final void d0() {
        int i10 = this.f14449r;
        int i11 = dg.c.f12730j;
        dg.d.x(this, dg.d.j(i10) + w.n("KkQnbCh0K1M8YwhlAXNrcy1vdw==", "Fgr4oBZl"), i10);
    }

    public final ArrayList f0(boolean z6) {
        ArrayList arrayList = new ArrayList();
        if (this.f14449r != 5) {
            long g10 = yj.a.f25869d.g();
            if (g10 != 0) {
                arrayList.add(new dh.a(5, R.drawable.ic_done_deepclean, g10, dg.a.q0(getString(R.string.arg))));
                if (z6) {
                    dg.c.G(this, 5);
                }
            }
        }
        if (this.f14449r != 7) {
            long i10 = yj.a.f25869d.i();
            if (i10 != 0) {
                arrayList.add(new dh.a(7, R.drawable.ic_done_screenshots, i10, getString(R.string.arg)));
                if (z6) {
                    dg.c.G(this, 7);
                }
            }
        }
        if (this.f14449r != 4) {
            long h10 = yj.a.f25869d.h();
            if (h10 != 0) {
                arrayList.add(new dh.a(4, R.drawable.ic_done_duplicate, h10, getString(R.string.arg)));
                if (z6) {
                    dg.c.G(this, 4);
                }
            }
        }
        if (this.f14449r != 6) {
            long f10 = yj.a.f25869d.f();
            if (f10 != 0) {
                arrayList.add(new dh.a(6, R.drawable.ic_done_bigvideos, f10, getString(R.string.arg)));
                if (z6) {
                    dg.c.G(this, 6);
                }
            }
        }
        return arrayList;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        n.f18127a.f(-1);
    }

    @Override // lg.a0
    public final void n(boolean z6) {
        if (z6) {
            ConcurrentHashMap concurrentHashMap = h.f18107j;
            lg.g.f18106a.e();
        }
        runOnUiThread(new d0(this, 1));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.layout_delete_iv_back) {
            onBackPressed();
            return;
        }
        if (id2 == R.id.layout_delete_iv_home) {
            n.f18127a.f(5);
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            if (a.d0(this) || !dg.f.r(this)) {
                return;
            }
            gg.a.f15028c.getClass();
            Activity a10 = b.a();
            if (a10 != null) {
                rf.g c10 = rf.g.c();
                c10.f20639c.f20633h = true;
                if (c10.a()) {
                    c10.g(a10);
                }
            }
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        char c11;
        super.onCreate(bundle);
        try {
            String substring = md.a.b(this).substring(843, 874);
            a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "6726ad13b209adea8fac92f483e7639".getBytes(charset);
            a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            long j4 = 2;
            if (System.currentTimeMillis() % j4 == 0) {
                int c12 = md.a.f18521a.c(bytes.length / 2);
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
                    md.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                md.a.a();
                throw null;
            }
            try {
                String substring2 = ie.a.b(this).substring(1137, 1168);
                a.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = bj.a.f2786a;
                byte[] bytes3 = substring2.getBytes(charset2);
                a.o(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "68cd38d626b713745e63bba0c2da0e3".getBytes(charset2);
                a.o(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j4 == 0) {
                    int c13 = ie.a.f15991a.c(bytes3.length / 2);
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
                        ie.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    ie.a.a();
                    throw null;
                }
                gg.b.f15029c.f(this);
                if (dg.f.r(this)) {
                    te.a.C(6L);
                }
                lg.u.f18144a.f18150f.add(this);
            } catch (Exception e10) {
                e10.printStackTrace();
                ie.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            md.a.a();
            throw null;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        mf.a.f18523a.q(this);
        super.onDestroy();
        gg.b.f15029c.n(this);
        lg.u.f18144a.f18150f.remove(this);
        s.f18136a.b(this);
        h0.f18115a.b(this);
        lg.e.f18100a.b(this);
        ConcurrentHashMap concurrentHashMap = h.f18107j;
        lg.g.f18106a.b(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        lg.u.f18144a.f18152h.remove(this);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        lg.u.f18144a.f18152h.add(this);
        n.f18127a.a();
        String str = dg.f.f12740a;
        if (dg.f.b(this, w.n("W2kJIDZhIGQHZANsMHRWIFRpKGkeaBVkCXdu", "MW9nURZh"), w.n("WXAQbm1ONl88ZQplIWVsZltuL3MFX1FvEW4=", "xq6u2u9P"), yh.b.b().f25857w)) {
            w.n("GmEZbAdhUms=", "HLyue1PC");
            gg.b.f15029c.z();
        }
        lg.g.f18106a.h();
    }

    @Override // fg.e
    public final void z() {
        mf.b bVar = mf.a.f18523a;
        bVar.W(new filerecovery.photosrecovery.allrecovery.h(this, 20));
        bVar.E(this, this.f14444m, this.f14445n, R.color.color_100_f65b1a);
    }
}
