package filerecovery.photosrecovery.allrecovery;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14250c;

    public /* synthetic */ c(MainActivity mainActivity, long j4, int i10) {
        this.f14248a = i10;
        this.f14249b = mainActivity;
        this.f14250c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14248a;
        long j4 = this.f14250c;
        MainActivity mainActivity = this.f14249b;
        switch (i10) {
            case 0:
                mainActivity.F.setShowProgress(j4 == -1);
                if (j4 > -1) {
                    mainActivity.F.setSizeStr(og.a.G(j4));
                    break;
                }
                break;
            default:
                mainActivity.f14093w.setVisibility(View.GONE);
                if (mainActivity.f14096z) {
                    mainActivity.f14095y.g();
                }
                mainActivity.f14096z = false;
                mainActivity.f14094x.setVisibility(View.VISIBLE);
                mainActivity.f14094x.setText(og.a.G(j4));
                break;
        }
    }
}
