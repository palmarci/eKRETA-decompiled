package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModel;

public abstract class ActivityHomeworkCommentBinding extends ViewDataBinding {
    public final EditText A;
    public final ConstraintLayout B;
    public HomeworkCommentFormViewModel C;
    public final MaterialButton z;

    public ActivityHomeworkCommentBinding(Object obj, View view, int i2, MaterialButton materialButton, EditText editText, ConstraintLayout constraintLayout) {
        super(obj, view, i2);
        this.z = materialButton;
        this.A = editText;
        this.B = constraintLayout;
    }

    public abstract void a(HomeworkCommentFormViewModel homeworkCommentFormViewModel);
}
