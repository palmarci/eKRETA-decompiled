package hu.ekreta.ellenorzo.subject.certificate;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "", "()V", "viewType", "", "getViewType", "()I", "CertificationItem", "SectionHeader", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$CertificationItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CertificationListItem.kt */
public abstract class CertificationListItem {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$CertificationItem;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "evaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "(Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "getEvaluation", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: CertificationListItem.kt */
    public static final class CertificationItem extends CertificationListItem {

        /* renamed from: a  reason: collision with root package name */
        public final int f6170a = 1;
        public final Evaluation b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CertificationItem(Evaluation evaluation) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
            this.b = evaluation;
        }

        public static /* synthetic */ CertificationItem copy$default(CertificationItem certificationItem, Evaluation evaluation, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                evaluation = certificationItem.b;
            }
            return certificationItem.a(evaluation);
        }

        public int a() {
            return this.f6170a;
        }

        public final CertificationItem a(Evaluation evaluation) {
            Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
            return new CertificationItem(evaluation);
        }

        public final Evaluation b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof CertificationItem) && Intrinsics.areEqual((Object) this.b, (Object) ((CertificationItem) obj).b);
            }
            return true;
        }

        public int hashCode() {
            Evaluation evaluation = this.b;
            if (evaluation != null) {
                return evaluation.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a2 = a.a("CertificationItem(evaluation=");
            a2.append(this.b);
            a2.append(")");
            return a2.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: CertificationListItem.kt */
    public static final class SectionHeader extends CertificationListItem {

        /* renamed from: a  reason: collision with root package name */
        public final int f6171a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SectionHeader(String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkParameterIsNotNull(str, "title");
            this.b = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sectionHeader.b;
            }
            return sectionHeader.a(str);
        }

        public int a() {
            return this.f6171a;
        }

        public final SectionHeader a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            return new SectionHeader(str);
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SectionHeader) && Intrinsics.areEqual((Object) this.b, (Object) ((SectionHeader) obj).b);
            }
            return true;
        }

        public int hashCode() {
            String str = this.b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.a(a.a("SectionHeader(title="), this.b, ")");
        }
    }

    public CertificationListItem() {
    }

    public abstract int a();

    public /* synthetic */ CertificationListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
