package filerecovery.photosrecovery.allrecovery.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import cj.w;
import com.atlaszz.core.activity.PolicyActivity;
import com.gyf.immersionbar.e;
import com.demo.example.R;
import k.j;
import og.a;
import sj.f;
import yh.b;
import z5.c;

/* loaded from: classes2.dex */
public final class PolicyOverloadActivity extends PolicyActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14196a = 0;

    @Override // j.p, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        a.p(context, w.n("P2UAQihzZQ==", "5lNYVbJc"));
        super.attachBaseContext(c.a(context));
        c.a(this);
    }

    @Override // j.p, androidx.fragment.app.w, androidx.activity.i, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        a.p(configuration, w.n("G2U1QyJuKGln", "d1WhTkhX"));
        super.onConfigurationChanged(configuration);
        int i10 = configuration.uiMode;
        if (i10 == 33 || i10 == 17) {
            recreate();
        }
    }

    @Override // com.atlaszz.core.activity.PolicyActivity, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra(w.n("NWEFaw==", "F8SB5bQn"), b.b().c(this));
        }
        super.onCreate(bundle);
        e r10 = e.r(this);
        if (new com.gyf.immersionbar.a(this).f11981b) {
            r10.e();
        }
        r10.c();
        r10.l(R.color.fb_white_black);
        r10.m(!f.f21193f.L(this));
        r10.f();
        findViewById(R.id.iv_back).setOnClickListener(new j(this, 7));
        try {
            ((TextView) findViewById(R.id.tv_title)).setText(getIntent().getStringExtra(w.n("AWk2bGU=", "xdinlndl")));
        } catch (Error e10) {
            e10.printStackTrace();
        }
    }

    @Override // j.p, androidx.activity.i, android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(R.layout.ad_policy_activity);
    }
}
