package filerecovery.photosrecovery.allrecovery.dialog;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.lifecycle.f;
import androidx.lifecycle.v;
import cj.w;

import e6.e;
import ff.b;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import filerecovery.photosrecovery.allrecovery.h;
import j.p;
import j3.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.q;
import mj.i;
import rf.g;
import u1.a;
import x5.d;
import y9.m;

/* loaded from: classes2.dex */
public abstract class BaseProgressDialog extends d implements f {
    public static final /* synthetic */ int I = 0;
    public int A;
    public boolean B;
    public final a C;
    public ValueAnimator D;
    public int E;
    public final AtomicBoolean F;
    public boolean G;
    public boolean H;

    /* renamed from: q, reason: collision with root package name ic final String f14294q;

    /* renamed from: r, reason: collision with root package name */
    public final p f14295r;

    /* renamed from: s, reason: collision with root package name */
    public long f14296s;

    /* renamed from: t, reason: collision with root package name */
    public long f14297t;

    /* renamed from: u, reason: collision with root package name */
    public long f14298u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14299v;

    /* renamed from: w, reason: collision with root package name */
    public int f14300w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14301x;

    /* renamed from: y, reason: collision with root package name */
    public int f14302y;

    /* renamed from: z, reason: collision with root package name */
    public int f14303z;

    public BaseProgressDialog(p pVar) {
        super(pVar);
        this.f14294q = w.n("N2ExZR1yIWc7ZRhzNmlVbCpn", "RTmhRYEM");
        this.f14296s = 3000L;
        this.f14297t = 15000L;
        this.f14300w = 100;
        this.A = -1;
        this.C = new a(this, 7);
        this.F = new AtomicBoolean(false);
        this.f14295r = pVar;
    }

