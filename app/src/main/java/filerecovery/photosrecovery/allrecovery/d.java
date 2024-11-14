package filerecovery.photosrecovery.allrecovery;

import android.util.Pair;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14252b;

    public /* synthetic */ d(MainActivity mainActivity, int i10) {
        this.f14251a = i10;
        this.f14252b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f14251a;
        MainActivity mainActivity = this.f14252b;
        switch (i10) {
            case 0:
                boolean z6 = MainActivity.S;
                mainActivity.getClass();
                Pair d10 = dg.f.d();
                nh.b.i(mainActivity, (String) d10.first, (String) d10.second);
                break;
            default:
                boolean z10 = MainActivity.S;
                mainActivity.p0();
                break;
        }
    }
}
