package p289hu.ekreta.ellenorzo.subject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "listOfSubject", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$fetchSubjects$5 */
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$fetchSubjects$5<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ SubjectsRepositoryImpl f14870c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14871e;

    public SubjectsRepositoryImpl$fetchSubjects$5(SubjectsRepositoryImpl subjectsRepositoryImpl, Profile profile) {
        this.f14870c = subjectsRepositoryImpl;
        this.f14871e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Subject>> apply(List<Subject> list) {
        Intrinsics.checkParameterIsNotNull(list, "listOfSubject");
        return this.f14870c.mo15744a().mo13307a(this.f14871e.mo14054m(), list);
    }
}
