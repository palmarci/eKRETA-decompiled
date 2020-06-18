package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001e\u0010\u0017\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "", "uid", "", "shortName", "systemModuleList", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto$SystemModule;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "isActiveBaseKreta", "", "()Z", "isActiveEAdministration", "isActiveKretaEsl", "getShortName", "()Ljava/lang/String;", "getUid", "component1", "component2", "component3", "copy", "equals", "other", "findByType", "type", "hashCode", "", "toString", "SystemModule", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstitutionDto.kt */
public final class InstitutionDto {
    @c("RovidNev")
    public final String shortName;
    @c("Rendszermodulok")
    public final List<SystemModule> systemModuleList;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto$SystemModule;", "", "isActive", "", "type", "", "(ZLjava/lang/String;)V", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: InstitutionDto.kt */
    public static final class SystemModule {
        @c("IsAktiv")
        public final boolean isActive;
        @c("Tipus")
        public final String type;

        public SystemModule(boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, "type");
            this.isActive = z;
            this.type = str;
        }

        public static /* synthetic */ SystemModule copy$default(SystemModule systemModule, boolean z, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = systemModule.isActive;
            }
            if ((i2 & 2) != 0) {
                str = systemModule.type;
            }
            return systemModule.copy(z, str);
        }

        public final boolean component1() {
            return this.isActive;
        }

        public final String component2() {
            return this.type;
        }

        public final SystemModule copy(boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, "type");
            return new SystemModule(z, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SystemModule) {
                    SystemModule systemModule = (SystemModule) obj;
                    if (!(this.isActive == systemModule.isActive) || !Intrinsics.areEqual((Object) this.type, (Object) systemModule.type)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            boolean z = this.isActive;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            String str = this.type;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public String toString() {
            StringBuilder a2 = a.a("SystemModule(isActive=");
            a2.append(this.isActive);
            a2.append(", type=");
            return a.a(a2, this.type, ")");
        }
    }

    public InstitutionDto(String str, String str2, List<SystemModule> list) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(list, "systemModuleList");
        this.uid = str;
        this.shortName = str2;
        this.systemModuleList = list;
    }

    private final List<SystemModule> component3() {
        return this.systemModuleList;
    }

    public static /* synthetic */ InstitutionDto copy$default(InstitutionDto institutionDto, String str, String str2, List<SystemModule> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = institutionDto.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = institutionDto.shortName;
        }
        if ((i2 & 4) != 0) {
            list = institutionDto.systemModuleList;
        }
        return institutionDto.copy(str, str2, list);
    }

    private final boolean findByType(List<SystemModule> list, String str) {
        boolean z = false;
        for (SystemModule next : list) {
            if (Intrinsics.areEqual((Object) next.getType(), (Object) str)) {
                z = next.isActive();
            }
        }
        return z;
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.shortName;
    }

    public final InstitutionDto copy(String str, String str2, List<SystemModule> list) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(list, "systemModuleList");
        return new InstitutionDto(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstitutionDto)) {
            return false;
        }
        InstitutionDto institutionDto = (InstitutionDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) institutionDto.uid) && Intrinsics.areEqual((Object) this.shortName, (Object) institutionDto.shortName) && Intrinsics.areEqual((Object) this.systemModuleList, (Object) institutionDto.systemModuleList);
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shortName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<SystemModule> list = this.systemModuleList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final boolean isActiveBaseKreta() {
        return findByType(this.systemModuleList, "AlapKreta");
    }

    public final boolean isActiveEAdministration() {
        return findByType(this.systemModuleList, "Eugyintezes");
    }

    public final boolean isActiveKretaEsl() {
        return findByType(this.systemModuleList, "KretaEsl");
    }

    public String toString() {
        StringBuilder a2 = a.a("InstitutionDto(uid=");
        a2.append(this.uid);
        a2.append(", shortName=");
        a2.append(this.shortName);
        a2.append(", systemModuleList=");
        return a.a(a2, (List) this.systemModuleList, ")");
    }
}
