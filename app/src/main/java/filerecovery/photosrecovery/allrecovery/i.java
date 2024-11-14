package filerecovery.photosrecovery.allrecovery;

import cj.w;
import filerecovery.photosrecovery.allrecovery.debugmodule.TestDeepCleanActivity;
import yf.r;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f14336d;

    public /* synthetic */ i(Runnable runnable, float f10, int i10, int i11) {
        this.f14333a = i11;
        this.f14336d = runnable;
        this.f14334b = f10;
        this.f14335c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14333a;
        int i11 = this.f14335c;
        float f10 = this.f14334b;
        Runnable runnable = this.f14336d;
        switch (i10) {
            case 0:
                j jVar = (j) runnable;
                if (!j3.j.A(jVar.f14338b)) {
                    og.h hVar = sj.f.f21191d;
                    lh.q.b(w.n("GGUvbz95EXQoZw==", "pU4kiOeB"), w.n("N2VZbwN5FHQ5Z1wgJ2VeYVtuL24KU1x6AyBCIA==", "DEZ4qKNF") + f10 + w.n("VXIncThpPGUtUwJ6FyAOIA==", "icJfvbBe") + i11);
                    hVar.f19347b = f10;
                    hVar.f19348c = i11;
                    if (ua.b.c(hVar.f19346a)) {
                        r rVar = hVar.f19346a;
                        rVar.f25665r = f10;
                        rVar.f25666s = i11;
                        rVar.q();
                        if (f10 >= i11) {
                            ua.b.m(hVar.f19346a);
                        }
                    }
                    c2.b.g().b(hVar);
                    c2.b.g().k(jVar.f14338b);
                    break;
                }
                break;
            default:
                xf.g gVar = (xf.g) runnable;
                boolean c10 = ua.b.c(gVar.f25173b.f25176b.f14288k);
                xf.i iVar = gVar.f25173b;
                if (!c10) {
                    iVar.f25176b.f14288k = new r(f10, i11, iVar.f25176b);
                    TestDeepCleanActivity testDeepCleanActivity = iVar.f25176b;
                    ua.b.n(testDeepCleanActivity, testDeepCleanActivity.f14288k);
                    break;
                } else {
                    r rVar2 = iVar.f25176b.f14288k;
                    rVar2.f25665r = f10;
                    rVar2.f25666s = i11;
                    rVar2.q();
                    break;
                }
        }
    }
}
