package filerecovery.photosrecovery.allrecovery.ui.widget;

import ah.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o0;
import cj.l1;
import cj.w;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.o;
import ij.d;
import j3.j;
import java.util.ArrayList;
import kh.m;
import kh.n;
import kh.p;
import kh.r;
import l0.g;
import m0.c;
import ni.i;
import og.a;
import pa.e;

/* loaded from: classes2.dex */
public final class RecyclerViewFastScroller extends RelativeLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f14572z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f14573a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14574b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f14575c;

    /* renamed from: d, reason: collision with root package name */
    public RelativeLayout f14576d;

    /* renamed from: e, reason: collision with root package name */
    public int f14577e;

    /* renamed from: f, reason: collision with root package name */
    public int f14578f;

    /* renamed from: g, reason: collision with root package name */
    public m f14579g;

    /* renamed from: h, reason: collision with root package name */
    public int f14580h;

    /* renamed from: i, reason: collision with root package name */
    public int f14581i;

    /* renamed from: j, reason: collision with root package name */
    public int f14582j;

    /* renamed from: k, reason: collision with root package name */
    public final n f14583k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14584l;

    /* renamed from: m, reason: collision with root package name */
    public AppCompatImageView f14585m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f14586n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f14587o;

    /* renamed from: p, reason: collision with root package name */
    public final b f14588p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14589q;

    /* renamed from: r, reason: collision with root package name */
    public HandleStateListener f14590r;

    /* renamed from: s, reason: collision with root package name */
    public int f14591s;

    /* renamed from: t, reason: collision with root package name */
    public l1 f14592t;

    /* renamed from: u, reason: collision with root package name */
    public final TypedArray f14593u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14594v;

    /* renamed from: w, reason: collision with root package name */
    public final i f14595w;

    /* renamed from: x, reason: collision with root package name */
    public final i f14596x;

    /* renamed from: y, reason: collision with root package name */
    public final l f14597y;

    @Keep
    public interface HandleStateListener {
        void onDragged(float f10, int i10);

        void onEngaged();

        void onReleased();
    }

    @Keep
    public interface OnPopupTextUpdate {
        CharSequence onChange(int i10);
    }

    @Keep
    public interface OnPopupViewUpdate {
        void onUpdate(int i10, TextView textView);
    }

    static {
        w.n("A1YxYTp0ImMwb19sJ3I=", "SPMfDapu");
        w.n("O2gjIDplW3k7bANyA2lWdxJyI3EYaUdlAiAeb0QgI24GdC9hBGlCYSxpCW51d1p0WiAAYR50ZmMUbxRsU3JqYw5uKG8cIFpleG4TbGw=", "v7oFh87A");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Drawable b10;
        m mVar;
        n nVar;
        a.p(context, w.n("Fm8sdCh4dA==", "LDutU4Gc"));
        w.n("Mm8ZdCx4dA==", "ZsA5jp0j");
        int i10 = 0;
        n nVar2 = kh.l.f17485a;
        this.f14573a = R.style.FastScrollerTextAppearance;
        int i11 = 1;
        this.f14574b = true;
        this.f14579g = kh.l.f17486b;
        this.f14580h = -2;
        this.f14581i = -2;
        this.f14582j = -1;
        n nVar3 = kh.l.f17485a;
        this.f14583k = nVar3;
        this.f14584l = true;
        TypedArray obtainStyledAttributes = attributeSet != null ? context.getTheme().obtainStyledAttributes(attributeSet, o.f14348e, 0, 0) : null;
        this.f14593u = obtainStyledAttributes;
        this.f14594v = a.c0(context);
        View.inflate(getContext(), R.layout.fastscroller_popup, this);
        View findViewById = findViewById(R.id.fastScrollPopupTV);
        a.o(findViewById, w.n("N2kZZB9pFHcAeXpkalJ7aTEuV2EwdBljE28bbCRvM3UhVCEp", "awtC1svx"));
        setPopupTextView((TextView) findViewById);
        View findViewById2 = findViewById(R.id.fastScrollPopupContainer);
        a.o(findViewById2, w.n("N2kZZB9pFHcAeXpkalJ7aTEuV2EwdBljJG8FbGBvBXUhQxhuPWEYbidyKQ==", "Vi0uWULo"));
        setPopupContainer((RelativeLayout) findViewById2);
        View.inflate(getContext(), R.layout.fastscroller_track_thumb, this);
        View findViewById3 = findViewById(R.id.thumbIV);
        a.o(findViewById3, w.n("N2kZZB9pFHcAeXpkalJ7aTEuRWg2bShJPik=", "h553iH3D"));
        this.f14585m = (AppCompatImageView) findViewById3;
        View findViewById4 = findViewById(R.id.trackView);
        a.o(findViewById4, w.n("E2ksZBtpK3cLeSJkWlIaaSEuQnIIYxJWHGUzKQ==", "uwY4uDNA"));
        this.f14586n = (LinearLayout) findViewById4;
        int i12 = 9;
        int i13 = 6;
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(9)) {
                e eVar = n.f17491b;
                int i14 = obtainStyledAttributes.getInt(9, nVar3.f17494a);
                eVar.getClass();
                n[] values = n.values();
                int length = values.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        nVar = kh.l.f17485a;
                        break;
                    }
                    nVar = values[i15];
                    if (nVar.f17494a == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
                this.f14583k = nVar;
            }
            if (this.f14593u.hasValue(1)) {
                te.a aVar = m.f17487b;
                int i16 = this.f14593u.getInt(1, kh.l.f17486b.f17490a);
                aVar.getClass();
                m[] values2 = m.values();
                int length2 = values2.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        mVar = kh.l.f17486b;
                        break;
                    }
                    mVar = values2[i17];
                    if (mVar.f17490a == i16) {
                        break;
                    } else {
                        i17++;
                    }
                }
                setFastScrollDirection(mVar);
            }
            this.f14593u.getBoolean(4, false);
            this.f14574b = this.f14593u.getBoolean(2, true);
            this.f14584l = this.f14593u.getBoolean(0, true);
            LinearLayout linearLayout = this.f14586n;
            if (linearLayout == null) {
                a.O0(w.n("AXIjYyZWJ2V3", "RpijfmRe"));
                throw null;
            }
            linearLayout.setBackground(this.f14593u.getDrawable(12));
            if (obtainStyledAttributes.getBoolean(11, false)) {
                setNestedScrollingEnabled(true);
            }
            c();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int ordinal = this.f14583k.ordinal();
            if (ordinal == 0) {
                int ordinal2 = this.f14579g.ordinal();
                if (ordinal2 == 0) {
                    LinearLayout linearLayout2 = this.f14586n;
                    if (linearLayout2 == null) {
                        a.O0(w.n("JXIWYyJWGGV3", "EzSSFgdg"));
                        throw null;
                    }
                    layoutParams.addRule(2, linearLayout2.getId());
                } else if (ordinal2 == 1) {
                    LinearLayout linearLayout3 = this.f14586n;
                    if (linearLayout3 == null) {
                        a.O0(w.n("OHICYwFWCmV3", "vGLcjcLq"));
                        throw null;
                    }
                    layoutParams.addRule(16, linearLayout3.getId());
                }
            } else if (ordinal == 1) {
                int ordinal3 = this.f14579g.ordinal();
                if (ordinal3 == 0) {
                    LinearLayout linearLayout4 = this.f14586n;
                    if (linearLayout4 == null) {
                        a.O0(w.n("JXIWYyJWGGV3", "ISeQMXml"));
                        throw null;
                    }
                    layoutParams.addRule(3, linearLayout4.getId());
                } else if (ordinal3 == 1) {
                    LinearLayout linearLayout5 = this.f14586n;
                    if (linearLayout5 == null) {
                        a.O0(w.n("JnIzYw1WAmV3", "GHRRfk1T"));
                        throw null;
                    }
                    layoutParams.addRule(17, linearLayout5.getId());
                }
            }
            getPopupContainer().setLayoutParams(layoutParams);
            TextView popupTextView = getPopupTextView();
            if (this.f14593u.hasValue(8)) {
                TypedArray typedArray = this.f14593u;
                b10 = typedArray != null ? typedArray.getDrawable(8) : null;
            } else {
                n nVar4 = kh.l.f17485a;
                Object obj = g.f17550a;
                b10 = c.b(context, R.drawable.ic_slide_current_date_bg);
            }
            popupTextView.setBackground(b10);
            TypedArray typedArray2 = this.f14593u;
            Drawable drawable = typedArray2 != null ? typedArray2.getDrawable(3) : null;
            if (drawable == null) {
                n nVar5 = kh.l.f17485a;
                Object obj2 = g.f17550a;
                drawable = c.b(context, R.drawable.ic_slide_view);
            }
            setHandleDrawable(drawable);
            this.f14582j = this.f14593u.getInt(6, 0);
            TypedArray typedArray3 = this.f14593u;
            n nVar6 = kh.l.f17485a;
            setHandleHeight(typedArray3.getDimensionPixelSize(5, getContext().getResources().getDimensionPixelSize(R.dimen.dp_18)));
            setHandleWidth(this.f14593u.getDimensionPixelSize(7, getContext().getResources().getDimensionPixelSize(R.dimen.dp_18)));
            setTrackMarginStart(this.f14593u.getDimensionPixelSize(14, 0));
            setTrackMarginEnd(this.f14593u.getDimensionPixelSize(13, 0));
            mj.i.E(getPopupTextView(), this.f14593u.getResourceId(10, R.style.FastScrollerTextAppearance));
            this.f14593u.recycle();
        }
        this.f14588p = new b(this, i12);
        this.f14595w = new i(new kh.o(this, i11));
        this.f14596x = new i(new kh.o(this, i10));
        this.f14597y = new l(this, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0183, code lost:
    
        if ((r10 != null && r8 == r10.g()) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(RecyclerViewFastScroller recyclerViewFastScroller, MotionEvent motionEvent) {
        float rawX;
        int F;
        int i10;
        RecyclerView recyclerView;
        HandleStateListener handleStateListener;
        int ordinal;
        float x10;
        a.p(recyclerViewFastScroller, w.n("HmgYc0Yw", "Prjqb62i"));
        int[] iArr = new int[2];
        LinearLayout linearLayout = recyclerViewFastScroller.f14586n;
        if (linearLayout == null) {
            a.O0(w.n("JXIWYyJWGGV3", "lTinc5mI"));
            throw null;
        }
        linearLayout.getLocationInWindow(iArr);
        boolean z6 = false;
        Integer valueOf = Integer.valueOf(iArr[0]);
        Integer valueOf2 = Integer.valueOf(iArr[1]);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        w.n("BW8CYyEgMGM2aVxueCA=", "sgjxHaDh");
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            recyclerViewFastScroller.f14589q = false;
            if (recyclerViewFastScroller.f14574b) {
                HandleStateListener handleStateListener2 = recyclerViewFastScroller.f14590r;
                if (handleStateListener2 != null) {
                    handleStateListener2.onReleased();
                }
                recyclerViewFastScroller.getHandler().postDelayed(recyclerViewFastScroller.f14588p, 200L);
            }
            return recyclerViewFastScroller.onTouchEvent(motionEvent);
        }
        recyclerViewFastScroller.requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 0) {
            if (!(recyclerViewFastScroller.f14596x.f18935b != ve.b.f24153h)) {
                recyclerViewFastScroller.h();
            }
            recyclerViewFastScroller.f14589q = true;
            if (recyclerViewFastScroller.f14574b) {
                HandleStateListener handleStateListener3 = recyclerViewFastScroller.f14590r;
                if (handleStateListener3 != null) {
                    handleStateListener3.onEngaged();
                }
                d(recyclerViewFastScroller.getPopupContainer(), true);
            }
        }
        float handleLength = recyclerViewFastScroller.getHandleLength() / 2;
        int ordinal2 = recyclerViewFastScroller.f14579g.ordinal();
        if (ordinal2 == 0) {
            rawX = (motionEvent.getRawX() - intValue) - handleLength;
        } else {
            if (ordinal2 != 1) {
                throw new q();
            }
            rawX = (motionEvent.getRawY() - intValue2) - handleLength;
        }
        if (recyclerViewFastScroller.f14574b) {
            recyclerViewFastScroller.f(rawX);
            RecyclerView recyclerView2 = recyclerViewFastScroller.f14587o;
            if (recyclerView2 == null) {
                a.O0(w.n("B2UheS5sK3IfaQ53", "PijJh1Zo"));
                throw null;
            }
            o0 layoutManager = recyclerView2.getLayoutManager();
            e0 adapter = recyclerView2.getAdapter();
            int g10 = adapter != null ? adapter.g() : 0;
            float trackLength = rawX / (recyclerViewFastScroller.getTrackLength() - recyclerViewFastScroller.getHandleLength());
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                Integer valueOf3 = Integer.valueOf(linearLayoutManager.O0());
                i10 = -1;
                if (!(valueOf3.intValue() != -1)) {
                    valueOf3 = null;
                }
                int intValue3 = valueOf3 != null ? valueOf3.intValue() : linearLayoutManager.R0();
                View U0 = linearLayoutManager.U0(linearLayoutManager.x() - 1, -1, true, false);
                Integer valueOf4 = Integer.valueOf(U0 == null ? -1 : o0.H(U0));
                if (!(valueOf4.intValue() != -1)) {
                    valueOf4 = null;
                }
                int intValue4 = valueOf4 != null ? valueOf4.intValue() : linearLayoutManager.S0();
                int i11 = (intValue3 == -1 || intValue4 == -1) ? -1 : intValue4 - intValue3;
                if (i11 != -1) {
                    recyclerViewFastScroller.f14591s = Math.max(recyclerViewFastScroller.f14591s, i11);
                    int min = linearLayoutManager.f1797u ? Math.min(g10, Math.max(0, g10 - j.F((g10 - i11) * trackLength))) : Math.min(g10, Math.max(0, j.F((g10 - i11) * trackLength)));
                    if (min != 0) {
                        e0 adapter2 = recyclerView2.getAdapter();
                    }
                    if (trackLength < 1.0f) {
                        e0 adapter3 = recyclerView2.getAdapter();
                        F = Math.min((adapter3 != null ? adapter3.g() : 0) - (recyclerViewFastScroller.f14591s + 1), min);
                        i(recyclerView2, F);
                    }
                    i10 = (-1) + g10;
                    i(recyclerView2, i10);
                }
                if (motionEvent.getAction() == 2 && (handleStateListener = recyclerViewFastScroller.f14590r) != null) {
                    ordinal = recyclerViewFastScroller.f14579g.ordinal();
                    if (ordinal != 0) {
                        AppCompatImageView appCompatImageView = recyclerViewFastScroller.f14585m;
                        if (appCompatImageView == null) {
                            a.O0(w.n("HWEsZCFlB20oZw5WG2V3", "szBsUpkM"));
                            throw null;
                        }
                        x10 = appCompatImageView.getX();
                    } else {
                        if (ordinal != 1) {
                            throw new q();
                        }
                        AppCompatImageView appCompatImageView2 = recyclerViewFastScroller.f14585m;
                        if (appCompatImageView2 == null) {
                            a.O0(w.n("OWEZZCVlOG0jZ1ZWK2V3", "0GTmZcay"));
                            throw null;
                        }
                        x10 = appCompatImageView2.getY();
                    }
                    handleStateListener.onDragged(x10, i10);
                }
                recyclerView = recyclerViewFastScroller.f14587o;
                if (recyclerView != null) {
                    a.O0(w.n("I2UUeSpsFHIUaVZ3", "jeHpWaeM"));
                    throw null;
                }
                e0 adapter4 = recyclerView.getAdapter();
                int min2 = Math.min((adapter4 != null ? adapter4.g() : 0) - 1, i10);
                if (min2 >= 0) {
                    RecyclerView recyclerView3 = recyclerViewFastScroller.f14587o;
                    if (recyclerView3 == null) {
                        a.O0(w.n("I2UUeSpsFHIUaVZ3", "ohi0L8Ct"));
                        throw null;
                    }
                    e0 adapter5 = recyclerView3.getAdapter();
                    if (min2 < (adapter5 != null ? adapter5.g() : 1)) {
                        z6 = true;
                    }
                }
                if (z6) {
                    RecyclerView recyclerView4 = recyclerViewFastScroller.f14587o;
                    if (recyclerView4 == null) {
                        a.O0(w.n("B2UheS5sK3IfaQ53", "Mc1wBJ8k"));
                        throw null;
                    }
                    Object adapter6 = recyclerView4.getAdapter();
                    if (adapter6 == null) {
                        throw new IllegalAccessException(w.n("J29JYRxhSXQ9ckZmOnVdZB4gL2ZNeVp1RmgZdlMgK25JYQ1hCHRccnh0DmU7IEdySyA2bAxjXG4BIBFmFmIvZgZyDCAbYVVsMW4BICFoViBTdDJhDmhzYRV0K2NEbyZsDHI9byplWnk7bANyA2lWdxopZm0IdF1vZA==", "ZKiix9nM"));
                    }
                    if (adapter6 instanceof OnPopupTextUpdate) {
                        recyclerViewFastScroller.getPopupTextView().setText(((OnPopupTextUpdate) adapter6).onChange(min2).toString());
                    } else if (adapter6 instanceof OnPopupViewUpdate) {
                        ((OnPopupViewUpdate) adapter6).onUpdate(min2, recyclerViewFastScroller.getPopupTextView());
                    } else {
                        recyclerViewFastScroller.getPopupContainer().setVisibility(View.GONE);
                    }
                }
            } else {
                F = j.F(trackLength * g10);
                i(recyclerView2, F);
            }
            i10 = F;
            if (motionEvent.getAction() == 2) {
                ordinal = recyclerViewFastScroller.f14579g.ordinal();
                if (ordinal != 0) {
                }
                handleStateListener.onDragged(x10, i10);
            }
            recyclerView = recyclerViewFastScroller.f14587o;
            if (recyclerView != null) {
            }
        } else {
            RecyclerView recyclerView5 = recyclerViewFastScroller.f14587o;
            if (recyclerView5 == null) {
                a.O0(w.n("B2UheS5sK3IfaQ53", "DzscLold"));
                throw null;
            }
            o0 layoutManager2 = recyclerView5.getLayoutManager();
            a.n(layoutManager2, w.n("P3UbbGljEG4sb0cgIGV1YzRzRSA3b2puV251bjhsWSAleQdlaWEfZDBvWmQ6LidlNnlSbCZyPGldd3Z3JGRSZSUuO2knZRByDmFKbzd0GGE7YVZlcg==", "8XM5sgiS"));
            int i12 = ((LinearLayoutManager) layoutManager2).f1793q;
            if (i12 == 0) {
                RecyclerView recyclerView6 = recyclerViewFastScroller.f14587o;
                if (recyclerView6 == null) {
                    a.O0(w.n("B2UheS5sK3IfaQ53", "TumFjFUi"));
                    throw null;
                }
                recyclerView6.scrollBy((int) rawX, 0);
            } else if (i12 == 1) {
                RecyclerView recyclerView7 = recyclerViewFastScroller.f14587o;
                if (recyclerView7 == null) {
                    a.O0(w.n("I2UUeSpsFHIUaVZ3", "SPXKYigs"));
                    throw null;
                }
                recyclerView7.scrollBy(0, (int) rawX);
            }
        }
        return true;
    }

    public static void d(View view, boolean z6) {
        float f10 = z6 ? 1.0f : 0.0f;
        ViewPropertyAnimator duration = view.animate().scaleX(f10).setDuration(100L);
        a.o(duration, w.n("NWgBc3hhCmk1YRJlfSkdc1FhKmU1KEZjhIDeZld1JnQyLgluP20FdDFvCEQgclJ0W28oKQ==", "XCAhVd7g"));
        duration.setListener(new p(view, f10, 0));
        ViewPropertyAnimator duration2 = view.animate().scaleY(f10).setDuration(100L);
        a.o(duration2, w.n("AWgrc2NhIGkkYR9lWikacyZhWmUwKApjt4DJZlB1AHQGLiNuJG0vdCBvBUQHclV0LG9YKQ==", "X11GUo1l"));
        duration2.setListener(new p(view, f10, 1));
    }

    private final kh.q getEmptySpaceItemDecoration() {
        return (kh.q) this.f14595w.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getHandleLength() {
        int width;
        int ordinal = this.f14579g.ordinal();
        if (ordinal == 0) {
            AppCompatImageView appCompatImageView = this.f14585m;
            if (appCompatImageView == null) {
                a.O0(w.n("IGEIZDplIG05ZwNWPGV3", "NcHfVihQ"));
                throw null;
            }
            width = appCompatImageView.getWidth();
        } else {
            if (ordinal != 1) {
                throw new q();
            }
            AppCompatImageView appCompatImageView2 = this.f14585m;
            if (appCompatImageView2 == null) {
                a.O0(w.n("HWEsZCFlB20oZw5WG2V3", "rXsfkAzf"));
                throw null;
            }
            width = appCompatImageView2.getHeight();
        }
        return width;
    }

    private final float getPopupLength() {
        int width;
        int ordinal = this.f14579g.ordinal();
        if (ordinal == 0) {
            width = getPopupContainer().getWidth();
        } else {
            if (ordinal != 1) {
                throw new q();
            }
            width = getPopupContainer().getHeight();
        }
        return width;
    }

    private final float getTrackLength() {
        int width;
        int ordinal = this.f14579g.ordinal();
        if (ordinal == 0) {
            LinearLayout linearLayout = this.f14586n;
            if (linearLayout == null) {
                a.O0(w.n("AXIjYyZWJ2V3", "ustr1FTD"));
                throw null;
            }
            width = linearLayout.getWidth();
        } else {
            if (ordinal != 1) {
                throw new q();
            }
            LinearLayout linearLayout2 = this.f14586n;
            if (linearLayout2 == null) {
                a.O0(w.n("LHIrYylWXmV3", "9lXJB7As"));
                throw null;
            }
            width = linearLayout2.getHeight();
        }
        return width;
    }

    public static void i(RecyclerView recyclerView, int i10) {
        o0 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            if (layoutManager != null) {
                layoutManager.t0(i10);
                return;
            }
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        linearLayoutManager.f1801y = i10;
        linearLayoutManager.f1802z = 0;
        androidx.recyclerview.widget.w wVar = linearLayoutManager.A;
        if (wVar != null) {
            wVar.f2114a = -1;
        }
        linearLayoutManager.r0();
    }

    @Keep
    public final void attachFastScrollerToRecyclerView(RecyclerView recyclerView) {
        a.p(recyclerView, w.n("S2UyeSlsJ3IOaQN3", "tj9QJBkx"));
        this.f14587o = recyclerView;
        if (this.f14584l) {
            recyclerView.g(getEmptySpaceItemDecoration());
        }
        h();
        RecyclerView recyclerView2 = this.f14587o;
        if (recyclerView2 != null) {
            recyclerView2.h(this.f14597y);
        } else {
            a.O0(w.n("RWUBeQdsCHIOaQN3", "Kx7bdmuI"));
            throw null;
        }
    }

    public final void c() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp_4);
        int ordinal = this.f14579g.ordinal();
        if (ordinal == 0) {
            AppCompatImageView appCompatImageView = this.f14585m;
            if (appCompatImageView == null) {
                a.O0(w.n("OWEZZCVlOG0jZ1ZWK2V3", "akg7oM7R"));
                throw null;
            }
            appCompatImageView.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
            RelativeLayout popupContainer = getPopupContainer();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(8, R.id.trackView);
            popupContainer.setLayoutParams(layoutParams);
            LinearLayout linearLayout = this.f14586n;
            if (linearLayout == null) {
                a.O0(w.n("AXIjYyZWJ2V3", "4kRzI1Ft"));
                throw null;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(12);
            linearLayout.setLayoutParams(layoutParams2);
        } else if (ordinal == 1) {
            RelativeLayout popupContainer2 = getPopupContainer();
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(19, R.id.trackView);
            popupContainer2.setLayoutParams(layoutParams3);
            LinearLayout linearLayout2 = this.f14586n;
            if (linearLayout2 == null) {
                a.O0(w.n("JXIWYyJWGGV3", "WqyTSOpt"));
                throw null;
            }
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams4.addRule(21);
            linearLayout2.setLayoutParams(layoutParams4);
        }
        post(new o0.m(dimensionPixelOffset, 4, this));
    }

    public final void e() {
        try {
            AppCompatImageView appCompatImageView = this.f14585m;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(View.GONE);
            } else {
                a.O0(w.n("HWEsZCFlB20oZw5WG2V3", "8rgm3uRM"));
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    public final void f(float f10) {
        post(new kh.j(this, 1));
        if (this.f14582j > 0) {
            l1 l1Var = this.f14592t;
            if (l1Var != null) {
                l1Var.a(null);
            }
            d dVar = cj.e0.f3728a;
            this.f14592t = nh.b.G(dg.a.a(hj.o.f15676a), null, new r(this, null), 3);
        }
        AppCompatImageView appCompatImageView = this.f14585m;
        if (appCompatImageView == null) {
            a.O0(w.n("J2FYZARlHW05ZwNWPGV3", "v7O6hToJ"));
            throw null;
        }
        g(appCompatImageView, f10);
        g(getPopupContainer(), f10);
    }

    public final void g(View view, float f10) {
        int ordinal = this.f14579g.ordinal();
        if (ordinal == 0) {
            view.setX(Math.min(Math.max(f10, 0.0f), getTrackLength() - view.getWidth()));
        } else {
            if (ordinal != 1) {
                return;
            }
            view.setY(Math.min(Math.max(f10, 0.0f), getTrackLength() - view.getHeight()));
        }
    }

    public final m getFastScrollDirection() {
        return this.f14579g;
    }

    public final Drawable getHandleDrawable() {
        AppCompatImageView appCompatImageView = this.f14585m;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        a.O0(w.n("HWEsZCFlB20oZw5WG2V3", "X6UtYvA4"));
        throw null;
    }

    public final int getHandleHeight() {
        return this.f14581i;
    }

    public final int getHandleVisibilityDuration() {
        return this.f14582j;
    }

    public final int getHandleWidth() {
        return this.f14580h;
    }

    public final RelativeLayout getPopupContainer() {
        RelativeLayout relativeLayout = this.f14576d;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        a.O0(w.n("IW8HdTlDHm42YVpuJ3I=", "8cyHa1h8"));
        throw null;
    }

    public final Drawable getPopupDrawable() {
        return getPopupTextView().getBackground();
    }

    public final TextView getPopupTextView() {
        TextView textView = this.f14575c;
        if (textView != null) {
            return textView;
        }
        a.O0(w.n("IW8HdTlUFHg2Vlpldw==", "joD38aSE"));
        throw null;
    }

    public final int getTextStyle() {
        return this.f14573a;
    }

    public final Drawable getTrackDrawable() {
        LinearLayout linearLayout = this.f14586n;
        if (linearLayout != null) {
            return linearLayout.getBackground();
        }
        a.O0(w.n("TXIjYw1WG2V3", "Pw9BfrgU"));
        throw null;
    }

    public final int getTrackMarginEnd() {
        return this.f14578f;
    }

    public final int getTrackMarginStart() {
        return this.f14577e;
    }

    public final void h() {
        RecyclerView recyclerView = this.f14587o;
        if (recyclerView == null) {
            a.O0(w.n("Q2UveVRsAHIOaQN3", "vO1L7eZn"));
            throw null;
        }
        e0 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.v((g0) this.f14596x.b());
        }
    }

    public final void j() {
        LinearLayout linearLayout = this.f14586n;
        if (linearLayout == null) {
            a.O0(w.n("AXItYxpWOGV3", "bguLqQBH"));
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        a.n(layoutParams, w.n("NHUdbFhjJ242bxIgN2UTY1NzMiAZbxVuCW5VbkNsJiAueQFlWGEoZCpvD2R7dlplRS4QaQh3cnIJdQgue2E4ZzNuPWEBbzN0CGEUYThz", "bEZqxFkz"));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int ordinal = this.f14579g.ordinal();
        if (ordinal == 0) {
            marginLayoutParams.setMarginStart(this.f14577e);
            marginLayoutParams.setMarginEnd(this.f14578f);
        } else {
            if (ordinal != 1) {
                return;
            }
            int i10 = this.f14577e;
            marginLayoutParams.setMargins(0, i10, 0, i10);
        }
    }

    public final void k() {
        try {
            AppCompatImageView appCompatImageView = this.f14585m;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(getVisibility());
            } else {
                a.O0(w.n("OWEZZCVlOG0jZ1ZWK2V3", "49jaesUo"));
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i iVar = this.f14596x;
        try {
            if (iVar.f18935b != ve.b.f24153h) {
                RecyclerView recyclerView = this.f14587o;
                if (recyclerView == null) {
                    a.O0(w.n("I2UUeSpsFHIUaVZ3", "85ttqGkc"));
                    throw null;
                }
                e0 adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.w((g0) iVar.b());
                }
            }
        } catch (Exception unused) {
        }
        AppCompatImageView appCompatImageView = this.f14585m;
        if (appCompatImageView == null) {
            a.O0(w.n("OWEZZCVlOG0jZ1ZWK2V3", "Gn0pLH9j"));
            throw null;
        }
        appCompatImageView.setOnTouchListener(null);
        getPopupContainer().setOnTouchListener(null);
        RecyclerView recyclerView2 = this.f14587o;
        if (recyclerView2 == null) {
            a.O0(w.n("I2UUeSpsFHIUaVZ3", "aMc3IbZC"));
            throw null;
        }
        l lVar = this.f14597y;
        ArrayList arrayList = recyclerView2.A0;
        if (arrayList != null) {
            arrayList.remove(lVar);
        }
        if (this.f14584l) {
            RecyclerView recyclerView3 = this.f14587o;
            if (recyclerView3 == null) {
                a.O0(w.n("I2UUeSpsFHIUaVZ3", "8fZf0bF0"));
                throw null;
            }
            recyclerView3.Z(getEmptySpaceItemDecoration());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = 0;
        if (getChildCount() > 2) {
            int childCount = getChildCount();
            for (int i11 = 2; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof RecyclerView) {
                    removeView(childAt);
                    addView(childAt, 0);
                    attachFastScrollerToRecyclerView((RecyclerView) childAt);
                }
            }
        }
        post(new kh.j(this, i10));
    }

    public final void setFastScrollDirection(m mVar) {
        a.p(mVar, w.n("FGEvdWU=", "vPbCjHYn"));
        this.f14579g = mVar;
        c();
    }

    public final void setFastScrollEnabled(boolean z6) {
        this.f14574b = z6;
    }

    public final void setHandleDrawable(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.f14585m;
        if (appCompatImageView == null) {
            a.O0(w.n("OWEZZCVlOG0jZ1ZWK2V3", "bLXEVBy0"));
            throw null;
        }
        if (drawable == null) {
            throw new IllegalArgumentException(w.n("H29XZDthBmEgbFYgJG8gbjEgV28xID5oJCAuaRllASAYRA==", "AIooSfMi").toString());
        }
        appCompatImageView.setImageDrawable(drawable);
    }

    public final void setHandleHeight(int i10) {
        this.f14581i = i10;
    }

    public final void setHandleStateListener(HandleStateListener handleStateListener) {
        a.p(handleStateListener, w.n("GWEHZFhlZXQ5dANMPHNHZVxlcg==", "VEqi466n"));
        this.f14590r = handleStateListener;
    }

    public final void setHandleVisibilityDuration(int i10) {
        this.f14582j = i10;
    }

    public final void setHandleWidth(int i10) {
        this.f14580h = i10;
    }

    public final void setPopupContainer(RelativeLayout relativeLayout) {
        a.p(relativeLayout, w.n("bXMSdGQ_Pg==", "0AvYJllr"));
        this.f14576d = relativeLayout;
    }

    public final void setPopupDrawable(Drawable drawable) {
        getPopupTextView().setBackground(drawable);
    }

    public final void setPopupTextView(TextView textView) {
        a.p(textView, w.n("bXMSdGQ_Pg==", "MO4615mu"));
        this.f14575c = textView;
    }

    public final void setRtl(boolean z6) {
        this.f14594v = z6;
    }

    public final void setTextStyle(int i10) {
        mj.i.E(getPopupTextView(), i10);
    }

    public final void setTrackDrawable(Drawable drawable) {
        LinearLayout linearLayout = this.f14586n;
        if (linearLayout != null) {
            linearLayout.setBackground(drawable);
        } else {
            a.O0(w.n("JXIWYyJWGGV3", "372oVa9R"));
            throw null;
        }
    }

    public final void setTrackMarginEnd(int i10) {
        this.f14578f = i10;
        j();
    }

    public final void setTrackMarginStart(int i10) {
        this.f14577e = i10;
        j();
    }
}
