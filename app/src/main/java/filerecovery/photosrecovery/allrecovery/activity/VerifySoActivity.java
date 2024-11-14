package filerecovery.photosrecovery.allrecovery.activity;

import android.os.Bundle;
import filerecovery.photosrecovery.allrecovery.PhotoApplication;
import j.p;
import p9.a;

/* loaded from: classes2.dex */
public final class VerifySoActivity extends p {
    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        PhotoApplication.f14107i = false;
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.G(this);
    }
}
