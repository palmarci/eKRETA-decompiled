package p289hu.ekreta.ellenorzo.subject;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4669b;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001f0\u001e2\u0006\u0010!\u001a\u00020\"H\u0016R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl;", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "subjectDao", "Lhu/ekreta/ellenorzo/subject/SubjectDao;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/subject/SubjectDao;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "adapter", "hu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl$adapter$1;", "getGroupRepository", "()Lhu/ekreta/ellenorzo/group/GroupRepository;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "getProfileRepository", "()Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "getSubjectDao", "()Lhu/ekreta/ellenorzo/subject/SubjectDao;", "fetchClassAverages", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassAverageDto;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "educationTypeUid", "", "fetchSubjectAverages", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SubjectAverageDto;", "fetchSubjects", "Lhu/ekreta/ellenorzo/subject/Subject;", "getSubjects", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl */
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl implements SubjectsRepository {

    /* renamed from: a */
    public final SubjectsRepositoryImpl$adapter$1 f14858a = new SubjectsRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f14859b;

    /* renamed from: c */
    public final SubjectDao f14860c;

    /* renamed from: d */
    public final GroupRepository f14861d;

    static {
        new KProperty[1][0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SubjectsRepositoryImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"));
    }

    public SubjectsRepositoryImpl(MobileApiV3 mobileApiV3, SubjectDao subjectDao, ProfileRepository profileRepository, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(subjectDao, "subjectDao");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.f14859b = mobileApiV3;
        this.f14860c = subjectDao;
        this.f14861d = groupRepository;
        LazyKt__LazyJVMKt.lazy(new SubjectsRepositoryImpl$logger$2(this));
    }

    public static final /* synthetic */ C5027n access$fetchClassAverages(SubjectsRepositoryImpl subjectsRepositoryImpl, Profile profile, String str) {
        MobileApiV3 mobileApiV3 = subjectsRepositoryImpl.f14859b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Ertekelesek/Atlagok/OsztalyAtlagok");
        return mobileApiV3.getClassAverage(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), str);
    }

    public static final /* synthetic */ C5027n access$fetchSubjectAverages(SubjectsRepositoryImpl subjectsRepositoryImpl, Profile profile, String str) {
        MobileApiV3 mobileApiV3 = subjectsRepositoryImpl.f14859b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Ertekelesek/Atlagok/TantargyiAtlagok");
        return mobileApiV3.getSubjectAverage(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), str);
    }

    /* renamed from: a */
    public final SubjectDao mo15744a() {
        return this.f14860c;
    }

    /* renamed from: n */
    public C5027n<List<Subject>> mo15742n(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14858a.mo15745a(profile);
    }

    /* renamed from: r */
    public C5027n<List<Subject>> mo15743r(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Subject>> d = this.f14861d.mo12813g(profile.mo14054m()).mo17237d(1).mo17242e((C4675h<? super T, ? extends Iterable<? extends U>>) SubjectsRepositoryImpl$fetchSubjects$1.INSTANCE).mo17205a((C4675h<? super T, K>) SubjectsRepositoryImpl$fetchSubjects$2.INSTANCE).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new SubjectsRepositoryImpl$fetchSubjects$3<Object,Object>(this, profile)).mo17216a(new ArrayList(), (C4669b<? super U, ? super T>) SubjectsRepositoryImpl$fetchSubjects$4.INSTANCE).mo17268d(new SubjectsRepositoryImpl$fetchSubjects$5(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(d, "groupRepository.getGroup…tOfSubject)\n            }");
        return d;
    }
}
