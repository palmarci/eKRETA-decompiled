package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;

public abstract class ActivityNewMessageBinding extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final TextInputEditText C;
    public final FrameLayout D;
    public final TextInputEditText E;
    public NewMessageViewModel F;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityNewMessageBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, AttachmentView attachmentView, NestedScrollView nestedScrollView, TextView textView, TextView textView2, Barrier barrier, RecyclerView recyclerView, TextInputEditText textInputEditText, FrameLayout frameLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = textView;
        this.A = textView2;
        this.B = recyclerView;
        this.C = textInputEditText;
        this.D = frameLayout;
        this.E = textInputEditText2;
    }

    public abstract void a(NewMessageViewModel newMessageViewModel);
}
