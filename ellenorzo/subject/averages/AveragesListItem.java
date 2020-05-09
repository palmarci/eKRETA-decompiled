package p289hu.ekreta.ellenorzo.subject.averages;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "", "()V", "viewType", "", "getViewType", "()I", "Average", "SectionHeader", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$Average;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesListItem */
/* compiled from: AveragesListItem.kt */
public abstract class AveragesListItem {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0018HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$Average;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "title", "", "average", "classAverage", "isClassAverageAvailable", "", "sortedListOfAverages", "", "", "groupUid", "educationTypeName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "getClassAverage", "getEducationTypeName", "getGroupUid", "()Z", "getSortedListOfAverages", "()Ljava/util/List;", "getTitle", "viewType", "", "getViewType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesListItem$Average */
    /* compiled from: AveragesListItem.kt */
    public static final class Average extends AveragesListItem {

        /* renamed from: a */
        public final int f14914a = 1;

        /* renamed from: b */
        public final String f14915b;

        /* renamed from: c */
        public final String f14916c;

        /* renamed from: d */
        public final String f14917d;

        /* renamed from: e */
        public final boolean f14918e;

        /* renamed from: f */
        public final List<Float> f14919f;

        /* renamed from: g */
        public final String f14920g;

        /* renamed from: h */
        public final String f14921h;

