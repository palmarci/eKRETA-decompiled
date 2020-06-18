package hu.ekreta.ellenorzo.cases.decision;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import h.l.g;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBinding;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionDetailActivity.kt */
public final class DecisionDetailActivity extends a {
    public DecisionDetailViewModel x;
    public HashMap y;

    public View c(int i2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        View view = (View) this.y.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.y.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        DecisionDetailActivity$onCreate$3$1 decisionDetailActivity$onCreate$3$1;
        super.onCreate(bundle);
        DecisionDetailViewModel decisionDetailViewModel = this.x;
        if (decisionDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        CaseDetailParameter c = ExtensionsKt.c(intent);
        if (c == null) {
            Intrinsics.throwNpe();
        }
        decisionDetailViewModel.a(c);
        ViewDataBinding a2 = g.a(this, R.layout.activity_decision_detail);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…activity_decision_detail)");
        ActivityDecisionDetailBinding activityDecisionDetailBinding = (ActivityDecisionDetailBinding) a2;
        activityDecisionDetailBinding.a((m) this);
        DecisionDetailViewModel decisionDetailViewModel2 = this.x;
        if (decisionDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityDecisionDetailBinding.a(decisionDetailViewModel2);
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            DecisionDetailViewModel decisionDetailViewModel3 = this.x;
            if (decisionDetailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            l2.a((CharSequence) decisionDetailViewModel3.d0());
            l2.c(true);
            l2.d(true);
        }
        AttachmentView attachmentView = (AttachmentView) c(R.id.caseOtherAttachmentsAttachmentView);
        DecisionDetailViewModel decisionDetailViewModel4 = this.x;
        if (decisionDetailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData items = decisionDetailViewModel4.getItems();
        DecisionDetailViewModel decisionDetailViewModel5 = this.x;
        if (decisionDetailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        DecisionDetailActivity$onCreate$2 decisionDetailActivity$onCreate$2 = new DecisionDetailActivity$onCreate$2(decisionDetailViewModel5);
        DecisionDetailViewModel decisionDetailViewModel6 = this.x;
        if (decisionDetailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        boolean w0 = decisionDetailViewModel6.w0();
        if (w0 && w0) {
            DecisionDetailViewModel decisionDetailViewModel7 = this.x;
            if (decisionDetailViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            decisionDetailActivity$onCreate$3$1 = new DecisionDetailActivity$onCreate$3$1(decisionDetailViewModel7);
        } else {
            decisionDetailActivity$onCreate$3$1 = null;
        }
        attachmentView.a(this, items, decisionDetailActivity$onCreate$2, decisionDetailActivity$onCreate$3$1);
        DecisionDetailViewModel decisionDetailViewModel8 = this.x;
        if (decisionDetailViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, decisionDetailViewModel8.getUiCommand());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
