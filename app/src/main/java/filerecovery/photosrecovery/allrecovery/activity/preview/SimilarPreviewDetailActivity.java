package filerecovery.photosrecovery.allrecovery.activity.preview;

import android.widget.ImageView;
import com.bumptech.glide.b;
import com.github.chrisbanes.photoview.PhotoView;
import com.demo.example.R;
import lf.c;
import lf.h;
import wf.i;

/* loaded from: classes2.dex */
public class SimilarPreviewDetailActivity extends c {
    public PhotoView N;

    @Override // uf.i
    public final void Z() {
        i iVar = this.f18072j;
        String str = iVar != null ? iVar.f24707b : "";
        l0();
        ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setVisibility(View.VISIBLE);
        }
        b.c(this).d(this).p(str).G(new h(this, 3)).E(this.N);
    }

    @Override // lf.g
    public final void g0() {
        PhotoView photoView = (PhotoView) findViewById(R.id.photoView);
        this.N = photoView;
        photoView.setVisibility(View.VISIBLE);
    }
}
