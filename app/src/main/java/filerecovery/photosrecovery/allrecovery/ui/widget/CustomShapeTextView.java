package filerecovery.photosrecovery.allrecovery.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatTextView;
import cj.w;
import com.demo.example.R;
import o0.q;
import og.a;
import x5.b;

/* loaded from: classes2.dex */
public class CustomShapeTextView extends AppCompatTextView {

    /* renamed from: h, reason: collision with root package name */
    public Paint f14546h;

    /* renamed from: i, reason: collision with root package name */
    public Path f14547i;

    /* renamed from: j, reason: collision with root package name */
    public int f14548j;

    /* renamed from: k, reason: collision with root package name */
    public int f14549k;

    /* renamed from: l, reason: collision with root package name */
    public int f14550l;

    /* renamed from: m, reason: collision with root package name */
    public int f14551m;

    /* renamed from: n, reason: collision with root package name */
    public int f14552n;

    /* renamed from: o, reason: collision with root package name */
    public Paint f14553o;

    /* renamed from: p, reason: collision with root package name */
    public Path f14554p;

    /* renamed from: q, reason: collision with root package name */
    public float f14555q;

    /* renamed from: r, reason: collision with root package name */
    public int f14556r;

    /* renamed from: s, reason: collision with root package name */
    public int f14557s;

    /* renamed from: t, reason: collision with root package name */
    public int f14558t;

    /* renamed from: u, reason: collision with root package name */
    public int f14559u;

    public CustomShapeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14555q = 0.25f;
        setLayerType(1, null);
        this.f14546h = new Paint(1);
        this.f14547i = new Path();
        this.f14548j = getContext().getResources().getDimensionPixelSize(R.dimen.dp_5);
        this.f14551m = getContext().getResources().getDimensionPixelSize(R.dimen.dp_6);
        this.f14549k = getContext().getResources().getDimensionPixelSize(R.dimen.dp_2);
        this.f14550l = getContext().getResources().getDimensionPixelSize(R.dimen.dp_1);
        this.f14552n = getContext().getResources().getDimensionPixelSize(R.dimen.dp_8);
        Paint paint = new Paint();
        this.f14553o = paint;
        paint.setAntiAlias(true);
        this.f14553o.setTextSize(getTextSize());
        this.f14553o.setColor(getCurrentTextColor());
        try {
            this.f14553o.setTypeface(q.b(b.a(), R.font.roboto_black));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f14554p = new Path();
        if (a.c0(getContext())) {
            this.f14556r = getPaddingEnd();
            this.f14557s = getPaddingStart();
        } else {
            this.f14556r = getPaddingStart();
            this.f14557s = getPaddingEnd();
        }
        Log.e(w.n("GWkoaSN0L28=", "k1nwXWMX"), w.n("HG4rdHcg", "mMojx2cv") + this.f14556r + "  " + this.f14557s);
        this.f14558t = getPaddingTop();
        this.f14559u = getPaddingBottom();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int height = getHeight();
        int width = getWidth();
        float f10 = height / 2;
        this.f14547i.reset();
        if (a.c0(getContext())) {
            float f11 = width;
            this.f14547i.moveTo(f11, height - this.f14549k);
            float f12 = height;
            this.f14547i.quadTo(f11, f12, width - this.f14549k, f12);
            this.f14547i.lineTo(this.f14548j + f10, f12);
            this.f14547i.cubicTo(0.0f, f12, 0.0f, 0.0f, f10 + this.f14548j, 0.0f);
            float f13 = f11 - f10;
            this.f14547i.lineTo(f13 - this.f14549k, 0.0f);
            this.f14547i.quadTo(this.f14551m + f13, 0.0f, f13 + this.f14552n, f10 - this.f14550l);
            this.f14547i.close();
        } else {
            this.f14547i.moveTo(0.0f, height - this.f14549k);
            float f14 = height;
            this.f14547i.quadTo(0.0f, f14, this.f14549k, f14);
            float f15 = width;
            float f16 = f15 - f10;
            this.f14547i.lineTo(f16 - this.f14548j, f14);
            this.f14547i.cubicTo(f15, f14, f15, 0.0f, f16 - this.f14548j, 0.0f);
            this.f14547i.lineTo(this.f14549k + f10, 0.0f);
            this.f14547i.quadTo(f10 - this.f14551m, 0.0f, f10 - this.f14552n, f10 - this.f14550l);
            this.f14547i.close();
        }
        double d10 = 20.0f;
        this.f14546h.setShader(new LinearGradient(0.0f, 0.0f, (float) (Math.cos(Math.toRadians(d10)) * width), (float) (Math.sin(Math.toRadians(d10)) * height), new int[]{-16744193, -14992129}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f14547i, this.f14546h);
        canvas.restore();
        canvas.save();
        String charSequence = getText().toString();
        if (a.c0(getContext())) {
            this.f14555q = 0.25f;
        } else {
            this.f14555q = -0.25f;
        }
        this.f14553o.setTextSkewX(this.f14555q);
        this.f14554p.reset();
        int height2 = (getHeight() - this.f14558t) - this.f14559u;
        this.f14553o.getTextPath(charSequence, 0, charSequence.length(), this.f14556r, ((height2 / 2) + r1) - ((this.f14553o.ascent() + this.f14553o.descent()) / 2.0f), this.f14554p);
        canvas.drawPath(this.f14554p, this.f14553o);
        canvas.restore();
    }
}
