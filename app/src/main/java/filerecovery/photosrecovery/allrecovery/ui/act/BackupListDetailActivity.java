package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c1.d;
import c2.v;
import cj.w;
import com.gyf.immersionbar.e;
import eh.f;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import filerecovery.photosrecovery.allrecovery.manager.contact.ContactModel;
import filerecovery.photosrecovery.allrecovery.ui.dialog.ContactBackupRecoverDialog;
import filerecovery.photosrecovery.allrecovery.ui.widget.CommonContactEmptyView;
import filerecovery.photosrecovery.allrecovery.ui.widget.CommonWaLoadingView;
import filerecovery.photosrecovery.allrecovery.ui.widget.InterceptTouchFrameLayout;
import j3.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lh.l;
import u1.a;
import uf.i;
import y9.m;
import yg.b;

/* loaded from: classes2.dex */
public class BackupListDetailActivity extends i implements f {
    public static ArrayList C;
    public static final String D = w.n("M2EUazxwLmYrbFZfMmEhaA==", "bHmdwvSr");
    public CommonWaLoadingView A;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f14355k;

    /* renamed from: l, reason: collision with root package name */
    public CommonContactEmptyView f14356l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f14357m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f14358n;

    /* renamed from: o, reason: collision with root package name */
    public EditText f14359o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f14360p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f14361q;

    /* renamed from: t, reason: collision with root package name */
    public d f14364t;

    /* renamed from: v, reason: collision with root package name */
    public TextView f14366v;

    /* renamed from: w, reason: collision with root package name */
    public String f14367w;

    /* renamed from: x, reason: collision with root package name */
    public bh.i f14368x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f14369y;

    /* renamed from: z, reason: collision with root package name */
    public ContactBackupRecoverDialog f14370z;

    /* renamed from: j, reason: collision with root package name */
    public final String f14354j = w.n("E2EUazxwPWkxdHdlNmE8bBRjRWk1aT55", "qpMsAkUS");

    /* renamed from: r, reason: collision with root package name */
    public final ExecutorService f14362r = Executors.newSingleThreadExecutor();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f14363s = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final a f14365u = new a(this, 10);
    public boolean B = true;

    @Override // uf.i
    public final void V() {
        this.f14367w = getIntent().getStringExtra(D);
        findViewById(R.id.title_bar_iv_back).setOnClickListener(new yg.a(this, 0));
        ((InterceptTouchFrameLayout) findViewById(R.id.intercept_touch_fl)).setTopTouchListener(new v(this, 11));
        TextView textView = (TextView) findViewById(R.id.title_bar_tv_title);
        int i10 = 1;
        try {
            String str = this.f14367w;
            String[] strArr = z5.f.f26013a;
            textView.setText(str == null ? null : str.substring(str.lastIndexOf("/") + 1));
        } catch (Exception unused) {
        }
        this.f14366v = (TextView) findViewById(R.id.contact_backup_tv_recovery_count);
        this.f14369y = (TextView) findViewById(R.id.title_bar_tv_total_count);
        this.f14355k = (RecyclerView) findViewById(R.id.contact_backup_rv_content);
        CommonContactEmptyView commonContactEmptyView = (CommonContactEmptyView) findViewById(R.id.contact_backup_empty_view);
        this.f14356l = commonContactEmptyView;
        commonContactEmptyView.x(R.drawable.img_empty_contact_not_found, getString(R.string.arg));
        this.A = (CommonWaLoadingView) findViewById(R.id.contact_backup_loading_view);
        this.f14357m = (TextView) findViewById(R.id.contact_backup_tv_select_all);
        this.f14358n = (ImageView) findViewById(R.id.contact_backup_iv_search);
        this.f14359o = (EditText) findViewById(R.id.edit_search);
        this.f14360p = (ImageView) findViewById(R.id.iv_search_clear);
        this.f14361q = (LinearLayout) findViewById(R.id.contact_backup_ll_ad_container);
        this.f14357m.setOnClickListener(new yg.a(this, i10));
        this.f14366v.setOnClickListener(new yg.a(this, 2));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_backup_list_detail;
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
        this.f14359o.setOnEditorActionListener(new b(this, 0));
        this.f14364t = new d(this, 1);
        this.f14359o.addTextChangedListener(new k.e(this, 4));
        this.f14358n.setOnClickListener(new yg.a(this, 3));
        this.f14360p.setOnClickListener(new yg.a(this, 4));
        this.f14355k.setLayoutManager(new LinearLayoutManager(1));
        bh.i iVar = new bh.i(this, 0);
        this.f14368x = iVar;
        this.f14355k.setAdapter(iVar);
        this.f14368x.f25009e = new com.android.libsimilar.liveeventbus.b(this, 28);
        if (this.f22857a) {
            return;
        }
        this.f14365u.sendEmptyMessageDelayed(20, 100L);
        this.f14362r.execute(new m(this, 21));
    }

