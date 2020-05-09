package p289hu.ekreta.ellenorzo.classmaster;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "kotlin.jvm.PlatformType", "groups", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImpl$fetchClassMasterByProfile$1 */
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImpl$fetchClassMasterByProfile$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ ClassMasterRepositoryImpl f11817c;

    /* renamed from: e */
    public final /* synthetic */ Profile f11818e;

    public ClassMasterRepositoryImpl$fetchClassMasterByProfile$1(ClassMasterRepositoryImpl classMasterRepositoryImpl, Profile profile) {
        this.f11817c = classMasterRepositoryImpl;
        this.f11818e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<ClassMaster>> apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "groups");
        ClassMasterRepositoryImpl classMasterRepositoryImpl = this.f11817c;
        Profile profile = this.f11818e;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Group) next).mo12764m()) {
                arrayList.add(next);
            }
        }
        return classMasterRepositoryImpl.mo12257a(profile, CollectionsKt__CollectionsJVMKt.listOf(CollectionsKt___CollectionsKt.first(CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4097x7ec958b4())))).mo17237d(1);
    }
}
