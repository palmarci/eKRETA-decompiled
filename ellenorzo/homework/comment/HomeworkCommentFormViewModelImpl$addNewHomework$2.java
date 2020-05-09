package p289hu.ekreta.ellenorzo.homework.comment;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl$addNewHomework$2 */
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl$addNewHomework$2 extends Lambda implements Function1<NewlyCreatedHomeworkCommentDto, Unit> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkCommentFormViewModelImpl f13562c;

    public HomeworkCommentFormViewModelImpl$addNewHomework$2(HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl) {
        this.f13562c = homeworkCommentFormViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13056a(NewlyCreatedHomeworkCommentDto newlyCreatedHomeworkCommentDto) {
        final Intent intent = new Intent();
        ExtensionsKt.m14648a(intent, Long.valueOf(Long.parseLong(newlyCreatedHomeworkCommentDto.getTeacherHomeWorkUid())));
        this.f13562c.mo16373a((Function1<? super C3737d, Unit>) new Function1<C3737d, Unit>() {
            /* renamed from: a */
            public final void mo13057a(C3737d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                dVar.setResult(-1, intent);
                dVar.finish();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13057a((C3737d) obj);
                return Unit.INSTANCE;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13056a((NewlyCreatedHomeworkCommentDto) obj);
        return Unit.INSTANCE;
    }
}
