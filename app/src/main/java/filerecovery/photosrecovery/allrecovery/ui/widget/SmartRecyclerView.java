package filerecovery.photosrecovery.allrecovery.ui.widget;

import ah.b;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d1;
import androidx.recyclerview.widget.o0;
import cj.w;
import kh.s;
import kh.t;
import kh.u;
import kh.v;
import kh.x;
import og.a;

/* loaded from: classes2.dex */
public class SmartRecyclerView extends RecyclerView {
    public final long U0;
    public boolean V0;
    public boolean W0;
    public v X0;
    public final Handler Y0;
    public final ScaleGestureDetector Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f14598a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f14599b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f14600c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f14601d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f14602e1;

    /* renamed from: f1, reason: collision with root package name */
    public final int f14603f1;
    public int g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f14604h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f14605i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f14606j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f14607k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f14608l1;

    /* renamed from: m1, reason: collision with root package name */
    public float f14609m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f14610n1;

    /* renamed from: o1, reason: collision with root package name */
    public final b f14611o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.p(context, w.n("Mm8ZdCx4dA==", "jzXX5IL7"));
        a.p(attributeSet, w.n("MHQDcnM=", "qaWnBzpn"));
        this.U0 = 25L;
        this.Y0 = new Handler();
        this.f14599b1 = -1;
        this.f14609m1 = 1.0f;
        this.f14603f1 = 20;
        if (getLayoutManager() instanceof LinearLayoutManager) {
            o0 layoutManager = getLayoutManager();
            a.n(layoutManager, w.n("P3UbbGljEG4sb0cgIGV1YzRzRSA3b2puV24cbgRsWSAleQdlaWEfZDBvWmQ6LidlNnlSbCZyPGlddx93GGRSZSUuO2knZRByDmFKbzd0GGE7YVZlcg==", "81q5WSMX"));
        }
        this.Z0 = new ScaleGestureDetector(getContext(), new t(new x(this)));
        this.f14611o1 = new b(this, 10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void U() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r0 != 3) goto L62;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a.p(motionEvent, w.n("LXY=", "LdH1AOgU"));
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.f14598a1) {
            try {
                super.dispatchTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        int action = motionEvent.getAction();
        b bVar = this.f14611o1;
        Handler handler = this.Y0;
        if (action != 1) {
            if (action == 2) {
                if (this.f14598a1) {
                    try {
                        int k02 = k0(motionEvent);
                        if (this.f14603f1 > -1) {
                            int i10 = this.g1;
                            int y10 = (int) motionEvent.getY();
                            boolean z6 = y10 >= 0 && y10 <= i10;
                            long j4 = this.U0;
                            if (z6) {
                                this.f14608l1 = false;
                                if (!this.f14607k1) {
                                    this.f14607k1 = true;
                                    handler.removeCallbacks(bVar);
                                    handler.postDelayed(bVar, j4);
                                }
                                this.f14606j1 = ((int) ((this.g1 - 0) - (motionEvent.getY() - 0))) / 2;
                            } else {
                                int i11 = this.f14604h1;
                                int i12 = this.f14605i1;
                                int y11 = (int) motionEvent.getY();
                                if (i11 <= y11 && y11 <= i12) {
                                    this.f14607k1 = false;
                                    if (!this.f14608l1) {
                                        this.f14608l1 = true;
                                        handler.removeCallbacks(bVar);
                                        handler.postDelayed(bVar, j4);
                                    }
                                    this.f14606j1 = ((int) ((motionEvent.getY() + this.f14605i1) - (this.f14604h1 + r2))) / 2;
                                } else if (this.f14607k1 || this.f14608l1) {
                                    handler.removeCallbacks(bVar);
                                    this.f14607k1 = false;
                                    this.f14608l1 = false;
                                }
                            }
                        }
                        if (k02 != -1 && this.f14599b1 != k02) {
                            this.f14599b1 = k02;
                            if (this.f14600c1 == -1) {
                                this.f14600c1 = k02;
                            }
                            if (this.f14601d1 == -1) {
                                this.f14601d1 = k02;
                            }
                            if (k02 > this.f14601d1) {
                                this.f14601d1 = k02;
                            }
                            if (k02 < this.f14600c1) {
                                this.f14600c1 = k02;
                            }
                            if (this.f14602e1 == k02) {
                                this.f14600c1 = k02;
                                this.f14601d1 = k02;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
            if (this.V0) {
                return this.Z0.onTouchEvent(motionEvent);
            }
            return true;
        }
        this.f14598a1 = false;
        this.f14607k1 = false;
        this.f14608l1 = false;
        handler.removeCallbacks(bVar);
        this.f14609m1 = 1.0f;
        this.f14610n1 = System.currentTimeMillis();
        return true;
    }

    public final s getEndlessScrollListener() {
        return null;
    }

    public final kh.w getRecyclerScrollCallback() {
        return null;
    }

    public final int k0(MotionEvent motionEvent) {
        View view;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int e10 = this.f1807e.e() - 1;
        while (true) {
            if (e10 < 0) {
                view = null;
                break;
            }
            view = this.f1807e.d(e10);
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            if (x10 >= view.getLeft() + translationX && x10 <= view.getRight() + translationX && y10 >= view.getTop() + translationY && y10 <= view.getBottom() + translationY) {
                break;
            }
            e10--;
        }
        if (view == null) {
            return -1;
        }
        if (view.getTag() != null) {
            boolean z6 = view.getTag() instanceof d1;
        }
        Object tag = view.getTag();
        a.n(tag, w.n("P3UbbGljEG4sb0cgIGV1YzRzRSA3b2puWG5sbgRsXCAleQdlaWEfZDBvWmQ6LidlNnlSbCZyPGlSd293GGRXZSUuJWUqeRJsJ3JlaSd3e1Y8ZUZILGwuZXI=", "7Aq0fDE3"));
        return ((d1) tag).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f14603f1;
        if (i12 > -1) {
            this.g1 = i12 + 0;
            this.f14604h1 = (getMeasuredHeight() - i12) + 0;
            this.f14605i1 = getMeasuredHeight() + 0;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public final void setDragSelectActive(int i10) {
        if (this.f14598a1 || !this.W0) {
            return;
        }
        this.f14599b1 = -1;
        this.f14600c1 = -1;
        this.f14601d1 = -1;
        this.f14602e1 = i10;
        this.f14598a1 = true;
    }

    public final void setEndlessScrollListener(s sVar) {
    }

    public final void setRecyclerScrollCallback(kh.w wVar) {
    }

    public final void setupDragListener(u uVar) {
        this.W0 = uVar != null;
    }

    public final void setupZoomListener(v vVar) {
        this.V0 = vVar != null;
        this.X0 = vVar;
    }
}
