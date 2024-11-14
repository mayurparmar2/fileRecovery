package filerecovery.photosrecovery.allrecovery.debugmodule;

import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.w;
import com.bytedance.sdk.openadsdk.TTAdConstant;

import eh.m;
import com.demo.example.R;
import j.d;
import java.util.ArrayList;
import l.g;
import ua.b;
import uf.i;
import w5.a;
import yf.r;
import yf.t;
import yf.v;
import yf.x;

/* loaded from: classes2.dex */
public class TestDeepCleanActivity extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f14286o = 0;

    /* renamed from: j, reason: collision with root package name */
    public m f14287j;

    /* renamed from: k, reason: collision with root package name */
    public r f14288k;

    /* renamed from: l, reason: collision with root package name */
    public x f14289l;

    /* renamed from: m, reason: collision with root package name */
    public v f14290m;

    /* renamed from: n, reason: collision with root package name */
    public t f14291n;

    public static ArrayList f0(TestDeepCleanActivity testDeepCleanActivity) {
        testDeepCleanActivity.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 10; i10++) {
            wf.i iVar = new wf.i();
            iVar.f24710e = 89898878L;
            iVar.f24706a = w.n("AWUxdCg=", "bwMQojxn") + i10 + w.n("Yi4kZGY=", "eMKT49yZ");
            iVar.f24707b = w.n("AWUxdGJ0K3M9Lx9lAXQo", "gLXd13GM") + i10 + w.n("XC4yZGY=", "Ll1KWimV");
            iVar.f24720o = w.n("OGRm", "cjHQIcHs");
            iVar.f24721p = w.n("CHAzbA5jEnQxbwgvJWRm", "8dICgsgH");
            iVar.f24709d = 100000L;
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public static wf.i g0() {
        wf.i iVar = new wf.i();
        iVar.f24710e = 89898878L;
        iVar.f24706a = w.n("JWUEdGdtATQ=", "bDafq2PD");
        iVar.f24707b = w.n("EG4TciZpFS8mYUdhbS8hZSZ0H20zNA==", "4bHxspNa");
        iVar.f24709d = 100000L;
        iVar.f24717l = 100000;
        return iVar;
    }

    public static void h0(TestDeepCleanActivity testDeepCleanActivity, int i10) {
        if (testDeepCleanActivity.f14290m == null) {
            testDeepCleanActivity.f14290m = new v(testDeepCleanActivity);
        }
        v vVar = testDeepCleanActivity.f14290m;
        vVar.f25675t = i10;
        vVar.f25676u = 10;
        vVar.f25672q = new a(testDeepCleanActivity, 27);
        b.n(testDeepCleanActivity, vVar);
    }

    @Override // uf.i
    public final void V() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_test);
        findViewById(R.id.btn_intent_main).setOnClickListener(new d(this, 12));
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xf.m(w.n("SD1_PXDjzpChgf_nwbvQuv_mt6KMpPTj6ZHUqOPl7peSm_rlyLNzPXQ9PQ==", "tPDYi2Bs"), -4));
        arrayList.add(new xf.m(w.n("p4Dj6Za1jp364-aRvbeA6I-so4jd6LSUgbPD5Iy6rIHm5deN3qHS6cWi", "hFDs7gxe"), 600));
        arrayList.add(new xf.m(w.n("roDY5bKfsYPl4-aRs7i255u6o6Tq5I69gJb_5I22", "R2MH8Y3A"), 601));
        arrayList.add(new xf.m(w.n("SD1_PXDjzpAeaAp0AUFEcKO2vubor5-BxOXSjYGA2Obdoaed2ufVuKyF2D1PPQk9", "jDuzfvbI"), -4));
        arrayList.add(new xf.m(w.n("soDnVQDj8ZGnvInlyra9v87ltKUUaCt0PEE7cLy22ubQr5GB6-XVjWrmr6qnrtzo9oVGYae51eXAr6O_weXXpSk=", "OKZRkzQ0"), 400));
        arrayList.add(new xf.m(w.n("soDn5tSDmJnS47ORp47u58Gz2a_04sqcgr_-5tW7vp3S6e6Qq4Ds4sKd", "fcaXHljN"), TTAdConstant.MATE_IS_NULL_CODE));
        arrayList.add(new xf.m(w.n("soDn5tSDmJnS47ORp47u58Gz2a_04sqcvIfQ5fevtYr55uqDoJnh4sKd0YCd", "TzgPLT0a"), TTAdConstant.AD_ID_IS_NULL_CODE));
        arrayList.add(new xf.m(w.n("i4Dh5q-DkJnI4-aRsI6I56azrq_a4rWcMWgZdEVBOnBHTRRkW2GcpM7n266znbDpq5A=", "RChq2yEp"), TTAdConstant.DEEPLINK_UNAVAILABLE_CODE));
        arrayList.add(new xf.m(w.n("soDn5Paul5T747ORq4fY5-iu1bj56eyW06yT6Oyb3YX0Vzbm4aGUnZc=", "52S80MHI"), TTAdConstant.DEEPLINK_FALLBACK_CODE));
        arrayList.add(new xf.m(w.n("loDSVQTjzpGht9joz6zRiPVXd-XVlZyv-enwtQ==", "NGcMEQKm"), TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE));
        arrayList.add(new xf.m(w.n("joCp5fW5sarP4-aRsLGm55a6MWFNbVBkD2GenbXp05CIvKzl5ryzvOHnzJc=", "9Em9IVn6"), TTAdConstant.LANDING_PAGE_TYPE_CODE));
        arrayList.add(new xf.m(w.n("loDS5fG5qare4-uRl7Gh5-G6QWFJ5uWq1K7x6OqFsIvT5sqqqLz35-OX", "BAzD1xIV"), TTAdConstant.DOWNLOAD_APP_INFO_CODE));
        arrayList.add(new xf.m(w.n("p4D1VSbjzJGwt9Xo6KzWiILp35CIiIPoybSemLjp67U=", "IqDeoLps"), TTAdConstant.DOWNLOAD_URL_CODE));
        arrayList.add(new xf.m(w.n("loDS5tCDp5nZ4-uRlZSH6Oq334Dz5-alt5up5aSsn5326duQ", "nwjDP84y"), TTAdConstant.IMAGE_LIST_CODE));
        arrayList.add(new xf.m(w.n("1YCndBxhPnS7gPd3NOW7oNuZ4ublkNCK-eb3kNGkug==", "Ro67sMg7"), TTAdConstant.IMAGE_LIST_SIZE_CODE));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJ3I-Tti729jObLkK-K0eb5kJakug==", "Nvq7iSIF"), TTAdConstant.IMAGE_CODE));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPp3E-SMi629i-XNsZG0zubfkKWkug==", "hZFikPBf"), TTAdConstant.IMAGE_URL_CODE));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORp7HA5_G6RmFj5cyF1a2r5O2Ngbbi5M-Lob3M5eax27Tn5em5sqqX", "03Uitlsg"), TTAdConstant.VIDEO_INFO_CODE));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORp7HA5_G6V2kvZWrlw4WhrezkiI25tsTmyKKUpM_ll7GqtPDl6bnWqpc=", "EDt0DNMV"), TTAdConstant.VIDEO_URL_CODE));
        arrayList.add(new xf.m(w.n("oYD16cSanZ_95saPtoCi5pqhoIvyY11hEubOiNCB5ejgq4CI5CCTgMLn-aWzoI8=", "BoBeDz47"), TTAdConstant.VIDEO_COVER_URL_CODE));
        arrayList.add(new xf.m(w.n("loDS6c2aqZ_s5suPkYCl5u2h0Iv2bRxkDmGqtubm6a-dounlxaBu6cmajJ_X5pSP", "mngZgLnh"), 416));
        arrayList.add(new xf.m(w.n("loDS6c2aqZ_s5suPkYCl5u2h0Iv2dxggKWU1aS_m8Lmch83lxaCnme0oj7_v6JuBoK2u5euonJLI6dGaqZ_c5tWPpZvc5d6sr53o6euQ0bf36Li3jI_vKQ==", "hN1eDQNy"), 417));
        arrayList.add(new xf.m(w.n("soDn6cmalp_n5pOPoYDE5v2h14vcdysgO2hUdJS26-bQr5GJ8On2j6eIk-nbpH3k6p3Zr8Ll55i9gp3l4IyKgMvn6KWvoP7n2ZHWkO7myIO8maHl9LKiju_lupYp", "X5rcXZ2f"), 418));
        arrayList.add(new xf.m(w.n("bD1KPXTj8ZCklrTm46O2gMTmsKKmpMfm7KGCnaXnz7i0hcQ9dD1MPQ==", "Dg2TSQXD"), -4));
        arrayList.add(new xf.m(w.n("soDn5t-Hl6Hh47ORb-bcq7OPvuXtjKyI3y2jl-LmzLC3jdnp6LU=", "OEBYl5Sf"), 100));
        arrayList.add(new xf.m(w.n("soDn5t-Hl6Hh47ORb-bDh7G7h-Xnua278ub4nKKh0y20jeLm3LA=", "afKf9ogp"), 101));
        arrayList.add(new xf.m(w.n("soDn5t-Hl6Hh47ORb-bDh7G7h-Xnua27-ObcnI2h0y20pPrm3LA=", "kBdfwA0h"), 102));
        arrayList.add(new xf.m(w.n("soDn5t-Hl6Hh47ORb-bDh7G7h-bCoq-kyOXXjLWI0unwtQ==", "EySBt8iY"), FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT));
        arrayList.add(new xf.m(w.n("loDS5tuHqKHq4-uRX-aih6G7gOXhoJCZ4uWWjJKI-enUtQ==", "RPchF8ti"), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION));
        arrayList.add(new xf.m(w.n("q4DR5vyHo6H74-aReOalh9a78OjCptOD4-nZtdm8wuXYhKan5-blvL286Sk=", "P4HAjEBJ"), FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKLm8KGznNzlvq-nu-_m-5OJvO7nwYu0uvjmxpCWpLo=", "rlniBD9S"), FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE));
        arrayList.add(new xf.m(w.n("loDS5tuHqKHq4-uRX-aih6G7gOXhl5Gh0unqtQ==", "NGDuzKj4"), FacebookMediationAdapter.ERROR_NULL_CONTEXT));
        arrayList.add(new xf.m(w.n("bD1KPXTj8ZCkt4Ll-KazuNDnoYaggNvm3aGBnfDn47i0hcQ9dD1MPQ==", "udgxhasd"), -4));
        arrayList.add(new xf.m(w.n("k7fz5femqLjM5_uGX-a9q6OPueTRrVTpyYC3h9Pm9b2Sldvl8bmooYY=", "TwObIRiy"), 0));
        arrayList.add(new xf.m(w.n("t7fG5fOml7jH56OGb-bcq7OPvuXtjKyIxi3Vl-3m9LC3jdnp6LU=", "V3Ma3C5i"), 1));
        arrayList.add(new xf.m(w.n("tKTQ6O6GmKLTLdWJ6ebaj7CuvebLkGfm9KDWlcnm-664obU=", "c0yvSBQE"), 2));
        arrayList.add(new xf.m(w.n("t4jd5dK-XObLq9WPzeX7jLOIoS2ll-rmxrCgjcbp-7U=", "SFhZTEJY"), 3));
        arrayList.add(new xf.m(w.n("t7fG5fOml7jH56OGb-bthbKQt-XLl6Khy-__iJGDn-XZhpGX6eXvg6ecjenjtbq8iQ==", "cCx7h5tt"), 4));
        arrayList.add(new xf.m(w.n("j7eJ5eimlbjd5_aGeOaLhdWQwOXll92hzi2cuILm3baPlr_k6babp_vp4Yo=", "lAi8RsO9"), 5));
        arrayList.add(new xf.m(w.n("t7jy59mGl6jj5a6Xb-Xxp72nt-nhkWfo7IasoqPo4qa2u4Y=", "KE2M5vzY"), 8));
        arrayList.add(new xf.m(w.n("k7jH592GqKjo5faXX-a8qqCbiC2Mm8fn4oepr_bn8YY=", "RxPskAPJ"), 9));
        arrayList.add(new xf.m(w.n("k7jH592Gq67F5uOQm6GBLTFlW3AGchhyK-bZoK-G7uXbuaqi5ub2ha6Qhg==", "jpBiRNJk"), 10));
        arrayList.add(new xf.m(w.n("kLz45cW2pr_S5e6llIie5d6-0InC5vaPhKG1", "kJT8mWQQ"), 11));
        arrayList.add(new xf.m(w.n("tLzN5cG2mb_Z5balp6Ty6PKG2KLS5sOrno_86dS1", "xsufI52F"), 12));
        arrayList.add(new xf.m(w.n("t7fG5fOml7jH56OGb-Tov7KUmeXCh6y43efxhg==", "Xa8uRQAo"), 13));
        arrayList.add(new xf.m(w.n("k7fz5femqLjM5_uGX-SJv6KUnuf1n5yu0-aMhYmQhg==", "vPOeM4n2"), 14));
        arrayList.add(new xf.m(w.n("SD1_PXA9cz10PVY9Tz3XgNXpl7WAndvo1LOivZ3j55GTqOPl0Jepm_Hl7rNPPQk9eD0LPVQ9PQ==", "cuXmcJ1g"), -4));
        arrayList.add(new xf.m(w.n("soDnVQDj8ZGlm4fmzKW9v87ltKWrrujpoYWgodDv_oi3lsfn3aiXiPXvj4k=", "9IeBaZ46"), 305));
        arrayList.add(new xf.m(w.n("soDnVQDj8ZGlm4fmzKW9v87ltKWrrujp9IWHoe3v9Yi4puHp6LWevIk=", "lnXIPa5T"), 306));
        arrayList.add(new xf.m(w.n("loDSVQTjzpGhv_Dl96XSlvXnoqiPiM7l2pWzr_np1bWavMrm4KOruPHo1JuXhZHv-Yk=", "vj4UfVEt"), 300));
        arrayList.add(new xf.m(w.n("iYCpVQvj-JGwv_3l0KXVloLn0qiLiILoya2QqLbpyomMi5Dp47WXvNDmy6OwuIvojZujhcjviYyAoMHmu66vudXlqIqnuuvo55SDm8vngrvXns3v0Yk=", "wDj9Bxq2"), 302));
        arrayList.add(new xf.m(w.n("rIDRVTvj9JG_m9Lm26Xbv6nlw6U25qOwgYnw5qqsF-bZsKaU2ub8t7288-X6vNqhtQ==", "PrOArtqQ"), 303));
        arrayList.add(new xf.m(w.n("loDSVQTjzpGum9_m_KXcv97ls6Uy6PmBv4n65uisOebjsKWU5ebGt6y8_uXdvN2htQ==", "ptCDXrtd"), 304));
        arrayList.add(new xf.m(w.n("soDnVQDj8ZGqro3n_668oeAt1pn-5dqN1I3C7_SItZfxYQdwprz46eO1", "1WHSmK80"), 7));
        arrayList.add(new xf.m(w.n("loDSVQTjzpGum9_m_KXcv97ls6WPlv7k8LbQp7TpwJGTku_m2b6nobU=", "NnbOK82b"), 307));
        arrayList.add(new xf.m(w.n("loDSVQTjzpGum9_m_KXcv97ls6U-QZGnyOnYkaKSm-bhvquhtQ==", "6nXZNzD6"), 308));
        arrayList.add(new xf.m(w.n("soDnVQDj8ZGlm4fmzKW9v87ltKUUQWpHJ0a2ktnm2r64obU=", "nPtNcwzS"), 309));
        arrayList.add(new xf.m(w.n("bD1KPXQ9TD1_PQ49fz22gMXljbmkqt3j9pGCqJXl5Je2m8_lzLNMPX89Dj1_PWg9PQ==", "vd4y0jtp"), -4));
        arrayList.add(new xf.m(w.n("loDS5fG5qare4-uRm6ai6eS136b_5tWhv4D15eq6lIzI59eZqLz35uiG", "OZ4kVumr"), 6));
        arrayList.add(new xf.m(w.n("u4Db5c25pqrP4-aRMmFfbFdyP-XrhdOOzuXEudGqlw==", "4tXKqAbj"), 16));
        arrayList.add(new xf.m(w.n("gYDj5fm5larP4-aRImlXZ1d0o4bo5ruog7zB55yX", "HxbsErUx"), 17));
        arrayList.add(new xf.m(w.n("loDS5fG5qare4-uRl6Si5_iuZUSMjdjmyYOdmeDl2bmSqpc=", "UkE4Ttpe"), 19));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORp4j16cyk16Di6eCMKG8EZAduVuXtuZCqlw==", "Den154bn"), 22));
        arrayList.add(new xf.m(w.n("2oDi5fG5parP4-aRs4mY5r2PorjA6bWAg4fC5rq9rZWg5c65q6GG", "ZU9rMBVt"), 24));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORpJbS5O621KT65cKXh6Hr6ceAgofr5vu9rpXo5f651aGG", "oCGgaEAD"), 25));
        arrayList.add(new xf.m(w.n("gYDA5fO5sKrP4-aRsIiT6aukoaHD6Jukg7zB5peG", "HJbPOWB7"), 26));
        arrayList.add(new xf.m(w.n("loDS5fG5qare4-uRlr265cOF063x5vaQkqTv5e25jKqX", "6bw4uUQk"), TTAdConstant.MATE_VALID));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORp4r95tWB1Irj5eWGn62H5cCN3JTI6NivoJjK5tSt1rz75_-X", "x9P5lRZZ"), 201));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORq4DP58Go15bE5PG2ta3L5eyob2c-dBhTLHQFaSxn1rz75_-X", "PSnO3SWx"), 20));
        arrayList.add(new xf.m(w.n("soDj5dG50KrP4-aRvYGn54G7orrXINyc5ujegd6B3ufiu5e61-iYu72G_-bIg9qZouX6uYqqlw==", "BhQsm7gk"), 202));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORqoHB5-a71br55e6HoLvXILqc6ej3gZKt0eXzqKSdsOnbkLC87Oeblw==", "DjSi5QQG"), 203));
        arrayList.add(new xf.m(w.n("hYCk5Yu5j6rP4-aRvYGn54G7orrX5ZiYg4LQ5quDo5n26Jar0Yv65ciORmc6dFxTV3QyaQNn0Lzf59KX", "Tdf47hvt"), 204));
        arrayList.add(new xf.m(w.n("loDS5fG5qare4-uRmoGg5_a70rrTYRVseGYbbFYg15326duQqLzb5ea8jrzL556X", "lGsZXr31"), 205));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORp4bQ5-iu1I3E5_Cn1ryI59mX", "31sia5VF"), 206));
        arrayList.add(new xf.m(w.n("soDn6cmalp_n5pOPoYDE5dOF1r3t5tG0l5bo6bSat5_05teP", "qX4PWV0q"), 207));
        arrayList.add(new xf.m(w.n("soDn5fW5lqrV47ORqq736c2F1KTy6P6llLzA58aX", "qylVyvan"), 208));
        arrayList.add(new xf.m(w.n("bD1KPXQ9TD1_PQ49fz22gMV0XmEwdKmA3ubwoYSdr-fKuJKF-j1MPX89Dj1_PWg9", "OXa854CA"), -4));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPrl1pbTvetzUuXkoZ-W8OTdtqCA3Ob-qauU1Ojhr6-P--fWug==", "xsCiwfIU"), 21));
        arrayList.add(new xf.m(w.n("i4DGdDhhRHS7gPfp94Tbp7rp57WIiJXp_6Sej6bn7ro=", "f6hVW7Xn"), 27));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPrp0ITcp83pl7WPgdvllo2Kj8Xn6ro=", "wipm2lUN"), 28));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKLlyoaxuv7mp4enu_zo74eApNt0X2EidJGP2efVug==", "PeA06W3W"), 15));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPpbmoGg5_a70rrTXZyk9-Tyvb6B6-XRjaSI3eXEn6a88ebuidKW9eWUnoa88eXUja-V6O_1iZaAw-nKjaukxO_XiJekuebQsNm84OfjhJiB3efru626ug==", "ehN2pIXI"), 29));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPpbmoGg5_a70rrTXZykyeTSvd6BzuXRjaSI3eXEn6a88ebuidKW9eWUnoa88eXDlY-ViO_QiZaAw-nKjaukxO_XiJeNoebQsNm84OfjhKaB_eeLu4i6ug==", "oizpNi8l"), 30));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPpbmoGg5_a70rrTXZyk9OTYvYOB6-XRjaSI3eXEn6a88ebloNKW9eWUnoa89eX2qIe43-nOjZCkz-jMlKmz8uTRug==", "VAWRsceI"), 31));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJbqoHB5-a71br5Xa-k8-T5vYeB1OX1jZGI2eX7n628qebeibOW5eWTnqy8xubjoKuH7OXSjbmB4-f6u5W6ug==", "tBavqEd9"), 32));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPpbmoGg5_a70rrTXZy34OXMoIWZ9Ob0oqekwOXqsaG0ziiXpLnm0LAp", "gkgLRDlP"), 33));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJbqoHB5-a71br5Xa-34uXaoLuZ7-bQopKkxOXVsaq0liinjcDmwLAp", "PRRKWV5V"), 34));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJbqoHB5-a71br5Xa-3xOX7oLiZxebQopKkxOb5kKeKnw==", "vsQaFihL"), 35));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJbqoHB5-a71br5Xa-k8OTMvZKI-OXbnwNvKHN0", "wwthzhav"), 36));
        arrayList.add(new xf.m(w.n("t4DVdChhH3S7gPdbsIa254-uoJvZ5qOwO-bjtNCW-uTsrWsuLg==", "yHTEGlAx"), 37));
        arrayList.add(new xf.m(w.n("rIDAdAFhKXS7gPdbsIa254-uoJvZ5qOwO-XWid6jz-Xrsbi0pQ==", "xuOPnZHZ"), 38));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJbp4bQ5-iu15v35tywNOfqkZC71OnFmZ-v5ub-kKWkug==", "iWwHKkbS"), 39));
        arrayList.add(new xf.m(w.n("lIDVdDVhRHS7gPdbsIa254-uoJvZ5qOwO-bjtNCW-uXTsa20pQ==", "yewEZ74X"), 40));
        arrayList.add(new xf.m(w.n("q4DedFlhI3S7gPdbva6R6aqFG-jDotyY4-bwkNOK1ebHkKmkug==", "8tHN6PUP"), 41));
        arrayList.add(new xf.m(w.n("soDndCZhAnShgKJbqq736c2FbOjtoqOY1eXLsa20x-bekJCkug==", "PoEbG0yo"), 42));
        arrayList.add(new xf.m(w.n("loDSdCJhPXSqgPpbmq6W6d2Fa-Xesp672-icor6Y6Ob6kKWkug==", "fVfOT2Wm"), 43));
        arrayList.add(new xf.m(w.n("SD1_PXA9cz10PVY9Tz3XgNXmnqGPi-bj1ZHVqOXl8ZeSm_rlyLNzPXQ9Vj1PPQk9PQ==", "1dLYU3Dl"), -4));
        arrayList.add(new xf.m(w.n("j4DR5uCh1IvH4-aRs6iS5rmfroDs56GogIjP5buHrbrLLKicyOiUgb6d5ujqm9SouePGgg==", "pblAH2hC"), 23));
        arrayList.add(new xf.m(w.n("pYD55tyhq4vH4-aRs6iS5rmfobrS5I2KBXIZc14grIn_6e6Pko_f5d2lEWF1Y1thRubwiIuBrw==", "zCFitMjq"), 500));
        arrayList.add(new xf.m(w.n("loDS5uWhqIvW4-uRlKiV5s6f0r_H5d2Nt5DXIL-JwOnyj6SP3-XLpT5hS2MaYUDm84jQga8=", "BuuoRYYy"), 501));
        arrayList.add(new xf.m(w.n("loDS5uWhqIvW4-uRlImN6cKP0I_75fylVzADMJGd5-j0lKWz9uT0uq2_yubzr9u8zeSJnYGv-Ob6iduB4-f1u5G6-OXLmauF7Ob2g5uZpO_5iQ==", "pQxVf3wF"), 502));
        arrayList.add(new xf.m(w.n("loDS5uWhqIvW4-uRlri06dGu0Ljs59C6lYm45vGJsoHh5_G7qbr07_WIj7_v6JuBo5y_6OiUnrPI5IK6iIbD5fClpJ3O6deQpryJ", "eyWrs8mZ"), 503));
        arrayList.add(new xf.m(w.n("soDnQQ3j8ZEjZF5vICCztd7onpWmpd3k47Zm6eOahpT55uG5r6GI", "XFcavnIo"), 504));
        arrayList.add(new xf.m(w.n("SD1_PXA9cz10PVY9Tz3XgNXmo7CPjdfj2pGBh-vnxK6TlfLmwK6pm_Hl7rNPPQk9eD0LPVQ9PQ==", "sAdUZhfy"), -4));
        arrayList.add(new xf.m(w.n("loDS5tiwqI3n4-uRm4e55_iu34Lp6NaEv7za5_CXj5nl5cq2", "Z2ZcZcZf"), 700));
        arrayList.add(new xf.m(w.n("loDS5tiwqI3n4-uRm4e55_iu06736dOMiZXY5siu", "1gIFohEs"), 701));
        arrayList.add(new xf.m(w.n("soDn5tywl43s47ORqo7i5dqWaubVsK2U5ea7t9yvlOj5gJ6AwOb6qauhhl2nvcbl3I3Urt3p4IyrlYPmua4=", "M349kmaD"), 703));
        arrayList.add(new xf.m(w.n("loDS5tiwqI3n4-uRm4e55_iu36b_6di1rYDI5cCFhL3b5tm0q5b-48mRjrHn55C6o6yX5vywnJLCcz10MmkNZ5K64OfPuaux3OfPug==", "uCBfNXFc"), 704));
        g gVar = new g(2, arrayList);
        gVar.f17545e = new xf.i(this);
        recyclerView.setAdapter(gVar);
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_test_deep_clean;
    }

    @Override // uf.i
    public final void Z() {
    }

    @Override // uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 500) {
            p9.a.q(this, false);
            return;
        }
        if ((i10 != 600 && i10 != 501) || intent == null || intent.getData() == null) {
            return;
        }
        getContentResolver().takePersistableUriPermission(intent.getData(), intent.getFlags() & 3);
        if (i10 == 600) {
            p9.a.q(this, false);
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }
}
