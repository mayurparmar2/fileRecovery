package filerecovery.photosrecovery.allrecovery.ui.dialog;

import ah.b;
import android.text.SpannableString;
import android.widget.TextView;
import eh.g;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog;
import filerecovery.photosrecovery.allrecovery.ui.act.ContactDeletedActivity;
import filerecovery.photosrecovery.allrecovery.view.CustomProgressBar;
import j.p;
import j3.j;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import og.a;
import xf.f;

/* loaded from: classes2.dex */
public class ContactDeletedRecoverDialog extends BaseProgressDialog {
    public final int J;
    public final ArrayList K;
    public final ExecutorService L;
    public TextView M;
    public CustomProgressBar N;
    public final g O;
    public TextView P;
    public int Q;

    public ContactDeletedRecoverDialog(ContactDeletedActivity contactDeletedActivity, ArrayList arrayList, ContactDeletedActivity contactDeletedActivity2) {
        super(contactDeletedActivity);
        ArrayList arrayList2 = new ArrayList();
        this.K = arrayList2;
        this.L = Executors.newSingleThreadExecutor();
        this.O = contactDeletedActivity2;
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
        pVar.runOnUiThread(new f(this, 20));
        g gVar = this.O;
        if (gVar != null) {
            try {
                ((ContactDeletedActivity) gVar).k0(this.J, this.Q);
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
        this.L.execute(new b(this, 3));
        this.P.setText(a.E(getContext(), getContext().getString(R.string.arg)));
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
