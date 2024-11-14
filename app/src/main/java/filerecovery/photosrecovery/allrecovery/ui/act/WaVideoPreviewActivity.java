package filerecovery.photosrecovery.allrecovery.ui.act;

import android.net.Uri;
import c2.h0;
import c2.r;
import cj.w;
import com.recovery.player.PlayerView;
import ed.d;
import ed.i;
import com.demo.example.R;
import java.io.File;
import lf.j;
import og.a;
import uf.f;
import v1.s;

/* loaded from: classes2.dex */
public class WaVideoPreviewActivity extends f {

    /* renamed from: u, reason: collision with root package name */
    public PlayerView f14521u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f14522v;

    @Override // uf.f, uf.i
    public final void V() {
        super.V();
        PlayerView playerView = (PlayerView) findViewById(R.id.video_player);
        this.f14521u = playerView;
        playerView.setVisibility(View.VISIBLE);
    }

    @Override // uf.f, uf.i
    public final int W() {
        return R.layout.activity_wa_common_preview_detail;
    }

    @Override // uf.i
    public final void Z() {
        i iVar = this.f22830o;
        d dVar = iVar != null ? iVar.f13361b : null;
        String str = dVar != null ? dVar.f13333c : "";
        r rVar = new r(this);
        com.bumptech.glide.d.j(!rVar.f3178t);
        rVar.f3178t = true;
        h0 h0Var = new h0(rVar);
        this.f14522v = h0Var;
        this.f14521u.setPlayer(h0Var);
        this.f14522v.O();
        h0 h0Var2 = this.f14522v;
        j jVar = new j(this, 2);
        h0Var2.getClass();
        h0Var2.f3026l.a(jVar);
        try {
            Uri e10 = z5.f.e(this, new File(str));
            s sVar = new s();
            sVar.f23186b = e10;
            this.f14522v.p(sVar.a());
        } catch (Exception e11) {
            e11.printStackTrace();
            a.G0(this, getString(R.string.arg));
            dg.d.y(this, dg.d.f12739i, w.n("IWwWeSxyLmYrbFZQI3Ro", "CavbOFJU"), str);
        }
        this.f14521u.d(str);
        if (dVar != null) {
            this.f14521u.setDuration(dVar.f13340j);
        }
        this.f14521u.requestFocus();
    }

    @Override // uf.f
    public final void f0() {
        h0 h0Var = this.f14522v;
        if (h0Var != null) {
            h0Var.i();
        }
    }

    @Override // uf.f, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        h0 h0Var = this.f14522v;
        if (h0Var != null) {
            try {
                h0Var.Y();
                this.f14522v.P();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        super.onDestroy();
    }

    @Override // uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        h0 h0Var = this.f14522v;
        if (h0Var != null) {
            h0Var.i();
        }
    }
}
