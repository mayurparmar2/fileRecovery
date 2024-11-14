package filerecovery.photosrecovery.allrecovery.ui.act;

import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.demo.example.R;
import wf.i;
import yg.j;
import z5.f;

/* loaded from: classes2.dex */
public class BigVideosResultActivity extends j {
    @Override // yg.j, uf.i
    public final void V() {
        super.V();
        ((TextView) findViewById(R.id.tv_empty_des)).setText(R.string.arg);
    }

    @Override // yg.j
    public final boolean h0(i iVar) {
        long h10;
        long h11;
        int i10 = this.f25729l;
        if (i10 != 1) {
            if (i10 == 2) {
                h10 = f.h(50);
                h11 = f.h(100);
            } else if (i10 == 3) {
                h10 = f.h(100);
                h11 = f.h(TTAdConstant.MATE_VALID);
            } else if (i10 != 4) {
                h10 = 0;
                h11 = 0;
            } else {
                h10 = f.h(TTAdConstant.MATE_VALID);
                h11 = Long.MAX_VALUE;
            }
            long j4 = iVar.f24709d;
            if (j4 <= h10 || j4 > h11) {
                return true;
            }
        }
        return false;
    }

    @Override // yg.j
    public final int i0() {
        return 14;
    }

    @Override // yg.j
    public final int j0() {
        return 6;
    }
}
