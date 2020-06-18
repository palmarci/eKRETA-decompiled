package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÂ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolClassDto;", "", "uid", "", "name", "category", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolClassDto$CategoryDto;", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolClassDto$CategoryDto;)V", "categoryDescription", "getCategoryDescription", "()Ljava/lang/String;", "categoryName", "getCategoryName", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "CategoryDto", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SchoolClassDto.kt */
public final class SchoolClassDto {
    @c("OktatasNevelesiKategoria")
    public final CategoryDto category;
    @c("Nev")
    public final String name;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolClassDto$CategoryDto;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SchoolClassDto.kt */
    public static final class CategoryDto {
        @c("Leiras")
        public final String description;
        @c("Nev")
        public final String name;
        @c("Uid")
        public final String uid;

        public CategoryDto(String str, String str2, String str3) {
            a.a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ CategoryDto copy$default(CategoryDto categoryDto, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = categoryDto.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = categoryDto.description;
            }
            if ((i2 & 4) != 0) {
                str3 = categoryDto.name;
            }
            return categoryDto.copy(str, str2, str3);
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

        public final CategoryDto copy(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "description");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            return new CategoryDto(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryDto)) {
                return false;
            }
            CategoryDto categoryDto = (CategoryDto) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) categoryDto.uid) && Intrinsics.areEqual((Object) this.description, (Object) categoryDto.description) && Intrinsics.areEqual((Object) this.name, (Object) categoryDto.name);
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
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("CategoryDto(uid=");
            a2.append(this.uid);
            a2.append(", description=");
            a2.append(this.description);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
        }
    }

    public SchoolClassDto(String str, String str2, CategoryDto categoryDto) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(categoryDto, "category");
        this.uid = str;
        this.name = str2;
        this.category = categoryDto;
    }

    private final CategoryDto component3() {
        return this.category;
    }

    public static /* synthetic */ SchoolClassDto copy$default(SchoolClassDto schoolClassDto, String str, String str2, CategoryDto categoryDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = schoolClassDto.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = schoolClassDto.name;
        }
        if ((i2 & 4) != 0) {
            categoryDto = schoolClassDto.category;
        }
        return schoolClassDto.copy(str, str2, categoryDto);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.name;
    }

    public final SchoolClassDto copy(String str, String str2, CategoryDto categoryDto) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(categoryDto, "category");
        return new SchoolClassDto(str, str2, categoryDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolClassDto)) {
            return false;
        }
        SchoolClassDto schoolClassDto = (SchoolClassDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) schoolClassDto.uid) && Intrinsics.areEqual((Object) this.name, (Object) schoolClassDto.name) && Intrinsics.areEqual((Object) this.category, (Object) schoolClassDto.category);
    }

    public final String getCategoryDescription() {
        return this.category.getDescription();
    }

    public final String getCategoryName() {
        return this.category.getName();
    }

    public final String getName() {
        return this.name;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        CategoryDto categoryDto = this.category;
        if (categoryDto != null) {
            i2 = categoryDto.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("SchoolClassDto(uid=");
        a2.append(this.uid);
        a2.append(", name=");
        a2.append(this.name);
        a2.append(", category=");
        a2.append(this.category);
        a2.append(")");
        return a2.toString();
    }
}
