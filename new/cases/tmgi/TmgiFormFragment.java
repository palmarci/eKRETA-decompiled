package hu.ekreta.ellenorzo.cases.tmgi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBinding;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiFormFragment.kt */
public final class TmgiFormFragment extends c {
    public TmgiFormViewModel a0;
    public HashMap b0;

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentTmgiFormBinding a2 = FragmentTmgiFormBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        TmgiFormViewModel tmgiFormViewModel = this.a0;
        if (tmgiFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(tmgiFormViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        TmgiFormViewModel tmgiFormViewModel = this.a0;
        if (tmgiFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, tmgiFormViewModel.getUiCommand());
    }

    public View e(int i2) {
        if (this.b0 == null) {
            this.b0 = new HashMap();
        }
        View view = (View) this.b0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View H = H();
        if (H == null) {
            return null;
        }
        View findViewById = H.findViewById(i2);
        this.b0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }

    public void a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        AttachmentView attachmentView = (AttachmentView) e(R.id.mandatory_attachments_view);
        TmgiFormViewModel tmgiFormViewModel = this.a0;
        if (tmgiFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData<List<Attachment>> mandatoryAttachments = tmgiFormViewModel.getMandatoryAttachments();
        TmgiFormViewModel tmgiFormViewModel2 = this.a0;
        if (tmgiFormViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        TmgiFormFragment$onViewCreated$1 tmgiFormFragment$onViewCreated$1 = new TmgiFormFragment$onViewCreated$1(tmgiFormViewModel2);
        TmgiFormViewModel tmgiFormViewModel3 = this.a0;
        if (tmgiFormViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        attachmentView.a(this, mandatoryAttachments, tmgiFormFragment$onViewCreated$1, new TmgiFormFragment$onViewCreated$2(tmgiFormViewModel3));
        AttachmentView attachmentView2 = (AttachmentView) e(R.id.optional_attachments_view);
        TmgiFormViewModel tmgiFormViewModel4 = this.a0;
        if (tmgiFormViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData<List<Attachment>> optionalAttachments = tmgiFormViewModel4.getOptionalAttachments();
        TmgiFormViewModel tmgiFormViewModel5 = this.a0;
        if (tmgiFormViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        TmgiFormFragment$onViewCreated$3 tmgiFormFragment$onViewCreated$3 = new TmgiFormFragment$onViewCreated$3(tmgiFormViewModel5);
        TmgiFormViewModel tmgiFormViewModel6 = this.a0;
        if (tmgiFormViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        attachmentView2.a(this, optionalAttachments, tmgiFormFragment$onViewCreated$3, new TmgiFormFragment$onViewCreated$4(tmgiFormViewModel6));
        TextInputLayout textInputLayout = (TextInputLayout) e(R.id.startDatePicker_textInputLayout);
        Intrinsics.checkExpressionValueIsNotNull(textInputLayout, "startDatePicker_textInputLayout");
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(textInputLayout);
        TextInputLayout textInputLayout2 = (TextInputLayout) e(R.id.endDatePicker_textInputLayout);
        Intrinsics.checkExpressionValueIsNotNull(textInputLayout2, "endDatePicker_textInputLayout");
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(textInputLayout2);
        TextInputLayout textInputLayout3 = (TextInputLayout) e(R.id.caseTypeNamesTextInputLayout);
        Intrinsics.checkExpressionValueIsNotNull(textInputLayout3, "caseTypeNamesTextInputLayout");
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(textInputLayout3);
    }
}
