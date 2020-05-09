package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBinding */
public abstract class FragmentTmgiFormBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12383A;

    /* renamed from: B */
    public final Button f12384B;

    /* renamed from: C */
    public final TextView f12385C;

    /* renamed from: D */
    public final Button f12386D;

    /* renamed from: E */
    public final AutoCompleteTextView f12387E;

    /* renamed from: F */
    public final TextInputEditText f12388F;

    /* renamed from: G */
    public final EditText f12389G;

    /* renamed from: H */
    public final AttachmentView f12390H;

    /* renamed from: I */
    public final AttachmentView f12391I;

    /* renamed from: J */
    public final FrameLayout f12392J;

    /* renamed from: K */
    public final Button f12393K;

    /* renamed from: L */
    public final TextInputEditText f12394L;

    /* renamed from: M */
    public final Toolbar f12395M;

    /* renamed from: N */
    public TmgiFormViewModel f12396N;

    /* renamed from: z */
    public final Button f12397z;

    public FragmentTmgiFormBinding(Object obj, View view, int i, Button button, TextView textView, Button button2, TextView textView2, AppBarLayout appBarLayout, Button button3, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText, EditText editText, TextView textView3, AttachmentView attachmentView, NestedScrollView nestedScrollView, AttachmentView attachmentView2, FrameLayout frameLayout, Button button4, TextInputLayout textInputLayout3, TextInputEditText textInputEditText2, Toolbar toolbar) {
        super(obj, view, i);
        this.f12397z = button;
        this.f12383A = textView;
        this.f12384B = button2;
        this.f12385C = textView2;
        this.f12386D = button3;
        this.f12387E = autoCompleteTextView;
        this.f12388F = textInputEditText;
        this.f12389G = editText;
        this.f12390H = attachmentView;
        this.f12391I = attachmentView2;
        this.f12392J = frameLayout;
        this.f12393K = button4;
        this.f12394L = textInputEditText2;
        this.f12395M = toolbar;
    }

    /* renamed from: a */
    public static FragmentTmgiFormBinding m11820a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentTmgiFormBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_tmgi_form, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12414a(TmgiFormViewModel tmgiFormViewModel);
}
