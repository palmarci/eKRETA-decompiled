package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.dto.ProfileSpecificDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<=BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\fHÂ\u0003J\t\u0010-\u001a\u00020\fHÂ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÂ\u0003Jg\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00101\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\nHÖ\u0001J\u001f\u00105\u001a\u0002H6\"\b\b\u0000\u00106*\u0002072\u0006\u00108\u001a\u000209H\u0016¢\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\u0004HÖ\u0001R\u0010\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014¨\u0006>"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "Lhu/ekreta/ellenorzo/util/dto/ProfileSpecificDto;", "Lhu/ekreta/ellenorzo/group/Group;", "uid", "", "name", "isActive", "", "type", "sortIndex", "", "educationType", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$ValueDescriptor;", "category", "classMaster", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$UidStructure;", "classMasterAssistant", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$UidStructure;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$UidStructure;)V", "categoryDescription", "getCategoryDescription", "()Ljava/lang/String;", "categoryName", "getCategoryName", "classMasterAssistantUid", "getClassMasterAssistantUid", "classMasterUid", "getClassMasterUid", "educationTypeDescription", "getEducationTypeDescription", "educationTypeName", "getEducationTypeName", "educationTypeUid", "getEducationTypeUid", "()Z", "getName", "getSortIndex", "()I", "getType", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toModel", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "toString", "UidStructure", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto */
/* compiled from: GroupDto.kt */
public final class GroupDto implements ProfileSpecificDto<Group> {
    @C2580c("OktatasNevelesiKategoria")
    public final ValueDescriptor category;
    @C2580c("OsztalyFonok")
    public final UidStructure classMaster;
    @C2580c("OsztalyFonokHelyettes")
    public final UidStructure classMasterAssistant;
    @C2580c("OktatasNevelesiFeladat")
    public final ValueDescriptor educationType;
    @C2580c("IsAktiv")
    public final boolean isActive;
    @C2580c("Nev")
    public final String name;
    @C2580c("OktatasNevelesiFeladatSortIndex")
    public final int sortIndex;
    @C2580c("Tipus")
    public final String type;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto$UidStructure */
    /* compiled from: GroupDto.kt */
    public static final class UidStructure {
        @C2580c("Uid")
        public final String uid;

        public UidStructure(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ UidStructure copy$default(UidStructure uidStructure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uidStructure.uid;
            }
            return uidStructure.copy(str);
        }

        public final String component1() {
            return this.uid;
        }

        public final UidStructure copy(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            return new UidStructure(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.UidStructure) r2
                java.lang.String r0 = r1.uid
                java.lang.String r2 = r2.uid
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.UidStructure.equals(java.lang.Object):boolean");
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("UidStructure(uid="), this.uid, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto$ValueDescriptor */
    /* compiled from: GroupDto.kt */
    public static final class ValueDescriptor {
        @C2580c("Leiras")
        public final String description;
        @C2580c("Nev")
        public final String name;
        @C2580c("Uid")
        public final String uid;

        public ValueDescriptor(String str, String str2, String str3) {
            C0082a.m114a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ ValueDescriptor copy$default(ValueDescriptor valueDescriptor, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueDescriptor.uid;
            }
            if ((i & 2) != 0) {
                str2 = valueDescriptor.description;
            }
            if ((i & 4) != 0) {
                str3 = valueDescriptor.name;
            }
            return valueDescriptor.copy(str, str2, str3);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.description;
        }

        public final String component3() {
            return this.name;
        }

        public final ValueDescriptor copy(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "description");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            return new ValueDescriptor(str, str2, str3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.ValueDescriptor) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.description
                java.lang.String r1 = r3.description
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.name
                java.lang.String r3 = r3.name
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto.ValueDescriptor.equals(java.lang.Object):boolean");
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("ValueDescriptor(uid=");
            a.append(this.uid);
            a.append(", description=");
            a.append(this.description);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    public GroupDto(String str, String str2, boolean z, String str3, int i, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, UidStructure uidStructure, UidStructure uidStructure2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "type");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "educationType");
        Intrinsics.checkParameterIsNotNull(valueDescriptor2, "category");
        this.uid = str;
        this.name = str2;
        this.isActive = z;
        this.type = str3;
        this.sortIndex = i;
        this.educationType = valueDescriptor;
        this.category = valueDescriptor2;
        this.classMaster = uidStructure;
        this.classMasterAssistant = uidStructure2;
    }

    private final ValueDescriptor component6() {
        return this.educationType;
    }

    private final ValueDescriptor component7() {
        return this.category;
    }

    private final UidStructure component8() {
        return this.classMaster;
    }

    private final UidStructure component9() {
        return this.classMasterAssistant;
    }

