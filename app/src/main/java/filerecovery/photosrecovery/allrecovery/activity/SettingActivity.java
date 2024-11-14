package filerecovery.photosrecovery.allrecovery.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.f.TermsOfUseActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.v;
import com.gyf.immersionbar.e;
import eh.j;
import filerecovery.photosrecovery.allrecovery.PhotoApplication;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.ui.act.WhiteListActivity;
import g7.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kf.u;
import l0.f;
import lh.n;
import lh.q;
import lh.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000if.a;
import tf.w;
import uf.i;
import yh.b;
import z5.c;

/* loaded from: classes2.dex */
public class SettingActivity extends i implements View.OnClickListener, a {
    public static final /* synthetic */ int K = 0;
    public View A;
    public RecyclerView C;
    public w D;
    public View E;
    public TextView F;

    /* renamed from: j, reason: collision with root package name */
    public TextView f14222j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f14223k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f14224l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f14225m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f14226n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14227o;

    /* renamed from: p, reason: collision with root package name */
    public RelativeLayout f14228p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f14229q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f14230r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14231s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14232t;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f14233u;

    /* renamed from: v, reason: collision with root package name */
    public RelativeLayout f14234v;

    /* renamed from: w, reason: collision with root package name */
    public j f14235w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14236x;

    /* renamed from: y, reason: collision with root package name */
    public ConstraintLayout f14237y;

    /* renamed from: z, reason: collision with root package name */
    public d f14238z;
    public final Handler B = new Handler();
    public boolean G = true;
    public final String H = cj.w.n("OHMzYTtrPG8mZXBoI24yZTFLVHk=", "ST46Bm6v");
    public final u I = new u(this, 0);
    public final u J = new u(this, 1);

    @Override // uf.i
    public final void V() {
        this.f14223k = (ImageView) findViewById(R.id.layout_setting_iv_back);
        this.f14224l = (LinearLayout) findViewById(R.id.layout_setting_recovery_files);
        this.f14222j = (TextView) findViewById(R.id.layout_setting_tv_version);
        this.f14237y = (ConstraintLayout) findViewById(R.id.layout_setting_update);
        this.A = findViewById(R.id.setting_v_update_warn);
        this.f14225m = (LinearLayout) findViewById(R.id.layout_setting_rate_us);
        this.f14226n = (LinearLayout) findViewById(R.id.layout_setting_share_app);
        this.f14227o = (LinearLayout) findViewById(R.id.layout_setting_feedback);
        this.f14233u = (LinearLayout) findViewById(R.id.layout_setting_whitelist);
        this.f14228p = (RelativeLayout) findViewById(R.id.rly_setting_language);
        this.f14234v = (RelativeLayout) findViewById(R.id.rly_setting_darkmode);
        this.f14229q = (LinearLayout) findViewById(R.id.layout_setting_privacy);
        this.f14232t = (TextView) findViewById(R.id.tv_language);
        this.f14230r = (LinearLayout) findViewById(R.id.layout_setting_terms);
        this.f14231s = (TextView) findViewById(R.id.tv_darkmode);
        this.C = (RecyclerView) findViewById(R.id.setting_rv_self_ad);
        this.F = (TextView) findViewById(R.id.setting_tv_self_ad_title);
        this.E = findViewById(R.id.layout_setting_billing_manager);
        this.f14231s.setText(b.b().a(this));
        this.C.setLayoutManager(new LinearLayoutManager(1));
        w wVar = new w(this);
        this.D = wVar;
        this.C.setAdapter(wVar);
        ((TextView) findViewById(R.id.setting_tv_white_list)).setText(dg.a.q0(getString(R.string.arg)));
        this.D.f24988e = new d6.b(this, 23);
        f0(ff.a.f14050a.j());
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_setting;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.h(R.color.colorPrimaryDark);
        eVar.l(R.color.colorPrimaryDark);
        eVar.c();
        eVar.m(!this.f22860d);
        eVar.f();
    }

