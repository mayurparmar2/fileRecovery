package filerecovery.photosrecovery.allrecovery.ui.act;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.c;
import bh.g;
import cj.w;
import com.gyf.immersionbar.e;
import dg.a;
import com.demo.example.R;
import java.nio.charset.Charset;
import java.util.Arrays;
import tg.b;
import uf.d;
import y9.m;
import yg.o0;

/* loaded from: classes2.dex */
public class WhiteListActivity extends d {

    /* renamed from: r, reason: collision with root package name */
    public ScrollView f14531r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f14532s;

    /* renamed from: t, reason: collision with root package name */
    public g f14533t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f14534u;

    /* renamed from: v, reason: collision with root package name */
    public ConstraintLayout f14535v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14536w;

    @Override // uf.i
    public final void V() {
        this.f14535v = (ConstraintLayout) findViewById(R.id.white_cl_root);
        this.f14531r = (ScrollView) findViewById(R.id.white_scroll_empty_view);
        this.f14532s = (RecyclerView) findViewById(R.id.white_rv_list);
        this.f14534u = (TextView) findViewById(R.id.white_tv_clean_now);
        TextView textView = (TextView) findViewById(R.id.white_tv_content);
        ((TextView) findViewById(R.id.tv_title)).setText(a.q0(getString(R.string.arg)));
        String n10 = w.n("LmYuZ10=", "jlfCOEFT");
        String format = String.format(getString(R.string.arg), n10);
        SpannableString spannableString = new SpannableString(format);
        Drawable drawable = getDrawable(R.drawable.ic_clean_cache_whitelist_open);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_20);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString.setSpan(new ImageSpan(drawable), format.indexOf(n10), n10.length() + format.indexOf(n10), 17);
        textView.setText(spannableString);
        findViewById(R.id.iv_back).setOnClickListener(new o0(this, 0));
        this.f14534u.setOnClickListener(new o0(this, 1));
    }

    @Override // uf.i
    public final int W() {
        return R.layout.activity_white_list;
    }

    @Override // uf.i
    public final void Y(e eVar) {
        if (new com.gyf.immersionbar.a(this).f11981b) {
            eVar.e();
        }
        eVar.c();
        eVar.m(!this.f22860d);
    }

    @Override // uf.i
    public final void Z() {
        this.f14532s.setLayoutManager(new LinearLayoutManager(1));
        g gVar = new g(this);
        this.f14533t = gVar;
        gVar.f2696f = new c(this);
        this.f14532s.setAdapter(gVar);
        b.j().P(new m(this, 28));
    }

    @Override // uf.d
    public final int j0() {
        return 5;
    }

    @Override // uf.d
    public final Intent k0() {
        return new Intent(this, (Class<?>) WhiteListActivity.class);
    }

    @Override // uf.d
    public final boolean l0() {
        boolean z6 = this.f14536w;
        this.f14536w = false;
        return z6;
    }

    @Override // uf.d
    public final void m0() {
        ah.a.z0(this, 5, false);
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100) {
            b.j().P(new m(this, 28));
        }
    }

    @Override // uf.d, uf.i, androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        super.onCreate(bundle);
        try {
            String substring = ge.a.b(this).substring(1115, 1146);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "3f33a18f37eeb23dd311b468cd38d62".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            if (System.currentTimeMillis() % 2 == 0) {
                int c11 = ge.a.f15019a.c(bytes.length / 2);
                int i10 = 0;
                while (true) {
                    if (i10 > c11) {
                        c10 = 0;
                        break;
                    } else {
                        if (bytes[i10] != bytes2[i10]) {
                            c10 = 16;
                            break;
                        }
                        i10++;
                    }
                }
                if ((c10 ^ 0) != 0) {
                    ge.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                ge.a.a();
                throw null;
            }
            nd.a.c(this);
        } catch (Exception e10) {
            e10.printStackTrace();
            ge.a.a();
            throw null;
        }
    }
}
