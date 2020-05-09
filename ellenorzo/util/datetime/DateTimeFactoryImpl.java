package p289hu.ekreta.ellenorzo.util.datetime;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactoryImpl;", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "()V", "now", "Ljava/util/Calendar;", "getNow", "()Ljava/util/Calendar;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.datetime.DateTimeFactoryImpl */
/* compiled from: DateTimeFactoryImpl.kt */
public final class DateTimeFactoryImpl implements DateTimeFactory {
    /* renamed from: a */
    public Calendar mo16327a() {
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance(Locale.getDefault())");
        return instance;
    }
}
