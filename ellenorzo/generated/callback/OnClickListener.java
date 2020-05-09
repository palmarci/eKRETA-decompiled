package p289hu.ekreta.ellenorzo.generated.callback;

import android.view.View;

/* renamed from: hu.ekreta.ellenorzo.generated.callback.OnClickListener */
public final class OnClickListener implements android.view.View.OnClickListener {

    /* renamed from: c */
    public final Listener f13289c;

    /* renamed from: e */
    public final int f13290e;

    /* renamed from: hu.ekreta.ellenorzo.generated.callback.OnClickListener$Listener */
    public interface Listener {
        /* renamed from: a */
        void mo12329a(int i, View view);
    }

    public OnClickListener(Listener listener, int i) {
        this.f13289c = listener;
        this.f13290e = i;
    }

    public void onClick(View view) {
        this.f13289c.mo12329a(this.f13290e, view);
    }
}