    @Override // uf.i
    public final void d0() {
        int i10 = dg.b.f12729j;
        String n10 = w.n("Em8ZdChjBV8AYVBrN3AWbzt0UGM3XzloJnc=", "IS4N3arP");
        dg.b.F(this, n10, n10);
    }

    public final ArrayList f0() {
        ArrayList arrayList = new ArrayList(this.f14363s);
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

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        ((Handler) l.f18199a.f26133a).removeCallbacksAndMessages(null);
    }

    public final void g0() {
        this.f14358n.setVisibility(View.GONE);
        this.f14357m.setVisibility(View.GONE);
    }

    public final void h0() {
        Context a10 = x5.b.a();
        IBinder windowToken = this.f14359o.getWindowToken();
        og.a.p(a10, "context");
        og.a.p(windowToken, "windowToken");
        try {
            Object systemService = a10.getSystemService(Context.INPUT_METHOD_SERVICE);
            og.a.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void i0(int i10, int i11) {
        if (j.A(this)) {
            return;
        }
        int i12 = dg.b.f12729j;
        String n10 = w.n("Em8ZdChjBV8AYVBrN3AHZTZvR2UxXzl1UWM3c3M=", "2RaYhG8t");
        dg.b.F(this, n10, n10);
        if (this.f14357m.isSelected()) {
            String n11 = w.n("Em8ZdChjBV8AYVBrN3AHZTZvR2UxXwtsFF8gdQtjM3Nz", "xShVUCec");
            dg.b.F(this, n11, n11);
        }
        runOnUiThread(new xf.f(this, 12));
        this.f14365u.postDelayed(new yf.i(this, i11, i10, 2), 200L);
    }

    public final void j0() {
        this.f14365u.removeMessages(20);
        this.A.a();
        this.f14356l.w();
        this.f14355k.setVisibility(View.VISIBLE);
        this.f14366v.setVisibility(View.VISIBLE);
        EditText editText = this.f14359o;
        if (editText != null && editText.getVisibility() == 0) {
            return;
        }
        this.f14358n.setVisibility(View.VISIBLE);
        this.f14357m.setVisibility(View.VISIBLE);
    }

    public final void k0() {
        this.f14365u.removeMessages(20);
        this.A.a();
        this.f14356l.setVisibility(View.VISIBLE);
        this.f14355k.setVisibility(View.GONE);
        g0();
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        EditText editText = this.f14359o;
        if (editText == null || editText.getVisibility() != View.VISIBLE) {
            finish();
            return;
        }
        this.f14359o.setVisibility(View.GONE);
        this.f14360p.setVisibility(View.GONE);
        if (!TextUtils.isEmpty(this.f14359o.getText())) {
            this.f14359o.setText("");
        } else if (dg.a.V(this.f14363s)) {
            this.f14358n.setVisibility(View.VISIBLE);
            this.f14357m.setVisibility(View.VISIBLE);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (tg.b.b(this) && og.a.T(this)) {
            nf.f.D(this.f14354j).h(new h(this, 14));
            l.f18199a.b(this, new d6.b(this, 26));
        } else {
            try {
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            } catch (Exception unused) {
            }
            finish();
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        nf.f.D(this.f14354j).r(this);
        ua.b.m(this.f14370z);
        super.onDestroy();
        this.f14365u.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        boolean z6 = bundle.getBoolean(w.n("Mm8ZdChjBV8mZV9lNmUxXzxzbnMmYThjGmk9Zw==", "rS80OxYN"), false);
        this.B = false;
        if (z6) {
            g0();
            this.f14359o.setVisibility(View.VISIBLE);
            this.f14360p.setVisibility(View.VISIBLE);
        }
        boolean V = dg.a.V(C);
        a aVar = this.f14365u;
        if (!V) {
            aVar.sendEmptyMessageDelayed(20, 100L);
            this.f14362r.execute(new m(this, 21));
            return;
        }
        ArrayList arrayList = this.f14363s;
        arrayList.clear();
        arrayList.addAll(C);
        C.clear();
        String obj = this.f14359o.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            aVar.sendEmptyMessage(10);
        } else {
            this.f14364t.filter(obj);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        nf.f.D(this.f14354j).E(this, this.f14361q);
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C = this.f14363s;
        String n10 = w.n("Fm8sdCxjOl8tZQdlBmVQXyxzaXMMYQtjMWkIZw==", "usEJYfQj");
        EditText editText = this.f14359o;
        bundle.putBoolean(n10, editText != null && editText.getVisibility() == 0);
    }
}
