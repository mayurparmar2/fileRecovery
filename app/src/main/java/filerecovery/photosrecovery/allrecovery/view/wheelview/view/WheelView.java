package filerecovery.photosrecovery.allrecovery.view.wheelview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import cj.w;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l3.j;
import o0.q;
import p7.k;
import u1.a;
import xh.b;

/* loaded from: classes2.dex */
public class WheelView extends View {
    public static final String[] W = {w.n("RTA=", "wlo6DEts"), w.n("RTE=", "hO2udPbr"), w.n("RTI=", "INwelhGy"), w.n("YTM=", "neGNUH0h"), w.n("RTQ=", "pndZctDj"), w.n("YTU=", "XB8ppXja"), w.n("YTY=", "jdlPjSM3"), w.n("YTc=", "BvGoFQl5"), w.n("Uzg=", "UjcHIck6"), w.n("RTk=", "4mYWAcO2")};
    public float A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public long P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final float U;
    public boolean V;

    /* renamed from: a, reason: collision with root package name */
    public final int f14673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14674b;

    /* renamed from: c, reason: collision with root package name */
    public b f14675c;

    /* renamed from: d, reason: collision with root package name */
    public Context f14676d;

    /* renamed from: e, reason: collision with root package name */
    public a f14677e;

    /* renamed from: f, reason: collision with root package name */
    public GestureDetector f14678f;

    /* renamed from: g, reason: collision with root package name */
    public vh.a f14679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14680h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14681i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f14682j;

    /* renamed from: k, reason: collision with root package name */
    public ScheduledFuture f14683k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f14684l;

    /* renamed from: m, reason: collision with root package name */
    public Paint f14685m;

    /* renamed from: n, reason: collision with root package name */
    public Paint f14686n;

    /* renamed from: o, reason: collision with root package name */
    public uh.a f14687o;

    /* renamed from: p, reason: collision with root package name */
    public String f14688p;

    /* renamed from: q, reason: collision with root package name */
    public int f14689q;

    /* renamed from: r, reason: collision with root package name */
    public int f14690r;

    /* renamed from: s, reason: collision with root package name */
    public int f14691s;

    /* renamed from: t, reason: collision with root package name */
    public int f14692t;

    /* renamed from: u, reason: collision with root package name */
    public float f14693u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f14694v;

    /* renamed from: w, reason: collision with root package name */
    public int f14695w;

    /* renamed from: x, reason: collision with root package name */
    public int f14696x;

    /* renamed from: y, reason: collision with root package name */
    public int f14697y;

