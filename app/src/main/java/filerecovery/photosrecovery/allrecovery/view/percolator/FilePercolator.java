package filerecovery.photosrecovery.allrecovery.view.percolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.w;
import com.android.lib.libbase.zjview.CustomRoundImageView;
import com.demo.example.R;
import java.util.ArrayList;
import nh.b;
import rh.a;
import rh.e;
import th.d;
import th.f;
import th.g;
import y1.s;

/* loaded from: classes2.dex */
public class FilePercolator extends ConstraintLayout implements View.OnClickListener {
    public CustomRoundImageView A;
    public View B;
    public int C;

    /* renamed from: q, reason: collision with root package name */
    public d f14663q;

    /* renamed from: r, reason: collision with root package name */
    public e f14664r;

    /* renamed from: s, reason: collision with root package name */
    public Context f14665s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14666t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f14667u;

    /* renamed from: v, reason: collision with root package name */
    public RelativeLayout f14668v;

    /* renamed from: w, reason: collision with root package name */
    public long f14669w;

    /* renamed from: x, reason: collision with root package name */
    public long f14670x;

    /* renamed from: y, reason: collision with root package name */
    public long f14671y;

    /* renamed from: z, reason: collision with root package name */
    public f f14672z;

    public FilePercolator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.C = -1;
        View.inflate(context, R.layout.view_percolator, this);
        n(context);
    }

    public final void m(int i10, g gVar, f fVar, boolean z6) {
        if (this.f14664r == null) {
            e eVar = new e(this.f14665s, new s(this, gVar, fVar, i10), a.g(w.n("YDlHMGQwQC1yMQ==", "A5TH82sA")), System.currentTimeMillis(), z6);
            this.f14664r = eVar;
            eVar.h();
            this.f14664r.g();
            this.f14664r.i();
            this.f14664r.getClass();
        }
    }

    public void n(Context context) {
        this.f14665s = context;
        this.A = (CustomRoundImageView) findViewById(R.id.iv_bg_flg);
        this.B = findViewById(R.id.view_line);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rly_customize_day);
        this.f14668v = relativeLayout;
        relativeLayout.setVisibility(View.GONE);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_content);
        TextView textView = (TextView) findViewById(R.id.tv_start_day);
        this.f14666t = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.tv_end_day);
        this.f14667u = textView2;
        textView2.setOnClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        d dVar = new d(context);
        this.f14663q = dVar;
        recyclerView.setAdapter(dVar);
        setOnClickListener(new j.d(this, 25));
    }

    public final void o(int i10, int i11, f fVar, boolean z6) {
        this.f14672z = fVar;
        if (this.C == i10) {
            setVisibility(View.GONE);
            fVar.dismiss();
            this.C = -1;
            return;
        }
        if (i10 != 10) {
            this.f14668v.setVisibility(View.GONE);
        } else if (this.f14669w == 0 || this.f14670x == 0) {
            this.f14668v.setVisibility(View.GONE);
        } else {
            this.f14668v.setVisibility(View.VISIBLE);
            this.f14666t.setText(a.f(this.f14665s, this.f14669w));
            this.f14667u.setText(a.f(this.f14665s, this.f14670x));
            m(4, new g(204, i11, this.f14665s.getString(R.string.arg)), fVar, z6);
        }
        setVisibility(View.VISIBLE);
        fVar.show();
        this.C = i10;
        ArrayList T = b.T(this.f14665s, i10, i11);
        d dVar = this.f14663q;
        dVar.f22080d = new c2.b(10, this, fVar, z6);
        ArrayList arrayList = dVar.f22079c;
        arrayList.clear();
        arrayList.addAll(T);
        dVar.j();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar;
        int id2 = view.getId();
        if (id2 == R.id.tv_start_day) {
            e eVar2 = this.f14664r;
            if (eVar2 != null) {
                eVar2.k(1, this.f14669w, 0L);
                return;
            }
            return;
        }
        if (id2 != R.id.tv_end_day || (eVar = this.f14664r) == null) {
            return;
        }
        eVar.k(2, this.f14670x, this.f14669w);
    }
}
