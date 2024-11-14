package filerecovery.photosrecovery.allrecovery;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import java.util.Stack;

/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static Stack f14245b;

    /* renamed from: c, reason: collision with root package name */
    public static int f14246c;

    /* renamed from: a, reason: collision with root package name */
    public int f14247a = 0;

    public static Activity a() {
        Stack stack = f14245b;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return (Activity) f14245b.peek();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (f14245b == null) {
            f14245b = new Stack();
        }
        f14245b.push(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Stack stack = f14245b;
        if (stack == null || stack.isEmpty()) {
            return;
        }
        f14245b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f14246c--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f14246c++;
        z5.c.f26006b.execute(new androidx.activity.b(activity.getApplicationContext(), 13));
        if (PhotoApplication.f14104f) {
            lh.n.f18200a = 0L;
            PhotoApplication.f14104f = false;
        }
        if ((activity instanceof SplashActivity) || (activity instanceof AdActivity)) {
            return;
        }
        int i10 = PhotoApplication.f14106h;
        if (i10 == 1) {
            og.a.C0(activity);
            PhotoApplication.f14106h = 0;
        } else {
            if (i10 != 2) {
                return;
            }
            og.a.E0(x5.b.a());
            PhotoApplication.f14106h = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f14247a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f14247a - 1;
        this.f14247a = i10;
        if (i10 == 0) {
            sj.f.P();
        }
    }
}
