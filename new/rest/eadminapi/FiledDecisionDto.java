package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "", "id", "", "(Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lhu/ekreta/ellenorzo/rest/eadminapi/FiledDecisionDto;", "equals", "", "other", "hashCode", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: FiledDecisionDto.kt */
public final class FiledDecisionDto {
    @c("azonosito")
    public final Integer id;

    public FiledDecisionDto(Integer num) {
        this.id = num;
    }

    public static /* synthetic */ FiledDecisionDto copy$default(FiledDecisionDto filedDecisionDto, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = filedDecisionDto.id;
        }
        return filedDecisionDto.copy(num);
    }

    public final Integer component1() {
        return this.id;
    }

    public final FiledDecisionDto copy(Integer num) {
        return new FiledDecisionDto(num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FiledDecisionDto) && Intrinsics.areEqual((Object) this.id, (Object) ((FiledDecisionDto) obj).id);
        }
        return true;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        Integer num = this.id;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a2 = a.a("FiledDecisionDto(id=");
        a2.append(this.id);
        a2.append(")");
        return a2.toString();
    }
}
