package filerecovery.photosrecovery.allrecovery.ui.dialog;

import android.content.Context;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import b8.c;
import c2.v;
import eh.h;
import j.p;
import java.util.ArrayList;
import vj.a;
import vj.d;
import yg.u;
import zf.b;

/* loaded from: classes2.dex */
public class JunkDeepCleanProgressDialog extends BaseJunkCleanProgressDialog {
    public final h R;
    public final d S;
    public final b T;
    public int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JunkDeepCleanProgressDialog(p pVar, d dVar, long j4, v vVar) {
        super(pVar, a.a(), j4, 5, 10);
        a aVar = a.f24215a;
        this.U = 0;
        this.S = dVar;
        this.T = vVar;
        h hVar = new h();
        this.R = hVar;
        n nVar = n.ON_CREATE;
        x xVar = hVar.f13395a;
        xVar.e(nVar);
        xVar.e(n.ON_START);
    }

    @Override // filerecovery.photosrecovery.allrecovery.ui.dialog.BaseJunkCleanProgressDialog, filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d, j.l0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        h hVar = this.R;
        if (hVar != null) {
            n nVar = n.ON_STOP;
            x xVar = hVar.f13395a;
            xVar.e(nVar);
            xVar.e(n.ON_DESTROY);
        }
    }

    @Override // x5.d
    public final void o() {
    }

    @Override // filerecovery.photosrecovery.allrecovery.ui.dialog.BaseJunkCleanProgressDialog, filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d
    public final void p() {
        super.p();
        this.U = 0;
        d dVar = this.S;
        if (dVar == null) {
            return;
        }
        dVar.f24233e.d(this.R, new u(this));
        this.S.f24236h.d(this.R, new c(this));
        this.S.f24235g.d(this.R, new wf.b(this, 28));
        ArrayList arrayList = new ArrayList(a.f24216b);
        d dVar2 = this.S;
        Context context = getContext();
        dVar2.getClass();
        og.a.p(context, "context");
        if (dVar2.f24237i) {
            return;
        }
        dVar2.f24237i = true;
        nh.b.G(com.bumptech.glide.c.r(dVar2), null, new vj.c(dVar2, arrayList, null), 3);
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void t() {
        b bVar = this.T;
        if (bVar != null) {
            bVar.l(this.M, this.L);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.ui.dialog.BaseJunkCleanProgressDialog, filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void u() {
        super.u();
    }
}
