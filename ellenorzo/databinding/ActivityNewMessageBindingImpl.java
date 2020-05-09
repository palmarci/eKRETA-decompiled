package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3704h;
import p211h.p258l.C3705i;
import p211h.p258l.p259o.C3718d;
import p211h.p258l.p259o.C3719e;
import p211h.p258l.p259o.C3720f;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl */
public class ActivityNewMessageBindingImpl extends ActivityNewMessageBinding {

    /* renamed from: L */
    public static final C2867f f12146L = null;

    /* renamed from: M */
    public static final SparseIntArray f12147M = new SparseIntArray();

    /* renamed from: F */
    public final CoordinatorLayout f12148F;

    /* renamed from: G */
    public C3704h f12149G = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityNewMessageBindingImpl.this.f12145z);
            NewMessageViewModel newMessageViewModel = ActivityNewMessageBindingImpl.this.f12144E;
            if (newMessageViewModel != null) {
                newMessageViewModel.mo13526j(d);
            }
        }
    };

    /* renamed from: H */
    public C3704h f12150H = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityNewMessageBindingImpl.this.f12140A);
            NewMessageViewModel newMessageViewModel = ActivityNewMessageBindingImpl.this.f12144E;
            if (newMessageViewModel != null) {
                newMessageViewModel.mo13519a((CharSequence) d);
            }
        }
    };

    /* renamed from: I */
    public C3704h f12151I = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityNewMessageBindingImpl.this.f12142C);
            NewMessageViewModel newMessageViewModel = ActivityNewMessageBindingImpl.this.f12144E;
            if (newMessageViewModel != null) {
                newMessageViewModel.mo13528p(d);
            }
        }
    };

    /* renamed from: J */
    public C3704h f12152J = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d(ActivityNewMessageBindingImpl.this.f12143D);
            NewMessageViewModel newMessageViewModel = ActivityNewMessageBindingImpl.this.f12144E;
            if (newMessageViewModel != null) {
                newMessageViewModel.mo13527n(d);
            }
        }
    };

    /* renamed from: K */
    public long f12153K = -1;

    static {
        f12147M.put(C4014R.C4016id.app_bar_layout, 6);
        f12147M.put(C4014R.C4016id.newMessage_toolbar, 7);
        f12147M.put(C4014R.C4016id.nested_scroll_view, 8);
        f12147M.put(C4014R.C4016id.newMessage_textInputLayout_addressee, 9);
        f12147M.put(C4014R.C4016id.newMessage_textInputLayout_subject, 10);
        f12147M.put(C4014R.C4016id.attachments_view, 11);
        f12147M.put(C4014R.C4016id.newMessage_textInputLayout_message, 12);
    }

    public ActivityNewMessageBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 13, f12146L, f12147M);
        super(fVar, view, 1, (AppBarLayout) a[6], (AttachmentView) a[11], (NestedScrollView) a[8], (TextInputEditText) a[2], (TextInputEditText) a[4], (FrameLayout) a[5], (TextInputEditText) a[3], (TextInputLayout) a[9], (TextInputLayout) a[12], (TextInputLayout) a[10], (TextView) a[1], (Toolbar) a[7]);
        this.f12148F = (CoordinatorLayout) a[0];
        this.f12148F.setTag(null);
        this.f12145z.setTag(null);
        this.f12140A.setTag(null);
        this.f12141B.setTag(null);
        this.f12142C.setTag(null);
        this.f12143D.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        CharSequence charSequence3;
        OnTouchListener onTouchListener;
        CharSequence charSequence4;
        synchronized (this) {
            j = this.f12153K;
            this.f12153K = 0;
        }
        NewMessageViewModel newMessageViewModel = this.f12144E;
        if ((255 & j) != 0) {
            onTouchListener = ((j & 137) == 0 || newMessageViewModel == null) ? null : newMessageViewModel.mo13524h1();
            CharSequence B1 = ((j & 131) == 0 || newMessageViewModel == null) ? null : newMessageViewModel.mo13515B1();
            z = ((j & 193) == 0 || newMessageViewModel == null) ? false : newMessageViewModel.mo13522d();
            CharSequence j2 = ((j & 145) == 0 || newMessageViewModel == null) ? null : newMessageViewModel.mo13525j();
            CharSequence A0 = ((j & 133) == 0 || newMessageViewModel == null) ? null : newMessageViewModel.mo13514A0();
            if ((j & 161) == 0 || newMessageViewModel == null) {
                charSequence = B1;
                charSequence2 = j2;
                charSequence4 = A0;
                charSequence3 = null;
            } else {
                charSequence = B1;
                charSequence2 = j2;
                charSequence3 = newMessageViewModel.mo13529s1();
                charSequence4 = A0;
            }
        } else {
            charSequence4 = null;
            onTouchListener = null;
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
            z = false;
        }
        if ((j & 133) != 0) {
            C3158a.m7850a((TextView) this.f12145z, charSequence4);
        }
        if ((j & 137) != 0) {
            this.f12145z.setOnTouchListener(onTouchListener);
        }
        if ((128 & j) != 0) {
            C3158a.m7849a((TextView) this.f12145z, (C3719e) null, (C3720f) null, (C3718d) null, this.f12149G);
            C3158a.m7849a((TextView) this.f12140A, (C3719e) null, (C3720f) null, (C3718d) null, this.f12150H);
            C3158a.m7849a((TextView) this.f12142C, (C3719e) null, (C3720f) null, (C3718d) null, this.f12151I);
            C3158a.m7849a(this.f12143D, (C3719e) null, (C3720f) null, (C3718d) null, this.f12152J);
        }
        if ((j & 161) != 0) {
            C3158a.m7850a((TextView) this.f12140A, charSequence3);
        }
        if ((j & 193) != 0) {
            this.f12141B.setVisibility(BindingConverters.m14795a(z));
        }
        if ((145 & j) != 0) {
            C3158a.m7850a((TextView) this.f12142C, charSequence2);
        }
        if ((j & 131) != 0) {
            C3158a.m7850a(this.f12143D, charSequence);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12153K != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12153K = 128;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12363a(NewMessageViewModel newMessageViewModel) {
        mo6103a(0, (C3705i) newMessageViewModel);
        this.f12144E = newMessageViewModel;
        synchronized (this) {
            this.f12153K |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12363a((NewMessageViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12364e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12153K |= 1;
            }
            return true;
        } else if (i == 6) {
            synchronized (this) {
                this.f12153K |= 2;
            }
            return true;
        } else if (i == 86) {
            synchronized (this) {
                this.f12153K |= 4;
            }
            return true;
        } else if (i == 21) {
            synchronized (this) {
                this.f12153K |= 8;
            }
            return true;
        } else if (i == 70) {
            synchronized (this) {
                this.f12153K |= 16;
            }
            return true;
        } else if (i == 100) {
            synchronized (this) {
                this.f12153K |= 32;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12153K |= 64;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        NewMessageViewModel newMessageViewModel = (NewMessageViewModel) obj;
        return mo12364e(i2);
    }
}
