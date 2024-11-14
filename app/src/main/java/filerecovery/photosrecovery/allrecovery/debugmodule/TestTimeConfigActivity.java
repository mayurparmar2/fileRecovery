package filerecovery.photosrecovery.allrecovery.debugmodule;

import android.content.Context;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.w;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.demo.example.R;
import hc.e;
import java.util.ArrayList;
import java.util.Iterator;
import lh.h;
import lh.r;
import o0.n;
import og.a;
import uf.i;
import x5.b;
import xf.q;
import xf.u;
import xf.v;

/* loaded from: classes2.dex */
public class TestTimeConfigActivity extends i {

    /* renamed from: j, reason: collision with root package name */
    public u f14293j;

    public static void f0(TestTimeConfigActivity testTimeConfigActivity) {
        testTimeConfigActivity.getClass();
        h.p(-1);
        h.l(-1);
        h.n(0L);
        h.o(0L);
        h.k(0L);
        h.f18186j = false;
        h.f18187k = 0L;
        h.f18188l = 0L;
        h.f18189m = false;
        h.f18190n = 0L;
        h.f18191o = 0L;
        e eVar = z5.e.f26010b;
        Context a10 = b.a();
        a.o(a10, w.n("NmUDQTlwMm8sdFZ4Nigp", "Za4YXrSU"));
        z5.e.c(eVar.i(a10), w.n("BmgtdxJjIm86ZTRyF3RVaStfUXUAZBxfGW8PbnQ=", "A8pTzztN"), 0);
        h.m(0L);
        Iterator it = testTimeConfigActivity.f14293j.f25195c.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            String str = qVar.f25189c;
            int i10 = qVar.f25183b;
            if (i10 == 11) {
                String str2 = r.f18210b;
                if (str2.equalsIgnoreCase(str)) {
                    r.f18213e = str2;
                } else {
                    String str3 = r.f18211c;
                    if (str3.equalsIgnoreCase(str)) {
                        r.f18213e = str3;
                    } else {
                        r.f18213e = r.f18212d;
                    }
                }
                lh.q.b(r.f18209a, w.n("VXMndG10K3M9Rx5pFmVkbCRuYGEFdRwgHHUxY1NzFyFUIWIgFm4rd2lnHmkWZWkgMWVFdElwFWEBICRhWnUBIBxzeCCugJA=", "vlALoR6d") + r.f18213e + w.n("loCR", "InGePYsX"));
            } else if (i10 != 20) {
                switch (i10) {
                    case 0:
                        try {
                            v.a().f25196a = Long.parseLong(str);
                            break;
                        } catch (NumberFormatException e10) {
                            e10.printStackTrace();
                            break;
                        }
                    case 1:
                        try {
                            v.a().f25197b = Long.parseLong(str);
                            break;
                        } catch (NumberFormatException e11) {
                            e11.printStackTrace();
                            break;
                        }
                    case 2:
                        try {
                            v.a().f25198c = Long.parseLong(str);
                            break;
                        } catch (NumberFormatException e12) {
                            e12.printStackTrace();
                            break;
                        }
                    case 3:
                        try {
                            v.a().f25199d = Long.parseLong(str);
                            break;
                        } catch (NumberFormatException e13) {
                            e13.printStackTrace();
                            break;
                        }
                    case 4:
                        try {
                            v.a().f25202g = Integer.parseInt(str);
                            break;
                        } catch (NumberFormatException e14) {
                            e14.printStackTrace();
                            break;
                        }
                    case 5:
                        try {
                            v.a().f25200e = Integer.parseInt(str);
                            break;
                        } catch (NumberFormatException e15) {
                            e15.printStackTrace();
                            break;
                        }
                    case 6:
                        try {
                            v.a().f25201f = Integer.parseInt(str);
                            break;
                        } catch (NumberFormatException e16) {
                            e16.printStackTrace();
                            break;
                        }
                    case 7:
                        try {
                            v.a().f25203h = Integer.parseInt(str);
                            break;
                        } catch (NumberFormatException e17) {
                            e17.printStackTrace();
                            break;
                        }
                    default:
                        switch (i10) {
                            case TTAdConstant.MATE_VALID /* 200 */:
                                v.a().f25205j = str;
                                break;
                            case 201:
                                v.a().f25207l = str;
                                break;
                            case 202:
                                v.a().f25206k = str;
                                break;
                            case 203:
                                try {
                                    v.a().f25204i = Integer.parseInt(str);
                                    break;
                                } catch (NumberFormatException e18) {
                                    e18.printStackTrace();
                                    break;
                                }
                            case 204:
                                v.a().R = str.trim().toUpperCase();
                                break;
                            case 205:
                                try {
                                    v.a().S = Integer.parseInt(str.trim());
                                    break;
                                } catch (NumberFormatException e19) {
                                    e19.printStackTrace();
                                    break;
                                }
                            case 206:
                                try {
                                    v.a().T = Integer.parseInt(str.trim());
                                    break;
                                } catch (NumberFormatException e20) {
                                    e20.printStackTrace();
                                    break;
                                }
                            case 207:
                                try {
                                    v.a().U = Integer.parseInt(str.trim());
                                    break;
                                } catch (NumberFormatException e21) {
                                    e21.printStackTrace();
                                    break;
                                }
                            case 208:
                                try {
                                    v.a().V = Integer.parseInt(str.trim());
                                    break;
                                } catch (NumberFormatException e22) {
                                    e22.printStackTrace();
                                    break;
                                }
                            case 209:
                                try {
                                    v.a().W = Integer.parseInt(str.trim());
                                    break;
                                } catch (NumberFormatException e23) {
                                    e23.printStackTrace();
                                    break;
                                }
                        }
                }
            } else {
                try {
                    v.a().P = Integer.parseInt(str);
                } catch (NumberFormatException e24) {
                    e24.printStackTrace();
                }
            }
        }
        v.a().getClass();
    }

    @Override // uf.i
    public final void V() {
        Button button = (Button) findViewById(R.id.btn_save_data);
        findViewById(R.id.btn_intent_main).setOnClickListener(new xf.r(this, 0));
        button.setVisibility(View.VISIBLE);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_test);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q(w.n("t7fG5fOml7jH56OGp7zs5_-XHObfgK-wtuaitpiV3u_tiJGv4ufWkq28uu_-mg==", "95qaG4Ta"), 0, n.h(new StringBuilder(), v.a().f25196a, "")));
        arrayList.add(new q(w.n("t7fG5fOml7jH56OGp7zs5_-XHObfgK-k7ubQtqWV6O_tiJGv4ufWkq28uu_-mg==", "IGLWs53c"), 1, n.h(new StringBuilder(), v.a().f25197b, "")));
        arrayList.add(new q(w.n("t7fG5fOml7jH56OGp7zs5_-XHOXnsaK0xOnKjZ-vxOnGtJ6a3e_NiKSvmOflkrq83O-Nmg==", "aMwQaFX4"), 2, n.h(new StringBuilder(), v.a().f25198c, "")));
        arrayList.add(new q(w.n("GnAnbgxkY-XDoIO9z-aogKCkkeb-tpCV_e_xiJWv_efSkq28xO_ymg==", "pDmmBMsV"), 3, n.h(new StringBuilder(), v.a().f25199d, "")));
        arrayList.add(new q(w.n("PnASbghkXOXIoNu9_-nCtLyapebUtqOV9e_PiICnou_tiZi8mg==", "Jsg0sFyy"), 20, a.a.q(new StringBuilder(), v.a().P, "")));
        arrayList.add(new q(w.n("nJbq56eo0ojvLRVwOWFAaB3l-pWIr4npx7VY5bygor3H5saA1J-Z5s-2j5fh74-I1afU79GJ2rya", "cHzZ34rV"), 4, a.a.q(new StringBuilder(), v.a().f25202g, "")));
        arrayList.add(new q(w.n("t7fG5fOml7jH56OGpIn-5tqPHOj1hayX1-avtpiX3Si2p-Upprya", "a8qig068"), 5, a.a.q(new StringBuilder(), v.a().f25200e, "")));
        arrayList.add(new q(w.n("v4_n5YaP3bnn5feKsLGm55a6oJfb6aK0j5fM6ayUYuf-klzvi5o=", "hhYu78EN"), 6, a.a.q(new StringBuilder(), v.a().f25201f, "")));
        arrayList.add(new q(w.n("k4nC6dGAq4bM5caYl6ST5fWPHk1A78Wa", "WTRgzodp"), 7, a.a.q(new StringBuilder(), v.a().f25203h, "")));
        arrayList.add(new q(w.n("vpbo5-Wosojv5dqVsK-P6ZO1ZuXDntyq6uX4vNm8wkF0QnREFGa7vNHv2po=", "3GXXqTL2"), 11, r.a(this)));
        arrayList.add(new q(w.n("EmEubChyNzKshu7m_Kjcr-jonoCAhfTn0665vJo=", "D3kxnVbx"), TTAdConstant.MATE_VALID, v.a().f25205j));
        arrayList.add(new q(w.n("TmkDZyB0kobd5uiova-e6JqAr4Xg54iuibya", "T99gEwUe"), 201, v.a().f25207l));
        arrayList.add(new q(w.n("tbjM6O-Bl5v25qWwpYnd5sms2IXO5_eueVtoMmMzVSxlNCrv9Zo=", "CZOfatnX"), 202, v.a().f25206k));
        arrayList.add(new q(w.n("uJ_E6O6GmKLT5qWHprvj5tyr14_M5sO5g4fc6MSjr57B5uKwoIf-7_6a", "jScIiTqh"), 203, v.a().f25206k));
        arrayList.add(new q(w.n("ua7V6dGFl4z_56aZp67L6f-M1ID_KAtCDkRoLIOL_uXelpKk-OjFpW7os4GllP3m3bcZby9kYzo=", "MAewaxH3"), 204, v.a().R));
        arrayList.add(new q(w.n("n66U6faFqozl5_OZsK6t6ZiMZun4v9CB-uftmdCX_Oniv9m85nOjvNHv2po=", "vPw6nL9e"), 205, a.a.q(new StringBuilder(), v.a().S, "")));
        arrayList.add(new q(w.n("na7g6dWFqIz05_6Zl66q6e-MFmwGYR1pI2eKnOPpw7-Tl_Tp2rShvMFzhLz774ia", "IrzfMlcV"), 206, a.a.q(new StringBuilder(), v.a().T, "")));
        arrayList.add(new q(w.n("na7g6dWFqIz05_6Zl66q6e-MFuXpkpGu0-b4tp6A-ObitquV8u_yiDrv14mdvJo=", "sRunroxC"), 207, a.a.q(new StringBuilder(), v.a().U, "")));
        arrayList.add(new q(w.n("rICx5f-6l4zl5_OZsK6t6ZiMo7z45Zq8gJz45ZKar4f_57-wnqzQ5s2wibya", "3GE1xqCR"), 208, a.a.q(new StringBuilder(), v.a().V, "")));
        arrayList.add(new q(w.n("nIDC5cq6qIz05_6Znby45fSV0aTT6e60npr_7-mIWWkb7_6MpLvW6OekWTRYNgTv-YnZvJo=", "ZttuwkU4"), 209, a.a.q(new StringBuilder(), v.a().W, "")));
        u uVar = new u(arrayList);
        this.f14293j = uVar;
        recyclerView.setAdapter(uVar);
        button.setOnClickListener(new xf.r(this, 1));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_test_deep_clean;
    }

    @Override // uf.i
    public final void Z() {
    }

    @Override // androidx.activity.i, android.app.Activity
    public final void onBackPressed() {
    }
}
