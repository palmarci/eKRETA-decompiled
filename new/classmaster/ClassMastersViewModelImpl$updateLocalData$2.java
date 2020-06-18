package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.group.Group;
import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "activeGroups", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: ClassMastersViewModelImpl.kt */
public final class ClassMastersViewModelImpl$updateLocalData$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ ClassMastersViewModelImpl c;
    public final /* synthetic */ Profile e;

    public ClassMastersViewModelImpl$updateLocalData$2(ClassMastersViewModelImpl classMastersViewModelImpl, Profile profile) {
        this.c = classMastersViewModelImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<ClassMaster>> apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "activeGroups");
        if (!list.isEmpty()) {
            return this.c.u.a(this.e, list);
        }
        n<List<ClassMaster>> d2 = n.d(CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkExpressionValueIsNotNull(d2, "Observable.just(emptyList())");
        return d2;
    }
}