    public static void s(int i10) {
        if (i10 < 2) {
            try {
                if (ff.a.f14050a.j()) {
                    Thread.sleep(500L);
                } else {
                    Thread.sleep(2000L);
                }
                return;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (i10 < 10) {
            try {
                if (ff.a.f14050a.j()) {
                    Thread.sleep(50L);
                } else {
                    Thread.sleep(300L);
                }
                return;
            } catch (InterruptedException e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i10 < 20) {
            try {
                if (ff.a.f14050a.j()) {
                    Thread.sleep(20L);
                } else {
                    Thread.sleep(100L);
                }
            } catch (InterruptedException e12) {
                e12.printStackTrace();
            }
        }
    }

    public final void A() {
        boolean d10 = g.c().d();
        String str = this.f14294q;
        if (!d10) {
            if (!v()) {
                q.b(str, w.n("VXMqbzpBKiBlIAl1BiBab2VhUixJchxTHGEWdExsIGERICNk", "njEOhdlO"));
                te.a.C(7L);
                return;
            } else {
                q.b(str, w.n("cXMfbz5BFSBuIFF1NiBrIDhhSVQqbS8sQmMaZQtrIG41SRl0LG50", "brhauUVB"));
                this.f14300w = 102;
                q();
                return;
            }
        }
        if (this.H) {
            this.f14300w = FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
            return;
        }
        this.f14300w = FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
        q.b(str, w.n("VXMqbzpBKiBlIB5zFyBAaShlDCA=", "XempVGbO") + (System.currentTimeMillis() - this.f14298u));
        g c10 = g.c();
        c10.f20639c.f20633h = false;
        c10.g(this.f14295r);
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void a(v vVar) {
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void c() {
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void d() {
    }

    @Override // x5.d, j.l0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        i.f18582i.f2903b = false;
        AppOpenManager.f14239d = true;
        this.f14295r.getLifecycle().b(this);
        this.B = true;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D.removeAllUpdateListeners();
        }
        a aVar = this.C;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        g.c().f20639c.f20632g = null;
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void e() {
    }

    @Override // androidx.lifecycle.f
    public final void f() {
        this.H = true;
    }

    @Override // androidx.lifecycle.f
    public final void g() {
        this.H = false;
        if (this.f14300w == 104) {
            this.f14300w = 102;
        }
        if (this.f14300w == 103) {
            this.C.postDelayed(new m(this, 13), 1000L);
        }
    }

    @Override // x5.d
    public void p() {
        long j4;
        setCancelable(false);
        u();
        int i10 = 1;
        i.f18582i.f2903b = true;
        p pVar = this.f14295r;
        pVar.getLifecycle().a(this);
        Context context = getContext();
        String str = dg.f.f12740a;
        b bVar = ff.a.f14050a;
        long j10 = 3000;
        if (bVar.j()) {
            j4 = 0;
        } else if (context == null) {
            j4 = 3000;
        } else {
            boolean z6 = yh.b.b().f25816b;
            String str2 = dg.f.f12740a;
            if (z6) {
                long j11 = xf.v.a().f25196a;
                q.b(str2, w.n("cWQSYjxnUT58Pg0-fCAnZTZvR2UxaSRnCm8aXyNlIWUlaRlnFm0Ybh10Wm0nIDo=", "UhGMSdSL") + j11);
                j4 = j11;
            } else {
                int n10 = j.n(context, null, w.n("I2UAYTtkLnInY1x2J3I8bjJfXnIcZC9sC3Qlbj1fPmk_XwNpJGU=", "nLZSf7x6"), 3);
                q.b(str2, w.n("VXInbChhPWVpPlU-TCBGZSZvQGUbaRdnFG87XyNlKmUBaSxnEm0nbhZ0Am0XIA4g", "boEzKIGF") + n10 + w.n("Uw==", "gMMImxHq"));
                j4 = ((long) n10) * 1000;
            }
        }
        this.f14296s = j4;
        Context context2 = getContext();
        if (context2 != null) {
            boolean z10 = yh.b.b().f25816b;
            String str3 = dg.f.f12740a;
            if (z10) {
                long j12 = xf.v.a().f25197b;
                q.b(str3, w.n("VWQnYjhnbj53PlU-TCBGZSZvQGUbaRdnPW82XzFlImUBaSxnEm0veBZ0Am0XIDo=", "lo6ObDUN") + j12);
                j10 = j12;
            } else {
                int n11 = j.n(context2, null, w.n("FGUOYTpkEHI9Ywl2MHJablVfKXIyZFBsA3QRblFfJ2EeXw1pJWU=", "d2fyHOFq"), 15);
                q.b(str3, w.n("cXISbCxhAmViPg0-fCAnZTZvR2UxaSRnPm8CX1ZlJmUlaRlnFm0QeB10Wm0nIG8gOg==", "ap2JFKXN") + n11 + w.n("AiA=", "m70rMEle"));
                j10 = ((long) n11) * 1000;
            }
        }
        this.f14297t = j10;
        this.f14298u = System.currentTimeMillis();
        if (bVar.j()) {
            this.f14300w = 102;
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 100);
        this.D = ofInt;
        ofInt.addUpdateListener(new e(this, i10));
        this.D.setDuration(this.f14297t);
        this.D.setRepeatCount(0);
        this.D.start();
        if (com.bumptech.glide.d.q(pVar)) {
            this.f14300w = 102;
            return;
        }
        if (!(this instanceof WaMediaDeleteProgressDialog)) {
            if (dg.f.b(getContext(), w.n("PnASbhZmBGwuX0FlNWEnZA==", "5MARMbt5"), w.n("PnASbhZmBGwuX0FlNWEnZA==", "r0GLar4C"), xf.v.a().f25209n)) {
                g.c().f20639c.f20632g = new h(this, 12);
                if (!g.c().d()) {
                    te.a.C(7L);
                    return;
                }
                this.C.postDelayed(new yf.e(this, 0), this.f14296s);
                return;
            }
        }
        this.f14300w = 102;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r7.f14298u > r7.f14296s) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        if (v() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        boolean z6;
        int i10 = this.f14300w;
        if (i10 != 100) {
            if (i10 == 102 && this.f14299v) {
            }
            z6 = false;
        } else {
            if (this.f14299v) {
            }
            z6 = false;
        }
        if (z6 && this.F.compareAndSet(false, true)) {
            q.b(this.f14294q, w.n("cSAUbCxhHyAkaV1pMWgwZHUsEXUwZWp0GG02IGg9WSA=", "qSUy5k49") + (System.currentTimeMillis() - this.f14298u));
            this.C.sendEmptyMessage(1040);
            t();
        }
    }

    public final boolean r(String str, Exception exc) {
        boolean z6 = exc instanceof FileNotFoundException;
        a aVar = this.C;
        if (z6) {
            String message = exc.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains(w.n("FE44UxlD", "5EwXjXuQ"))) {
                aVar.post(new yf.e(this, 1));
                return true;
            }
        }
        if (og.a.J() >= ((float) ((new File(str).length() / z5.f.a()) / z5.f.a())) + 20.0f) {
            return false;
        }
        aVar.post(new yf.e(this, 2));
        return true;
    }

    @Override // x5.d, android.app.Dialog
    public final void show() {
        super.show();
        AppOpenManager.f14239d = false;
    }

    public abstract void t();

    public abstract void u();

    public final boolean v() {
        return System.currentTimeMillis() - this.f14298u > this.f14297t;
    }

    public void w() {
        this.f14299v = true;
        q.b(this.f14294q, w.n("cXISYSVGGG4rc1tGLmcg", "afBhBh1L"));
        q();
    }

    public final void x(int i10, int i11) {
        a aVar = this.C;
        Message obtainMessage = aVar.obtainMessage();
        obtainMessage.arg1 = i10;
        obtainMessage.arg2 = i11;
        obtainMessage.what = 1030;
        obtainMessage.obj = og.a.L(i10, i11);
        aVar.sendMessage(obtainMessage);
    }

    public abstract void y(int i10);

    public abstract void z(int i10, int i11, SpannableString spannableString);
}
