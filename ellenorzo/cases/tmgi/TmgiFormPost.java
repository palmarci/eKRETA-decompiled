package p289hu.ekreta.ellenorzo.cases.tmgi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType;
import p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J{\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "", "startDate", "", "endDate", "childrenFirstName", "childrenLastName", "childrenEducationId", "caseType", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "tmgiCaseType", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "reason", "mandatoryDocuments", "", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "optionalDocuments", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/CaseType;Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getChildrenEducationId", "()Ljava/lang/String;", "getChildrenFirstName", "getChildrenLastName", "getEndDate", "getMandatoryDocuments", "()Ljava/util/List;", "getOptionalDocuments", "getReason", "getStartDate", "getTmgiCaseType", "()Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormPost */
/* compiled from: TmgiFormPost.kt */
public final class TmgiFormPost {

    /* renamed from: a */
    public final String f11702a;

    /* renamed from: b */
    public final String f11703b;

    /* renamed from: c */
    public final String f11704c;

    /* renamed from: d */
    public final String f11705d;

    /* renamed from: e */
    public final String f11706e;

    /* renamed from: f */
    public final CaseType f11707f;

    /* renamed from: g */
    public final TmgiCaseType f11708g;

    /* renamed from: h */
    public final String f11709h;

    /* renamed from: i */
    public final List<ApplicationMandatoryDocument> f11710i;

    /* renamed from: j */
    public final List<OtherThingsToDoAttachment> f11711j;

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
        this.f11702a = str;
        this.f11703b = str2;
        this.f11704c = str3;
        this.f11705d = str4;
        this.f11706e = str5;
        this.f11707f = caseType;
        this.f11708g = tmgiCaseType;
        this.f11709h = str6;
        this.f11710i = list;
        this.f11711j = list2;
    }

    public static /* synthetic */ TmgiFormPost copy$default(TmgiFormPost tmgiFormPost, String str, String str2, String str3, String str4, String str5, CaseType caseType, TmgiCaseType tmgiCaseType, String str6, List list, List list2, int i, Object obj) {
        TmgiFormPost tmgiFormPost2 = tmgiFormPost;
        int i2 = i;
        return tmgiFormPost.mo12125a((i2 & 1) != 0 ? tmgiFormPost2.f11702a : str, (i2 & 2) != 0 ? tmgiFormPost2.f11703b : str2, (i2 & 4) != 0 ? tmgiFormPost2.f11704c : str3, (i2 & 8) != 0 ? tmgiFormPost2.f11705d : str4, (i2 & 16) != 0 ? tmgiFormPost2.f11706e : str5, (i2 & 32) != 0 ? tmgiFormPost2.f11707f : caseType, (i2 & 64) != 0 ? tmgiFormPost2.f11708g : tmgiCaseType, (i2 & 128) != 0 ? tmgiFormPost2.f11709h : str6, (i2 & 256) != 0 ? tmgiFormPost2.f11710i : list, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tmgiFormPost2.f11711j : list2);
    }

    /* renamed from: a */
    public final CaseType mo12124a() {
        return this.f11707f;
    }

    /* renamed from: a */
    public final TmgiFormPost mo12125a(String str, String str2, String str3, String str4, String str5, CaseType caseType, TmgiCaseType tmgiCaseType, String str6, List<ApplicationMandatoryDocument> list, List<OtherThingsToDoAttachment> list2) {
        String str7 = str;
        Intrinsics.checkParameterIsNotNull(str, "startDate");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "endDate");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "childrenFirstName");
        String str10 = str4;
        Intrinsics.checkParameterIsNotNull(str10, "childrenLastName");
        String str11 = str5;
        Intrinsics.checkParameterIsNotNull(str11, "childrenEducationId");
        CaseType caseType2 = caseType;
        Intrinsics.checkParameterIsNotNull(caseType2, "caseType");
        TmgiCaseType tmgiCaseType2 = tmgiCaseType;
        Intrinsics.checkParameterIsNotNull(tmgiCaseType2, "tmgiCaseType");
        List<ApplicationMandatoryDocument> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "mandatoryDocuments");
        List<OtherThingsToDoAttachment> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "optionalDocuments");
        TmgiFormPost tmgiFormPost = new TmgiFormPost(str7, str8, str9, str10, str11, caseType2, tmgiCaseType2, str6, list3, list4);
        return tmgiFormPost;
    }

    /* renamed from: b */
    public final String mo12126b() {
        return this.f11706e;
    }

    /* renamed from: c */
    public final String mo12127c() {
        return this.f11704c;
    }

    /* renamed from: d */
    public final String mo12128d() {
        return this.f11705d;
    }

    /* renamed from: e */
    public final String mo12129e() {
        return this.f11703b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f11711j, (java.lang.Object) r3.f11711j) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x006f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.tmgi.TmgiFormPost
            if (r0 == 0) goto L_0x006d
            hu.ekreta.ellenorzo.cases.tmgi.TmgiFormPost r3 = (p289hu.ekreta.ellenorzo.cases.tmgi.TmgiFormPost) r3
            java.lang.String r0 = r2.f11702a
            java.lang.String r1 = r3.f11702a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.f11703b
            java.lang.String r1 = r3.f11703b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.f11704c
            java.lang.String r1 = r3.f11704c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.f11705d
            java.lang.String r1 = r3.f11705d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.f11706e
            java.lang.String r1 = r3.f11706e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            hu.ekreta.ellenorzo.cases.subModels.CaseType r0 = r2.f11707f
            hu.ekreta.ellenorzo.cases.subModels.CaseType r1 = r3.f11707f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType r0 = r2.f11708g
            hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType r1 = r3.f11708g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.f11709h
            java.lang.String r1 = r3.f11709h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument> r0 = r2.f11710i
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument> r1 = r3.f11710i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment> r0 = r2.f11711j
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment> r3 = r3.f11711j
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            return r3
        L_0x006f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.tmgi.TmgiFormPost.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final List<ApplicationMandatoryDocument> mo12131f() {
        return this.f11710i;
    }

    /* renamed from: g */
    public final List<OtherThingsToDoAttachment> mo12132g() {
        return this.f11711j;
    }

    /* renamed from: h */
    public final String mo12133h() {
        return this.f11709h;
    }

    public int hashCode() {
        String str = this.f11702a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11703b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11704c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11705d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11706e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        CaseType caseType = this.f11707f;
        int hashCode6 = (hashCode5 + (caseType != null ? caseType.hashCode() : 0)) * 31;
        TmgiCaseType tmgiCaseType = this.f11708g;
        int hashCode7 = (hashCode6 + (tmgiCaseType != null ? tmgiCaseType.hashCode() : 0)) * 31;
        String str6 = this.f11709h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocument> list = this.f11710i;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachment> list2 = this.f11711j;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final String mo12135i() {
        return this.f11702a;
    }

    /* renamed from: j */
    public final TmgiCaseType mo12136j() {
        return this.f11708g;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("TmgiFormPost(startDate=");
        a.append(this.f11702a);
        a.append(", endDate=");
        a.append(this.f11703b);
        a.append(", childrenFirstName=");
        a.append(this.f11704c);
        a.append(", childrenLastName=");
        a.append(this.f11705d);
        a.append(", childrenEducationId=");
        a.append(this.f11706e);
        a.append(", caseType=");
        a.append(this.f11707f);
        a.append(", tmgiCaseType=");
        a.append(this.f11708g);
        a.append(", reason=");
        a.append(this.f11709h);
        a.append(", mandatoryDocuments=");
        a.append(this.f11710i);
        a.append(", optionalDocuments=");
        return C0082a.m108a(a, (List) this.f11711j, ")");
    }
}
