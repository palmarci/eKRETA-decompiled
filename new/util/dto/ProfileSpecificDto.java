package hu.ekreta.ellenorzo.util.dto;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/util/dto/ProfileSpecificDto;", "TModel", "", "toModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileSpecificDto.kt */
public interface ProfileSpecificDto<TModel> {
    <TModel extends ProfileSpecificModel> TModel toModel(Profile profile);
}
