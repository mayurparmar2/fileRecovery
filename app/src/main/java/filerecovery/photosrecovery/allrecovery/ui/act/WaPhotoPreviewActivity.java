package filerecovery.photosrecovery.allrecovery.ui.act;

import com.bumptech.glide.b;
import com.github.chrisbanes.photoview.PhotoView;
import com.demo.example.R;
import uf.f;

/* loaded from: classes2.dex */
public class WaPhotoPreviewActivity extends f {

    /* renamed from: u, reason: collision with root package name */
    public PhotoView f14520u;

    @Override // uf.f, uf.i
    public final void V() {
        super.V();
        PhotoView photoView = (PhotoView) findViewById(R.id.photoView);
        this.f14520u = photoView;
        photoView.setVisibility(View.VISIBLE);
    }

    @Override // uf.i
    public final void Z() {
        b.c(this).d(this).p(this.f22830o.f13361b.f13333c).E(this.f14520u);
    }
}
