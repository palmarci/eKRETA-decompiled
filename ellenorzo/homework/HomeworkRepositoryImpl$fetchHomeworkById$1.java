package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/homework/Homework;", "it", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkRepositoryImpl$fetchHomeworkById$1 */
/* compiled from: HomeworkRepositoryImpl.kt */
public final class HomeworkRepositoryImpl$fetchHomeworkById$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f13511c;

    public HomeworkRepositoryImpl$fetchHomeworkById$1(Profile profile) {
        this.f13511c = profile;
    }

    /* renamed from: a */
    public final Homework apply(HomeworkDto homeworkDto) {
        Intrinsics.checkParameterIsNotNull(homeworkDto, "it");
        return C3984v.m10157a(homeworkDto, this.f13511c.mo14054m());
    }
}
