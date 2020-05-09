package p289hu.ekreta.ellenorzo.cases.tmgi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.databinding.FragmentTmgiFormBinding;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragment */
/* compiled from: TmgiFormFragment.kt */
public final class TmgiFormFragment extends C4459c {

    /* renamed from: a0 */
    public TmgiFormViewModel f11695a0;

    /* renamed from: b0 */
    public HashMap f11696b0;

    /* renamed from: B0 */
    public void mo12115B0() {
        HashMap hashMap = this.f11696b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentTmgiFormBinding a = FragmentTmgiFormBinding.m11820a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        TmgiFormViewModel tmgiFormViewModel = this.f11695a0;
        if (tmgiFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12414a(tmgiFormViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        TmgiFormViewModel tmgiFormViewModel = this.f11695a0;
        if (tmgiFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, tmgiFormViewModel.getUiCommand());
    }

    /* renamed from: e */
    public View mo12116e(int i) {
        if (this.f11696b0 == null) {
            this.f11696b0 = new HashMap();
        }
        View view = (View) this.f11696b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f11696b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo12115B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        AttachmentView attachmentView = (AttachmentView) mo12116e(C4014R.C4016id.mandatory_attachments_view);
        TmgiFormViewModel tmgiFormViewModel = this.f11695a0;
        String str = "viewModel";
        if (tmgiFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        LiveData mandatoryAttachments = tmgiFormViewModel.getMandatoryAttachments();
        TmgiFormViewModel tmgiFormViewModel2 = this.f11695a0;
        if (tmgiFormViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        TmgiFormFragment$onViewCreated$1 tmgiFormFragment$onViewCreated$1 = new TmgiFormFragment$onViewCreated$1(tmgiFormViewModel2);
        TmgiFormViewModel tmgiFormViewModel3 = this.f11695a0;
        if (tmgiFormViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        attachmentView.mo11469a(this, mandatoryAttachments, tmgiFormFragment$onViewCreated$1, new TmgiFormFragment$onViewCreated$2(tmgiFormViewModel3));
        AttachmentView attachmentView2 = (AttachmentView) mo12116e(C4014R.C4016id.optional_attachments_view);
        TmgiFormViewModel tmgiFormViewModel4 = this.f11695a0;
        if (tmgiFormViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        LiveData optionalAttachments = tmgiFormViewModel4.getOptionalAttachments();
        TmgiFormViewModel tmgiFormViewModel5 = this.f11695a0;
        if (tmgiFormViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        TmgiFormFragment$onViewCreated$3 tmgiFormFragment$onViewCreated$3 = new TmgiFormFragment$onViewCreated$3(tmgiFormViewModel5);
        TmgiFormViewModel tmgiFormViewModel6 = this.f11695a0;
        if (tmgiFormViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        attachmentView2.mo11469a(this, optionalAttachments, tmgiFormFragment$onViewCreated$3, new TmgiFormFragment$onViewCreated$4(tmgiFormViewModel6));
        TextInputLayout textInputLayout = (TextInputLayout) mo12116e(C4014R.C4016id.startDatePicker_textInputLayout);
        Intrinsics.checkExpressionValueIsNotNull(textInputLayout, "startDatePicker_textInputLayout");
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14656a(textInputLayout);
        TextInputLayout textInputLayout2 = (TextInputLayout) mo12116e(C4014R.C4016id.endDatePicker_textInputLayout);
        Intrinsics.checkExpressionValueIsNotNull(textInputLayout2, "endDatePicker_textInputLayout");
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14656a(textInputLayout2);
        TextInputLayout textInputLayout3 = (TextInputLayout) mo12116e(C4014R.C4016id.caseTypeNamesTextInputLayout);
        Intrinsics.checkExpressionValueIsNotNull(textInputLayout3, "caseTypeNamesTextInputLayout");
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14656a(textInputLayout3);
    }
}
