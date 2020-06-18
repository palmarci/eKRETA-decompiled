package hu.ekreta.ellenorzo.newmessage.viewmodel;

import h.l.i;
import h.p.r;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH&J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u0013H&J\u0010\u0010*\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH&J\u0010\u0010+\u001a\u00020%2\u0006\u0010)\u001a\u00020\u0013H&J\b\u0010,\u001a\u00020%H&J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H&J\b\u00100\u001a\u00020%H&R\u001a\u0010\u0003\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00168gX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001f8gX¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "addNevAddresseeIsVisible", "", "getAddNevAddresseeIsVisible", "()Z", "setAddNevAddresseeIsVisible", "(Z)V", "addressees", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "getAddressees", "()Landroidx/lifecycle/MutableLiveData;", "addresseesIsEmpty", "getAddresseesIsEmpty", "setAddresseesIsEmpty", "attachments", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "messageSpanned", "", "getMessageSpanned", "()Ljava/lang/CharSequence;", "setMessageSpanned", "(Ljava/lang/CharSequence;)V", "progressVisible", "getProgressVisible", "setProgressVisible", "subject", "", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "addAttachment", "", "addNewAddressee", "addressee", "onSelect", "attachment", "removeAddressee", "removeAttachment", "sendMessage", "setOriginalMessageSubject", "originalMessage", "Lhu/ekreta/ellenorzo/message/Message;", "startAddAddressee", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewMessageViewModel.kt */
public interface NewMessageViewModel extends UiCommandSource, i {
    CharSequence A1();

    boolean H0();

    void N1();

    r<List<Addressee>> P0();

    void U();

    void a(Attachment attachment);

    void a(Addressee addressee);

    void a(CharSequence charSequence);

    void b(Addressee addressee);

    void c(Attachment attachment);

    void d(Message message);

    boolean d();

    r<List<Attachment>> getAttachments();

    String j();

    void l1();

    void o(String str);

    boolean t1();
}
