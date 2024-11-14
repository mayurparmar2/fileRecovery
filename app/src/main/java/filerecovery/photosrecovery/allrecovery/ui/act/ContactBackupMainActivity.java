package filerecovery.photosrecovery.allrecovery.ui.act;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.s;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import dg.b;
import dg.f;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import gh.c;
import gh.d;
import java.util.ArrayList;
import k.j;
import lh.l;
import ra.g;
import ra.k;
import uf.i;
import yg.u;
import yg.v;
import yg.w;

/* loaded from: classes2.dex */
public class ContactBackupMainActivity extends i {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f14395m = 0;

    /* renamed from: j, reason: collision with root package name */
    public TabLayout f14396j;

    /* renamed from: k, reason: collision with root package name */
    public ViewPager f14397k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f14398l = new ArrayList();

    @Override // uf.i
    public final void V() {
        this.f14396j = (TabLayout) findViewById(R.id.contact_backup_main_tab_title);
        this.f14397k = (ViewPager) findViewById(R.id.contact_backup_main_vp);
        findViewById(R.id.contact_backup_main_iv_back).setOnClickListener(new j(this, 10));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_contact_backup_main;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
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
        String[] strArr = {getString(R.string.arg), getString(R.string.arg)};
        this.f14396j.setupWithViewPager(this.f14397k);
        ArrayList arrayList = this.f14398l;
        arrayList.add(og.a.A(getSupportFragmentManager(), new c(), 0));
        arrayList.add(og.a.A(getSupportFragmentManager(), new d(), 1));
        this.f14397k.setOffscreenPageLimit(arrayList.size());
        this.f14397k.setAdapter(new v(this, getSupportFragmentManager(), strArr));
        this.f14397k.b(new w(this, 0));
        this.f14396j.setSelectedTabIndicatorGravity(0);
        this.f14396j.a(new k(this, 2));
        g g10 = this.f14396j.g(0);
        g g11 = this.f14396j.g(1);
        g0(g10, true);
        g0(g11, false);
    }

    @Override // uf.i
    public final void d0() {
        ViewPager viewPager = this.f14397k;
        if (viewPager == null) {
            return;
        }
        if (viewPager.getCurrentItem() == 0) {
            int i10 = b.f12729j;
            String n10 = cj.w.n("Nm8sdCxjOl8KbwV0E2NAcxpzXm93", "FGcbxhNz");
            b.F(this, n10, n10);
        } else {
            int i11 = b.f12729j;
            String n11 = cj.w.n("Em8ZdChjBV8AYVBrN3AmXyZoXnc=", "UPH5QZlx");
            b.F(this, n11, n11);
        }
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
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        ((Handler) l.f18199a.f26133a).removeCallbacksAndMessages(null);
    }

    public final void g0(g gVar, boolean z6) {
        if (gVar == null) {
            return;
        }
        if (gVar.f20587e == null) {
            View inflate = View.inflate(this, R.layout.layout_contacts_backup_tab, null);
            ((TextView) inflate.findViewById(R.id.tab_tv_title)).setText(gVar.f20584b);
            gVar.f20587e = inflate;
            ra.j jVar = gVar.f20589g;
            if (jVar != null) {
                jVar.e();
            }
        }
        TextView textView = (TextView) gVar.f20587e.findViewById(R.id.tab_tv_title);
        textView.setSelected(z6);
        og.a.A0(textView, z6);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        ViewPager viewPager = this.f14397k;
        if (viewPager == null) {
            f0();
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        ArrayList arrayList = this.f14398l;
        if (!((arrayList.size() > currentItem ? (s) arrayList.get(this.f14397k.getCurrentItem()) : null) instanceof c)) {
            f0();
            return;
        }
        c cVar = c.P0;
        if (cVar != null) {
            EditText editText = cVar.C0;
            boolean z6 = true;
            if (editText != null && editText.getVisibility() == 0) {
                c.P0 = null;
                cVar.C0.setVisibility(View.GONE);
                cVar.D0.setVisibility(View.GONE);
                if (TextUtils.isEmpty(cVar.C0.getText())) {
                    cVar.B0.B = true;
                    if (dg.a.V(cVar.f15040w0)) {
                        cVar.t0();
                    }
                } else {
                    cVar.C0.setText("");
                }
                z6 = false;
            }
            if (!z6) {
                return;
            }
        }
        f0();
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!tg.b.b(this) || !og.a.T(this)) {
            try {
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            } catch (Exception unused) {
            }
            finish();
        } else {
            if (f.q(this)) {
                te.a.C(3L);
            }
            l.f18199a.b(this, new u(this));
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.P0 = null;
    }
}
