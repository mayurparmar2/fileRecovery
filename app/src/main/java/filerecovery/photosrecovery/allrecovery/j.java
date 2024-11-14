package filerecovery.photosrecovery.allrecovery;

import android.content.Intent;
import cj.w;
import filerecovery.photosrecovery.allrecovery.ui.act.PhoneCleanerActivity;
import lg.h0;
import lg.s;
import lg.t;

/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14338b;

    public /* synthetic */ j(MainActivity mainActivity, int i10) {
        this.f14337a = i10;
        this.f14338b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14337a;
        final int i11 = 0;
        MainActivity mainActivity = this.f14338b;
        switch (i10) {
            case 0:
                g7.d dVar = mainActivity.I;
                if (dVar == null || !dVar.f14994b) {
                    if (!mainActivity.O) {
                        c2.b.g().b(tg.b.f22069e);
                        mainActivity.A.post(new i(this, og.a.J(), dg.f.i(mainActivity), i11));
                        break;
                    } else {
                        mainActivity.O = false;
                        break;
                    }
                }
                break;
            case 1:
                if (!j3.j.A(mainActivity)) {
                    boolean z6 = MainActivity.S;
                    if (!mainActivity.f22862f) {
                        h0.f18115a.g();
                        if (mainActivity.f14096z) {
                            t tVar = s.f18136a;
                            if (tVar.f18098a != 11) {
                                tVar.d();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                final int i12 = 1;
                if (yj.a.f25869d.g() > -1 || yh.b.b().f25826g0) {
                    mainActivity.A.post(new Runnable(this) { // from class: filerecovery.photosrecovery.allrecovery.l

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ j f14341b;

                        {
                            this.f14341b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i11;
                            j jVar = this.f14341b;
                            switch (i13) {
                                case 0:
                                    MainActivity mainActivity2 = jVar.f14338b;
                                    if (!j3.j.A(mainActivity2)) {
                                        mainActivity2.startActivityForResult(new Intent(mainActivity2, (Class<?>) PhoneCleanerActivity.class), 9010);
                                        break;
                                    }
                                    break;
                                default:
                                    MainActivity mainActivity3 = jVar.f14338b;
                                    if (!j3.j.A(mainActivity3)) {
                                        ah.a.z0(mainActivity3, 5, false);
                                        int i14 = dg.c.f12730j;
                                        dg.d.x(mainActivity3, w.n("E2UMcBxIK209XwVsPGNr", "yqWiCD2Q"), 5);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    mainActivity.A.post(new Runnable(this) { // from class: filerecovery.photosrecovery.allrecovery.l

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ j f14341b;

                        {
                            this.f14341b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            j jVar = this.f14341b;
                            switch (i13) {
                                case 0:
                                    MainActivity mainActivity2 = jVar.f14338b;
                                    if (!j3.j.A(mainActivity2)) {
                                        mainActivity2.startActivityForResult(new Intent(mainActivity2, (Class<?>) PhoneCleanerActivity.class), 9010);
                                        break;
                                    }
                                    break;
                                default:
                                    MainActivity mainActivity3 = jVar.f14338b;
                                    if (!j3.j.A(mainActivity3)) {
                                        ah.a.z0(mainActivity3, 5, false);
                                        int i14 = dg.c.f12730j;
                                        dg.d.x(mainActivity3, w.n("E2UMcBxIK209XwVsPGNr", "yqWiCD2Q"), 5);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (!yh.b.b().f25826g0) {
                    yh.b.b().f25826g0 = true;
                    yh.b.b().d();
                    break;
                }
                break;
        }
    }
}
