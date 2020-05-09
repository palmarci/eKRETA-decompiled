package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNewMessageBinding */
public abstract class ActivityNewMessageBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextInputEditText f12140A;

    /* renamed from: B */
    public final FrameLayout f12141B;

    /* renamed from: C */
    public final TextInputEditText f12142C;

    /* renamed from: D */
    public final TextView f12143D;

    /* renamed from: E */
    public NewMessageViewModel f12144E;

    /* renamed from: z */
    public final TextInputEditText f12145z;

    public ActivityNewMessageBinding(Object obj, View view, int i, AppBarLayout appBarLayout, AttachmentView attachmentView, NestedScrollView nestedScrollView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, FrameLayout frameLayout, TextInputEditText textInputEditText3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, Toolbar toolbar) {
        super(obj, view, i);
        this.f12145z = textInputEditText;
        this.f12140A = textInputEditText2;
        this.f12141B = frameLayout;
        this.f12142C = textInputEditText3;
        this.f12143D = textView;
    }

    /* renamed from: a */
    public abstract void mo12363a(NewMessageViewModel newMessageViewModel);
}
