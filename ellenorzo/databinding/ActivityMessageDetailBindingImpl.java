package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
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
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.message.MessageDetailViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;
import p289hu.ekreta.ellenorzo.util.binding.WebViewBindings;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBindingImpl */
public class ActivityMessageDetailBindingImpl extends ActivityMessageDetailBinding {

    /* renamed from: K */
    public static final C2867f f12135K = null;

    /* renamed from: L */
    public static final SparseIntArray f12136L = new SparseIntArray();

    /* renamed from: H */
    public final CoordinatorLayout f12137H;

    /* renamed from: I */
    public final ConstraintLayout f12138I;

    /* renamed from: J */
    public long f12139J = -1;

    static {
        f12136L.put(C4014R.C4016id.app_bar_layout, 9);
        f12136L.put(C4014R.C4016id.toolbar, 10);
        f12136L.put(C4014R.C4016id.nested_scroll_view, 11);
        f12136L.put(C4014R.C4016id.message_addressee_caption, 12);
    }

    public ActivityMessageDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 13, f12135K, f12136L);
        super(fVar, view, 1, (AppBarLayout) a[9], (TextView) a[12], (TextView) a[3], (AttachmentView) a[7], (TextView) a[4], (TextView) a[2], (TextView) a[5], (WebView) a[6], (NestedScrollView) a[11], (FrameLayout) a[8], (Toolbar) a[10]);
        this.f12137H = (CoordinatorLayout) a[0];
        this.f12137H.setTag(null);
        this.f12138I = (ConstraintLayout) a[1];
        this.f12138I.setTag(null);
        this.f12134z.setTag(null);
        this.f12127A.setTag(null);
        this.f12128B.setTag(null);
        this.f12129C.setTag(null);
        this.f12130D.setTag(null);
        this.f12131E.setTag(null);
        this.f12132F.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        String str;
        String str2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        synchronized (this) {
            j = this.f12139J;
            this.f12139J = 0;
        }
        MessageDetailViewModel messageDetailViewModel = this.f12133G;
        boolean z2 = false;
        String str3 = null;
        if ((511 & j) != 0) {
            boolean d = ((j & 385) == 0 || messageDetailViewModel == null) ? false : messageDetailViewModel.mo11494d();
            charSequence = ((j & 265) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.mo13321h();
            CharSequence p0 = ((j & 259) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.mo13322p0();
            String q0 = ((j & 289) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.mo13323q0();
            CharSequence X = ((j & 261) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.mo13318X();
            if (!((j & 321) == 0 || messageDetailViewModel == null)) {
                z2 = messageDetailViewModel.mo11497g();
            }
            if (!((j & 273) == 0 || messageDetailViewModel == null)) {
                str3 = messageDetailViewModel.mo13324s0();
            }
            str2 = str3;
            str = q0;
            charSequence3 = X;
            z = d;
            charSequence2 = p0;
        } else {
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
            str2 = null;
            str = null;
            z = false;
        }
        if ((j & 261) != 0) {
            C3158a.m7850a(this.f12134z, charSequence3);
        }
        if ((j & 321) != 0) {
            this.f12127A.setVisibility(BindingConverters.m14795a(z2));
        }
        if ((j & 265) != 0) {
            C3158a.m7850a(this.f12128B, charSequence);
        }
        if ((j & 259) != 0) {
            C3158a.m7850a(this.f12129C, charSequence2);
        }
        if ((273 & j) != 0) {
            C3158a.m7850a(this.f12130D, (CharSequence) str2);
        }
        if ((289 & j) != 0) {
            WebViewBindings.Companion.mo16308a(this.f12131E, str);
        }
        if ((j & 385) != 0) {
            this.f12132F.setVisibility(BindingConverters.m14795a(z));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12139J != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12139J = 256;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12361a(MessageDetailViewModel messageDetailViewModel) {
        mo6103a(0, (C3705i) messageDetailViewModel);
        this.f12133G = messageDetailViewModel;
        synchronized (this) {
            this.f12139J |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12361a((MessageDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12362e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12139J |= 1;
            }
            return true;
        } else if (i == 110) {
            synchronized (this) {
                this.f12139J |= 2;
            }
            return true;
        } else if (i == 108) {
            synchronized (this) {
                this.f12139J |= 4;
            }
            return true;
        } else if (i == 64) {
            synchronized (this) {
                this.f12139J |= 8;
            }
            return true;
        } else if (i == 104) {
            synchronized (this) {
                this.f12139J |= 16;
            }
            return true;
        } else if (i == 18) {
            synchronized (this) {
                this.f12139J |= 32;
            }
            return true;
        } else if (i == 3) {
            synchronized (this) {
                this.f12139J |= 64;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12139J |= 128;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        MessageDetailViewModel messageDetailViewModel = (MessageDetailViewModel) obj;
        return mo12362e(i2);
    }
}
