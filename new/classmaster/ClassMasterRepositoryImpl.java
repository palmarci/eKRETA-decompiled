package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.group.Group;
import hu.ekreta.ellenorzo.group.GroupDao;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepositoryImpl;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "classMasterDao", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;", "groupDao", "Lhu/ekreta/ellenorzo/group/GroupDao;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "(Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;Lhu/ekreta/ellenorzo/group/GroupDao;Lhu/ekreta/ellenorzo/rest/MobileApiV3;)V", "createClassMasterList", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "classMasterDtoList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "groupList", "Lhu/ekreta/ellenorzo/group/Group;", "profileId", "", "createClassMastersForOneDto", "classMasterDto", "fetchClassMasterByProfile", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchClassMastersByProfile", "getClassMastersByProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImpl implements ClassMasterRepository {

    /* renamed from: a  reason: collision with root package name */
    public final ClassMasterDao f5276a;
    public final GroupDao b;
    public final MobileApiV3 c;

    public ClassMasterRepositoryImpl(ClassMasterDao classMasterDao, GroupDao groupDao, MobileApiV3 mobileApiV3) {
        Intrinsics.checkParameterIsNotNull(classMasterDao, "classMasterDao");
        Intrinsics.checkParameterIsNotNull(groupDao, "groupDao");
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        this.f5276a = classMasterDao;
        this.b = groupDao;
        this.c = mobileApiV3;
    }

    public n<List<ClassMaster>> a(Profile profile, List<Group> list) {
        Profile profile2 = profile;
        List<Group> list2 = list;
        Intrinsics.checkParameterIsNotNull(profile2, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(list2, "groupList");
        MobileApiV3 mobileApiV3 = this.c;
        String str = profile.p() + "/ellenorzo/V3/Felhasznalok/Alkalmazottak/Tanarok/Osztalyfonokok";
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.d());
        Intrinsics.checkParameterIsNotNull(list2, "$this$classMasterUids");
        ArrayList arrayList = new ArrayList();
        for (Group group : list) {
            String f = group.f();
            if (f != null) {
                arrayList.add(f);
            }
            String c2 = group.c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        n<R> c3 = mobileApiV3.getClassMaster(str, asAuthorizationHeader, CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.distinct(arrayList), ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)).g(new ClassMasterRepositoryImpl$fetchClassMastersByProfile$1(this, list2, profile2)).c(new ClassMasterRepositoryImpl$fetchClassMastersByProfile$2(this, profile2));
        Intrinsics.checkExpressionValueIsNotNull(c3, "mobileApiV3\n            …MasterList)\n            }");
        return c3;
    }

    public n<ClassMaster> l(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n c2 = this.b.a(profile.m()).c(new ClassMasterRepositoryImpl$fetchClassMasterByProfile$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "groupDao.getElementsForP…   .take(1)\n            }");
        n<ClassMaster> a2 = ExtensionsKt.a(c2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "groupDao.getElementsForP…          .firstOrEmpty()");
        return a2;
    }

    public n<List<ClassMaster>> q(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5276a.a(profile.m());
    }

    public final List<ClassMaster> a(List<ClassMasterDto> list, List<Group> list2, String str) {
        ArrayList arrayList = new ArrayList();
        for (ClassMasterDto classMasterDto : list) {
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (Group next : list2) {
                if (Intrinsics.areEqual((Object) next.f(), (Object) classMasterDto.getUid())) {
                    arrayList2.add(ClassMasterRepositoryImplKt.access$toClassMaster(classMasterDto, str, next));
                } else if (Intrinsics.areEqual((Object) next.c(), (Object) classMasterDto.getUid())) {
                    arrayList2.add(ClassMasterRepositoryImplKt.access$toClassMaster(classMasterDto, str, next));
                }
                z = true;
            }
            if (!z) {
                arrayList2.add(ClassMasterRepositoryImplKt.access$toClassMaster(classMasterDto, str, (Group) null));
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }
}
