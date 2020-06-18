package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageToBinByUserRequestDto;", "", "deleted", "", "mailBoxItemId", "", "", "(Z[Ljava/lang/Long;)V", "getDeleted", "()Z", "getMailBoxItemId", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "component1", "component2", "copy", "(Z[Ljava/lang/Long;)Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageToBinByUserRequestDto;", "equals", "other", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SetMessageToBinByUserRequestDto.kt */
public final class SetMessageToBinByUserRequestDto {
    @c("isKuka")
    public final boolean deleted;
    @c("postaladaElemAzonositoLista")
    public final Long[] mailBoxItemId;

    public SetMessageToBinByUserRequestDto(boolean z, Long[] lArr) {
        Intrinsics.checkParameterIsNotNull(lArr, "mailBoxItemId");
        this.deleted = z;
        this.mailBoxItemId = lArr;
    }

    public static /* synthetic */ SetMessageToBinByUserRequestDto copy$default(SetMessageToBinByUserRequestDto setMessageToBinByUserRequestDto, boolean z, Long[] lArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = setMessageToBinByUserRequestDto.deleted;
        }
        if ((i2 & 2) != 0) {
            lArr = setMessageToBinByUserRequestDto.mailBoxItemId;
        }
        return setMessageToBinByUserRequestDto.copy(z, lArr);
    }

    public final boolean component1() {
        return this.deleted;
    }

    public final Long[] component2() {
        return this.mailBoxItemId;
    }

    public final SetMessageToBinByUserRequestDto copy(boolean z, Long[] lArr) {
        Intrinsics.checkParameterIsNotNull(lArr, "mailBoxItemId");
        return new SetMessageToBinByUserRequestDto(z, lArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) SetMessageToBinByUserRequestDto.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            SetMessageToBinByUserRequestDto setMessageToBinByUserRequestDto = (SetMessageToBinByUserRequestDto) obj;
            return this.deleted == setMessageToBinByUserRequestDto.deleted && Arrays.equals(this.mailBoxItemId, setMessageToBinByUserRequestDto.mailBoxItemId);
        }
        throw new TypeCastException("null cannot be cast to non-null type hu.ekreta.ellenorzo.rest.eadminapi.SetMessageToBinByUserRequestDto");
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final Long[] getMailBoxItemId() {
        return this.mailBoxItemId;
    }

    public int hashCode() {
        return (Boolean.valueOf(this.deleted).hashCode() * 31) + Arrays.hashCode(this.mailBoxItemId);
    }

    public String toString() {
        StringBuilder a2 = a.a("SetMessageToBinByUserRequestDto(deleted=");
        a2.append(this.deleted);
        a2.append(", mailBoxItemId=");
        return a.a(a2, Arrays.toString(this.mailBoxItemId), ")");
    }
}
