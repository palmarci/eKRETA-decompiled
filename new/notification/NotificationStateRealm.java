package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.e1;
import k.c.h0;
import k.c.m1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationStateRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "profileId", "", "notificationRole", "", "registrationId", "token", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getNotificationRole", "()Ljava/lang/Integer;", "setNotificationRole", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "getRegistrationId", "setRegistrationId", "getToken", "setToken", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationStateRealm.kt */
public class NotificationStateRealm extends h0 implements ProfileSpecificModelRealm, e1 {
    public String c;
    public Integer e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5922g;

    public NotificationStateRealm() {
        this((String) null, (Integer) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationStateRealm(String str, Integer num, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    public Integer C1() {
        return this.e;
    }

    public void H(String str) {
        this.f5922g = str;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public final Integer e2() {
        return C1();
    }

    public String f2() {
        return a();
    }

    public final String g2() {
        return k1();
    }

    public void h(Integer num) {
        this.e = num;
    }

    public final String h2() {
        return v0();
    }

    public String k1() {
        return this.f;
    }

    public String v0() {
        return this.f5922g;
    }

    public void x0(String str) {
        this.f = str;
    }

    public NotificationStateRealm(String str, Integer num, String str2, String str3) {
        if (this instanceof n) {
            ((n) this).K();
        }
        a(str);
        h(num);
        x0(str2);
        H(str3);
    }
}
