package hu.ekreta.ellenorzo.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import g.a.a.b.a;
import h.i.e.i;
import h.i.e.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.MainActivity;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.Map;
import k.b.n;
import k.b.u;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010#\u001a\u00020\u00152\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0%H\u0016J(\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationStrategyImpl;", "Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "notificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "context", "Landroid/content/Context;", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "firebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "(Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/notification/NotificationRepository;Landroid/content/Context;Landroidx/core/app/NotificationManagerCompat;Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "createLoginNotification", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "createNotification", "pushMessage", "Lhu/ekreta/ellenorzo/notification/PushMessage;", "getNotificationChannel", "", "messageType", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "getPendingIntent", "Landroid/app/PendingIntent;", "getProfileByMessageRecipient", "Lio/reactivex/Single;", "handleIncomingNotification", "messageMap", "", "showNotification", "channelId", "text", "pendingIntent", "notificationId", "", "updateFirebaseToken", "newToken", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl implements NotificationStrategy {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5923g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NotificationStrategyImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f5924a = LazyKt__LazyJVMKt.lazy(NotificationStrategyImpl$logger$2.INSTANCE);
    public final ProfileRepository b;
    public final NotificationRepository c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f5925d;
    public final m e;
    public final FirebaseContainer f;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5926a = new int[NotificationMessageRole.values().length];
        public static final /* synthetic */ int[] b = new int[NotificationMessageType.values().length];

        static {
            f5926a[NotificationMessageRole.ALL.ordinal()] = 1;
            b[NotificationMessageType.OMISSION.ordinal()] = 1;
            b[NotificationMessageType.EVALUATION.ordinal()] = 2;
            b[NotificationMessageType.NOTE.ordinal()] = 3;
            b[NotificationMessageType.MESSAGE.ordinal()] = 4;
            b[NotificationMessageType.HOMEWORK.ordinal()] = 5;
            b[NotificationMessageType.EXAM.ordinal()] = 6;
            b[NotificationMessageType.ALL.ordinal()] = 7;
        }
    }

    public NotificationStrategyImpl(ProfileRepository profileRepository, NotificationRepository notificationRepository, Context context, m mVar, FirebaseContainer firebaseContainer) {
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(notificationRepository, "notificationRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(mVar, "notificationManager");
        Intrinsics.checkParameterIsNotNull(firebaseContainer, "firebaseContainer");
        this.b = profileRepository;
        this.c = notificationRepository;
        this.f5925d = context;
        this.e = mVar;
        this.f = firebaseContainer;
    }

    public static final /* synthetic */ b access$getLogger$p(NotificationStrategyImpl notificationStrategyImpl) {
        Lazy lazy = notificationStrategyImpl.f5924a;
        KProperty kProperty = f5923g[0];
        return (b) lazy.getValue();
    }

    public static final /* synthetic */ String access$getNotificationChannel(NotificationStrategyImpl notificationStrategyImpl, NotificationMessageType notificationMessageType) {
        String str;
        String str2;
        Context context = notificationStrategyImpl.f5925d;
        if (Build.VERSION.SDK_INT < 26) {
            return NotificationChannelId.DEFAULT.a();
        }
        switch (WhenMappings.b[notificationMessageType.ordinal()]) {
            case 1:
                str = NotificationChannelId.OMISSION.a();
                str2 = context.getString(R.string.omission_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.omiss…_notification_channel_id)");
                break;
            case 2:
                str = NotificationChannelId.EVALUTION.a();
                str2 = context.getString(R.string.evaluation_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.evalu…_notification_channel_id)");
                break;
            case 3:
                str = NotificationChannelId.NOTE.a();
                str2 = context.getString(R.string.note_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.note_notification_channel_id)");
                break;
            case 4:
                str = NotificationChannelId.MESSAGE.a();
                str2 = context.getString(R.string.message_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.messa…_notification_channel_id)");
                break;
            case 5:
                str = NotificationChannelId.HOMEWORK.a();
                str2 = context.getString(R.string.homework_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.homew…_notification_channel_id)");
                break;
            case 6:
                str = NotificationChannelId.EXAM.a();
                str2 = context.getString(R.string.exam_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.exam_notification_channel_id)");
                break;
            case 7:
                throw new InvalidParameterException("messageType is not valid. MessageType " + notificationMessageType);
            default:
                throw new NoWhenBranchMatchedException();
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 3);
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            return str;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public void a(Map<String, String> map) {
        n<List<Profile>> nVar;
        Intrinsics.checkParameterIsNotNull(map, "messageMap");
        FirebaseContainer firebaseContainer = this.f;
        Pair[] pairArr = new Pair[2];
        StringBuilder sb = new StringBuilder();
        String str = map.get("InstituteCode");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append("#");
        String str2 = map.get("UserId");
        if (str2 == null) {
            str2 = "0";
        }
        sb.append(str2);
        pairArr[0] = TuplesKt.to(FirebaseContainer.Param.PROFILE, sb.toString());
        String str3 = map.get("NotificationType");
        if (str3 == null) {
            str3 = "null";
        }
        pairArr[1] = TuplesKt.to(FirebaseContainer.Param.PUSH_TYPE, str3);
        firebaseContainer.a(FirebaseContainer.Event.NOTIFICATION_RECEIVE, a.a((Pair<String, ? extends Object>[]) pairArr));
        PushMessage a2 = PushMessage.Companion.a(map);
        if (WhenMappings.f5926a[a2.c().ordinal()] != 1) {
            nVar = this.b.a(a2.a(), a2.e());
        } else {
            nVar = this.b.b(a2.a(), a2.e());
        }
        u<R> e2 = nVar.d().e(NotificationStrategyImpl$getProfileByMessageRecipient$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(e2, "when (pushMessage.notifi…rror().map { it.first() }");
        k.b.f0.b.a(e2, (Function1<? super Throwable, Unit>) new NotificationStrategyImpl$createNotification$2(this, a2), new NotificationStrategyImpl$createNotification$1(this, a2));
    }

    public void a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "newToken");
        n.a(this.b.a().g(NotificationStrategyImpl$updateFirebaseToken$1.INSTANCE), this.c.f(), NotificationStrategyImpl$updateFirebaseToken$2.INSTANCE).d().b(new NotificationStrategyImpl$updateFirebaseToken$3(this, str)).c();
    }

    public final void a(String str, String str2, PendingIntent pendingIntent, int i2) {
        i iVar = new i(this.f5925d, str);
        iVar.O.icon = R.mipmap.ic_launcher;
        iVar.b(this.f5925d.getString(R.string.new_message_arrived));
        iVar.a((CharSequence) str2);
        iVar.f4361l = 0;
        iVar.A = "msg";
        iVar.f = pendingIntent;
        iVar.a(true);
        this.e.a(i2, iVar.a());
    }

    public final void a(Profile profile) {
        String a2 = NotificationChannelId.GENERAL.a();
        String string = this.f5925d.getString(R.string.Settings_Push_Registration_Login_To_Renew, new Object[]{profile.D()});
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …le.userName\n            )");
        a(a2, string, a(profile, NotificationMessageType.ALL), profile.m().hashCode());
    }

    public final PendingIntent a(Profile profile, NotificationMessageType notificationMessageType) {
        Context context = this.f5925d;
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(268468224);
        ExtensionsKt.b(intent, profile.m());
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageTypeObject");
        ExtensionsKt.f6279n.setValue(intent, ExtensionsKt.f6270a[12], notificationMessageType);
        intent.setAction(String.valueOf(System.currentTimeMillis()));
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
        Intrinsics.checkExpressionValueIsNotNull(activity, "PendingIntent.getActivity(this, 0, intent, 0)");
        return activity;
    }
}
