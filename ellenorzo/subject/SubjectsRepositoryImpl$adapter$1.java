package p289hu.ekreta.ellenorzo.subject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.p333d0.C4992a;
import p300k.p313b.p337h0.C5018b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000-\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b2\u0006\u0010\f\u001a\u00020\tRJ\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo17463d2 = {"hu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl$adapter$1", "", "buffer", "Lio/reactivex/observables/ConnectableObservable;", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "profileSubject", "Lio/reactivex/subjects/PublishSubject;", "Lhu/ekreta/ellenorzo/profile/Profile;", "get", "Lio/reactivex/Observable;", "profile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1 */
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$adapter$1 {

    /* renamed from: a */
    public final C5018b<Profile> f14862a;

    /* renamed from: b */
    public final C4992a<List<Subject>> f14863b;

    /* renamed from: c */
    public final /* synthetic */ SubjectsRepositoryImpl f14864c;

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r1v0, types: [hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubjectsRepositoryImpl$adapter$1(p289hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl r3) {
        /*
            r2 = this;
            r2.f14864c = r3
            r2.<init>()
            k.b.h0.b r3 = new k.b.h0.b
            r3.<init>()
            java.lang.String r0 = "PublishSubject.create<Profile>()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            r2.f14862a = r3
            k.b.h0.b<hu.ekreta.ellenorzo.profile.Profile> r3 = r2.f14862a
            kotlin.reflect.KProperty1 r0 = p289hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1$buffer$1.INSTANCE
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$sam$io_reactivex_functions_Function$0 r1 = new hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$sam$io_reactivex_functions_Function$0
            r1.<init>(r0)
            r0 = r1
        L_0x001d:
            k.b.b0.h r0 = (p300k.p313b.p315b0.C4675h) r0
            k.b.n r3 = r3.mo17225b(r0)
            hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1$buffer$2 r0 = new hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1$buffer$2
            r0.<init>(r2)
            k.b.n r3 = r3.mo17252k(r0)
            r0 = 1
            k.b.d0.a r3 = r3.mo17219b(r0)
            r3.mo17160l()
            r2.f14863b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1.<init>(hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl):void");
    }

    /* renamed from: a */
    public final C5027n<List<Subject>> mo15745a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        this.f14862a.mo17017a(profile);
        C4992a<List<Subject>> aVar = this.f14863b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "buffer");
        return aVar;
    }
}
