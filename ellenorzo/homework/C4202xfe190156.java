package p289hu.ekreta.ellenorzo.homework;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailActivity.HomeworkCommentViewHolder;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4202xfe190156 extends ObservableProperty<HomeworkComment> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkCommentViewHolder f13452c;

    public C4202xfe190156(Object obj, Object obj2, HomeworkCommentViewHolder homeworkCommentViewHolder) {
        this.f13452c = homeworkCommentViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, HomeworkComment homeworkComment, HomeworkComment homeworkComment2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        HomeworkComment homeworkComment3 = homeworkComment2;
        HomeworkComment homeworkComment4 = homeworkComment;
        if (homeworkComment3 != null) {
            this.f13452c.f13445w.setText(homeworkComment3.mo13037e());
            this.f13452c.f13446x.setText(UtilsKt.m14843f(homeworkComment3.mo13035c()));
            String f = homeworkComment3.mo13039f();
            if (homeworkComment3.mo13034b()) {
                f = C0082a.m103a("<p style=\"color:red\">", f, "</p>");
            } else if (homeworkComment3.mo13033a()) {
                f = C0082a.m103a("<strike>", f, "</strike>");
            }
            Charset charset = Charsets.UTF_8;
            if (f != null) {
                byte[] bytes = f.getBytes(charset);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 1);
                this.f13452c.f13447y.setBackgroundColor(0);
                this.f13452c.f13447y.loadData(encodeToString, "text/html", "base64");
                this.f13452c.f13447y.setWebViewClient(new C4203x9f933e22(this));
                this.f13452c.f13441A.mo17017a(homeworkComment3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
