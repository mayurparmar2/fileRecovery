package filerecovery.photosrecovery.allrecovery.ui.act;

import com.demo.example.R;
import uf.a;
import uf.i;
import xf.l;

/* loaded from: classes2.dex */
public class WaMediaGuideDialogActivity extends i {
    @Override // uf.i
    public final void V() {
        l lVar = new l(this, 3);
        lVar.show();
        lVar.setOnDismissListener(new a(this, 2));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.layout_transparent;
    }

    @Override // uf.i
    public final void Z() {
    }
}
