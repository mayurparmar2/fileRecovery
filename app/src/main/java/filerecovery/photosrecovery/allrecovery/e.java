package filerecovery.photosrecovery.allrecovery;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import filerecovery.photosrecovery.allrecovery.view.CleanerItemView;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14325b;

    public /* synthetic */ e(MainActivity mainActivity, int i10) {
        this.f14324a = i10;
        this.f14325b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14324a;
        final MainActivity mainActivity = this.f14325b;
        switch (i10) {
            case 0:
                boolean z6 = MainActivity.S;
                mainActivity.getClass();
                int i11 = 1;
                if (!(Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : ve.a.f(mainActivity))) {
                    PhotoApplication.f14103e = false;
                    if (!j3.j.A(mainActivity)) {
                        mainActivity.runOnUiThread(new e(mainActivity, i11));
                        break;
                    }
                } else {
                    PhotoApplication.f14103e = true;
                    yj.a aVar = yj.a.f25869d;
                    ((ve.b) aVar.f15338a).getClass();
                    if (ve.b.f24149d == null) {
                        Context applicationContext = mainActivity.getApplicationContext();
                        og.a.o(applicationContext, "context.applicationContext");
                        ve.b.f24149d = applicationContext;
                    }
                    final long g10 = aVar.g();
                    final long i12 = aVar.i();
                    mainActivity.f14096z = g10 == -1;
                    if (!j3.j.A(mainActivity)) {
                        mainActivity.runOnUiThread(new Runnable() { // from class: filerecovery.photosrecovery.allrecovery.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                MainActivity mainActivity2 = MainActivity.this;
                                CleanerItemView cleanerItemView = mainActivity2.F;
                                int i13 = 1;
                                long j4 = i12;
                                cleanerItemView.setShowProgress(j4 == -1);
                                if (j4 > -1) {
                                    mainActivity2.F.setSizeStr(og.a.G(j4));
                                }
                                mainActivity2.A.postDelayed(new j(mainActivity2, i13), 200L);
                                if (mainActivity2.f14096z) {
                                    mainActivity2.f14094x.setVisibility(View.GONE);
                                    mainActivity2.f14093w.setVisibility(View.VISIBLE);
                                } else {
                                    mainActivity2.f14093w.setVisibility(View.GONE);
                                    mainActivity2.f14094x.setVisibility(View.VISIBLE);
                                    mainActivity2.f14094x.setText(og.a.G(g10));
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            default:
                mainActivity.f14093w.setVisibility(View.GONE);
                mainActivity.f14094x.setVisibility(View.INVISIBLE);
                mainActivity.F.setRightViewVisible(8);
                break;
        }
    }
}
