package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "kotlin.jvm.PlatformType", "invoke", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$refreshList$1$4"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$4 extends Lambda implements Function1<List<? extends HomeworkComment>, Unit> {
    public final /* synthetic */ HomeworkDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$4(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        super(1);
        this.c = homeworkDetailViewModelImpl;
    }

    public final void a(List<HomeworkComment> list) {
        this.c.getHomeworkComments().setValue(list);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return Unit.INSTANCE;
    }
}
