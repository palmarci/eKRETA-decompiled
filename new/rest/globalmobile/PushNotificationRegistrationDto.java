package hu.ekreta.ellenorzo.rest.globalmobile;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/globalmobile/PushNotificationRegistrationDto;", "", "registrationID", "", "(Ljava/lang/String;)V", "getRegistrationID", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: PushNotificationRegistrationDto.kt */
public final class PushNotificationRegistrationDto {
    @c("registrationId")
    public final String registrationID;

    public PushNotificationRegistrationDto(String str) {
        Intrinsics.checkParameterIsNotNull(str, "registrationID");
        this.registrationID = str;
    }

    public static /* synthetic */ PushNotificationRegistrationDto copy$default(PushNotificationRegistrationDto pushNotificationRegistrationDto, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pushNotificationRegistrationDto.registrationID;
        }
        return pushNotificationRegistrationDto.copy(str);
    }

    public final String component1() {
        return this.registrationID;
    }

    public final PushNotificationRegistrationDto copy(String str) {
        Intrinsics.checkParameterIsNotNull(str, "registrationID");
        return new PushNotificationRegistrationDto(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PushNotificationRegistrationDto) && Intrinsics.areEqual((Object) this.registrationID, (Object) ((PushNotificationRegistrationDto) obj).registrationID);
        }
        return true;
    }

    public final String getRegistrationID() {
        return this.registrationID;
    }

    public int hashCode() {
        String str = this.registrationID;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.a(a.a("PushNotificationRegistrationDto(registrationID="), this.registrationID, ")");
    }
}
