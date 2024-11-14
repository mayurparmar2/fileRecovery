package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import cj.w;
import filerecovery.photosrecovery.allrecovery.o;
import og.a;

/* loaded from: classes2.dex */
public final class StrikeThroughTextView extends AppCompatTextView {

    /* renamed from: h, reason: collision with root package name */
    public int f14650h;

    /* renamed from: i, reason: collision with root package name */
    public float f14651i;

    /* renamed from: j, reason: collision with root package name */
    public float f14652j;

    /* renamed from: k, reason: collision with root package name */
    public float f14653k;

    /* renamed from: l, reason: collision with root package name */
    public float f14654l;

    /* renamed from: m, reason: collision with root package name */
    public int f14655m;

    /* renamed from: n, reason: collision with root package name */
    public int f14656n;

    /* renamed from: o, reason: collision with root package name */
    public int f14657o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14658p;

    /* renamed from: q, reason: collision with root package name */
    public float f14659q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f14660r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f14661s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f14662t;

    static {
        w.n("AnQFaSJlJWgwb0ZnKlQweCFWWGV3", "5P9Q63EJ");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrikeThroughTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a.p(context, w.n("Mm8ZdCx4dA==", "P5e9U4mK"));
        w.n("Mm8ZdCx4dA==", "CNLzQLSM");
        this.f14650h = -1;
        this.f14655m = -1;
        this.f14656n = -1;
        this.f14657o = -1;
        Paint paint = new Paint(1);
        this.f14660r = paint;
        this.f14661s = new RectF();
        this.f14662t = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f14349f, 0, 0);
        this.f14650h = obtainStyledAttributes.getColor(2, -1);
        this.f14655m = obtainStyledAttributes.getColor(7, -1);
        this.f14656n = obtainStyledAttributes.getColor(1, -1);
        this.f14657o = obtainStyledAttributes.getColor(5, -1);
        this.f14651i = obtainStyledAttributes.getFloat(4, 0.0f);
        this.f14652j = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f14653k = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f14654l = obtainStyledAttributes.getDimension(6, 0.0f);
        obtainStyledAttributes.recycle();
        float f10 = this.f14651i;
        if (!(f10 == 0.0f)) {
            this.f14651i = f10 % 360.0f;
        }
        float f11 = this.f14652j;
        if (!(f11 == 0.0f)) {
            this.f14652j = f11 % 360.0f;
        }
        int i10 = this.f14650h;
        this.f14658p = i10 == 0;
        if (i10 != -1) {
            paint.setColor(i10);
            if (this.f14658p) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
        }
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
    }

    public final void l(int i10) {
        int i11;
        int i12 = this.f14655m;
        if (i12 == -1 || (i11 = this.f14657o) == -1) {
            return;
        }
        int i13 = this.f14656n;
        this.f14660r.setShader(new LinearGradient(0.0f, 0.0f, (this.f14653k * 2.0f) + ((i10 - getPaddingStart()) - getPaddingEnd()), 0.0f, i13 != -1 ? new int[]{i12, i13, i11} : new int[]{i12, i11}, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        a.p(canvas, w.n("FmEsdixz", "IDXZEVKK"));
        super.onDraw(canvas);
        boolean z6 = this.f14652j == 0.0f;
        Paint paint = this.f14660r;
        if (z6) {
            if (this.f14654l > 0.0f) {
                canvas.save();
                float f10 = this.f14651i;
                RectF rectF = this.f14661s;
                canvas.rotate(f10, rectF.centerX(), rectF.centerY());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                return;
            }
            return;
        }
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float f11 = this.f14652j * lineCount;
            float f12 = this.f14659q;
            for (int i10 = 0; i10 < lineCount; i10++) {
                if (f12 < layout.getLineWidth(i10)) {
                    f12 = layout.getLineWidth(i10);
                }
            }
            boolean z10 = f12 == this.f14659q;
            RectF rectF2 = this.f14662t;
            if (!z10) {
                this.f14659q = f12;
                rectF2.set(((getMeasuredWidth() - f12) / 2.0f) - this.f14653k, (getMeasuredHeight() - this.f14654l) / 2.0f, ((getMeasuredWidth() + f12) / 2.0f) + this.f14653k, (getMeasuredHeight() + this.f14654l) / 2.0f);
                l((int) f12);
            }
            canvas.save();
            canvas.rotate(f11, rectF2.centerX(), rectF2.centerY());
            canvas.drawRect(rectF2, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            l(i10);
        }
        if (this.f14654l > 0.0f) {
            float f10 = i11;
            this.f14661s.set(getPaddingStart() - this.f14653k, (f10 - this.f14654l) / 2.0f, (i10 - getPaddingEnd()) + this.f14653k, (f10 + this.f14654l) / 2.0f);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }
}
