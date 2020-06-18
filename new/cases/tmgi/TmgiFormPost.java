package hu.ekreta.ellenorzo.cases.tmgi;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J{\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "", "startDate", "", "endDate", "childrenFirstName", "childrenLastName", "childrenEducationId", "caseType", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "tmgiCaseType", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "reason", "mandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "optionalDocuments", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/CaseType;Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getChildrenEducationId", "()Ljava/lang/String;", "getChildrenFirstName", "getChildrenLastName", "getEndDate", "getMandatoryDocuments", "()Ljava/util/List;", "getOptionalDocuments", "getReason", "getStartDate", "getTmgiCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiFormPost.kt */
public final class TmgiFormPost {

    /* renamed from: a  reason: collision with root package name */
    public final String f5243a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5244d;
    public final String e;
    public final CaseType f;

    /* renamed from: g  reason: collision with root package name */
    public final TmgiCaseType f5245g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5246h;

    /* renamed from: i  reason: collision with root package name */
    public final List<ApplicationMandatoryDocument> f5247i;

    /* renamed from: j  reason: collision with root package name */
    public final List<OtherThingsToDoAttachment> f5248j;

    public TmgiFormPost(String str, String str2, String str3, String str4, String str5, CaseType caseType, TmgiCaseType tmgiCaseType, String str6, List<ApplicationMandatoryDocument> list, List<OtherThingsToDoAttachment> list2) {
        Intrinsics.checkParameterIsNotNull(str, "startDate");
        Intrinsics.checkParameterIsNotNull(str2, "endDate");
        Intrinsics.checkParameterIsNotNull(str3, "childrenFirstName");
        Intrinsics.checkParameterIsNotNull(str4, "childrenLastName");
        Intrinsics.checkParameterIsNotNull(str5, "childrenEducationId");
        Intrinsics.checkParameterIsNotNull(caseType, "caseType");
        Intrinsics.checkParameterIsNotNull(tmgiCaseType, "tmgiCaseType");
        Intrinsics.checkParameterIsNotNull(list, "mandatoryDocuments");
        Intrinsics.checkParameterIsNotNull(list2, "optionalDocuments");
        this.f5243a = str;
        this.b = str2;
        this.c = str3;
        this.f5244d = str4;
        this.e = str5;
        this.f = caseType;
        this.f5245g = tmgiCaseType;
        this.f5246h = str6;
        this.f5247i = list;
        this.f5248j = list2;
    }

    public static /* synthetic */ TmgiFormPost copy$default(TmgiFormPost tmgiFormPost, String str, String str2, String str3, String str4, String str5, CaseType caseType, TmgiCaseType tmgiCaseType, String str6, List list, List list2, int i2, Object obj) {
        TmgiFormPost tmgiFormPost2 = tmgiFormPost;
        int i3 = i2;
        return tmgiFormPost.a((i3 & 1) != 0 ? tmgiFormPost2.f5243a : str, (i3 & 2) != 0 ? tmgiFormPost2.b : str2, (i3 & 4) != 0 ? tmgiFormPost2.c : str3, (i3 & 8) != 0 ? tmgiFormPost2.f5244d : str4, (i3 & 16) != 0 ? tmgiFormPost2.e : str5, (i3 & 32) != 0 ? tmgiFormPost2.f : caseType, (i3 & 64) != 0 ? tmgiFormPost2.f5245g : tmgiCaseType, (i3 & 128) != 0 ? tmgiFormPost2.f5246h : str6, (i3 & 256) != 0 ? tmgiFormPost2.f5247i : list, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tmgiFormPost2.f5248j : list2);
    }

    public final CaseType a() {
        return this.f;
    }

    public final TmgiFormPost a(String str, String str2, String str3, String str4, String str5, CaseType caseType, TmgiCaseType tmgiCaseType, String str6, List<ApplicationMandatoryDocument> list, List<OtherThingsToDoAttachment> list2) {
        Intrinsics.checkParameterIsNotNull(str, "startDate");
        Intrinsics.checkParameterIsNotNull(str2, "endDate");
        Intrinsics.checkParameterIsNotNull(str3, "childrenFirstName");
        String str7 = str4;
        Intrinsics.checkParameterIsNotNull(str7, "childrenLastName");
        String str8 = str5;
        Intrinsics.checkParameterIsNotNull(str8, "childrenEducationId");
        CaseType caseType2 = caseType;
        Intrinsics.checkParameterIsNotNull(caseType2, "caseType");
        TmgiCaseType tmgiCaseType2 = tmgiCaseType;
        Intrinsics.checkParameterIsNotNull(tmgiCaseType2, "tmgiCaseType");
        List<ApplicationMandatoryDocument> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "mandatoryDocuments");
        List<OtherThingsToDoAttachment> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "optionalDocuments");
        return new TmgiFormPost(str, str2, str3, str7, str8, caseType2, tmgiCaseType2, str6, list3, list4);
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.f5244d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmgiFormPost)) {
            return false;
        }
        TmgiFormPost tmgiFormPost = (TmgiFormPost) obj;
        return Intrinsics.areEqual((Object) this.f5243a, (Object) tmgiFormPost.f5243a) && Intrinsics.areEqual((Object) this.b, (Object) tmgiFormPost.b) && Intrinsics.areEqual((Object) this.c, (Object) tmgiFormPost.c) && Intrinsics.areEqual((Object) this.f5244d, (Object) tmgiFormPost.f5244d) && Intrinsics.areEqual((Object) this.e, (Object) tmgiFormPost.e) && Intrinsics.areEqual((Object) this.f, (Object) tmgiFormPost.f) && Intrinsics.areEqual((Object) this.f5245g, (Object) tmgiFormPost.f5245g) && Intrinsics.areEqual((Object) this.f5246h, (Object) tmgiFormPost.f5246h) && Intrinsics.areEqual((Object) this.f5247i, (Object) tmgiFormPost.f5247i) && Intrinsics.areEqual((Object) this.f5248j, (Object) tmgiFormPost.f5248j);
    }

    public final List<ApplicationMandatoryDocument> f() {
        return this.f5247i;
    }

    public final List<OtherThingsToDoAttachment> g() {
        return this.f5248j;
    }

    public final String h() {
        return this.f5246h;
    }

    public int hashCode() {
        String str = this.f5243a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5244d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        CaseType caseType = this.f;
        int hashCode6 = (hashCode5 + (caseType != null ? caseType.hashCode() : 0)) * 31;
        TmgiCaseType tmgiCaseType = this.f5245g;
        int hashCode7 = (hashCode6 + (tmgiCaseType != null ? tmgiCaseType.hashCode() : 0)) * 31;
        String str6 = this.f5246h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocument> list = this.f5247i;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachment> list2 = this.f5248j;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String i() {
        return this.f5243a;
    }

    public final TmgiCaseType j() {
        return this.f5245g;
    }

    public String toString() {
        StringBuilder a2 = a.a("TmgiFormPost(startDate=");
        a2.append(this.f5243a);
        a2.append(", endDate=");
        a2.append(this.b);
        a2.append(", childrenFirstName=");
        a2.append(this.c);
        a2.append(", childrenLastName=");
        a2.append(this.f5244d);
        a2.append(", childrenEducationId=");
        a2.append(this.e);
        a2.append(", caseType=");
        a2.append(this.f);
        a2.append(", tmgiCaseType=");
        a2.append(this.f5245g);
        a2.append(", reason=");
        a2.append(this.f5246h);
        a2.append(", mandatoryDocuments=");
        a2.append(this.f5247i);
        a2.append(", optionalDocuments=");
        return a.a(a2, (List) this.f5248j, ")");
    }
}
