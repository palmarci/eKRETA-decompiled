package p289hu.ekreta.ellenorzo.generated.callback;

/* renamed from: hu.ekreta.ellenorzo.generated.callback.ItemSelectedListener */
public final class ItemSelectedListener implements p289hu.ekreta.ellenorzo.util.binding.ItemSelectedListener {

    /* renamed from: a */
    public final Listener f13287a;

    /* renamed from: b */
    public final int f13288b;

    /* renamed from: hu.ekreta.ellenorzo.generated.callback.ItemSelectedListener$Listener */
    public interface Listener {
        /* renamed from: a */
        void mo12415a(int i, Object obj);
    }

    public ItemSelectedListener(Listener listener, int i) {
        this.f13287a = listener;
        this.f13288b = i;
    }

    /* renamed from: a */
    public void mo12748a(Object obj) {
        this.f13287a.mo12415a(this.f13288b, obj);
    }
}
