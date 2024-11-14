package filerecovery.photosrecovery.allrecovery.ui.act;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.i2;

import androidx.fragment.app.i0;
import androidx.fragment.app.p0;
import androidx.lifecycle.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.c;
import cj.w;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.TTAdConstant;

import dg.f;
import ff.d;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.ui.act.BillingPageActivity;
import filerecovery.photosrecovery.allrecovery.ui.widget.AutoSpanTextView;
import filerecovery.photosrecovery.allrecovery.view.ItalicTextView;
import filerecovery.photosrecovery.allrecovery.view.StrikeThroughTextView;
import gf.a;
import gf.b;
import gh.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import k.j;
import kf.k;
import lg.k0;
import lh.h;
import lh.q;
import sb.g;
import uf.i;
import xf.v;
import yg.p;
import yg.r;
import yg.s;
import yg.t;
import z5.e;

/* loaded from: classes2.dex */
public class BillingPageActivity extends i implements View.OnClickListener {
    public static final /* synthetic */ int M0 = 0;
    public TextView A;
    public ImageView B;
    public ImageView C;
    public TextView D;
    public ImageView E;
    public View F;
    public boolean G;
    public View H;
    public View I;
    public boolean I0;
    public View J;
    public View K;
    public LottieAnimationView L;
    public ValueAnimator L0;
    public AutoSpanTextView M;
    public LottieAnimationView N;
    public ItalicTextView O;
    public ItalicTextView P;
    public ItalicTextView Q;
    public View R;
    public View S;
    public View T;
    public ConstraintLayout U;
    public boolean V;
    public b W;
    public boolean Z;

    /* renamed from: j, reason: collision with root package name */
    public View f14371j;

    /* renamed from: k, reason: collision with root package name */
    public View f14372k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f14373l;

    /* renamed from: n, reason: collision with root package name */
    public ExecutorService f14375n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14376o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f14377p;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView f14378q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f14379r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14380s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14381t;

    /* renamed from: t0, reason: collision with root package name */
    public StrikeThroughTextView f14382t0;

    /* renamed from: u, reason: collision with root package name */
    public a f14383u;

    /* renamed from: u0, reason: collision with root package name */
    public StrikeThroughTextView f14384u0;

    /* renamed from: v, reason: collision with root package name */
    public a f14385v;

    /* renamed from: v0, reason: collision with root package name */
    public StrikeThroughTextView f14386v0;

    /* renamed from: w, reason: collision with root package name */
    public TextView f14387w;

    /* renamed from: x, reason: collision with root package name */
    public eh.b f14389x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f14391y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f14393z;

    /* renamed from: m, reason: collision with root package name */
    public final u1.a f14374m = new u1.a(this, 13);
    public boolean X = false;
    public boolean Y = false;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f14388w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f14390x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public final c f14392y0 = new c(4);

    /* renamed from: z0, reason: collision with root package name */
    public boolean f14394z0 = false;
    public boolean A0 = false;
    public boolean B0 = false;
    public boolean C0 = false;
    public boolean D0 = false;
    public String E0 = w.n("UTFzLnQ5", "KcTcIEIX");
    public String F0 = w.n("VjRBOTk=", "yEron7rE");
    public String G0 = w.n("dTJZOTk=", "eP95wFFd");
    public String H0 = w.n("ZDkl", "Nf0v68XT");
    public final AtomicBoolean J0 = new AtomicBoolean(false);
    public final r K0 = new r(this, 9);

    public static void E0(Activity activity, boolean z6) {
        Intent intent = new Intent(activity, (Class<?>) BillingPageActivity.class);
        intent.putExtra(w.n("HHMEciJtBm8kZSBleQ==", "EpUFLRix"), z6);
        activity.startActivity(intent);
    }

