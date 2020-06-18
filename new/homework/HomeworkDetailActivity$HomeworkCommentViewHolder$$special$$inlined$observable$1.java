package hu.ekreta.ellenorzo.homework;

import a.b.a.a.a;
import android.util.Base64;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1 extends ObservableProperty<HomeworkComment> {
    public final /* synthetic */ HomeworkDetailActivity.HomeworkCommentViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, HomeworkDetailActivity.HomeworkCommentViewHolder homeworkCommentViewHolder) {
        super(obj2);
        this.c = homeworkCommentViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, HomeworkComment homeworkComment, HomeworkComment homeworkComment2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        HomeworkComment homeworkComment3 = homeworkComment2;
        HomeworkComment homeworkComment4 = homeworkComment;
        if (homeworkComment3 != null) {
            this.c.w.setText(homeworkComment3.e());
            this.c.x.setText(UtilsKt.f(homeworkComment3.c()));
            String f = homeworkComment3.f();
            if (homeworkComment3.b()) {
                f = a.a("<p style=\"color:red\">", f, "</p>");
            } else if (homeworkComment3.a()) {
                f = a.a("<strike>", f, "</strike>");
            }
            Charset charset = Charsets.UTF_8;
            if (f != null) {
                byte[] bytes = f.getBytes(charset);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 1);
                this.c.y.setBackgroundColor(0);
                this.c.y.loadData(encodeToString, "text/html", "base64");
                this.c.y.setWebViewClient(new HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1$lambda$1(this));
                this.c.A.a(homeworkComment3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
