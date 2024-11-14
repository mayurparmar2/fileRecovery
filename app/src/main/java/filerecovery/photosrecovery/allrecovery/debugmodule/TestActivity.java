package filerecovery.photosrecovery.allrecovery.debugmodule;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import cj.w;
import ck.a;
import com.android.dev.libfile.FileTest;
import com.bumptech.glide.d;

import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.activity.LanguageEntranceActivity;
import filerecovery.photosrecovery.allrecovery.activity.RecoveryFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.JunkCleanFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.MediaDeleteFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ResultForDirActivity;
import j.h;
import j.p;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kj.c;
import lh.q;
import mj.i;
import o0.n;
import w8.g;
import wg.b;
import xf.v;

/* loaded from: classes2.dex */
public class TestActivity extends p implements View.OnClickListener {
    public TextView A;
    public EditText A0;
    public TextView B;
    public EditText B0;
    public TextView C;
    public EditText C0;
    public TextView D;
    public EditText D0;
    public boolean E;
    public EditText E0;
    public boolean F;
    public TextView F0;
    public boolean G;
    public TextView G0;
    public boolean H;
    public TextView H0;
    public boolean I;
    public TextView I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public TextView K0;
    public boolean L;
    public Button L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public EditText N0;
    public boolean O;
    public Button O0;
    public boolean P;
    public TextView P0;
    public boolean Q;
    public TextView Q0;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public Button f14253a;

    /* renamed from: b, reason: collision with root package name */
    public Button f14254b;

    /* renamed from: c, reason: collision with root package name */
    public Button f14255c;

    /* renamed from: d, reason: collision with root package name */
    public Button f14256d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f14257e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f14258f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f14259g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f14260h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f14261i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f14262j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f14263k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f14264l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f14265m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f14266n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f14267o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f14268p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f14269q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f14270r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14271s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14272t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f14273t0;

    /* renamed from: u, reason: collision with root package name */
    public TextView f14274u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f14275u0;

    /* renamed from: v, reason: collision with root package name */
    public TextView f14276v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f14277v0;

    /* renamed from: w, reason: collision with root package name */
    public TextView f14278w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f14279w0;

    /* renamed from: x, reason: collision with root package name */
    public TextView f14280x;

    /* renamed from: x0, reason: collision with root package name */
    public EditText f14281x0;

    /* renamed from: y, reason: collision with root package name */
    public TextView f14282y;

    /* renamed from: y0, reason: collision with root package name */
    public EditText f14283y0;

    /* renamed from: z, reason: collision with root package name */
    public TextView f14284z;

    /* renamed from: z0, reason: collision with root package name */
    public EditText f14285z0;

    public static void U(boolean z6, TextView textView, String str) {
        if (z6) {
            textView.setBackgroundColor(Color.parseColor(w.n("cmYROXBjEjAw", "aJfPMzM2")));
            textView.setText(str.concat(w.n("a-XLgA==", "0zTFehRd")));
        } else {
            textView.setBackgroundColor(Color.parseColor(w.n("WzlTOQA5OQ==", "Moxj9WxD")));
            textView.setText(str.concat(w.n("a-Xysw==", "eyl25BlR")));
        }
    }

