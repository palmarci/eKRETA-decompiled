package p289hu.ekreta.ellenorzo.institute;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerViewModelImpl$searchTerm$2 */
/* compiled from: InstitutePickerViewModelImpl.kt */
public final class InstitutePickerViewModelImpl$searchTerm$2 extends Lambda implements Function1<String, Unit> {

    /* renamed from: c */
    public final /* synthetic */ InstitutePickerViewModelImpl f13604c;

    public InstitutePickerViewModelImpl$searchTerm$2(InstitutePickerViewModelImpl institutePickerViewModelImpl) {
        this.f13604c = institutePickerViewModelImpl;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkParameterIsNotNull(str, "it");
        this.f13604c.f13597l.mo17017a(str);
    }
}
