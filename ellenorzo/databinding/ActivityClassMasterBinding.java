package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import p289hu.ekreta.ellenorzo.classmaster.ClassMasterViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityClassMasterBinding */
public abstract class ActivityClassMasterBinding extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f11976A;

    /* renamed from: B */
    public final MaterialButton f11977B;

    /* renamed from: C */
    public final TextView f11978C;

    /* renamed from: D */
    public ClassMasterViewModel f11979D;

    /* renamed from: z */
    public final MaterialButton f11980z;

    public ActivityClassMasterBinding(Object obj, View view, int i, AppBarLayout appBarLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ConstraintLayout constraintLayout, TextView textView, NestedScrollView nestedScrollView, TextView textView2, Toolbar toolbar) {
        super(obj, view, i);
        this.f11980z = materialButton;
        this.f11976A = materialButton2;
        this.f11977B = materialButton3;
        this.f11978C = textView;
    }

    /* renamed from: a */
    public abstract void mo12339a(ClassMasterViewModel classMasterViewModel);
}
