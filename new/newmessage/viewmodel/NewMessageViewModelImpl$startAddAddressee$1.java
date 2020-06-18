package hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.content.Intent;
import h.m.d.d;
import hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$startAddAddressee$1 extends Lambda implements Function1<d, Unit> {
    public static final NewMessageViewModelImpl$startAddAddressee$1 INSTANCE = new NewMessageViewModelImpl$startAddAddressee$1();

    public NewMessageViewModelImpl$startAddAddressee$1() {
        super(1);
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        dVar.startActivityForResult(new Intent(dVar, AddresseeSelectorActivity.class), 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
