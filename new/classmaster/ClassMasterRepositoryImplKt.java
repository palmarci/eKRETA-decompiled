package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.classmaster.ClassMaster;
import hu.ekreta.ellenorzo.group.Group;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, d2 = {"toClassMaster", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "profileId", "", "group", "Lhu/ekreta/ellenorzo/group/Group;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImplKt {
    public static final /* synthetic */ ClassMaster access$toClassMaster(ClassMasterDto classMasterDto, String str, Group group) {
        ClassMaster.ClassMasterType classMasterType;
        String name = classMasterDto.getName();
        List<String> emailList = classMasterDto.getEmailList();
        List<String> phoneList = classMasterDto.getPhoneList();
        String str2 = null;
        String g2 = group != null ? group.g() : null;
        String j2 = group != null ? group.j() : null;
        String uid = classMasterDto.getUid();
        if (Intrinsics.areEqual((Object) uid, (Object) group != null ? group.c() : null)) {
            classMasterType = ClassMaster.ClassMasterType.ASSISTANT;
        } else {
            if (group != null) {
                str2 = group.f();
            }
            if (Intrinsics.areEqual((Object) uid, (Object) str2)) {
                classMasterType = ClassMaster.ClassMasterType.CLASSMASTER;
            } else {
                classMasterType = ClassMaster.ClassMasterType.CLASSMASTER;
            }
        }
        return new ClassMaster(str, name, emailList, phoneList, g2, j2, classMasterType);
    }
}
