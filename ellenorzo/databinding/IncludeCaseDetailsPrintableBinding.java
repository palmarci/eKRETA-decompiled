package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsPrintableBinding */
public abstract class IncludeCaseDetailsPrintableBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12465A;

    /* renamed from: B */
    public String f12466B;

    /* renamed from: C */
    public OnClickListener f12467C;

    /* renamed from: z */
    public final TextView f12468z;

    public IncludeCaseDetailsPrintableBinding(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f12468z = textView;
        this.f12465A = textView2;
    }

    /* renamed from: a */
    public abstract void mo12432a(OnClickListener onClickListener);

    /* renamed from: q */
    public abstract void mo12433q(String str);
}
