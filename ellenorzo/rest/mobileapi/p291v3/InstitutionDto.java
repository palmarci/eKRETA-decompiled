package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001e\u0010\u0017\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto;", "", "uid", "", "shortName", "systemModuleList", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto$SystemModule;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "isActiveBaseKreta", "", "()Z", "isActiveEAdministration", "isActiveKretaEsl", "getShortName", "()Ljava/lang/String;", "getUid", "component1", "component2", "component3", "copy", "equals", "other", "findByType", "type", "hashCode", "", "toString", "SystemModule", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto */
/* compiled from: InstitutionDto.kt */
public final class InstitutionDto {
    @C2580c("RovidNev")
    public final String shortName;
    @C2580c("Rendszermodulok")
    public final List<SystemModule> systemModuleList;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/InstitutionDto$SystemModule;", "", "isActive", "", "type", "", "(ZLjava/lang/String;)V", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto$SystemModule */
    /* compiled from: InstitutionDto.kt */
    public static final class SystemModule {
        @C2580c("IsAktiv")
        public final boolean isActive;
        @C2580c("Tipus")
        public final String type;

        public SystemModule(boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, "type");
            this.isActive = z;
            this.type = str;
        }

        public static /* synthetic */ SystemModule copy$default(SystemModule systemModule, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = systemModule.isActive;
            }
            if ((i & 2) != 0) {
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
            int i = (z ? 1 : 0) * true;
            String str = this.type;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("SystemModule(isActive=");
            a.append(this.isActive);
            a.append(", type=");
            return C0082a.m106a(a, this.type, ")");
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

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto$SystemModule>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto copy$default(p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto r0, java.lang.String r1, java.lang.String r2, java.util.List<p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto.SystemModule> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.uid
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.lang.String r2 = r0.shortName
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto$SystemModule> r3 = r0.systemModuleList
        L_0x0012:
            hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto.copy$default(hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object):hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto");
    }

    private final boolean findByType(List<SystemModule> list, String str) {
        boolean z = false;
        for (SystemModule systemModule : list) {
            if (Intrinsics.areEqual((Object) systemModule.getType(), (Object) str)) {
                z = systemModule.isActive();
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.systemModuleList, (java.lang.Object) r3.systemModuleList) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto
            if (r0 == 0) goto L_0x0027
            hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.shortName
            java.lang.String r1 = r3.shortName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto$SystemModule> r0 = r2.systemModuleList
            java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto$SystemModule> r3 = r3.systemModuleList
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto.equals(java.lang.Object):boolean");
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shortName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<SystemModule> list = this.systemModuleList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
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
        StringBuilder a = C0082a.m111a("InstitutionDto(uid=");
        a.append(this.uid);
        a.append(", shortName=");
        a.append(this.shortName);
        a.append(", systemModuleList=");
        return C0082a.m108a(a, (List) this.systemModuleList, ")");
    }
}
