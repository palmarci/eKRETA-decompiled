package hu.ekreta.ellenorzo.generated.callback;

import hu.ekreta.ellenorzo.util.binding.SpinnerBindings;

public final class SpinnerItemSelectedListener implements SpinnerBindings.SpinnerItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final Listener f5598a;
    public final int b;

    public interface Listener {
        void b(int i2, Object obj);
    }

    public SpinnerItemSelectedListener(Listener listener, int i2) {
        this.f5598a = listener;
        this.b = i2;
    }

    public void a(Object obj) {
        this.f5598a.b(this.b, obj);
    }
}
