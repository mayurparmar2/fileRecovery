package filerecovery.photosrecovery.allrecovery.ui.act;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.c;
import c1.d;
import cj.w;
import com.gyf.immersionbar.e;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import dg.f;
import eh.g;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import filerecovery.photosrecovery.allrecovery.manager.contact.ContactModel;
import filerecovery.photosrecovery.allrecovery.ui.dialog.ContactDeletedRecoverDialog;
import filerecovery.photosrecovery.allrecovery.ui.widget.CommonContactEmptyView;
import filerecovery.photosrecovery.allrecovery.ui.widget.CommonWaLoadingView;
import filerecovery.photosrecovery.allrecovery.ui.widget.InterceptTouchFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k.j;
import lh.l;
import lh.n;
import u1.a;
import uf.i;
import y9.m;
import yg.b;
import yg.x;
import yg.y;

/* loaded from: classes2.dex */
public class ContactDeletedActivity extends i implements View.OnClickListener, g {
    public static ArrayList F;
    public CommonWaLoadingView A;
    public yf.g B;
    public boolean C;
    public boolean E;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f14400k;

    /* renamed from: l, reason: collision with root package name */
    public CommonContactEmptyView f14401l;

    /* renamed from: m, reason: collision with root package name */
    public SmartRefreshLayout f14402m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f14403n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f14404o;

    /* renamed from: p, reason: collision with root package name */
    public EditText f14405p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f14406q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f14407r;

    /* renamed from: s, reason: collision with root package name */
    public d f14408s;

    /* renamed from: w, reason: collision with root package name */
    public bh.i f14412w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f14413x;

    /* renamed from: y, reason: collision with root package name */
    public View f14414y;

    /* renamed from: z, reason: collision with root package name */
    public ContactDeletedRecoverDialog f14415z;

    /* renamed from: j, reason: collision with root package name */
    public final String f14399j = w.n("C28cdCxjM0Q9bAN0MGRyY0ZpMGkZeQ==", "eEHrMGj2");

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f14409t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f14410u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final a f14411v = new a(this, Looper.getMainLooper(), 14);
    public final ExecutorService D = Executors.newSingleThreadExecutor();

    @Override // uf.i
    public final void V() {
        findViewById(R.id.title_bar_iv_back).setOnClickListener(new j.d(this, 17));
        this.f14414y = findViewById(R.id.contact_deleted_cl_top_container);
        this.f14413x = (TextView) findViewById(R.id.contact_deleted_tv_recovery_count);
        this.f14400k = (RecyclerView) findViewById(R.id.contact_deleted_rv_content);
        this.f14401l = (CommonContactEmptyView) findViewById(R.id.contact_deleted_empty_view);
        this.A = (CommonWaLoadingView) findViewById(R.id.contact_deleted_common_loading);
        this.f14402m = (SmartRefreshLayout) findViewById(R.id.contact_deleted_refresh);
        this.f14403n = (TextView) findViewById(R.id.contact_deleted_tv_select_all);
        this.f14404o = (ImageView) findViewById(R.id.contact_deleted_iv_search);
        this.f14405p = (EditText) findViewById(R.id.edit_search);
        this.f14406q = (ImageView) findViewById(R.id.iv_search_clear);
        this.f14407r = (LinearLayout) findViewById(R.id.contact_deleted_ll_ad_container);
        ((InterceptTouchFrameLayout) findViewById(R.id.intercept_touch_fl)).setTopTouchListener(new x(this));
        this.f14403n.setOnClickListener(new j(this, 11));
        this.f14404o.setOnClickListener(this);
        this.f14406q.setOnClickListener(this);
        this.f14413x.setOnClickListener(this);
        this.f14402m.w(new qh.a(this));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_contact_deleted;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.n(R.id.top_view);
        eVar.f12030k.f11991f = true;
        eVar.h(R.color.colorPrimaryDark);
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        this.f14405p.setOnEditorActionListener(new b(this, 2));
        this.f14408s = new d(this, 3);
        this.f14405p.addTextChangedListener(new k.e(this, 6));
        SmartRefreshLayout smartRefreshLayout = this.f14402m;
        smartRefreshLayout.V = true;
        smartRefreshLayout.C = false;
        smartRefreshLayout.W = new x(this);
        this.f14400k.setLayoutManager(new LinearLayoutManager(1));
        bh.i iVar = new bh.i(this, 1);
        this.f14412w = iVar;
        iVar.f25009e = new wf.b(this, 26);
        this.f14400k.setAdapter(iVar);
        if (this.f22857a) {
            return;
        }
        g0();
    }

    @Override // uf.i
    public final void d0() {
        int i10 = dg.b.f12729j;
        String n10 = w.n("Nm8sdCxjOl8NZQdlBmVQQypuQmEKdCZzG293", "jvgxsJZt");
        dg.b.F(this, n10, n10);
    }

    public final void f0() {
        if (f.q(this)) {
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
        F = null;
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        ((Handler) l.f18199a.f26133a).removeCallbacksAndMessages(null);
    }

    public final void g0() {
        this.f14402m.B = false;
        if (this.C) {
            this.f14403n.setEnabled(false);
            this.f14413x.setEnabled(false);
            this.f14404o.setEnabled(false);
        } else {
            this.f14411v.sendEmptyMessageDelayed(20, 100L);
        }
        this.D.execute(new m(this, 25));
    }

    public final ArrayList h0() {
        ArrayList arrayList = new ArrayList(this.f14409t);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContactModel contactModel = (ContactModel) it.next();
            if (contactModel != null && contactModel.isSelect()) {
                arrayList2.add(contactModel);
            }
        }
        return arrayList2;
    }

    public final void i0() {
        this.f14403n.setVisibility(View.GONE);
        this.f14404o.setVisibility(View.GONE);
    }

