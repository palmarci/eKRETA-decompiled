package hu.ekreta.ellenorzo.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class OnRefreshListener implements SwipeRefreshLayout.h {

    /* renamed from: a  reason: collision with root package name */
    public final Listener f5597a;
    public final int b;

    public interface Listener {
        void b(int i2);
    }

    public OnRefreshListener(Listener listener, int i2) {
        this.f5597a = listener;
        this.b = i2;
    }

    public void e() {
        this.f5597a.b(this.b);
    }
}
