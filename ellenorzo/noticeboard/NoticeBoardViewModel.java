package p289hu.ekreta.ellenorzo.noticeboard;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "ListItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel */
/* compiled from: NoticeBoardViewModel.kt */
public interface NoticeBoardViewModel extends DataBindingListViewModel<ListItem> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel$DefaultImpls */
    /* compiled from: NoticeBoardViewModel.kt */
    public static final class DefaultImpls {
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "", "()V", "NoticeBoardItem", "SectionHeader", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$NoticeBoardItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel$ListItem */
    /* compiled from: NoticeBoardViewModel.kt */
    public static abstract class ListItem {

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$NoticeBoardItem;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "item", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "(Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "getItem", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel$ListItem$NoticeBoardItem */
        /* compiled from: NoticeBoardViewModel.kt */
        public static final class NoticeBoardItem extends ListItem {

            /* renamed from: a */
            public final NoticeBoardItem f14173a;

            public NoticeBoardItem(NoticeBoardItem noticeBoardItem) {
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "item");
                super(null);
                this.f14173a = noticeBoardItem;
            }

            public static /* synthetic */ NoticeBoardItem copy$default(NoticeBoardItem noticeBoardItem, NoticeBoardItem noticeBoardItem2, int i, Object obj) {
                if ((i & 1) != 0) {
                    noticeBoardItem2 = noticeBoardItem.f14173a;
                }
                return noticeBoardItem.mo13716a(noticeBoardItem2);
            }

            /* renamed from: a */
            public final NoticeBoardItem mo13715a() {
                return this.f14173a;
            }

            /* renamed from: a */
            public final NoticeBoardItem mo13716a(NoticeBoardItem noticeBoardItem) {
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "item");
                return new NoticeBoardItem(noticeBoardItem);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14173a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.NoticeBoardItem) r2).f14173a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.NoticeBoardItem
                    if (r0 == 0) goto L_0x0013
                    hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel$ListItem$NoticeBoardItem r2 = (p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.NoticeBoardItem) r2
                    hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem r0 = r1.f14173a
                    hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem r2 = r2.f14173a
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
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.NoticeBoardItem.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                NoticeBoardItem noticeBoardItem = this.f14173a;
                if (noticeBoardItem != null) {
                    return noticeBoardItem.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("NoticeBoardItem(item=");
                a.append(this.f14173a);
                a.append(")");
                return a.toString();
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel$ListItem$SectionHeader */
        /* compiled from: NoticeBoardViewModel.kt */
        public static final class SectionHeader extends ListItem {

            /* renamed from: a */
            public final String f14174a;

            public SectionHeader(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                super(null);
                this.f14174a = str;
            }

            public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sectionHeader.f14174a;
                }
                return sectionHeader.mo13720a(str);
            }

            /* renamed from: a */
            public final SectionHeader mo13720a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                return new SectionHeader(str);
            }

            /* renamed from: a */
            public final String mo13721a() {
                return this.f14174a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14174a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.SectionHeader) r2).f14174a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.SectionHeader
                    if (r0 == 0) goto L_0x0013
                    hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel$ListItem$SectionHeader r2 = (p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.SectionHeader) r2
                    java.lang.String r0 = r1.f14174a
                    java.lang.String r2 = r2.f14174a
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
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.SectionHeader.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f14174a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return C0082a.m106a(C0082a.m111a("SectionHeader(title="), this.f14174a, ")");
            }
        }

        public ListItem() {
        }

        public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
