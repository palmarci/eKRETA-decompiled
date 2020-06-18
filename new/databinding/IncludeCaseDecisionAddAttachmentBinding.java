package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;

public abstract class IncludeCaseDecisionAddAttachmentBinding extends ViewDataBinding {
    public DecisionDetailViewModel A;
    public final Button z;

    public IncludeCaseDecisionAddAttachmentBinding(Object obj, View view, int i2, Button button) {
        super(obj, view, i2);
        this.z = button;
    }

    public abstract void a(DecisionDetailViewModel decisionDetailViewModel);
}
