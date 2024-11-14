package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a1;
import androidx.recyclerview.widget.v0;

/* loaded from: classes2.dex */
public class CustomLinearLayoutManager extends LinearLayoutManager {
    public CustomLinearLayoutManager(int i10) {
        super(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.o0
    public final void g0(v0 v0Var, a1 a1Var) {
        try {
            super.g0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        }
    }

    public CustomLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public CustomLinearLayoutManager() {
        super(1);
    }
}
