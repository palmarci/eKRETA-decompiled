package p289hu.ekreta.ellenorzo.subject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4669b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "result", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "new", "", "accept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$fetchSubjects$4 */
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$fetchSubjects$4<T1, T2> implements C4669b<U, T> {
    public static final SubjectsRepositoryImpl$fetchSubjects$4 INSTANCE = new SubjectsRepositoryImpl$fetchSubjects$4();

    /* renamed from: a */
    public final void accept(List<Subject> list, List<Subject> list2) {
        Intrinsics.checkExpressionValueIsNotNull(list2, "new");
        list.addAll(list2);
    }
}
