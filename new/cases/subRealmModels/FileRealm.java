package hu.ekreta.ellenorzo.cases.subRealmModels;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import k.c.h0;
import k.c.m1.n;
import k.c.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subRealmModels/FileRealm;", "Lio/realm/RealmObject;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "uid", "", "id", "", "temporaryFileId", "profileId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "getTemporaryFileId", "setTemporaryFileId", "getUid", "setUid", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: FileRealm.kt */
public class FileRealm extends h0 implements ProfileSpecificModelRealm, v0 {
    public String c;
    public Integer e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public String f5238g;

    public FileRealm() {
        this((String) null, (Integer) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileRealm(String str, Integer num, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        if (this instanceof n) {
            ((n) this).K();
        }
    }

    public void V0(String str) {
        this.f = str;
    }

    public String a() {
        return this.f5238g;
    }

    public void a(Integer num) {
        this.e = num;
    }

    public void a(String str) {
        this.f5238g = str;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public Integer e() {
        return this.e;
    }

    public final Integer e2() {
        return e();
    }

    public String f2() {
        return a();
    }

    public final String g2() {
        return l1();
    }

    public String l1() {
        return this.f;
    }

    public FileRealm(String str, Integer num, String str2, String str3) {
        if (this instanceof n) {
            ((n) this).K();
        }
        b(str);
        a(num);
        V0(str2);
        a(str3);
    }
}
