package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J¦\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00069"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoItemDto;", "", "id", "", "documentTemplateId", "isReady", "", "appellation", "", "help", "helpUrl", "executiveId", "sequence", "isOnline", "isAutomatic", "isSystemReady", "systemReadyText", "toDoMandatoryDocumentsList", "Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoMandatoryDocumentsListDto;", "label", "(ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZZLjava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoMandatoryDocumentsListDto;Ljava/lang/String;)V", "getAppellation", "()Ljava/lang/String;", "getDocumentTemplateId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExecutiveId", "getHelp", "getHelpUrl", "getId", "()I", "()Z", "getLabel", "getSequence", "getSystemReadyText", "getToDoMandatoryDocumentsList", "()Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoMandatoryDocumentsListDto;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZZLjava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoMandatoryDocumentsListDto;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/ToDoItemDto;", "equals", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.ToDoItemDto */
/* compiled from: ToDoItemDto.kt */
public final class ToDoItemDto {
    @C2580c("megnevezes")
    public final String appellation;
    @C2580c("dokumentumSablonAzonosito")
    public final Integer documentTemplateId;
    @C2580c("vegrehajtoKretaAzonosito")
    public final Integer executiveId;
    @C2580c("segitseg")
    public final String help;
    @C2580c("segitsegUrl")
    public final String helpUrl;
    @C2580c("azonosito")

    /* renamed from: id */
    public final int f14698id;
    @C2580c("isAutomatikus")
    public final boolean isAutomatic;
    @C2580c("isElektronizalt")
    public final boolean isOnline;
    @C2580c("isKesz")
    public final boolean isReady;
    @C2580c("isRendszerKesz")
    public final boolean isSystemReady;
    @C2580c("cimke")
    public final String label;
    @C2580c("sorrend")
    public final String sequence;
    @C2580c("rendszerKeszSzoveg")
    public final String systemReadyText;
    @C2580c("teendoKotelezoDokumentum")
    public final ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsList;

    public ToDoItemDto(int i, Integer num, boolean z, String str, String str2, String str3, Integer num2, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto, String str6) {
        C0082a.m114a(str, "appellation", str2, "help", str3, "helpUrl");
        this.f14698id = i;
        this.documentTemplateId = num;
        this.isReady = z;
        this.appellation = str;
        this.help = str2;
        this.helpUrl = str3;
        this.executiveId = num2;
        this.sequence = str4;
        this.isOnline = z2;
        this.isAutomatic = z3;
        this.isSystemReady = z4;
        this.systemReadyText = str5;
        this.toDoMandatoryDocumentsList = toDoMandatoryDocumentsListDto;
        this.label = str6;
    }

    public static /* synthetic */ ToDoItemDto copy$default(ToDoItemDto toDoItemDto, int i, Integer num, boolean z, String str, String str2, String str3, Integer num2, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto, String str6, int i2, Object obj) {
        ToDoItemDto toDoItemDto2 = toDoItemDto;
        int i3 = i2;
        return toDoItemDto.copy((i3 & 1) != 0 ? toDoItemDto2.f14698id : i, (i3 & 2) != 0 ? toDoItemDto2.documentTemplateId : num, (i3 & 4) != 0 ? toDoItemDto2.isReady : z, (i3 & 8) != 0 ? toDoItemDto2.appellation : str, (i3 & 16) != 0 ? toDoItemDto2.help : str2, (i3 & 32) != 0 ? toDoItemDto2.helpUrl : str3, (i3 & 64) != 0 ? toDoItemDto2.executiveId : num2, (i3 & 128) != 0 ? toDoItemDto2.sequence : str4, (i3 & 256) != 0 ? toDoItemDto2.isOnline : z2, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? toDoItemDto2.isAutomatic : z3, (i3 & 1024) != 0 ? toDoItemDto2.isSystemReady : z4, (i3 & 2048) != 0 ? toDoItemDto2.systemReadyText : str5, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? toDoItemDto2.toDoMandatoryDocumentsList : toDoMandatoryDocumentsListDto, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? toDoItemDto2.label : str6);
    }

    public final int component1() {
        return this.f14698id;
    }

    public final boolean component10() {
        return this.isAutomatic;
    }

    public final boolean component11() {
        return this.isSystemReady;
    }

    public final String component12() {
        return this.systemReadyText;
    }

    public final ToDoMandatoryDocumentsListDto component13() {
        return this.toDoMandatoryDocumentsList;
    }

    public final String component14() {
        return this.label;
    }

    public final Integer component2() {
        return this.documentTemplateId;
    }

    public final boolean component3() {
        return this.isReady;
    }

    public final String component4() {
        return this.appellation;
    }

    public final String component5() {
        return this.help;
    }

    public final String component6() {
        return this.helpUrl;
    }

    public final Integer component7() {
        return this.executiveId;
    }

    public final String component8() {
        return this.sequence;
    }

    public final boolean component9() {
        return this.isOnline;
    }

