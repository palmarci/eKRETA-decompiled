package p289hu.ekreta.ellenorzo.newmessage.model;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "", "fetchAddresseeList", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "accessToken", "", "sendMessage", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "message", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.model.NewMessageService */
/* compiled from: NewMessageService.kt */
public interface NewMessageService {
    /* renamed from: a */
    C5027n<Boolean> mo13500a(Profile profile, NewMessage newMessage);

    /* renamed from: a */
    C5027n<List<Addressee>> mo13501a(String str);
}
