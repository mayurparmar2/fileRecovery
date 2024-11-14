package filerecovery.photosrecovery.allrecovery.dialog;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.widget.TextView;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.view.CustomProgressBar;
import j.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import og.a;
import xf.f;
import y9.m;
import yf.f0;

/* loaded from: classes2.dex */
public class WaMediaDeleteProgressDialog extends BaseProgressDialog {
    public static final /* synthetic */ int Q = 0;
    public TextView J;
    public int K;
    public final ArrayList L;
    public CustomProgressBar M;
    public final ExecutorService N;
    public final Handler O;
    public final f0 P;

    public WaMediaDeleteProgressDialog(p pVar, List list, f0 f0Var) {
        super(pVar);
        ArrayList arrayList = new ArrayList();
        this.L = arrayList;
        this.N = Executors.newSingleThreadExecutor();
        this.O = new Handler(Looper.getMainLooper());
        this.P = f0Var;
        arrayList.addAll(list);
    }

    @Override // x5.d
    public final int n() {
        return R.layout.dialog_media_delete_progress;
    }

    @Override // x5.d
    public final void o() {
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d
    public final void p() {
        super.p();
        this.N.execute(new m(this, 15));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        this.O.post(new f(this, 3));
        f0 f0Var = this.P;
        if (f0Var != null) {
            f0Var.e();
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void u() {
        this.J = (TextView) findViewById(R.id.dia_media_delete_progress_current);
        this.M = (CustomProgressBar) findViewById(R.id.dia_media_delete_progress_view);
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
