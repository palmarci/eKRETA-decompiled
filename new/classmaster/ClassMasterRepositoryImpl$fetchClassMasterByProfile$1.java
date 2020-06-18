package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.group.Group;
import hu.ekreta.ellenorzo.profile.Profile;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "kotlin.jvm.PlatformType", "groups", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImpl$fetchClassMasterByProfile$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ ClassMasterRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public ClassMasterRepositoryImpl$fetchClassMasterByProfile$1(ClassMasterRepositoryImpl classMasterRepositoryImpl, Profile profile) {
        this.c = classMasterRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<ClassMaster>> apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "groups");
        ClassMasterRepositoryImpl classMasterRepositoryImpl = this.c;
        Profile profile = this.e;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((Group) next).m()) {
                arrayList.add(next);
            }
        }
        return classMasterRepositoryImpl.a(profile, CollectionsKt__CollectionsJVMKt.listOf(CollectionsKt___CollectionsKt.first(CollectionsKt___CollectionsKt.sortedWith(arrayList, new ClassMasterRepositoryImpl$fetchClassMasterByProfile$1$$special$$inlined$sortedBy$1())))).d(1);
    }
}
