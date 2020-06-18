package hu.ekreta.ellenorzo.generated.callback;

import android.view.View;

public final class OnClickListener implements View.OnClickListener {
    public final Listener c;
    public final int e;

    public interface Listener {
        void a(int i2, View view);
    }

    public OnClickListener(Listener listener, int i2) {
        this.c = listener;
        this.e = i2;
    }

    public void onClick(View view) {
        this.c.a(this.e, view);
    }
}
