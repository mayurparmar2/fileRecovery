package filerecovery.photosrecovery.allrecovery;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.n0;
import cj.w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;

import filerecovery.photosrecovery.allrecovery.activity.CommonPreScanActivity;
import filerecovery.photosrecovery.allrecovery.activity.RecoveryFinishActivity;
import filerecovery.photosrecovery.allrecovery.ad.openad.AppOpenManager;
import filerecovery.photosrecovery.allrecovery.dialog.BaseProgressDialog;
import filerecovery.photosrecovery.allrecovery.ui.act.BackupListDetailActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ContactDeletedActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.ContactRecoverMainActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.JunkCleanFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.MediaDeleteFinishActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.NewPersonActivity;
import filerecovery.photosrecovery.allrecovery.ui.act.NewPersonExperimentActivity;
import java.util.ArrayList;
import lg.k0;
import xf.v;

/* loaded from: classes2.dex */
public final class h extends sj.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14332h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i10) {
        super(0);
        this.f14331g = i10;
        this.f14332h = obj;
    }

    @Override // sj.f
    public final void H() {
        int i10 = this.f14331g;
        Object obj = this.f14332h;
        switch (i10) {
            case 5:
                lh.c.a().f18164g = true;
                break;
            case 9:
                nh.a.k(w.n("fHUWdBlGL2w0QQJNNG5SZ1dyGVQIc0FQCmFu", "oH1zpZfh"), w.n("DG4yZHdsXmMzZWQ=", "Pgcs47Im"));
                sj.f fVar = ((of.b) obj).f19296c;
                if (fVar != null) {
                    fVar.H();
                    break;
                }
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                nh.a.k(w.n("HHUbdCBMEG4ldVJnJ0ExTTRuUGcmchVUEnMzUBVhbg==", "wGyPFgr5"), w.n("Gm4DZA5sJ2MiZWQ=", "AfNWlkvL"));
                sj.f fVar2 = ((of.d) obj).f19306c;
                if (fVar2 != null) {
                    fVar2.H();
                    break;
                }
                break;
            case 22:
                ((NewPersonActivity) obj).f14467l = true;
                k0.f18124a.execute(new e8.a(7));
                break;
            case 23:
                ((NewPersonExperimentActivity) obj).f14479l = true;
                break;
        }
    }

    @Override // sj.f
    public final void I() {
        int i10 = this.f14331g;
        n0 n0Var = null;
        Object obj = this.f14332h;
        switch (i10) {
            case 1:
                AppOpenManager.f14240e = System.currentTimeMillis();
                gg.e.f15032c.onAdClose();
                break;
            case 2:
                sc.b.f21114a.getClass();
                sc.e eVar = sc.b.f21115b;
                if (eVar != null) {
                    String n10 = w.n("DW4hdBtzQ2w5c2g=", "YzdHD3X2");
                    p pVar = new p(2);
                    w.n("R3k4ZQByZw==", "lp3HAxrL");
                    w.n("MmEbbCthEms=", "fhZ08jLE");
                    String n11 = w.n("EWU0LitsO3Q9ZRkuAmlTZSpuGEYFdQ10AHIKcAVBNWlbbyxBKUMibzpl", "xygceKuE");
                    ni.i iVar = sc.e.f21128c;
                    new hi.a(eVar.f21129a, n11, wf.d.h(), n0Var).a(nh.b.I(n10), new sc.c(pVar, 4));
                    break;
                }
                break;
            case 9:
                nh.a.k(w.n("JnUldBhGA2w0QQJNNG5SZ1dyGVQIc0FQCmFu", "IpkIqv8G"), w.n("Gm4DZA5sIXNl", "UzyYt3Jy"));
                of.b bVar = (of.b) obj;
                if (bVar.f19301h) {
                    rf.g.c().h();
                }
                sj.f fVar = bVar.f19296c;
                if (fVar != null) {
                    fVar.I();
                }
                bVar.f19296c = null;
                sf.c.m().f15973a = null;
                rf.h.l().f15973a = null;
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                nh.a.k(w.n("HHUbdCBMEG4ldVJnJ0ExTTRuUGcmchVUHHMlUAthbg==", "yQgvSVRj"), w.n("Gm4DZA5sIXNl", "jmbttsRI"));
                sj.f fVar2 = ((of.d) obj).f19306c;
                if (fVar2 != null) {
                    fVar2.I();
                    break;
                }
                break;
            case 12:
                rf.g.c().f20639c.f20632g = null;
                BaseProgressDialog baseProgressDialog = (BaseProgressDialog) obj;
                baseProgressDialog.f14300w = 102;
                baseProgressDialog.q();
                break;
            case 13:
                ((jg.b) obj).o0();
                break;
        }
    }

    @Override // sj.f
    public final void J() {
        int i10 = this.f14331g;
        Object obj = this.f14332h;
        switch (i10) {
            case 9:
                nh.a.k(w.n("HHUbdCBGBGwuQVdNI240ZzByblQmcz5QBGFu", "hadWkbia"), w.n("Pm42ZABtAXInc0BpLW4=", "RddaZAIH"));
                sj.f fVar = ((of.b) obj).f19296c;
                if (fVar != null) {
                    fVar.J();
                    break;
                }
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                nh.a.k(w.n("OHUudCRML24udQpnF0FQTSRuV2cMciZULnMuUARhbg==", "updbKZhx"), w.n("IG41ZDhtPnI9cxVpOm4=", "vsOtqN2M"));
                sj.f fVar2 = ((of.d) obj).f19306c;
                if (fVar2 != null) {
                    fVar2.J();
                    break;
                }
                break;
        }
    }

    @Override // sj.f
    public final void K(String str) {
        long j4;
        int i10 = this.f14331g;
        int i11 = 1;
        Object obj = this.f14332h;
        switch (i10) {
            case 1:
                OpenAdLoadingActivity openAdLoadingActivity = (OpenAdLoadingActivity) obj;
                if (openAdLoadingActivity.B) {
                    openAdLoadingActivity.A.postDelayed(new androidx.activity.b(this, 25), 500L);
                    break;
                }
                break;
            case 2:
                sc.b.f21114a.getClass();
                sc.e eVar = sc.b.f21115b;
                if (eVar != null) {
                    eVar.b(w.n("OG4edBZzAWwjc2g=", "GdLKnb25"), false, new p(3));
                    break;
                }
                break;
            case 5:
                sc.b.f21114a.getClass();
                sc.e eVar2 = sc.b.f21115b;
                if (eVar2 != null) {
                    eVar2.b(w.n("I3UGZFFfPWFu", "dPDo4Q7N"), false, new p(5));
                    break;
                }
                break;
            case 7:
                ((RecoveryFinishActivity) obj).f14203o.setVisibility(View.GONE);
                break;
            case 9:
                nh.a.j(w.n("PnUkdBxGG2w0QQJNNG5SZ1dyGVQIc0FQCmFu", "ZRsHunmB"), w.n("cW8ZQS1MHmEmRlJpLmUxOiA=", "56FqUPet") + str);
                of.b bVar = (of.b) obj;
                int i12 = bVar.f19294a + 1;
                bVar.f19294a = i12;
                ArrayList arrayList = bVar.f19298e;
                if (arrayList != null && i12 < arrayList.size()) {
                    nh.a.j(w.n("fHUhdA5GBWw0QQJNNG5SZ1dyGVQIc0FQCmFu", "m11Mgpeq"), w.n("LmwtYSlOK3g9QgpuHGVGXX8gRGUYdRxzNlAfcxp0K28bIH89IA==", "L8giBpsB") + bVar.f19294a);
                    bVar.c(bVar.f19300g);
                    break;
                } else {
                    bVar.f19295b = false;
                    sj.f fVar = bVar.f19296c;
                    if (fVar != null) {
                        fVar.K(str);
                        break;
                    }
                }
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                nh.a.j(w.n("HHUbdCBMEG4ldVJnJ0ExTTRuUGcmchVUIHMiUBxhbg==", "EVpkpE03"), w.n("F28cQRFMHWE8RgdpOWVXOiA=", "io7rurOX") + str);
                of.d dVar = (of.d) obj;
                int i13 = dVar.f19304a + 1;
                dVar.f19304a = i13;
                ArrayList arrayList2 = dVar.f19308e;
                if (arrayList2 != null && i13 < arrayList2.size()) {
                    nh.a.j(w.n("D3U7dA9MLW4_dQdnMEFXTVNuJ2cIcmpUA3MMUFphbg==", "NABWfLQH"), w.n("CmwYYS1OFHg2QlJuLGUnXW8gQ2UydS9zGFAXc150Dm8_IEo9IA==", "lx7gStYP") + dVar.f19304a);
                    dVar.e(dVar.f19312i);
                    break;
                } else {
                    dVar.f19305b = false;
                    sj.f fVar2 = dVar.f19306c;
                    if (fVar2 != null) {
                        fVar2.K(str);
                    }
                    if (!dVar.f19310g) {
                        dVar.h();
                        break;
                    }
                }
                break;
            case 11:
                ((uf.f) obj).f22829n.setVisibility(View.GONE);
                break;
            case 12:
                BaseProgressDialog baseProgressDialog = (BaseProgressDialog) obj;
                int i14 = BaseProgressDialog.I;
                if (!baseProgressDialog.v()) {
                    Context context = baseProgressDialog.getContext();
                    String str2 = dg.f.f12740a;
                    if (context == null) {
                        j4 = 3000;
                    } else {
                        boolean z6 = yh.b.b().f25816b;
                        String str3 = dg.f.f12740a;
                        if (z6) {
                            j4 = v.a().f25198c;
                            lh.q.b(str3, w.n("bWQnYhlnGT5mPlg-ayBBZUVhNGQyZkBsCl8ZZGlyL2wiYSZfBW5NZSp2B2x1Og==", "8gMBl9wv") + j4);
                        } else {
                            int n10 = j3.j.n(context, null, w.n("BmUiYTVkOWYtbApfNGRscldsKWEJX1xuEmUKdlds", "HstUGfY3"), 3);
                            nh.a.j(str3, w.n("cXISbCxhAmViPg0-fCAnZSJhQ2QcZj9sXF8jZChyDWw-YRNfIG4FZTB2UmxiOiA=", "0BwhAcvP") + n10 + w.n("Uw==", "iHL2ii0X"));
                            j4 = ((long) n10) * 1000;
                        }
                    }
                    baseProgressDialog.C.postDelayed(new e2.n(this, j4, i11), j4);
                    break;
                } else {
                    lh.q.b(w.n("E2EEZRlyHmcwZUBzBmk0bDpn", "s7PQ6N5e"), w.n("cW8ZQS1MHmEmRlJpLmUxIHkgQWE2cy8gB28nZE8gTHUiZVd0IG0UIDo=", "kFclwOd0") + (System.currentTimeMillis() - baseProgressDialog.f14298u));
                    break;
                }
            case 20:
                ((JunkCleanFinishActivity) obj).f14444m.setVisibility(View.GONE);
                break;
            case TTAdConstant.CONVERSION_LINK_DOWNLOAD_DIRECT /* 21 */:
                ((MediaDeleteFinishActivity) obj).f14460o.setVisibility(View.GONE);
                break;
        }
    }

    @Override // sj.f
    public final void L(Context context) {
        pa.e eVar = zj.d.f26173c;
        pa.e eVar2 = zj.d.f26172b;
        int i10 = this.f14331g;
        int i11 = 1;
        Object obj = this.f14332h;
        switch (i10) {
            case 0:
                gg.c.f15030c.c();
                break;
            case 1:
                gg.e.f15032c.p();
                break;
            case 2:
                sc.b.f21114a.getClass();
                sc.e eVar3 = sc.b.f21115b;
                if (eVar3 != null) {
                    eVar3.b(w.n("MW4zdDJzNGw5c2g=", "fWXZmDHX"), true, new p(4));
                    break;
                }
                break;
            case 3:
                eVar2.z(1);
                break;
            case 4:
                CommonPreScanActivity commonPreScanActivity = (CommonPreScanActivity) obj;
                nf.p.D().B(commonPreScanActivity, commonPreScanActivity.f14153n, R.color.color_100_white_262626, R.color.color_100_white_262626);
                break;
            case 5:
                sc.b.f21114a.getClass();
                sc.e eVar4 = sc.b.f21115b;
                if (eVar4 != null) {
                    eVar4.b(w.n("EnUrZChfImFu", "LruiI3O6"), true, new p(6));
                    break;
                }
                break;
            case 6:
                gg.d.f15031c.c();
                break;
            case 7:
                w.n("MmEbbCthEms=", "YQGrb15I");
                gg.b.f15029c.c();
                break;
            case AdSlot.TYPE_FULL_SCREEN_VIDEO /* 8 */:
                eVar2.z(2);
                break;
            case 9:
                nh.a.k(w.n("HHUbdCBGBGwuQVdNI240ZzByblQmcz5QFWFu", "yePaARui"), w.n("Gm4DZAFvL2QsZA==", "3FhXsV82"));
                of.b bVar = (of.b) obj;
                bVar.f19295b = false;
                sj.f fVar = bVar.f19296c;
                if (fVar != null) {
                    fVar.L(context);
                    break;
                }
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                of.d dVar = (of.d) obj;
                String str = of.d.f19303j;
                dVar.h();
                nh.a.k(w.n("OHUudCRML24udQpnF0FQTSRuV2cMciZUA3MiUAZhbg==", "UAoVfVjA"), w.n("Pm42ZAVvEGQnZA==", "Dg85cv7D"));
                dVar.f19305b = false;
                sj.f fVar2 = dVar.f19306c;
                if (fVar2 != null) {
                    fVar2.L(context);
                    break;
                }
                break;
            case 11:
                eVar.z(4);
                break;
            case 12:
                BaseProgressDialog baseProgressDialog = (BaseProgressDialog) obj;
                baseProgressDialog.G = true;
                int currentTimeMillis = (int) (System.currentTimeMillis() - baseProgressDialog.f14298u);
                lh.q.b(w.n("E2EEZRlyHmcwZUBzBmk0bDpn", "H2kMSyV5"), w.n("cW8ZQS1MHmEmZVcsYiAgczAgRWkuZWo6", "c0l0Ap7P") + currentTimeMillis);
                long j4 = (long) currentTimeMillis;
                long j10 = baseProgressDialog.f14296s;
                if (j4 <= j10) {
                    baseProgressDialog.C.postDelayed(new xf.f(this, i11), j10 - j4);
                    break;
                } else {
                    baseProgressDialog.A();
                    break;
                }
            case 14:
                BackupListDetailActivity backupListDetailActivity = (BackupListDetailActivity) obj;
                nf.f.D(w.n("E2EUazxwPWkxdHdlNmE8bBRjRWk1aT55", "1Dd1JMa7")).F(backupListDetailActivity, backupListDetailActivity.f14361q);
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_VERTICAL /* 15 */:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.n("E2EEZQ1pA1Inc0ZsNkE2dDx2WHR5", "QSDZ1i9q"));
                yg.d dVar2 = (yg.d) obj;
                sb2.append(dVar2.f25701q);
                mf.c.c0(sb2.toString()).Y(dVar2, dVar2.f25695k);
                break;
            case TTAdConstant.IMAGE_MODE_VERTICAL_IMG /* 16 */:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w.n("IWE7ZSl1BWsbbANhO1JWc0dsMkEOdFx2D3R5", "pvcHckUZ"));
                yg.j jVar = (yg.j) obj;
                sb3.append(jVar.j0());
                mf.c.c0(sb3.toString()).Y(jVar, jVar.N);
                break;
            case 17:
                ContactDeletedActivity contactDeletedActivity = (ContactDeletedActivity) obj;
                nf.f.D(w.n("Em8ZdChjBUQnbFZ0J2QUYyFpR2k3eQ==", "Pxapkxtf")).F(contactDeletedActivity, contactDeletedActivity.f14407r);
                break;
            case 18:
                ContactRecoverMainActivity contactRecoverMainActivity = (ContactRecoverMainActivity) obj;
                nf.f.D(w.n("Em8ZdChjBVInY1x2J3IYYTxu", "HCpI9A0A")).B(contactRecoverMainActivity, contactRecoverMainActivity.f14419t, R.color.color_100_white_262626, R.color.color_100_D6E1F6_373737);
                break;
            case TTAdConstant.CONVERSION_LINK_LANDING_DIRECT_AND_ENDCARD /* 19 */:
                eVar2.z(6);
                break;
            case 20:
                w.n("MmEbbCthEms=", "YQGrb15I");
                gg.b.f15029c.c();
                break;
            case TTAdConstant.CONVERSION_LINK_DOWNLOAD_DIRECT /* 21 */:
                w.n("MmEbbCthEms=", "YQGrb15I");
                gg.b.f15029c.c();
                break;
            case 22:
                NewPersonActivity newPersonActivity = (NewPersonActivity) obj;
                mf.e.f18528a.Y(newPersonActivity, newPersonActivity.f14466k);
                break;
            case 23:
                nf.o D = nf.o.D();
                NewPersonExperimentActivity newPersonExperimentActivity = (NewPersonExperimentActivity) obj;
                LinearLayout linearLayout = newPersonExperimentActivity.f14478k;
                D.getClass();
                D.A(newPersonExperimentActivity, linearLayout, og.a.D());
                if (newPersonExperimentActivity.f14480m.getCurrentItem() == 1) {
                    newPersonExperimentActivity.f14478k.setVisibility(View.GONE);
                    break;
                }
                break;
            case 24:
                eVar2.z(7);
                break;
            case 25:
                eVar.z(3);
                break;
            case 26:
                gh.c cVar = (gh.c) obj;
                nf.f.D(w.n("EGwbQyZuBWEhdHVyI2c4ZTt0", "twLHOV25")).F(cVar.c(), cVar.H0);
                break;
            case 27:
                gh.d dVar3 = (gh.d) obj;
                nf.f.D(w.n("CmFbawxwK282dAdjIUZBYVVtI250", "WeH8yhMH")).F(dVar3.c(), dVar3.A0);
                break;
            case 28:
                eVar.z(1);
                break;
            case 29:
                eVar.z(2);
                break;
        }
    }

    @Override // sj.f
    public final void M(boolean z6) {
        int i10 = this.f14331g;
        Object obj = this.f14332h;
        switch (i10) {
            case 1:
                gg.e.f15032c.onAdShow();
                break;
            case 2:
                LinearLayout linearLayout = ((SplashActivity) obj).f14119l;
                if (linearLayout != null) {
                    linearLayout.setVisibility(View.GONE);
                }
                sc.b.f21114a.getClass();
                sc.e eVar = sc.b.f21115b;
                if (eVar != null) {
                    String n10 = w.n("Im4adBBzIGw5c2g=", "mqKsOPhj");
                    p pVar = new p(1);
                    w.n("THkkZQRyZw==", "MB8TEJ9K");
                    w.n("MmEbbCthEms=", "n5duCRbJ");
                    String n11 = w.n("CmVPLghsP3QsZRQuJWlUZV1uaEYBdUF0A3I5cEZBOmlAb1dBClMiby9lZA==", "tOn9nJTL");
                    ni.i iVar = sc.e.f21128c;
                    new hi.a(eVar.f21129a, n11, wf.d.h(), null).a(nh.b.J(n10, Boolean.TRUE), new sc.c(pVar, 1));
                    break;
                }
                break;
            case 9:
                nh.a.k(w.n("OHUudCRGO2wlQQ9NE25VZyByaVQMcw1QBWFu", "djNXiGfW"), w.n("Pm42ZBpoHnc=", "Sc1zfC7k"));
                sj.f fVar = ((of.b) obj).f19296c;
                if (fVar != null) {
                    fVar.M(z6);
                    break;
                }
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                nh.a.k(w.n("AnUtdD1MVm4_dQdnMEFXTVNuJ2cIcmpUA3MMUFphbg==", "LXOAT7QG"), w.n("Nm4wZGpoCnc=", "pjYq9e2O"));
                sj.f fVar2 = ((of.d) obj).f19306c;
                if (fVar2 != null) {
                    fVar2.M(z6);
                    break;
                }
                break;
        }
    }

    @Override // sj.f
    public final void N(Context context) {
        int i10 = this.f14331g;
        Object obj = this.f14332h;
        switch (i10) {
            case 9:
                nh.a.k(w.n("HHUbdCBGBGwuQVdNI240ZzByblQmcz5QKmFu", "FX0gqxtL"), w.n("Gm4DZB50L3I9TARhZA==", "IFMGXg1Y"));
                sj.f fVar = ((of.b) obj).f19296c;
                if (fVar != null) {
                    fVar.N(context);
                    break;
                }
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                nh.a.k(w.n("OHUudCRML24udQpnF0FQTSRuV2cMciZUIXMdUFhhbg==", "XmIfDi4w"), w.n("Gm4DZB50L3I9TARhZA==", "seQktxsg"));
                sj.f fVar2 = ((of.d) obj).f19306c;
                if (fVar2 != null) {
                    fVar2.N(context);
                    break;
                }
                break;
        }
    }
}
