package p289hu.ekreta.ellenorzo.classmaster;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.classmaster.ClassMaster.ClassMasterType;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo17463d2 = {"toClassMaster", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "profileId", "", "group", "Lhu/ekreta/ellenorzo/group/Group;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImplKt */
/* compiled from: ClassMasterRepositoryImpl.kt */
public final class ClassMasterRepositoryImplKt {
    public static final /* synthetic */ ClassMaster access$toClassMaster(ClassMasterDto classMasterDto, String str, Group group) {
        ClassMasterType classMasterType;
        String name = classMasterDto.getName();
        List emailList = classMasterDto.getEmailList();
        List phoneList = classMasterDto.getPhoneList();
        String str2 = null;
        String g = group != null ? group.mo12757g() : null;
        String j = group != null ? group.mo12761j() : null;
        String uid = classMasterDto.getUid();
        if (Intrinsics.areEqual((Object) uid, group != null ? group.mo12753c() : null)) {
            classMasterType = ClassMasterType.ASSISTANT;
        } else {
            if (group != null) {
                str2 = group.mo12756f();
            }
            if (Intrinsics.areEqual((Object) uid, (Object) str2)) {
                classMasterType = ClassMasterType.CLASSMASTER;
            } else {
                classMasterType = ClassMasterType.CLASSMASTER;
            }
        }
        ClassMaster classMaster = new ClassMaster(str, name, emailList, phoneList, g, j, classMasterType);
        return classMaster;
    }
}
