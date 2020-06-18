package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.d0.a;
import k.b.h0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b2\u0006\u0010\f\u001a\u00020\tRJ\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"hu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl$adapter$1", "", "buffer", "Lio/reactivex/observables/ConnectableObservable;", "", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "profileSubject", "Lio/reactivex/subjects/PublishSubject;", "Lhu/ekreta/ellenorzo/profile/Profile;", "get", "Lio/reactivex/Observable;", "profile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$adapter$1 {

    /* renamed from: a  reason: collision with root package name */
    public final b<Profile> f6151a;
    public final a<List<Subject>> b;
    public final /* synthetic */ SubjectsRepositoryImpl c;

    /* JADX WARNING: type inference failed for: r1v0, types: [hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubjectsRepositoryImpl$adapter$1(hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl r3) {
        /*
            r2 = this;
            r2.c = r3
            r2.<init>()
            k.b.h0.b r3 = new k.b.h0.b
            r3.<init>()
            java.lang.String r0 = "PublishSubject.create<Profile>()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            r2.f6151a = r3
            k.b.h0.b<hu.ekreta.ellenorzo.profile.Profile> r3 = r2.f6151a
            kotlin.reflect.KProperty1 r0 = hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1$buffer$1.INSTANCE
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$sam$io_reactivex_functions_Function$0 r1 = new hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$sam$io_reactivex_functions_Function$0
            r1.<init>(r0)
            r0 = r1
        L_0x001d:
            k.b.b0.h r0 = (k.b.b0.h) r0
            k.b.n r3 = r3.b(r0)
            hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1$buffer$2 r0 = new hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1$buffer$2
            r0.<init>(r2)
            k.b.n r3 = r3.k(r0)
            r0 = 1
            k.b.d0.a r3 = r3.b((int) r0)
            r3.l()
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$adapter$1.<init>(hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl):void");
    }

    public final n<List<Subject>> a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        this.f6151a.a(profile);
        a<List<Subject>> aVar = this.b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "buffer");
        return aVar;
    }
}