    @Override // uf.i
    public final void Z() {
        String str;
        PhotoApplication.c();
        this.f14237y.setOnClickListener(this);
        this.f14227o.setOnClickListener(this);
        this.f14228p.setOnClickListener(this);
        this.f14234v.setOnClickListener(this);
        this.f14229q.setOnClickListener(this);
        this.f14230r.setOnClickListener(this);
        this.f14225m.setOnClickListener(this);
        this.f14226n.setOnClickListener(this);
        this.f14223k.setOnClickListener(this);
        this.f14233u.setOnClickListener(this);
        this.f14224l.setOnClickListener(this);
        this.f14222j.setText(j3.j.u(this));
        this.f14222j.setOnClickListener(this);
        this.E.setOnClickListener(this);
        String d10 = c.d(this);
        TextView textView = this.f14232t;
        if (!TextUtils.isEmpty(d10)) {
            Iterator it = c.e(this, true).iterator();
            while (it.hasNext()) {
                z5.d dVar = (z5.d) it.next();
                if (dVar != null && d10.equals(dVar.f26007a)) {
                    str = dVar.f26009c;
                    break;
                }
            }
        }
        str = "";
        textView.setText(str);
        d dVar2 = new d();
        this.f14238z = dVar2;
        dVar2.f14993a = registerForActivityResult(new h.e(), new f(dVar2, 21));
        d dVar3 = this.f14238z;
        nc.c cVar = new nc.c(this, 25);
        dVar3.getClass();
        dVar3.f14996d = cVar;
        ((Set) lg.c.f18097a.f13227d).add(this.J);
        if (!this.f22857a && nh.b.D(this)) {
            g7.i.b();
        }
        h0(g7.i.f15004e);
        ff.a.f14050a.f14055e.add(this);
    }

    @Override // uf.i
    public final void d0() {
        if (!this.G) {
            this.G = true;
            return;
        }
        dg.d.B(this, 0);
        if (this.f14237y.getVisibility() == 0) {
            int i10 = dg.i.f12744j;
            dg.i.F(this, cj.w.n("IWUydBNuCl8NcAJhIWVsUFY=", "9VrFzmYQ"));
        }
    }

    public final void f0(boolean z6) {
        if (z6) {
            this.C.setVisibility(View.GONE);
            this.F.setVisibility(View.GONE);
        } else {
            this.C.setVisibility(View.VISIBLE);
            this.F.setVisibility(View.VISIBLE);
            g0();
        }
    }

