package hu.ekreta.ellenorzo.login;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class LoginViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<InstituteDto> {
    public final /* synthetic */ LoginViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, LoginViewModelImpl loginViewModelImpl) {
        super(obj2);
        this.c = loginViewModelImpl;
    }

    public void afterChange(KProperty<?> kProperty, InstituteDto instituteDto, InstituteDto instituteDto2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        InstituteDto instituteDto3 = instituteDto2;
        InstituteDto instituteDto4 = instituteDto;
        LoginViewModelImpl.a(this.c, (Object) null, 1);
        LoginViewModelImpl loginViewModelImpl = this.c;
        if (instituteDto3 == null || (str = instituteDto3.getName()) == null) {
            str = this.c.u.getString(R.string.Button_SelectInstitute_Text);
            Intrinsics.checkExpressionValueIsNotNull(str, "context.getString(R.stri…ton_SelectInstitute_Text)");
        }
        loginViewModelImpl.a(str);
    }
}
