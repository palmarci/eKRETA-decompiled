package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.subModels.Children;
import p289hu.ekreta.ellenorzo.rest.eadminapi.ChildrenDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/subModels/Children;", "it", "Lhu/ekreta/ellenorzo/rest/eadminapi/ChildrenDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepositoryImpl$fetchChildrenData$1 */
/* compiled from: ChildrenRepository.kt */
public final class ChildrenRepositoryImpl$fetchChildrenData$1<T, R> implements C4675h<T, R> {
    public static final ChildrenRepositoryImpl$fetchChildrenData$1 INSTANCE = new ChildrenRepositoryImpl$fetchChildrenData$1();

    /* renamed from: a */
    public final Children apply(ChildrenDto childrenDto) {
        Intrinsics.checkParameterIsNotNull(childrenDto, "it");
        Intrinsics.checkParameterIsNotNull(childrenDto, "$this$toChildren");
        return new Children(childrenDto.getFirstName(), childrenDto.getLastName(), childrenDto.getEducationId());
    }
}
