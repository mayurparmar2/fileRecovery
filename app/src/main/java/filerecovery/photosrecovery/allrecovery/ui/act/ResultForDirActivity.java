package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import bh.u;
import cj.w;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.activity.MediaListViewActivity;
import hh.c;
import java.util.ArrayList;
import og.a;
import yg.d;

/* loaded from: classes2.dex */
public class ResultForDirActivity extends d {
    public ResultForDirActivity() {
        w.n("J2UxdSF0CG87RAJyM2NAaTNpQnk=", "eCvA84KE");
    }

    @Override // yg.d
    public final bh.d g0() {
        return new u(this, a.O(this), this.f25701q, this);
    }

    @Override // yg.d
    public final Intent h0() {
        return new Intent(this, (Class<?>) MediaListViewActivity.class);
    }

    @Override // yg.d
    public final ArrayList i0() {
        int i10 = this.f25701q;
        return i10 == 2 ? c.f15633f : i10 == 1 ? c.f15634g : c.f15633f;
    }

    @Override // yg.d
    public final String j0() {
        int i10 = this.f25701q;
        return i10 == 2 ? getString(R.string.arg) : i10 == 1 ? getString(R.string.arg) : getString(R.string.arg);
    }
}
