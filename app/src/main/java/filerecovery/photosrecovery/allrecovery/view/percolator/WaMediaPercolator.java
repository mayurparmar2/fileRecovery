package filerecovery.photosrecovery.allrecovery.view.percolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.lib.libbase.zjview.CustomRoundImageView;
import com.demo.example.R;
import l0.g;
import th.d;

/* loaded from: classes2.dex */
public class WaMediaPercolator extends FilePercolator {
    public WaMediaPercolator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // filerecovery.photosrecovery.allrecovery.view.percolator.FilePercolator
    public final void n(Context context) {
        super.n(context);
        View findViewById = findViewById(R.id.layout_media_line);
        CustomRoundImageView customRoundImageView = this.A;
        if (customRoundImageView != null) {
            customRoundImageView.setImageResource(R.color.color_100_008069_1F2C34);
        }
        d dVar = this.f14663q;
        dVar.f22082f = R.color.wa_media_percolator_ic_tint_selector;
        dVar.f22083g = R.color.color_100_ffffff;
        this.B.setBackgroundResource(R.color.color_25_15_white);
        findViewById.setBackgroundResource(R.color.color_100_ffffff);
        this.f14666t.setTextColor(g.b(getContext(), R.color.color_100_ffffff));
        this.f14667u.setTextColor(g.b(getContext(), R.color.color_100_ffffff));
        this.f14666t.setBackgroundResource(R.drawable.shape_15_white_radio_8);
        this.f14667u.setBackgroundResource(R.drawable.shape_15_white_radio_8);
    }
}
