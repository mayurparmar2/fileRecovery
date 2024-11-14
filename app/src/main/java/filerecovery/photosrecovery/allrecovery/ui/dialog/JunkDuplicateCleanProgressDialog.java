package filerecovery.photosrecovery.allrecovery.ui.dialog;

import a5.g;
import ah.b;
import filerecovery.photosrecovery.allrecovery.activity.CleanSimilarMediaActivity;
import j.p;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lg.u;
import zf.a;

/* loaded from: classes2.dex */
public class JunkDuplicateCleanProgressDialog extends BaseJunkCleanProgressDialog {
    public final p R;
    public final ArrayList S;
    public final a T;
    public final ExecutorService U;

    public JunkDuplicateCleanProgressDialog(CleanSimilarMediaActivity cleanSimilarMediaActivity, long j4, ArrayList arrayList, g gVar) {
        super(cleanSimilarMediaActivity, arrayList.size(), j4, 4, 10);
        this.R = cleanSimilarMediaActivity;
        this.S = arrayList;
        this.T = gVar;
        this.U = Executors.newSingleThreadExecutor();
    }

    @Override // filerecovery.photosrecovery.allrecovery.ui.dialog.BaseJunkCleanProgressDialog, filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d, j.l0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ExecutorService executorService = this.U;
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
        this.U.execute(new b(this, 4));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        a aVar = this.T;
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
