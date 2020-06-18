package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.cases.subModels.Signer;
import hu.ekreta.ellenorzo.rest.eadminapi.SignerDto;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "it", "Lhu/ekreta/ellenorzo/rest/eadminapi/SignerDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SignerRepository.kt */
public final class SignerRepositoryImpl$fetchSigner$1<T, R> implements h<T, R> {
    public static final SignerRepositoryImpl$fetchSigner$1 INSTANCE = new SignerRepositoryImpl$fetchSigner$1();

    /* renamed from: a */
    public final Signer apply(SignerDto signerDto) {
        Intrinsics.checkParameterIsNotNull(signerDto, "it");
        Intrinsics.checkParameterIsNotNull(signerDto, "$this$toSigner");
        return new Signer(signerDto.getId(), signerDto.isSigner(), signerDto.getEducationId(), signerDto.getName(), signerDto.getTitle());
    }
}
