package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBinding */
public abstract class ActivityHomeworkCommentBinding extends ViewDataBinding {

    /* renamed from: A */
    public final EditText f12038A;

    /* renamed from: B */
    public final ConstraintLayout f12039B;

    /* renamed from: C */
    public HomeworkCommentFormViewModel f12040C;

    /* renamed from: z */
    public final MaterialButton f12041z;

    public ActivityHomeworkCommentBinding(Object obj, View view, int i, MaterialButton materialButton, EditText editText, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.f12041z = materialButton;
        this.f12038A = editText;
        this.f12039B = constraintLayout;
    }

    /* renamed from: a */
    public abstract void mo12348a(HomeworkCommentFormViewModel homeworkCommentFormViewModel);
}
