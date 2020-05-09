package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.view.View.OnTouchListener;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.message.Message;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\fH&J\u0010\u0010+\u001a\u00020(2\u0006\u0010*\u001a\u00020\fH&J\b\u0010,\u001a\u00020(H&J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H&R\u001a\u0010\u0003\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00108gX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00168gX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001f8gX¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u00060"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "addressee", "", "getAddressee", "()Ljava/lang/String;", "setAddressee", "(Ljava/lang/String;)V", "attachments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "getAttachments", "()Landroidx/lifecycle/MutableLiveData;", "messageSpanned", "", "getMessageSpanned", "()Ljava/lang/CharSequence;", "setMessageSpanned", "(Ljava/lang/CharSequence;)V", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "pageTitle", "getPageTitle", "setPageTitle", "progressVisible", "", "getProgressVisible", "()Z", "setProgressVisible", "(Z)V", "subject", "getSubject", "setSubject", "addAttachment", "", "onSelect", "attachment", "removeAttachment", "sendMessage", "setOriginalMessageSubject", "originalMessage", "Lhu/ekreta/ellenorzo/message/Message;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel */
/* compiled from: NewMessageViewModel.kt */
public interface NewMessageViewModel extends UiCommandSource, C3705i {
    /* renamed from: A0 */
    String mo13514A0();

    /* renamed from: B1 */
    String mo13515B1();

    /* renamed from: E1 */
    void mo13516E1();

    /* renamed from: U */
    void mo13517U();

    /* renamed from: a */
    void mo13518a(Attachment attachment);

    /* renamed from: a */
    void mo13519a(CharSequence charSequence);

    /* renamed from: c */
    void mo13520c(Attachment attachment);

    /* renamed from: d */
    void mo13521d(Message message);

    /* renamed from: d */
    boolean mo13522d();

    C3824r<List<Attachment>> getAttachments();

    /* renamed from: h1 */
    OnTouchListener mo13524h1();

    /* renamed from: j */
    String mo13525j();

    /* renamed from: j */
    void mo13526j(String str);

    /* renamed from: n */
    void mo13527n(String str);

    /* renamed from: p */
    void mo13528p(String str);

    /* renamed from: s1 */
    CharSequence mo13529s1();
}
