package p289hu.ekreta.ellenorzo.cases.detail;

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
import p211h.p271p.C3810h;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivity */
/* compiled from: CaseDetailsActivity.kt */
public final class CaseDetailsActivity extends C4457a {

    /* renamed from: x */
    public CaseDetailsViewModel f11441x;

    /* renamed from: y */
    public HashMap f11442y;

    /* renamed from: c */
    public View mo11778c(int i) {
        if (this.f11442y == null) {
            this.f11442y = new HashMap();
        }
        View view = (View) this.f11442y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f11442y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        ViewDataBinding viewDataBinding;
        super.onCreate(bundle);
        CaseDetailsViewModel caseDetailsViewModel = this.f11441x;
        String str = "viewModel";
        if (caseDetailsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        BaseCase c = ExtensionsKt.m14665c(intent);
        if (c == null) {
            Intrinsics.throwNpe();
        }
        caseDetailsViewModel.mo11796a(c);
        CaseDetailsViewModel caseDetailsViewModel2 = this.f11441x;
        if (caseDetailsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        if (caseDetailsViewModel2.mo11794T() instanceof TmgiCase) {
            viewDataBinding = C3703g.m9412a(this, C4014R.layout.activity_case_details_tmgi);
        } else {
            viewDataBinding = C3703g.m9412a(this, C4014R.layout.activity_case_details);
        }
        CaseDetailsViewModel caseDetailsViewModel3 = this.f11441x;
        if (caseDetailsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        viewDataBinding.mo6105b(88, (Object) caseDetailsViewModel3);
        Intrinsics.checkExpressionValueIsNotNull(viewDataBinding, "it");
        viewDataBinding.mo6100a((C3818m) this);
        AttachmentView attachmentView = (AttachmentView) mo11778c(C4014R.C4016id.caseOtherAttachmentsAttachmentView);
        CaseDetailsViewModel caseDetailsViewModel4 = this.f11441x;
        if (caseDetailsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        LiveData attachments = caseDetailsViewModel4.getAttachments();
        CaseDetailsViewModel caseDetailsViewModel5 = this.f11441x;
        if (caseDetailsViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        AttachmentView.setRecyclerView$default(attachmentView, this, attachments, new CaseDetailsActivity$onCreate$2(caseDetailsViewModel5), null, 8, null);
        AttachmentView attachmentView2 = (AttachmentView) mo11778c(C4014R.C4016id.caseMandatoryDocumentsAttachmentView);
        CaseDetailsViewModel caseDetailsViewModel6 = this.f11441x;
        if (caseDetailsViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        LiveData mandatoryDocuments = caseDetailsViewModel6.getMandatoryDocuments();
        CaseDetailsViewModel caseDetailsViewModel7 = this.f11441x;
        if (caseDetailsViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        AttachmentView.setRecyclerView$default(attachmentView2, this, mandatoryDocuments, new CaseDetailsActivity$onCreate$3(caseDetailsViewModel7), null, 8, null);
        mo8719a((Toolbar) mo11778c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8679a((CharSequence) getString(C4014R.string.MenuItem_Cases_Title));
            l.mo8688c(true);
            l.mo8690d(true);
        }
        C3810h a = mo5280a();
        CaseDetailsViewModel caseDetailsViewModel8 = this.f11441x;
        if (caseDetailsViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        a.mo10806a(caseDetailsViewModel8);
        CaseDetailsViewModel caseDetailsViewModel9 = this.f11441x;
        if (caseDetailsViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, caseDetailsViewModel9.getUiCommand());
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
