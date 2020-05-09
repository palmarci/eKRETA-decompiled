package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006%"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "", "id", "", "kretaId", "name", "", "type", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto$Type;", "(JJLjava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto$Type;)V", "getId", "()J", "getKretaId", "getName", "()Ljava/lang/String;", "typeCode", "getTypeCode", "typeDescription", "getTypeDescription", "typeId", "getTypeId", "typeName", "getTypeName", "typeShortName", "getTypeShortName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto */
/* compiled from: AddresseeDto.kt */
public final class AddresseeDto {
    @C2580c("azonosito")

    /* renamed from: id */
    public final long f14680id;
    @C2580c("kretaAzonosito")
    public final long kretaId;
    @C2580c("nev")
    public final String name;
    @C2580c("tipus")
    public final Type type;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto$Type;", "", "typeId", "", "typeCode", "", "typeShortName", "typeName", "typeDescription", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTypeCode", "()Ljava/lang/String;", "getTypeDescription", "getTypeId", "()J", "getTypeName", "getTypeShortName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto$Type */
    /* compiled from: AddresseeDto.kt */
    public static final class Type {
        @C2580c("kod")
        public final String typeCode;
        @C2580c("leiras")
        public final String typeDescription;
        @C2580c("azonosito")
        public final long typeId;
        @C2580c("nev")
        public final String typeName;
        @C2580c("rovidNev")
        public final String typeShortName;

        public Type(long j, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "typeCode");
            Intrinsics.checkParameterIsNotNull(str2, "typeShortName");
            Intrinsics.checkParameterIsNotNull(str3, "typeName");
            Intrinsics.checkParameterIsNotNull(str4, "typeDescription");
            this.typeId = j;
            this.typeCode = str;
            this.typeShortName = str2;
            this.typeName = str3;
            this.typeDescription = str4;
        }

        public static /* synthetic */ Type copy$default(Type type, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = type.typeId;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = type.typeCode;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = type.typeShortName;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = type.typeName;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = type.typeDescription;
            }
            return type.copy(j2, str5, str6, str7, str4);
        }

        public final long component1() {
            return this.typeId;
        }

        public final String component2() {
            return this.typeCode;
        }

        public final String component3() {
            return this.typeShortName;
        }

        public final String component4() {
            return this.typeName;
        }

        public final String component5() {
            return this.typeDescription;
        }

        public final Type copy(long j, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "typeCode");
            Intrinsics.checkParameterIsNotNull(str2, "typeShortName");
            Intrinsics.checkParameterIsNotNull(str3, "typeName");
            Intrinsics.checkParameterIsNotNull(str4, "typeDescription");
            Type type = new Type(j, str, str2, str3, str4);
            return type;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Type) {
                    Type type = (Type) obj;
                    if (!(this.typeId == type.typeId) || !Intrinsics.areEqual((Object) this.typeCode, (Object) type.typeCode) || !Intrinsics.areEqual((Object) this.typeShortName, (Object) type.typeShortName) || !Intrinsics.areEqual((Object) this.typeName, (Object) type.typeName) || !Intrinsics.areEqual((Object) this.typeDescription, (Object) type.typeDescription)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String getTypeCode() {
            return this.typeCode;
        }

        public final String getTypeDescription() {
            return this.typeDescription;
        }

        public final long getTypeId() {
            return this.typeId;
        }

        public final String getTypeName() {
            return this.typeName;
        }

        public final String getTypeShortName() {
            return this.typeShortName;
        }

        public int hashCode() {
            long j = this.typeId;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.typeCode;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.typeShortName;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.typeName;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.typeDescription;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Type(typeId=");
            a.append(this.typeId);
            a.append(", typeCode=");
            a.append(this.typeCode);
            a.append(", typeShortName=");
            a.append(this.typeShortName);
            a.append(", typeName=");
            a.append(this.typeName);
            a.append(", typeDescription=");
            return C0082a.m106a(a, this.typeDescription, ")");
        }
    }

    public AddresseeDto(long j, long j2, String str, Type type2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(type2, "type");
        this.f14680id = j;
        this.kretaId = j2;
        this.name = str;
        this.type = type2;
    }

    private final Type component4() {
        return this.type;
    }

    public static /* synthetic */ AddresseeDto copy$default(AddresseeDto addresseeDto, long j, long j2, String str, Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addresseeDto.f14680id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = addresseeDto.kretaId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = addresseeDto.name;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            type2 = addresseeDto.type;
        }
        return addresseeDto.copy(j3, j4, str2, type2);
    }

    public final long component1() {
        return this.f14680id;
    }

    public final long component2() {
        return this.kretaId;
    }

    public final String component3() {
        return this.name;
    }

    public final AddresseeDto copy(long j, long j2, String str, Type type2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(type2, "type");
        AddresseeDto addresseeDto = new AddresseeDto(j, j2, str, type2);
        return addresseeDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddresseeDto) {
                AddresseeDto addresseeDto = (AddresseeDto) obj;
                if (this.f14680id == addresseeDto.f14680id) {
                    if (!(this.kretaId == addresseeDto.kretaId) || !Intrinsics.areEqual((Object) this.name, (Object) addresseeDto.name) || !Intrinsics.areEqual((Object) this.type, (Object) addresseeDto.type)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getId() {
        return this.f14680id;
    }

    public final long getKretaId() {
        return this.kretaId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTypeCode() {
        return this.type.getTypeCode();
    }

    public final String getTypeDescription() {
        return this.type.getTypeDescription();
    }

    public final long getTypeId() {
        return this.type.getTypeId();
    }

    public final String getTypeName() {
        return this.type.getTypeName();
    }

    public final String getTypeShortName() {
        return this.type.getTypeShortName();
    }

    public int hashCode() {
        long j = this.f14680id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.kretaId;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.name;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        Type type2 = this.type;
        if (type2 != null) {
            i3 = type2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("AddresseeDto(id=");
        a.append(this.f14680id);
        a.append(", kretaId=");
        a.append(this.kretaId);
        a.append(", name=");
        a.append(this.name);
        a.append(", type=");
        a.append(this.type);
        a.append(")");
        return a.toString();
    }
}
