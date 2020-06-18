package hu.ekreta.ellenorzo.noticeboard;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "ListItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardViewModel.kt */
public interface NoticeBoardViewModel extends DataBindingListViewModel<ListItem> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: NoticeBoardViewModel.kt */
    public static final class DefaultImpls {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "", "()V", "NoticeBoardItem", "SectionHeader", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$NoticeBoardItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NoticeBoardViewModel.kt */
    public static abstract class ListItem {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$NoticeBoardItem;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "item", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "(Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "getItem", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: NoticeBoardViewModel.kt */
        public static final class NoticeBoardItem extends ListItem {

            /* renamed from: a  reason: collision with root package name */
            public final NoticeBoardItem f5896a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public NoticeBoardItem(NoticeBoardItem noticeBoardItem) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "item");
                this.f5896a = noticeBoardItem;
            }

            public static /* synthetic */ NoticeBoardItem copy$default(NoticeBoardItem noticeBoardItem, NoticeBoardItem noticeBoardItem2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    noticeBoardItem2 = noticeBoardItem.f5896a;
                }
                return noticeBoardItem.a(noticeBoardItem2);
            }

            public final NoticeBoardItem a() {
                return this.f5896a;
            }

            public final NoticeBoardItem a(NoticeBoardItem noticeBoardItem) {
                Intrinsics.checkParameterIsNotNull(noticeBoardItem, "item");
                return new NoticeBoardItem(noticeBoardItem);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof NoticeBoardItem) && Intrinsics.areEqual((Object) this.f5896a, (Object) ((NoticeBoardItem) obj).f5896a);
                }
                return true;
            }

            public int hashCode() {
                NoticeBoardItem noticeBoardItem = this.f5896a;
                if (noticeBoardItem != null) {
                    return noticeBoardItem.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a2 = a.a("NoticeBoardItem(item=");
                a2.append(this.f5896a);
                a2.append(")");
                return a2.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: NoticeBoardViewModel.kt */
        public static final class SectionHeader extends ListItem {

            /* renamed from: a  reason: collision with root package name */
            public final String f5897a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SectionHeader(String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(str, "title");
                this.f5897a = str;
            }

            public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = sectionHeader.f5897a;
                }
                return sectionHeader.a(str);
            }

            public final SectionHeader a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                return new SectionHeader(str);
            }

            public final String a() {
                return this.f5897a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof SectionHeader) && Intrinsics.areEqual((Object) this.f5897a, (Object) ((SectionHeader) obj).f5897a);
                }
                return true;
            }

            public int hashCode() {
                String str = this.f5897a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return a.a(a.a("SectionHeader(title="), this.f5897a, ")");
            }
        }

        public ListItem() {
        }

        public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
