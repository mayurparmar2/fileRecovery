package filerecovery.photosrecovery.allrecovery.activity.preview;

import ag.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.display.audio.VoicePlayer;
import java.util.ArrayList;
import java.util.Iterator;
import lf.b;
import lg.b0;
import lg.u;
import lg.v;
import sj.f;
import wf.i;

/* loaded from: classes2.dex */
public class AudioPreviewActivity extends b implements a {
    public TextView O;
    public TextView P;
    public SeekBar Q;
    public ImageView R;
    public VoicePlayer S;
    public i T;
    public boolean U = false;

    @Override // ag.a
    public final void D() {
        F();
        this.R.setImageResource(R.drawable.ic_video_replay);
    }

    @Override // ag.a
    public final void E(int i10, int i11) {
        if (this.U) {
            return;
        }
        x0(i11);
        if (i11 < 1000) {
            this.Q.setProgress(i11);
            this.O.setText(dg.a.k0(1000L));
            return;
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_video_playing);
        }
        this.Q.setProgress(i10);
        this.O.setText(dg.a.k0(i10));
    }

    @Override // ag.a
    public final void F() {
        if (isFinishing()) {
            return;
        }
        this.Q.setProgress(0);
        this.O.setText(dg.a.k0(0L));
        P();
    }

    @Override // ag.a
    public final void I() {
        og.a.G0(this, getString(R.string.arg));
        F();
        f.m();
    }

    @Override // ag.a
    public final void O() {
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_video_playing);
        }
    }

    @Override // ag.a
    public final void P() {
        this.R.setImageResource(R.drawable.ic_video_paused);
    }

    @Override // lf.g, zf.c
    public final void d(i iVar) {
        super.d(iVar);
        VoicePlayer voicePlayer = this.S;
        if (voicePlayer != null) {
            voicePlayer.f14309f.remove(this);
        }
    }

    @Override // lf.g
    public final void k0() {
        f.P();
    }

    @Override // lf.g, androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        VoicePlayer voicePlayer = this.S;
        if (voicePlayer == null || !voicePlayer.f14305b) {
            return;
        }
        f.m();
    }

    @Override // lf.g, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.iv_audio_start) {
            if (this.S == null) {
                w0(this.T);
            }
            if (f.g(this.S)) {
                v vVar = u.f18144a;
                i iVar = this.T;
                Iterator it = vVar.f18148d.iterator();
                while (it.hasNext()) {
                    b0 b0Var = (b0) it.next();
                    if (b0Var != null) {
                        b0Var.i(iVar);
                    }
                }
            }
            f.T();
        }
    }

    @Override // lf.b, lf.g, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        VoicePlayer voicePlayer = this.S;
        if (voicePlayer != null) {
            voicePlayer.f14309f.remove(this);
        }
        super.onDestroy();
    }

    @Override // lf.b
    public final void p0(View view) {
        this.R = (ImageView) view.findViewById(R.id.iv_audio_start);
        this.O = (TextView) view.findViewById(R.id.audio_preview_tv_current);
        this.P = (TextView) view.findViewById(R.id.audio_preview_tv_total);
        this.Q = (SeekBar) view.findViewById(R.id.audio_preview_progress);
    }

    @Override // lf.b
    public final ArrayList q0(i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24706a));
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24707b));
        arrayList.add(new vf.b(getString(R.string.arg), dg.a.D(this, iVar.f24710e)));
        arrayList.add(new vf.b(getString(R.string.arg), og.a.G(iVar.f24709d)));
        arrayList.add(new vf.b(getString(R.string.arg), og.a.N(iVar.f24717l)));
        return arrayList;
    }

    @Override // lf.b
    public final int r0() {
        return R.id.vs_audio;
    }

    @Override // lf.b
    public final int s0() {
        return R.id.inflate_audio_root;
    }

    @Override // lf.b
    public final void t0(i iVar) {
        this.T = iVar;
        this.R.setOnClickListener(this);
        this.Q.setOnSeekBarChangeListener(new lf.a(this, iVar, 0));
        w0(iVar);
    }

    @Override // lf.b
    public final boolean u0() {
        return false;
    }

    public final void w0(i iVar) {
        this.Q.setMax(iVar.f24717l);
        this.P.setText(dg.a.k0(Math.max(iVar.f24717l, 1000)));
        if (f.k(iVar.f24707b)) {
            VoicePlayer voicePlayer = f.f21192e;
            this.S = voicePlayer;
            if (voicePlayer != null) {
                this.O.setText(dg.a.k0(voicePlayer.h()));
                this.Q.setProgress(this.S.h());
                if (this.S.i()) {
                    O();
                }
            } else {
                this.O.setText(dg.a.k0(0L));
            }
        } else {
            if (this.S == null) {
                VoicePlayer voicePlayer2 = new VoicePlayer();
                this.S = voicePlayer2;
                voicePlayer2.f14307d = iVar.f24707b;
            }
            this.O.setText(dg.a.k0(0L));
            f.m();
        }
        VoicePlayer voicePlayer3 = this.S;
        if (voicePlayer3 != null) {
            voicePlayer3.f14309f.add(this);
        }
    }

    @Override // ag.a
    public final void x(int i10) {
        x0(i10);
        this.R.setImageResource(R.drawable.ic_video_playing);
    }

    public final void x0(int i10) {
        if (this.Q.getMax() == 0 || (i10 > 0 && i10 != this.Q.getMax())) {
            this.T.f24717l = i10;
            this.Q.setMax(i10);
            this.P.setText(dg.a.k0(Math.max(this.T.f24717l, 1000)));
        }
    }
}