    public static void V(boolean z6, TextView textView, String str) {
        if (z6) {
            textView.setBackgroundColor(Color.parseColor(w.n("emYFZhc0WzQ0", "TsYcqoKd")));
            textView.setText(str.concat(w.n("eOXVgA==", "HWBiHEDX")));
        } else {
            textView.setBackgroundColor(Color.parseColor(w.n("cjlOOXA5OQ==", "pQofA7B5")));
            textView.setText(str.concat(w.n("T-XHsw==", "pzvUtgCn")));
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 != -1 || intent == null) {
            return;
        }
        Uri data = intent.getData();
        String J = i.J(this, data);
        if (TextUtils.isEmpty(J)) {
            Toast.makeText(this, w.n("LGVDUBl0UCAxc0ZuIGxfLBJ1NGlNPSA=", "GlK7x8gJ") + data, Toast.LENGTH_LONG).show();
            return;
        }
        File file = new File(J);
        if (!file.exists()) {
            Toast.makeText(this, w.n("N2kbZWluHnRiZUtpMXRz", "a9keKGrl"), Toast.LENGTH_LONG).show();
            return;
        }
        if (!file.isFile()) {
            Toast.makeText(this, w.n("OHNXbiYgF2kuZQ==", "SIMqeur1"), Toast.LENGTH_LONG).show();
            return;
        }
        String b10 = FileTest.a(this).b(J);
        ArrayList arrayList = new ArrayList();
        Pair h10 = b.h(file, 8);
        if (h10 != null) {
            arrayList.add(h10);
        }
        Pair h11 = b.h(file, 2);
        if (h11 != null) {
            arrayList.add(h11);
        }
        Pair h12 = b.h(file, 1);
        if (h12 != null) {
            arrayList.add(h12);
        }
        Pair h13 = b.h(file, 3);
        if (h13 != null) {
            arrayList.add(h13);
        }
        String a10 = b.a(file);
        q.c(w.n("LWkbZS1zK2E2XxJhZw==", "EYKwrH2P"), w.n("k6PC5viLq4fz5v2HlruC5eG00rjT78Wa", "b2XiOWPD") + a10);
        if (arrayList.size() == 0) {
            this.P0.setText(w.n("t4nc5saPl6Dj6ZmMpbvG5suc3rzZ5taqjaDV6d-M04frCn3k8bmUk-fmk6GrqtnnyZ_Urt3n-7uOnv_vyZo=", "ktu6C3P0") + b10);
            return;
        }
        this.P0.setText(w.n("k4np5sKPqKDo6cGMlbun5tuc2bya", "AmOBbnhp"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null) {
                this.P0.append(w.n("OGkuZRN5KWV4PSA=", "9eUCGYFt") + ((String) pair.second) + w.n("vrz_Lg==", "a9XP2vNF") + ((String) pair.first) + w.n("vrz-Cg==", "ZBlTaSfs"));
            }
        }
        this.P0.append(w.n("f-T6uaiT6-bpoYKq_ueon6CuqOfYu5ye7e_kmg==", "sDQUfXk1") + b10);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        String n10 = w.n("na_158-5q4fy4uuUkICg6eS234PB4vmUjIDE47aQ3YXG6dWtpKH76dSiiIDjINKMzOmkrg==", "NvABnP68");
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 != 25) {
                Toast.makeText(this, n10, Toast.LENGTH_LONG).show();
                return;
            }
            int i11 = c.f17512b;
            Toast makeText = Toast.makeText(this, n10, Toast.LENGTH_LONG);
            View view = makeText.getView();
            kj.b bVar = new kj.b(this, makeText);
            if (i10 == 25) {
                try {
                    Field declaredField = View.class.getDeclaredField("mContext");
                    declaredField.setAccessible(true);
                    declaredField.set(view, bVar);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            new c(this, makeText).show();
        } catch (Error e10) {
            e10.printStackTrace();
            nc.c.D().O(e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            nc.c.D().O(e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.banner_real) {
            boolean z6 = !this.J0;
            this.J0 = z6;
            if (z6) {
                n.o("EWZeMHJkLGZm", "G328BHRP", this.H0);
                this.H0.setText(w.n("k5j85-m6IGE9aR1lMGFabiByDObxrw==", "ZRZeRkMN"));
            } else {
                n.o("cjlOOXA5OQ==", "3WUITNQa", this.H0);
                this.H0.setText(w.n("t5jJ5-26H2E2aUVlAGE7bjByC-XTpik=", "0ODNoUJP"));
            }
            yh.b.b().d0 = this.J0;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_show_native_ad_bg) {
            boolean z10 = !this.M0;
            this.M0 = z10;
            if (z10) {
                n.o("VmYkMH1kKmZm", "yWUr2NFK", this.I0);
                this.I0.setText(w.n("k5jt5d2mqJj358-6HGFAaTNl07nW5eiK2YP55sCv3onHOqSYrw==", "wWpl1uY6"));
            } else {
                n.o("Vjl7OXQ5OQ==", "3kCE6lcr", this.I0);
                this.I0.setText(w.n("0Jj35cGmhZjm58K6O2FHaURlo7nS5aSKjoP05q-voomEOr2Q9yk=", "1N6XQcP7"));
            }
            yh.b.b().f25822e0 = this.M0;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.close_test) {
            yh.b.b().f25816b = false;
            yh.b.b().d();
            v.a().G = false;
            v.a().getClass();
            lh.c.a().f18159b = false;
            a aVar = a.f3817d;
            aVar.getClass();
            a.f3819f.z(aVar, a.f3818e[23], Boolean.TRUE);
            finish();
            return;
        }
        if (view.getId() == R.id.close) {
            String obj = this.f14281x0.getText().toString();
            String obj2 = this.f14283y0.getText().toString();
            String obj3 = this.f14285z0.getText().toString();
            String obj4 = this.A0.getText().toString();
            String obj5 = this.B0.getText().toString();
            String obj6 = this.C0.getText().toString();
            String obj7 = this.D0.getText().toString();
            String obj8 = this.E0.getText().toString();
            try {
                yh.b.b().f25823f = Integer.parseInt(obj);
                yh.b.b().f25825g = Integer.parseInt(obj2);
                yh.b.b().f25827h = Integer.parseInt(obj3);
                yh.b.b().f25829i = Integer.parseInt(obj4);
                yh.b.b().f25831j = Integer.parseInt(obj5);
                yh.b.b().f25833k = Integer.parseInt(obj6);
                yh.b.b().f25815a0 = Integer.parseInt(obj7);
                yh.b.b().S = Integer.parseInt(obj8);
                yh.b.b().d();
                v.a().getClass();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            finish();
            return;
        }
        if (view.getId() == R.id.layout_debug_test_ad) {
            xf.w wVar = new xf.w(this);
            ((h) wVar.f16206b).f16121d = w.n("tIjw5sSilI3j57qHpLXe6PqV", "FCtnfTSa");
            String[] strArr = {w.n("t4n35tWJlLn95aKK", "SjxkxrGR"), w.n("BmQKbyAgOGQuYQhjZQ==", "IFGgBy7p"), w.n("L0s=", "zly7KJfo"), w.n("HmUOZg==", "jlMbs9wg"), w.n("N2Fu", "EgqLzOjT"), w.n("Am0WYT1v", "GUSnlcOG")};
            g gVar = new g(this, 3);
            h hVar = (h) wVar.f16206b;
            hVar.f16130m = strArr;
            hVar.f16132o = gVar;
            wVar.i().show();
            return;
        }
        if (view.getId() == R.id.layout_debug_test_full_ad) {
            d.O(this);
            return;
        }
        if (view.getId() == R.id.layout_debug_test_intent_guide) {
            yh.b.b().f25819c0 = true;
            yh.b.b().W = true;
            yh.b.b().f25824f0 = true;
            yh.b.b().f25850s0 = true;
            yh.b.b().f25848r0 = 0;
            yh.b.b().f25854u0 = true;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.layout_debug_test_err) {
            throw null;
        }
        if (view.getId() == R.id.layout_intent_delete_finished) {
            Intent intent = new Intent(this, (Class<?>) MediaDeleteFinishActivity.class);
            intent.putExtra(w.n("N2kbZRZuBG0=", "v1iFsqaC"), 30);
            intent.putExtra(w.n("N2kbZRZ0CHBl", "IplNS9xD"), 2);
            startActivityForResult(intent, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
            return;
        }
        if (view.getId() == R.id.layout_intent_recover_finished) {
            Intent intent2 = new Intent(this, (Class<?>) RecoveryFinishActivity.class);
            intent2.putExtra(w.n("N2kbZRZuBG0=", "hC5QLD2F"), 30);
            intent2.putExtra(w.n("E2kuZRJlPHIWbh5t", "BFsnGksk"), 20);
            intent2.putExtra(w.n("N2kbZRZ0CHBl", "gVUNQvSB"), 1);
            startActivityForResult(intent2, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
            return;
        }
        if (view.getId() == R.id.layout_intent_recover_finished_1) {
            Intent intent3 = new Intent(this, (Class<?>) RecoveryFinishActivity.class);
            intent3.putExtra(w.n("N2kbZRZuBG0=", "R0SdjW83"), 30);
            intent3.putExtra(w.n("N2kbZRZlA3IdbkZt", "4hlxSzmK"), 1);
            intent3.putExtra(w.n("E2kuZRJ0N3Bl", "sW23lMdW"), 1);
            startActivityForResult(intent3, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
            return;
        }
        if (view.getId() == R.id.layout_intent_clean_finished) {
            JunkCleanFinishActivity.g0(this, 4, 100, 40000L);
            return;
        }
        if (view.getId() == R.id.layout_intent_deep_clean_finished) {
            JunkCleanFinishActivity.g0(this, 5, 100, 40000L);
            return;
        }
        if (view.getId() == R.id.layout_intent_screenshots_finished) {
            JunkCleanFinishActivity.g0(this, 7, 100, 40000L);
            return;
        }
        if (view.getId() == R.id.layout_intent_big_videos_finished) {
            JunkCleanFinishActivity.g0(this, 6, 100, 40000L);
            return;
        }
        if (view.getId() == R.id.layout_intent_photo_preview) {
            wf.i iVar = new wf.i();
            iVar.f24710e = 89898878L;
            iVar.f24706a = w.n("JWUEdGdwH2c=", "Kyy5Kpbd");
            iVar.f24707b = w.n("JWUEdGZ0FHM2L0dlMXR7cDtn", "bFP7F5VF");
            iVar.f24709d = 100000L;
            lf.g.n0(this, 2, false, iVar);
            return;
        }
        if (view.getId() == R.id.layout_intent_audio_preview) {
            wf.i iVar2 = new wf.i();
            iVar2.f24710e = 89898878L;
            iVar2.f24717l = 100000;
            iVar2.f24706a = w.n("JWUEdGdtATM=", "Hf0lFoHR");
            iVar2.f24707b = w.n("E2U5dGx0B3MsLxJlJnQdbUIz", "9QgJCbsN");
            iVar2.f24709d = 100000L;
            lf.g.n0(this, 3, false, iVar2);
            return;
        }
        if (view.getId() == R.id.layout_intent_video_preview) {
            wf.i iVar3 = new wf.i();
            iVar3.f24710e = 89898878L;
            iVar3.f24706a = w.n("JWUEdGdtATQ=", "65MTbbBV");
            iVar3.f24707b = w.n("JWUEdGZ0FHM2L0dlMXR7bSU0", "Wt8hfgS0");
            iVar3.f24709d = 100000L;
            iVar3.f24717l = 100000;
            lf.g.n0(this, 1, false, iVar3);
            return;
        }
        if (view.getId() == R.id.layout_intent_first_language) {
            yh.b.b().f25819c0 = true;
            Intent intent4 = new Intent(this, (Class<?>) LanguageEntranceActivity.class);
            intent4.putExtra(w.n("OHMxciZtNWUgdWc=", "F0APXDa5"), true);
            startActivity(intent4);
            return;
        }
        if (view.getId() == R.id.layout_intent_dir_activity) {
            ArrayList arrayList = new ArrayList();
            wf.i iVar4 = new wf.i();
            iVar4.f24710e = 89898878L;
            iVar4.f24706a = w.n("AWUxdGNwIGc=", "soEDP6hc");
            iVar4.f24707b = w.n("AWUxdGJ0K3M9Lx9lAXQacCtn", "tc2VL42r");
            iVar4.f24709d = 100000L;
            arrayList.add(iVar4);
            hh.c.f15633f.add(new ih.a(w.n("AWUxdA==", "QisnUKcF"), arrayList, arrayList.size(), 2));
            Intent intent5 = new Intent(this, (Class<?>) ResultForDirActivity.class);
            intent5.putExtra(w.n("E2k0ZSx0S3Bl", "9RuXs27W"), 2);
            startActivity(intent5);
            return;
        }
        if (view.getId() == R.id.layout_recover_failed) {
            og.a.G0(this, getString(R.string.arg));
            return;
        }
        if (view.getId() == R.id.log_open) {
            boolean z11 = !this.E;
            this.E = z11;
            if (z11) {
                this.f14257e.setBackgroundColor(-65536);
                this.f14257e.setText(w.n("k5jt5d2mq7zJ5fuvl4Wc5fSAWm8OOpy8gA==", "ZDioRVsF"));
            } else {
                n.o("Vjl7OXQ5OQ==", "xCTX2jE4", this.f14257e);
                this.f14257e.setText(w.n("k5jt5d2mq7zJ5fuvl4Wc5fSAWm8OOpyFsw==", "geeVrFOh"));
            }
            yh.b.b().f25839n = this.E;
            yh.b.b().d();
            lh.c.a().f18159b = this.E;
            return;
        }
        if (view.getId() == R.id.banner_1) {
            boolean z12 = !this.F;
            this.F = z12;
            if (z12) {
                n.o("cmYRM3piRGU1", "uS0es0hf", this.f14258f);
                this.f14258f.setText(w.n("M2EZbixyLunkltqh9-XvlbyDmTqmvIA=", "275ZjJG7"));
            } else {
                n.o("azkOOWs5OQ==", "fvH7RsgH", this.f14258f);
                this.f14258f.setText(w.n("M2EZbixyLunkltqh9-XvlbyDmTqmhbM=", "EjmZq2S6"));
            }
            yh.b.b().f25841o = this.F;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_2) {
            boolean z13 = !this.G;
            this.G = z13;
            if (z13) {
                n.o("EGZfMwBieGU1", "NL393Mll", this.f14259g);
                this.f14259g.setText(w.n("F2EsbihyEebfh4-7xOWQuayhg-nItpCD3TqTvIA=", "GJjUuvNQ"));
            } else {
                n.o("cjlOOXA5OQ==", "OpJynd3S", this.f14259g);
                this.f14259g.setText(w.n("JmENbjxyNebOh4K74-WXuduh8-nMttyDzjqdhbM=", "7MDcYjij"));
            }
            yh.b.b().f25843p = this.G;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_3) {
            boolean z14 = !this.H;
            this.H = z14;
            if (z14) {
                n.o("cmYRM3piRGU1", "aW1NdHfc", this.f14260h);
                this.f14260h.setText(w.n("M2EZbixyLuf5k9We3un0tbC6pOnAqHDljIA=", "0Zv5bDLZ"));
            } else {
                n.o("cjlOOXA5OQ==", "02wfHSMu", this.f14260h);
                this.f14260h.setText(w.n("M2EZbixyLuf5k9We3un0tbC6pOnAqHDltrM=", "3O0R6JtE"));
            }
            yh.b.b().f25845q = this.H;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_4) {
            boolean z15 = !this.I;
            this.I = z15;
            if (z15) {
                n.o("cmYRM3piRGU1", "P8CuSdqV", this.f14261i);
                this.f14261i.setText(w.n("BGE3bjVyDuXQoI-Z8WxcYVZpKGeIuqDp5ahC5YqA", "HUfYPQy7"));
            } else {
                n.o("SjkAOV45OQ==", "AXi9gDGg", this.f14261i);
                this.f14261i.setText(w.n("M2EZbixyLuXKoNqZ5mw6YTFpX2emut_p7qh55cSz", "mCA51s1E"));
            }
            yh.b.b().f25847r = this.I;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_5) {
            boolean z16 = !this.J;
            this.J = z16;
            if (z16) {
                n.o("cmYRM3piRGU1", "HazeHCLv", this.f14262j);
                this.f14262j.setText(w.n("F2EsbihyEebIoo6k_2xbYSFpWGeMuuzp0qhw5dKA", "jc2uQJnd"));
            } else {
                n.o("cjlOOXA5OQ==", "gLSkMGsc", this.f14262j);
                this.f14262j.setText(w.n("M2EZbixyLubDotakz2w6YTFpX2emut_py6gI5eOz", "H2f2JQQS"));
            }
            yh.b.b().f25849s = this.J;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_6) {
            boolean z17 = !this.K;
            this.K = z17;
            if (z17) {
                n.o("cmYRM3piRGU1", "JO30TSpW", this.f14263k);
                this.f14263k.setText(w.n("F2EsbihyEebIoo6k_-aih6G7gOTWnZyt7-nStbG60-n2qHjl8YA=", "1RIkwsTF"));
            } else {
                n.o("Vjl7OXQ5OQ==", "4cbtDFRM", this.f14263k);
                this.f14263k.setText(w.n("M2EZbixyLubDotakz-bDh7G7h-T8na-t7umUtaO67-nSqE3lzLM=", "v5FzgeZo"));
            }
            yh.b.b().f25851t = this.K;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.banner_7) {
            boolean z18 = !this.L;
            this.L = z18;
            if (z18) {
                n.o("RGYXM1dicWU1", "NYgqdDtd", this.f14264l);
                this.f14264l.setText(w.n("F2EsbihyEebxhYyQ9OevuKG8iub_h5278ueNk4Ce1unUtae62OnNqHPl14A=", "4u1FD6fJ"));
            } else {
                n.o("SjlyOUg5OQ==", "ntiKqdWm", this.f14264l);
                this.f14264l.setText(w.n("F2EsbihyEebxhYyQ9OevuKG8iub_h5274Of5k4Ge_unUtae62OnNqHPl7rM=", "XVDwVBgb"));
            }
            yh.b.b().f25853u = this.L;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.nc_1) {
            boolean z19 = !this.M;
            this.M = z19;
            if (z19) {
                n.o("cmYRZi9iEzMz", "kJHHMaM6", this.f14265m);
                this.f14265m.setText(w.n("kKTl5cChEebAq42P_emVtaC6o-nqqEPlioA=", "QDTX6uy3"));
            } else {
                n.o("cjlOOXA5OQ==", "74T50BfO", this.f14265m);
                this.f14265m.setText(w.n("kKTl5cChEebAq42P_emVtaC6o-nqqEPl6rM=", "bjQYo8OO"));
            }
            yh.b.b().f25855v = this.M;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.nc_2) {
            boolean z20 = !this.N;
            this.N = z20;
            if (z20) {
                n.o("cmYRZi9iEzMz", "2aaUzMjv", this.f14266n);
                this.f14266n.setText(w.n("tKTC5cWhEeXQoI-Z8eWdjNSI1unMtdC68-n7qAzl9oA=", "x2QeHN63"));
            } else {
                n.o("Vjl7OXQ5OQ==", "IBsXwpOc", this.f14266n);
                this.f14266n.setText(w.n("naSW5fWhZuXQoI-Z8eWdjNSI1unMtdC68-n7qAzlz7M=", "IMx1x9cg"));
            }
            yh.b.b().f25857w = this.N;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.nc_3) {
            boolean z21 = !this.O;
            this.O = z21;
            if (z21) {
                n.o("cmYRZi9iEzMz", "0S6IuplR", this.f14267o);
                this.f14267o.setText(w.n("tKTQ5cShLubDotakz-X7jLOIoenita-64On7qFTl74A=", "uxnSPGHj"));
            } else {
                n.o("Vjl7OXQ5OQ==", "OQLZwpgm", this.f14267o);
                this.f14267o.setText(w.n("kKTl5cChEebIoo6k_-WajKOIpunItZy65-nHqFnl17M=", "T8itrDcR"));
            }
            yh.b.b().f25858x = this.O;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.reward_1) {
            boolean z22 = !this.P;
            this.P = z22;
            if (z22) {
                n.o("cmYRYSg2R2Nj", "SfXrk87n", this.f14268p);
                this.f14268p.setText(w.n("k7_C5cexpqfP6cmRLeePk6OequnItZ-B-OXdjWvl-IA=", "IPpBZyQD"));
            } else {
                n.o("cjlOOXA5OQ==", "NPTyU8F0", this.f14268p);
                this.f14268p.setText(w.n("t7_35cOxmafE6ZGRHefuk7OerenitayB-uXBjXTl4LM=", "XeNe0AGO"));
            }
            yh.b.b().A = this.P;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.reward_2) {
            boolean z23 = !this.Q;
            this.Q = z23;
            if (z23) {
                n.o("cmZfYQc2AWNj", "UgQ9f7JB", this.f14269q);
                this.f14269q.setText(w.n("k7_C5cexpqfP6cmRLemWhK2nvunItZ-B7eXAjUDl-YA=", "bzwTOdzE"));
            } else {
                n.o("cjlOOXA5OQ==", "Riuzezi0", this.f14269q);
                this.f14269q.setText(w.n("0b_K5eOxgKfe6cSRCumRhNqnzunMtdOBxOXcjQzlz7M=", "ou7JihgW"));
            }
            yh.b.b().B = this.Q;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.reward_3) {
            boolean z24 = !this.R;
            this.R = z24;
            if (z24) {
                n.o("cmYRYSg2R2Nj", "kSWq5Mia", this.f14270r);
                this.f14270r.setText(w.n("t7_35cOxmafE6ZGRHebthbKQt-fYuK683ebFh6K77OnwtZKI6enopHjlj4A=", "aSFZ4jtK"));
            } else {
                n.o("cjlOOXA5OQ==", "Va9nWFUZ", this.f14270r);
                this.f14270r.setText(w.n("t7_35cOxmafE6ZGRHebthbKQt-fYuK68iObyh4678OnwtZKI6enopHjltrM=", "4djFf559"));
            }
            yh.b.b().C = this.R;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.reward_4) {
            boolean z25 = !this.S;
            this.S = z25;
            if (z25) {
                n.o("VmYkYSw2eGNj", "wMXUzlQW", this.f14271s);
                this.f14271s.setText(w.n("k7_C5cexpqfP6cmRLeaMhaKQsOfyuJ282-bgh427zunXhKqnxenvtayIy-nrpA7l-YA=", "3Cokgvix"));
            } else {
                n.o("Vjl7OXQ5OQ==", "JwiwXyut", this.f14271s);
                this.f14271s.setText(w.n("k7_C5cexpqfP6cmRLeaMhaKQsOfyuJ282-bvh4K79OnXhKqnxenvtayIy-nrpA7lwLM=", "YNuZgyfB"));
            }
            yh.b.b().D = this.S;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_1) {
            boolean z26 = !this.T;
            this.T = z26;
            U(z26, this.f14272t, w.n("kIXq5fyPEebAq42P_emVtQ==", "Cif2sX1z"));
            yh.b.b().E = this.T;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_2) {
            boolean z27 = !this.U;
            this.U = z27;
            U(z27, this.f14274u, w.n("tIXf5fiPLubUh9e79OXxubCIpujiqKOhtQ==", "kIvQ0949"));
            yh.b.b().F = this.U;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_3) {
            boolean z28 = !this.V;
            this.V = z28;
            U(z28, this.f14276v, w.n("tIXf5fiPLuf5k9We3un0tQ==", "izylVSJc"));
            yh.b.b().G = this.V;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_4) {
            boolean z29 = !this.W;
            this.W = z29;
            U(z29, this.f14278w, w.n("qYXO5fqPZubZooOk2OWdjNSI1unMtQ==", "ptLfK9ki"));
            yh.b.b().H = this.W;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_5) {
            boolean z30 = !this.X;
            this.X = z30;
            U(z30, this.f14280x, w.n("roXn5d-PZ-XQoI-Z8eWdjNSI1unMtQ==", "AoKOn8Hn"));
            yh.b.b().I = this.X;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_6) {
            boolean z31 = !this.Y;
            this.Y = z31;
            U(z31, this.f14282y, w.n("tIXf5fiPLlInY1x2J3IwZHVGWGwmc6OhtQ==", "04TxBzc5"));
            yh.b.b().J = this.Y;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_7) {
            boolean z32 = !this.Z;
            this.Z = z32;
            U(z32, this.f14284z, w.n("sIXF5fCPLun6hI6n3emStQ==", "VTUmAqPV"));
            yh.b.b().K = this.Z;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_8) {
            boolean z33 = !this.f14273t0;
            this.f14273t0 = z33;
            U(z33, this.A, w.n("kIXq5fyPEXM5bApzaA==", "UIgXcgTG"));
            yh.b.b().L = this.f14273t0;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.full_9) {
            boolean z34 = !this.f14275u0;
            this.f14275u0 = z34;
            U(z34, this.B, w.n("kIXq5fyPEebxhYyQ9OevuKG8iub_h527tg==", "mkQOVbpz"));
            yh.b.b().M = this.f14275u0;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.open_ad) {
            boolean z35 = !this.f14277v0;
            this.f14277v0 = z35;
            V(z35, this.C, w.n("GnAnbm1BZA==", "eEOrt4Lw"));
            yh.b.b().N = this.f14277v0;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.open_only_high_full) {
            boolean z36 = !this.f14279w0;
            this.f14279w0 = z36;
            V(z36, this.D, w.n("Pm4beWloGGcqIFV1Lmw=", "o5vbK7L0"));
            yh.b.b().f25817b0 = this.f14279w0;
            yh.b.b().d();
            return;
        }
        if (view.getId() == R.id.tv_allow_indonesia_rate) {
            yh.b.b().Z = !yh.b.b().Z;
            yh.b.b().d();
            if (yh.b.b().Z) {
                this.K0.setText(w.n("043h5Yym0rDk6MO_sbqp6J2Eo4jrOtC8gA==", "iF6Q67fB"));
                return;
            } else {
                this.K0.setText(w.n("kI3y5femq7D16M6_lrqu6OqE04jvOpyFsw==", "onsNC4GN"));
                return;
            }
        }
        if (view.getId() == R.id.intent_to_deep_clean) {
            startActivity(new Intent(this, (Class<?>) TestDeepCleanActivity.class));
            return;
        }
        if (view.getId() == R.id.intent_to_deep_clean_time_config) {
            startActivity(new Intent(this, (Class<?>) TestTimeConfigActivity.class));
            return;
        }
        if (view.getId() == R.id.intent_to_deep_clean_switch_config) {
            startActivity(new Intent(this, (Class<?>) TestSwitchActivity.class));
            return;
        }
        if (view.getId() == R.id.btn_size_transform) {
            String obj9 = this.N0.getText().toString();
            if (TextUtils.isEmpty(obj9)) {
                return;
            }
            this.O0.setText(og.a.G(Long.parseLong(obj9)));
            return;
        }
        if (view.getId() == R.id.btn_file_type_check) {
            Intent intent6 = new Intent(w.n("MG4TciZpFS4rbkdlLHR7YTZ0WG8tLg1FMV8yTwJUJE5U", "eqLa05vP"));
            intent6.setType(w.n("ey8q", "h0CWxCTN"));
            intent6.addCategory(w.n("MG4TciZpFS4rbkdlLHR7YzR0VGcscjMuJFAzThZCNkU=", "kvWzW0tB"));
            startActivityForResult(Intent.createChooser(intent6, w.n("uJz36O-BmIDL5rippZrR5sOH1bu2", "QwSuiEiq")), 1);
            return;
        }
        if (view.getId() == R.id.btn_get_country_code) {
            String v10 = w.v(this);
            this.Q0.setText(w.n("nY715cKWq73a5eKNl5uJ5eu20aDo78WMgb385e2NjJvI5ey2qqDP5PG6hLya", "mZbCdodi") + v10);
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_test);
        this.H0 = (TextView) findViewById(R.id.banner_real);
        this.I0 = (TextView) findViewById(R.id.banner_show_native_ad_bg);
        this.F0 = (TextView) findViewById(R.id.close);
        this.G0 = (TextView) findViewById(R.id.close_test);
        this.f14281x0 = (EditText) findViewById(R.id.test_splash_time);
        int i10 = yh.b.b().f25823f;
        this.f14281x0.setText("" + i10);
        this.f14283y0 = (EditText) findViewById(R.id.test_welcome_time);
        int i11 = yh.b.b().f25825g;
        this.f14283y0.setText("" + i11);
        this.f14285z0 = (EditText) findViewById(R.id.test_ad_request_expired_time);
        int i12 = yh.b.b().f25827h;
        this.f14285z0.setText("" + i12);
        this.A0 = (EditText) findViewById(R.id.test_ad_load_expired_time);
        int i13 = yh.b.b().f25829i;
        this.A0.setText("" + i13);
        this.B0 = (EditText) findViewById(R.id.test_open_ad_request_expired_time);
        int i14 = yh.b.b().f25831j;
        this.B0.setText("" + i14);
        this.C0 = (EditText) findViewById(R.id.test_open_ad_load_expired_time);
        int i15 = yh.b.b().f25833k;
        this.C0.setText("" + i15);
        this.D0 = (EditText) findViewById(R.id.test_scan_min_time);
        int i16 = yh.b.b().f25815a0;
        this.D0.setText("" + i16);
        this.E0 = (EditText) findViewById(R.id.test_not_show_language_time);
        int i17 = yh.b.b().S;
        this.E0.setText("" + i17);
        this.f14253a = (Button) findViewById(R.id.layout_debug_test_ad);
        this.f14254b = (Button) findViewById(R.id.layout_debug_test_full_ad);
        this.f14255c = (Button) findViewById(R.id.layout_debug_test_intent_guide);
        this.f14256d = (Button) findViewById(R.id.layout_debug_test_err);
        this.L0 = (Button) findViewById(R.id.layout_intent_delete_finished);
        findViewById(R.id.layout_intent_recover_finished).setOnClickListener(this);
        findViewById(R.id.layout_intent_recover_finished_1).setOnClickListener(this);
        findViewById(R.id.layout_intent_clean_finished).setOnClickListener(this);
        findViewById(R.id.layout_intent_deep_clean_finished).setOnClickListener(this);
        findViewById(R.id.layout_intent_screenshots_finished).setOnClickListener(this);
        findViewById(R.id.layout_intent_big_videos_finished).setOnClickListener(this);
        findViewById(R.id.layout_intent_photo_preview).setOnClickListener(this);
        findViewById(R.id.layout_intent_audio_preview).setOnClickListener(this);
        findViewById(R.id.layout_intent_video_preview).setOnClickListener(this);
        findViewById(R.id.layout_intent_first_language).setOnClickListener(this);
        findViewById(R.id.layout_intent_dir_activity).setOnClickListener(this);
        findViewById(R.id.layout_recover_failed).setOnClickListener(this);
        this.O0 = (Button) findViewById(R.id.btn_size_transform);
        findViewById(R.id.btn_size_transform).setOnClickListener(this);
        this.P0 = (TextView) findViewById(R.id.btn_file_type_check);
        this.Q0 = (TextView) findViewById(R.id.btn_get_country_code);
        findViewById(R.id.btn_file_type_check).setOnClickListener(this);
        findViewById(R.id.btn_get_country_code).setOnClickListener(this);
        findViewById(R.id.intent_to_deep_clean).setOnClickListener(this);
        findViewById(R.id.intent_to_deep_clean_time_config).setOnClickListener(this);
        findViewById(R.id.intent_to_deep_clean_switch_config).setOnClickListener(this);
        this.N0 = (EditText) findViewById(R.id.et_size_input);
        this.f14257e = (TextView) findViewById(R.id.log_open);
        this.f14258f = (TextView) findViewById(R.id.banner_1);
        this.f14259g = (TextView) findViewById(R.id.banner_2);
        this.f14260h = (TextView) findViewById(R.id.banner_3);
        this.f14261i = (TextView) findViewById(R.id.banner_4);
        this.f14262j = (TextView) findViewById(R.id.banner_5);
        this.f14263k = (TextView) findViewById(R.id.banner_6);
        this.f14264l = (TextView) findViewById(R.id.banner_7);
        this.f14265m = (TextView) findViewById(R.id.nc_1);
        this.f14266n = (TextView) findViewById(R.id.nc_2);
        this.f14267o = (TextView) findViewById(R.id.nc_3);
        this.f14268p = (TextView) findViewById(R.id.reward_1);
        this.f14269q = (TextView) findViewById(R.id.reward_2);
        this.f14270r = (TextView) findViewById(R.id.reward_3);
        this.f14271s = (TextView) findViewById(R.id.reward_4);
        this.f14272t = (TextView) findViewById(R.id.full_1);
        this.f14274u = (TextView) findViewById(R.id.full_2);
        this.f14276v = (TextView) findViewById(R.id.full_3);
        this.f14278w = (TextView) findViewById(R.id.full_4);
        this.f14280x = (TextView) findViewById(R.id.full_5);
        this.f14282y = (TextView) findViewById(R.id.full_6);
        this.f14284z = (TextView) findViewById(R.id.full_7);
        this.A = (TextView) findViewById(R.id.full_8);
        this.B = (TextView) findViewById(R.id.full_9);
        this.C = (TextView) findViewById(R.id.open_ad);
        this.D = (TextView) findViewById(R.id.open_only_high_full);
        TextView textView = (TextView) findViewById(R.id.tv_allow_indonesia_rate);
        this.K0 = textView;
        textView.setOnClickListener(this);
        this.H0.setOnClickListener(this);
        this.I0.setOnClickListener(this);
        this.F0.setOnClickListener(this);
        this.G0.setOnClickListener(this);
        this.f14253a.setOnClickListener(this);
        this.f14254b.setOnClickListener(this);
        this.f14255c.setOnClickListener(this);
        this.f14256d.setOnClickListener(this);
        this.L0.setOnClickListener(this);
        this.f14257e.setOnClickListener(this);
        this.f14258f.setOnClickListener(this);
        this.f14259g.setOnClickListener(this);
        this.f14260h.setOnClickListener(this);
        this.f14261i.setOnClickListener(this);
        this.f14262j.setOnClickListener(this);
        this.f14263k.setOnClickListener(this);
        this.f14264l.setOnClickListener(this);
        this.f14265m.setOnClickListener(this);
        this.f14266n.setOnClickListener(this);
        this.f14267o.setOnClickListener(this);
        this.f14268p.setOnClickListener(this);
        this.f14269q.setOnClickListener(this);
        this.f14270r.setOnClickListener(this);
        this.f14271s.setOnClickListener(this);
        this.f14272t.setOnClickListener(this);
        this.f14274u.setOnClickListener(this);
        this.f14276v.setOnClickListener(this);
        this.f14278w.setOnClickListener(this);
        this.f14280x.setOnClickListener(this);
        this.f14282y.setOnClickListener(this);
        this.f14284z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.D.setOnClickListener(this);
        if (yh.b.b().Z) {
            this.K0.setText(w.n("tI3H5fOmlLD-6Ja_prrP6PqE1IjFOq-8gA==", "n20cfnXL"));
        } else {
            this.K0.setText(w.n("kI3y5femq7D16M6_lrqu6OqE04jvOpyFsw==", "i6GNweWr"));
        }
        boolean z6 = yh.b.b().d0;
        this.J0 = z6;
        if (z6) {
            n.o("VmYkMH1kKmZm", "TJvyDj4D", this.H0);
            this.H0.setText(w.n("k5j85-m6IGE9aR1lMGFabiByDObxrw==", "MIxF6UW8"));
        } else {
            n.o("cjlOOXA5OQ==", "MJLL5zze", this.H0);
            this.H0.setText(w.n("t5jJ5-26H2E2aUVlAGE7bjByC-XTpg==", "LiSWYoCP"));
        }
        boolean z10 = yh.b.b().f25822e0;
        this.M0 = z10;
        if (z10) {
            n.o("SGY0MFtkNGZm", "AtkRkP2q", this.I0);
            this.I0.setText(w.n("p5j65eimq5jm58K6O2FHaURlo7nS5aSKjoP05q-voonzOrOYrw==", "AXAUxMZq"));
        } else {
            n.o("Vjl7OXQ5OQ==", "OkNVAfiu", this.I0);
            this.I0.setText(w.n("t5jY5dmml5j855e6LGEhaSNl1Ln85duKqYPG5tuvu4njOpKQpg==", "AJBShxlZ"));
        }
        boolean z11 = yh.b.b().f25839n;
        this.E = z11;
        if (z11) {
            this.f14257e.setBackgroundColor(-65536);
            this.f14257e.setText(w.n("k5jt5d2mq7zJ5fuvl4Wc5fSAWm8OOpy8gA==", "PLrdJ262"));
        } else {
            n.o("cjlOOXA5OQ==", "g7SaYxQS", this.f14257e);
            this.f14257e.setText(w.n("k5jt5d2mq7zJ5fuvl4Wc5fSAWm8OOpyFsw==", "EEFvEXgA"));
        }
        boolean z12 = yh.b.b().f25841o;
        this.F = z12;
        if (z12) {
            n.o("cmYRM3piRGU1", "9p2LMlK0", this.f14258f);
            this.f14258f.setText(w.n("M2EZbixyLunkltqh9-XvlbyDmTqmvIA=", "7AUWazuj"));
        } else {
            n.o("aDkOOVI5OQ==", "3xK7k2bt", this.f14258f);
            this.f14258f.setText(w.n("F2EsbihyEenvloKhx-WOlayDnjqMhbM=", "peDilOPE"));
        }
        boolean z13 = yh.b.b().f25843p;
        this.G = z13;
        if (z13) {
            n.o("cmYRM3piRGU1", "HpMqsnaz", this.f14259g);
            this.f14259g.setText(w.n("KGEsbi1ybebOh4K74-WXuduh8-nMttyDzjqdvIA=", "Q4JBH2Le"));
        } else {
            n.o("cjlOOXA5OQ==", "wAEa5aoR", this.f14259g);
            this.f14259g.setText(w.n("F2EsbihyEebfh4-7xOWQuayhg-nItpCDzzqkhbM=", "OULigAZV"));
        }
        boolean z14 = yh.b.b().f25845q;
        this.H = z14;
        if (z14) {
            n.o("VGYXMwJiZWU1", "3Uwq1PjW", this.f14260h);
            this.f14260h.setText(w.n("M2EZbixyLuf5k9We3un0tbC6pOnAqHDliIA=", "46RrSaaY"));
        } else {
            n.o("Vjl7OXQ5OQ==", "yPG3wpBe", this.f14260h);
            this.f14260h.setText(w.n("M2EZbixyLuf5k9We3un0tbC6pOnAqHDlt7M=", "2SGisis6"));
        }
        boolean z15 = yh.b.b().f25847r;
        this.I = z15;
        if (z15) {
            n.o("ZWYWM3Zid2U1", "29FpEBuO", this.f14261i);
            this.f14261i.setText(w.n("M2EZbixyLuXKoNqZ5mw6YTFpX2emut_pwKhp5f-A", "CSC9um57"));
        } else {
            n.o("cjlOOXA5OQ==", "yiJotSaS", this.f14261i);
            this.f14261i.setText(w.n("F2EsbihyEeXBoIKZ1mxbYSFpWGeMuuzpzKh35b2z", "8MNUOM8o"));
        }
        boolean z16 = yh.b.b().f25849s;
        this.J = z16;
        if (z16) {
            n.o("VmYkM35ie2U1", "lN3hlpvr", this.f14262j);
            this.f14262j.setText(w.n("M2EZbixyLubDotakz2w6YTFpX2emut_p4qhM5emA", "avUQg0Jf"));
        } else {
            n.o("FDlMOXY5OQ==", "Tk7uOP1X", this.f14262j);
            this.f14262j.setText(w.n("F2EsbihyEebIoo6k_2xbYSFpWGeMuuzp2qhQ5cCz", "CDfuYjEC"));
        }
        boolean z17 = yh.b.b().f25851t;
        this.K = z17;
        if (z17) {
            n.o("bmYnM0JiTGU1", "fWMAqylx", this.f14263k);
            this.f14263k.setText(w.n("F2EsbihyEebIoo6k_-aih6G7gOTWnZyt3unGtYi64On2qHjl8YA=", "lreMFgmu"));
        } else {
            n.o("Sjl-OXE5OQ==", "MoiGHuZX", this.f14263k);
            this.f14263k.setText(w.n("M2EZbixyLubDotakz-bDh7G7h-T8na-t4Onltba6--nSqE3lzLM=", "xDSnfb1x"));
        }
        boolean z18 = yh.b.b().f25853u;
        this.L = z18;
        if (z18) {
            n.o("cmYRM3piRGU1", "iKgm0lwO", this.f14264l);
            this.f14264l.setText(w.n("KmEEbi9yHebghYGQ0-eouNa8-ub7h9G70OfDk9Ce1unptY-63-nBqGLl2oA=", "jdHjJBk2"));
        } else {
            n.o("Vjl7OXQ5OQ==", "oJiPkkgz", this.f14264l);
            this.f14264l.setText(w.n("F2EsbihyEebxhYyQ9OevuKG8iub_h527_eeKk4Se_unUtae62OnNqHPl7rM=", "TNTCK1bb"));
        }
        boolean z19 = yh.b.b().f25855v;
        this.M = z19;
        if (z19) {
            n.o("aGY3Zj5iWjMz", "bGKQX8Hv", this.f14265m);
            this.f14265m.setText(w.n("tKTQ5cShLubLq9WPzen0tbC6pOnAqHDlyoA=", "vGg2nFxS"));
        } else {
            n.o("cjlOOXA5OQ==", "T4mzxMi5", this.f14265m);
            this.f14265m.setText(w.n("pKTf5eWhFObRq4CP2umStde60-nuqA_l47M=", "b1AxhK9m"));
        }
        boolean z20 = yh.b.b().f25857w;
        this.N = z20;
        if (z20) {
            n.o("cmYRZi9iEzMz", "fQo5rQnp", this.f14266n);
            this.f14266n.setText(w.n("kKTl5cChEeXBoIKZ1uWajKOIpunItZy67enqqHjl1IA=", "sADzxiBh"));
        } else {
            n.o("cjlOOXA5OQ==", "0jYfRdAs", this.f14266n);
            this.f14266n.setText(w.n("sKTA5dehCeXQoI-Z8eWdjNSI1unMtdC68-n7qAzlz7M=", "UqUgZVdt"));
        }
        boolean z21 = yh.b.b().f25858x;
        this.O = z21;
        if (z21) {
            n.o("VmYkZitiLDMz", "8wTWb38j", this.f14267o);
            this.f14267o.setText(w.n("kKTl5cChEebIoo6k_-WajKOIpunItZy6-OnRqEjl94A=", "dRGymRrK"));
        } else {
            n.o("Vjl7OXQ5OQ==", "McCzt4JV", this.f14267o);
            this.f14267o.setText(w.n("tKTQ5cShLubDotakz-X7jLOIoenita-62enQqHTl37M=", "LSNZkTxG"));
        }
        boolean z22 = yh.b.b().A;
        this.P = z22;
        if (z22) {
            n.o("VmYkYSw2eGNj", "I6vJepnc", this.f14268p);
            this.f14268p.setText(w.n("kL_15dKx3Kfe6cSRCueIk9Se2unMtdOBxOXcjQzl9oA=", "HzvuX4cu"));
        } else {
            n.o("Vjl7OXQ5OQ==", "tykgiFFO", this.f14268p);
            this.f14268p.setText(w.n("k7_C5cexpqfP6cmRLeePk6OequnItZ-B4eXCjV3l_7M=", "ZhpzCfgz"));
        }
        boolean z23 = yh.b.b().B;
        this.Q = z23;
        if (z23) {
            n.o("cmYRYSg2R2Nj", "h70aJ3xD", this.f14269q);
            this.f14269q.setText(w.n("k7_C5cexpqfP6cmRLemWhK2nvunItZ-BwOXqjW7l6IA=", "jRylbNTT"));
        } else {
            n.o("Vjl7OXQ5OQ==", "ypFt6Nwz", this.f14269q);
            this.f14269q.setText(w.n("t7_35cOxmafE6ZGRHen3hL2nuenitayBx-XvjQ7l1rM=", "eK4SWARl"));
        }
        boolean z24 = yh.b.b().C;
        this.R = z24;
        if (z24) {
            n.o("UGYpYSs2YGNj", "d6sOJVHy", this.f14270r);
            this.f14270r.setText(w.n("t7_35cOxmafE6ZGRHebthbKQt-fYuK688ubFh5G7j-nwtZKI6enopHjlj4A=", "NSu9jljh"));
        } else {
            n.o("cjlOOXA5OQ==", "1OBbarNG", this.f14270r);
            this.f14270r.setText(w.n("t7_35cOxmafE6ZGRHebthbKQt-fYuK686uamh6i7_unwtZKI6enopHjltrM=", "V0LHTfRH"));
        }
        boolean z25 = yh.b.b().D;
        this.S = z25;
        if (z25) {
            n.o("cmYRYSg2R2Nj", "0st1bJdl", this.f14271s);
            this.f14271s.setText(w.n("v7_i5c2xmafe6cSRCuaLhdWQwOf2uNG82ubuh9K7_On7hIqnz-nQtb2IxunMpAnljoA=", "YrYbGqp8"));
        } else {
            n.o("Vjl7OXQ5OQ==", "yFrzvCj8", this.f14271s);
            this.f14271s.setText(w.n("t7_35cOxmafE6ZGRHebthbKQt-fYuK68jebvh9K71-nzhJ-nwenQtaeIk-nbpG_l0LM=", "1y6aI4uh"));
        }
        boolean z26 = yh.b.b().E;
        this.T = z26;
        U(z26, this.f14272t, w.n("kIXq5fyPEebAq42P_emVtQ==", "8L2tciyy"));
        boolean z27 = yh.b.b().F;
        this.U = z27;
        U(z27, this.f14274u, w.n("kIXq5fyPEebfh4-7xOWQuaCIoejIqJChtQ==", "ljlvnVLO"));
        boolean z28 = yh.b.b().G;
        this.V = z28;
        U(z28, this.f14276v, w.n("tIXf5fiPLuf5k9We3un0tQ==", "Aj0ybqxm"));
        boolean z29 = yh.b.b().H;
        this.W = z29;
        U(z29, this.f14278w, w.n("tIXf5fiPLubDotakz-X7jLOIoenitQ==", "dSkuyjrQ"));
        boolean z30 = yh.b.b().I;
        this.X = z30;
        U(z30, this.f14280x, w.n("tIXf5fiPLuXKoNqZ5uX7jLOIoenitQ==", "pLtSQ9l2"));
        boolean z31 = yh.b.b().J;
        this.Y = z31;
        U(z31, this.f14282y, w.n("tIXf5fiPLlInY1x2J3IwZHVGWGwmc6OhtQ==", "8KrH02qT"));
        boolean z32 = yh.b.b().K;
        this.Z = z32;
        U(z32, this.f14284z, w.n("tIXf5fiPLunghNunyun0tQ==", "6XvVTSz4"));
        boolean z33 = yh.b.b().L;
        this.f14273t0 = z33;
        U(z33, this.A, w.n("tIXf5fiPLnMybFJzaA==", "ATmfrB5l"));
        boolean z34 = yh.b.b().M;
        this.f14275u0 = z34;
        U(z34, this.B, w.n("tIXf5fiPLub6hdSQxOfOuLG8jebVh6675unDtQ==", "PbdGQc5m"));
        boolean z35 = yh.b.b().N;
        this.f14277v0 = z35;
        V(z35, this.C, w.n("GnAnbm1BZA==", "mOZMfXRL"));
        boolean z36 = yh.b.b().f25817b0;
        this.f14279w0 = z36;
        TextView textView2 = this.D;
        String n10 = w.n("Pm4beWloGGcqIFV1Lmw=", "uzyZ975x");
        if (z36) {
            textView2.setBackgroundColor(Color.parseColor(w.n("cmYRZi84STAw", "S6q6zLLN")));
            textView2.setText(n10.concat(w.n("T-X-gA==", "KjOWb1uk")));
        } else {
            textView2.setBackgroundColor(Color.parseColor(w.n("cjlOOXA5OQ==", "YW0p01QG")));
            textView2.setText(n10.concat(w.n("X-XUsw==", "NIeQd7NA")));
        }
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            uf.h.a();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
