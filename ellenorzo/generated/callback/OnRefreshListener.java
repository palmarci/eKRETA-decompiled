package p289hu.ekreta.ellenorzo.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;

/* renamed from: hu.ekreta.ellenorzo.generated.callback.OnRefreshListener */
public final class OnRefreshListener implements C2948h {

    /* renamed from: a */
    public final Listener f13291a;

    /* renamed from: b */
    public final int f13292b;

    /* renamed from: hu.ekreta.ellenorzo.generated.callback.OnRefreshListener$Listener */
    public interface Listener {
        /* renamed from: b */
        void mo12351b(int i);
    }

    public OnRefreshListener(Listener listener, int i) {
        this.f13291a = listener;
        this.f13292b = i;
    }

    /* renamed from: e */
    public void mo6978e() {
        this.f13291a.mo12351b(this.f13292b);
    }
}
