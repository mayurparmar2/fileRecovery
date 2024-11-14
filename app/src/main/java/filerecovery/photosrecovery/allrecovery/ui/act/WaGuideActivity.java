package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.s;
import androidx.viewpager2.widget.ViewPager2;
import com.gyf.immersionbar.a;
import com.gyf.immersionbar.e;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import gh.t;
import gh.u;
import j.d;
import java.util.ArrayList;
import java.util.List;
import uf.i;
import yg.c0;
import yg.l0;
import yh.b;

/* loaded from: classes2.dex */
public class WaGuideActivity extends i {

    /* renamed from: j, reason: collision with root package name */
    public ViewPager2 f14516j;

    /* renamed from: k, reason: collision with root package name */
    public int f14517k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14518l;

    @Override // uf.i
    public final void V() {
        this.f14516j = (ViewPager2) findViewById(R.id.wa_guide_vp);
        findViewById(R.id.wa_guide_iv_back).setOnClickListener(new d(this, 20));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_wa_guide;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.ad_color_transparent);
        eVar.l(R.color.color_100_FBFAF8_121B22);
        eVar.c();
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        ArrayList arrayList = new ArrayList();
        this.f14518l = b.b().f25844p0;
        this.f14517k = b.b().f25846q0;
        if (!this.f14518l) {
            s f02 = f0(0, new t());
            if (f02 instanceof t) {
                t tVar = (t) f02;
                tVar.f15096t0 = new h.a(this, 29);
                arrayList.add(tVar);
            }
            s f03 = f0(1, new u());
            if (f03 instanceof u) {
                u uVar = (u) f03;
                uVar.f15097t0 = new c0(this);
                arrayList.add(uVar);
            }
        }
        s f04 = f0(this.f14518l ? 0 : 2, new gh.s());
        if (f04 instanceof gh.s) {
            arrayList.add((gh.s) f04);
        }
        this.f14516j.setOffscreenPageLimit(arrayList.size());
        this.f14516j.setUserInputEnabled(false);
        ((List) this.f14516j.f2201c.f2183b).add(new androidx.viewpager2.adapter.b(this, 4));
        this.f14516j.setAdapter(new l0(this, arrayList));
        if (this.f14518l) {
            return;
        }
        this.f14516j.b(this.f14517k, false);
    }

    public final s f0(int i10, bg.a aVar) {
        s D = getSupportFragmentManager().D(e2.s.k("Zg==", "fR2p4l34", new StringBuilder(), i10));
        return D != null ? D.getClass() != aVar.getClass() ? aVar : D : D == null ? aVar : D;
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (intent == null || intent.getData() == null) {
            return;
        }
        String intent2 = intent.toString();
        String[] strArr = com.bumptech.glide.d.f4525a;
        for (int i12 = 0; i12 < 5; i12++) {
            if (intent2.contains(strArr[i12])) {
                try {
                    getContentResolver().takePersistableUriPermission(intent.getData(), intent.getFlags() & 3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        ViewPager2 viewPager2 = this.f14516j;
        if (viewPager2 == null) {
            super.onBackPressed();
            return;
        }
        int currentItem = viewPager2.getCurrentItem();
        if (currentItem == 0) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else if (currentItem > 0) {
            this.f14516j.b(currentItem - 1, true);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nd.a.c(this);
        kd.a.c(this);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        for (s sVar : getSupportFragmentManager().f1551c.f()) {
            if (sVar != null) {
                sVar.M(i10, strArr, iArr);
            }
        }
    }
}
