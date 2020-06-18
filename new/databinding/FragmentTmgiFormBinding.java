package hu.ekreta.ellenorzo.databinding;

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
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel;

public abstract class FragmentTmgiFormBinding extends ViewDataBinding {
    public final TextView A;
    public final Button B;
    public final TextView C;
    public final Button D;
    public final AutoCompleteTextView E;
    public final TextInputEditText F;
    public final EditText G;
    public final AttachmentView H;
    public final AttachmentView I;
    public final FrameLayout J;
    public final Button K;
    public final TextInputEditText L;
    public final Toolbar M;
    public TmgiFormViewModel N;
    public final Button z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentTmgiFormBinding(Object obj, View view, int i2, Button button, TextView textView, Button button2, TextView textView2, AppBarLayout appBarLayout, Button button3, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText, EditText editText, TextView textView3, AttachmentView attachmentView, NestedScrollView nestedScrollView, AttachmentView attachmentView2, FrameLayout frameLayout, Button button4, TextInputLayout textInputLayout3, TextInputEditText textInputEditText2, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = button;
        this.A = textView;
        this.B = button2;
        this.C = textView2;
        this.D = button3;
        this.E = autoCompleteTextView;
        this.F = textInputEditText;
        this.G = editText;
        this.H = attachmentView;
        this.I = attachmentView2;
        this.J = frameLayout;
        this.K = button4;
        this.L = textInputEditText2;
        this.M = toolbar;
    }

    public static FragmentTmgiFormBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentTmgiFormBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_tmgi_form, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(TmgiFormViewModel tmgiFormViewModel);
}
