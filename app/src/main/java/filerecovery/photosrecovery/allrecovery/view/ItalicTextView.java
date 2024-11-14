package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import cj.w;
import filerecovery.photosrecovery.allrecovery.ui.widget.AutoSpanTextView;
import og.a;

/* loaded from: classes2.dex */
public class ItalicTextView extends AutoSpanTextView {

    /* renamed from: q, reason: collision with root package name */
    public boolean f14644q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItalicTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a.p(context, w.n("Mm8ZdCx4dA==", "0vgTXZmp"));
        w.n("Mm8ZdCx4dA==", "wdUZTEag");
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        return (!this.f14644q || getLayoutDirection() == 1) ? super.getCompoundPaddingLeft() : (int) Math.max(0.0f, super.getCompoundPaddingLeft() - (getTextSize() / 5.0f));
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        return (this.f14644q && getLayoutDirection() == 1) ? (int) Math.max(0.0f, super.getCompoundPaddingLeft() - (getTextSize() / 5.0f)) : super.getCompoundPaddingRight();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        a.p(canvas, w.n("FmEsdixz", "iOxAtLXv"));
        this.f14644q = true;
        super.onDraw(canvas);
        this.f14644q = false;
    }
}
