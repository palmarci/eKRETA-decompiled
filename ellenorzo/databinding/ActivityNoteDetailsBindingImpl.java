package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.notes.NoteDetailsViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNoteDetailsBindingImpl */
public class ActivityNoteDetailsBindingImpl extends ActivityNoteDetailsBinding {

    /* renamed from: L */
    public static final C2867f f12175L = null;

    /* renamed from: M */
    public static final SparseIntArray f12176M = new SparseIntArray();

    /* renamed from: J */
    public final CoordinatorLayout f12177J;

    /* renamed from: K */
    public long f12178K = -1;

    static {
        f12176M.put(C4014R.C4016id.app_bar_layout, 10);
        f12176M.put(C4014R.C4016id.toolbar, 11);
        f12176M.put(C4014R.C4016id.nested_scroll_view, 12);
        f12176M.put(C4014R.C4016id.constraint_layout, 13);
        f12176M.put(C4014R.C4016id.type_caption, 14);
        f12176M.put(C4014R.C4016id.type_divider, 15);
        f12176M.put(C4014R.C4016id.title_caption, 16);
        f12176M.put(C4014R.C4016id.title_divider, 17);
        f12176M.put(C4014R.C4016id.content_caption, 18);
        f12176M.put(C4014R.C4016id.content_divider, 19);
        f12176M.put(C4014R.C4016id.date_caption, 20);
        f12176M.put(C4014R.C4016id.room_divider, 21);
        f12176M.put(C4014R.C4016id.teacher_caption, 22);
        f12176M.put(C4014R.C4016id.teacher_divider, 23);
        f12176M.put(C4014R.C4016id.creating_time_caption, 24);
    }

    public ActivityNoteDetailsBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 25, f12175L, f12176M);
        super(fVar, view, 1, (AppBarLayout) a[10], (ConstraintLayout) a[13], (TextView) a[18], (View) a[19], (TextView) a[6], (TextView) a[24], (TextView) a[9], (TextView) a[20], (TextView) a[7], (TextView) a[1], (View) a[3], (TextView) a[2], (NestedScrollView) a[12], (View) a[21], (TextView) a[22], (View) a[23], (TextView) a[8], (TextView) a[16], (View) a[17], (TextView) a[5], (Toolbar) a[11], (TextView) a[14], (View) a[15], (TextView) a[4]);
        this.f12174z.setTag(null);
        this.f12165A.setTag(null);
        this.f12166B.setTag(null);
        this.f12167C.setTag(null);
        this.f12168D.setTag(null);
        this.f12169E.setTag(null);
        this.f12177J = (CoordinatorLayout) a[0];
        this.f12177J.setTag(null);
        this.f12170F.setTag(null);
        this.f12171G.setTag(null);
        this.f12172H.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        synchronized (this) {
            j = this.f12178K;
            this.f12178K = 0;
        }
        NoteDetailsViewModel noteDetailsViewModel = this.f12173I;
        String str2 = null;
        if ((511 & j) != 0) {
            charSequence4 = ((j & 385) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.mo13585y();
            String p = ((j & 259) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.mo13583p();
            CharSequence x0 = ((j & 273) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.mo13584x0();
            CharSequence h = ((j & 289) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.mo13581h();
            CharSequence m = ((j & 321) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.mo13582m();
            CharSequence title = ((j & 265) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.getTitle();
            if (!((j & 261) == 0 || noteDetailsViewModel == null)) {
                str2 = noteDetailsViewModel.getType();
            }
            str = str2;
            charSequence5 = x0;
            charSequence2 = m;
            charSequence = title;
            str2 = p;
            charSequence3 = h;
        } else {
            charSequence5 = null;
            charSequence4 = null;
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
            str = null;
        }
        if ((j & 273) != 0) {
            C3158a.m7850a(this.f12174z, charSequence5);
        }
        if ((j & 385) != 0) {
            C3158a.m7850a(this.f12165A, charSequence4);
        }
        if ((j & 289) != 0) {
            C3158a.m7850a(this.f12166B, charSequence3);
        }
        if ((j & 259) != 0) {
            this.f12167C.setVisibility(BindingConverters.m14793a(str2));
            this.f12168D.setVisibility(BindingConverters.m14793a(str2));
            String str3 = str2;
            C3158a.m7850a(this.f12169E, (CharSequence) str3);
            this.f12169E.setVisibility(BindingConverters.m14793a(str3));
        }
        if ((j & 321) != 0) {
            C3158a.m7850a(this.f12170F, charSequence2);
        }
        if ((265 & j) != 0) {
            C3158a.m7850a(this.f12171G, charSequence);
        }
        if ((j & 261) != 0) {
            C3158a.m7850a(this.f12172H, (CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12178K != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12178K = 256;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12366a(NoteDetailsViewModel noteDetailsViewModel) {
        mo6103a(0, (C3705i) noteDetailsViewModel);
        this.f12173I = noteDetailsViewModel;
        synchronized (this) {
            this.f12178K |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12366a((NoteDetailsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12367e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12178K |= 1;
            }
            return true;
        } else if (i == 79) {
            synchronized (this) {
                this.f12178K |= 2;
            }
            return true;
        } else if (i == 9) {
            synchronized (this) {
                this.f12178K |= 4;
            }
            return true;
        } else if (i == 95) {
            synchronized (this) {
                this.f12178K |= 8;
            }
            return true;
        } else if (i == 96) {
            synchronized (this) {
                this.f12178K |= 16;
            }
            return true;
        } else if (i == 64) {
            synchronized (this) {
                this.f12178K |= 32;
            }
            return true;
        } else if (i == 99) {
            synchronized (this) {
                this.f12178K |= 64;
            }
            return true;
        } else if (i != 47) {
            return false;
        } else {
            synchronized (this) {
                this.f12178K |= 128;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        NoteDetailsViewModel noteDetailsViewModel = (NoteDetailsViewModel) obj;
        return mo12367e(i2);
    }
}
