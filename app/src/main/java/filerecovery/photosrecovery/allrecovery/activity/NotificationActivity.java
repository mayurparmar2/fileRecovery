package filerecovery.photosrecovery.allrecovery.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cj.w;
import com.whatsapp.libmessagerecovery.j;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import filerecovery.photosrecovery.allrecovery.PhotoApplication;
import filerecovery.photosrecovery.allrecovery.SplashActivity;
import filerecovery.photosrecovery.allrecovery.activity.NotificationActivity;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import filerecovery.photosrecovery.allrecovery.b;
import g7.i;
import java.util.Set;
import java.util.Stack;
import og.a;

/* loaded from: classes2.dex */
public final class NotificationActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14194a = w.n("EHMdaWE=", "XOmG86DW");

    /* renamed from: b, reason: collision with root package name */
    public static final String f14195b = w.n("HG4xdCxsbA==", "bvN8hupM");

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {Exception -> 0x005c, blocks: (B:13:0x0028, B:15:0x002c, B:17:0x0032, B:19:0x003a, B:24:0x004a), top: B:12:0x0028 }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Stack stack;
        boolean z6;
        super.onCreate(bundle);
        final int i10 = 0;
        AppOpenManager.f14239d = false;
        final int i11 = 1;
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        Intent intent = getIntent();
        if (a.e(intent != null ? intent.getStringExtra(f14194a) : null, f14195b)) {
            try {
                stack = b.f14245b;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (stack != null && stack.size() != 0 && (b.f14245b.size() != 1 || !(b.f14245b.get(0) instanceof NotificationActivity))) {
                z6 = false;
                if (z6) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: kf.s

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ NotificationActivity f17466b;

                        {
                            this.f17466b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            NotificationActivity notificationActivity = this.f17466b;
                            switch (i12) {
                                case 0:
                                    String str = NotificationActivity.f14194a;
                                    og.a.p(notificationActivity, w.n("E2gYc3Mw", "vhgqWZhv"));
                                    notificationActivity.finish();
                                    AppOpenManager.f14239d = true;
                                    break;
                                default:
                                    String str2 = NotificationActivity.f14194a;
                                    og.a.p(notificationActivity, w.n("JWgec20w", "waE1xrHL"));
                                    SplashActivity.C = true;
                                    ((Set) lg.c.f18097a.f13227d).clear();
                                    if (PhotoApplication.f14105g || !x5.b.f24991c) {
                                        notificationActivity.startActivity(new Intent(notificationActivity, (Class<?>) SplashActivity.class));
                                    } else {
                                        notificationActivity.startActivity(new Intent(notificationActivity, (Class<?>) MainActivity.class));
                                    }
                                    notificationActivity.finish();
                                    AppOpenManager.f14239d = true;
                                    break;
                            }
                        }
                    }, 100L);
                    return;
                }
                i.d();
                j.f12371a.a();
            }
            z6 = true;
            if (z6) {
            }
            i.d();
            j.f12371a.a();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: kf.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationActivity f17466b;

            {
                this.f17466b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i10;
                NotificationActivity notificationActivity = this.f17466b;
                switch (i12) {
                    case 0:
                        String str = NotificationActivity.f14194a;
                        og.a.p(notificationActivity, w.n("E2gYc3Mw", "vhgqWZhv"));
                        notificationActivity.finish();
                        AppOpenManager.f14239d = true;
                        break;
                    default:
                        String str2 = NotificationActivity.f14194a;
                        og.a.p(notificationActivity, w.n("JWgec20w", "waE1xrHL"));
                        SplashActivity.C = true;
                        ((Set) lg.c.f18097a.f13227d).clear();
                        if (PhotoApplication.f14105g || !x5.b.f24991c) {
                            notificationActivity.startActivity(new Intent(notificationActivity, (Class<?>) SplashActivity.class));
                        } else {
                            notificationActivity.startActivity(new Intent(notificationActivity, (Class<?>) MainActivity.class));
                        }
                        notificationActivity.finish();
                        AppOpenManager.f14239d = true;
                        break;
                }
            }
        }, 100L);
    }
}
