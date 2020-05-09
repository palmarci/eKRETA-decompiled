package p289hu.ekreta.ellenorzo.classmaster;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "activeGroups", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersViewModelImpl$updateLocalData$2 */
/* compiled from: ClassMastersViewModelImpl.kt */
public final class ClassMastersViewModelImpl$updateLocalData$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ ClassMastersViewModelImpl f11871c;

    /* renamed from: e */
    public final /* synthetic */ Profile f11872e;

    public ClassMastersViewModelImpl$updateLocalData$2(ClassMastersViewModelImpl classMastersViewModelImpl, Profile profile) {
        this.f11871c = classMastersViewModelImpl;
        this.f11872e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<ClassMaster>> apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "activeGroups");
        if (!list.isEmpty()) {
            return this.f11871c.f11870t.mo12257a(this.f11872e, list);
        }
        C5027n<List<ClassMaster>> d = C5027n.m16898d(CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkExpressionValueIsNotNull(d, "Observable.just(emptyList())");
        return d;
    }
}
