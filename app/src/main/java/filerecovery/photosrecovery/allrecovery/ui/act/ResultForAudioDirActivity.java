package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import bh.s;
import com.demo.example.R;
import hh.c;
import java.util.ArrayList;
import yg.d;

/* loaded from: classes2.dex */
public class ResultForAudioDirActivity extends d {
    @Override // yg.d
    public final bh.d g0() {
        return new s(0, this, this);
    }

    @Override // yg.d
    public final Intent h0() {
        return new Intent(this, (Class<?>) MediaAudioListViewActivity.class);
    }

    @Override // yg.d
    public final ArrayList i0() {
        return c.f15635h;
    }

    @Override // yg.d
    public final String j0() {
        return getString(R.string.arg_res_0x7f11003a);
    }
}
