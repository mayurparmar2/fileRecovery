package filerecovery.photosrecovery.allrecovery.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kh.y;

/* loaded from: classes2.dex */
public class InterceptTouchFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public y f14571a;

    public InterceptTouchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f14571a;
        if (yVar != null) {
            yVar.b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setTopTouchListener(y yVar) {
        this.f14571a = yVar;
    }
}
