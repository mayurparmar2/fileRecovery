package filerecovery.photosrecovery.allrecovery;

import android.content.Context;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import l0.y;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhotoApplication f14343b;

    public /* synthetic */ n(PhotoApplication photoApplication, int i10) {
        this.f14342a = i10;
        this.f14343b = photoApplication;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14342a) {
            case 0:
                lh.c.a().f18159b = false;
                lh.c a10 = lh.c.a();
                Context a11 = x5.b.a();
                a10.getClass();
                a10.f18163f = new y(a11).a();
                Thread.setDefaultUncaughtExceptionHandler(new eg.a(x5.b.a()));
                c.c.a().f2817e = new wf.b(this, 21);
                break;
            default:
                new AppOpenManager(this.f14343b);
                break;
        }
    }
}
