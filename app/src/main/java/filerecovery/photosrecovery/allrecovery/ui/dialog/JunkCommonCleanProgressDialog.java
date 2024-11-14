package filerecovery.photosrecovery.allrecovery.ui.dialog;

import j.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lg.u;
import uf.i;
import zf.a;

/* loaded from: classes2.dex */
public class JunkCommonCleanProgressDialog extends BaseJunkCleanProgressDialog {
    public final ExecutorService R;
    public final p S;
    public final List T;
    public final a U;

    public JunkCommonCleanProgressDialog(i iVar, long j4, ArrayList arrayList, int i10, int i11, a aVar) {
        super(iVar, arrayList.size(), j4, i10, i11);
        this.S = iVar;
        this.T = arrayList;
        this.U = aVar;
        this.R = Executors.newSingleThreadExecutor();
    }

    @Override // filerecovery.photosrecovery.allrecovery.ui.dialog.BaseJunkCleanProgressDialog, filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d, j.l0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ExecutorService executorService = this.R;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // x5.d
    public final void o() {
    }

    @Override // filerecovery.photosrecovery.allrecovery.ui.dialog.BaseJunkCleanProgressDialog, filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d
    public final void p() {
        super.p();
        this.R.execute(new d.a(this.T.size(), 7, this));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        a aVar = this.U;
        if (aVar != null) {
            try {
                aVar.l(this.M, this.L);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            u.f18144a.a(this.O, this.N);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
