package hu.ekreta.ellenorzo.subject.averages;

import a.b.a.a.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "", "()V", "viewType", "", "getViewType", "()I", "Average", "SectionHeader", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$Average;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AveragesListItem.kt */
public abstract class AveragesListItem {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0018HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$Average;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "title", "", "average", "classAverage", "isClassAverageAvailable", "", "sortedListOfAverages", "", "", "groupUid", "educationTypeName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "getClassAverage", "getEducationTypeName", "getGroupUid", "()Z", "getSortedListOfAverages", "()Ljava/util/List;", "getTitle", "viewType", "", "getViewType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AveragesListItem.kt */
    public static final class Average extends AveragesListItem {

        /* renamed from: a  reason: collision with root package name */
        public final int f6163a = 1;
        public final String b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final String f6164d;
        public final boolean e;
        public final List<Float> f;

        /* renamed from: g  reason: collision with root package name */
        public final String f6165g;

        /* renamed from: h  reason: collision with root package name */
        public final String f6166h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Average(String str, String str2, String str3, boolean z, List<Float> list, String str4, String str5) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "average");
            Intrinsics.checkParameterIsNotNull(str3, "classAverage");
            Intrinsics.checkParameterIsNotNull(list, "sortedListOfAverages");
            Intrinsics.checkParameterIsNotNull(str4, "groupUid");
            Intrinsics.checkParameterIsNotNull(str5, "educationTypeName");
            this.b = str;
            this.c = str2;
            this.f6164d = str3;
            this.e = z;
            this.f = list;
            this.f6165g = str4;
            this.f6166h = str5;
        }

        public static /* synthetic */ Average copy$default(Average average, String str, String str2, String str3, boolean z, List<Float> list, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = average.b;
            }
            if ((i2 & 2) != 0) {
                str2 = average.c;
            }
            String str6 = str2;
            if ((i2 & 4) != 0) {
                str3 = average.f6164d;
            }
            String str7 = str3;
            if ((i2 & 8) != 0) {
                z = average.e;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                list = average.f;
            }
            List<Float> list2 = list;
            if ((i2 & 32) != 0) {
                str4 = average.f6165g;
            }
            String str8 = str4;
            if ((i2 & 64) != 0) {
                str5 = average.f6166h;
            }
            return average.a(str, str6, str7, z2, list2, str8, str5);
        }

        public int a() {
            return this.f6163a;
        }

        public final Average a(String str, String str2, String str3, boolean z, List<Float> list, String str4, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "average");
            Intrinsics.checkParameterIsNotNull(str3, "classAverage");
            Intrinsics.checkParameterIsNotNull(list, "sortedListOfAverages");
            Intrinsics.checkParameterIsNotNull(str4, "groupUid");
            String str6 = str5;
            Intrinsics.checkParameterIsNotNull(str6, "educationTypeName");
            return new Average(str, str2, str3, z, list, str4, str6);
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.f6164d;
        }

        public final String d() {
            return this.f6166h;
        }

        public final String e() {
            return this.f6165g;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Average) {
                    Average average = (Average) obj;
                    if (Intrinsics.areEqual((Object) this.b, (Object) average.b) && Intrinsics.areEqual((Object) this.c, (Object) average.c) && Intrinsics.areEqual((Object) this.f6164d, (Object) average.f6164d)) {
                        if (!(this.e == average.e) || !Intrinsics.areEqual((Object) this.f, (Object) average.f) || !Intrinsics.areEqual((Object) this.f6165g, (Object) average.f6165g) || !Intrinsics.areEqual((Object) this.f6166h, (Object) average.f6166h)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final List<Float> f() {
            return this.f;
        }

        public final String g() {
            return this.b;
        }

        public final boolean h() {
            return this.e;
        }

        public int hashCode() {
            String str = this.b;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f6164d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
            List<Float> list = this.f;
            int hashCode4 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
            String str4 = this.f6165g;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f6166h;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return hashCode5 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("Average(title=");
            a2.append(this.b);
            a2.append(", average=");
            a2.append(this.c);
            a2.append(", classAverage=");
            a2.append(this.f6164d);
            a2.append(", isClassAverageAvailable=");
            a2.append(this.e);
            a2.append(", sortedListOfAverages=");
            a2.append(this.f);
            a2.append(", groupUid=");
            a2.append(this.f6165g);
            a2.append(", educationTypeName=");
            return a.a(a2, this.f6166h, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "viewType", "", "getViewType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AveragesListItem.kt */
    public static final class SectionHeader extends AveragesListItem {

        /* renamed from: a  reason: collision with root package name */
        public final int f6167a;
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
            return this.f6167a;
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

    public AveragesListItem() {
    }

    public abstract int a();

    public /* synthetic */ AveragesListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
