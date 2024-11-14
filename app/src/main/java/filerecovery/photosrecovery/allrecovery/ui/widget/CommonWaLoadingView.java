package filerecovery.photosrecovery.allrecovery.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.demo.example.R;

/* loaded from: classes2.dex */
public class CommonWaLoadingView extends LinearLayout {
    public CommonWaLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        View.inflate(context, R.layout.custom_common_loading_view, this);
        a();
    }

    public final void a() {
        setVisibility(View.GONE);
    }
}
