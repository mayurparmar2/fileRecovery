package filerecovery.photosrecovery.allrecovery;

import android.view.View;

/* loaded from: classes2.dex */
public final class k implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14339a;

    public k(MainActivity mainActivity) {
        this.f14339a = mainActivity;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MainActivity mainActivity = this.f14339a;
        if (mainActivity.P > 99) {
            mainActivity.P = (int) (((Math.random() * 9.0d) + 1.0d) * 10.0d);
        } else {
            mainActivity.P = 100;
        }
        mainActivity.runOnUiThread(new o0.m(mainActivity.P, 2, mainActivity));
        return true;
    }
}
