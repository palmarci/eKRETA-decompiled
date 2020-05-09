package p289hu.ekreta.ellenorzo.cases.decision;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity */
/* compiled from: DecisionDetailActivity.kt */
public final class DecisionDetailActivity extends C4457a {

    /* renamed from: x */
    public DecisionDetailViewModel f11359x;

    /* renamed from: y */
    public HashMap f11360y;

    /* renamed from: c */
    public View mo11711c(int i) {
        if (this.f11360y == null) {
            this.f11360y = new HashMap();
        }
        View view = (View) this.f11360y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f11360y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        DecisionDetailActivity$onCreate$3$1 decisionDetailActivity$onCreate$3$1;
        super.onCreate(bundle);
        DecisionDetailViewModel decisionDetailViewModel = this.f11359x;
        String str = "viewModel";
        if (decisionDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        CaseDetailParameter b = ExtensionsKt.m14661b(intent);
        if (b == null) {
            Intrinsics.throwNpe();
        }
        decisionDetailViewModel.mo11730a(b);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_decision_detail);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…activity_decision_detail)");
        ActivityDecisionDetailBinding activityDecisionDetailBinding = (ActivityDecisionDetailBinding) a;
        activityDecisionDetailBinding.mo6100a((C3818m) this);
        DecisionDetailViewModel decisionDetailViewModel2 = this.f11359x;
        if (decisionDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityDecisionDetailBinding.mo12343a(decisionDetailViewModel2);
        mo8719a((Toolbar) mo11711c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            DecisionDetailViewModel decisionDetailViewModel3 = this.f11359x;
            if (decisionDetailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            l.mo8679a((CharSequence) decisionDetailViewModel3.mo11732d0());
            l.mo8688c(true);
            l.mo8690d(true);
        }
        AttachmentView attachmentView = (AttachmentView) mo11711c(C4014R.C4016id.caseOtherAttachmentsAttachmentView);
        DecisionDetailViewModel decisionDetailViewModel4 = this.f11359x;
        if (decisionDetailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        LiveData items = decisionDetailViewModel4.getItems();
        DecisionDetailViewModel decisionDetailViewModel5 = this.f11359x;
        if (decisionDetailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        DecisionDetailActivity$onCreate$2 decisionDetailActivity$onCreate$2 = new DecisionDetailActivity$onCreate$2(decisionDetailViewModel5);
        DecisionDetailViewModel decisionDetailViewModel6 = this.f11359x;
        if (decisionDetailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        boolean w0 = decisionDetailViewModel6.mo11740w0();
        if (w0 && w0) {
            DecisionDetailViewModel decisionDetailViewModel7 = this.f11359x;
            if (decisionDetailViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            decisionDetailActivity$onCreate$3$1 = new DecisionDetailActivity$onCreate$3$1(decisionDetailViewModel7);
        } else {
            decisionDetailActivity$onCreate$3$1 = null;
        }
        attachmentView.mo11469a(this, items, decisionDetailActivity$onCreate$2, decisionDetailActivity$onCreate$3$1);
        DecisionDetailViewModel decisionDetailViewModel8 = this.f11359x;
        if (decisionDetailViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, decisionDetailViewModel8.getUiCommand());
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
