package p289hu.ekreta.ellenorzo.cases.subModels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0004\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "", "id", "", "isSigner", "", "educationId", "", "name", "title", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEducationId", "()Ljava/lang/String;", "getId", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "equals", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.Signer */
/* compiled from: Signer.kt */
public final class Signer {

    /* renamed from: a */
    public final int f11607a;

    /* renamed from: b */
    public final Boolean f11608b;

    /* renamed from: c */
    public final String f11609c;

    /* renamed from: d */
    public final String f11610d;

    /* renamed from: e */
    public final String f11611e;

    public Signer(int i, Boolean bool, String str, String str2, String str3) {
        this.f11607a = i;
        this.f11608b = bool;
        this.f11609c = str;
        this.f11610d = str2;
        this.f11611e = str3;
    }

    public static /* synthetic */ Signer copy$default(Signer signer, int i, Boolean bool, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = signer.f11607a;
        }
        if ((i2 & 2) != 0) {
            bool = signer.f11608b;
        }
        Boolean bool2 = bool;
        if ((i2 & 4) != 0) {
            str = signer.f11609c;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = signer.f11610d;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = signer.f11611e;
        }
        return signer.mo12008a(i, bool2, str4, str5, str3);
    }

    /* renamed from: a */
    public final Signer mo12008a(int i, Boolean bool, String str, String str2, String str3) {
        Signer signer = new Signer(i, bool, str, str2, str3);
        return signer;
    }

    /* renamed from: a */
    public final String mo12009a() {
        return this.f11610d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Signer) {
                Signer signer = (Signer) obj;
                if (!(this.f11607a == signer.f11607a) || !Intrinsics.areEqual((Object) this.f11608b, (Object) signer.f11608b) || !Intrinsics.areEqual((Object) this.f11609c, (Object) signer.f11609c) || !Intrinsics.areEqual((Object) this.f11610d, (Object) signer.f11610d) || !Intrinsics.areEqual((Object) this.f11611e, (Object) signer.f11611e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f11607a * 31;
        Boolean bool = this.f11608b;
        int i2 = 0;
        int hashCode = (i + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f11609c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11610d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11611e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Signer(id=");
        a.append(this.f11607a);
        a.append(", isSigner=");
        a.append(this.f11608b);
        a.append(", educationId=");
        a.append(this.f11609c);
        a.append(", name=");
        a.append(this.f11610d);
        a.append(", title=");
        return C0082a.m106a(a, this.f11611e, ")");
    }
}
