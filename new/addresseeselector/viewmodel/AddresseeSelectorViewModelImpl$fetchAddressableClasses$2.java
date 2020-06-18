package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import h.l.k;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.addresseeselector.model.KretaClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl$fetchAddressableClasses$2 extends Lambda implements Function1<List<? extends KretaClass>, Unit> {
    public final /* synthetic */ AddresseeSelectorViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddresseeSelectorViewModelImpl$fetchAddressableClasses$2(AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl) {
        super(1);
        this.c = addresseeSelectorViewModelImpl;
    }

    public final void a(List<KretaClass> list) {
        String string = this.c.y.getString(R.string.addresseeSelector_typeEmpty);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…resseeSelector_typeEmpty)");
        T mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new KretaClass(-1, string));
        Intrinsics.checkExpressionValueIsNotNull(list, "it");
        mutableListOf.addAll(list);
        k<List<KretaClass>> x1 = this.c.x1();
        if (mutableListOf != x1.e) {
            x1.e = mutableListOf;
            x1.U1();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return Unit.INSTANCE;
    }
}
