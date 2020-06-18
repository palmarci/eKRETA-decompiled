package hu.ekreta.ellenorzo.homework;

import h.w.v;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/homework/Homework;", "it", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkRepositoryImpl.kt */
public final class HomeworkRepositoryImpl$fetchHomeworkById$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public HomeworkRepositoryImpl$fetchHomeworkById$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final Homework apply(HomeworkDto homeworkDto) {
        Intrinsics.checkParameterIsNotNull(homeworkDto, "it");
        return v.a(homeworkDto, this.c.m());
    }
}
