package filerecovery.photosrecovery.allrecovery.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.demo.example.R;

/* loaded from: classes2.dex */
public class CommonContactEmptyView extends NestedScrollView {
    public final ImageView E;
    public final TextView F;

    public CommonContactEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFillViewport(true);
        View.inflate(context, R.layout.custom_common_contact_empty_view, this);
        this.E = (ImageView) findViewById(R.id.common_empty_iv);
        this.F = (TextView) findViewById(R.id.common_empty_tv_title);
        w();
    }

    public final void w() {
        setVisibility(View.GONE);
    }

    public final void x(int i10, String str) {
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setImageResource(i10);
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
