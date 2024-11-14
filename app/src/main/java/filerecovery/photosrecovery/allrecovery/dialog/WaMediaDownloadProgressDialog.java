package filerecovery.photosrecovery.allrecovery.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.widget.TextView;
import cj.w;
import dg.d;
import dg.j;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.view.CustomProgressBar;
import gh.x;
import j.p;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import og.a;
import xf.f;
import y9.m;

/* loaded from: classes2.dex */
public class WaMediaDownloadProgressDialog extends BaseProgressDialog {
    public static final /* synthetic */ int U = 0;
    public TextView J;
    public int K;
    public final ArrayList L;
    public CustomProgressBar M;
    public final ExecutorService N;
    public final Handler O;
    public final boolean P;
    public final x Q;
    public TextView R;
    public TextView S;
    public int T;

    public WaMediaDownloadProgressDialog(p pVar, boolean z6, ArrayList arrayList, x xVar) {
        super(pVar);
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.N = Executors.newSingleThreadExecutor();
        this.O = new Handler(Looper.getMainLooper());
        this.P = z6;
        this.Q = xVar;
        arrayList2.addAll(arrayList);
    }

    public final void B() {
        if (this.P) {
            Context context = getContext();
            int i10 = j.f12745j;
            String n10 = w.n("OGUxcyxnK18EZQ9pE0RRdCRpWnM2Uxh2Kl8LYSRsM2Q=", "RigyOmMV");
            d.A(context, n10, n10);
            return;
        }
        Context context2 = getContext();
        int i11 = j.f12745j;
        String n11 = w.n("OGUxcyxnK18EZQ9pE19nYTNlaWYIaRVlZA==", "6yTVPId3");
        d.A(context2, n11, n11);
    }

    @Override // x5.d
    public final int n() {
        return R.layout.dialog_recovery_progress;
    }

    @Override // x5.d
    public final void o() {
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d
    public final void p() {
        super.p();
        this.N.execute(new m(this, 17));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        this.O.post(new f(this, 5));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void u() {
        this.J = (TextView) findViewById(R.id.dialog_recovery_tv_progress_current);
        this.M = (CustomProgressBar) findViewById(R.id.dialog_recovery_progress_view);
        this.R = (TextView) findViewById(R.id.dialog_recovery_progress_tv_checking);
        this.S = (TextView) findViewById(R.id.tv_wait_tip);
        this.R.setText(getContext().getString(R.string.arg));
        Context context = getContext();
        this.S.setText(a.E(context, context.getString(R.string.arg)));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void y(int i10) {
        CustomProgressBar customProgressBar = this.M;
        if (customProgressBar != null) {
            customProgressBar.setProgress(i10);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void z(int i10, int i11, SpannableString spannableString) {
        if (spannableString != null) {
            this.J.setText(spannableString);
        } else {
            this.J.setText(a.L(i10, i11));
        }
    }
}
