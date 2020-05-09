package p289hu.ekreta.ellenorzo.classmaster;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "classMasterDtoList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImpl$fetchClassMastersByProfile$1 */
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImpl$fetchClassMastersByProfile$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ ClassMasterRepositoryImpl f11819c;

    /* renamed from: e */
    public final /* synthetic */ List f11820e;

    /* renamed from: f */
    public final /* synthetic */ Profile f11821f;

    public ClassMasterRepositoryImpl$fetchClassMastersByProfile$1(ClassMasterRepositoryImpl classMasterRepositoryImpl, List list, Profile profile) {
        this.f11819c = classMasterRepositoryImpl;
        this.f11820e = list;
        this.f11821f = profile;
    }

    /* renamed from: a */
    public final List<ClassMaster> apply(List<ClassMasterDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "classMasterDtoList");
        return this.f11819c.mo12260a(list, this.f11820e, this.f11821f.mo14054m());
    }
}
