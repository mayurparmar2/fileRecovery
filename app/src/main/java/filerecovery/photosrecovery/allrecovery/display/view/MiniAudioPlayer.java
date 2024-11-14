package filerecovery.photosrecovery.allrecovery.display.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

import cg.a;
import cg.b;
import com.demo.example.R;
import sj.f;
import wf.i;

/* loaded from: classes2.dex */
public class MiniAudioPlayer extends ConstraintLayout implements View.OnClickListener {
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public AppCompatImageView f14314q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatImageView f14315r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14316s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14317t;

    /* renamed from: u, reason: collision with root package name */
    public SeekBar f14318u;

    /* renamed from: v, reason: collision with root package name */
    public i f14319v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14320w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14321x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14322y;

    /* renamed from: z, reason: collision with root package name */
    public final b f14323z;

    public MiniAudioPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14322y = false;
        this.f14323z = new b(this);
        View.inflate(context, R.layout.mini_audio_player, this);
        setBackgroundResource(R.drawable.shape_mini_audio_player_bg);
        this.f14314q = (AppCompatImageView) findViewById(R.id.mini_player_iv_start);
        this.f14315r = (AppCompatImageView) findViewById(R.id.mini_player_iv_close);
        this.f14316s = (TextView) findViewById(R.id.mini_player_tv_current_time);
        this.f14317t = (TextView) findViewById(R.id.mini_player_tv_total_time);
        this.f14318u = (SeekBar) findViewById(R.id.mini_player_progress);
        this.f14314q.setOnClickListener(this);
        this.f14315r.setOnClickListener(this);
        this.f14318u.setOnSeekBarChangeListener(new a(this));
    }

    public static void m(MiniAudioPlayer miniAudioPlayer, int i10) {
        if (miniAudioPlayer.f14318u.getMax() == 0 || (i10 > 0 && i10 != miniAudioPlayer.f14318u.getMax())) {
            miniAudioPlayer.f14319v.f24717l = i10;
            miniAudioPlayer.f14318u.setMax(i10);
            miniAudioPlayer.f14317t.setText(dg.a.k0(Math.max(miniAudioPlayer.f14319v.f24717l, 1000)));
        }
    }

    public final void n(i iVar, boolean z6) {
        this.f14319v = iVar;
        this.f14320w = z6;
        if (!f.h()) {
            f.f21192e.f14309f.add(this.f14323z);
        }
        this.f14318u.setMax(iVar.f24717l);
        this.f14317t.setText(dg.a.k0(Math.max(iVar.f24717l, 1000)));
        this.f14318u.setProgress(f.s());
        this.f14316s.setText(dg.a.k0(f.s()));
        this.f14314q.setSelected(f.B());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.mini_player_iv_start) {
            f.T();
        } else if (id2 == R.id.mini_player_iv_close) {
            this.A = true;
            setVisibilityWithAnimal(8);
            f.m();
        }
    }

    public void setCustomVisibility(int i10) {
        if (this.f14321x) {
            return;
        }
        super.setVisibility(i10);
    }

    public void setVisibilityWithAnimal(int i10) {
        if (getVisibility() == i10) {
            return;
        }
        this.f14321x = true;
        AlphaAnimation alphaAnimation = i10 == 0 ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        setAnimation(alphaAnimation);
        super.setVisibility(i10);
        this.f14321x = false;
    }
}
