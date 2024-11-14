package filerecovery.photosrecovery.allrecovery.ui.act;

import android.net.Uri;
import c2.h0;
import c2.r;
import cj.w;
import com.bumptech.glide.d;
import com.recovery.player.PlayerView;
import ed.i;
import com.demo.example.R;
import java.io.File;
import lf.j;
import uf.f;
import v1.e0;
import v1.s;
import y9.m;

/* loaded from: classes2.dex */
public class WaGIFPreviewActivity extends f {

    /* renamed from: u, reason: collision with root package name */
    public PlayerView f14514u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f14515v;

    @Override // uf.f, uf.i
    public final void V() {
        super.V();
        PlayerView playerView = (PlayerView) findViewById(R.id.gif_player);
        this.f14514u = playerView;
        playerView.setUseController(false);
        this.f14514u.setVisibility(View.VISIBLE);
        r rVar = new r(this);
        d.j(!rVar.f3178t);
        rVar.f3178t = true;
        h0 h0Var = new h0(rVar);
        this.f14515v = h0Var;
        this.f14514u.setPlayer(h0Var);
    }

    @Override // uf.f, uf.i
    public final int W() {
        return R.layout.activity_wa_common_preview_detail;
    }

    @Override // uf.i
    public final void Z() {
        ed.d dVar;
        i iVar = this.f22830o;
        String str = (iVar == null || (dVar = iVar.f13361b) == null) ? "" : dVar.f13333c;
        try {
            Uri e10 = z5.f.e(this, new File(str));
            int i10 = e0.f23020g;
            s sVar = new s();
            sVar.f23186b = e10;
            this.f14515v.p(sVar.a());
        } catch (Exception e11) {
            e11.printStackTrace();
            dg.d.y(this, dg.d.f12739i, w.n("IWwWeSxyLmYrbFZQI3Ro", "KsFbKcar"), str);
        }
        this.f14514u.d(str);
        this.f14514u.requestFocus();
        h0 h0Var = this.f14515v;
        j jVar = new j(this, 1);
        h0Var.getClass();
        h0Var.f3026l.a(jVar);
        this.f14515v.V(1);
        this.f14514u.post(new m(this, 27));
    }

    @Override // uf.f, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        h0 h0Var = this.f14515v;
        if (h0Var != null) {
            try {
                h0Var.Y();
                this.f14515v.P();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        h0 h0Var = this.f14515v;
        if (h0Var != null) {
            h0Var.i();
        }
    }

    @Override // uf.f, uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        h0 h0Var = this.f14515v;
        if (h0Var != null) {
            h0Var.U(true);
        }
    }
}