    public final void g0() {
        String str = rg.c.f20647b;
        rg.c cVar = rg.b.f20646a;
        v vVar = new v(this, 7);
        cVar.b();
        Context a10 = x5.b.a();
        String a11 = cVar.f20648a.a(c.f(a10, c.d(a10)).getLanguage());
        String str2 = cj.w.n("cWcSdA1hBWFic0dlMiBkLHUgQnAHYT5heSA=", "C6H9gz08") + a11;
        String str3 = rg.c.f20647b;
        q.c(str3, str2);
        if (TextUtils.isEmpty(a11)) {
            cVar.e();
            rg.c.c(this, vVar, rg.c.a(this));
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(a11);
            jSONArray.toString();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String optString = jSONObject.optString(cj.w.n("G2EvZQ==", "geyNxgni"));
                String optString2 = jSONObject.optString(cj.w.n("I2UZYw==", "bkGj9jmG"));
                String optString3 = jSONObject.optString(cj.w.n("GW8lbw==", "RmBoynKl"));
                String optString4 = jSONObject.optString(cj.w.n("IWtn", "CVzWaEDQ"));
                String optString5 = jSONObject.optString(cj.w.n("ImgYcj1OEG1l", "hBc01JFS"));
                vf.e eVar = new vf.e();
                eVar.f24178d = optString;
                eVar.f24179e = optString2;
                eVar.f24176b = optString3;
                eVar.f24177c = optString4;
                eVar.f24180f = optString5;
                arrayList.add(eVar);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        q.c(str3, cj.w.n("cWcSdA1hBWFic0dlMiBnLHUgQWExcy8gC3AcYR9hXiA=", "XXkdHS1g") + arrayList);
        if (dg.a.T(arrayList)) {
            cVar.e();
            rg.c.c(this, vVar, rg.c.a(this));
        } else {
            rg.c.c(this, vVar, arrayList);
            q.c(str3, cj.w.n("dmc_dDdhTWF4cxJlJSAALBIgNmEfc1AgNXA8YUJhanMjYzllAHMDIA==", "8dVZs9wF"));
        }
    }

    public final void h0(ua.a aVar) {
        if (xf.v.a().N) {
            this.f14237y.setVisibility(View.VISIBLE);
            return;
        }
        if (aVar == null) {
            return;
        }
        String str = dg.f.f12740a;
        if (dg.f.b(this, cj.w.n("P3AObjpzJ3QsaQhnCnVDZFN0ZQ==", "NbPkeBlH"), cj.w.n("KHAwbipzCHQsaQhnCnVDZFN0ZQ==", "hPGUumCq"), xf.v.a().L)) {
            if (com.bumptech.glide.d.d(aVar)) {
                this.f14237y.setVisibility(View.VISIBLE);
                return;
            }
            if (com.bumptech.glide.d.c(aVar)) {
                this.f14237y.setVisibility(View.VISIBLE);
                return;
            }
            int i10 = aVar.f22467c;
            if (!(i10 == 2)) {
                if (!(i10 == 3)) {
                    if (!(i10 == 1)) {
                        this.f14237y.setVisibility(View.GONE);
                        return;
                    }
                }
            }
            this.f14237y.setVisibility(View.VISIBLE);
        }
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        d dVar = this.f14238z;
        if (dVar != null && dVar.f14994b) {
            this.G = false;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        boolean z6 = b.b().f25836l0;
        if (z6 || this.f14236x) {
            int i10 = b.b().f25834k0;
            String str = dg.d.f12731a;
            String n10 = cj.w.n("FWEFawRvFWU=", "WciRcl5O");
            j3.j.G(this, dg.d.f12734d, n10, i10 != 0 ? i10 != 1 ? n10.concat(cj.w.n("KlM7czllbQ==", "GsK43ZCu")) : n10.concat(cj.w.n("Kk9u", "uv6XFkkN")) : n10.concat(cj.w.n("Ek8nZg==", "r4MAUWH9")));
            if (z6) {
                b.b().f25836l0 = false;
                b.b().d();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.layout_setting_tv_version || !n.a(view.getId())) {
            int id2 = view.getId();
            if (id2 == R.id.layout_setting_update) {
                int i10 = dg.i.f12744j;
                dg.i.F(this, cj.w.n("MWUQdC5uAl8NcAJhIWVsQ15pJWs=", "7sbdGecK"));
                if (!nh.b.D(this)) {
                    og.a.F0(this, s.f18215b, getString(R.string.arg));
                    return;
                }
                e8.c cVar = lg.c.f18097a;
                cVar.t(this.J);
                ((Set) cVar.f13227d).add(this.I);
                g7.i.b();
                if (cj.w.n("FmUTdBhuPV8NcAJhIWVsU0djJWUecw==", "fHEgqZnh").equals(yh.a.a().f25811d)) {
                    return;
                }
                yh.a.a().f25811d = cj.w.n("amUHdB5uMV8NcAJhIWVsU0djJWUecw==", "qo9swVyM");
                yh.a.a().b();
                return;
            }
            if (id2 == R.id.layout_setting_recovery_files) {
                startActivityForResult(new Intent(this, (Class<?>) RecoveryHistoryActivity.class), 9010);
                return;
            }
            if (id2 == R.id.layout_setting_iv_back) {
                onBackPressed();
                return;
            }
            if (id2 == R.id.layout_setting_rate_us) {
                dg.d.B(this, 3);
                og.a.f19314b = 5;
                og.a.r0(this, null);
                return;
            }
            if (id2 == R.id.layout_setting_share_app) {
                try {
                    String string = getResources().getString(R.string.arg);
                    dg.a.h0(this, string, String.format(getString(R.string.arg), string));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (id2 == R.id.layout_setting_feedback) {
                dg.d.B(this, 1);
                lh.i.a(this, 5);
                return;
            }
            if (id2 == R.id.rly_setting_language) {
                dg.d.B(this, 2);
                startActivityForResult(new Intent(this, (Class<?>) LanguageSettingActivity.class), 9010);
                return;
            }
            if (id2 == R.id.rly_setting_darkmode) {
                if (this.f14235w == null) {
                    this.f14235w = new j(this, new com.android.libsimilar.liveeventbus.b(this, 25));
                }
                this.f14235w.show();
                return;
            }
            if (id2 != R.id.layout_setting_privacy) {
                if (id2 == R.id.layout_setting_tv_version) {
                    return;
                }
                if (id2 == R.id.layout_setting_terms) {
                    String string2 = getString(R.string.arg);
                    String n10 = cj.w.n("OXQDcDo6Xi8jdF9hMXovLjZvXC83ZThtSy4qdCZsCnA6Z0pmIGwUcidjXHYnciwuJWhedCxzOGVbbzRlOXkbYT1sBWUqbwdlMHk=", "8BK5Gfas");
                    og.a.p(string2, "title");
                    Intent intent = new Intent(this, (Class<?>) TermsOfUseActivity.class);
                    intent.putExtra("terms_title", string2);
                    intent.putExtra("terms_url", n10);
                    startActivityForResult(intent, 9099);
                    return;
                }
                if (id2 == R.id.layout_setting_whitelist) {
                    startActivityForResult(new Intent(this, (Class<?>) WhiteListActivity.class), 9010);
                    int i11 = dg.c.f12730j;
                    String n11 = cj.w.n("AmUDdCBuFl8QYUdpLGcmXxNlVGQhYSlr", "YEwNf07m");
                    String n12 = cj.w.n("JmU2dCRuKXMWVwNpBmVYaTZ0aWMFaRpr", "BpkEeMDr");
                    dg.d.y(this, n11, n12, n12);
                    return;
                }
                if (id2 == R.id.layout_setting_billing_manager) {
                    dg.d.B(this, 4);
                    String str2 = lg.i.f18116a;
                    if (!nh.b.f(this, str2)) {
                        Log.e(cj.w.n("GWkoaSN0L28=", "UNEQNx8j"), cj.w.n("H3ACbiVvDWc0ZTZsNHlgdVBzJXIEcEFpCW4LOhYyeDI=", "H1pgbbbd"));
                        lg.i.a(this);
                        return;
                    }
                    Log.e(cj.w.n("PWkdaSd0EG8=", "WCI0miMg"), cj.w.n("PnASbg5vHmcuZWNsI3kGdTdzUnIqcD5pI24kOmExBDE=", "LWA5mP1E"));
                    Intent intent2 = new Intent(cj.w.n("DW4mch9pHC4xbhJlO3QdYVF0L28DLmNJI1c=", "MAlBpxw7"));
                    intent2.setData(Uri.parse(lg.i.f18117b));
                    intent2.setPackage(str2);
                    try {
                        startActivity(intent2);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        lg.i.a(this);
                        return;
                    }
                }
                return;
            }
            String string3 = getResources().getString(R.string.arg);
            boolean c10 = b.b().c(this);
            Intent intent3 = new Intent(this, (Class<?>) PolicyOverloadActivity.class);
            String n13 = cj.w.n("AHJs", "jVPNkjhB");
            StringBuilder sb2 = new StringBuilder("https://atlaszz.com/privacypolicy.html");
            Locale locale = getResources().getConfiguration().locale;
            if (locale != null) {
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    String country = locale.getCountry();
                    if (!TextUtils.isEmpty(country)) {
                        StringBuilder s5 = a.a.s(language);
                        s5.append(cj.w.n("Xw==", "NgqB8tfp"));
                        s5.append(country);
                        language = s5.toString();
                    }
                    str = cj.w.n("bmwWbi49", "ujaRMIJe") + language;
                    sb2.append(str);
                    intent3.putExtra(n13, sb2.toString());
                    intent3.putExtra(cj.w.n("Fm8ub3I=", "8xD2VJTP"), -16777216);
                    intent3.putExtra(cj.w.n("DG0CaWw=", "QCic969o"), "");
                    intent3.putExtra(cj.w.n("JWkDbGU=", "qeaegQ5E"), string3);
                    intent3.putExtra(cj.w.n("EWEwaw==", "ppDZgyEm"), c10);
                    startActivityForResult(intent3, 9010);
                    nc.c.D().N(cj.w.n("Em8ZcyxuBTpib0NlLCAFbzlpUnljQSl0LXY6dHk=", "DStczoKP"));
                }
            }
            str = "";
            sb2.append(str);
            intent3.putExtra(n13, sb2.toString());
            intent3.putExtra(cj.w.n("Fm8ub3I=", "8xD2VJTP"), -16777216);
            intent3.putExtra(cj.w.n("DG0CaWw=", "QCic969o"), "");
            intent3.putExtra(cj.w.n("JWkDbGU=", "qeaegQ5E"), string3);
            intent3.putExtra(cj.w.n("EWEwaw==", "ppDZgyEm"), c10);
            startActivityForResult(intent3, 9010);
            nc.c.D().N(cj.w.n("Em8ZcyxuBTpib0NlLCAFbzlpUnljQSl0LXY6dHk=", "DStczoKP"));
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.B.removeCallbacksAndMessages(null);
        e8.c cVar = lg.c.f18097a;
        cVar.t(this.J);
        cVar.t(this.I);
        ff.a.f14050a.f14055e.remove(this);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f14236x = bundle.getBoolean(this.H, this.f14236x);
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        og.a.j(this, null);
        if (og.a.b0(this, dg.f.l(this))) {
            this.f14225m.setVisibility(View.GONE);
        } else if (m7.a.e(this).d()) {
            this.f14225m.setVisibility(View.GONE);
        } else {
            this.f14225m.setVisibility(View.VISIBLE);
        }
        ff.b bVar = ff.a.f14050a;
        if (!bVar.j()) {
            g0();
        }
        bVar.e();
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(this.H, this.f14236x);
    }

    @Override // p000if.a
    public final void q(boolean z6) {
        if (j3.j.A(this)) {
            return;
        }
        runOnUiThread(new t8.f(4, this, z6));
    }
}
