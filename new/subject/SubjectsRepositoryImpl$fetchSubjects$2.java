package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.group.Group;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$fetchSubjects$2<T, R> implements h<T, K> {
    public static final SubjectsRepositoryImpl$fetchSubjects$2 INSTANCE = new SubjectsRepositoryImpl$fetchSubjects$2();

    /* renamed from: a */
    public final String apply(Group group) {
        Intrinsics.checkParameterIsNotNull(group, "it");
        return group.i();
    }
}
