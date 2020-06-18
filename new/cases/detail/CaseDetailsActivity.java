package hu.ekreta.ellenorzo.cases.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import h.l.g;
import h.m.d.d;
import h.p.h;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiCase;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/detail/CaseDetailsViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseDetailsActivity.kt */
public final class CaseDetailsActivity extends a {
    public CaseDetailsViewModel x;
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
        ViewDataBinding viewDataBinding;
        super.onCreate(bundle);
        CaseDetailsViewModel caseDetailsViewModel = this.x;
        if (caseDetailsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        BaseCase d2 = ExtensionsKt.d(intent);
        if (d2 == null) {
            Intrinsics.throwNpe();
        }
        caseDetailsViewModel.a(d2);
        CaseDetailsViewModel caseDetailsViewModel2 = this.x;
        if (caseDetailsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        if (caseDetailsViewModel2.T() instanceof TmgiCase) {
            viewDataBinding = g.a(this, R.layout.activity_case_details_tmgi);
        } else {
            viewDataBinding = g.a(this, R.layout.activity_case_details);
        }
        CaseDetailsViewModel caseDetailsViewModel3 = this.x;
        if (caseDetailsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        viewDataBinding.c(88, caseDetailsViewModel3);
        Intrinsics.checkExpressionValueIsNotNull(viewDataBinding, "it");
        viewDataBinding.a((m) this);
        AttachmentView attachmentView = (AttachmentView) c(R.id.caseOtherAttachmentsAttachmentView);
        CaseDetailsViewModel caseDetailsViewModel4 = this.x;
        if (caseDetailsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData<List<Attachment>> attachments = caseDetailsViewModel4.getAttachments();
        CaseDetailsViewModel caseDetailsViewModel5 = this.x;
        if (caseDetailsViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        AttachmentView.setRecyclerView$default(attachmentView, this, attachments, new CaseDetailsActivity$onCreate$2(caseDetailsViewModel5), (Function1) null, 8, (Object) null);
        AttachmentView attachmentView2 = (AttachmentView) c(R.id.caseMandatoryDocumentsAttachmentView);
        CaseDetailsViewModel caseDetailsViewModel6 = this.x;
        if (caseDetailsViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData<List<Attachment>> mandatoryDocuments = caseDetailsViewModel6.getMandatoryDocuments();
        CaseDetailsViewModel caseDetailsViewModel7 = this.x;
        if (caseDetailsViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        AttachmentView.setRecyclerView$default(attachmentView2, this, mandatoryDocuments, new CaseDetailsActivity$onCreate$3(caseDetailsViewModel7), (Function1) null, 8, (Object) null);
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.a((CharSequence) getString(R.string.MenuItem_Cases_Title));
            l2.c(true);
            l2.d(true);
        }
        h a2 = a();
        CaseDetailsViewModel caseDetailsViewModel8 = this.x;
        if (caseDetailsViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(caseDetailsViewModel8);
        CaseDetailsViewModel caseDetailsViewModel9 = this.x;
        if (caseDetailsViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, caseDetailsViewModel9.getUiCommand());
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
