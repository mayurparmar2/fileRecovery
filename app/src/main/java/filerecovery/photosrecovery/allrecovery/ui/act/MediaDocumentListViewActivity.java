package filerecovery.photosrecovery.allrecovery.ui.act;

import android.os.Bundle;
import bh.c;
import bh.q;
import dg.d;
import com.demo.example.R;
import java.util.ArrayList;
import wf.b;
import wf.i;
import yg.o;
import z5.f;

/* loaded from: classes2.dex */
public class MediaDocumentListViewActivity extends o {
    public int K0 = 1;

    @Override // yg.o
    public final void A0(ArrayList arrayList) {
    }

    @Override // yg.o
    public final void B0(Bundle bundle) {
    }

    @Override // yg.o
    public final void E0() {
        this.f25762k.o(15, this.K0, new b(this, 27), false);
    }

    @Override // yg.o, uf.i
    public final void Z() {
        super.Z();
        d.p(this, this.f25775v, 1);
        this.f25769r.setText(R.string.arg);
    }

    @Override // yg.o
    public final c p0() {
        return new q(this, this);
    }

    @Override // yg.o
    public final boolean r0(i iVar) {
        long a10;
        int i10 = this.K0;
        if (i10 != 1) {
            long j4 = 0;
            if (i10 == 5) {
                a10 = (long) (f.a() * 500);
            } else if (i10 == 6) {
                j4 = (long) (f.a() * 500);
                a10 = f.h(1);
            } else if (i10 != 7) {
                a10 = 0;
            } else {
                j4 = f.h(1);
                a10 = Long.MAX_VALUE;
            }
            long j10 = iVar.f24709d;
            if (j10 <= j4 || j10 > a10) {
                return true;
            }
        }
        return false;
    }

    @Override // yg.o
    public final String u0() {
        return getString(R.string.arg);
    }
}
