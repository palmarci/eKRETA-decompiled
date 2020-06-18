package hu.ekreta.ellenorzo.homework;

import androidx.fragment.app.Fragment;
import h.p.w;
import h.p.x;
import hu.ekreta.ellenorzo.di.ActivityModuleKt$createOrReUseViewModel$2;
import hu.ekreta.ellenorzo.di.FragmentScope;
import hu.ekreta.ellenorzo.reminder.ReminderRepository;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragmentModule;", "", "()V", "ProvideViewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "fragment", "Lhu/ekreta/ellenorzo/homework/HomeworksFragment;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModelImpl;", "provideReminderRepositories", "Ljava/util/ArrayList;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "Lkotlin/collections/ArrayList;", "repo1", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworksFragmentModule.kt */
public final class HomeworksFragmentModule {
    public final ArrayList<ReminderRepository> a(HomeworkRepository homeworkRepository) {
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repo1");
        return CollectionsKt__CollectionsKt.arrayListOf(homeworkRepository);
    }

    @FragmentScope
    public final RemindersViewModel a(HomeworksFragment homeworksFragment, a<RemindersViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(homeworksFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        w a2 = g.a.a.b.a.a((Fragment) homeworksFragment, (x.b) new ActivityModuleKt$createOrReUseViewModel$2(aVar)).a(RemindersViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return (RemindersViewModel) a2;
    }
}
