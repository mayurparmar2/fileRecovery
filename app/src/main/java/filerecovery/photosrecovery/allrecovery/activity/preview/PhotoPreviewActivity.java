package filerecovery.photosrecovery.allrecovery.activity.preview;

import android.view.View;
import android.widget.ImageView;
import dg.a;
import com.demo.example.R;
import java.util.ArrayList;
import lf.b;
import lf.h;
import wf.i;

/* loaded from: classes2.dex */
public class PhotoPreviewActivity extends b {
    public ImageView O;
    public ImageView P;

    @Override // lf.g, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.inflate_photo_root) {
            v0();
        }
    }

    @Override // lf.b
    public final void p0(View view) {
        this.O = (ImageView) view.findViewById(R.id.iv_preview_photo);
        this.P = (ImageView) view.findViewById(R.id.iv_holder);
        view.setOnClickListener(this);
    }

    @Override // lf.b
    public final ArrayList q0(i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24706a));
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24707b));
        arrayList.add(new vf.b(getString(R.string.arg), iVar.c()));
        arrayList.add(new vf.b(getString(R.string.arg), a.D(this, iVar.f24710e)));
        return arrayList;
    }

    @Override // lf.b
    public final int r0() {
        return R.id.vs_photo;
    }

    @Override // lf.b
    public final int s0() {
        return R.id.inflate_photo_root;
    }

    @Override // lf.b
    public final void t0(i iVar) {
        com.bumptech.glide.b.c(this).d(this).p(iVar.f24707b).G(new h(this, 1)).E(this.O);
    }

    @Override // lf.b
    public final boolean u0() {
        return true;
    }
}
