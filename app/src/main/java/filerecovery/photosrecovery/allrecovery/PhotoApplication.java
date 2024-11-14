package filerecovery.photosrecovery.allrecovery;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Keep;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import cj.w;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import j.u;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class PhotoApplication extends x5.b {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f14103e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f14104f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f14105g;

    /* renamed from: h, reason: collision with root package name */
    public static int f14106h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f14107i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f14108j;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.n f14109d;

    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new te.a());
        SmartRefreshLayout.setDefaultRefreshInitializer(new te.a());
        f14107i = false;
    }

    public static void c() {
        if (f14108j) {
            return;
        }
        Application application = g7.i.f15000a;
        PhotoApplication photoApplication = x5.b.f24990b;
        og.a.p(photoApplication, "context");
        g7.i.f15000a = photoApplication;
        g7.i.f15003d = false;
        ua.d c10 = g7.i.c(photoApplication);
        if (c10 != null) {
            g7.f fVar = new g7.f();
            synchronized (c10) {
                c10.f22495b.a(fVar);
            }
        }
        f14108j = true;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        x5.b.f24989a = context;
    }

    @Keep
    public int mzNightModeUseOf() {
        return 0;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z5.c.f26006b.execute(new androidx.activity.b(x5.b.a(), 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (oc.c.c().b().f18269b == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate() {
        te.a aVar;
        boolean z6;
        super.onCreate();
        x5.b.f24990b = this;
        j3.j.f16672k = this;
        Context applicationContext = getApplicationContext();
        og.a.o(applicationContext, "context.applicationContext");
        ve.b.f24149d = applicationContext;
        e8.c cVar = lg.c.f18097a;
        cVar.getClass();
        Application application = g7.i.f15000a;
        g7.e eVar = (g7.e) cVar.f13226c;
        og.a.p(eVar, "listener");
        ArrayList arrayList = g7.i.f15002c;
        if (!arrayList.contains(eVar)) {
            arrayList.add(eVar);
        }
        int i10 = yh.b.b().f25834k0;
        int i11 = 1;
        if (i10 == -1) {
            u.m(-1);
        } else if (i10 == 0) {
            u.m(1);
        } else if (i10 == 1) {
            u.m(2);
        }
        registerActivityLifecycleCallbacks(new b());
        synchronized (te.a.class) {
            if (te.a.f21941a == null) {
                te.a.f21941a = new te.a();
            }
            aVar = te.a.f21941a;
        }
        aVar.getClass();
        int i12 = 0;
        try {
            if (oc.c.c().b().f18268a != -1) {
            }
            z6 = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        tg.b.f22071g = te.b.a();
        if (z6) {
            zj.d.k(this);
        }
        sj.f.f21193f.f18883b = new nc.c(this, 23);
        new Thread(new n(this, i12)).start();
        new Handler().postDelayed(new n(this, i11), 2000L);
        w5.a.w().f24446b = new n0();
        if (Build.VERSION.SDK_INT < 24) {
            z5.c.b(this);
        }
        i0.f1713i.f1719f.a(new t() { // from class: filerecovery.photosrecovery.allrecovery.PhotoApplication.6
            @Override // androidx.lifecycle.t
            public final void b(v vVar, androidx.lifecycle.n nVar) {
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_START;
                PhotoApplication photoApplication = PhotoApplication.this;
                if (nVar == nVar2) {
                    boolean z10 = PhotoApplication.f14103e;
                    lh.q.b(w.n("JWFn", "9Lw60Tps"), w.n("N3UbbAhkUSAjcENsK2M0dDxvXyAsbhl0JnJ0", "Gpokpl2a"));
                    if (photoApplication.f14109d == androidx.lifecycle.n.ON_STOP) {
                        PhotoApplication.f14104f = true;
                        lh.q.b(w.n("JWFn", "SuMm1Teu"), w.n("N3UbbAhkUSAjcENsK2M0dDxvXyAqcxhlP3UBbhhvEG8jZRByJnUfZA==", "KsLV0LBG"));
                    }
                } else if (nVar == androidx.lifecycle.n.ON_STOP) {
                    boolean z11 = PhotoApplication.f14103e;
                    lh.q.b(w.n("JWFn", "BFHaf6CM"), w.n("N3UbbAhkUSAjcENsK2M0dDxvXyAsbhl0OHA=", "W5f0Uzk9"));
                }
                if (PhotoApplication.f14105g) {
                    photoApplication.f14109d = androidx.lifecycle.n.ON_DESTROY;
                } else {
                    photoApplication.f14109d = nVar;
                }
            }
        });
        nh.b.f18927b.f24985d = new m();
        z6 = false;
        tg.b.f22071g = te.b.a();
        if (z6) {
        }
        sj.f.f21193f.f18883b = new nc.c(this, 23);
        new Thread(new n(this, i12)).start();
        new Handler().postDelayed(new n(this, i11), 2000L);
        w5.a.w().f24446b = new n0();
        if (Build.VERSION.SDK_INT < 24) {
        }
        i0.f1713i.f1719f.a(new t() { // from class: filerecovery.photosrecovery.allrecovery.PhotoApplication.6
            @Override // androidx.lifecycle.t
            public final void b(v vVar, androidx.lifecycle.n nVar) {
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_START;
                PhotoApplication photoApplication = PhotoApplication.this;
                if (nVar == nVar2) {
                    boolean z10 = PhotoApplication.f14103e;
                    lh.q.b(w.n("JWFn", "9Lw60Tps"), w.n("N3UbbAhkUSAjcENsK2M0dDxvXyAsbhl0JnJ0", "Gpokpl2a"));
                    if (photoApplication.f14109d == androidx.lifecycle.n.ON_STOP) {
                        PhotoApplication.f14104f = true;
                        lh.q.b(w.n("JWFn", "SuMm1Teu"), w.n("N3UbbAhkUSAjcENsK2M0dDxvXyAqcxhlP3UBbhhvEG8jZRByJnUfZA==", "KsLV0LBG"));
                    }
                } else if (nVar == androidx.lifecycle.n.ON_STOP) {
                    boolean z11 = PhotoApplication.f14103e;
                    lh.q.b(w.n("JWFn", "BFHaf6CM"), w.n("N3UbbAhkUSAjcENsK2M0dDxvXyAsbhl0OHA=", "W5f0Uzk9"));
                }
                if (PhotoApplication.f14105g) {
                    photoApplication.f14109d = androidx.lifecycle.n.ON_DESTROY;
                } else {
                    photoApplication.f14109d = nVar;
                }
            }
        });
        nh.b.f18927b.f24985d = new m();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (i10 < 40 || !x5.b.f24991c) {
            return;
        }
        try {
            com.bumptech.glide.b.b(this).onTrimMemory(i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
