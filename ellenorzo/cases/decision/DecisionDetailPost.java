package p289hu.ekreta.ellenorzo.cases.decision;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType;
import p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailPost;", "", "id", "", "typeCode", "type", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "attachments", "", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/CaseType;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getTypeCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost */
/* compiled from: DecisionDetailPost.kt */
public final class DecisionDetailPost {

    /* renamed from: a */
    public final String f11367a;

    /* renamed from: b */
    public final String f11368b;

    /* renamed from: c */
    public final CaseType f11369c;

    /* renamed from: d */
    public final List<OtherThingsToDoAttachment> f11370d;

    public DecisionDetailPost(String str, String str2, CaseType caseType, List<OtherThingsToDoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "typeCode");
        Intrinsics.checkParameterIsNotNull(caseType, "type");
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        this.f11367a = str;
        this.f11368b = str2;
        this.f11369c = caseType;
        this.f11370d = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment>, for r4v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost copy$default(p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost r0, java.lang.String r1, java.lang.String r2, p289hu.ekreta.ellenorzo.cases.subModels.CaseType r3, java.util.List<p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.f11367a
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.f11368b
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            hu.ekreta.ellenorzo.cases.subModels.CaseType r3 = r0.f11369c
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment> r4 = r0.f11370d
        L_0x0018:
            hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost r0 = r0.mo11718a(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost.copy$default(hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.cases.subModels.CaseType, java.util.List, int, java.lang.Object):hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost");
    }

    /* renamed from: a */
    public final DecisionDetailPost mo11718a(String str, String str2, CaseType caseType, List<OtherThingsToDoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "typeCode");
        Intrinsics.checkParameterIsNotNull(caseType, "type");
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        return new DecisionDetailPost(str, str2, caseType, list);
    }

    /* renamed from: a */
    public final List<OtherThingsToDoAttachment> mo11719a() {
        return this.f11370d;
    }

    /* renamed from: b */
    public final String mo11720b() {
        return this.f11367a;
    }

    /* renamed from: c */
    public final CaseType mo11721c() {
        return this.f11369c;
    }

    /* renamed from: d */
    public final String mo11722d() {
        return this.f11368b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f11370d, (java.lang.Object) r3.f11370d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost r3 = (p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost) r3
            java.lang.String r0 = r2.f11367a
            java.lang.String r1 = r3.f11367a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f11368b
            java.lang.String r1 = r3.f11368b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            hu.ekreta.ellenorzo.cases.subModels.CaseType r0 = r2.f11369c
            hu.ekreta.ellenorzo.cases.subModels.CaseType r1 = r3.f11369c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment> r0 = r2.f11370d
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment> r3 = r3.f11370d
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f11367a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11368b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        CaseType caseType = this.f11369c;
        int hashCode3 = (hashCode2 + (caseType != null ? caseType.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachment> list = this.f11370d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("DecisionDetailPost(id=");
        a.append(this.f11367a);
        a.append(", typeCode=");
        a.append(this.f11368b);
        a.append(", type=");
        a.append(this.f11369c);
        a.append(", attachments=");
        return C0082a.m108a(a, (List) this.f11370d, ")");
    }
}
