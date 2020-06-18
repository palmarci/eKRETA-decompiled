package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import hu.ekreta.ellenorzo.login.LoginViewModel;

public abstract class ActivityLoginBinding extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final MaterialButton D;
    public final TextInputEditText E;
    public final TextInputLayout F;
    public final TextView G;
    public final FrameLayout H;
    public final SwitchMaterial I;
    public final TextView J;
    public final TextInputEditText K;
    public LoginViewModel L;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityLoginBinding(Object obj, View view, int i2, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView4, FrameLayout frameLayout, SwitchMaterial switchMaterial, TextView textView5, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextView textView6) {
        super(obj, view, i2);
        this.z = textView;
        this.A = textView2;
        this.B = constraintLayout;
        this.C = textView3;
        this.D = materialButton;
        this.E = textInputEditText;
        this.F = textInputLayout;
        this.G = textView4;
        this.H = frameLayout;
        this.I = switchMaterial;
        this.J = textView5;
        this.K = textInputEditText2;
    }

    public abstract void a(LoginViewModel loginViewModel);
}
