package filerecovery.photosrecovery.allrecovery.activity.preview;

import android.net.Uri;
import c2.h0;
import c2.r;
import cj.w;
import com.bumptech.glide.d;
import com.recovery.player.PlayerView;
import com.demo.example.R;
import java.io.File;
import lf.c;
import lf.j;
import og.a;
import v1.s;
import z5.f;

/* loaded from: classes2.dex */
public class VideoPreviewDetailActivity extends c {
    public PlayerView N;
    public h0 O;

    @Override // uf.i
    public final void Z() {
        if (this.f18079q == 6) {
            l0();
        }
        if (this.f18072j == null) {
            return;
        }
        r rVar = new r(this);
        d.j(!rVar.f3178t);
        rVar.f3178t = true;
        h0 h0Var = new h0(rVar);
        this.O = h0Var;
        this.N.setPlayer(h0Var);
        this.N.setDuration(this.f18072j.f24717l);
        this.O.O();
        h0 h0Var2 = this.O;
        j jVar = new j(this, 0);
        h0Var2.getClass();
        h0Var2.f3026l.a(jVar);
        try {
            Uri e10 = f.e(this, new File(this.f18072j.f24707b));
            s sVar = new s();
            sVar.f23186b = e10;
            this.O.p(sVar.a());
        } catch (Exception e11) {
            e11.printStackTrace();
            a.G0(this, getString(R.string.arg));
            dg.d.y(this, dg.d.f12739i, w.n("BWwjeShyEWYgbA5QE3Ro", "AdJJwsJF"), this.f18072j.f24707b);
        }
        this.N.d(this.f18072j.f24707b);
        this.N.requestFocus();
    }

    @Override // lf.g
    public final void g0() {
        PlayerView playerView = (PlayerView) findViewById(R.id.video_player);
        this.N = playerView;
        playerView.setVisibility(View.VISIBLE);
    }

    @Override // lf.g
    public final void k0() {
        h0 h0Var = this.O;
        if (h0Var != null) {
            h0Var.i();
        }
    }

    @Override // lf.g, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        h0 h0Var = this.O;
        if (h0Var != null) {
            try {
                h0Var.Y();
                this.O.P();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        super.onDestroy();
    }

    @Override // lf.g, uf.i, androidx.fragment.app.w, android.app.Activity
    public final void onPause() {
        super.onPause();
        h0 h0Var = this.O;
        if (h0Var != null) {
            h0Var.i();
        }
    }
}
