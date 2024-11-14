package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import cj.w;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import dg.b;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.h;
import filerecovery.photosrecovery.allrecovery.ui.act.ContactDeletedActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ContactRecoverMainActivity;
import lh.n;
import nf.f;
import uf.d;

/* loaded from: classes2.dex */
public class ContactRecoverMainActivity extends d {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f14416u = 0;

    /* renamed from: r, reason: collision with root package name */
    public final String f14417r = w.n("JW8DdCxjN1I9Ywl2MHJ-YVtu", "UJfmMCcq");

    /* renamed from: s, reason: collision with root package name */
    public boolean f14418s;

    /* renamed from: t, reason: collision with root package name */
    public LinearLayout f14419t;

    @Override // uf.i
    public final void V() {
        final int i10 = 0;
        findViewById(R.id.title_bar_iv_back).setOnClickListener(new View.OnClickListener(this) { // from class: yg.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactRecoverMainActivity f25806b;

            {
                this.f25806b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                ContactRecoverMainActivity contactRecoverMainActivity = this.f25806b;
                switch (i11) {
                    case 0:
                        int i12 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.finish();
                        break;
                    case 1:
                        int i13 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.getClass();
                        if (!lh.n.a(view.getId())) {
                            int i14 = dg.b.f12729j;
                            String n10 = cj.w.n("Em8ZdChjBV8HbkdyO1A0ZzBfdWUvZT5lBl9RbApjaw==", "b2c0mwVF");
                            dg.b.F(contactRecoverMainActivity, n10, n10);
                            contactRecoverMainActivity.startActivityForResult(new Intent(contactRecoverMainActivity, (Class<?>) ContactDeletedActivity.class), 9010);
                            break;
                        }
                        break;
                    default:
                        int i15 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.getClass();
                        if (!lh.n.a(view.getId())) {
                            int i16 = dg.b.f12729j;
                            String n11 = cj.w.n("Nm8sdCxjOl8Mbh9yC1BVZyBfdW8HdBhjTF8PbC5jaw==", "WEYN8lGs");
                            dg.b.F(contactRecoverMainActivity, n11, n11);
                            contactRecoverMainActivity.f14418s = true;
                            contactRecoverMainActivity.h0();
                            break;
                        }
                        break;
                }
            }
        });
        this.f14419t = (LinearLayout) findViewById(R.id.contact_main_ll_ad_layout);
        final int i11 = 1;
        findViewById(R.id.contact_main_cl_deleted_root).setOnClickListener(new View.OnClickListener(this) { // from class: yg.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactRecoverMainActivity f25806b;

            {
                this.f25806b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                ContactRecoverMainActivity contactRecoverMainActivity = this.f25806b;
                switch (i112) {
                    case 0:
                        int i12 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.finish();
                        break;
                    case 1:
                        int i13 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.getClass();
                        if (!lh.n.a(view.getId())) {
                            int i14 = dg.b.f12729j;
                            String n10 = cj.w.n("Em8ZdChjBV8HbkdyO1A0ZzBfdWUvZT5lBl9RbApjaw==", "b2c0mwVF");
                            dg.b.F(contactRecoverMainActivity, n10, n10);
                            contactRecoverMainActivity.startActivityForResult(new Intent(contactRecoverMainActivity, (Class<?>) ContactDeletedActivity.class), 9010);
                            break;
                        }
                        break;
                    default:
                        int i15 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.getClass();
                        if (!lh.n.a(view.getId())) {
                            int i16 = dg.b.f12729j;
                            String n11 = cj.w.n("Nm8sdCxjOl8Mbh9yC1BVZyBfdW8HdBhjTF8PbC5jaw==", "WEYN8lGs");
                            dg.b.F(contactRecoverMainActivity, n11, n11);
                            contactRecoverMainActivity.f14418s = true;
                            contactRecoverMainActivity.h0();
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 2;
        findViewById(R.id.contact_main_cl_backup_root).setOnClickListener(new View.OnClickListener(this) { // from class: yg.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactRecoverMainActivity f25806b;

            {
                this.f25806b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                ContactRecoverMainActivity contactRecoverMainActivity = this.f25806b;
                switch (i112) {
                    case 0:
                        int i122 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.finish();
                        break;
                    case 1:
                        int i13 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.getClass();
                        if (!lh.n.a(view.getId())) {
                            int i14 = dg.b.f12729j;
                            String n10 = cj.w.n("Em8ZdChjBV8HbkdyO1A0ZzBfdWUvZT5lBl9RbApjaw==", "b2c0mwVF");
                            dg.b.F(contactRecoverMainActivity, n10, n10);
                            contactRecoverMainActivity.startActivityForResult(new Intent(contactRecoverMainActivity, (Class<?>) ContactDeletedActivity.class), 9010);
                            break;
                        }
                        break;
                    default:
                        int i15 = ContactRecoverMainActivity.f14416u;
                        contactRecoverMainActivity.getClass();
                        if (!lh.n.a(view.getId())) {
                            int i16 = dg.b.f12729j;
                            String n11 = cj.w.n("Nm8sdCxjOl8Mbh9yC1BVZyBfdW8HdBhjTF8PbC5jaw==", "WEYN8lGs");
                            dg.b.F(contactRecoverMainActivity, n11, n11);
                            contactRecoverMainActivity.f14418s = true;
                            contactRecoverMainActivity.h0();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_contact_recover_main;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.color_100_white_262626);
        eVar.l(R.color.color_100_white_262626);
        eVar.c();
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
    }

    @Override // uf.i
    public final void d0() {
        int i10 = b.f12729j;
        String n10 = w.n("Em8ZdChjBV8HbkdyO1A0ZzBfQmgsdw==", "9LqGxl6S");
        b.F(this, n10, n10);
    }

    @Override // uf.d
    public final int j0() {
        return 10;
    }

    @Override // uf.d
    public final Intent k0() {
        return new Intent(this, (Class<?>) ContactRecoverMainActivity.class);
    }

    @Override // uf.d
    public final boolean l0() {
        boolean z6 = this.f14418s;
        this.f14418s = false;
        return z6;
    }

    @Override // uf.d
    public final void m0() {
        if (n.a(hashCode())) {
            return;
        }
        startActivityForResult(new Intent(this, (Class<?>) ContactBackupMainActivity.class), 9010);
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (tg.b.b(this)) {
            f.D(this.f14417r).h(new h(this, 18));
        } else {
            finish();
        }
    }

    @Override // uf.d, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        f.D(this.f14417r).r(this);
        super.onDestroy();
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        f.D(this.f14417r).x(this, this.f14419t, R.color.color_100_white_262626, R.color.color_100_D6E1F6_373737);
    }
}
