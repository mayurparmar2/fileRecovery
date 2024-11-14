package filerecovery.photosrecovery.allrecovery.ui.widget;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import cj.w;
import filerecovery.photosrecovery.allrecovery.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.c;
import kh.d;
import o0.q;

/* loaded from: classes2.dex */
public class AutoSpanTextView extends AppCompatTextView {

    /* renamed from: h, reason: collision with root package name */
    public final String f14537h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14538i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14539j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14540k;

    /* renamed from: l, reason: collision with root package name */
    public String f14541l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14542m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14543n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14544o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14545p;

    public AutoSpanTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setLabelText(CharSequence charSequence) {
        int i10;
        Typeface typeface;
        String str = this.f14541l;
        if (TextUtils.isEmpty(charSequence)) {
            setText("");
            return;
        }
        this.f14541l = str;
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        String str2 = this.f14537h;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str3 = this.f14538i;
        if (isEmpty || TextUtils.isEmpty(str3)) {
            i10 = 0;
        } else {
            StringBuilder s5 = a.s(str2);
            s5.append(w.n("Hy5yPyk=", "4b7Xms2m"));
            s5.append(str3);
            Matcher matcher = Pattern.compile(s5.toString()).matcher(charSequence2);
            i10 = 0;
            while (matcher.find()) {
                int start = matcher.start() - i10;
                spannableStringBuilder.delete(start, str2.length() + start);
                int end = (matcher.end() - str2.length()) - i10;
                spannableStringBuilder.delete(end - str3.length(), end);
                int i11 = this.f14544o;
                if (i11 != 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), start, end - str3.length(), 33);
                }
                int i12 = this.f14545p;
                if (i12 != 0) {
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i12), start, end - str3.length(), 33);
                }
                int i13 = this.f14543n;
                if (i13 != 0) {
                    try {
                        typeface = q.b(getContext(), i13);
                    } catch (Resources.NotFoundException e10) {
                        e10.printStackTrace();
                        typeface = null;
                    }
                    if (typeface != null) {
                        spannableStringBuilder.setSpan(new d(typeface), start, end - str3.length(), 33);
                    }
                }
                i10 += str3.length() + str2.length();
            }
        }
        String str4 = this.f14539j;
        if (!TextUtils.isEmpty(str4)) {
            String str5 = this.f14540k;
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(this.f14541l)) {
                StringBuilder s10 = a.s(str4);
                s10.append(w.n("eS5dPyk=", "1C1VA70W"));
                s10.append(str5);
                Matcher matcher2 = Pattern.compile(s10.toString()).matcher(charSequence2);
                while (matcher2.find()) {
                    int start2 = matcher2.start() - i10;
                    spannableStringBuilder.delete(start2, str2.length() + start2);
                    int end2 = (matcher2.end() - str2.length()) - i10;
                    spannableStringBuilder.delete(end2 - str3.length(), end2);
                    spannableStringBuilder.setSpan(new c(this), start2, end2 - str3.length(), 33);
                    i10 += str3.length() + str2.length();
                }
                setMovementMethod(LinkMovementMethod.getInstance());
                setLinksClickable(true);
                setAutoLinkMask(15);
                setFocusable(false);
            }
        }
        setText(spannableStringBuilder);
    }

    public AutoSpanTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o.f14344a, 0, 0);
        this.f14537h = obtainStyledAttributes.getString(8);
        this.f14538i = obtainStyledAttributes.getString(0);
        this.f14539j = obtainStyledAttributes.getString(7);
        this.f14540k = obtainStyledAttributes.getString(6);
        this.f14542m = obtainStyledAttributes.getColor(5, 0);
        this.f14541l = obtainStyledAttributes.getString(4);
        this.f14543n = obtainStyledAttributes.getResourceId(2, 0);
        this.f14544o = obtainStyledAttributes.getColor(1, 0);
        this.f14545p = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
        setLabelText(getText());
    }
}
