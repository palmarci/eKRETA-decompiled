package hu.ekreta.ellenorzo.generated.callback;

public final class ItemSelectedListener implements hu.ekreta.ellenorzo.util.binding.ItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final Listener f5595a;
    public final int b;

    public interface Listener {
        void a(int i2, Object obj);
    }

    public ItemSelectedListener(Listener listener, int i2) {
        this.f5595a = listener;
        this.b = i2;
    }

    public void a(Object obj) {
        this.f5595a.a(this.b, obj);
    }
}
