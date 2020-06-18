package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/KretaClassDto;", "", "id", "", "name", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/KretaClassDto;", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: KretaClassDto.kt */
public final class KretaClassDto {
    @c("kretaAzonosito")
    public final Long id;
    @c("nev")
    public final String name;

    public KretaClassDto(Long l2, String str) {
        this.id = l2;
        this.name = str;
    }

    public static /* synthetic */ KretaClassDto copy$default(KretaClassDto kretaClassDto, Long l2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = kretaClassDto.id;
        }
        if ((i2 & 2) != 0) {
            str = kretaClassDto.name;
        }
        return kretaClassDto.copy(l2, str);
    }

    public final Long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final KretaClassDto copy(Long l2, String str) {
        return new KretaClassDto(l2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KretaClassDto)) {
            return false;
        }
        KretaClassDto kretaClassDto = (KretaClassDto) obj;
        return Intrinsics.areEqual((Object) this.id, (Object) kretaClassDto.id) && Intrinsics.areEqual((Object) this.name, (Object) kretaClassDto.name);
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Long l2 = this.id;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        String str = this.name;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("KretaClassDto(id=");
        a2.append(this.id);
        a2.append(", name=");
        return a.a(a2, this.name, ")");
    }
}
