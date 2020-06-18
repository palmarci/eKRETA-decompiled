package hu.ekreta.ellenorzo.cases.tmgi;

import a.a.a.f;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "p2", "Ljava/util/Calendar;", "datetime", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModelImpl.kt */
public final /* synthetic */ class TmgiFormViewModelImpl$selectStartDate$1 extends FunctionReference implements Function2<f, Calendar, Unit> {
    public TmgiFormViewModelImpl$selectStartDate$1(TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        super(2, tmgiFormViewModelImpl);
    }

    public final void a(f fVar, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(fVar, "p1");
        Intrinsics.checkParameterIsNotNull(calendar, "p2");
        ((TmgiFormViewModelImpl) this.receiver).b(fVar, calendar);
    }

    public final String getName() {
        return "callbackToSetStartDate";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(TmgiFormViewModelImpl.class);
    }

    public final String getSignature() {
        return "callbackToSetStartDate(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/Calendar;)V";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((f) obj, (Calendar) obj2);
        return Unit.INSTANCE;
    }
}
