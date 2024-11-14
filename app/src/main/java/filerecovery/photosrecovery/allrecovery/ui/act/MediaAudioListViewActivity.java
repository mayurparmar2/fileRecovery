package filerecovery.photosrecovery.allrecovery.ui.act;

import android.os.Bundle;
import androidx.recyclerview.widget.l;
import bh.c;
import bh.m;
import cj.w;
import com.android.lib.libbase.zjuibase.a;

import dg.d;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.display.view.MiniAudioPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import lg.b0;
import lg.u;
import lh.q;
import sj.f;
import wf.i;
import yg.o;

/* loaded from: classes2.dex */
public class MediaAudioListViewActivity extends o implements m, b0 {
    public static final /* synthetic */ int M0 = 0;
    public int K0;
    public MiniAudioPlayer L0;

    public MediaAudioListViewActivity() {
        w.n("OGUmaSxBO2QgbydpAXRiaSB3d2MdaQ9pRnk=", "RECv2urO");
        this.K0 = 100;
    }

    @Override // yg.o
    public final void A0(ArrayList arrayList) {
        i iVar;
        if (f.h()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            a aVar = (a) it.next();
            if (aVar != null && !aVar.isHeader() && (aVar instanceof i)) {
                iVar = (i) aVar;
                if (f.k(iVar.f24707b)) {
                    break;
                }
            }
        }
        if (iVar != null) {
            I0();
            this.L0.n(iVar, false);
        } else {
            f.n();
            this.L0.setVisibility(View.GONE);
        }
    }

    @Override // yg.o
    public final void B0(Bundle bundle) {
        int i10 = bundle.getInt(w.n("PGUTaShfEHUmaVxfLmkmdAp2WGU0Xz55IGUIZDBy", "PWEaG6Qz"), this.K0);
        this.K0 = i10;
        switch (i10) {
            case 101:
                this.f25769r.setText(getString(R.string.arg, w.n("UiBOIDU=", "7ibcbOUT")));
                break;
            case 102:
                this.f25769r.setText(getString(R.string.arg, w.n("ZCBaIHsw", "mRyUMTqS")));
                break;
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                this.f25769r.setText(getString(R.string.arg, w.n("YzBXLWk2MA==", "YS8ihOHS")));
                break;
            case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                this.f25769r.setText(getString(R.string.arg, w.n("byBBMA==", "L9Xna1nz")));
                break;
            default:
                this.f25769r.setText(R.string.arg);
                break;
        }
    }

    @Override // yg.o
    public final void C0() {
        super.C0();
        if (f.h()) {
            return;
        }
        I0();
    }

    @Override // yg.o
    public final void D0() {
        super.D0();
        c cVar = this.f25764m;
        if (cVar instanceof bh.o) {
            bh.o oVar = (bh.o) cVar;
            if (oVar.f2737k) {
                oVar.f2737k = false;
                oVar.j();
            }
        }
        this.L0.setVisibility(View.GONE);
    }

    @Override // yg.o
    public final void E0() {
        this.f25762k.o(13, this.K0, new b8.c(this), false);
    }

    public final void I0() {
        if (this.V.getVisibility() == 8) {
            c cVar = this.f25764m;
            if (cVar instanceof bh.o) {
                bh.o oVar = (bh.o) cVar;
                if (!oVar.f2737k) {
                    oVar.f2737k = true;
                    oVar.j();
                }
            }
            this.L0.setVisibility(View.VISIBLE);
        }
    }

    public final void J0() {
        if (this.V.getVisibility() == 8) {
            c cVar = this.f25764m;
            if (cVar instanceof bh.o) {
                bh.o oVar = (bh.o) cVar;
                if (!oVar.f2737k) {
                    oVar.f2737k = true;
                    oVar.j();
                }
            }
            this.L0.setVisibilityWithAnimal(0);
        }
    }

    @Override // yg.o, uf.i
    public final void V() {
        super.V();
        MiniAudioPlayer miniAudioPlayer = (MiniAudioPlayer) findViewById(R.id.mini_player_layout);
        this.L0 = miniAudioPlayer;
        miniAudioPlayer.getClass();
        miniAudioPlayer.setOnClickListener(new androidx.appcompat.widget.c(miniAudioPlayer, this, 4));
        this.f25763l.h(new l(this, 5));
    }

    @Override // yg.o, uf.i
    public final void Z() {
        super.Z();
        d.o(this, this.f25775v, 1);
        this.f25769r.setText(R.string.arg);
    }

    @Override // lg.b0
    public final void i(i iVar) {
        I0();
        this.L0.n(iVar, false);
        this.f25764m.j();
    }

    @Override // yg.o
    public final void m0(i iVar) {
        if (iVar == null || !f.k(iVar.f24707b)) {
            return;
        }
        runOnUiThread(new y9.m(this, 26));
    }

    @Override // lg.b0
    public final void o() {
        this.L0.setCustomVisibility(8);
        this.f25764m.j();
    }

    @Override // yg.o, uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.f18144a.f18148d.add(this);
    }

    @Override // yg.o, uf.i, j.p, androidx.fragment.app.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        u.f18144a.f18148d.remove(this);
    }

    @Override // yg.o, androidx.activity.i, l0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(w.n("GGUmaSxfL3UtaQRfHmlHdBp2X2UeXw15B2VsZDhy", "ilhnw3Mu"), this.K0);
    }

    @Override // yg.o
    public final c p0() {
        return new bh.o(this, this);
    }

    @Override // yg.o
    public final boolean r0(i iVar) {
        int i10;
        if (this.K0 == 100) {
            return false;
        }
        q.b(w.n("LE1U", "OUMJpcn8"), w.n("YTRGOXc-Tz58Pg0-fD5rPms-D2YqbD5lHU1TZA1hBGkidFdlJ3QUcmIxMQ==", "o6dHer5o"));
        int i11 = 1200000;
        int i12 = 3600000;
        switch (this.K0) {
            case 101:
                i10 = 300000;
                i12 = i10;
                i11 = 0;
                break;
            case 102:
                i11 = 300000;
                i12 = 1200000;
                break;
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                break;
            case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                i11 = 3600000;
                i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                break;
            default:
                i10 = 0;
                i12 = i10;
                i11 = 0;
                break;
        }
        int i13 = iVar.f24717l;
        return i13 < i11 || i13 > i12;
    }

    @Override // yg.o
    public final String u0() {
        return getString(R.string.arg);
    }
}
