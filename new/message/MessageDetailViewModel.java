package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0015\u001a\u00020\u0016H&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "addresseeNames", "", "getAddresseeNames", "()Ljava/lang/String;", "date", "getDate", "message", "Lhu/ekreta/ellenorzo/message/Message;", "getMessage", "()Lhu/ekreta/ellenorzo/message/Message;", "setMessage", "(Lhu/ekreta/ellenorzo/message/Message;)V", "messageSenderNameAndType", "getMessageSenderNameAndType", "messageSubject", "getMessageSubject", "messageText", "getMessageText", "replayMessage", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageDetailViewModel.kt */
public interface MessageDetailViewModel extends DataBindingListViewModel<Attachment> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: MessageDetailViewModel.kt */
    public static final class DefaultImpls {
    }

    String X();

    void a0();

    void c(Message message);

    String h();

    String p0();

    String q0();

    String t0();
}
