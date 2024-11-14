package filerecovery.photosrecovery.allrecovery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.demo.example.R;
import filerecovery.photosrecovery.allrecovery.o;

/* loaded from: classes2.dex */
public class CleanerItemView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14627a;

    /* renamed from: b, reason: collision with root package name */
    public LottieAnimationView f14628b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f14629c;

    public CleanerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View.inflate(context, R.layout.custom_view_cleaner_item, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o.f14346c, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(R.dimen.dp_18));
        String string = obtainStyledAttributes.getString(5);
        String string2 = obtainStyledAttributes.getString(0);
        this.f14627a = obtainStyledAttributes.getBoolean(4, false);
        int color = obtainStyledAttributes.getColor(3, getContext().getResources().getColor(R.color.color_78869d_white60));
        obtainStyledAttributes.recycle();
        TextView textView = (TextView) findViewById(R.id.tv_clean_title);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMarginStart(dimensionPixelSize);
        textView.setLayoutParams(layoutParams);
        ImageView imageView = (ImageView) findViewById(R.id.iv_clean_icon);
        this.f14629c = (TextView) findViewById(R.id.tv_clean_size);
        this.f14628b = (LottieAnimationView) findViewById(R.id.progress_clean_loading);
        this.f14629c.setTextColor(color);
        if (!TextUtils.isEmpty(string)) {
            textView.setText(string);
        }
        if (resourceId != 0) {
            imageView.setImageResource(resourceId);
        }
        if (!TextUtils.isEmpty(string2)) {
            this.f14629c.setText(string2);
        }
        if (this.f14627a) {
            this.f14629c.setVisibility(View.GONE);
            this.f14628b.setVisibility(View.VISIBLE);
        } else {
            this.f14629c.setVisibility(View.VISIBLE);
            this.f14628b.setVisibility(View.GONE);
        }
    }

    public void setRightViewVisible(int i10) {
        TextView textView = this.f14629c;
        if (textView != null) {
            textView.setVisibility(i10);
        }
        LottieAnimationView lottieAnimationView = this.f14628b;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(i10);
        }
    }

    public void setShowProgress(boolean z6) {
        this.f14627a = z6;
        if (z6) {
            TextView textView = this.f14629c;
            if (textView != null) {
                textView.setVisibility(View.GONE);
            }
            LottieAnimationView lottieAnimationView = this.f14628b;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(View.VISIBLE);
            }
        } else {
            TextView textView2 = this.f14629c;
            if (textView2 != null) {
                textView2.setVisibility(View.VISIBLE);
            }
            LottieAnimationView lottieAnimationView2 = this.f14628b;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setVisibility(View.GONE);
            }
        }
        postInvalidate();
    }

    public void setSizeStr(CharSequence charSequence) {
        TextView textView;
        if (TextUtils.isEmpty(charSequence) || (textView = this.f14629c) == null) {
            return;
        }
        textView.setText(charSequence);
        postInvalidate();
    }
}
