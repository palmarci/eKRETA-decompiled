package hu.ekreta.ellenorzo.cases.decision;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailPost;", "", "id", "", "typeCode", "type", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "attachments", "", "Lhu/ekreta/ellenorzo/cases/subModels/OtherThingsToDoAttachment;", "(Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/CaseType;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getType", "()Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "getTypeCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionDetailPost.kt */
public final class DecisionDetailPost {

    /* renamed from: a  reason: collision with root package name */
    public final String f5116a;
    public final String b;
    public final CaseType c;

    /* renamed from: d  reason: collision with root package name */
    public final List<OtherThingsToDoAttachment> f5117d;

    public DecisionDetailPost(String str, String str2, CaseType caseType, List<OtherThingsToDoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "typeCode");
        Intrinsics.checkParameterIsNotNull(caseType, "type");
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        this.f5116a = str;
        this.b = str2;
        this.c = caseType;
        this.f5117d = list;
    }

    public static /* synthetic */ DecisionDetailPost copy$default(DecisionDetailPost decisionDetailPost, String str, String str2, CaseType caseType, List<OtherThingsToDoAttachment> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = decisionDetailPost.f5116a;
        }
        if ((i2 & 2) != 0) {
            str2 = decisionDetailPost.b;
        }
        if ((i2 & 4) != 0) {
            caseType = decisionDetailPost.c;
        }
        if ((i2 & 8) != 0) {
            list = decisionDetailPost.f5117d;
        }
        return decisionDetailPost.a(str, str2, caseType, list);
    }

    public final DecisionDetailPost a(String str, String str2, CaseType caseType, List<OtherThingsToDoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "typeCode");
        Intrinsics.checkParameterIsNotNull(caseType, "type");
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        return new DecisionDetailPost(str, str2, caseType, list);
    }

    public final List<OtherThingsToDoAttachment> a() {
        return this.f5117d;
    }

    public final String b() {
        return this.f5116a;
    }

    public final CaseType c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionDetailPost)) {
            return false;
        }
        DecisionDetailPost decisionDetailPost = (DecisionDetailPost) obj;
        return Intrinsics.areEqual((Object) this.f5116a, (Object) decisionDetailPost.f5116a) && Intrinsics.areEqual((Object) this.b, (Object) decisionDetailPost.b) && Intrinsics.areEqual((Object) this.c, (Object) decisionDetailPost.c) && Intrinsics.areEqual((Object) this.f5117d, (Object) decisionDetailPost.f5117d);
    }

    public int hashCode() {
        String str = this.f5116a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        CaseType caseType = this.c;
        int hashCode3 = (hashCode2 + (caseType != null ? caseType.hashCode() : 0)) * 31;
        List<OtherThingsToDoAttachment> list = this.f5117d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("DecisionDetailPost(id=");
        a2.append(this.f5116a);
        a2.append(", typeCode=");
        a2.append(this.b);
        a2.append(", type=");
        a2.append(this.c);
        a2.append(", attachments=");
        return a.a(a2, (List) this.f5117d, ")");
    }
}
