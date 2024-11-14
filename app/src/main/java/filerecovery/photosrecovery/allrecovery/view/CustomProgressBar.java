package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.o;
import og.a;

/* loaded from: classes2.dex */
public class CustomProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f14630a;

    /* renamed from: b, reason: collision with root package name */
    public float f14631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14632c;

    /* renamed from: d, reason: collision with root package name */
    public int f14633d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14634e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14635f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14636g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14637h;

    /* renamed from: i, reason: collision with root package name */
    public final float f14638i;

    /* renamed from: j, reason: collision with root package name */
    public final float f14639j;

    /* renamed from: k, reason: collision with root package name */
    public float f14640k;

    /* renamed from: l, reason: collision with root package name */
    public float f14641l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f14642m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f14643n;

    public CustomProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14631b = 0.0f;
        this.f14632c = 100;
        this.f14633d = getResources().getColor(R.color.color_15_ffffff);
        this.f14642m = new Path();
        this.f14643n = new RectF();
        this.f14634e = a.c0(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o.f14347d, 0, 0);
        this.f14635f = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f14636g = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f14637h = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f14638i = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f14639j = obtainStyledAttributes.getDimension(1, 0.0f);
        this.f14633d = obtainStyledAttributes.getColor(2, this.f14633d);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f14630a = paint;
        paint.setAlpha(255);
        this.f14630a.setStyle(Paint.Style.FILL);
        this.f14630a.setDither(true);
        this.f14630a.setAntiAlias(true);
    }

    public float getProgress() {
        return this.f14631b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f14643n;
        rectF.set(0.0f, 0.0f, this.f14640k, this.f14641l);
        Path path = this.f14642m;
        float f10 = this.f14635f;
        if (f10 != 0.0f) {
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else {
            float f11 = this.f14636g;
            float f12 = this.f14637h;
            float f13 = this.f14639j;
            float f14 = this.f14638i;
            path.addRoundRect(rectF, new float[]{f11, f11, f12, f12, f13, f13, f14, f14}, Path.Direction.CW);
        }
        canvas.clipPath(path);
        super.onDraw(canvas);
        this.f14630a.setColor(this.f14633d);
        float f15 = (this.f14631b / this.f14632c) * this.f14640k;
        if (this.f14634e) {
            canvas.drawRect(getWidth() - f15, 0.0f, getWidth(), this.f14641l, this.f14630a);
        } else {
            canvas.drawRect(0.0f, 0.0f, f15, this.f14641l, this.f14630a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14640k = getWidth();
        this.f14641l = getHeight();
    }

    public void setColorProgress(int i10) {
        this.f14633d = i10;
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || this.f14631b == f10) {
            return;
        }
        int i10 = this.f14632c;
        if (f10 >= i10) {
            f10 = i10;
        }
        this.f14631b = f10;
        postInvalidate();
    }
}