    public final ToDoItemDto copy(int i, Integer num, boolean z, String str, String str2, String str3, Integer num2, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto, String str6) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str7, "appellation");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str8, "help");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str9, "helpUrl");
        ToDoItemDto toDoItemDto = new ToDoItemDto(i, num, z, str7, str8, str9, num2, str4, z2, z3, z4, str5, toDoMandatoryDocumentsListDto, str6);
        return toDoItemDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToDoItemDto) {
                ToDoItemDto toDoItemDto = (ToDoItemDto) obj;
                if ((this.f14698id == toDoItemDto.f14698id) && Intrinsics.areEqual((Object) this.documentTemplateId, (Object) toDoItemDto.documentTemplateId)) {
                    if ((this.isReady == toDoItemDto.isReady) && Intrinsics.areEqual((Object) this.appellation, (Object) toDoItemDto.appellation) && Intrinsics.areEqual((Object) this.help, (Object) toDoItemDto.help) && Intrinsics.areEqual((Object) this.helpUrl, (Object) toDoItemDto.helpUrl) && Intrinsics.areEqual((Object) this.executiveId, (Object) toDoItemDto.executiveId) && Intrinsics.areEqual((Object) this.sequence, (Object) toDoItemDto.sequence)) {
                        if (this.isOnline == toDoItemDto.isOnline) {
                            if (this.isAutomatic == toDoItemDto.isAutomatic) {
                                if (!(this.isSystemReady == toDoItemDto.isSystemReady) || !Intrinsics.areEqual((Object) this.systemReadyText, (Object) toDoItemDto.systemReadyText) || !Intrinsics.areEqual((Object) this.toDoMandatoryDocumentsList, (Object) toDoItemDto.toDoMandatoryDocumentsList) || !Intrinsics.areEqual((Object) this.label, (Object) toDoItemDto.label)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAppellation() {
        return this.appellation;
    }

    public final Integer getDocumentTemplateId() {
        return this.documentTemplateId;
    }

    public final Integer getExecutiveId() {
        return this.executiveId;
    }

    public final String getHelp() {
        return this.help;
    }

    public final String getHelpUrl() {
        return this.helpUrl;
    }

    public final int getId() {
        return this.f14698id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSequence() {
        return this.sequence;
    }

    public final String getSystemReadyText() {
        return this.systemReadyText;
    }

    public final ToDoMandatoryDocumentsListDto getToDoMandatoryDocumentsList() {
        return this.toDoMandatoryDocumentsList;
    }

    public int hashCode() {
        int i = this.f14698id * 31;
        Integer num = this.documentTemplateId;
        int i2 = 0;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.isReady;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.appellation;
        int hashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.help;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.helpUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.executiveId;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.sequence;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z2 = this.isOnline;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode6 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isAutomatic;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isSystemReady;
        if (z4) {
            z4 = true;
        }
        int i6 = (i5 + (z4 ? 1 : 0)) * 31;
        String str5 = this.systemReadyText;
        int hashCode7 = (i6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto = this.toDoMandatoryDocumentsList;
        int hashCode8 = (hashCode7 + (toDoMandatoryDocumentsListDto != null ? toDoMandatoryDocumentsListDto.hashCode() : 0)) * 31;
        String str6 = this.label;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode8 + i2;
    }

    public final boolean isAutomatic() {
        return this.isAutomatic;
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public final boolean isSystemReady() {
        return this.isSystemReady;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ToDoItemDto(id=");
        a.append(this.f14698id);
        a.append(", documentTemplateId=");
        a.append(this.documentTemplateId);
        a.append(", isReady=");
        a.append(this.isReady);
        a.append(", appellation=");
        a.append(this.appellation);
        a.append(", help=");
        a.append(this.help);
        a.append(", helpUrl=");
        a.append(this.helpUrl);
        a.append(", executiveId=");
        a.append(this.executiveId);
        a.append(", sequence=");
        a.append(this.sequence);
        a.append(", isOnline=");
        a.append(this.isOnline);
        a.append(", isAutomatic=");
        a.append(this.isAutomatic);
        a.append(", isSystemReady=");
        a.append(this.isSystemReady);
        a.append(", systemReadyText=");
        a.append(this.systemReadyText);
        a.append(", toDoMandatoryDocumentsList=");
        a.append(this.toDoMandatoryDocumentsList);
        a.append(", label=");
        return C0082a.m106a(a, this.label, ")");
    }

    public /* synthetic */ ToDoItemDto(int i, Integer num, boolean z, String str, String str2, String str3, Integer num2, String str4, boolean z2, boolean z3, boolean z4, String str5, ToDoMandatoryDocumentsListDto toDoMandatoryDocumentsListDto, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2;
        this(i, (i3 & 2) != 0 ? null : num, z, str, str2, str3, (i3 & 64) != 0 ? null : num2, (i3 & 128) != 0 ? null : str4, z2, z3, z4, (i3 & 2048) != 0 ? null : str5, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : toDoMandatoryDocumentsListDto, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str6);
    }
}
