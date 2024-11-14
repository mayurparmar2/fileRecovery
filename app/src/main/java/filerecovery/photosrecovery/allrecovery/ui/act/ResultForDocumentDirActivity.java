package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import bh.s;
import com.demo.example.R;
import hh.c;
import java.util.ArrayList;
import yg.d;

/* loaded from: classes2.dex */
public class ResultForDocumentDirActivity extends d {
    @Override // yg.d
    public final bh.d g0() {
        return new s(1, this, this);
    }

    @Override // yg.d
    public final Intent h0() {
        return new Intent(this, (Class<?>) MediaDocumentListViewActivity.class);
    }

    @Override // yg.d
    public final ArrayList i0() {
        return c.f15636i;
    }

    @Override // yg.d
    public final String j0() {
        return getString(R.string.arg);
    }
}
