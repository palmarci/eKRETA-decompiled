package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.group.Group;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassAverageDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.SubjectAverageDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "group", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$fetchSubjects$3<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ SubjectsRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public SubjectsRepositoryImpl$fetchSubjects$3(SubjectsRepositoryImpl subjectsRepositoryImpl, Profile profile) {
        this.c = subjectsRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<Subject>> apply(final Group group) {
        Intrinsics.checkParameterIsNotNull(group, "group");
        return n.a(this.c.b, this.c.b, AnonymousClass1.INSTANCE).g(new h<T, R>(this) {
            public final /* synthetic */ SubjectsRepositoryImpl$fetchSubjects$3 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final List<Subject> apply(Pair<? extends List<SubjectAverageDto>, ? extends List<ClassAverageDto>> pair) {
                AnonymousClass2 r0 = this;
                Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                List<SubjectAverageDto> list = (List) pair.component1();
                List<ClassAverageDto> list2 = (List) pair.component2();
                HashMap hashMap = new HashMap();
                for (ClassAverageDto classAverageDto : list2) {
                    hashMap.put(classAverageDto.getSubjectUid(), classAverageDto.getClassAverage());
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (SubjectAverageDto subjectAverageDto : list) {
                    String m2 = r0.c.e.m();
                    String subjectName = subjectAverageDto.getSubjectName();
                    String average = subjectAverageDto.getAverage();
                    List<Float> sortedListOfAverages = subjectAverageDto.getSortedListOfAverages();
                    int sortIndex = subjectAverageDto.getSortIndex();
                    String str = (String) hashMap.get(subjectAverageDto.getSubjectUid());
                    if (str == null) {
                        str = "";
                    }
                    Subject subject = r6;
                    Subject subject2 = new Subject(m2, subjectName, average, sortIndex, group.g(), str, !list2.isEmpty(), group.k(), sortedListOfAverages, group.d());
                    arrayList.add(subject);
                    r0 = this;
                }
                return arrayList;
            }
        }).d(1);
    }
}
