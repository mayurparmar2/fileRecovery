package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.demo.example.R;

/* loaded from: classes2.dex */
public class ScanFinishedView extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public TextView f14646q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f14647r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14648s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14649t;

    public ScanFinishedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.custom_view_scan_finished, this);
        this.f14646q = (TextView) findViewById(R.id.tv_file_count);
        this.f14647r = (TextView) findViewById(R.id.tv_file_type);
        this.f14648s = (TextView) findViewById(R.id.tv_folders_count);
        this.f14649t = (TextView) findViewById(R.id.tv_folders_type);
    }
}
