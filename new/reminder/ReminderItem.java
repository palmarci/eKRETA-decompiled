package hu.ekreta.ellenorzo.reminder;

import android.content.res.Resources;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import hu.ekreta.ellenorzo.homework.Homework;
import hu.ekreta.ellenorzo.reminder.Reminder;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "type", "", "subject", "date", "Ljava/util/Calendar;", "icon", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;I)V", "getDate", "()Ljava/util/Calendar;", "getIcon", "()I", "getSubject", "()Ljava/lang/String;", "getType", "viewType", "getViewType", "Companion", "Lhu/ekreta/ellenorzo/reminder/ReminderItemHomework;", "Lhu/ekreta/ellenorzo/reminder/ReminderItemAnnouncedTest;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReminderListItem.kt */
public abstract class ReminderItem extends ReminderListItem {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f6057a = 1;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final Calendar f6058d;
    public final int e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderItem$Companion;", "", "()V", "create", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "model", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "res", "Landroid/content/res/Resources;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ReminderListItem.kt */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f6059a = new int[Reminder.Type.values().length];

            static {
                f6059a[Reminder.Type.HOMEWORK.ordinal()] = 1;
                f6059a[Reminder.Type.ANNOUNCED_TEST.ordinal()] = 2;
            }
        }

        public Companion() {
        }

        public final ReminderItem a(Reminder reminder, Resources resources) {
            Intrinsics.checkParameterIsNotNull(reminder, "model");
            Intrinsics.checkParameterIsNotNull(resources, "res");
            int i2 = WhenMappings.f6059a[reminder.f().ordinal()];
            if (i2 == 1) {
                return new ReminderItemHomework((Homework) reminder, resources);
            }
            if (i2 == 2) {
                return new ReminderItemAnnouncedTest((AnnouncedTest) reminder);
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ ReminderItem(String str, String str2, Calendar calendar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super((DefaultConstructorMarker) null);
        this.b = str;
        this.c = str2;
        this.f6058d = calendar;
        this.e = i2;
    }

    public int a() {
        return this.f6057a;
    }

    public final Calendar b() {
        return this.f6058d;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }
}
