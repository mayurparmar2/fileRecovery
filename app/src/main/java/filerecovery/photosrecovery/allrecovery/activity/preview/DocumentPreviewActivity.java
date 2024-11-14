package filerecovery.photosrecovery.allrecovery.activity.preview;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import cj.w;
import dg.d;
import com.demo.example.R;
import j3.j;
import java.io.File;
import java.util.ArrayList;
import lf.b;
import og.a;
import wf.i;

/* loaded from: classes2.dex */
public class DocumentPreviewActivity extends b {
    public ImageView O;

    @Override // lf.g, android.view.View.OnClickListener
    public void onClick(View view) {
        Uri uri;
        super.onClick(view);
        if (view.getId() == R.id.tv_document_open) {
            j.G(this, d.i(8), w.n("FW8UdSRlH3QdT0NlLFAnZSNpVHccYyZpMGs=", "SJRLHwA0"), w.n("FW8UdSRlH3QdT0NlLFAnZSNpVHccYyZpKms=", "I8jdhj5v"));
            File file = new File(this.f18072j.f24707b);
            Intent intent = new Intent(w.n("Um4CcgFpFS4xbhJlO3QdYVF0L28DLmNJI1c=", "FQ3fnquP"));
            intent.addCategory(w.n("MG4TciZpFS4rbkdlLHR7YzR0VGcscjMuLUUCQTdMVA==", "iDbnrrS3"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            try {
                uri = Build.VERSION.SDK_INT >= 24 ? FileProvider.b(this, getApplicationContext().getPackageName(), file) : Uri.fromFile(file);
            } catch (Exception e10) {
                e10.printStackTrace();
                uri = null;
            }
            if (uri == null) {
                try {
                    uri = Uri.fromFile(file);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (uri == null) {
                try {
                    uri = Uri.fromFile(file);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            if (w.n("I2Fy", "yKJY0VKS").equalsIgnoreCase(this.f18072j.f24720o)) {
                try {
                    intent.setDataAndType(uri, w.n("FHAybCRjL3QgbwUvCi1GYTctVW8EcAtlHHM3ZA==", "2FyZoRWo"));
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            } else {
                try {
                    String n10 = w.n("ey8q", "B03wjACZ");
                    if (!TextUtils.isEmpty(this.f18072j.f24721p)) {
                        n10 = this.f18072j.f24721p;
                    } else if (uri != null) {
                        n10 = getContentResolver().getType(uri);
                    }
                    intent.setDataAndType(uri, n10);
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
            try {
                startActivity(Intent.createChooser(intent, getString(R.string.arg)));
            } catch (Exception e15) {
                e15.printStackTrace();
                a.G0(this, getString(R.string.arg));
            }
        }
    }

    @Override // lf.b
    public final void p0(View view) {
        TextView textView = (TextView) view.findViewById(R.id.tv_document_open);
        textView.setText(getString(R.string.arg).toLowerCase());
        this.O = (ImageView) view.findViewById(R.id.iv_holder);
        textView.setOnClickListener(this);
    }

    @Override // lf.b
    public final ArrayList q0(i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24706a));
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24721p));
        arrayList.add(new vf.b(getString(R.string.arg), iVar.f24707b));
        arrayList.add(new vf.b(getString(R.string.arg), a.G(iVar.f24709d)));
        arrayList.add(new vf.b(getString(R.string.arg), dg.a.D(this, iVar.f24710e)));
        return arrayList;
    }

    @Override // lf.b
    public final int r0() {
        return R.id.vs_document;
    }

    @Override // lf.b
    public final int s0() {
        return R.id.inflate_document_root;
    }

    @Override // lf.b
    public final void t0(i iVar) {
        this.O.setImageResource(a.F(iVar.f24720o, true));
    }

    @Override // lf.b
    public final boolean u0() {
        return false;
    }
}
