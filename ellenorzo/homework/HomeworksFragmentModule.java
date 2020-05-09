package p289hu.ekreta.ellenorzo.homework;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p271p.C3834w;
import p211h.p271p.C3835x.C3837b;
import p289hu.ekreta.ellenorzo.p290di.ActivityModuleKt$createOrReUseViewModel$2;
import p289hu.ekreta.ellenorzo.p290di.FragmentScope;
import p289hu.ekreta.ellenorzo.reminder.ReminderRepository;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragmentModule;", "", "()V", "ProvideViewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "fragment", "Lhu/ekreta/ellenorzo/homework/HomeworksFragment;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModelImpl;", "provideReminderRepositories", "Ljava/util/ArrayList;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "Lkotlin/collections/ArrayList;", "repo1", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragmentModule */
/* compiled from: HomeworksFragmentModule.kt */
public final class HomeworksFragmentModule {
    /* renamed from: a */
    public final ArrayList<ReminderRepository> mo13029a(HomeworkRepository homeworkRepository) {
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repo1");
        return CollectionsKt__CollectionsKt.arrayListOf(homeworkRepository);
    }

    @FragmentScope
    /* renamed from: a */
    public final RemindersViewModel mo13028a(HomeworksFragment homeworksFragment, C5431a<RemindersViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(homeworksFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        C3834w a = C3158a.m7822a((Fragment) homeworksFragment, (C3837b) new ActivityModuleKt$createOrReUseViewModel$2(aVar)).mo10845a(RemindersViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return (RemindersViewModel) a;
    }
}
