package filerecovery.photosrecovery.allrecovery.activity;

import android.os.Bundle;
import j.p;
import java.nio.charset.Charset;
import java.util.Arrays;
import sd.a;

/* loaded from: classes2.dex */
public class EmptyActivity extends p {
    @Override // androidx.fragment.app.w, androidx.activity.i, l0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c10;
        super.onCreate(bundle);
        a.c(this);
        try {
            String substring = ee.a.b(this).substring(866, 897);
            og.a.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = bj.a.f2786a;
            byte[] bytes = substring.getBytes(charset);
            og.a.o(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "483e7639d299ea84e05c528b3cbf129".getBytes(charset);
            og.a.o(bytes2, "this as java.lang.String).getBytes(charset)");
            if (System.currentTimeMillis() % 2 == 0) {
                int c11 = ee.a.f13367a.c(bytes.length / 2);
                int i10 = 0;
                while (true) {
                    if (i10 > c11) {
                        c10 = 0;
                        break;
                    } else {
                        if (bytes[i10] != bytes2[i10]) {
                            c10 = 16;
                            break;
                        }
                        i10++;
                    }
                }
                if ((c10 ^ 0) != 0) {
                    ee.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                ee.a.a();
                throw null;
            }
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
            ee.a.a();
            throw null;
        }
    }
}
