package p289hu.ekreta.ellenorzo.subject.certificate;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "", "()V", "viewType", "", "getViewType", "()I", "CertificationItem", "SectionHeader", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$CertificationItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificationListItem */
/* compiled from: CertificationListItem.kt */
public abstract class CertificationListItem {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$CertificationItem;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "evaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "(Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "getEvaluation", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificationListItem$CertificationItem */
    /* compiled from: CertificationListItem.kt */
    public static final class CertificationItem extends CertificationListItem {

        /* renamed from: a */
        public final int f14944a = 1;

        /* renamed from: b */
        public final Evaluation f14945b;

        public CertificationItem(Evaluation evaluation) {
            Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
            super(null);
            this.f14945b = evaluation;
        }

        public static /* synthetic */ CertificationItem copy$default(CertificationItem certificationItem, Evaluation evaluation, int i, Object obj) {
            if ((i & 1) != 0) {
                evaluation = certificationItem.f14945b;
            }
            return certificationItem.mo15821a(evaluation);
        }

        /* renamed from: a */
        public int mo15820a() {
            return this.f14944a;
        }

        /* renamed from: a */
        public final CertificationItem mo15821a(Evaluation evaluation) {
            Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
            return new CertificationItem(evaluation);
        }

        /* renamed from: b */
        public final Evaluation mo15822b() {
            return this.f14945b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14945b, (java.lang.Object) ((p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem) r2).f14945b) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.subject.certificate.CertificationListItem$CertificationItem r2 = (p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem) r2
                hu.ekreta.ellenorzo.evaluation.Evaluation r0 = r1.f14945b
                hu.ekreta.ellenorzo.evaluation.Evaluation r2 = r2.f14945b
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Evaluation evaluation = this.f14945b;
            if (evaluation != null) {
                return evaluation.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("CertificationItem(evaluation=");
            a.append(this.f14945b);
            a.append(")");
            return a.toString();
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificationListItem$SectionHeader */
    /* compiled from: CertificationListItem.kt */
    public static final class SectionHeader extends CertificationListItem {

        /* renamed from: a */
        public final int f14946a;

        /* renamed from: b */
        public final String f14947b;

        public SectionHeader(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            super(null);
            this.f14947b = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionHeader.f14947b;
            }
            return sectionHeader.mo15826a(str);
        }

        /* renamed from: a */
        public int mo15820a() {
            return this.f14946a;
        }

        /* renamed from: a */
        public final SectionHeader mo15826a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            return new SectionHeader(str);
        }

        /* renamed from: b */
        public final String mo15827b() {
            return this.f14947b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14947b, (java.lang.Object) ((p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.SectionHeader) r2).f14947b) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.SectionHeader
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.subject.certificate.CertificationListItem$SectionHeader r2 = (p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.SectionHeader) r2
                java.lang.String r0 = r1.f14947b
                java.lang.String r2 = r2.f14947b
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.SectionHeader.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f14947b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("SectionHeader(title="), this.f14947b, ")");
        }
    }

    public CertificationListItem() {
    }

    /* renamed from: a */
    public abstract int mo15820a();

    public /* synthetic */ CertificationListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
