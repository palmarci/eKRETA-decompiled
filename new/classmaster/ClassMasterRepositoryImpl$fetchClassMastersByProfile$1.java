package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "classMasterDtoList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImpl$fetchClassMastersByProfile$1<T, R> implements h<T, R> {
    public final /* synthetic */ ClassMasterRepositoryImpl c;
    public final /* synthetic */ List e;
    public final /* synthetic */ Profile f;

    public ClassMasterRepositoryImpl$fetchClassMastersByProfile$1(ClassMasterRepositoryImpl classMasterRepositoryImpl, List list, Profile profile) {
        this.c = classMasterRepositoryImpl;
        this.e = list;
        this.f = profile;
    }

    /* renamed from: a */
    public final List<ClassMaster> apply(List<ClassMasterDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "classMasterDtoList");
        return this.c.a(list, this.e, this.f.m());
    }
}
