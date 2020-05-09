package p289hu.ekreta.ellenorzo.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassAverageDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SubjectAverageDto;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "group", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$fetchSubjects$3 */
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$fetchSubjects$3<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ SubjectsRepositoryImpl f14866c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14867e;

    public SubjectsRepositoryImpl$fetchSubjects$3(SubjectsRepositoryImpl subjectsRepositoryImpl, Profile profile) {
        this.f14866c = subjectsRepositoryImpl;
        this.f14867e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Subject>> apply(final Group group) {
        Intrinsics.checkParameterIsNotNull(group, "group");
        return C5027n.m16892a((C5030q<? extends T1>) SubjectsRepositoryImpl.access$fetchSubjectAverages(this.f14866c, this.f14867e, group.mo12760i()), (C5030q<? extends T2>) SubjectsRepositoryImpl.access$fetchClassAverages(this.f14866c, this.f14867e, group.mo12760i()), (C4670c<? super T1, ? super T2, ? extends R>) C43431.INSTANCE).mo17246g(new C4675h<T, R>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectsRepositoryImpl$fetchSubjects$3 f14868c;

            {
                this.f14868c = r1;
            }

            /* renamed from: a */
            public final List<Subject> apply(Pair<? extends List<SubjectAverageDto>, ? extends List<ClassAverageDto>> pair) {
                C43442 r0 = this;
                Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                List<SubjectAverageDto> list = (List) pair.component1();
                List<ClassAverageDto> list2 = (List) pair.component2();
                HashMap hashMap = new HashMap();
                for (ClassAverageDto classAverageDto : list2) {
                    hashMap.put(classAverageDto.getSubjectUid(), classAverageDto.getClassAverage());
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (SubjectAverageDto subjectAverageDto : list) {
                    String m = r0.f14868c.f14867e.mo14054m();
                    String subjectName = subjectAverageDto.getSubjectName();
                    String average = subjectAverageDto.getAverage();
                    List sortedListOfAverages = subjectAverageDto.getSortedListOfAverages();
                    int sortIndex = subjectAverageDto.getSortIndex();
                    String str = (String) hashMap.get(subjectAverageDto.getSubjectUid());
                    if (str == null) {
                        str = "";
                    }
                    Subject subject = r6;
                    Subject subject2 = new Subject(m, subjectName, average, sortIndex, group.mo12757g(), str, !list2.isEmpty(), group.mo12762k(), sortedListOfAverages, group.mo12754d());
                    arrayList.add(subject);
                    r0 = this;
                }
                return arrayList;
            }
        }).mo17237d(1);
    }
}