    /* renamed from: z, reason: collision with root package name */
    public int f14698z;

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14680h = false;
        this.f14681i = true;
        this.f14682j = Executors.newSingleThreadScheduledExecutor();
        this.f14694v = Typeface.MONOSPACE;
        this.A = 1.6f;
        this.J = 11;
        this.N = 0;
        this.O = 0.0f;
        this.P = 0L;
        this.R = 17;
        this.S = 0;
        this.T = 0;
        this.V = false;
        this.f14689q = getResources().getDimensionPixelSize(R.dimen.pickerview_textsize);
        this.f14674b = getResources().getDimensionPixelSize(R.dimen.pickerview_corner_radius);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.U = 2.4f;
        } else if (1.0f <= f10 && f10 < 2.0f) {
            this.U = 4.0f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.U = 6.0f;
        } else if (f10 >= 3.0f) {
            this.U = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f14350g, 0, 0);
            this.R = obtainStyledAttributes.getInt(3, 17);
            this.f14695w = obtainStyledAttributes.getColor(6, -5723992);
            this.f14696x = obtainStyledAttributes.getColor(5, -14013910);
            this.f14697y = obtainStyledAttributes.getColor(1, -2763307);
            this.f14698z = obtainStyledAttributes.getDimensionPixelSize(2, 2);
            this.f14689q = obtainStyledAttributes.getDimensionPixelOffset(7, this.f14689q);
            this.A = obtainStyledAttributes.getFloat(4, this.A);
            this.f14673a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        float f11 = this.A;
        if (f11 < 1.0f) {
            this.A = 1.0f;
        } else if (f11 > 4.0f) {
            this.A = 4.0f;
        }
        this.f14676d = context;
        this.f14677e = new a(this);
        GestureDetector gestureDetector = new GestureDetector(context, new k(this));
        this.f14678f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.B = true;
        this.F = 0.0f;
        this.G = -1;
        Paint paint = new Paint();
        this.f14684l = paint;
        paint.setColor(this.f14695w);
        this.f14684l.setAntiAlias(true);
        this.f14684l.setTextSize(this.f14689q);
        try {
            this.f14684l.setTypeface(q.b(x5.b.a(), R.font.roboto_medium));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Paint paint2 = new Paint();
        this.f14685m = paint2;
        paint2.setColor(this.f14696x);
        this.f14685m.setAntiAlias(true);
        this.f14685m.setTextScaleX(1.1f);
        this.f14685m.setTextSize(this.f14689q);
        try {
            this.f14685m.setTypeface(q.b(x5.b.a(), R.font.roboto_medium));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Paint paint3 = new Paint();
        this.f14686n = paint3;
        paint3.setColor(this.f14697y);
        this.f14686n.setAntiAlias(true);
        setLayerType(1, null);
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "";
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        int intValue = ((Integer) obj).intValue();
        return (intValue < 0 || intValue >= 10) ? String.valueOf(intValue) : W[intValue];
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.f14683k;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f14683k.cancel(true);
        this.f14683k = null;
    }

    public final int c(int i10) {
        return i10 < 0 ? c(((j) this.f14687o).k() + i10) : i10 > ((j) this.f14687o).k() + (-1) ? c(i10 - ((j) this.f14687o).k()) : i10;
    }

    public final void d() {
        if (this.f14687o == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i10 = 0; i10 < ((j) this.f14687o).k(); i10++) {
            String b10 = b(((j) this.f14687o).j(i10));
            this.f14685m.getTextBounds(b10, 0, b10.length(), rect);
            int width = rect.width();
            if (width > this.f14690r) {
                this.f14690r = width;
            }
        }
        this.f14685m.getTextBounds(w.n("t5jo5tWf", "58UtWFui"), 0, 2, rect);
        int height = rect.height() + 2;
        this.f14691s = height;
        float f10 = this.A * height;
        this.f14693u = f10;
        this.K = (int) ((r0 * 2) / 3.141592653589793d);
        this.M = (int) (((int) (f10 * (this.J - 1))) / 3.141592653589793d);
        this.L = View.MeasureSpec.getSize(this.Q);
        float f11 = this.K;
        float f12 = this.f14693u;
        this.C = (f11 - f12) / 2.0f;
        float f13 = (f11 + f12) / 2.0f;
        this.D = f13;
        this.E = (f13 - ((f12 - this.f14691s) / 2.0f)) - this.U;
        if (this.G == -1) {
            if (this.B) {
                this.G = (((j) this.f14687o).k() + 1) / 2;
            } else {
                this.G = 0;
            }
        }
        this.I = this.G;
    }

    public final void e(float f10, float f11) {
        int i10 = this.f14692t;
        this.f14684l.setTextSkewX((i10 > 0 ? 1 : i10 < 0 ? -1 : 0) * (f11 <= 0.0f ? 1 : -1) * 0.5f * f10);
        this.f14684l.setAlpha(this.V ? (int) (((90.0f - Math.abs(f11)) / 90.0f) * 255.0f) : 255);
    }

    public final void f(xh.a aVar) {
        a();
        if (aVar == xh.a.f25223b || aVar == xh.a.f25224c) {
            float f10 = this.F;
            float f11 = this.f14693u;
            int i10 = (int) (((f10 % f11) + f11) % f11);
            this.N = i10;
            if (i10 > f11 / 2.0f) {
                this.N = (int) (f11 - i10);
            } else {
                this.N = -i10;
            }
        }
        this.f14683k = this.f14682j.scheduleWithFixedDelay(new wh.b(this, this.N), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final uh.a getAdapter() {
        return this.f14687o;
    }

    public final int getCurrentItem() {
        int i10;
        uh.a aVar = this.f14687o;
        if (aVar == null) {
            return 0;
        }
        return (!this.B || ((i10 = this.H) >= 0 && i10 < ((j) aVar).k())) ? Math.max(0, Math.min(this.H, ((j) this.f14687o).k() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.H) - ((j) this.f14687o).k()), ((j) this.f14687o).k() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f14677e;
    }

    public int getInitPosition() {
        return this.G;
    }

    public float getItemHeight() {
        return this.f14693u;
    }

    public int getItemsCount() {
        uh.a aVar = this.f14687o;
        if (aVar != null) {
            return ((j) aVar).k();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.F;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        String str;
        String str2;
        int i11;
        if (this.f14687o == null) {
            return;
        }
        int i12 = 1;
        int min = Math.min(Math.max(0, this.G), ((j) this.f14687o).k() - 1);
        this.G = min;
        try {
            this.I = min + (((int) (this.F / this.f14693u)) % ((j) this.f14687o).k());
        } catch (ArithmeticException unused) {
            Log.d(w.n("JmhRZRhWL2V3", "zmq4tFIZ"), w.n("E2ErbKK8z2EtYRt0F3IaZyB0f3QMbQpDHHUkdHopSz1IIHLv8YwCaSdrCmcXIFBhMWEWbQBzFGEHY2g=", "ROGGsJRk"));
        }
        if (this.B) {
            if (this.I < 0) {
                this.I = ((j) this.f14687o).k() + this.I;
            }
            if (this.I > ((j) this.f14687o).k() - 1) {
                this.I -= ((j) this.f14687o).k();
            }
        } else {
            if (this.I < 0) {
                this.I = 0;
            }
            if (this.I > ((j) this.f14687o).k() - 1) {
                this.I = ((j) this.f14687o).k() - 1;
            }
        }
        float f11 = this.F % this.f14693u;
        b bVar = this.f14675c;
        if (bVar == b.f25226a) {
            float f12 = (TextUtils.isEmpty(this.f14688p) ? (this.L - this.f14690r) / 2 : (this.L - this.f14690r) / 4) - 12;
            float f13 = f12 <= 0.0f ? 10.0f : f12;
            float f14 = this.L - f13;
            float f15 = this.C;
            float f16 = f13;
            canvas.drawLine(f16, f15, f14, f15, this.f14686n);
            float f17 = this.D;
            canvas.drawLine(f16, f17, f14, f17, this.f14686n);
        } else if (bVar == b.f25227b) {
            this.f14686n.setStyle(Paint.Style.STROKE);
            this.f14686n.setStrokeWidth(this.f14698z);
            float f18 = (TextUtils.isEmpty(this.f14688p) ? (this.L - this.f14690r) / 2.0f : (this.L - this.f14690r) / 4.0f) - 12.0f;
            float f19 = f18 > 0.0f ? f18 : 10.0f;
            canvas.drawCircle(this.L / 2.0f, this.K / 2.0f, Math.max((this.L - f19) - f19, this.f14693u) / 1.8f, this.f14686n);
        } else if (bVar == b.f25228c) {
            int i13 = this.f14674b;
            int i14 = this.f14673a;
            if (i14 == 1) {
                if (og.a.c0(this.f14676d)) {
                    canvas.drawRect(new RectF(0.0f, this.C, (this.L * 2) / 3, this.D), this.f14686n);
                    float f20 = i13;
                    canvas.drawRoundRect(new RectF(r3 - ((r3 * 2) / 3), this.C, this.L, this.D), f20, f20, this.f14686n);
                } else {
                    canvas.drawRect(new RectF(r3 - ((r3 * 2) / 3), this.C, this.L, this.D), this.f14686n);
                    float f21 = i13;
                    canvas.drawRoundRect(new RectF(0.0f, this.C, (this.L * 2) / 3, this.D), f21, f21, this.f14686n);
                }
            } else if (i14 != 2) {
                canvas.drawRect(new RectF(0.0f, this.C, this.L, this.D), this.f14686n);
            } else if (og.a.c0(this.f14676d)) {
                canvas.drawRect(new RectF(r3 - ((r3 * 2) / 3), this.C, this.L, this.D), this.f14686n);
                float f22 = i13;
                canvas.drawRoundRect(new RectF(0.0f, this.C, (this.L * 2) / 3, this.D), f22, f22, this.f14686n);
            } else {
                canvas.drawRect(new RectF(0.0f, this.C, (this.L * 2) / 3, this.D), this.f14686n);
                float f23 = i13;
                canvas.drawRoundRect(new RectF(r3 - ((r3 * 2) / 3), this.C, this.L, this.D), f23, f23, this.f14686n);
            }
        } else {
            float f24 = this.C;
            canvas.drawLine(0.0f, f24, this.L, f24, this.f14686n);
            float f25 = this.D;
            canvas.drawLine(0.0f, f25, this.L, f25, this.f14686n);
        }
        boolean isEmpty = TextUtils.isEmpty(this.f14688p);
        boolean z6 = this.f14681i;
        float f26 = this.U;
        if (!isEmpty && z6) {
            int i15 = this.L;
            Paint paint = this.f14685m;
            String str3 = this.f14688p;
            if (str3 == null || str3.length() <= 0) {
                i11 = 0;
            } else {
                int length = str3.length();
                float[] fArr = new float[length];
                paint.getTextWidths(str3, fArr);
                int i16 = 0;
                i11 = 0;
                while (i16 < length) {
                    i11 += (int) Math.ceil(fArr[i16]);
                    i16++;
                    fArr = fArr;
                }
            }
            canvas.drawText(this.f14688p, (i15 - i11) - f26, this.E, this.f14685m);
        }
        int i17 = 0;
        while (true) {
            int i18 = this.J;
            if (i17 >= i18) {
                return;
            }
            int i19 = this.I - ((i18 / 2) - i17);
            String j4 = this.B ? ((j) this.f14687o).j(c(i19)) : (i19 >= 0 && i19 <= ((j) this.f14687o).k() - i12) ? ((j) this.f14687o).j(i19) : "";
            canvas.save();
            double d10 = ((this.f14693u * i17) - f11) / this.M;
            float f27 = f11;
            float f28 = (float) (90.0d - ((d10 / 3.141592653589793d) * 180.0d));
            if (f28 > 90.0f || f28 < -90.0f) {
                f10 = f27;
                canvas.restore();
            } else {
                String b10 = (z6 || TextUtils.isEmpty(this.f14688p) || TextUtils.isEmpty(b(j4))) ? b(j4) : b(j4) + this.f14688p;
                float pow = (float) Math.pow(Math.abs(f28) / 90.0f, 2.2d);
                Rect rect = new Rect();
                this.f14685m.getTextBounds(b10, 0, b10.length(), rect);
                int i20 = this.f14689q;
                for (int width = rect.width(); width > this.L; width = rect.width()) {
                    i20--;
                    this.f14685m.setTextSize(i20);
                    this.f14685m.getTextBounds(b10, 0, b10.length(), rect);
                }
                this.f14684l.setTextSize(i20);
                Rect rect2 = new Rect();
                this.f14685m.getTextBounds(b10, 0, b10.length(), rect2);
                int i21 = this.R;
                if (i21 != 3) {
                    i10 = 5;
                    if (i21 == 5) {
                        f10 = f27;
                        this.S = (this.L - rect2.width()) - ((int) f26);
                    } else if (i21 != 17) {
                        f10 = f27;
                    } else if (this.f14680h || (str2 = this.f14688p) == null || str2.equals("") || !z6) {
                        f10 = f27;
                        this.S = (int) ((this.L - rect2.width()) * 0.5d);
                    } else {
                        f10 = f27;
                        this.S = (int) ((this.L - rect2.width()) * 0.25d);
                    }
                } else {
                    f10 = f27;
                    i10 = 5;
                    this.S = 0;
                }
                Rect rect3 = new Rect();
                this.f14684l.getTextBounds(b10, 0, b10.length(), rect3);
                int i22 = this.R;
                if (i22 == 3) {
                    this.T = 0;
                } else if (i22 == i10) {
                    this.T = (this.L - rect3.width()) - ((int) f26);
                } else if (i22 == 17) {
                    if (this.f14680h || (str = this.f14688p) == null || str.equals("") || !z6) {
                        this.T = (int) ((this.L - rect3.width()) * 0.5d);
                    } else {
                        this.T = (int) ((this.L - rect3.width()) * 0.25d);
                    }
                }
                float cos = (float) ((this.M - (Math.cos(d10) * this.M)) - ((Math.sin(d10) * this.f14691s) / 2.0d));
                canvas.translate(0.0f, cos);
                float f29 = this.C;
                if (cos > f29 || this.f14691s + cos < f29) {
                    float f30 = this.D;
                    if (cos > f30 || this.f14691s + cos < f30) {
                        if (cos >= f29) {
                            float f31 = this.f14691s;
                            if (cos + f31 <= f30) {
                                canvas.drawText(b10, this.S, f31 - f26, this.f14685m);
                                this.H = this.I - ((this.J / 2) - i17);
                                canvas.restore();
                                this.f14685m.setTextSize(this.f14689q);
                            }
                        }
                        canvas.save();
                        canvas.clipRect(0, 0, this.L, (int) this.f14693u);
                        canvas.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                        e(pow, f28);
                        canvas.drawText(b10, (this.f14692t * pow) + this.T, this.f14691s, this.f14684l);
                        canvas.restore();
                        canvas.restore();
                        this.f14685m.setTextSize(this.f14689q);
                    } else {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.L, this.D - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d10)) * 1.0f);
                        canvas.drawText(b10, this.S, this.f14691s - f26, this.f14685m);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.D - cos, this.L, (int) this.f14693u);
                        canvas.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                        e(pow, f28);
                        canvas.drawText(b10, this.T, this.f14691s, this.f14684l);
                        canvas.restore();
                    }
                } else {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, this.L, this.C - cos);
                    canvas.scale(1.0f, ((float) Math.sin(d10)) * 0.8f);
                    e(pow, f28);
                    canvas.drawText(b10, this.T, this.f14691s, this.f14684l);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0.0f, this.C - cos, this.L, (int) this.f14693u);
                    canvas.scale(1.0f, ((float) Math.sin(d10)) * 1.0f);
                    canvas.drawText(b10, this.S, this.f14691s - f26, this.f14685m);
                    canvas.restore();
                }
                canvas.restore();
                this.f14685m.setTextSize(this.f14689q);
            }
            i17++;
            f11 = f10;
            i12 = 1;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Q = i10;
        d();
        setMeasuredDimension(this.L, this.K);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f14678f.onTouchEvent(motionEvent);
        float f10 = (-this.G) * this.f14693u;
        float k10 = ((((j) this.f14687o).k() - 1) - this.G) * this.f14693u;
        int action = motionEvent.getAction();
        boolean z6 = false;
        if (action == 0) {
            this.P = System.currentTimeMillis();
            a();
            this.O = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.O - motionEvent.getRawY();
            this.O = motionEvent.getRawY();
            float f11 = this.F + rawY;
            this.F = f11;
            if (!this.B) {
                float f12 = this.f14693u;
                if ((f11 - (f12 * 0.25f) < f10 && rawY < 0.0f) || ((f12 * 0.25f) + f11 > k10 && rawY > 0.0f)) {
                    this.F = f11 - rawY;
                    z6 = true;
                }
            }
        } else if (!onTouchEvent) {
            float y10 = motionEvent.getY();
            int i10 = this.M;
            double acos = Math.acos((i10 - y10) / i10) * this.M;
            float f13 = this.f14693u;
            this.N = (int) (((((int) ((acos + (f13 / 2.0f)) / f13)) - (this.J / 2)) * f13) - (((this.F % f13) + f13) % f13));
            if (System.currentTimeMillis() - this.P > 120) {
                f(xh.a.f25224c);
            } else {
                f(xh.a.f25222a);
            }
        }
        if (!z6 && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(uh.a aVar) {
        this.f14687o = aVar;
        d();
        invalidate();
    }

    public void setAlphaGradient(boolean z6) {
        this.V = z6;
    }

    public final void setCurrentItem(int i10) {
        this.H = i10;
        this.G = i10;
        this.F = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z6) {
        this.B = z6;
    }

    public void setDividerColor(int i10) {
        this.f14697y = i10;
        this.f14686n.setColor(i10);
    }

    public void setDividerType(b bVar) {
        this.f14675c = bVar;
    }

    public void setDividerWidth(int i10) {
        this.f14698z = i10;
        this.f14686n.setStrokeWidth(i10);
    }

    public void setGravity(int i10) {
        this.R = i10;
    }

    public void setIsOptions(boolean z6) {
        this.f14680h = z6;
    }

    public void setItemsVisibleCount(int i10) {
        if (i10 % 2 == 0) {
            i10++;
        }
        this.J = i10 + 2;
    }

    public void setLabel(String str) {
        this.f14688p = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.A = f10;
            if (f10 < 1.0f) {
                this.A = 1.0f;
            } else if (f10 > 4.0f) {
                this.A = 4.0f;
            }
        }
    }

    public final void setOnItemSelectedListener(vh.a aVar) {
        this.f14679g = aVar;
    }

    public void setTextColorCenter(int i10) {
        this.f14696x = i10;
        this.f14685m.setColor(i10);
    }

    public void setTextColorOut(int i10) {
        this.f14695w = i10;
        this.f14684l.setColor(i10);
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i10 = (int) (this.f14676d.getResources().getDisplayMetrics().density * f10);
            this.f14689q = i10;
            this.f14684l.setTextSize(i10);
            this.f14685m.setTextSize(this.f14689q);
        }
    }

    public void setTextXOffset(int i10) {
        this.f14692t = i10;
        if (i10 != 0) {
            this.f14685m.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.F = f10;
    }

    public final void setTypeface(Typeface typeface) {
        this.f14694v = typeface;
        this.f14684l.setTypeface(typeface);
        this.f14685m.setTypeface(this.f14694v);
    }
}
