package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.List;
import k.b.n;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"H\u0016R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl;", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "subjectDao", "Lhu/ekreta/ellenorzo/subject/SubjectDao;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/subject/SubjectDao;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "adapter", "hu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl$adapter$1;", "getGroupRepository", "()Lhu/ekreta/ellenorzo/group/GroupRepository;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "getProfileRepository", "()Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "getSubjectDao", "()Lhu/ekreta/ellenorzo/subject/SubjectDao;", "fetchClassAverages", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "educationTypeUid", "", "fetchSubjectAverages", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto;", "fetchSubjects", "Lhu/ekreta/ellenorzo/subject/Subject;", "getSubjects", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl implements SubjectsRepository {

    /* renamed from: a  reason: collision with root package name */
    public final SubjectsRepositoryImpl$adapter$1 f6149a = new SubjectsRepositoryImpl$adapter$1(this);
    public final MobileApiV3 b;
    public final SubjectDao c;

    /* renamed from: d  reason: collision with root package name */
    public final GroupRepository f6150d;

    static {
        new KProperty[1][0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SubjectsRepositoryImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"));
    }

    public SubjectsRepositoryImpl(MobileApiV3 mobileApiV3, SubjectDao subjectDao, ProfileRepository profileRepository, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(subjectDao, "subjectDao");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.b = mobileApiV3;
        this.c = subjectDao;
        this.f6150d = groupRepository;
        LazyKt__LazyJVMKt.lazy(new SubjectsRepositoryImpl$logger$2(this));
    }

    public final SubjectDao a() {
        return this.c;
    }

    public n<List<Subject>> n(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f6149a.a(profile);
    }

    public n<List<Subject>> r(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> d2 = this.f6150d.g(profile.m()).d(1).e(SubjectsRepositoryImpl$fetchSubjects$1.INSTANCE).a(SubjectsRepositoryImpl$fetchSubjects$2.INSTANCE).c(new SubjectsRepositoryImpl$fetchSubjects$3(this, profile)).a(new ArrayList(), SubjectsRepositoryImpl$fetchSubjects$4.INSTANCE).d(new SubjectsRepositoryImpl$fetchSubjects$5(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(d2, "groupRepository.getGroup…tOfSubject)\n            }");
        return d2;
    }
}