    public final void j0() {
        EditText editText = this.f14405p;
        if (editText != null) {
            IBinder windowToken = editText.getWindowToken();
            og.a.p(windowToken, "windowToken");
            try {
                Object systemService = getSystemService(Context.INPUT_METHOD_SERVICE);
                og.a.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void k0(int i10, int i11) {
        if (j3.j.A(this)) {
            return;
        }
        int i12 = dg.b.f12729j;
        String n10 = w.n("Nm8sdCxjOl8NZQdlBmVQUiBjWXYMciZzOmMHZSlz", "UyKsOdZI");
        dg.b.F(this, n10, n10);
        if (dg.a.T(this.f14409t)) {
            String n11 = w.n("Em8ZdChjBV8GZV9lNmUxUjBjXnYmchVBCWw9cyZjKWUicw==", "ebSJOSKp");
            dg.b.F(this, n11, n11);
        }
        this.f14412w.N(false);
        this.f14411v.postDelayed(new o0.m(i11, 3, this), 200L);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        EditText editText = this.f14405p;
        if (editText == null || editText.getVisibility() != View.VISIBLE) {
            f0();
            return;
        }
        this.f14405p.setVisibility(View.GONE);
        this.f14406q.setVisibility(View.GONE);
        if (!TextUtils.isEmpty(this.f14405p.getText())) {
            this.f14405p.setText("");
        } else if (dg.a.V(this.f14409t)) {
            this.f14403n.setVisibility(View.VISIBLE);
            this.f14404o.setVisibility(View.VISIBLE);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (n.a(view.getId())) {
            return;
        }
        int id2 = view.getId();
        int i10 = 0;
        if (id2 == R.id.contact_deleted_iv_search) {
            int i11 = dg.b.f12729j;
            String n10 = w.n("em8gdAtjTV8cZQplIWVXU1dhNGMFX1ZsD2Nr", "Eo9Nj9TI");
            dg.b.F(this, n10, n10);
            this.f14402m.B = false;
            i0();
            this.f14405p.setVisibility(View.VISIBLE);
            this.f14406q.setVisibility(View.VISIBLE);
            this.f14405p.requestFocus();
            EditText editText = this.f14405p;
            og.a.p(editText, "editText");
            try {
                Object systemService = getSystemService(Context.INPUT_METHOD_SERVICE);
                og.a.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(editText, 1);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        ArrayList arrayList = this.f14409t;
        if (id2 == R.id.iv_search_clear) {
            if (!TextUtils.isEmpty(this.f14405p.getText())) {
                int i12 = dg.b.f12729j;
                String n11 = w.n("Em8ZdChjBV8GZV9lNmUxUzBhQ2MrXylhIGM2bCljHWkyaw==", "NSvq3wzW");
                dg.b.F(this, n11, n11);
                this.f14405p.setText("");
                return;
            }
            this.f14402m.B = true;
            if (dg.a.V(arrayList)) {
                this.f14403n.setVisibility(View.VISIBLE);
                this.f14404o.setVisibility(View.VISIBLE);
            }
            this.f14405p.setVisibility(View.GONE);
            this.f14406q.setVisibility(View.GONE);
            j0();
            this.f14412w.x();
            return;
        }
        if (id2 == R.id.contact_deleted_tv_recovery_count) {
            if (this.B == null) {
                this.B = new yf.g(this, i10);
            }
            yf.g gVar = this.B;
            gVar.f25628r = new y(this, i10);
            ua.b.n(this, gVar);
            int i13 = dg.b.f12729j;
            String n12 = w.n("Nm8sdCxjOl8NZQdlBmVQUiBjWXYMciZjDmkWaw==", "GPYJbu3p");
            dg.b.F(this, n12, n12);
            Iterator it = new ArrayList(arrayList).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = 1;
                    break;
                }
                ContactModel contactModel = (ContactModel) it.next();
                if (contactModel != null && !contactModel.isSelect()) {
                    break;
                }
            }
            if (i10 != 0) {
                String n13 = w.n("Nm8sdCxjOl8NZQdlBmVQUiBjWXYMciZBOWwzYzZpUms=", "VnK2UlZ1");
                dg.b.F(this, n13, n13);
            }
            String n14 = w.n("Em8ZdChjBV8QZVBvNGUnQSZrbnMrb3c=", "RfMvfO56");
            dg.b.F(this, n14, n14);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!tg.b.b(this)) {
            try {
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            } catch (Exception unused) {
            }
            finish();
        } else {
            if (f.q(this)) {
                te.a.C(3L);
            }
            nf.f.D(this.f14399j).h(new h(this, 17));
            l.f18199a.b(this, new c(this));
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        nf.f.D(this.f14399j).r(this);
        ua.b.m(this.f14415z);
        ua.b.m(this.B);
        super.onDestroy();
        this.f14411v.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean(w.n("KG8qdANjNV88ZQplIWVXX1tzGXMIYUdjDmkWZw==", "OKKDbAIH"), false)) {
            i0();
            this.f14405p.setVisibility(View.VISIBLE);
            this.f14406q.setVisibility(View.VISIBLE);
        }
        if (!dg.a.V(F)) {
            g0();
            return;
        }
        ArrayList arrayList = this.f14409t;
        arrayList.clear();
        arrayList.addAll(F);
        F.clear();
        String obj = this.f14405p.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f14411v.sendEmptyMessage(10);
        } else {
            this.f14408s.filter(obj);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        nf.f.D(this.f14399j).E(this, this.f14407r);
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        F = this.f14409t;
        bundle.putBoolean(w.n("Em87dFJjR188ZQplIWVXX1tzGXMIYUdjDmkWZw==", "WcqU33rU"), this.f14405p.getVisibility() == 0);
    }
}
