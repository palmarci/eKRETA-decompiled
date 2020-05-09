package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p289hu.ekreta.ellenorzo.login.LoginViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityLoginBinding */
public abstract class ActivityLoginBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12090A;

    /* renamed from: B */
    public final ConstraintLayout f12091B;

    /* renamed from: C */
    public final TextView f12092C;

    /* renamed from: D */
    public final MaterialButton f12093D;

    /* renamed from: E */
    public final TextInputEditText f12094E;

    /* renamed from: F */
    public final TextInputLayout f12095F;

    /* renamed from: G */
    public final TextView f12096G;

    /* renamed from: H */
    public final FrameLayout f12097H;

    /* renamed from: I */
    public final SwitchMaterial f12098I;

    /* renamed from: J */
    public final TextView f12099J;

    /* renamed from: K */
    public final TextInputEditText f12100K;

    /* renamed from: L */
    public LoginViewModel f12101L;

    /* renamed from: z */
    public final TextView f12102z;

    public ActivityLoginBinding(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView4, FrameLayout frameLayout, SwitchMaterial switchMaterial, TextView textView5, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextView textView6) {
        super(obj, view, i);
        this.f12102z = textView;
        this.f12090A = textView2;
        this.f12091B = constraintLayout;
        this.f12092C = textView3;
        this.f12093D = materialButton;
        this.f12094E = textInputEditText;
        this.f12095F = textInputLayout;
        this.f12096G = textView4;
        this.f12097H = frameLayout;
        this.f12098I = switchMaterial;
        this.f12099J = textView5;
        this.f12100K = textInputEditText2;
    }

    /* renamed from: a */
    public abstract void mo12357a(LoginViewModel loginViewModel);
}
