package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "", "id", "", "(Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "equals", "", "other", "hashCode", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto */
/* compiled from: FiledDecisionDto.kt */
public final class FiledDecisionDto {
    @C2580c("azonosito")

    /* renamed from: id */
    public final Integer f14692id;

    public FiledDecisionDto(Integer num) {
        this.f14692id = num;
    }

    public static /* synthetic */ FiledDecisionDto copy$default(FiledDecisionDto filedDecisionDto, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = filedDecisionDto.f14692id;
        }
        return filedDecisionDto.copy(num);
    }

    public final Integer component1() {
        return this.f14692id;
    }

    public final FiledDecisionDto copy(Integer num) {
        return new FiledDecisionDto(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14692id, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto) r2).f14692id) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto
            if (r0 == 0) goto L_0x0013
            hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto r2 = (p289hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto) r2
            java.lang.Integer r0 = r1.f14692id
            java.lang.Integer r2 = r2.f14692id
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.FiledDecisionDto.equals(java.lang.Object):boolean");
    }

    public final Integer getId() {
        return this.f14692id;
    }

    public int hashCode() {
        Integer num = this.f14692id;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("FiledDecisionDto(id=");
        a.append(this.f14692id);
        a.append(")");
        return a.toString();
    }
}
