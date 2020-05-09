package p289hu.ekreta.ellenorzo.classmaster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.group.GroupDao;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepositoryImpl;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "classMasterDao", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;", "groupDao", "Lhu/ekreta/ellenorzo/group/GroupDao;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "(Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;Lhu/ekreta/ellenorzo/group/GroupDao;Lhu/ekreta/ellenorzo/rest/MobileApiV3;)V", "createClassMasterList", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "classMasterDtoList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "groupList", "Lhu/ekreta/ellenorzo/group/Group;", "profileId", "", "createClassMastersForOneDto", "classMasterDto", "fetchClassMasterByProfile", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchClassMastersByProfile", "getClassMastersByProfile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImpl */
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImpl implements ClassMasterRepository {

    /* renamed from: a */
    public final ClassMasterDao f11814a;

    /* renamed from: b */
    public final GroupDao f11815b;

    /* renamed from: c */
    public final MobileApiV3 f11816c;

    public ClassMasterRepositoryImpl(ClassMasterDao classMasterDao, GroupDao groupDao, MobileApiV3 mobileApiV3) {
        Intrinsics.checkParameterIsNotNull(classMasterDao, "classMasterDao");
        Intrinsics.checkParameterIsNotNull(groupDao, "groupDao");
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        this.f11814a = classMasterDao;
        this.f11815b = groupDao;
        this.f11816c = mobileApiV3;
    }

    /* renamed from: a */
    public C5027n<List<ClassMaster>> mo12257a(Profile profile, List<Group> list) {
        Profile profile2 = profile;
        List<Group> list2 = list;
        Intrinsics.checkParameterIsNotNull(profile2, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(list2, "groupList");
        MobileApiV3 mobileApiV3 = this.f11816c;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Felhasznalok/Alkalmazottak/Tanarok/Osztalyfonokok");
        String sb2 = sb.toString();
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d());
        Intrinsics.checkParameterIsNotNull(list2, "$this$classMasterUids");
        ArrayList arrayList = new ArrayList();
        for (Group group : list) {
            String f = group.mo12756f();
            if (f != null) {
                arrayList.add(f);
            }
            String c = group.mo12753c();
            if (c != null) {
                arrayList.add(c);
            }
        }
        C5027n<List<ClassMaster>> c2 = mobileApiV3.getClassMaster(sb2, asAuthorizationHeader, CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.distinct(arrayList), ";", null, null, 0, null, null, 62, null)).mo17246g(new ClassMasterRepositoryImpl$fetchClassMastersByProfile$1(this, list2, profile2)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new ClassMasterRepositoryImpl$fetchClassMastersByProfile$2<Object,Object>(this, profile2));
        Intrinsics.checkExpressionValueIsNotNull(c2, "mobileApiV3\n            …MasterList)\n            }");
        return c2;
    }

    /* renamed from: l */
    public C5027n<ClassMaster> mo12258l(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n c = this.f11815b.mo16312a(profile.mo14054m()).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new ClassMasterRepositoryImpl$fetchClassMasterByProfile$1<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "groupDao.getElementsForP…   .take(1)\n            }");
        C5027n<ClassMaster> a = ExtensionsKt.m14632a(c);
        Intrinsics.checkExpressionValueIsNotNull(a, "groupDao.getElementsForP…          .firstOrEmpty()");
        return a;
    }

    /* renamed from: q */
    public C5027n<List<ClassMaster>> mo12259q(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f11814a.mo16312a(profile.mo14054m());
    }

    /* renamed from: a */
    public final List<ClassMaster> mo12260a(List<ClassMasterDto> list, List<Group> list2, String str) {
        ArrayList arrayList = new ArrayList();
        for (ClassMasterDto classMasterDto : list) {
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (Group group : list2) {
                if (Intrinsics.areEqual((Object) group.mo12756f(), (Object) classMasterDto.getUid())) {
                    arrayList2.add(ClassMasterRepositoryImplKt.access$toClassMaster(classMasterDto, str, group));
                } else if (Intrinsics.areEqual((Object) group.mo12753c(), (Object) classMasterDto.getUid())) {
                    arrayList2.add(ClassMasterRepositoryImplKt.access$toClassMaster(classMasterDto, str, group));
                }
                z = true;
            }
            if (!z) {
                arrayList2.add(ClassMasterRepositoryImplKt.access$toClassMaster(classMasterDto, str, null));
            }
            CollectionsKt__MutableCollectionsKt.addAll((Collection<? super T>) arrayList, (Iterable<? extends T>) arrayList2);
        }
        return arrayList;
    }
}