    public static /* synthetic */ GroupDto copy$default(GroupDto groupDto, String str, String str2, boolean z, String str3, int i, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, UidStructure uidStructure, UidStructure uidStructure2, int i2, Object obj) {
        GroupDto groupDto2 = groupDto;
        int i3 = i2;
        return groupDto.copy((i3 & 1) != 0 ? groupDto2.uid : str, (i3 & 2) != 0 ? groupDto2.name : str2, (i3 & 4) != 0 ? groupDto2.isActive : z, (i3 & 8) != 0 ? groupDto2.type : str3, (i3 & 16) != 0 ? groupDto2.sortIndex : i, (i3 & 32) != 0 ? groupDto2.educationType : valueDescriptor, (i3 & 64) != 0 ? groupDto2.category : valueDescriptor2, (i3 & 128) != 0 ? groupDto2.classMaster : uidStructure, (i3 & 256) != 0 ? groupDto2.classMasterAssistant : uidStructure2);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final String component4() {
        return this.type;
    }

    public final int component5() {
        return this.sortIndex;
    }

    public final GroupDto copy(String str, String str2, boolean z, String str3, int i, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, UidStructure uidStructure, UidStructure uidStructure2) {
        String str4 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str5 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "name");
        String str6 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "type");
        ValueDescriptor valueDescriptor3 = valueDescriptor;
        Intrinsics.checkParameterIsNotNull(valueDescriptor3, "educationType");
        ValueDescriptor valueDescriptor4 = valueDescriptor2;
        Intrinsics.checkParameterIsNotNull(valueDescriptor4, "category");
        GroupDto groupDto = new GroupDto(str4, str5, z, str6, i, valueDescriptor3, valueDescriptor4, uidStructure, uidStructure2);
        return groupDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GroupDto) {
                GroupDto groupDto = (GroupDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) groupDto.uid) && Intrinsics.areEqual((Object) this.name, (Object) groupDto.name)) {
                    if ((this.isActive == groupDto.isActive) && Intrinsics.areEqual((Object) this.type, (Object) groupDto.type)) {
                        if (!(this.sortIndex == groupDto.sortIndex) || !Intrinsics.areEqual((Object) this.educationType, (Object) groupDto.educationType) || !Intrinsics.areEqual((Object) this.category, (Object) groupDto.category) || !Intrinsics.areEqual((Object) this.classMaster, (Object) groupDto.classMaster) || !Intrinsics.areEqual((Object) this.classMasterAssistant, (Object) groupDto.classMasterAssistant)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCategoryDescription() {
        return this.category.getDescription();
    }

    public final String getCategoryName() {
        return this.category.getName();
    }

    public final String getClassMasterAssistantUid() {
        UidStructure uidStructure = this.classMasterAssistant;
        if (uidStructure != null) {
            return uidStructure.getUid();
        }
        return null;
    }

    public final String getClassMasterUid() {
        UidStructure uidStructure = this.classMaster;
        if (uidStructure != null) {
            return uidStructure.getUid();
        }
        return null;
    }

    public final String getEducationTypeDescription() {
        return this.educationType.getDescription();
    }

    public final String getEducationTypeName() {
        return this.educationType.getName();
    }

    public final String getEducationTypeUid() {
        return this.educationType.getUid();
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isActive;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.type;
        int hashCode3 = (((i2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.sortIndex) * 31;
        ValueDescriptor valueDescriptor = this.educationType;
        int hashCode4 = (hashCode3 + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor2 = this.category;
        int hashCode5 = (hashCode4 + (valueDescriptor2 != null ? valueDescriptor2.hashCode() : 0)) * 31;
        UidStructure uidStructure = this.classMaster;
        int hashCode6 = (hashCode5 + (uidStructure != null ? uidStructure.hashCode() : 0)) * 31;
        UidStructure uidStructure2 = this.classMasterAssistant;
        if (uidStructure2 != null) {
            i = uidStructure2.hashCode();
        }
        return hashCode6 + i;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public <TModel extends ProfileSpecificModel> TModel toModel(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Group group = new Group(profile.mo14054m(), this.uid, this.name, this.isActive, this.type, getEducationTypeName(), getEducationTypeDescription(), getEducationTypeUid(), getClassMasterUid(), getClassMasterAssistantUid(), getCategoryName(), getCategoryDescription(), this.sortIndex);
        return group;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("GroupDto(uid=");
        a.append(this.uid);
        a.append(", name=");
        a.append(this.name);
        a.append(", isActive=");
        a.append(this.isActive);
        a.append(", type=");
        a.append(this.type);
        a.append(", sortIndex=");
        a.append(this.sortIndex);
        a.append(", educationType=");
        a.append(this.educationType);
        a.append(", category=");
        a.append(this.category);
        a.append(", classMaster=");
        a.append(this.classMaster);
        a.append(", classMasterAssistant=");
        a.append(this.classMasterAssistant);
        a.append(")");
        return a.toString();
    }
}
