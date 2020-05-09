package p289hu.ekreta.ellenorzo.timetable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/DaoMapperException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.DaoMapperException */
/* compiled from: TimeTableItemRealm.kt */
public final class DaoMapperException extends Exception {
    public DaoMapperException(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        super(str);
    }
}
