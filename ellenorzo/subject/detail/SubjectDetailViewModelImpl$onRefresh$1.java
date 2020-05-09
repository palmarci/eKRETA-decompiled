package p289hu.ekreta.ellenorzo.subject.detail;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.subject.Subject;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl$onRefresh$1 */
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl$onRefresh$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ SubjectDetailViewModelImpl f15057c;

    public SubjectDetailViewModelImpl$onRefresh$1(SubjectDetailViewModelImpl subjectDetailViewModelImpl) {
        this.f15057c = subjectDetailViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<List<Subject>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.f15057c;
        return subjectDetailViewModelImpl.mo11505a(subjectDetailViewModelImpl.f15039v.mo15743r(profile));
    }
}
