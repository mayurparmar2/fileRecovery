package filerecovery.photosrecovery.allrecovery.ui.dialog;

import ah.b;
import android.text.SpannableString;
import android.widget.TextView;
import cj.w;
import eh.f;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog;
import filerecovery.photosrecovery.allrecovery.ui.act.BackupListDetailActivity;
import filerecovery.photosrecovery.allrecovery.view.CustomProgressBar;
import j.p;
import j3.j;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import og.a;

/* loaded from: classes2.dex */
public class ContactBackupRecoverDialog extends BaseProgressDialog {
    public final int J;
    public final ArrayList K;
    public final ExecutorService L;
    public TextView M;
    public CustomProgressBar N;
    public final f O;
    public TextView P;
    public int Q;

    public ContactBackupRecoverDialog(BackupListDetailActivity backupListDetailActivity, ArrayList arrayList, BackupListDetailActivity backupListDetailActivity2) {
        super(backupListDetailActivity);
        ArrayList arrayList2 = new ArrayList();
        this.K = arrayList2;
        this.L = Executors.newSingleThreadExecutor();
        this.O = backupListDetailActivity2;
        arrayList2.addAll(arrayList);
        this.J = arrayList2.size();
    }

    @Override // x5.d
    public final int n() {
        return R.layout.dialog_recovery_progress;
    }

    @Override // x5.d
    public final void o() {
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        p pVar = this.f14295r;
        if (j.A(pVar)) {
            return;
        }
        pVar.runOnUiThread(new xf.f(this, 19));
        f fVar = this.O;
        if (fVar != null) {
            try {
                ((BackupListDetailActivity) fVar).i0(this.J, this.Q);
            } catch (Exception unused) {
            }
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void u() {
        this.M = (TextView) findViewById(R.id.dialog_recovery_tv_progress_current);
        this.N = (CustomProgressBar) findViewById(R.id.dialog_recovery_progress_view);
        this.M.setText(a.L(0, this.J));
        this.P = (TextView) findViewById(R.id.tv_wait_tip);
        this.L.execute(new b(this, 2));
        this.P.setText(a.E(getContext(), w.n("GHRXbSh5UXQja1YgIyAzZSIgQmUgbyRkEiAQb3RyEGM-dhJyaXQZZWJjXG42YTZ0fXMYLmNQJmUAcwEgI2EcdC4=", "adTu0hD6")));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void y(int i10) {
        CustomProgressBar customProgressBar = this.N;
        if (customProgressBar != null) {
            customProgressBar.setProgress(i10);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void z(int i10, int i11, SpannableString spannableString) {
        if (spannableString != null) {
            this.M.setText(spannableString);
        } else {
            this.M.setText(a.L(i10, i11));
        }
    }
}
