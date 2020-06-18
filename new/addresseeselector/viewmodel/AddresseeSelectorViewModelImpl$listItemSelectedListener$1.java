package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl$listItemSelectedListener$1 extends Lambda implements Function1<Addressee, Unit> {
    public final /* synthetic */ AddresseeSelectorViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddresseeSelectorViewModelImpl$listItemSelectedListener$1(AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl) {
        super(1);
        this.c = addresseeSelectorViewModelImpl;
    }

    public final void a(Addressee addressee) {
        Intrinsics.checkParameterIsNotNull(addressee, "it");
        this.c.c(addressee);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Addressee) obj);
        return Unit.INSTANCE;
    }
}
