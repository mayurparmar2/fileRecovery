package filerecovery.photosrecovery.allrecovery.dialog;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableString;
import android.widget.TextView;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.view.CustomProgressBar;
import j.p;
import java.util.ArrayList;
import java.util.List;
import og.a;
import yf.k;
import zf.e;

/* loaded from: classes2.dex */
public class DirMediaRecoveryProgressDialog extends BaseProgressDialog {
    public static final /* synthetic */ int S = 0;
    public final p J;
    public final List K;
    public final e L;
    public final int M;
    public TextView N;
    public final int O;
    public CustomProgressBar P;
    public final Handler Q;
    public int R;

    public DirMediaRecoveryProgressDialog(p pVar, ArrayList arrayList, e eVar, int i10) {
        super(pVar);
        this.Q = new Handler();
        this.J = pVar;
        this.K = arrayList;
        this.L = eVar;
        this.M = i10;
        this.O = arrayList.size();
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
        new Thread(new k(this, 0)).start();
        TextView textView = (TextView) findViewById(R.id.tv_wait_tip);
        Context context = getContext();
        textView.setText(a.E(context, context.getString(R.string.arg)));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        e eVar = this.L;
        if (eVar != null) {
            eVar.h(this.O, this.R);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void u() {
        this.N = (TextView) findViewById(R.id.dialog_recovery_tv_progress_current);
        this.P = (CustomProgressBar) findViewById(R.id.dialog_recovery_progress_view);
        this.N.setText(a.L(0, this.O));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void y(int i10) {
        CustomProgressBar customProgressBar = this.P;
        if (customProgressBar != null) {
            customProgressBar.setProgress(i10);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void z(int i10, int i11, SpannableString spannableString) {
        if (spannableString != null) {
            this.N.setText(spannableString);
        } else {
            this.N.setText(a.L(i10, i11));
        }
    }
}
