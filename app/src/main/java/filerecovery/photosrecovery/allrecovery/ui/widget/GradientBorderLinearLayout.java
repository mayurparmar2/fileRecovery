package filerecovery.photosrecovery.allrecovery.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.demo.example.R;
import og.a;

/* loaded from: classes2.dex */
public class GradientBorderLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public Paint f14561a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f14562b;

    /* renamed from: c, reason: collision with root package name */
    public int f14563c;

    /* renamed from: d, reason: collision with root package name */
    public int f14564d;

    /* renamed from: e, reason: collision with root package name */
    public int f14565e;

    /* renamed from: f, reason: collision with root package name */
    public int f14566f;

    /* renamed from: g, reason: collision with root package name */
    public int f14567g;

    /* renamed from: h, reason: collision with root package name */
    public int f14568h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f14569i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f14570j;

    public GradientBorderLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14563c = 10;
        this.f14564d = 20;
        this.f14565e = -1;
        this.f14569i = new RectF();
        this.f14570j = new RectF();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f14561a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f14561a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f14562b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f14564d = getContext().getResources().getDimensionPixelOffset(R.dimen.dp_20);
        this.f14566f = getContext().getResources().getColor(R.color.color_10_78879D);
        this.f14567g = getContext().getResources().getColor(R.color.color_100_0283FF_02B3FF);
        this.f14568h = getContext().getResources().getColor(R.color.color_100_1D36FF_1D6AFF);
        a();
    }

    public final void a() {
        if (isSelected()) {
            this.f14563c = getContext().getResources().getDimensionPixelSize(R.dimen.dp_3);
            this.f14565e = getContext().getResources().getColor(R.color.color_80_EAF4FF_20_104C8E);
        } else {
            this.f14563c = getContext().getResources().getDimensionPixelSize(R.dimen.dp_1);
            this.f14565e = getContext().getResources().getColor(R.color.color_50_EAF4FF_7_white);
        }
        this.f14561a.setStrokeWidth(this.f14563c);
        this.f14562b.setColor(this.f14565e);
        b();
    }

    public final void b() {
        LinearGradient linearGradient;
        if (isSelected()) {
            linearGradient = a.c0(getContext()) ? new LinearGradient(0.0f, getHeight(), getWidth(), 0.0f, this.f14568h, this.f14567g, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, getHeight(), getWidth(), 0.0f, this.f14567g, this.f14568h, Shader.TileMode.CLAMP);
        } else {
            float height = getHeight();
            float width = getWidth();
            float height2 = getHeight();
            int i10 = this.f14566f;
            linearGradient = new LinearGradient(0.0f, height, width, height2, i10, i10, Shader.TileMode.CLAMP);
        }
        this.f14561a.setShader(linearGradient);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f14569i;
        int i10 = this.f14563c;
        rectF.set(i10 / 2.0f, i10 / 2.0f, getWidth() - (this.f14563c / 2.0f), getHeight() - (this.f14563c / 2.0f));
        int i11 = this.f14564d;
        canvas.drawRoundRect(rectF, i11, i11, this.f14562b);
        RectF rectF2 = this.f14570j;
        int i12 = this.f14563c;
        rectF2.set(i12 / 2.0f, i12 / 2.0f, getWidth() - (this.f14563c / 2.0f), getHeight() - (this.f14563c / 2.0f));
        int i13 = this.f14564d;
        canvas.drawRoundRect(rectF2, i13, i13, this.f14561a);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f14565e = i10;
        this.f14562b.setColor(i10);
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.f14563c = i10;
        this.f14561a.setStrokeWidth(i10);
        invalidate();
    }

    public void setCornerRadius(int i10) {
        this.f14564d = i10;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z6) {
        super.setSelected(z6);
        a();
        invalidate();
    }
}
