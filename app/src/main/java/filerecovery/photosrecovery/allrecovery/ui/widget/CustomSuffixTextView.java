package filerecovery.photosrecovery.allrecovery.ui.widget;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import e2.s;

/* loaded from: classes2.dex */
public class CustomSuffixTextView extends AppCompatTextView {

    /* renamed from: h, reason: collision with root package name */
    public String f14560h;

    public CustomSuffixTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private Layout getValidLayout() {
        return getLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int maxLines = getMaxLines();
        if (TextUtils.isEmpty(this.f14560h) || maxLines <= 0 || maxLines >= getLineCount() || getLayout() == null) {
            return;
        }
        TextPaint paint = getPaint();
        String str = this.f14560h;
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            i13 = (int) (i13 + fArr[i14]);
        }
        int i15 = maxLines - 1;
        if (getLayout().getLineRight(i15) + i13 >= getLayout().getWidth()) {
            int i16 = 0;
            while (true) {
                if (i16 >= 100) {
                    i16 = 0;
                    break;
                }
                int lineEnd = getValidLayout().getLineEnd(getMaxLines() - 1);
                int lineStart = getValidLayout().getLineStart(getMaxLines() - 1);
                int i17 = lineEnd - i16;
                if (i17 > lineStart) {
                    String substring = getText().toString().substring(lineStart, i17);
                    TextPaint paint2 = getPaint();
                    int length2 = substring.length();
                    float[] fArr2 = new float[length2];
                    paint2.getTextWidths(substring, fArr2);
                    i12 = 0;
                    for (int i18 = 0; i18 < length2; i18++) {
                        i12 = (int) (i12 + fArr2[i18]);
                    }
                } else {
                    i12 = 0;
                }
                if (i12 + i13 < getLayout().getWidth()) {
                    break;
                } else {
                    i16++;
                }
            }
            int lineStart2 = getValidLayout().getLineStart(i15);
            String charSequence = getText().toString();
            StringBuilder n10 = s.n(charSequence.substring(0, lineStart2), charSequence.substring(lineStart2, getLayout().getLineEnd(i15) - i16));
            n10.append(this.f14560h);
            setText(n10.toString());
        }
    }
}
