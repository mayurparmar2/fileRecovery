package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes2.dex */
public class FixNestedScrollView extends NestedScrollView {
    public FixNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        try {
            super.onSizeChanged(i10, i11, i12, i13);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