    public static void f0(BillingPageActivity billingPageActivity, long j4) {
        if (billingPageActivity.I0 || billingPageActivity.X || billingPageActivity.Y) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - j4;
                if (currentTimeMillis < 2200) {
                    Thread.sleep(2200 - currentTimeMillis);
                }
                billingPageActivity.C0 = true;
                billingPageActivity.runOnUiThread(new p(billingPageActivity, 0));
                billingPageActivity.f14374m.removeMessages(TTAdConstant.MATE_VALID);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void g0(BillingPageActivity billingPageActivity) {
        billingPageActivity.getClass();
        if (!g.q(billingPageActivity)) {
            og.a.G0(billingPageActivity, billingPageActivity.getString(R.string.arg));
            return;
        }
        if (billingPageActivity.f14389x == null) {
            eh.b bVar = new eh.b(billingPageActivity);
            billingPageActivity.f14389x = bVar;
            bVar.setOnDismissListener(new n.c(billingPageActivity, 3));
        }
        ua.b.n(billingPageActivity, billingPageActivity.f14389x);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d l0() {
        char c10;
        String i10 = h.i();
        switch (i10.hashCode()) {
            case 65:
                if (i10.equals(w.n("QQ==", "ENZ9j2ge"))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 66:
                if (i10.equals(w.n("Qg==", "6hkZeMqF"))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 67:
                if (i10.equals(w.n("Qw==", "1XTSaTZU"))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 68:
                if (i10.equals(w.n("RA==", "aG9HwCbU"))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? d.MONTH : d.MONTH_D : d.MONTH_C : d.MONTH_B : d.MONTH_A;
    }

    public static b m0(a aVar, d dVar) {
        if (aVar == null || !dg.a.V(aVar.f15023d)) {
            return null;
        }
        for (b bVar : aVar.f15023d) {
            if (bVar != null && dVar == bVar.f15024a && !TextUtils.isEmpty(bVar.f15025b)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d o0() {
        char c10;
        String i10 = h.i();
        switch (i10.hashCode()) {
            case 65:
                if (i10.equals(w.n("QQ==", "w1dfpGt0"))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 66:
                if (i10.equals(w.n("Qg==", "MxNI2Zoo"))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 67:
                if (i10.equals(w.n("Qw==", "SXe5mAvL"))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 68:
                if (i10.equals(w.n("RA==", "pGfiWHcx"))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? d.WEEK : d.WEEK_D : d.WEEK_C : d.WEEK_B : d.WEEK_A;
    }

    public static boolean u0() {
        e i10 = e.f26010b.i(x5.b.a());
        return i10.f26012a.getBoolean(w.n("LnMcZhhyNXQHcxNiJmNBaVBlGWUfcg==", "KuGCqFiz"), true);
    }

    public static void x0() {
        if (u0()) {
            e.f26010b.i(x5.b.a()).b(w.n("HHMdZiRyPXQWcx5iAWNGaSdlaWUbcg==", "zN3iKEWY"), false);
        }
    }

    public final void A0(TextView textView, int[] iArr) {
        textView.post(new s(textView, iArr, 0));
    }

    public final void B0(boolean z6) {
        if (!this.f14371j.isSelected()) {
            z0();
        }
        this.Z = false;
        this.f14390x0 = true;
        this.U.setVisibility(View.VISIBLE);
        this.U.setOnClickListener(this);
        this.O.setLabelText(q0(w.n("YjA=", "q6b037Rt")));
        this.P.setLabelText(p0(w.n("YjA=", "jat3LtLa")));
        if (this.f14376o && !this.A0) {
            h.m(System.currentTimeMillis());
        }
        lh.g gVar = h.f18184h;
        if (gVar != null) {
            gVar.cancel();
        }
        h.f18184h = null;
        h.o(0L);
        h.p(1);
        h.n(0L);
        h.f18186j = false;
        h.f18187k = 0L;
        h.f18188l = 0L;
        if (!z6 && !h.j()) {
            z6 = true;
        }
        if (this.A0) {
            z6 = true;
        }
        boolean z10 = h.e() != 0;
        n0 n0Var = n.F0;
        p0 supportFragmentManager = getSupportFragmentManager();
        int id2 = this.U.getId();
        boolean z11 = this.f14376o;
        boolean z12 = this.A0;
        String str = this.E0;
        String str2 = this.F0;
        boolean z13 = this.B0;
        n0Var.getClass();
        og.a.p(supportFragmentManager, w.n("NWELYT1lcg==", "ymXeZz27"));
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putBoolean(w.n("BnQjcjlfPWMsbg4z", "bDsbYfl1"), z6);
        bundle.putBoolean(w.n("ImgYdxZzEmUsZQBfI248bQ==", "axXeSa0M"), z10);
        bundle.putBoolean(w.n("OHMoZjtvHF8qb15l", "SX0QaWcN"), z11);
        bundle.putBoolean(w.n("HHMdcyx2K18qbARzF19GZTFhX242ehxyAV8raAV3", "3tMinXjs"), z12);
        String n10 = w.n("GG8sdCVfIXIgZwJuE2xrcDdpVWU=", "o8jIhQPW");
        if (str == null) {
            str = "";
        }
        bundle.putString(n10, str);
        String n11 = w.n("GG8sdCVfPnIgY2U=", "nzwnPNJy");
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString(n11, str2);
        bundle.putBoolean(w.n("OHMoZjtvHF8gdV1kLmU=", "DsUx0Mvi"), z13);
        nVar.b0(bundle);
        String n12 = w.n("EmwYcyxSFHQjaV1GMGEybTBudA==", "T0ot2HVy");
        if (id2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        aVar.f(id2, nVar, n12, 2);
        if (aVar.f1395g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.f1404p.y(aVar, true);
    }

    public final void C0() {
        this.H.setVisibility(View.VISIBLE);
        this.F.setVisibility(View.VISIBLE);
        this.F.setOnClickListener(new j(this, 9));
        this.F.setTranslationY(0.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_5);
        if (this.L0 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
            this.L0 = ofFloat;
            ofFloat.addUpdateListener(new k(this, dimensionPixelSize, 1));
            this.L0.setDuration(1500L);
            this.L0.setRepeatCount(-1);
            this.L0.setRepeatMode(2);
        }
        this.L0.start();
    }

    public final void D0() {
        try {
            this.Z = true;
            z0();
            H0();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void F0(boolean z6) {
        Context a10 = x5.b.a();
        boolean z10 = !this.f14376o;
        String str = dg.h.f12742j;
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w.n("A2UDYSBuP2V3", "5UQLHsfT"));
            a.a.z(sb2, dg.h.f12742j, "KlM2YTRfPWgmdw==", "KehzlNJv", a10);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w.n("A2UDYSBuPGErbg==", "QIli56Xq"));
            a.a.z(sb3, dg.h.f12742j, "aFMRYS1fN2g3dw==", "GY7eTDzs", a10);
        }
        if (this.S == null) {
            this.S = ((ViewStub) findViewById(R.id.long_stay_timer_vs)).inflate();
        }
        if (this.T == null) {
            View inflate = ((ViewStub) findViewById(R.id.long_stay_btn_vs)).inflate();
            this.T = inflate;
            inflate.setOnClickListener(this);
            ((TextView) this.T.findViewById(R.id.long_stay_btn_title_tv)).setText(getString(R.string.arg, w.n("QjQ=", "YJsXXTH9")));
            ((TextView) this.T.findViewById(R.id.long_stay_btn_subtitle_tv)).setText(getString(R.string.arg, w.n("Mw==", "DlBhKysx")));
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.T.findViewById(R.id.anim_layout), PropertyValuesHolder.ofFloat(w.n("ImMWbCxY", "5PapEfKU"), 1.0f, 0.95f, 1.0f), PropertyValuesHolder.ofFloat(w.n("R2MKbAxZ", "xf4kiHm3"), 1.0f, 0.95f, 1.0f));
            ofPropertyValuesHolder.setDuration(1333L);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.start();
        }
        this.f14382t0 = (StrikeThroughTextView) this.S.findViewById(R.id.countdown_min_tv);
        this.f14386v0 = (StrikeThroughTextView) this.S.findViewById(R.id.countdown_dec_tv);
        this.f14384u0 = (StrikeThroughTextView) this.S.findViewById(R.id.countdown_cs_tv);
        int[] iArr = {getResources().getColor(R.color.color_100_BEE7FF), getResources().getColor(R.color.color_100_ffffff), getResources().getColor(R.color.color_100_D7D7D7F)};
        StrikeThroughTextView strikeThroughTextView = this.f14382t0;
        strikeThroughTextView.post(new s(strikeThroughTextView, iArr, 1));
        StrikeThroughTextView strikeThroughTextView2 = this.f14386v0;
        strikeThroughTextView2.post(new s(strikeThroughTextView2, iArr, 1));
        StrikeThroughTextView strikeThroughTextView3 = this.f14384u0;
        strikeThroughTextView3.post(new s(strikeThroughTextView3, iArr, 1));
        A0((TextView) this.S.findViewById(R.id.smallTitleTv), !yh.b.b().c(this) ? new int[]{getResources().getColor(R.color.color_100_0873F_FFED59), getResources().getColor(R.color.color_100_1C3AFF_FFBB53)} : new int[]{getResources().getColor(R.color.color_100_0873F_FFED59), getResources().getColor(R.color.color_100_FFD656), getResources().getColor(R.color.color_100_1C3AFF_FFBB53)});
        A0((TextView) this.S.findViewById(R.id.retainTitleTv), new int[]{getResources().getColor(R.color.color_100_FF8D02_FFFFFF), getResources().getColor(R.color.color_100_FF6002_FFFFFF)});
        if (this.f14394z0) {
            this.f14382t0.setText(w.n("CTA=", "OY9PIBjI"));
            this.f14386v0.setText(w.n("YTA=", "wl1Vt0ku"));
            this.f14384u0.setText(w.n("YTA=", "gagWploG"));
        } else {
            t tVar = new t(this);
            h hVar = h.f18177a;
            w.n("PWkEdCxuFHI=", "awrGhWxC");
            h.f18177a.getClass();
            long g10 = h.g();
            if (!z6 || g10 <= 0) {
                g10 = h.f18186j ? h.f18187k : f.c(x5.b.a());
            }
            h.p(0);
            h.n(System.currentTimeMillis() + g10);
            q.b(h.f18178b, w.n("EHQPcjhMH24_UxJhLENcdVx0Am8abgs-WGMXdVh0Dm8UbjppIWU6", "FTcnLpeq") + g10);
            lh.e eVar = h.f18185i;
            if (eVar != null) {
                eVar.cancel();
            }
            h.f18185i = null;
            lh.e eVar2 = new lh.e(g10, tVar, 1);
            eVar2.start();
            h.f18185i = eVar2;
        }
        z0();
    }

    public final void G0() {
        lh.g gVar = h.f18184h;
        if (gVar != null) {
            gVar.cancel();
        }
        h.f18184h = null;
        if (this.J0.get()) {
            return;
        }
        k0.f18124a.execute(new r(this, 8));
    }

    public final void H0() {
        this.D0 = true;
        c cVar = this.f14392y0;
        ((List) ((wf.h) cVar.f2456a).f24705b).clear();
        if (this.R == null) {
            this.R = ((ViewStub) findViewById(R.id.long_stay_retain_vs)).inflate();
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.R.findViewById(R.id.long_stay_retain_anim);
        TextView textView = (TextView) this.R.findViewById(R.id.scene1_title_tv);
        TextView textView2 = (TextView) this.R.findViewById(R.id.scene1_subtitle_tv);
        textView2.post(new s(textView2, new int[]{getResources().getColor(R.color.color_100_ffffff), getResources().getColor(R.color.color_100_FFE9B3)}, 1));
        h hVar = h.f18177a;
        if (textView != null) {
            textView.clearAnimation();
        }
        textView2.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, w.n("FGwyaGE=", "lJ3bLUdF"), 0.0f, 1.0f);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(100L);
        w.n("InQWcj1MHm4lU0dhO1M2ZTtlAEEtaSckG2E8YiJhEDE0", "wQF45K1c");
        ofFloat.addListener(new gh.k(textView, 3));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, w.n("MGwHaGE=", "Nm0fgUH8"), 1.0f, 0.0f);
        ofFloat2.setStartDelay(1450L);
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, w.n("FGwyaGE=", "DfZlK2cf"), 0.0f, 1.0f);
        ofFloat3.setStartDelay(100L);
        ofFloat3.setDuration(150L);
        w.n("InQWcj1MHm4lU0dhO1M2ZTtlAEEtaSckBmFfYjdhEjE3", "j2S6ZERt");
        ofFloat3.addListener(new gh.k(textView2, 4));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView2, w.n("MGwHaGE=", "wxHkqxk5"), 1.0f, 0.0f);
        ofFloat4.setStartDelay(1450L);
        ofFloat4.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
        Object obj = cVar.f2456a;
        ((wf.h) obj).getClass();
        Keyframe ofFloat5 = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat6 = Keyframe.ofFloat(0.3809f, 1.2f);
        Keyframe ofFloat7 = Keyframe.ofFloat(0.7142f, 0.94f);
        Keyframe ofFloat8 = Keyframe.ofFloat(0.904f, 1.02f);
        Keyframe ofFloat9 = Keyframe.ofFloat(1.0f, 1.0f);
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(w.n("JmM7bBRY", "ttUZqqhT"), ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9);
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(w.n("MGMsbBRZ", "fJCMqki7"), ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, ofKeyframe, ofKeyframe2);
        ofPropertyValuesHolder.setDuration(640L);
        w.n("GmYSciJwK3I9eT1hHnVRcw1vWmQMclF00IDCIAZ1B2EBaS1ubT1uNn0wYSBSIBQgZSAWfQ==", "Vse82dbu");
        ofPropertyValuesHolder.start();
        ((wf.h) obj).getClass();
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(textView2, ofKeyframe, ofKeyframe2);
        ofPropertyValuesHolder2.setStartDelay(80L);
        ofPropertyValuesHolder2.setDuration(640L);
        w.n("PmYnciZwFHI2eWVhLnUwcx1vXWQmcmJztIDtID51R2ElaRhuaT1RNnYwOSBiIHUgdSARfQ==", "VKZ5PUpv");
        ofPropertyValuesHolder2.start();
        ((wf.h) obj).getClass();
        lottieAnimationView.f3825h.f12580c.addListener(new k.c(this, 13));
        lottieAnimationView.g();
        wf.h hVar2 = (wf.h) obj;
        List list = (List) hVar2.f24705b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                list.add(new lh.d(lottieAnimationView, lottieAnimationView.getProgress(), hVar2.f24704a ? System.currentTimeMillis() : 0L));
            } else if (og.a.e(((lh.d) it.next()).f18166a, lottieAnimationView)) {
                break;
            }
        }
        int[] iArr = {getResources().getColor(R.color.color_100_ffffff), getResources().getColor(R.color.color_100_FFD572)};
        int[] iArr2 = {getResources().getColor(R.color.color_100_ffffff), getResources().getColor(R.color.color_100_ffffff), getResources().getColor(R.color.color_100_FFD572), getResources().getColor(R.color.color_100_FFD572)};
        TextView textView3 = (TextView) this.R.findViewById(R.id.scene3_title_tv);
        TextView textView4 = (TextView) this.R.findViewById(R.id.scene3_subtitle_tv);
        TextView textView5 = (TextView) this.R.findViewById(R.id.scene3_center1_tv);
        String string = getString(R.string.arg, w.n("RDQ=", "A4tmilr6"));
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new AbsoluteSizeSpan(48, true), string.indexOf(w.n("RDQ=", "GAOVzADF")) + 2, spannableString.length(), 18);
        textView5.setText(spannableString);
        TextView textView6 = (TextView) this.R.findViewById(R.id.scene3_bottom_tv);
        textView3.post(new s(textView3, iArr, 2));
        textView4.post(new s(textView4, iArr, 2));
        textView5.post(new s(textView5, iArr2, 2));
        textView6.post(new s(textView6, iArr, 2));
        View findViewById = this.R.findViewById(R.id.scene3_top_layout);
        View findViewById2 = this.R.findViewById(R.id.scene3_bottom_layout);
        Keyframe ofFloat10 = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat11 = Keyframe.ofFloat(0.3148f, 1.2f);
        Keyframe ofFloat12 = Keyframe.ofFloat(0.5789f, 0.94f);
        Keyframe ofFloat13 = Keyframe.ofFloat(0.7894f, 1.01f);
        Keyframe ofFloat14 = Keyframe.ofFloat(1.0f, 1.0f);
        PropertyValuesHolder ofKeyframe3 = PropertyValuesHolder.ofKeyframe(w.n("BmMjbChY", "mkysmN12"), ofFloat10, ofFloat11, ofFloat12, ofFloat13, ofFloat14);
        PropertyValuesHolder ofKeyframe4 = PropertyValuesHolder.ofKeyframe(w.n("BmMjbChZ", "PTVNprup"), ofFloat10, ofFloat11, ofFloat12, ofFloat13, ofFloat14);
        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(findViewById, ofKeyframe3, ofKeyframe4);
        ofPropertyValuesHolder3.setStartDelay(3160L);
        ofPropertyValuesHolder3.setDuration(950L);
        w.n("HHQgcgdMVm4_UxJhLFNQZVxldUEDaVgkCmEVYlJhbjIz", "UsoAs9eO");
        ofPropertyValuesHolder3.addListener(new gh.k(findViewById, 5));
        w.n("GmYSciJwK3I9eT1hHnVRcw1vWmQMclF0lYDURV0gWSBVIGIgbSBuIGl9YSBSIBQgZSAWfQ==", "DjQ6wrWy");
        ofPropertyValuesHolder3.start();
        ((wf.h) obj).getClass();
        ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(findViewById2, ofKeyframe3, ofKeyframe4);
        ofPropertyValuesHolder4.setStartDelay(3160L);
        ofPropertyValuesHolder4.setDuration(950L);
        w.n("GXQCciJMV24_UxJhLFNQZVxldUEDaVgkCmEVYlJhbjI1", "rHjcV832");
        ofPropertyValuesHolder4.addListener(new gh.k(findViewById2, 6));
        w.n("IWYXcj1wUXIseTBhOXVWc3pvKmQIch1ihIDeRTwgaiBuIGcgciAUIHh9bCB1IBMgEiBmfQ==", "yINGR4dH");
        ofPropertyValuesHolder4.start();
        ((wf.h) obj).getClass();
    }

    @Override // uf.i
    public final void V() {
        this.f14371j = findViewById(R.id.billing_ll_monthly_container);
        this.f14372k = findViewById(R.id.billing_ll_weekly_container);
        TextView textView = (TextView) findViewById(R.id.billing_tv_bottom_hint);
        this.f14377p = textView;
        textView.setVerticalScrollBarEnabled(false);
        this.f14377p.setHorizontalScrollBarEnabled(false);
        this.f14373l = (TextView) findViewById(R.id.billing_tv_skip);
        this.E = (ImageView) findViewById(R.id.billing_iv_close);
        this.f14391y = (TextView) findViewById(R.id.billing_tv_title);
        ImageView imageView = (ImageView) findViewById(R.id.billing_iv_top_icon);
        this.f14378q = (RecyclerView) findViewById(R.id.billing_rv_result);
        this.f14379r = (TextView) findViewById(R.id.billing_tv_continue);
        this.I = findViewById(R.id.billing_v_continue_bg);
        this.f14380s = (TextView) findViewById(R.id.billing_tv_monthly_price);
        this.f14381t = (TextView) findViewById(R.id.billing_tv_weekly_price);
        this.f14387w = (TextView) findViewById(R.id.billing_tv_monthly_origin_price);
        this.f14393z = (TextView) findViewById(R.id.billing_tv_monthly_title);
        this.A = (TextView) findViewById(R.id.billing_tv_weekly_title);
        this.B = (ImageView) findViewById(R.id.billing_iv_weekly_selected_right);
        this.C = (ImageView) findViewById(R.id.billing_iv_monthly_selected_right);
        this.D = (TextView) findViewById(R.id.billing_tv_monthly_price_discount);
        this.F = findViewById(R.id.guideText);
        this.H = findViewById(R.id.v_guide_root);
        this.J = findViewById(R.id.billing_cl_gift_container);
        this.K = findViewById(R.id.billing_cl_gift_container1);
        this.N = (LottieAnimationView) findViewById(R.id.billing_lottie_gift_loading);
        this.L = (LottieAnimationView) findViewById(R.id.billing_lottie_gift_loading1);
        this.O = (ItalicTextView) findViewById(R.id.billing_tb_gift_title);
        this.M = (AutoSpanTextView) findViewById(R.id.billing_tb_gift_title1);
        this.P = (ItalicTextView) findViewById(R.id.billing_tb_gift_title2);
        this.Q = (ItalicTextView) findViewById(R.id.billing_tb_gift_sub_title);
        this.U = (ConstraintLayout) findViewById(R.id.retainCl);
        if (og.a.c0(this)) {
            this.B.setImageResource(R.drawable.ic_subscription_select_rtl);
            this.C.setImageResource(R.drawable.ic_subscription_select_rtl);
        } else {
            this.B.setImageResource(R.drawable.ic_subscription_select);
            this.C.setImageResource(R.drawable.ic_subscription_select);
        }
        if (getResources().getDisplayMetrics().heightPixels <= 800) {
            imageView.setVisibility(View.GONE);
        }
        this.H.setOnTouchListener(new i2(this, 3));
        TextView textView2 = this.f14387w;
        textView2.setPaintFlags(textView2.getPaintFlags() | 16 | 1);
        A0(this.f14391y, new int[]{getResources().getColor(R.color.color_100_047BFF_FFF1BD), getResources().getColor(R.color.color_100_1157FF_FDFFE6), getResources().getColor(R.color.color_100_1C38FF_FFF1BD)});
        int[] iArr = {getResources().getColor(R.color.color_100_FF7F2C), getResources().getColor(R.color.color_100_FFDFA0), getResources().getColor(R.color.color_100_FFB348)};
        this.O.setLabelText(q0(w.n("Mw==", "RMH5J3D5")));
        this.P.setLabelText(p0(w.n("Mw==", "JFpyayUL")));
        A0(this.O, iArr);
        A0(this.P, iArr);
        A0(this.Q, iArr);
        int[] iArr2 = {getResources().getColor(R.color.color_100_EEE1BD), getResources().getColor(R.color.color_100_F0D68F), getResources().getColor(R.color.color_100_F2D37C)};
        this.M.setLabelText(getString(R.string.arg, w.n("Mw==", "HLFOEx15")));
        A0(this.M, iArr2);
        this.f14378q.setLayoutManager(new LinearLayoutManager(1));
        this.f14371j.setOnClickListener(this);
        this.f14372k.setOnClickListener(this);
        this.f14373l.setOnClickListener(this);
        this.I.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.f14377p.setMovementMethod(ScrollingMovementMethod.getInstance());
        mg.e eVar = new mg.e(1);
        this.f14378q.setAdapter(eVar);
        vf.a aVar = new vf.a(getString(R.string.arg));
        vf.a aVar2 = new vf.a(getString(R.string.arg));
        vf.a aVar3 = new vf.a(getString(R.string.arg));
        vf.a aVar4 = new vf.a(getString(R.string.arg));
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        arrayList.add(aVar2);
        arrayList.add(aVar3);
        arrayList.add(aVar4);
        eVar.D(arrayList);
        z0();
        y0();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.I, PropertyValuesHolder.ofFloat(w.n("OWMUbCtY", "qXJuN7Eb"), 1.0f, 0.95f, 1.0f), PropertyValuesHolder.ofFloat(w.n("BmMjbChZ", "rvipm1nk"), 1.0f, 0.95f, 1.0f));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.start();
    }

    @Override // uf.i
    public final int W() {
        return og.a.Z(this) ? R.layout.activity_billing_page_long : R.layout.activity_billing_page;
    }

    @Override // uf.i
    public final void Y(com.gyf.immersionbar.e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.f12030k.f11991f = true;
        eVar.o(R.id.billing_v_faker_status);
        eVar.h(R.color.color_100_white_262626);
        eVar.m(!this.f22860d);
        eVar.f();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [yg.q] */
    /* JADX WARN: Type inference failed for: r0v24, types: [yg.q] */
    @Override // uf.i
    public final void Z() {
        final int i10 = 0;
        boolean booleanExtra = getIntent().getBooleanExtra(w.n("OHMxciZtOW8vZXhleQ==", "4hPCKy0Z"), false);
        this.f14376o = booleanExtra;
        if (booleanExtra) {
            this.E.setVisibility(View.VISIBLE);
            this.f14373l.setVisibility(View.GONE);
        } else {
            this.E.setVisibility(View.GONE);
            this.f14373l.setVisibility(View.VISIBLE);
        }
        final int i11 = 1;
        if (og.a.e(h.i(), h.f18179c)) {
            if (this.f14394z0) {
                this.Z = true;
                F0(false);
                this.f14394z0 = false;
                return;
            } else if (!this.B0 && h.c()) {
                this.Z = true;
                F0(false);
                return;
            } else {
                if (this.B0) {
                    return;
                }
                if (this.D0) {
                    D0();
                    return;
                } else {
                    h.r(this, new vi.a(this) { // from class: yg.q

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BillingPageActivity f25790b;

                        {
                            this.f25790b = this;
                        }

                        @Override // vi.a
                        public final Object invoke() {
                            int i12 = i10;
                            BillingPageActivity billingPageActivity = this.f25790b;
                            switch (i12) {
                                case 0:
                                    if (billingPageActivity.X) {
                                        billingPageActivity.D0();
                                        break;
                                    }
                                    break;
                                default:
                                    if (billingPageActivity.X) {
                                        billingPageActivity.D0();
                                        break;
                                    }
                                    break;
                            }
                            return null;
                        }
                    });
                    return;
                }
            }
        }
        if (og.a.e(h.i(), h.f18180d)) {
            if (this.A0) {
                B0(true);
                this.A0 = false;
                return;
            } else {
                if (h.b()) {
                    B0(true);
                    return;
                }
                return;
            }
        }
        if (og.a.e(h.i(), h.f18181e)) {
            if (this.A0) {
                B0(true);
                this.A0 = false;
                return;
            }
            if (h.b()) {
                B0(true);
                return;
            }
            if (this.f14394z0) {
                this.Z = true;
                F0(false);
                this.f14394z0 = false;
            } else if (!this.B0 && h.c()) {
                this.Z = true;
                F0(false);
            } else {
                if (this.B0) {
                    return;
                }
                if (this.D0) {
                    D0();
                } else {
                    h.r(this, new vi.a(this) { // from class: yg.q

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BillingPageActivity f25790b;

                        {
                            this.f25790b = this;
                        }

                        @Override // vi.a
                        public final Object invoke() {
                            int i12 = i11;
                            BillingPageActivity billingPageActivity = this.f25790b;
                            switch (i12) {
                                case 0:
                                    if (billingPageActivity.X) {
                                        billingPageActivity.D0();
                                        break;
                                    }
                                    break;
                                default:
                                    if (billingPageActivity.X) {
                                        billingPageActivity.D0();
                                        break;
                                    }
                                    break;
                            }
                            return null;
                        }
                    });
                }
            }
        }
    }

    @Override // uf.i
    public final void d0() {
        String str;
        String str2;
        if (this.f14376o) {
            int i10 = dg.g.f12741j;
            dg.g.F(this, w.n("HGEebhp1E18xaFx3", "5pqmmLEJ"));
            if (f.m(this)) {
                dg.g.F(this, w.n("AWEcbhp1G18ZcgNhCnNbb3c=", "RWLuIyOH"));
            }
        } else {
            int i11 = dg.g.f12741j;
            dg.g.F(this, w.n("H2UAUzxiLnMqb3c=", "w1lSEfZ5"));
        }
        boolean z6 = !this.f14376o;
        String str3 = dg.h.f12742j;
        StringBuilder sb2 = new StringBuilder();
        if (z6) {
            str = "J2U2YSRuAGV3";
            str2 = "A4UOwxAi";
        } else {
            str = "J2U2YSRuA2Egbg==";
            str2 = "C6IbtbRo";
        }
        sb2.append(w.n(str, str2));
        sb2.append(dg.h.f12742j);
        sb2.append(w.n("DnMfb3c=", "Ki8Ua9bM"));
        dg.h.L(this, sb2.toString());
    }

    public final void h0() {
        if (this.f14376o) {
            Context a10 = x5.b.a();
            int i10 = dg.g.f12741j;
            dg.g.F(a10, w.n("CGEYbjt1Ll8bYQhjMGxsY15pJWs=", "coEqhLkY"));
            if (f.m(this)) {
                dg.g.F(x5.b.a(), w.n("J2FfbjZ1Gl8ZcgNhCkNSblFlKl8ObFxjaw==", "O9j6exO3"));
            }
        } else {
            Context a11 = x5.b.a();
            int i11 = dg.g.f12741j;
            dg.g.F(a11, w.n("GWUaU0JiLFMzaRZfNmxaY2s=", "beWm7sZm"));
        }
        if (this.Z) {
            Context a12 = x5.b.a();
            boolean z6 = !this.f14376o;
            String str = dg.h.f12742j;
            if (z6) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.n("IGUEYRluemV3", "9hrpp4gO"));
                a.a.z(sb2, dg.h.f12742j, "CFNCYU5fHGsxcDljOWlQaw==", "ddW67OU8", a12);
                return;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w.n("A2UDYSBuPGErbg==", "hysatzqh"));
                a.a.z(sb3, dg.h.f12742j, "DlMDYTBfMmEsY1ZsHWM5aTZr", "ASGs9O4i", a12);
                return;
            }
        }
        Context a13 = x5.b.a();
        boolean z10 = !this.f14376o;
        String str2 = dg.h.f12742j;
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(w.n("J2U2YSRuAGV3", "3AOefIMo"));
            a.a.z(sb4, dg.h.f12742j, "KlMpaT1fLWwgY2s=", "WjOZL4RD", a13);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(w.n("A2UDYSBuPGErbg==", "0HkqQ6xE"));
            a.a.z(sb5, dg.h.f12742j, "KkMjbi5lIl8qbAJjaw==", "eflimNY1", a13);
        }
    }

    public final b i0(a aVar, d dVar) {
        b m02 = m0(aVar, dVar);
        if (m02 == null) {
            w0();
            m02 = m0(aVar, dVar);
            if (m02 == null) {
                if (j3.j.A(this)) {
                    return null;
                }
                this.f14374m.post(new r(this, 4));
            }
        }
        return m02;
    }

    public final boolean j0() {
        if ((!og.a.e(h.i(), h.f18180d) && !og.a.e(h.i(), h.f18181e)) || this.f14390x0 || !this.Y) {
            return false;
        }
        if (!this.f14376o) {
            return true;
        }
        q.b(w.n("JWUEdA==", "uK5wqvp7"), w.n("JWkCbFBuJFI9dAdpO0hWbEJlNC4KZUFMCW4fU0JhM1ICdA9pV1M3YSxlTik9", "NRgn9C1R") + h.h() + w.n("akIebCVpH2cQZUdhK24dZTlwVHJtZy90EWxacxBSIXQwaRlTPWEFZWopEz0=", "R5uDcG0G") + h.e());
        String n10 = w.n("JWUEdA==", "afv8LFr6");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w.n("A2kkbC9uVFI9dAdpO0hWbEJlNC4OaFBjDUMUb0VlGGU1YSFudDR7by1yTik9", "lBAHF3YP"));
        sb2.append(h.a());
        q.b(n10, sb2.toString());
        String n11 = w.n("JWUEdA==", "y5Yf3H8R");
        StringBuilder sb3 = new StringBuilder("");
        sb3.append(h.h() != 0 && this.S == null);
        sb3.append(w.n("Ow==", "4ezU4gnb"));
        sb3.append(h.e() == 1 && h.a());
        q.b(n11, sb3.toString());
        return h.h() != 0 && this.S == null && h.a();
    }

    public final void k0() {
        if (this.f14376o) {
            finish();
        } else {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final d n0() {
        char c10;
        String i10 = h.i();
        switch (i10.hashCode()) {
            case 65:
                if (i10.equals(w.n("QQ==", "GPvSU0eK"))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 66:
                if (i10.equals(w.n("Qg==", "Aa1b47ry"))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 67:
                if (i10.equals(w.n("Qw==", "cdJ456tt"))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 68:
                if (i10.equals(w.n("RA==", "wmJMSC7B"))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? d.MONTH_TRIAL_3D : d.MONTH_D_TRIAL_3D : this.Z ? d.MONTH_C_TRIAL_14D : this.f14390x0 ? d.MONTH_C_TRIAL_30D : d.MONTH_C_TRIAL_3D : this.f14390x0 ? d.MONTH_B_TRIAL_30D : d.MONTH_B_TRIAL_3D : this.Z ? d.MONTH_A_TRIAL_14D : d.MONTH_A_TRIAL_3D;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.billing_tv_skip || id2 == R.id.billing_iv_close) {
            v0(id2);
            return;
        }
        if (id2 == R.id.billing_ll_monthly_container) {
            if (this.f14371j.isSelected()) {
                G0();
            }
            z0();
            if (this.I0) {
                this.f14379r.setText(getString(R.string.arg, w.n("Mw==", "q6kFBrxn")));
                return;
            } else {
                this.f14379r.setText(getString(R.string.arg));
                return;
            }
        }
        if (id2 != R.id.billing_ll_weekly_container) {
            if (id2 == R.id.billing_v_continue_bg) {
                if (lh.n.a(id2)) {
                    return;
                }
                G0();
                return;
            } else {
                if (id2 != R.id.long_stay_btn_layout || lh.n.a(id2)) {
                    return;
                }
                this.O.setLabelText(q0(w.n("BzQ=", "zV6bvqHY")));
                this.P.setLabelText(p0(w.n("YDQ=", "oSrH9Y6J")));
                G0();
                return;
            }
        }
        if (this.f14372k.isSelected()) {
            G0();
        }
        int[] iArr = {getResources().getColor(R.color.color_100_0380FF_white), getResources().getColor(R.color.color_100_1C37FF_white)};
        int[] iArr2 = {getResources().getColor(R.color.color_100_0283FF_FFEE59), getResources().getColor(R.color.color_100_1C37FF_FFBA52)};
        int[] iArr3 = {getResources().getColor(R.color.color_100_black_white), getResources().getColor(R.color.color_100_black_white)};
        int[] iArr4 = {getResources().getColor(R.color.color_100_black_60_white), getResources().getColor(R.color.color_100_black_60_white)};
        this.f14371j.setSelected(false);
        this.f14372k.setSelected(true);
        A0(this.A, iArr);
        A0(this.f14381t, iArr2);
        A0(this.f14393z, iArr3);
        A0(this.f14380s, iArr4);
        this.C.setVisibility(View.GONE);
        this.B.setVisibility(View.VISIBLE);
        if (this.Z) {
            View view2 = this.S;
            if (view2 != null) {
                view2.setVisibility(View.GONE);
            }
            View view3 = this.T;
            if (view3 != null) {
                view3.setVisibility(View.GONE);
            }
            this.I.setVisibility(View.VISIBLE);
            h0.d dVar = (h0.d) this.f14371j.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = getResources().getDimensionPixelOffset(R.dimen.dp_35);
            this.f14371j.setLayoutParams(dVar);
        } else {
            this.I.setVisibility(View.VISIBLE);
        }
        this.f14379r.setText(getString(R.string.arg));
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String r10;
        h hVar = h.f18177a;
        Context a10 = x5.b.a();
        String str = f.f12740a;
        if (a10 == null) {
            r10 = w.n("WGxk", "BC79WMI6");
        } else if (yh.b.b().f25816b) {
            q.b(w.n("F2kubCRuKV87ZR9hG25rdDxwZQ==", "uvnn26Fp"), v.a().R);
            r10 = v.a().R;
        } else {
            r10 = j3.j.r(w.n("JWkPbBhuCV8qZRJhPG5sdEtwZQ==", "ToGcqngF"), "");
            nh.a.e(w.n("M2kbbCBuFl8wZUdhK24KdCxwVCAxZStsSGRXdDMg", "h6RbvapC"), r10);
            if (TextUtils.isEmpty(r10)) {
                r10 = w.n("Pmxk", "5LYKbDAx");
            }
            nh.a.e(w.n("F2kubCRuKV87ZR9hG25rdDxwZQ==", "KwXcIAld"), r10);
        }
        boolean z6 = yh.b.b().f25816b;
        h hVar2 = h.f18177a;
        String str2 = h.f18178b;
        if (z6) {
            og.a.o(r10, w.n("JXkHZQ==", "wDn2M95L"));
            hVar2.getClass();
            h.q(r10);
            q.b(str2, w.n("EWUgdSo6bm85ZQUsUnJRcyB0FnIMdBhpIiACeT5lbj0g", "iUhyLvNN").concat(r10));
        } else {
            if (!(h.i().length() == 0)) {
                r10 = h.i();
                q.b(str2, w.n("C2E1ID15JGV0IBJ5JWUTPSA=", "UWcFITHE").concat(r10));
            } else if (lh.c.a().c()) {
                og.a.o(r10, w.n("LHkGZQ==", "HiXvriEu"));
                hVar2.getClass();
                h.q(r10);
                q.b(str2, w.n("G2U1IDhzK3JlIBhlBiBGZTFhX25JdABwASBPIA==", "CrdldrRB").concat(r10));
            } else {
                r10 = h.f18183g;
                hVar2.getClass();
                h.q(r10);
                q.b(str2, w.n("PmwTIDxzFHJidUNkI3QwLHV0SHAmIHcgOmxk", "UcshOt5S"));
            }
        }
        String str3 = dg.h.f12742j;
        og.a.o(r10, w.n("RnkFZQ==", "7e2uRhJ9"));
        w.n("JXkHZQ==", "OSELxrpx");
        dg.h.f12742j = r10;
        this.f14388w0 = false;
        if (bundle != null) {
            this.f14388w0 = bundle.getBoolean(w.n("HHMEciJtHGU6dQZl", "2xjFTxY3"), false);
            this.B0 = bundle.getBoolean(w.n("JHMlcjltOHU2ZApl", "69McVzsg"), false);
            this.D0 = bundle.getBoolean(w.n("ImMSbiwxInQjcnQ=", "qfH4045v"), false);
            this.Z = bundle.getBoolean(w.n("HHMObyNnHGU9YQJuNXVdZCBTXm93", "uByVVb68"), false);
            this.f14390x0 = bundle.getBoolean(w.n("DHMZbBVzI1I9dAdpO1Nbb3c=", "vHeZzFmj"), false);
            this.f14394z0 = bundle.getBoolean(w.n("XXMEYThlf282ZzRlIWFabmhlNG8-aFp3", "124WN37Y"), false);
            this.A0 = bundle.getBoolean(w.n("OHMkYT9lMmwtc1ZSJ3Q0aTtaVHIsUyJvdw==", "wr37auE4"), false);
        }
        super.onCreate(bundle);
        if (yh.b.b().W || yh.b.b().f25819c0) {
            yh.b.b().W = false;
            yh.b.b().f25819c0 = false;
            yh.b.b().d();
        }
        androidx.activity.q onBackPressedDispatcher = getOnBackPressedDispatcher();
        i0 i0Var = new i0(1, this, true);
        onBackPressedDispatcher.f387b.add(i0Var);
        i0Var.f379b.add(new androidx.activity.p(onBackPressedDispatcher, i0Var));
        if (p9.a.s()) {
            onBackPressedDispatcher.c();
            i0Var.f380c = onBackPressedDispatcher.f388c;
        }
    }

    @Override // uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0.removeAllUpdateListeners();
        }
        super.onDestroy();
        this.f14374m.removeCallbacksAndMessages(null);
        if (isFinishing()) {
            lh.g gVar = h.f18184h;
            if (gVar != null) {
                gVar.cancel();
            }
            h.f18184h = null;
            lh.e eVar = h.f18185i;
            if (eVar != null) {
                eVar.cancel();
            }
            h.f18185i = null;
            h.o(0L);
            h.k(0L);
            h.f18189m = false;
            h.f18186j = false;
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        wf.h hVar = (wf.h) this.f14392y0.f2456a;
        hVar.f24704a = true;
        for (lh.d dVar : (List) hVar.f24705b) {
            dVar.f18167b = dVar.f18166a.getProgress();
            dVar.f18168c = System.currentTimeMillis();
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        wf.h hVar = (wf.h) this.f14392y0.f2456a;
        hVar.f24704a = false;
        for (lh.d dVar : (List) hVar.f24705b) {
            long currentTimeMillis = System.currentTimeMillis() - dVar.f18168c;
            LottieAnimationView lottieAnimationView = dVar.f18166a;
            long duration = lottieAnimationView.getDuration();
            if (duration > 0 && currentTimeMillis >= 0) {
                float f10 = dVar.f18167b + (currentTimeMillis / (duration * 1.0f));
                lottieAnimationView.setProgress(f10 <= 1.0f ? f10 : 1.0f);
            }
        }
        if (!this.f14376o && this.G && !ua.b.c(this.f14389x)) {
            C0();
            this.G = false;
        }
        if (this.V) {
            this.f14374m.postDelayed(new r(this, 7), 500L);
        }
        if (this.f14388w0 && h.h() == 0 && h.g() > 0) {
            this.f14388w0 = false;
            F0(true);
        }
    }

    @Override // androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        StrikeThroughTextView strikeThroughTextView;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(w.n("D3NxchVtOWUrdQtl", "Isf7zkKP"), this.f14388w0);
        bundle.putBoolean(w.n("BmMnbigxHXQocnQ=", "b4CLkjKV"), this.D0);
        bundle.putBoolean(w.n("HHMObyNnHGU9YQJuNXVdZCBTXm93", "WsbpNYML"), this.Z);
        bundle.putBoolean(w.n("IXMkbCpzPFI9dAdpO1Nbb3c=", "nXHgEYzw"), this.f14390x0);
        if (h.h() == 0 || h.e() == 0) {
            bundle.putBoolean(w.n("HHMEciJtDHUnZAdl", "bIr4cuLr"), true);
        }
        if (this.Z && h.h() == 1 && (strikeThroughTextView = this.f14382t0) != null && !TextUtils.isEmpty(strikeThroughTextView.getText())) {
            bundle.putBoolean(w.n("OHMkYT9lPW8sZ2FlNmE8bg9lQ28QaCV3", "X1QmgDah"), true);
        }
        if (this.f14390x0 && h.e() == 1) {
            if (h.f18185i == null) {
                return;
            }
            bundle.putBoolean(w.n("OHMkYT9lMmwtc1ZSJ3Q0aTtaVHIsUyJvdw==", "cjO4SdW6"), true);
        }
    }

    @Override // j.p, androidx.fragment.app.w, android.app.Activity
    public final void onStart() {
        super.onStart();
        tg.b.j().P(new r(this, 5));
    }

    @Override // j.p, androidx.fragment.app.w, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f14388w0 = true;
        View view = this.S;
        if (view != null && view.getVisibility() == 0) {
            lh.e eVar = h.f18185i;
            if (eVar != null) {
                eVar.cancel();
            }
            h.f18185i = null;
            h.o(h.f18188l);
            return;
        }
        if (this.f14390x0) {
            lh.e eVar2 = h.f18185i;
            if (eVar2 != null) {
                eVar2.cancel();
            }
            h.f18185i = null;
            h.k(h.f18191o);
        }
    }

    public final String p0(String str) {
        String string = getString(R.string.arg, str);
        return string.substring(string.indexOf("\n")).replace("\n", "");
    }

    public final String q0(String str) {
        String string = getString(R.string.arg, str);
        return string.substring(0, string.indexOf("\n")).replace("\n", "");
    }

    public final void r0(b bVar) {
        u1.a aVar = this.f14374m;
        boolean A = j3.j.A(this);
        AtomicBoolean atomicBoolean = this.J0;
        if (A) {
            return;
        }
        int i10 = 1;
        try {
            q.b(w.n("E2kbbCBuZw==", "L13g0Flo"), w.n("MnUFcixuBVAuYV0gfyA=", "DrJxYuaR") + bVar.toString());
            ff.b bVar2 = ff.a.f14050a;
            if (bVar2.k(this, bVar.f15024a, bVar.f15025b)) {
                bVar2.l(true);
                if (this.f14371j.isSelected()) {
                    if (this.f14376o) {
                        Context a10 = x5.b.a();
                        int i11 = dg.g.f12741j;
                        dg.g.F(a10, w.n("OGErbh51LF8EbwV0GmxNXzZ1VWMMc3M=", "knPM6T4Q"));
                        if (f.m(this)) {
                            dg.g.F(x5.b.a(), w.n("OGErbh51LF8Icg5hLU1bbjFoWnk2cwxjOmU-cw==", "bbyXYMoC"));
                        }
                    } else {
                        Context a11 = x5.b.a();
                        int i12 = dg.g.f12741j;
                        dg.g.F(a11, w.n("O2U1UzhiEU0mbh9oHnlrczBjVWUacw==", "OoRM3ULj"));
                    }
                    if (this.Z && !this.f14390x0) {
                        dg.h.H(x5.b.a(), !this.f14376o);
                    } else if (this.f14390x0) {
                        dg.h.G(x5.b.a(), !this.f14376o);
                    } else {
                        dg.h.J(x5.b.a(), !this.f14376o);
                    }
                } else {
                    if (this.f14376o) {
                        Context a12 = x5.b.a();
                        int i13 = dg.g.f12741j;
                        dg.g.F(a12, w.n("PWEabhF1Gl8PZQNrOXlsc0djJWUecw==", "C9psBxu7"));
                        if (f.m(this)) {
                            dg.g.F(x5.b.a(), w.n("HGEebhp1E18DclZhHVcwZT5sSF8wdSljBHNz", "aEOshskk"));
                        }
                    } else {
                        Context a13 = x5.b.a();
                        int i14 = dg.g.f12741j;
                        dg.g.F(a13, w.n("GmUFU0RiF1c9ZQ1sLF9AdVFjI3Nz", "2KTr1HQx"));
                    }
                    if (this.Z) {
                        dg.h.I(x5.b.a(), !this.f14376o);
                    } else {
                        dg.h.K(x5.b.a(), !this.f14376o);
                    }
                }
                aVar.post(new r(this, i10));
            }
        } catch (hf.a e10) {
            q.b(w.n("F2kubCRuKV89YWc=", "hZDODKVs"), w.n("GWIPeXRlJ3I3ckY6IA==", "Cl9zTUPg") + e10);
            if (!j3.j.A(this)) {
                if (u0()) {
                    x0();
                } else {
                    this.G = true;
                }
                switch (e10.f15611a) {
                    case AdError.CACHE_ERROR_CODE /* 2002 */:
                        aVar.post(new r(this, 3));
                        break;
                    case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                        ff.a.f14050a.l(true);
                        s0();
                        break;
                    case 2007:
                        ff.a.f14050a.l(false);
                    case AdError.INTERNAL_ERROR_2006 /* 2006 */:
                    case AdError.REMOTE_ADS_SERVICE_ERROR /* 2008 */:
                        aVar.post(new r(this, 2));
                        break;
                }
            }
        } finally {
            atomicBoolean.set(false);
        }
    }

    public final void s0() {
        p pVar = new p(this, 1);
        u1.a aVar = this.f14374m;
        aVar.post(pVar);
        aVar.postDelayed(new p(this, 2), 1000L);
    }

    public void setVisibilityWithAnimal(View view) {
        view.clearAnimation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        view.startAnimation(alphaAnimation);
    }

    public final void t0() {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        View view = this.F;
        if (view != null) {
            view.setVisibility(View.GONE);
        }
        View view2 = this.H;
        if (view2 != null) {
            view2.setVisibility(View.GONE);
        }
    }

    public final void v0(int i10) {
        if (lh.n.a(i10)) {
            return;
        }
        if (!this.f14390x0) {
            h0();
        }
        if (j0()) {
            B0(false);
            return;
        }
        if (this.f14390x0 && !this.f14376o) {
            h.l(1);
        }
        if (this.Z && !this.f14376o) {
            h.p(1);
        }
        k0();
    }

    public final void w0() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(ff.a.f14050a.h());
            q.b(w.n("E2kbbCBuZw==", "GXG0siaZ"), w.n("I2URcixzGUIrbF9pLGcRYSFhOg==", "aDNFJj5Z") + hashMap.toString());
        } catch (hf.a e10) {
            e10.printStackTrace();
            if (2003 == e10.f15611a) {
                ff.a.f14050a.l(true);
            }
        }
        String n10 = w.n("E2kuZRJyK2Mmdg5yC19EciBtX3UEX2E=", "KpcJDBJO");
        String n11 = w.n("C2kLZSxyXGM3dgNyLF9DcldtL3UAX2I=", "dNmgs9oW");
        if (og.a.e(h.i(), h.f18179c)) {
            n10 = w.n("E2kuZRJyK2Mmdg5yC19EciBtX3UEMSZtCm4aaA==", "QGXBen6U");
            n11 = w.n("N2kbZRZyFGMtdlZyO18lcjBtWHUuMRV3JmVr", "CaOCiNCJ");
        } else if (og.a.e(h.i(), h.f18180d)) {
            n10 = w.n("E2kuZRJyK2Mmdg5yC19EciBtX3UEMiZtFm4WaA==", "lopIybGl");
            n11 = w.n("N2kbZRZyFGMtdlZyO18lcjBtWHUuMhV3UGVr", "5R8dGZUC");
        } else if (og.a.e(h.i(), h.f18181e)) {
            n10 = w.n("E2kuZRJyK2Mmdg5yC19EciBtX3UEMyZtIm4kaA==", "EXV1MPp2");
            n11 = w.n("M2kLZTpyXGM3dgNyLF9DcldtL3UAM2p3A2Vr", "9cUge9He");
        } else if (og.a.e(h.i(), h.f18182f)) {
            n10 = w.n("N2kbZRZyFGMtdlZyO18lcjBtWHUuNBVtPG44aA==", "SLvAha2S");
            n11 = w.n("VGk0ZSlyM2M3dgNyLF9DcldtL3UANGp3A2Vr", "qI2XvVN4");
        }
        this.f14383u = (a) hashMap.get(n10);
        a aVar = (a) hashMap.get(n11);
        this.f14385v = aVar;
        a aVar2 = this.f14383u;
        if (aVar2 == null || aVar == null) {
            return;
        }
        List<b> list = aVar2.f15023d;
        List<b> list2 = aVar.f15023d;
        if (dg.a.T(list) || dg.a.T(list2)) {
            return;
        }
        this.I0 = false;
        this.X = false;
        this.Y = false;
        a aVar3 = this.f14383u;
        this.H0 = aVar3.f15021b;
        this.E0 = aVar3.f15022c;
        for (b bVar : list2) {
            if (bVar != null) {
                d dVar = d.WEEK;
                d dVar2 = bVar.f15024a;
                if (dVar.equals(dVar2) || d.WEEK_A.equals(dVar2) || d.WEEK_B.equals(dVar2) || d.WEEK_C.equals(dVar2) || d.WEEK_D.equals(dVar2)) {
                    this.G0 = bVar.f15026c;
                }
            }
        }
        for (b bVar2 : list) {
            if (bVar2 != null) {
                this.F0 = bVar2.f15026c;
                d dVar3 = d.MONTH_TRIAL_3D;
                d dVar4 = bVar2.f15024a;
                if (dVar3.equals(dVar4) || d.MONTH_A_TRIAL_3D.equals(dVar4) || d.MONTH_B_TRIAL_3D.equals(dVar4) || d.MONTH_C_TRIAL_3D.equals(dVar4) || d.MONTH_D_TRIAL_3D.equals(dVar4)) {
                    this.I0 = true;
                    q.b(w.n("N2kubCRuZw==", "VeVr1uWe"), w.n("BmE4MwFhT0YqZQMgaCBHckdlfSAZeUVlRj0g", "RDnKE6TH") + dVar4);
                }
                if (d.MONTH_A_TRIAL_14D.equals(dVar4) || d.MONTH_C_TRIAL_14D.equals(dVar4)) {
                    this.X = true;
                    q.b(w.n("N2kubCRuZw==", "kR1ukoNL"), w.n("OWEEMX1EEHkEclZlYj11dCd1VDtjdDNwPSANIA==", "X0SlIGOQ") + dVar4);
                }
                if (d.MONTH_B_TRIAL_30D.equals(dVar4) || d.MONTH_C_TRIAL_30D.equals(dVar4)) {
                    this.Y = true;
                    q.b(w.n("N2kubCRuZw==", "jOIrp8eg"), w.n("HWExM31EL3kPcg5lUj0UdDd1UztJdABwJyAOIA==", "TJIVB34Y") + dVar4);
                }
            }
        }
        this.f14374m.post(new r(this, 6));
    }

    public final void y0() {
        this.f14387w.setText(getString(R.string.arg, this.E0));
        this.f14380s.setText(getString(R.string.arg, this.F0));
        this.f14381t.setText(getString(R.string.arg, this.G0));
        if (this.I0 && this.f14371j.isSelected()) {
            this.f14379r.setText(getString(R.string.arg, w.n("Mw==", "ZLx9CBex")));
        } else {
            this.f14379r.setText(getString(R.string.arg));
        }
        this.D.setText(getString(R.string.arg, this.H0));
    }

    public final void z0() {
        int[] iArr = {getResources().getColor(R.color.color_100_0380FF_white), getResources().getColor(R.color.color_100_1C37FF_white)};
        int[] iArr2 = {getResources().getColor(R.color.color_100_0283FF_FFEE59), getResources().getColor(R.color.color_100_1C37FF_FFBA52)};
        int[] iArr3 = {getResources().getColor(R.color.color_100_black_white), getResources().getColor(R.color.color_100_black_white)};
        int[] iArr4 = {getResources().getColor(R.color.color_100_black_60_white), getResources().getColor(R.color.color_100_black_60_white)};
        this.f14371j.setSelected(true);
        this.f14372k.setSelected(false);
        A0(this.f14393z, iArr);
        A0(this.f14380s, iArr2);
        A0(this.A, iArr3);
        A0(this.f14381t, iArr4);
        this.C.setVisibility(View.VISIBLE);
        this.B.setVisibility(View.GONE);
        if (!this.Z) {
            this.I.setVisibility(View.VISIBLE);
            return;
        }
        View view = this.S;
        if (view != null) {
            view.setVisibility(View.VISIBLE);
        }
        View view2 = this.T;
        if (view2 != null) {
            view2.setVisibility(View.VISIBLE);
        }
        this.I.setVisibility(View.INVISIBLE);
        h0.d dVar = (h0.d) this.f14371j.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = getResources().getDimensionPixelOffset(R.dimen.dp_45);
        this.f14371j.setLayoutParams(dVar);
    }
}
