package hu.ekreta.ellenorzo.generated.callback;

import android.widget.CompoundButton;

public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Listener f5596a;
    public final int b;

    public interface Listener {
        void a(int i2, CompoundButton compoundButton, boolean z);
    }

    public OnCheckedChangeListener(Listener listener, int i2) {
        this.f5596a = listener;
        this.b = i2;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f5596a.a(this.b, compoundButton, z);
    }
}
