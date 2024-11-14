package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class MyImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14645a;

    public MyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14645a = context;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Error e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setPosition(String str) {
    }
}