        public Average(String str, String str2, String str3, boolean z, List<Float> list, String str4, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "average");
            Intrinsics.checkParameterIsNotNull(str3, "classAverage");
            Intrinsics.checkParameterIsNotNull(list, "sortedListOfAverages");
            Intrinsics.checkParameterIsNotNull(str4, "groupUid");
            Intrinsics.checkParameterIsNotNull(str5, "educationTypeName");
            super(null);
            this.f14915b = str;
            this.f14916c = str2;
            this.f14917d = str3;
            this.f14918e = z;
            this.f14919f = list;
            this.f14920g = str4;
            this.f14921h = str5;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Float>, for r10v0, types: [java.util.List] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.Average copy$default(p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.Average r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.util.List<java.lang.Float> r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.Object r14) {
            /*
                r14 = r13 & 1
                if (r14 == 0) goto L_0x0006
                java.lang.String r6 = r5.f14915b
            L_0x0006:
                r14 = r13 & 2
                if (r14 == 0) goto L_0x000c
                java.lang.String r7 = r5.f14916c
            L_0x000c:
                r14 = r7
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0013
                java.lang.String r8 = r5.f14917d
            L_0x0013:
                r0 = r8
                r7 = r13 & 8
                if (r7 == 0) goto L_0x001a
                boolean r9 = r5.f14918e
            L_0x001a:
                r1 = r9
                r7 = r13 & 16
                if (r7 == 0) goto L_0x0021
                java.util.List<java.lang.Float> r10 = r5.f14919f
            L_0x0021:
                r2 = r10
                r7 = r13 & 32
                if (r7 == 0) goto L_0x0028
                java.lang.String r11 = r5.f14920g
            L_0x0028:
                r3 = r11
                r7 = r13 & 64
                if (r7 == 0) goto L_0x002f
                java.lang.String r12 = r5.f14921h
            L_0x002f:
                r4 = r12
                r7 = r5
                r8 = r6
                r9 = r14
                r10 = r0
                r11 = r1
                r12 = r2
                r13 = r3
                r14 = r4
                hu.ekreta.ellenorzo.subject.averages.AveragesListItem$Average r5 = r7.mo15783a(r8, r9, r10, r11, r12, r13, r14)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.Average.copy$default(hu.ekreta.ellenorzo.subject.averages.AveragesListItem$Average, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, int, java.lang.Object):hu.ekreta.ellenorzo.subject.averages.AveragesListItem$Average");
        }

        /* renamed from: a */
        public int mo15782a() {
            return this.f14914a;
        }

        /* renamed from: a */
        public final Average mo15783a(String str, String str2, String str3, boolean z, List<Float> list, String str4, String str5) {
            String str6 = str;
            Intrinsics.checkParameterIsNotNull(str, "title");
            String str7 = str2;
            Intrinsics.checkParameterIsNotNull(str2, "average");
            String str8 = str3;
            Intrinsics.checkParameterIsNotNull(str3, "classAverage");
            List<Float> list2 = list;
            Intrinsics.checkParameterIsNotNull(list, "sortedListOfAverages");
            String str9 = str4;
            Intrinsics.checkParameterIsNotNull(str4, "groupUid");
            String str10 = str5;
            Intrinsics.checkParameterIsNotNull(str10, "educationTypeName");
            Average average = new Average(str6, str7, str8, z, list2, str9, str10);
            return average;
        }

        /* renamed from: b */
        public final String mo15784b() {
            return this.f14916c;
        }

        /* renamed from: c */
        public final String mo15785c() {
            return this.f14917d;
        }

        /* renamed from: d */
        public final String mo15786d() {
            return this.f14921h;
        }

        /* renamed from: e */
        public final String mo15787e() {
            return this.f14920g;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Average) {
                    Average average = (Average) obj;
                    if (Intrinsics.areEqual((Object) this.f14915b, (Object) average.f14915b) && Intrinsics.areEqual((Object) this.f14916c, (Object) average.f14916c) && Intrinsics.areEqual((Object) this.f14917d, (Object) average.f14917d)) {
                        if (!(this.f14918e == average.f14918e) || !Intrinsics.areEqual((Object) this.f14919f, (Object) average.f14919f) || !Intrinsics.areEqual((Object) this.f14920g, (Object) average.f14920g) || !Intrinsics.areEqual((Object) this.f14921h, (Object) average.f14921h)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final List<Float> mo15789f() {
            return this.f14919f;
        }

        /* renamed from: g */
        public final String mo15790g() {
            return this.f14915b;
        }

        /* renamed from: h */
        public final boolean mo15791h() {
            return this.f14918e;
        }

        public int hashCode() {
            String str = this.f14915b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f14916c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f14917d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.f14918e;
            if (z) {
                z = true;
            }
            int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
            List<Float> list = this.f14919f;
            int hashCode4 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
            String str4 = this.f14920g;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f14921h;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Average(title=");
            a.append(this.f14915b);
            a.append(", average=");
            a.append(this.f14916c);
            a.append(", classAverage=");
            a.append(this.f14917d);
            a.append(", isClassAverageAvailable=");
            a.append(this.f14918e);
            a.append(", sortedListOfAverages=");
            a.append(this.f14919f);
            a.append(", groupUid=");
            a.append(this.f14920g);
            a.append(", educationTypeName=");
            return C0082a.m106a(a, this.f14921h, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesListItem$SectionHeader */
    /* compiled from: AveragesListItem.kt */
    public static final class SectionHeader extends AveragesListItem {

        /* renamed from: a */
        public final int f14922a;

        /* renamed from: b */
        public final String f14923b;

        public SectionHeader(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            super(null);
            this.f14923b = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionHeader.f14923b;
            }
            return sectionHeader.mo15794a(str);
        }

        /* renamed from: a */
        public int mo15782a() {
            return this.f14922a;
        }

        /* renamed from: a */
        public final SectionHeader mo15794a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            return new SectionHeader(str);
        }

        /* renamed from: b */
        public final String mo15795b() {
            return this.f14923b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14923b, (java.lang.Object) ((p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.SectionHeader) r2).f14923b) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.SectionHeader
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.subject.averages.AveragesListItem$SectionHeader r2 = (p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.SectionHeader) r2
                java.lang.String r0 = r1.f14923b
                java.lang.String r2 = r2.f14923b
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.averages.AveragesListItem.SectionHeader.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f14923b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("SectionHeader(title="), this.f14923b, ")");
        }
    }

    public AveragesListItem() {
    }

    /* renamed from: a */
    public abstract int mo15782a();

    public /* synthetic */ AveragesListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
