package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoMandatoryDocumentsListDto;", "", "id", "", "fileName", "", "registrationNumber", "file", "Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;)V", "getFile", "()Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getRegistrationNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ToDoMandatoryDocumentsListDto.kt */
public final class ToDoMandatoryDocumentsListDto {
    @c("fajl")
    public final FileDto file;
    @c("fajlNev")
    public final String fileName;
    @c("azonosito")
    public final int id;
    @c("iktatoszam")
    public final String registrationNumber;

    public ToDoMandatoryDocumentsListDto(int i2, String str, String str2, FileDto fileDto) {
        this.id = i2;
        this.fileName = str;
        this.registrationNumber = str2;
        this.file = fileDto;
    }

    public static /* synthetic */ ToDoMandatoryDocumentsListDto copy$default(ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto, int i2, String str, String str2, FileDto fileDto, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = toDoMandatoryDocumentsListDto.id;
        }
        if ((i3 & 2) != 0) {
            str = toDoMandatoryDocumentsListDto.fileName;
        }
        if ((i3 & 4) != 0) {
            str2 = toDoMandatoryDocumentsListDto.registrationNumber;
        }
        if ((i3 & 8) != 0) {
            fileDto = toDoMandatoryDocumentsListDto.file;
        }
        return toDoMandatoryDocumentsListDto.copy(i2, str, str2, fileDto);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.registrationNumber;
    }

    public final FileDto component4() {
        return this.file;
    }

    public final ToDoMandatoryDocumentsListDto copy(int i2, String str, String str2, FileDto fileDto) {
        return new ToDoMandatoryDocumentsListDto(i2, str, str2, fileDto);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToDoMandatoryDocumentsListDto) {
                ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto = (ToDoMandatoryDocumentsListDto) obj;
                if (!(this.id == toDoMandatoryDocumentsListDto.id) || !Intrinsics.areEqual((Object) this.fileName, (Object) toDoMandatoryDocumentsListDto.fileName) || !Intrinsics.areEqual((Object) this.registrationNumber, (Object) toDoMandatoryDocumentsListDto.registrationNumber) || !Intrinsics.areEqual((Object) this.file, (Object) toDoMandatoryDocumentsListDto.file)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final FileDto getFile() {
        return this.file;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getId() {
        return this.id;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int hashCode() {
        int i2 = this.id * 31;
        String str = this.fileName;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.registrationNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        FileDto fileDto = this.file;
        if (fileDto != null) {
            i3 = fileDto.hashCode();
        }
        return hashCode2 + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("ToDoMandatoryDocumentsListDto(id=");
        a2.append(this.id);
        a2.append(", fileName=");
        a2.append(this.fileName);
        a2.append(", registrationNumber=");
        a2.append(this.registrationNumber);
        a2.append(", file=");
        a2.append(this.file);
        a2.append(")");
        return a2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToDoMandatoryDocumentsListDto(int i2, String str, String str2, FileDto fileDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : fileDto);
    }
}
