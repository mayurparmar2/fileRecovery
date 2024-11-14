package filerecovery.photosrecovery.allrecovery.ad.openad;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import cj.w;
import com.bumptech.glide.d;
import ff.a;
import filerecovery.photosrecovery.allrecovery.MainActivity;
import filerecovery.photosrecovery.allrecovery.PhotoApplication;
import lh.q;
import rf.g;
import sf.b;
import sf.e;

/* loaded from: classes2.dex */
public class AppOpenManager implements u, Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f14239d = true;

    /* renamed from: e, reason: collision with root package name */
    public static long f14240e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f14241f;

    /* renamed from: a, reason: collision with root package name */
    public Activity f14242a;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f14244c = new Handler();

    /* renamed from: b, reason: collision with root package name */
    public final String f14243b = b.m().e();

    public AppOpenManager(PhotoApplication photoApplication) {
        photoApplication.registerActivityLifecycleCallbacks(this);
        i0.f1713i.f1719f.a(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f14242a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f14242a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f14242a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @f0(n.ON_START)
    public void onStart() {
        ff.b bVar = a.f14050a;
        bVar.e();
        if (bVar.j()) {
            e.r().o(x5.b.a());
            return;
        }
        boolean z6 = false;
        f14241f = false;
        String str = w.n("GXAcIA1uGXQ5chIg", "RCxlbJk9") + this.f14242a;
        String str2 = this.f14243b;
        q.b(str2, str);
        if (d.q(x5.b.f24990b)) {
            q.b(str2, w.n("bz5JPi1vH3QRaFx3A2Q=", "F915YVjI"));
            return;
        }
        if (!f14239d) {
            q.b(str2, w.n("eD5UPiJwDm54YQIgM29BYltkImVu", "XfFjMkPH"));
            f14239d = true;
            return;
        }
        if (g.c().f20639c.f20634i) {
            nh.a.j(str2, w.n("emYjbCVBLCAxc0ZTPW9EZVYsZmQCbhJ0RnMQb0Eu", "1wZVIHWT"));
            return;
        }
        Activity activity = this.f14242a;
        if (activity != null && (activity instanceof MainActivity)) {
            g7.d dVar = ((MainActivity) activity).I;
            if (dVar != null && dVar.f14995c == 1 && dVar.f14994b) {
                z6 = true;
            }
            if (z6) {
                nh.a.j(str2, w.n("WmlLVUdnKmE8ZTZhMmVgaF13L24KIBkgAm8WJ0IgOWgVdy4=", "Dwz87XTg"));
                return;
            } else if (og.a.d0(activity)) {
                return;
            }
        }
        this.f14244c.postDelayed(new androidx.activity.b(this, 28), 20L);
    }
}
