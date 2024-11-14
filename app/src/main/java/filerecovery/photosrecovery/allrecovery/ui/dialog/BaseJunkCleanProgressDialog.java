package filerecovery.photosrecovery.allrecovery.ui.dialog;

import android.content.Context;
import android.text.SpannableString;
import android.widget.TextView;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog;
import filerecovery.photosrecovery.allrecovery.view.CustomProgressBar;
import j.p;
import u1.a;
import yh.b;

/* loaded from: classes2.dex */
public abstract class BaseJunkCleanProgressDialog extends BaseProgressDialog {
    public CustomProgressBar J;
    public TextView K;
    public final long L;
    public final int M;
    public final int N;
    public final int O;
    public long P;
    public final a Q;

    public BaseJunkCleanProgressDialog(p pVar, int i10, long j4, int i11, int i12) {
        super(pVar);
        this.Q = new a(this, 18);
        this.M = i10;
        this.L = j4;
        this.N = i11;
        this.O = i12;
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d, j.l0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a aVar = this.Q;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // x5.d
    public final int n() {
        return R.layout.dialog_junk_clean_progress;
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog, x5.d
    public void p() {
        super.p();
        TextView textView = (TextView) findViewById(R.id.dialog_junk_tv_hint);
        Context context = getContext();
        SpannableString E = og.a.E(context, context.getString(R.string.arg));
        if (textView != null) {
            textView.setText(E);
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public void u() {
        this.J = (CustomProgressBar) findViewById(R.id.dialog_junk_custom_progress);
        this.K = (TextView) findViewById(R.id.dialog_junk_tv_clean_size);
        this.K.setText(og.a.G(0L));
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void w() {
        super.w();
        try {
            if (!b.b().f25828h0) {
                b.b().f25828h0 = true;
                b.b().d();
            }
            m7.a.e(getContext()).g();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void y(int i10) {
        this.J.setProgress(i10);
    }

    @Override // filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog
    public final void z(int i10, int i11, SpannableString spannableString) {
    }
}
