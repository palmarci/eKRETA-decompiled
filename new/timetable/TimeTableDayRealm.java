package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import java.util.Date;
import k.c.h0;
import k.c.k1;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "id", "", "date", "Ljava/util/Date;", "hasLessons", "", "profileId", "(Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getHasLessons", "()Z", "setHasLessons", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getProfileId", "setProfileId", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableDayRealm.kt */
public class TimeTableDayRealm extends h0 implements ProfileSpecificModelRealm, k1 {
    public String c;
    public Date e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public String f6218g;

    public TimeTableDayRealm() {
        this((String) null, (Date) null, false, (String) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeTableDayRealm(String str, Date date, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : date, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : str2);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    public boolean O0() {
        return this.f;
    }

    public String a() {
        return this.f6218g;
    }

    public void a(String str) {
        this.f6218g = str;
    }

    public void a(Date date) {
        this.e = date;
    }

    public Date c() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public void e(boolean z) {
        this.f = z;
    }

    public final Date e2() {
        return c();
    }

    public final boolean f2() {
        return O0();
    }

    public String g2() {
        return a();
    }

    public void x(String str) {
        this.c = str;
    }

    public TimeTableDayRealm(String str, Date date, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (this instanceof n) {
            ((n) this).K();
        }
        x(str);
        a(date);
        e(z);
        a(str2);
    }
}
