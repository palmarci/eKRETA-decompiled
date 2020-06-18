package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0004\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "", "id", "", "isSigner", "", "educationId", "", "name", "title", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEducationId", "()Ljava/lang/String;", "getId", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "equals", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Signer.kt */
public final class Signer {

    /* renamed from: a  reason: collision with root package name */
    public final int f5202a;
    public final Boolean b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5203d;
    public final String e;

    public Signer(int i2, Boolean bool, String str, String str2, String str3) {
        this.f5202a = i2;
        this.b = bool;
        this.c = str;
        this.f5203d = str2;
        this.e = str3;
    }

    public static /* synthetic */ Signer copy$default(Signer signer, int i2, Boolean bool, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = signer.f5202a;
        }
        if ((i3 & 2) != 0) {
            bool = signer.b;
        }
        Boolean bool2 = bool;
        if ((i3 & 4) != 0) {
            str = signer.c;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = signer.f5203d;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = signer.e;
        }
        return signer.a(i2, bool2, str4, str5, str3);
    }

    public final Signer a(int i2, Boolean bool, String str, String str2, String str3) {
        return new Signer(i2, bool, str, str2, str3);
    }

    public final String a() {
        return this.f5203d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Signer) {
                Signer signer = (Signer) obj;
                if (!(this.f5202a == signer.f5202a) || !Intrinsics.areEqual((Object) this.b, (Object) signer.b) || !Intrinsics.areEqual((Object) this.c, (Object) signer.c) || !Intrinsics.areEqual((Object) this.f5203d, (Object) signer.f5203d) || !Intrinsics.areEqual((Object) this.e, (Object) signer.e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.f5202a * 31;
        Boolean bool = this.b;
        int i3 = 0;
        int hashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5203d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode3 + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("Signer(id=");
        a2.append(this.f5202a);
        a2.append(", isSigner=");
        a2.append(this.b);
        a2.append(", educationId=");
        a2.append(this.c);
        a2.append(", name=");
        a2.append(this.f5203d);
        a2.append(", title=");
        return a.a(a2, this.e, ")");
    }
}
