package hu.ekreta.ellenorzo.util.datetime;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactoryImpl;", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "()V", "now", "Ljava/util/Calendar;", "getNow", "()Ljava/util/Calendar;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DateTimeFactoryImpl.kt */
public final class DateTimeFactoryImpl implements DateTimeFactory {
    public Calendar a() {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance(Locale.getDefault())");
        return instance;
    }
}
