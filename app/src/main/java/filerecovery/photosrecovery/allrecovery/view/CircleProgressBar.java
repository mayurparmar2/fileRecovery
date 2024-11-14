package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import filerecovery.photosrecovery.allrecovery.o;

/* loaded from: classes2.dex */
public class CircleProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f14612a;

    /* renamed from: b, reason: collision with root package name */
    public int f14613b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f14614c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f14615d;

    /* renamed from: e, reason: collision with root package name */
    public int f14616e;

    /* renamed from: f, reason: collision with root package name */
    public int f14617f;

    /* renamed from: g, reason: collision with root package name */
    public float f14618g;

    /* renamed from: h, reason: collision with root package name */
    public float f14619h;

    /* renamed from: i, reason: collision with root package name */
    public float f14620i;

    /* renamed from: j, reason: collision with root package name */
    public int f14621j;

    /* renamed from: k, reason: collision with root package name */
    public int f14622k;

    /* renamed from: l, reason: collision with root package name */
    public int f14623l;

    /* renamed from: m, reason: collision with root package name */
    public int f14624m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f14625n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f14626o;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14612a = 0;
        this.f14613b = 0;
        this.f14623l = 100;
        this.f14625n = new RectF();
        this.f14626o = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o.f14345b, 0, 0);
        this.f14620i = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f14616e = obtainStyledAttributes.getColor(4, -1);
        this.f14617f = obtainStyledAttributes.getColor(3, -1);
        this.f14623l = obtainStyledAttributes.getInteger(1, 0);
        this.f14624m = obtainStyledAttributes.getInteger(2, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f14615d = paint;
        paint.setAntiAlias(true);
        this.f14615d.setColor(this.f14617f);
        this.f14615d.setStyle(Paint.Style.STROKE);
        this.f14615d.setStrokeWidth(this.f14620i);
        Paint paint2 = new Paint();
        this.f14614c = paint2;
        paint2.setAntiAlias(true);
        this.f14614c.setColor(this.f14616e);
        this.f14614c.setStyle(Paint.Style.STROKE);
        this.f14614c.setStrokeWidth(this.f14620i);
        this.f14614c.setStrokeCap(Paint.Cap.ROUND);
        invalidate();
    }

    public int getMax() {
        return this.f14623l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.f14613b / 2;
        this.f14621j = i10;
        int i11 = this.f14612a / 2;
        this.f14622k = i11;
        RectF rectF = this.f14625n;
        float f10 = this.f14619h;
        rectF.set(i10 - f10, i11 - f10, i10 + f10, i11 + f10);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f14615d);
        if (this.f14624m > 0) {
            RectF rectF2 = this.f14626o;
            int i12 = this.f14621j;
            float f11 = this.f14619h;
            int i13 = this.f14622k;
            rectF2.set(i12 - f11, i13 - f11, i12 + f11, i13 + f11);
            canvas.drawArc(rectF2, -90.0f, (this.f14624m / this.f14623l) * 360.0f, false, this.f14614c);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f14612a = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        this.f14613b = measuredWidth;
        if (measuredWidth > this.f14612a) {
            this.f14618g = r3 / 2;
        } else {
            this.f14618g = measuredWidth / 2;
        }
        this.f14619h = this.f14618g - (this.f14620i / 2.0f);
    }

    public void setMax(int i10) {
        this.f14623l = i10;
        postInvalidate();
    }

    public void setProgress(int i10) {
        if (this.f14624m != i10) {
            this.f14624m = i10;
            postInvalidate();
        }
    }
}
