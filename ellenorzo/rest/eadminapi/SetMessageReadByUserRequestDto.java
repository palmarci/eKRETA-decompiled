package p289hu.ekreta.ellenorzo.rest.eadminapi;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageReadByUserRequestDto;", "", "readByUser", "", "mailBoxItemId", "", "", "(Z[Ljava/lang/Long;)V", "getMailBoxItemId", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "getReadByUser", "()Z", "component1", "component2", "copy", "(Z[Ljava/lang/Long;)Lhu/ekreta/ellenorzo/rest/eadminapi/SetMessageReadByUserRequestDto;", "equals", "other", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.SetMessageReadByUserRequestDto */
/* compiled from: SetMessageReadByUserRequestDto.kt */
public final class SetMessageReadByUserRequestDto {
    @C2580c("postaladaElemAzonositoLista")
    public final Long[] mailBoxItemId;
    @C2580c("isOlvasott")
    public final boolean readByUser;

    public SetMessageReadByUserRequestDto(boolean z, Long[] lArr) {
        Intrinsics.checkParameterIsNotNull(lArr, "mailBoxItemId");
        this.readByUser = z;
        this.mailBoxItemId = lArr;
    }

    public static /* synthetic */ SetMessageReadByUserRequestDto copy$default(SetMessageReadByUserRequestDto setMessageReadByUserRequestDto, boolean z, Long[] lArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setMessageReadByUserRequestDto.readByUser;
        }
        if ((i & 2) != 0) {
            lArr = setMessageReadByUserRequestDto.mailBoxItemId;
        }
        return setMessageReadByUserRequestDto.copy(z, lArr);
    }

    public final boolean component1() {
        return this.readByUser;
    }

    public final Long[] component2() {
        return this.mailBoxItemId;
    }

    public final SetMessageReadByUserRequestDto copy(boolean z, Long[] lArr) {
        Intrinsics.checkParameterIsNotNull(lArr, "mailBoxItemId");
        return new SetMessageReadByUserRequestDto(z, lArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) SetMessageReadByUserRequestDto.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            SetMessageReadByUserRequestDto setMessageReadByUserRequestDto = (SetMessageReadByUserRequestDto) obj;
            return this.readByUser == setMessageReadByUserRequestDto.readByUser && Arrays.equals(this.mailBoxItemId, setMessageReadByUserRequestDto.mailBoxItemId);
        }
        throw new TypeCastException("null cannot be cast to non-null type hu.ekreta.ellenorzo.rest.eadminapi.SetMessageReadByUserRequestDto");
    }

    public final Long[] getMailBoxItemId() {
        return this.mailBoxItemId;
    }

    public final boolean getReadByUser() {
        return this.readByUser;
    }

    public int hashCode() {
        return (Boolean.valueOf(this.readByUser).hashCode() * 31) + Arrays.hashCode(this.mailBoxItemId);
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("SetMessageReadByUserRequestDto(readByUser=");
        a.append(this.readByUser);
        a.append(", mailBoxItemId=");
        return C0082a.m106a(a, Arrays.toString(this.mailBoxItemId), ")");
    }
}
